package realspace;
// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.

// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   star_y

import java.awt.Rectangle;

final class gameobjectivelist {

	gameobjectivelist(GameApp gameapp1, int i, int j) {
		HNSM = gameapp1;
		I = new gameobjective[j];
		for (int k = 0; k < j; k++)
			I[k] = new gameobjective();

		B = j;
		height = i;
		if (i == 2)
			max = 1;
		else
			max = 2;
		D = new oGameObjectlist(gameapp1, 5);
		U = new int[20];
		V = new int[20];
		W = new float[20];
		P = new Rectangle[10];
		for (int l = 0; l < 10; l++)
			P[l] = new Rectangle();

		I();
	}

	final void I() {
		Z = 0;
		C = 0;
		D.I();
		F = -1;
		J = -1;
		S = 0;
		A = -1;
		E = 0;
		G = false;
		H = true;
		random = -1;
		K = 1.0F;
		L = -1;
		M = 0;
		T = 0;
		R = 0;
		Q = 0;
	}

	final void Z() {
		if (M > 0) {
			L--;
			if (L == 0) {
				HNSM(Math.max(1, (int) Math.round(O - Math.random())));
				L = (int) (Math.random() * N) + M;
			}
		}
		if (random >= 0) {
			random--;
			if (random <= 0) {
				int i = 0;
				if (height == 2) {
					oGameObjectlist oGameObjectlist1 = HNSM.wZ;
					int l = oGameObjectlist1.C;
					for (int j = 0; j < l && (width == -1 || i < width); j++) {
						oGameObjectlist oGameObjectlist2 = HNSM.wZ;
						oSpaceship oSpaceship1 = (oSpaceship) (j < 0 || j >= oGameObjectlist2.C ? null
								: oGameObjectlist2.Z[j]);
						if (((GameObject) (oSpaceship1)).e == 1 && oSpaceship1.QI != round && oSpaceship1.QI != 1) {
							i++;
							oSpaceship1.QI = round;
						}
					}

				} else {
					oGameObjectlist oGameObjectlist3 = HNSM.vZ;
					int i1 = oGameObjectlist3.C;
					for (int k = 0; k < i1 && (width == -1 || i < width); k++) {
						oGameObjectlist oGameObjectlist4 = HNSM.vZ;
						oSpaceship oSpaceship2 = (oSpaceship) (k < 0 || k >= oGameObjectlist4.C ? null
								: oGameObjectlist4.Z[k]);
						if (((GameObject) (oSpaceship2)).e == 1 && oSpaceship2.QI != round && oSpaceship2.QI != 1) {
							i++;
							oSpaceship2.QI = round;
						}
					}

				}
				if (i == 0)
					random = -1;
				else
					random = x + (int) (Math.random() * y);
			}
		}
		for (boolean flag = true; flag && C < Z;) {
			gameobjective gameobjective1 = I[C];
			flag = false;
			switch (gameobjective1.I) {
			case 1: // '\001'
				if (height == 2) {
					HNSM.vZ.I(gameobjective1.F, gameobjective1.S, gameobjective1.A, gameobjective1.E, gameobjective1.G);
					HNSM.EC.I(gameobjective1.F, gameobjective1.S, gameobjective1.A, gameobjective1.E, gameobjective1.G);
				} else {
					HNSM.wZ.I(gameobjective1.F, gameobjective1.S, gameobjective1.A, gameobjective1.E, gameobjective1.G);
					HNSM.GC.I(gameobjective1.F, gameobjective1.S, gameobjective1.A, gameobjective1.E, gameobjective1.G);
				}
				if (gameobjective1.G == 101)
					HNSM.dZ.I(gameobjective1.F, -1, -1, -1, -1);
				flag = true;
				break;

			case 4: // '\004'
				if (height == 2) {
					if (HNSM.vZ.I(gameobjective1.J, gameobjective1.S, gameobjective1.A, gameobjective1.E,
							gameobjective1.G, 0.0001F) == null
							&& HNSM.EC.I(gameobjective1.J, gameobjective1.S, gameobjective1.A, gameobjective1.E,
									gameobjective1.G, 0.0001F) == null)
						flag = true;
				} else if (HNSM.wZ.I(gameobjective1.J, gameobjective1.S, gameobjective1.A, gameobjective1.E,
						gameobjective1.G, 0.0001F) == null
						&& HNSM.GC.I(gameobjective1.J, gameobjective1.S, gameobjective1.A, gameobjective1.E,
								gameobjective1.G, 0.0001F) == null)
					flag = true;
				break;

			case 2: // '\002'
				flag = true;
				break;

			case 3: // '\003'
				gameobjective1.K++;
				if (gameobjective1.K >= gameobjective1.H)
					flag = true;
				break;

			case 5: // '\005'
				oWaypoint oWaypoint1 = (oWaypoint) HNSM.SC.I(D);
				if (oWaypoint1 != null) {
					oWaypoint1.I(gameobjective1.B, gameobjective1.D);
					oWaypoint1.v = true;
					oWaypoint1.I(gameobjective1.Z, gameobjective1.C, false);
				}
				flag = true;
				break;

			case 6: // '\006'
				HNSM.Mission.I(gameobjective1.L);
				return;
			}
			if (flag)
				C++;
		}

	}

	final void I(float f, int i, int j, int k, int l) {
		if (Z < B) {
			I[Z].I(f, i, j, k, l);
			Z++;
		}
	}

	final void I(int i, int j, int k, int l, int i1) {
		if (Z < B) {
			I[Z].I(i, j, k, l, i1);
			Z++;
		}
	}

	final void I(float f, float f1, int i, int j) {
		if (Z < B) {
			I[Z].I(f, f1, i, j);
			Z++;
		}
	}

	final void I(int i, int j, int k, int l) {
		random = 2;
		round = i;
		width = j;
		x = k;
		y = l;
	}

	final void Z(int i, int j, int k, int l) {
		if (Q < 10) {
			P[Q].x = i;
			P[Q].y = j;
			P[Q].width = k;
			P[Q].height = l;
			Q++;
		}
	}

	final void I(int i, int j, float f) {
		if (R < 20) {
			T += i;
			U[R] = i;
			V[R] = j;
			W[R] = f;
			R++;
		}
	}

	final void I(int i, int j, int k) {
		L = 1;
		M = i;
		N = j;
		O = k;
	}

	final void HNSM(int i) {
		int j = (int) (Math.random() * T);
		for (int l = 0; l < R; l++) {
			if (j <= U[l]) {
				float f;
				float f1;
				if (Q == 0) {
					int i1 = (int) (Math.random() * 4D);
					switch (i1) {
					case 0: // '\0'
						f = ((AppletImplements) (HNSM)).YC;
						f1 = ((AppletImplements) (HNSM)).zC + (int) (Math.random() * ((AppletImplements) (HNSM)).worldVrt);
						break;

					case 1: // '\001'
						f = ((AppletImplements) (HNSM)).iC;
						f1 = ((AppletImplements) (HNSM)).zC + (int) (Math.random() * ((AppletImplements) (HNSM)).worldVrt);
						break;

					case 2: // '\002'
						f = ((AppletImplements) (HNSM)).YC + (int) (Math.random() * ((AppletImplements) (HNSM)).worldHrz);
						f1 = ((AppletImplements) (HNSM)).cC;
						break;

					default:
						f = ((AppletImplements) (HNSM)).YC + (int) (Math.random() * ((AppletImplements) (HNSM)).worldHrz);
						f1 = ((AppletImplements) (HNSM)).zC;
						break;
					}
				} else {
					int j1 = (int) (Math.random() * Q * 0.99998998641967773D);
					Rectangle rectangle = P[j1];
					f = (float) (rectangle.x + Math.random() * rectangle.width);
					f1 = (float) (rectangle.y + Math.random() * rectangle.height);
				}
				oSpaceship oSpaceship1;
				if (height == 2)
					oSpaceship1 = (oSpaceship) HNSM.xZ.I(HNSM.wZ);
				else
					oSpaceship1 = (oSpaceship) HNSM.xZ.I(HNSM.vZ);
				if (oSpaceship1 == null)
					return;
				oSpaceship1.I(V[l], height, HNSM.Mission.I(1.0F, 0.05F) * ((AppletImplements) (HNSM)).viewScale);
				oSpaceship1.QI = 3;
				if (G) {
					oSpaceship1.II = true;
					oSpaceship1.ZI = "";
				}
				oSpaceship1.CI = H;
				if (K >= 0.0F)
					oSpaceship1.BI = K;
				oSpaceship1.I(f, f1, null, f + 1.0F, f1 + 1.0F, W[l] * ((AppletImplements) (HNSM)).viewScale, 1.0F, 0.15F,
						true);
				oSpaceship1.E();
				Explosion explosion1 = (Explosion) HNSM.rZ.I(HNSM.qZ);
				if (explosion1 != null)
					explosion1.I(HNSM.sprite_group_ship, 1, (int) f, (int) f1, 0.0F, 0.0F, 1, 2, 0, false);
				oSpaceship1.s = -20;
				float f2 = ((GameObject) (oSpaceship1)).R;
				float f3 = ((GameObject) (oSpaceship1)).T;
				for (int k1 = 1; k1 < i; k1++) {
					oSpaceship oSpaceship2;
					if (height == 2)
						oSpaceship2 = (oSpaceship) HNSM.xZ.I(HNSM.wZ);
					else
						oSpaceship2 = (oSpaceship) HNSM.xZ.I(HNSM.vZ);
					if (oSpaceship2 != null) {
						oSpaceship2.I(V[l], height, HNSM.Mission.I(1.0F, 0.2F) * ((AppletImplements) (HNSM)).viewScale);
						oSpaceship2.QI = 3;
						if (G) {
							oSpaceship2.II = true;
							oSpaceship2.ZI = "";
						}
						oSpaceship2.CI = H;
						if (K >= 0.0F)
							oSpaceship2.BI = K;
						oSpaceship2.I(f, f1, null, f2, f3, W[l] * ((AppletImplements) (HNSM)).viewScale, 1.0F, 0.15F, true);
						int k = oSpaceship2.s = -k1 * 20;
						Explosion explosion2 = (Explosion) HNSM.rZ.I(HNSM.qZ);
						if (explosion2 != null) {
							explosion2.I(HNSM.sprite_group_ship, 1, (int) f, (int) f1, 0.0F, 0.0F, 1, 2, 0, false);
							explosion2.s = -k;
						}
						oSpaceship2.s = k - 20;
					}
				}

				return;
			}
			j -= U[l];
		}

	}

	GameApp HNSM;
	gameobjective I[];
	int Z;
	int C;
	int B;
	int height;
	int max;
	oGameObjectlist D;
	int F;
	int J;
	int S;
	int A;
	int E;
	boolean G;
	boolean H;
	float K;
	int random;
	int round;
	int width;
	int x;
	int y;
	int L;
	int M;
	int N;
	int O;
	Rectangle P[];
	int Q;
	int R;
	int T;
	int U[];
	int V[];
	float W[];
}
