package realspace;
// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.

// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   star_y

final class palette {

	palette(GameApp gameapp, int i) {
		HNSM = gameapp;
		I = new int[i];
		C = i;
		Z = 0;
		B = false;
		D = false;
	}

	final void I(int i, int j, int k, boolean flag, boolean flag1) {
		for (int l = 0; l < k; l++) {
			int i1 = (int) (((float) l / (float) k) * 255F);
			int j1 = 255 - i1;
			int l1 = (i >> 16 & 0xff) * j1;
			int j2 = (i >> 8 & 0xff) * j1;
			int l2 = (i & 0xff) * j1;
			int k1 = (j >> 16 & 0xff) * i1;
			int i2 = (j >> 8 & 0xff) * i1;
			int k2 = (j & 0xff) * i1;
			int i3 = 0xff000000 + ((k1 + l1 >> 8) << 16) + ((i2 + j2 >> 8) << 8) + (k2 + l2 >> 8);
			if (Z < C) {
				I[Z] = i3;
				Z++;
			}
		}

		B = flag;
		D = flag1;
	}

	final int I(int i, int j) {
		if (D) {
			if (i >= 0)
				return I[i % Z];
		} else if (B) {
			if (i >= 0 && i < Z * 2)
				return I[i >> 1];
			if (i >= j - Z * 2 && i < j)
				return I[j - i - 1 >> 1];
		} else if (i >= 0 && i < j)
			return I[(i * Z) / j];
		return I[Z - 1];
	}

	final int I(int i) {
		if (i >= 0 && i < Z)
			return I[i];
		else
			return I[Z - 1];
	}

	GameApp HNSM;
	int I[];
	int Z;
	int C;
	boolean B;
	boolean D;
}
