package realspace;
// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.

// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   star_y

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageProducer;

final class surface implements ImageProducer {

	@Override
	public final void addConsumer(ImageConsumer imageconsumer) {
		if (charAt != imageconsumer) {
			charAt = imageconsumer;
			charAt.setDimensions(I, Z);
			charAt.setColorModel(arraycopy);
			charAt.setHints(2);
			charAt.setPixels(0, 0, I, Z, arraycopy, B, 0, I);
		}
	}

	@Override
	public final boolean isConsumer(ImageConsumer imageconsumer) {
		return imageconsumer == charAt;
	}

	@Override
	public final void removeConsumer(ImageConsumer imageconsumer) {
	}

	@Override
	public final void startProduction(ImageConsumer imageconsumer) {
		addConsumer(imageconsumer);
	}

	@Override
	public final void requestTopDownLeftRightResend(ImageConsumer imageconsumer) {
		System.out.println("TDLR");
	}

	surface(gameapp gameapp1, int i, int j) {
		addConsumer = gameapp1;
		HNSM = 0;
		S = 0;
		I = i;
		Z = j;
		C = i * j;
		B = new int[i * j];
		arraycopy = new DirectColorModel(32, 0xff0000, 65280, 255);
		D = length.createImage(this);
		I();
		getDefaultToolkit = new float[createImage];
		for (int k = 0; k < createImage; k++)
			getDefaultToolkit[k] = (float) Math.random();

		imageComplete = 0;
	}

	final void I() {
		if (charAt != null) {
			charAt.setPixels(0, 0, I, Z, arraycopy, B, 0, I);
			charAt.imageComplete(2);
		}
	}

	final void I(int i, int j, int k, int l, int i1) {
		if (i < I && i + k >= 0 && j < Z && j + l >= 0) {
			if (i < 0) {
				k += i;
				i = 0;
			}
			if (i + k >= I)
				k -= (i + k) - I;
			if (j < 0) {
				l += j;
				j = 0;
			}
			if (j + l >= Z)
				l -= (j + l) - Z;
			int i2 = j * I + i;
			for (int j1 = 0; j1 < l; j1++) {
				int l1 = i2;
				for (int k1 = 0; k1 < k;) {
					B[l1] = i1;
					k1++;
					l1++;
				}

				i2 += I;
			}

		}
	}

	final void I(int i, int j, int k, int l, int i1, int j1) {
		I(i, j, k, j1, i1);
		I(i, (j + l) - j1, k, j1, i1);
		int k1 = j + j1;
		int l1 = l - j1 - j1;
		I(i, k1, j1, l1, i1);
		I((i + k) - j1, k1, j1, l1, i1);
	}

	final void I(sprite sprite1, int i, int j, gameapp gameapp1) {
		if (sprite1.H && addConsumer.QC != 3) {
			HNSM(sprite1, i, j, gameapp1);
			return;
		}
		if (i < I && i + sprite1.C >= 0 && j < Z && j + sprite1.B >= 0) {
			int i3 = sprite1.Z;
			if (i >= 0 && i + sprite1.C < I && j >= 0 && j + sprite1.B < Z) {
				int i1 = j * I + i;
				for (int k = 0; k < i3; k++) {
					rlepart rlepart1 = sprite1.I[k];
					i1 += rlepart1.D;
					System.arraycopy(rlepart1.B, 0, B, i1, rlepart1.C);
				}

				return;
			}
			for (int l = 0; l < i3; l++) {
				rlepart rlepart2 = sprite1.I[l];
				int k2 = j + rlepart2.Z;
				if (k2 >= 0 && k2 < Z) {
					int i2 = i + rlepart2.I;
					int j2 = i2 + rlepart2.C;
					if (i2 < I && j2 >= 0)
						if (i2 >= 0 && j2 < Z) {
							int j1 = k2 * I + i2;
							System.arraycopy(rlepart2.B, 0, B, j1, rlepart2.C);
						} else {
							int l2 = rlepart2.C;
							int k1 = k2 * I + i2;
							int l1 = 0;
							if (i2 < 0) {
								k1 -= i2;
								l1 -= i2;
								l2 += i2;
							}
							if (j2 >= I)
								l2 -= (j2 - I) + 1;
							if (l2 > 0)
								System.arraycopy(rlepart2.B, l1, B, k1, l2);
						}
				}
			}

		}
	}

	final void I(sprite sprite1, int i, int j, int k, gameapp gameapp1) {
		if (j < I && j + sprite1.C >= 0 && k < Z && k + sprite1.B >= 0) {
			int l3 = sprite1.Z;
			if (j >= 0 && j + sprite1.C < I && k >= 0 && k + sprite1.B < Z) {
				int k1 = k * I + j;
				for (int l = 0; l < l3; l++) {
					rlepart rlepart1 = sprite1.I[l];
					k1 += rlepart1.D;
					int i2 = k1;
					short word0 = rlepart1.C;
					int ai[] = rlepart1.B;
					for (int j1 = 0; j1 < word0;) {
						B[i2] = ai[j1] & i;
						j1++;
						i2++;
					}

				}

				return;
			}
			for (int i1 = 0; i1 < l3; i1++) {
				rlepart rlepart2 = sprite1.I[i1];
				int i3 = k + rlepart2.Z;
				if (i3 >= 0 && i3 < Z) {
					int k2 = j + rlepart2.I;
					int l2 = k2 + rlepart2.C;
					if (k2 < I && l2 >= 0) {
						int j3 = rlepart2.C;
						int l1 = i3 * I + k2;
						int j2 = 0;
						if (k2 < 0) {
							l1 -= k2;
							j2 -= k2;
							j3 += k2;
						}
						if (l2 >= I)
							j3 -= (l2 - I) + 1;
						int ai1[] = rlepart2.B;
						for (int k3 = j2 + j3; j2 < k3; j2++) {
							B[l1] = ai1[j2] & i;
							l1++;
						}

					}
				}
			}

		}
	}

	final void I(sprite sprite1, float f, int i, int j, gameapp gameapp1) {
		if (f >= 0.99F) {
			I(sprite1, i, j, gameapp1);
			return;
		}
		if (i < I && i + sprite1.C >= 0 && j < Z && j + sprite1.B >= 0) {
			int l7 = sprite1.Z;
			if (f < 0.0F)
				f = 0.0F;
			else if (f > 1.0F)
				f = 1.0F;
			int k4 = (int) (f * 255F);
			if (i >= 0 && i + sprite1.C < I && j >= 0 && j + sprite1.B < Z) {
				int j1 = j * I + i;
				for (int k = 0; k < l7; k++) {
					rlepart rlepart1 = sprite1.I[k];
					j1 += rlepart1.D;
					int l1 = j1;
					short word0 = rlepart1.C;
					int ai[] = rlepart1.B;
					for (int i1 = 0; i1 < word0;) {
						int i4 = ai[i1];
						int k3 = B[l1];
						int j5 = i4 >> 16 & 0xff;
						int l4 = k3 >> 16 & 0xff;
						int j6 = i4 >> 8 & 0xff;
						int l5 = k3 >> 8 & 0xff;
						int j7 = i4 & 0xff;
						int l6 = k3 & 0xff;
						B[l1] = (k4 * (j5 - l4) >> 8) + l4 << 16 | (k4 * (j6 - l5) >> 8) + l5 << 8
								| (k4 * (j7 - l6) >> 8) + l6;
						i1++;
						l1++;
					}

				}

				return;
			}
			for (int l = 0; l < l7; l++) {
				rlepart rlepart2 = sprite1.I[l];
				int l2 = j + rlepart2.Z;
				if (l2 >= 0 && l2 < Z) {
					int j2 = i + rlepart2.I;
					int k2 = j2 + rlepart2.C;
					if (j2 < I && k2 >= 0) {
						int i3 = rlepart2.C;
						int k1 = l2 * I + j2;
						int i2 = 0;
						if (j2 < 0) {
							k1 -= j2;
							i2 -= j2;
							i3 += j2;
						}
						if (k2 >= I)
							i3 -= (k2 - I) + 1;
						int ai1[] = rlepart2.B;
						for (int j3 = i2 + i3; i2 < j3; i2++) {
							int j4 = ai1[i2];
							int l3 = B[k1];
							int k5 = j4 >> 16 & 0xff;
							int i5 = l3 >> 16 & 0xff;
							int k6 = j4 >> 8 & 0xff;
							int i6 = l3 >> 8 & 0xff;
							int k7 = j4 & 0xff;
							int i7 = l3 & 0xff;
							B[k1] = (k4 * (k5 - i5) >> 8) + i5 << 16 | (k4 * (k6 - i6) >> 8) + i6 << 8
									| (k4 * (k7 - i7) >> 8) + i7;
							k1++;
						}

					}
				}
			}

		}
	}

	final void HNSM(sprite sprite1, int i, int j, gameapp gameapp1) {
		if (i < I && i + sprite1.C >= 0 && j < Z && j + sprite1.B >= 0) {
			int i8 = sprite1.Z;
			if (i >= 0 && i + sprite1.C < I && j >= 0 && j + sprite1.B < Z) {
				int j1 = j * I + i;
				for (int k = 0; k < i8; k++) {
					rlepart rlepart1 = sprite1.I[k];
					j1 += rlepart1.D;
					int l1 = j1;
					short word0 = rlepart1.C;
					int ai[] = rlepart1.B;
					for (int i1 = 0; i1 < word0;) {
						int i4 = ai[i1];
						int k4 = i4 & 0xff000000;
						if (k4 == 0xff000000) {
							B[l1] = i4;
						} else {
							k4 >>>= 24;
							int k3 = B[l1];
							int k5 = i4 >> 16 & 0xff;
							int i5 = k3 >> 16 & 0xff;
							int k6 = i4 >> 8 & 0xff;
							int i6 = k3 >> 8 & 0xff;
							int k7 = i4 & 0xff;
							int i7 = k3 & 0xff;
							B[l1] = (k4 * (k5 - i5) >> 8) + i5 << 16 | (k4 * (k6 - i6) >> 8) + i6 << 8
									| (k4 * (k7 - i7) >> 8) + i7;
						}
						i1++;
						l1++;
					}

				}

				return;
			}
			for (int l = 0; l < i8; l++) {
				rlepart rlepart2 = sprite1.I[l];
				int l2 = j + rlepart2.Z;
				if (l2 >= 0 && l2 < Z) {
					int j2 = i + rlepart2.I;
					int k2 = j2 + rlepart2.C;
					if (j2 < I && k2 >= 0) {
						int i3 = rlepart2.C;
						int k1 = l2 * I + j2;
						int i2 = 0;
						if (j2 < 0) {
							k1 -= j2;
							i2 -= j2;
							i3 += j2;
						}
						if (k2 >= I)
							i3 -= (k2 - I) + 1;
						int ai1[] = rlepart2.B;
						for (int j3 = i2 + i3; i2 < j3; i2++) {
							int j4 = ai1[i2];
							int l4 = j4 & 0xff000000;
							if (l4 == 0xff000000) {
								B[k1] = j4;
							} else {
								l4 >>>= 24;
								int l3 = B[k1];
								int l5 = j4 >> 16 & 0xff;
								int j5 = l3 >> 16 & 0xff;
								int l6 = j4 >> 8 & 0xff;
								int j6 = l3 >> 8 & 0xff;
								int l7 = j4 & 0xff;
								int j7 = l3 & 0xff;
								B[k1] = (l4 * (l5 - j5) >> 8) + j5 << 16 | (l4 * (l6 - j6) >> 8) + j6 << 8
										| (l4 * (l7 - j7) >> 8) + j7;
							}
							k1++;
						}

					}
				}
			}

		}
	}

	final void I(String s, int i, gamefont gamefont1, int j, int k) {
		if (gamefont1 == null)
			return;
		int l = s.length();
		for (int i1 = 0; i1 < l; i1++) {
			char c = s.charAt(i1);
			sprite sprite1 = c <= 0 || c >= gamefont.D ? null : gamefont1.I[c];
			if (sprite1 != null) {
				if (i != 0xffffff)
					I(sprite1, i, j, (k - sprite1.B) + (c <= 0 || c >= gamefont.D ? 0 : gamefont1.Z[c]), addConsumer);
				else
					I(sprite1, j, (k - sprite1.B) + (c <= 0 || c >= gamefont.D ? 0 : gamefont1.Z[c]), addConsumer);
				j += sprite1.C + gamefont1.B;
			} else if (c == ' ')
				j += gamefont1.B * 2;
			else
				j += gamefont1.B;
		}

	}

	final void Z(int i, int j, int k, int l, int i1) {
		if (k <= 0 || l <= 0)
			return;
		if (i + k < HNSM)
			return;
		if (i - k >= I)
			return;
		if (j + l < S)
			return;
		if (j - l >= Z)
			return;
		int k1 = l * l;
		int j1 = k * k;
		int i2 = 0;
		int l1 = k * k * l;
		int j2 = 0;
		int k2 = l;
		int l2 = 0;
		while (k2 > 0 || j2 < k) {
			int i3 = i - j2;
			int k3 = i + j2;
			int i4 = j - k2;
			int k4 = j + k2;
			if (i3 < HNSM)
				i3 = HNSM;
			if (k3 >= I)
				k3 = I - 1;
			if (i4 >= S && i4 < Z) {
				int l4 = i4 * I + i3;
				for (int k5 = l4 + (k3 - i3); l4 < k5; l4++)
					B[l4] = i1;

			}
			if (k4 >= S && k4 < Z) {
				int i5 = k4 * I + i3;
				for (int l5 = i5 + (k3 - i3); i5 < l5; i5++)
					B[i5] = i1;

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
		if (l3 > I)
			l3 = I;
		int j4 = j - k2;
		if (j4 >= S && j4 < Z) {
			int j5 = j4 * I + j3;
			for (int i6 = j5 + (l3 - j3); j5 < i6; j5++)
				B[j5] = i1;

		}
	}

	int HNSM;
	int S;
	int I;
	int Z;
	int C;
	int B[];
	gameapp addConsumer;
	ColorModel arraycopy;
	ImageConsumer charAt;
	Image D;
	static int createImage = 1000;
	float getDefaultToolkit[];
	int imageComplete;
	public final Toolkit length = Toolkit.getDefaultToolkit();

}
