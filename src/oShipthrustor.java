package src;
// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.

// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   star_y

final class oShipthrustor {
	oShipthrustor(gameapp gameapp) {
		F = gameapp;
		HNSM = new float[25];
		cos = new float[25];
		sin = new float[25];
		sqrt = new float[25];
		I = new int[25];
		D = new float[5];
		J = new float[5];
		E = null;
	}

	final void I(int i, int j, int k, float f, sprite_group sprite_group1) {
		H = i;
		K = j;
		M = f;
		B = k;
		E = sprite_group1;
		I();
		G = true;
	}

	final void I() {
		Z = 0;
		S = 0;
		A = 0;
		L = 0;
		G = false;
	}

	final void I(float f, float f1) {
		if (G && S < 5) {
			D[S] = f;
			J[S] = f1;
			S++;
		}
	}

	final void I(oSpaceship owner) {
		if (S > 0) {
			for (int i = 0; i < Z; i++) {
				HNSM[i] += sin[i];
				cos[i] += sqrt[i];
				sin[i] = sin[i] * 0.7F;
				sqrt[i] = sqrt[i] * 0.7F;
				I[i]++;
				if (I[i] >= B) {
					int k = i + 1;
					for (int l = i; k < Z; l++) {
						HNSM[l] = HNSM[k];
						cos[l] = cos[k];
						sin[l] = sin[k];
						sqrt[l] = sqrt[k];
						I[l] = I[k];
						k++;
					}

					Z--;
				}
			}

			if (owner.QI == 3 || owner.QI == 4) {
				L++;
				if (L % K == 0 && Z < 25) {
					float f = (((oGameObject) (owner)).W * ((oGameObject) (owner)).W
							+ ((oGameObject) (owner)).X * ((oGameObject) (owner)).X) * M;
					if (f > 0.01F) {
						float f1 = ((float) ((oGameObject) (owner)).d / (float) ((oGameObject) (owner)).x.Z)
								* 6.283185F;
						float f2 = (float) Math.cos(f1);
						float f3 = (float) Math.sin(f1);
						for (int j = 0; j < H && Z < 25; j++) {
							f = (float) Math.sqrt(f);
							float f4 = D[A];
							float f5 = J[A];
							HNSM[Z] = (((oGameObject) (owner)).J + (float) ((oGameObject) (owner)).y.E
									+ f4 * f2) - f5 * f3;
							cos[Z] = ((oGameObject) (owner)).S + (float) ((oGameObject) (owner)).y.G
									+ f4 * f3 + f5 * f2;
							sin[Z] = ((oGameObject) (owner)).K - f2 * f;
							sqrt[Z] = ((oGameObject) (owner)).L - f3 * f;
							I[Z] = 0;
							Z++;
							A = (A + 1) % S;
						}

					}
				}
			}
		}
	}

	final void I(surface surface1) {
		if (S > 0) {
			if (E == null) {
				for (int k = 0; k < Z; k++) {
					int i = mask.I(I[k], B);
					surface1.I((int) HNSM[k] + ((gamebase) (F)).WC, (int) cos[k] + ((gamebase) (F)).XC, 3, 3, i);
				}

				return;
			}
			for (int l = 0; l < Z; l++) {
				int j = (E.I[0] * I[l]) / B;
				if (j < E.I[0]) {
					sprite sprite1 = E.I(0, j);
					surface1.I(sprite1, ((int) HNSM[l] - sprite1.D) + ((gamebase) (F)).WC,
							((int) cos[l] - sprite1.F) + ((gamebase) (F)).XC, F);
				}
			}

		}
	}

	gameapp F;
	float HNSM[];
	float cos[];
	float sin[];
	float sqrt[];
	int I[];
	int Z;
	palette mask;
	int B;
	float D[];
	float J[];
	int S;
	int A;
	sprite_group E;
	boolean G;
	int H;
	int K;
	int L;
	float M;
}
