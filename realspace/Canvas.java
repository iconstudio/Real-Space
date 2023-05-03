package realspace;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageProducer;

final class Canvas implements ImageProducer
{
	public Canvas(final GameApp applet, final int width, final int height)
	{
		gameApplet = applet;

		HNSM = 0;
		S = 0;

		hSize = width;
		vSize = height;
		canvasBuffer = new int[width * height];
		myDimensionSize = width * height;

		gameColorManagement = new DirectColorModel(32, 0xff0000, 65280, 255);
		gameFrameBuffer = toolkit.createImage(this);
		I();

		getDefaultToolkit = new float[createImage];
		for (int k = 0; k < createImage; k++)
		{
			getDefaultToolkit[k] = (float) Math.random();
		}

		imageComplete = 0;
	}

	@Override
	public final void addConsumer(final ImageConsumer imageconsumer)
	{
		if (lastConsumer != imageconsumer)
		{
			lastConsumer = imageconsumer;
			
			lastConsumer.setDimensions(hSize, vSize);
			lastConsumer.setColorModel(gameColorManagement);
			lastConsumer.setHints(2);
			lastConsumer.setPixels(0, 0, hSize, vSize, gameColorManagement, canvasBuffer, 0, hSize);
		}
	}

	@Override
	public final boolean isConsumer(final ImageConsumer imageconsumer)
	{
		return imageconsumer == lastConsumer;
	}

	@Override
	public final void removeConsumer(final ImageConsumer imageconsumer)
	{
	}

	@Override
	public final void startProduction(final ImageConsumer imageconsumer)
	{
		addConsumer(imageconsumer);
	}

	@Override
	public final void requestTopDownLeftRightResend(final ImageConsumer imageconsumer)
	{
		System.out.println("TDLR");
	}

	final void I()
	{
		if (lastConsumer != null)
		{
			lastConsumer.setPixels(0, 0, hSize, vSize, gameColorManagement, canvasBuffer, 0, hSize);
			lastConsumer.imageComplete(2);
		}
	}

	final void I(int i, int j, int k, int l, final int color) {
		if (i < hSize && i + k >= 0 && j < vSize && j + l >= 0) {
			if (i < 0) {
				k += i;
				i = 0;
			}

			if (i + k >= hSize) {
				k -= (i + k) - hSize;
			}
			if (j < 0) {
				l += j;
				j = 0;
			}

			if (j + l >= vSize) {
				l -= (j + l) - vSize;
			}

			int i2 = j * hSize + i;
			for (int j1 = 0; j1 < l; j1++) {
				int l1 = i2;

				for (int k1 = 0; k1 < k;) {
					canvasBuffer[l1] = color;
					k1++;
					l1++;
				}

				i2 += hSize;
			}
		}
	}

	final void I(final int i, final int j, final int k, final int l, final int i1, final int j1) {
		I(i, j, k, j1, i1);
		I(i, (j + l) - j1, k, j1, i1);
		final int k1 = j + j1;
		final int l1 = l - j1 - j1;
		I(i, k1, j1, l1, i1);
		I((i + k) - j1, k1, j1, l1, i1);
	}

	final void Draw(final Sprite sprite, final int i, final int j, final GameApp applet)
	{
		if (sprite.H && gameApplet.QC != 3) {
			HNSM(sprite, i, j, applet);
			return;
		}
		
		if (i < hSize && i + sprite.GetWidth() >= 0 && j < vSize && j + sprite.B >= 0) {
			final int i3 = sprite.Z;
			if (i >= 0 && i + sprite.GetWidth() < hSize && j >= 0 && j + sprite.B < vSize) {
				int i1 = j * hSize + i;
				for (int k = 0; k < i3; k++) {
					final rlepart rlepart1 = sprite.I[k];
					i1 += rlepart1.D;
					System.arraycopy(rlepart1.B, 0, canvasBuffer, i1, rlepart1.C);
				}

				return;
			}
			for (int l = 0; l < i3; l++) {
				final rlepart rlepart2 = sprite.I[l];
				final int k2 = j + rlepart2.Z;
				if (k2 >= 0 && k2 < vSize) {
					final int i2 = i + rlepart2.I;
					final int j2 = i2 + rlepart2.C;
					if (i2 < hSize && j2 >= 0)
						if (i2 >= 0 && j2 < vSize) {
							final int j1 = k2 * hSize + i2;
							System.arraycopy(rlepart2.B, 0, canvasBuffer, j1, rlepart2.C);
						} else {
							int l2 = rlepart2.C;
							int k1 = k2 * hSize + i2;
							int l1 = 0;
							if (i2 < 0) {
								k1 -= i2;
								l1 -= i2;
								l2 += i2;
							}
							if (j2 >= hSize)
								l2 -= (j2 - hSize) + 1;
							if (l2 > 0)
								System.arraycopy(rlepart2.B, l1, canvasBuffer, k1, l2);
						}
				}
			}

		}
	}

	final void DrawSprite(final Sprite spr, final int i, final int j, final int k, final GameApp applet) {
		if (j < hSize && j + spr.GetWidth() >= 0 && k < vSize && k + spr.B >= 0) {
			final int l3 = spr.Z;
			if (j >= 0 && j + spr.GetWidth() < hSize && k >= 0 && k + spr.B < vSize) {
				int k1 = k * hSize + j;
				for (int l = 0; l < l3; l++) {
					final rlepart rlepart1 = spr.I[l];
					k1 += rlepart1.D;
					int i2 = k1;
					final short word0 = rlepart1.C;
					final int ai[] = rlepart1.B;
					for (int j1 = 0; j1 < word0;) {
						canvasBuffer[i2] = ai[j1] & i;
						j1++;
						i2++;
					}

				}

				return;
			}

			for (int i1 = 0; i1 < l3; i1++) 
			{
				final rlepart rlepart2 = spr.I[i1];
				final int i3 = k + rlepart2.Z;
				if (i3 >= 0 && i3 < vSize) {
					final int k2 = j + rlepart2.I;
					final int l2 = k2 + rlepart2.C;
					if (k2 < hSize && l2 >= 0) {
						int j3 = rlepart2.C;
						int l1 = i3 * hSize + k2;
						int j2 = 0;
						if (k2 < 0) {
							l1 -= k2;
							j2 -= k2;
							j3 += k2;
						}
						if (l2 >= hSize)
							j3 -= (l2 - hSize) + 1;
						final int ai1[] = rlepart2.B;
						for (final int k3 = j2 + j3; j2 < k3; j2++) {
							canvasBuffer[l1] = ai1[j2] & i;
							l1++;
						}

					}
				}
			}

		}
	}

	final void DrawSprite(final Sprite spr, float f, final int i, final int j, final GameApp applet) 
	{
		if (f >= 0.9999F) 
		{
			Draw(spr, i, j, applet);
			return;
		}

		if (i < hSize && i + spr.GetWidth() >= 0 && j < vSize && j + spr.B >= 0) 
		{
			final int l7 = spr.Z;
			if (f < 0.0F)
				f = 0.0F;
			else if (f > 1.0F)
				f = 1.0F;

			final int k4 = (int) (f * 255F);
			if (i >= 0 && i + spr.GetWidth() < hSize && j >= 0 && j + spr.B < vSize) {
				int j1 = j * hSize + i;
				for (int k = 0; k < l7; k++) {
					final rlepart rlepart1 = spr.I[k];
					j1 += rlepart1.D;
					int l1 = j1;
					final short word0 = rlepart1.C;
					final int ai[] = rlepart1.B;
					for (int i1 = 0; i1 < word0;) {
						final int i4 = ai[i1];
						final int k3 = canvasBuffer[l1];
						final int j5 = i4 >> 16 & 0xff;
						final int l4 = k3 >> 16 & 0xff;
						final int j6 = i4 >> 8 & 0xff;
						final int l5 = k3 >> 8 & 0xff;
						final int j7 = i4 & 0xff;
						final int l6 = k3 & 0xff;
						canvasBuffer[l1] = (k4 * (j5 - l4) >> 8) + l4 << 16 | (k4 * (j6 - l5) >> 8) + l5 << 8
								| (k4 * (j7 - l6) >> 8) + l6;
						i1++;
						l1++;
					}

				}

				return;
			}
			for (int l = 0; l < l7; l++) {
				final rlepart rlepart2 = spr.I[l];
				final int l2 = j + rlepart2.Z;
				if (l2 >= 0 && l2 < vSize) {
					final int j2 = i + rlepart2.I;
					final int k2 = j2 + rlepart2.C;
					if (j2 < hSize && k2 >= 0) {
						int i3 = rlepart2.C;
						int k1 = l2 * hSize + j2;
						int i2 = 0;
						if (j2 < 0) {
							k1 -= j2;
							i2 -= j2;
							i3 += j2;
						}
						if (k2 >= hSize)
							i3 -= (k2 - hSize) + 1;
						final int ai1[] = rlepart2.B;
						for (final int j3 = i2 + i3; i2 < j3; i2++) {
							final int j4 = ai1[i2];
							final int l3 = canvasBuffer[k1];
							final int k5 = j4 >> 16 & 0xff;
							final int i5 = l3 >> 16 & 0xff;
							final int k6 = j4 >> 8 & 0xff;
							final int i6 = l3 >> 8 & 0xff;
							final int k7 = j4 & 0xff;
							final int i7 = l3 & 0xff;
							canvasBuffer[k1] = (k4 * (k5 - i5) >> 8) + i5 << 16 | (k4 * (k6 - i6) >> 8) + i6 << 8
									| (k4 * (k7 - i7) >> 8) + i7;
							k1++;
						}

					}
				}
			}

		}
	}

	final void HNSM(final Sprite sprite1, final int i, final int j, final GameApp applet) {
		if (i < hSize && i + sprite1.GetWidth() >= 0 && j < vSize && j + sprite1.B >= 0) {
			final int i8 = sprite1.Z;
			if (i >= 0 && i + sprite1.GetWidth() < hSize && j >= 0 && j + sprite1.B < vSize) {
				int j1 = j * hSize + i;
				for (int k = 0; k < i8; k++) {
					final rlepart rlepart1 = sprite1.I[k];
					j1 += rlepart1.D;
					int l1 = j1;
					final short word0 = rlepart1.C;
					final int ai[] = rlepart1.B;
					for (int i1 = 0; i1 < word0;) {
						final int i4 = ai[i1];
						int k4 = i4 & 0xff000000;
						if (k4 == 0xff000000) {
							canvasBuffer[l1] = i4;
						} else {
							k4 >>>= 24;
							final int k3 = canvasBuffer[l1];
							final int k5 = i4 >> 16 & 0xff;
							final int i5 = k3 >> 16 & 0xff;
							final int k6 = i4 >> 8 & 0xff;
							final int i6 = k3 >> 8 & 0xff;
							final int k7 = i4 & 0xff;
							final int i7 = k3 & 0xff;
							canvasBuffer[l1] = (k4 * (k5 - i5) >> 8) + i5 << 16 | (k4 * (k6 - i6) >> 8) + i6 << 8
									| (k4 * (k7 - i7) >> 8) + i7;
						}
						i1++;
						l1++;
					}

				}

				return;
			}
			for (int l = 0; l < i8; l++) {
				final rlepart rlepart2 = sprite1.I[l];
				final int l2 = j + rlepart2.Z;
				if (l2 >= 0 && l2 < vSize) {
					final int j2 = i + rlepart2.I;
					final int k2 = j2 + rlepart2.C;
					if (j2 < hSize && k2 >= 0) {
						int i3 = rlepart2.C;
						int k1 = l2 * hSize + j2;
						int i2 = 0;
						if (j2 < 0) {
							k1 -= j2;
							i2 -= j2;
							i3 += j2;
						}
						if (k2 >= hSize)
							i3 -= (k2 - hSize) + 1;
						final int ai1[] = rlepart2.B;
						for (final int j3 = i2 + i3; i2 < j3; i2++) {
							final int j4 = ai1[i2];
							int l4 = j4 & 0xff000000;
							if (l4 == 0xff000000) {
								canvasBuffer[k1] = j4;
							} else {
								l4 >>>= 24;
								final int l3 = canvasBuffer[k1];
								final int l5 = j4 >> 16 & 0xff;
								final int j5 = l3 >> 16 & 0xff;
								final int l6 = j4 >> 8 & 0xff;
								final int j6 = l3 >> 8 & 0xff;
								final int l7 = j4 & 0xff;
								final int j7 = l3 & 0xff;
								canvasBuffer[k1] = (l4 * (l5 - j5) >> 8) + j5 << 16 | (l4 * (l6 - j6) >> 8) + j6 << 8
										| (l4 * (l7 - j7) >> 8) + j7;
							}
							k1++;
						}

					}
				}
			}

		}
	}

	final void DrawLabel(final String caption, final int color, final Font font, int j, final int k) {
		if (font == null)
			return;
		final int l = caption.length();
		for (int i1 = 0; i1 < l; i1++) {
			final char char_current = caption.charAt(i1);
			final Sprite curr = char_current <= 0 || char_current >= Font.D ? null : font.fragSprites[char_current];
			if (curr != null) {
				if (color != 0xffffff)
					DrawSprite(curr, color, j,
							(k - curr.B) + (char_current <= 0 || char_current >= Font.D ? 0 : font.Z[char_current]),
							gameApplet);
				else
					Draw(curr, j, (k - curr.B) + (char_current <= 0 || char_current >= Font.D ? 0 : font.Z[char_current]),
							gameApplet);
				j += curr.GetWidth() + font.myScaledWidth;
			} else if (char_current == ' ')
				j += font.myScaledWidth * 2;
			else
				j += font.myScaledWidth;
		}

	}

	final void Z(final int i, final int j, final int k, final int l, final int i1) {
		if (k <= 0 || l <= 0)
			return;
		if (i + k < HNSM)
			return;
		if (i - k >= hSize)
			return;
		if (j + l < S)
			return;
		if (j - l >= vSize)
			return;
		final int k1 = l * l;
		final int j1 = k * k;
		int i2 = 0;
		int l1 = k * k * l;
		int j2 = 0;
		int k2 = l;
		int l2 = 0;
		while (k2 > 0 || j2 < k) {
			int i3 = i - j2;
			int k3 = i + j2;
			final int i4 = j - k2;
			final int k4 = j + k2;
			if (i3 < HNSM)
				i3 = HNSM;
			if (k3 >= hSize)
				k3 = hSize - 1;
			if (i4 >= S && i4 < vSize) {
				int l4 = i4 * hSize + i3;
				for (final int k5 = l4 + (k3 - i3); l4 < k5; l4++)
					canvasBuffer[l4] = i1;

			}
			if (k4 >= S && k4 < vSize) {
				int i5 = k4 * hSize + i3;
				for (final int l5 = i5 + (k3 - i3); i5 < l5; i5++)
					canvasBuffer[i5] = i1;

			}
			if (l2 < 0) {
				l2 += l1;
				l1 -= j1;
				k2--;
			}
			if (l2 >= 0) {
				i2 += k1;
				l2 -= i2;
				j2++;
			}
		}
		int j3 = i - j2;
		if (j3 < HNSM)
			j3 = HNSM;
		int l3 = i + j2;
		if (l3 > hSize)
			l3 = hSize;
		final int j4 = j - k2;
		if (j4 >= S && j4 < vSize) {
			int j5 = j4 * hSize + j3;
			for (final int i6 = j5 + (l3 - j3); j5 < i6; j5++)
				canvasBuffer[j5] = i1;

		}
	}

	int HNSM;
	int S;
	int hSize;
	int vSize;
	int myDimensionSize;
	int canvasBuffer[];
	GameApp gameApplet;
	ColorModel gameColorManagement;
	ImageConsumer lastConsumer;
	Image gameFrameBuffer;
	static int createImage = 1000;
	float getDefaultToolkit[];
	int imageComplete;

	public final Toolkit toolkit = Toolkit.getDefaultToolkit();
}
