package realspace;

import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.PixelGrabber;

public final class Bitmap 
{
	public Bitmap(Image image, AppletImplements applet)
	{
		myDimension = new int[2];
		myDimension[0] = image.getWidth(applet);
		myDimension[1] = image.getHeight(applet);
		myData = new int[myDimension[0] * myDimension[1]];

		PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, myDimension[0], myDimension[1], myData, 0, myDimension[0]);

		try
		{
			pixelgrabber.grabPixels();
		}
		catch (InterruptedException e)
		{
			System.out.println("grabPixels to get image pixels failed");
		}

		pixelgrabber = null;
	}

	final void ReadAtlas(int i, int j, int k, int l, Bitmap atlas, int i1, int j1)
	{
		for (int k2 = 0; k2 < j; k2++)
		{
			int k1 = k + (l + k2) * myDimension[0];
			int l1 = i1 + (j1 + k2) * atlas.myDimension[0];

			for (int l2 = 0; l2 < i; l2++)
			{
				int i2 = atlas.myData[l1];
				int color = (((i2 & 0xff0000) >> 16) + ((i2 & 0xff00) >> 8) + (i2 & 0xff)) / 3;

				if (color > 0 && (color += 32) >= 248)
					color = 255;

				myData[k1] = (myData[k1] & 0xffffff) + (color << 24);
				k1++;
				l1++;
			}
		}
	}

	final Rectangle GetRectFromAtlas(final int index_x, final int offset_y, final int height)
	{
		final int transparent_color = myData[0];
		int j2 = 0x186a0;
		int k2 = 0;
		int l2 = 0x186a0;
		int i3 = 0;

		boolean flag1 = false;

		for (int px = 0; px < myDimension[0] && !flag1; px++)
		{
			int ox = px + index_x;
			int oy = offset_y * myDimension[0] + ox;
			boolean visible = false;

			for (int py = 0; py < height;) 
			{
				final int j1 = py + offset_y;
				final int lefttop_colour = myData[oy];

				final int lefttop_alpha = lefttop_colour & 0xff000000;
				if (myData[oy] != transparent_color && lefttop_alpha != 0)
				{
					visible = true;

					if (ox > k2)
						k2 = ox;

					if (ox < j2)
						j2 = ox;

					if (j1 > i3)
						i3 = j1;

					if (j1 < l2)
						l2 = j1;
				}

				// Pick the next left-top pixel
				py++;
				oy += myDimension[0];
			}

			// don't get excessed the image's size
			if (!visible && j2 != 0x186a0)
			{
				flag1 = true;
			}
		}

		return new Rectangle(j2, l2, (k2 - j2) + 1, (i3 - l2) + 1);
	}

	final void MakeOpaque(int i, int j, int k, int l, int i1, int j1)
	{
		final int transparent_color = myData[0];

		for (int i3 = 0; i3 < myDimension[1]; i3++)
		{
			int py = i3 * myDimension[0];

			for (int px = 0; px < myDimension[0];)
			{
				final int pixel = myData[py];
				final int grn = (pixel & 0xff0000) >> 16;
				final int blu = (pixel & 0xff00) >> 8;
				final int red = pixel & 0xff;

				if (grn >= i && grn <= j && blu >= k && blu <= l && red >= i1 && red <= j1)
				{
					myData[py] = transparent_color;
				}
				
				px++;
				py++;
			}
		}
	}

	int myData[];
	// w, h
	int myDimension[];
}
