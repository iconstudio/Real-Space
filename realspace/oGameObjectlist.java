package realspace;
// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.

// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   star_y

final class oGameObjectlist {

	oGameObjectlist(gameapp gameapp, int i) {
		F = gameapp;
		Z = new oGameObject[i];
		I = i;
		C = 0;
	}

	final oGameObject I(oGameObjectlist oGameObjectlist1) {
		if (C <= 0 || oGameObjectlist1.C >= oGameObjectlist1.I)
			return null;
		C--;
		oGameObject oGameObject1 = Z[C];
		oGameObject1.v = false;
		oGameObject1.e = 2;
		oGameObject1.FI = this;
		Z[C] = null;
		if (oGameObjectlist1.C < oGameObjectlist1.I) {
			oGameObjectlist1.Z[oGameObjectlist1.C] = oGameObject1;
			oGameObjectlist1.C++;
		}
		return oGameObject1;
	}

	final void F(oGameObject oGameObject1) {
		oGameObject1.e = 2;
		if (oGameObject1.g != null)
			oGameObject1.g = null;
		if (oGameObject1.Q != null)
			oGameObject1.Q = null;
		if (oGameObject1.k != null)
			oGameObject1.k.I();
		for (int i = 0; i < C; i++)
			if (oGameObject1 == Z[i]) {
				if (oGameObject1.FI != null) {
					oGameObjectlist oGameObjectlist1 = oGameObject1.FI;
					if (oGameObjectlist1.C < oGameObjectlist1.I) {
						oGameObjectlist1.Z[oGameObjectlist1.C] = oGameObject1;
						oGameObjectlist1.C++;
					}
					oGameObject1.FI = null;
				}
				C--;
				for (int j = i; j < C; j++)
					Z[j] = Z[j + 1];

				Z[C] = null;
				return;
			}

	}

	final void I() {
		while (C > 0) {
			C--;
			oGameObject oGameObject1 = Z[C];
			if (oGameObject1.k != null)
				oGameObject1.k.I();
			if (oGameObject1.FI != null) {
				oGameObjectlist oGameObjectlist1 = oGameObject1.FI;
				if (oGameObjectlist1.C < oGameObjectlist1.I) {
					oGameObjectlist1.Z[oGameObjectlist1.C] = oGameObject1;
					oGameObjectlist1.C++;
				}
				oGameObject1.FI = null;
			}
			Z[C] = null;
		}
	}

	final boolean I(boolean flag, oGameObject oGameObject1, int i, int j, int k, int l) {
		if (C <= 0)
			return false;
		for (int i1 = 0; i1 < C; i1++) {
			oGameObject oGameObject2 = Z[i1];
			if (oGameObject2.e != 2 && (i == -1 || oGameObject2.JI == i) && (j == -1 || oGameObject2.ship_grade == j)
					&& (k == -1 || oGameObject2.AI == k) && (l == -1 || oGameObject2.HI == l))
				oGameObject2.equip(flag, oGameObject1);
		}

		return true;
	}

	final void Z() {
		for (int i = 0; i < C; i++) {
			oGameObject oGameObject1 = Z[i];
			if (oGameObject1.e == 1)
				oGameObject1.Z();
		}

	}

	final void I(surface surface) {
		for (int i = 0; i < C; i++) {
			oGameObject oGameObject1 = Z[i];
			if (oGameObject1.e == 1 && oGameObject1.v)
				oGameObject1.I(surface);
		}

	}

	final boolean Z(oGameObjectlist oGameObjectlist1) {
		for (int i = 0; i < C; i++) {
			oGameObject oGameObject1 = Z[i];
			if (oGameObject1.e == 1 && oGameObject1.v && oGameObject1.h && oGameObject1.BI >= 0.0001F) {
				if (oGameObject1.l && oGameObject1.k.Z(oGameObjectlist1))
					return true;
				for (int j = 0; j < oGameObjectlist1.C; j++) {
					oGameObject oGameObject2 = oGameObjectlist1.Z[j];
					if (oGameObject2.e == 1 && oGameObject2.v && oGameObject2.h && oGameObject2.BI >= 0.0001F) {
						if (oGameObject2.l && oGameObject2.k.HNSM(oGameObject1))
							return true;
						if (oGameObject1.Z(oGameObject2))
							return true;
					}
				}

			}
		}

		return false;
	}

	final boolean HNSM(oGameObject oGameObject1) {
		for (int i = 0; i < C; i++) {
			oGameObject oGameObject2 = Z[i];
			if (oGameObject2.e == 1 && oGameObject2.v && oGameObject2.h) {
				if (oGameObject2.l && oGameObject2.k.HNSM(oGameObject1))
					return true;
				if (oGameObject1.e == 1 && oGameObject1.v && oGameObject1.h) {
					if (oGameObject1.l && oGameObject1.k.HNSM(oGameObject2))
						return true;
					if (oGameObject2.Z(oGameObject1))
						return true;
				}
			}
		}

		return false;
	}

	final oGameObject I(int i, int j) {
		for (int k = 0; k < C; k++) {
			oGameObject oGameObject1 = Z[k];
			if (oGameObject1.e == 1 && oGameObject1.w && i < oGameObject1.G && i > oGameObject1.A && j < oGameObject1.H
					&& j > oGameObject1.E)
				return oGameObject1;
		}

		return null;
	}

	final void I(float f, float f1, boolean flag, int i, int j, int k, int l) {
		int i1 = C;
		for (int j1 = 0; j1 < i1; j1++) {
			oGameObject oGameObject1 = Z[j1];
			if ((oGameObject1.e == 1 || oGameObject1.e == 3) && (i == -1 || oGameObject1.JI == i)
					&& (j == -1 || oGameObject1.ship_grade == j) && (k == -1 || oGameObject1.AI == k)
					&& (l == -1 || oGameObject1.HI == l))
				oGameObject1.Z(f, f1, flag);
		}

	}

	final oGameObject I(int i, int j, int k, int l, int i1, float f) {
		int j1 = C;
		for (int k1 = 0; k1 < j1; k1++) {
			oGameObject oGameObject1 = Z[k1];
			if (i == -1 || oGameObject1.e == i && (j == -1 || oGameObject1.JI == j)
					&& (k == -1 || oGameObject1.ship_grade == k) && (l == -1 || oGameObject1.AI == l)
					&& (i1 == -1 || oGameObject1.HI == i1) && (f <= -1F || oGameObject1.BI >= f))
				return oGameObject1;
		}

		return null;
	}

	final void C() {
		for (int i = 0; i < C;) {
			oGameObject oGameObject1 = Z[i];
			if (oGameObject1.e == 2) {
				F(oGameObject1);
			} else {
				if (oGameObject1.Q != null && oGameObject1.Q.e != 1) {
					oGameObject1.Q = null;
					oGameObject1.P = false;
					if (oGameObject1.W * oGameObject1.W + oGameObject1.X * oGameObject1.X <= 0.02F) {
						oGameObject1.W = 0.0F;
						oGameObject1.X = -0.2F;
					}
				}
				i++;
			}
		}

	}

	final void I(float f, int i, int j, int k, int l) {
		int i1 = C;
		for (int j1 = 0; j1 < i1; j1++) {
			oGameObject oGameObject1 = Z[j1];
			if (oGameObject1.e == 1 && (i == -1 || oGameObject1.JI == i) && (j == -1 || oGameObject1.ship_grade == j)
					&& (k == -1 || oGameObject1.AI == k) && (l == -1 || oGameObject1.HI == l))
				oGameObject1.BI = f;
		}

	}

	gameapp F;
	int I;
	oGameObject Z[];
	int C;
}
