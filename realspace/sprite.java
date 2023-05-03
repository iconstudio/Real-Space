package realspace;
// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.

import java.awt.Rectangle;

// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   star_y

final class Sprite
{
	Sprite(int i, int j, int k, int l, int i1, int j1, Canvas surface1, boolean flag, int k1, int ai[], int l1, GameApp gameapp)
	{
		HNSM(i, j, k, l, i1, j1, surface1, flag, k1, ai, l1, gameapp);
	}

	Sprite(int i, int j, int k, int l, int i1, int j1, Canvas surface1, boolean flag, Bitmap imagepixels1, GameApp gameapp)
	{
		HNSM(i, j, k, l, i1, j1, surface1, flag, imagepixels1.myData[0], imagepixels1.myData, imagepixels1.myDimension[0], gameapp);
	}

	private void HNSM(int i, int j, int k, int l, int i1, int j1, Canvas surface1, boolean flag, int k1, int ai[], int l1, GameApp gameapp)
	{
		myDimension = new Rectangle();
		myDimension.x = i;
		myDimension.y = j;
		myDimension.width = i;
		myDimension.height = j;

		C = i;
		B = j;

		arraycopy = i;
		cos = j;
		max = -arraycopy;
		min = -cos;
		D = i / 2;
		F = j / 2;
		A = Math.max(i, j) / 2;
		out = D;
		J = F;
		println = -out;
		round = -J;
		E = i1;
		G = j1;
		HNSM = k;
		S = l;
		Z = 0;
		H = false;
		rlepart rlepart1 = null;
		int k4 = 0;
		int l4 = 0;
		int j5 = 0;

		if (flag)
		{
			for (int k2 = 0; k2 < j; k2++)
			{
				int j3 = (k2 + l) * l1 + k;
				boolean flag1 = true;
				for (int i2 = 0; i2 < i;)
				{
					int i4 = ai[j3];
					if (flag1)
					{
						if (i4 != k1 && (i4 & 0xff000000) != 0)
						{
							Z++;
							flag1 = false;
							if ((i4 & 0xff000000) != 0xff000000)
								H = true;
						}
					}
					else if (i4 == k1 || (i4 & 0xff000000) == 0)
					{
						flag1 = true;
					}
					else if ((i4 & 0xff000000) != 0xff000000)
					{
						H = true;
					}

					i2++;
					j3++;
				}
			}

			I = new rlepart[Z];
			L += Z;

			for (int l2 = 0; l2 < j; l2++) 
			{
				int k3 = (l2 + l) * l1 + k;

				boolean flag2 = true;
				for (int j2 = 0; j2 < i;)
				{
					int j4 = ai[k3];
					if (flag2)
					{
						if (j4 != k1 && (j4 & 0xff000000) != 0)
						{
							flag2 = false;

							rlepart1 = I[k4] = new rlepart();
							rlepart1.I = (short) j2;
							rlepart1.Z = (short) l2;
							rlepart1.D = (short) j5;
							j5 = 0;
							l4 = 1;
						}
					}
					else if (j4 == k1 || (j4 & 0xff000000) == 0)
					{
						flag2 = true;
						rlepart1.C = (short) l4;
						rlepart1.B = new int[l4];
						K += l4 * 4;

						System.arraycopy(ai, k3 - l4, rlepart1.B, 0, l4);
						k4++;
					}
					else
					{
						l4++;
					}
					j5++;
					j2++;
					k3++;
				}

				if (!flag2)
				{
					rlepart1.C = (short) l4;
					rlepart1.B = new int[l4];
					System.arraycopy(ai, k3 - l4, rlepart1.B, 0, l4);
					k4++;
				}
				j5 += surface1.hSize - i;
			}

			return;
		}
		
		Z = j;
		I = new rlepart[Z];
		L += Z;

		for (int i3 = 0; i3 < j; i3++)
		{
			int l3 = (i3 + l) * l1 + k;
			int i5 = i;
			
			rlepart rlepart2 = I[k4] = new rlepart();
			rlepart2.I = 0;
			rlepart2.Z = (short) i3;
			rlepart2.D = (short) surface1.hSize;
			rlepart2.C = (short) i5;
			rlepart2.B = new int[i5];
			System.arraycopy(ai, l3, rlepart2.B, 0, i5);
			K += i5 * 4;
			k4++;
		}
	}

	public static final Sprite I(float f, float f1, int i, int j, int k, int l, int i1, int j1, int k1, Bitmap imagepixels1, Canvas surface1, GameApp gameapp)
	{
		int l1 = j;
		int i2 = k;
		int j2 = l1 / 2;
		int k2 = i2 / 2;
		float f2 = (float) Math.sin(f1) * (1.0F / f);
		float f3 = (float) Math.cos(f1) * (1.0F / f);
		float f4 = (float) Math.sin(f1) * f;
		float f5 = (float) Math.cos(f1) * f;
		int l2 = Math.round(((-j2) - 1.0F) * f5 - ((-k2) - 1.0F) * f4);
		int j3 = Math.round(((-j2) - 1.0F) * f4 + ((-k2) - 1.0F) * f5);
		int l3 = Math.round((j2 + 1.0F) * f5 - ((-k2) - 1.0F) * f4);
		int j4 = Math.round((j2 + 1.0F) * f4 + ((-k2) - 1.0F) * f5);
		int l4 = -l2;
		int i5 = -j3;
		int j5 = -l3;
		int k5 = -j4;
		int l5 = Math.min(Math.min(Math.min(l2, l3), l4), j5);
		int i6 = Math.max(Math.max(Math.max(l2, l3), l4), j5);
		int j6 = Math.min(Math.min(Math.min(j3, j4), i5), k5);
		int k6 = Math.max(Math.max(Math.max(j3, j4), i5), k5);
		int l6 = i6 - l5;
		int i7 = k6 - j6;
		int j7 = imagepixels1.myData[0];
		int ai[] = new int[l6 * (i7 + i + 1)];
		int k7 = l6;
		int l7 = i7;
		int i8 = 0;
		int j8 = 0;

		float f6 = (float) Math.sin(-f1) * (1.0F / f);
		float f7 = (float) Math.cos(-f1) * (1.0F / f);
		float f8 = Math.round(l5 * f7 - j6 * f6);
		float f9 = Math.round(l5 * f6 + j6 * f7);
		f8 += j2;
		f9 += k2;

		int l12 = imagepixels1.myDimension[0];
		for (int i9 = 0; i9 < i7; i9++)
		{
			float f10 = f8;
			float f11 = f9;
			
			for (int k8 = 0; k8 < l6; k8++)
			{
				int i3 = Math.round(f10 - 0.5F);
				int i4 = i3 + 1;
				int k3 = Math.round(f11 - 0.5F);
				int k4 = k3 + 1;
				if (i3 >= 0 && i4 < l1 && k3 >= 0 && k4 < i2)
				{
					int k10 = 0;
					int l10 = 0;
					int i11 = 0;
					int j11 = 0;
					int k9 = l + i3 + (i1 + k3) * l12;
					if (k3 >= 0)
					{
						if (i3 >= 0)
						{
							k10 = imagepixels1.myData[k9];
							if (k10 == j7 || (k10 & 0xff000000) == 0)
								k10 = 0;
						}
						if (i4 < l1)
						{
							l10 = imagepixels1.myData[k9 + 1];
							if (l10 == j7 || (l10 & 0xff000000) == 0)
								l10 = 0;
						}
					}
					k9 += l12;
					if (k4 < i2) {
						if (i3 >= 0) {
							i11 = imagepixels1.myData[k9];
							if (i11 == j7 || (i11 & 0xff000000) == 0)
								i11 = 0;
						}
						if (i4 < l1) {
							j11 = imagepixels1.myData[k9 + 1];
							if (j11 == j7 || (j11 & 0xff000000) == 0)
								j11 = 0;
						}
					}
					if (k10 != 0 || l10 != 0 || i11 != 0 || j11 != 0) {
						float f16 = f10 - (int) f10;
						float f17 = f11 - (int) f11;
						float f12 = (1.0F - f16) * (1.0F - f17);
						float f14 = f16 * (1.0F - f17);
						float f13 = (1.0F - f16) * f17;
						float f15 = f16 * f17;
						int k11 = (int) (f12 * (k10 >>> 24 & 0xff) + f13 * (i11 >>> 24 & 0xff)
								+ f14 * (l10 >>> 24 & 0xff) + f15 * (j11 >>> 24 & 0xff));
						if (k11 != 0) {
							if (k11 > 200)
								k11 = 255;
							int i12 = (int) (f12 * (k10 >> 16 & 0xff) + f13 * (i11 >> 16 & 0xff)
									+ f14 * (l10 >> 16 & 0xff) + f15 * (j11 >> 16 & 0xff));
							int j12 = (int) (f12 * (k10 >> 8 & 0xff) + f13 * (i11 >> 8 & 0xff)
									+ f14 * (l10 >> 8 & 0xff) + f15 * (j11 >> 8 & 0xff));
							int k12 = (int) (f12 * (k10 & 0xff) + f13 * (i11 & 0xff)
									+ f14 * (l10 & 0xff) + f15 * (j11 & 0xff));
							int i10 = k11 << 24 | i12 << 16 | j12 << 8 | k12;
							ai[k8 + i9 * l6] = i10;
							if (k8 < k7)
								k7 = k8;
							if (k8 > i8)
								i8 = k8;
							if (i9 < l7)
								l7 = i9;
							if (i9 > j8)
								j8 = i9;
						}
					}
				}
				f10 += f3;
				f11 -= f2;
			}

			f8 += f2;
			f9 += f3;
		}

		if (i8 < k7) {
			System.out.println("failed to find any non-transparent pixels");
			return null;
		}
		i8++;
		j8++;
		float f18 = j1 * f5 - k1 * f4;
		float f19 = j1 * f4 + k1 * f5;
		int i13 = Math.round(f18 + (k7 - (l6 - 1 - i8)) / 2.0F);
		int j13 = Math.round(f19 + (l7 - (i7 - 1 - j8)) / 2.0F);
		if (i > 0) {
			for (int j9 = i7 + i; j9 >= i; j9--) {
				int l9 = j9 * l6;
				for (int l8 = 0; l8 < l6; l8++) {
					int j10 = ai[l9];
					if (j10 == 0) {
						boolean flag = false;
						int l13 = l9 - l6;
						for (int k13 = 0; k13 < i && !flag; k13++) {
							int i14 = ai[l13];
							int l11 = i14 & 0xff000000;
							if (l11 != 0) {
								ai[l9] = i14;
								flag = true;
								if (l11 != 0xff000000)
									ai[l13] = 0;
							}
							l13 -= l6;
						}

					}
					l9++;
				}

			}

		}
		Sprite sprite1 = new Sprite(i8 - k7, (j8 - l7) + i, k7, l7, i13, j13 + i, surface1, true, 0, ai, l6, gameapp);
		ai = null;
		return sprite1;
	}

	final public int GetWidth()
	{
		return myDimension.width;
	}

	final public int GetHeight()
	{
		return myDimension.height;
	}

	rlepart I[];
	int Z;
	int HNSM;
	int S;
	
	Rectangle myDimension;
	int C;
	int B;

	float arraycopy;
	float cos;
	float max;
	float min;
	int D;
	int F;
	float out;
	float J;
	float println;
	float round;
	int A;
	int E;
	int G;
	boolean H;
	static int K;
	static int L;
}
