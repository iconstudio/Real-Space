package realspace;

import java.util.Arrays;

final class Palette 
{
	public Palette(final int colors_count) 
	{
		myData = new int[colors_count];
		myCapacity = colors_count;
		mySize = 0;
		isDual = false;
		isLinear = false;
	}

	final void MergeColors(final int color1, final int color2, final int colors_max, final boolean is_dual, final boolean is_linear)
	{
		for (int l = 0; l < colors_max; l++) 
		{
			int factor = (int) (((float) l / (float) colors_max) * 255F);
			int inv_factor = 255 - factor;

			int l1 = (color1 >> 16 & 0xff) * inv_factor;
			int j2 = (color1 >> 8 & 0xff) * inv_factor;
			int l2 = (color1 & 0xff) * inv_factor;

			int k1 = (color2 >> 16 & 0xff) * factor;
			int i2 = (color2 >> 8 & 0xff) * factor;
			int k2 = (color2 & 0xff) * factor;

			final int picked_color = 0xff000000 + ((k1 + l1 >> 8) << 16) + ((i2 + j2 >> 8) << 8) + (k2 + l2 >> 8);

			if (mySize < myCapacity) 
			{
				myData[mySize] = picked_color;
				mySize++;
			}
		}

		isDual = is_dual;
		isLinear = is_linear;
	}

	final int Pick(final int x, final int y) 
	{
		if (isLinear) 
		{
			if (0 <= x) 
			{
				return myData[x % mySize];
			}
		} 
		else if (isDual) 
		{
			if (0 <= x && x < mySize * 2) // move right
			{
				return myData[x >> 1];
			} 
			else if (x >= y - mySize * 2 && x < y) // move down
			{
				return myData[y - x - 1 >> 1];
			}
		} 
		else if (0 <= x && x < y)
		{
			return myData[(x * mySize) / y];
		}

		return myData[mySize - 1];
	}

	final int Pick(final int index)
	{
		if (0 <= index && index < mySize)
		{
			return myData[index];
		}
		else
		{
			return myData[mySize - 1];
		}
	}

	public void AddColor(final int color)
	{
		myCapacity = Math.max(myCapacity, mySize + 1);

		int buffer[] = Arrays.copyOf(myData, myCapacity);
		buffer[mySize++] = color;

		myData = buffer;
	}

	public int GetSize()
	{
		return mySize;
	}

	public int GetCapacity()
	{
		return myCapacity;
	}

	private int myData[];
	private int mySize;
	private int myCapacity;
	private boolean isDual;
	private boolean isLinear;
}
