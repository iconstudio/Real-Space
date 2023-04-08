package realspace;
// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.

// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   star_y

final class GameObjectPool {

	GameObjectPool(GameApp gameapp, int i) {
		F = gameapp;
		internalList = new GameObject[i];
		I = i;
		mySize = 0;
	}

	final GameObject I(GameObjectPool oGameObjectlist1) {
		if (mySize <= 0 || oGameObjectlist1.mySize >= oGameObjectlist1.I)
			return null;
		mySize--;
		GameObject oGameObject1 = internalList[mySize];
		oGameObject1.v = false;
		oGameObject1.e = 2;
		oGameObject1.FI = this;
		internalList[mySize] = null;
		if (oGameObjectlist1.mySize < oGameObjectlist1.I) {
			oGameObjectlist1.internalList[oGameObjectlist1.mySize] = oGameObject1;
			oGameObjectlist1.mySize++;
		}
		return oGameObject1;
	}

	final void F(GameObject oGameObject1) {
		oGameObject1.e = 2;
		if (oGameObject1.g != null)
			oGameObject1.g = null;
		if (oGameObject1.Q != null)
			oGameObject1.Q = null;
		if (oGameObject1.k != null)
			oGameObject1.k.I();
		for (int i = 0; i < mySize; i++)
			if (oGameObject1 == internalList[i]) {
				if (oGameObject1.FI != null) {
					GameObjectPool oGameObjectlist1 = oGameObject1.FI;
					if (oGameObjectlist1.mySize < oGameObjectlist1.I) {
						oGameObjectlist1.internalList[oGameObjectlist1.mySize] = oGameObject1;
						oGameObjectlist1.mySize++;
					}
					oGameObject1.FI = null;
				}
				mySize--;
				for (int j = i; j < mySize; j++)
					internalList[j] = internalList[j + 1];

				internalList[mySize] = null;
				return;
			}

	}

	final void I() {
		while (mySize > 0) {
			mySize--;
			GameObject oGameObject1 = internalList[mySize];
			if (oGameObject1.k != null)
				oGameObject1.k.I();
			if (oGameObject1.FI != null) {
				GameObjectPool oGameObjectlist1 = oGameObject1.FI;
				if (oGameObjectlist1.mySize < oGameObjectlist1.I) {
					oGameObjectlist1.internalList[oGameObjectlist1.mySize] = oGameObject1;
					oGameObjectlist1.mySize++;
				}
				oGameObject1.FI = null;
			}
			internalList[mySize] = null;
		}
	}

	final boolean I(boolean flag, GameObject oGameObject1, int i, int j, int k, int l) {
		if (mySize <= 0)
			return false;
		for (int i1 = 0; i1 < mySize; i1++) {
			GameObject oGameObject2 = internalList[i1];
			if (oGameObject2.e != 2 && (i == -1 || oGameObject2.JI == i) && (j == -1 || oGameObject2.ship_grade == j)
					&& (k == -1 || oGameObject2.AI == k) && (l == -1 || oGameObject2.HI == l))
				oGameObject2.Equip(flag, oGameObject1);
		}

		return true;
	}

	final void Z() {
		for (int i = 0; i < mySize; i++) {
			GameObject oGameObject1 = internalList[i];
			if (oGameObject1.e == 1)
				oGameObject1.Z();
		}

	}

	final void I(Canvas surface) {
		for (int i = 0; i < mySize; i++) {
			GameObject oGameObject1 = internalList[i];
			if (oGameObject1.e == 1 && oGameObject1.v)
				oGameObject1.Draw(surface);
		}

	}

	final boolean Z(GameObjectPool oGameObjectlist1) {
		for (int i = 0; i < mySize; i++) {
			GameObject oGameObject1 = internalList[i];
			if (oGameObject1.e == 1 && oGameObject1.v && oGameObject1.h && oGameObject1.BI >= 0.0001F) {
				if (oGameObject1.l && oGameObject1.k.Z(oGameObjectlist1))
					return true;
				for (int j = 0; j < oGameObjectlist1.mySize; j++) {
					GameObject oGameObject2 = oGameObjectlist1.internalList[j];
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

	final boolean HNSM(GameObject oGameObject1) {
		for (int i = 0; i < mySize; i++) {
			GameObject oGameObject2 = internalList[i];
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

	final GameObject I(int i, int j) {
		for (int k = 0; k < mySize; k++) {
			GameObject oGameObject1 = internalList[k];
			if (oGameObject1.e == 1 && oGameObject1.w && i < oGameObject1.G && i > oGameObject1.A && j < oGameObject1.H
					&& j > oGameObject1.E)
				return oGameObject1;
		}

		return null;
	}

	final void I(float f, float f1, boolean flag, int i, int j, int k, int l) {
		int i1 = mySize;
		for (int j1 = 0; j1 < i1; j1++) {
			GameObject oGameObject1 = internalList[j1];
			if ((oGameObject1.e == 1 || oGameObject1.e == 3) && (i == -1 || oGameObject1.JI == i)
					&& (j == -1 || oGameObject1.ship_grade == j) && (k == -1 || oGameObject1.AI == k)
					&& (l == -1 || oGameObject1.HI == l))
				oGameObject1.Z(f, f1, flag);
		}

	}

	final GameObject I(int i, int j, int k, int l, int i1, float f) {
		int j1 = mySize;
		for (int k1 = 0; k1 < j1; k1++) {
			GameObject oGameObject1 = internalList[k1];
			if (i == -1 || oGameObject1.e == i && (j == -1 || oGameObject1.JI == j)
					&& (k == -1 || oGameObject1.ship_grade == k) && (l == -1 || oGameObject1.AI == l)
					&& (i1 == -1 || oGameObject1.HI == i1) && (f <= -1F || oGameObject1.BI >= f))
				return oGameObject1;
		}

		return null;
	}

	final void C() {
		for (int i = 0; i < mySize;) {
			GameObject oGameObject1 = internalList[i];
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
		int i1 = mySize;
		for (int j1 = 0; j1 < i1; j1++) {
			GameObject oGameObject1 = internalList[j1];
			if (oGameObject1.e == 1 && (i == -1 || oGameObject1.JI == i) && (j == -1 || oGameObject1.ship_grade == j)
					&& (k == -1 || oGameObject1.AI == k) && (l == -1 || oGameObject1.HI == l))
				oGameObject1.BI = f;
		}

	}

	public int GetSize()
	{
		return mySize;
	}

	GameApp F;
	int I;
	GameObject internalList[];
	int mySize;
}
