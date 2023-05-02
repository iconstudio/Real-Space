package realspace;

final class Font
{
	public Font(int i, int j)
	{
		myScaledWidth = j;
		myHeight = i;

		fragSprites = new Sprite[D];
		Z = new int[D];

		for (int l = 0; l < D; l++)
		{
			fragSprites[l] = null;
			Z[l] = -1;
		}
	}

	final int I(char ac[], int i, int j)
	{
		int k = 0;
		for (int l = 0; l < j;)
		{
			char c = ac[i];

			if (c > 0 && c < D)
			{
				Sprite sprite1 = fragSprites[c];

				if (sprite1 != null)
					k += sprite1.GetWidth() + myScaledWidth;
				else if (c == ' ')
					k += myScaledWidth * 2;
				else
					k += myScaledWidth;
			}
			else
			{
				k += myScaledWidth;
			}

			l++;
			i++;
		}

		return k;
	}

	final int I(String s)
	{
		int i = 0;
		int j = s.length();
		for (int k = 0; k < j; k++)
		{
			char c = s.charAt(k);

			if (c > 0 && c < D)
			{
				Sprite sprite1 = fragSprites[c];

				if (sprite1 != null)
					i += sprite1.GetWidth() + myScaledWidth;
				else if (c == ' ')
					i += myScaledWidth * 2;
				else
					i += myScaledWidth;
			}
			else
			{
				i += myScaledWidth;
			}
		}

		return i;
	}

	Sprite fragSprites[];
	int Z[];
	int myHeight;
	int myScaledWidth;
	static int D = 128;
}
