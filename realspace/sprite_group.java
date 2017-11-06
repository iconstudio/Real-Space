package realspace;
// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.

// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   star_y

final class sprite_group {
	sprite_group(gameapp gameapp, int i) {
		HNSM(gameapp, 1, i);
	}

	sprite_group(gameapp gameapp, int i, int j) {
		HNSM(gameapp, i, j);
	}

	private void HNSM(gameapp gameapp, int i, int j) {
		HNSM = gameapp;
		max = new sprite[i][j];
		I = new int[i];
		for (int k = 0; k < i; k++)
			I[k] = 0;

		Z = i;
		round = j;
		C = 0;
		B = 0;
		J = false;
		S = 6.283185F / i;
		A = S * 0.5F;
	}

	final sprite I(int i, int j) {
		int k, l;
		try {
			k = i % Z;
			l = j % I[k];
		} catch (Exception _ex) {
			k = 0;
			l = 0;
		}
		return max[k][l];
	}

	final int I(float f) {
		int i;
		if (J)
			i = Math.round(((f - 3.141593F / (Z * 2)) / 3.141593F) * Z);
		else
			i = Math.max((int) ((f - A) / S + 0.5F), 0);
		return i % Z;
	}

	final sprite I(int i, int j, int k) {
		int l = i % Z;
		int i1 = (j * I[l]) / k;
		if (i1 >= I[l])
			i1 = I[l] - 1;
		return max[l][i1];
	}

	final void I(int i, sprite sprite1) {
		int j = I[i];
		if (j < round) {
			max[i][j] = sprite1;
			if (sprite1.C > C) {
				C = sprite1.C;
				D = sprite1.C;
			}
			if (sprite1.B > B) {
				B = sprite1.B;
				F = sprite1.B;
			}
			I[i] = j + 1;
		}
	}

	final void I(float f, int i, int j, int k, int l, int i1, int j1, int k1, imagepixels imagepixels, int l1, int i2,
			int j2, surface surface) {
		for (int k2 = i2; k2 < j2; k2++) {
			sprite sprite1 = sprite.I(f, (float) ((6.2831853071795862D / l1) * k2), i, j, k, l, i1,
					j1, k1, imagepixels, surface, HNSM);
			if (sprite1 != null)
				I(k2, sprite1);
		}

	}

	final void I(int i, float f, int j, int k, int l, int i1, int j1, int k1, int l1, imagepixels imagepixels, int i2,
			int j2, int k2, surface surface) {
		for (int l2 = j2; l2 < k2; l2++) {
			sprite sprite1 = sprite.I(f, (float) ((6.2831853071795862D / i2) * l2), j, k, l, i1, j1,
					k1, l1, imagepixels, surface, HNSM);
			if (sprite1 != null)
				I(i, sprite1);
		}

	}

	gameapp HNSM;
	private sprite max[][];
	int I[];
	int round;
	int Z;
	int C;
	int B;
	float D;
	float F;
	boolean J;
	float S;
	float A;
}
