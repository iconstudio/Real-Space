package realspace;
// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.

// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   star_y

class GameObject {
	float J;
	float S;
	int A;
	int E;
	int G;
	int H;
	float K;
	float L;
	float M;
	float N;
	float O;
	boolean P;
	GameObject Q;
	float R;
	float T;
	float U;
	float V;
	float W;
	float X;
	float Y;
	float i;
	boolean atan;
	float z;
	float c;
	boolean cos;
	int b;
	int d;
	boolean f;
	int j;
	int round;
	int s;
	int a;
	int e;
	GameObject g;
	boolean h;
	oGameObjectlist k;
	boolean l;
	int m;
	int n;
	int o;
	int sin;
	int p;
	int q;
	boolean r;
	int sqrt;
	int t;
	boolean u;
	boolean v;
	boolean w;
	sprite_group x;
	sprite y;
	boolean II;
	String ZI;
	boolean CI;
	float BI;
	int DI;
	oGameObjectlist FI;
	int JI;
	int ship_grade;
	int AI;
	int EI;
	int ascore;
	int HI;

	public GameObject(GameApp gameapp1) {
		GameApp.Instance = gameapp1;
		k = null;
		FI = null;
		e = 2;
	}

	protected final void initialize(sprite_group spr, int i1, int j1, int k1, int l1, boolean flag) {
		initialize(spr, i1, j1, k1, l1, flag, null, true);
	}

	protected final void initialize(sprite_group spr, int i1, int j1, int k1, int l1, boolean flag,
			GameObject oGameObject1, boolean flag1) {
		x = spr;
		m = j1;
		o = k1;
		n = l1;
		sin = j1;
		q = k1;
		p = l1;
		r = flag;
		sqrt = 0;
		t = 0;
		u = false;
		s = 0;
		b = 0;
		d = 0;
		round = 0;
		f = false;
		y = null;
		e = 1;
		w = true;
		v = false;
		Q = null;
		U = 0.0F;
		V = 0.0F;
		P = false;
		i = 0.0F;
		z = 0.0F;
		c = 0.0F;
		K = 0.0F;
		L = 0.0F;
		DI = 1;
		EI = 3;
		ascore = 0;
		BI = 0.0F;
		JI = i1;
		ship_grade = 0;
		AI = 0;
		A = 0;
		G = 0;
		E = 0;
		H = 0;
		Y = 0.0F;
		atan = false;
		CI = false;
		II = false;
		ZI = "";
		HI = -1;
		g = oGameObject1;
		h = flag1;
		if (k != null)
			k.I();
		l = false;
		if (g != null && flag1)
			g.l = true;
	}

	void Draw(surface surface1) {
		if (y != null && w) {
			if (t > 0) {
				if (n <= 0)
					surface1.Z((int) J + ((AppletImplements) (GameApp.Instance)).WC, (int) S + ((AppletImplements) (GameApp.Instance)).XC,
							(y.D + 10) - sqrt * 3, (y.F + 10) - sqrt * 3, ((AppletImplements) (GameApp.Instance)).MB.I(sqrt, t));
				else
					surface1.Z((int) J + ((AppletImplements) (GameApp.Instance)).WC, (int) S + ((AppletImplements) (GameApp.Instance)).XC, y.D + 10, y.F + 10,
							((AppletImplements) (GameApp.Instance)).LB.I(sqrt, t));
				sqrt++;
				if (sqrt >= t)
					t = 0;
			}

			surface1.I(y, A + ((AppletImplements) (GameApp.Instance)).WC, E + ((AppletImplements) (GameApp.Instance)).XC, GameApp.Instance);

			if (u) {
				int i1 = (Math.round(J) - 15) + ((AppletImplements) (GameApp.Instance)).WC;
				int j1 = Math.round(S) + y.F + 5 + ((AppletImplements) (GameApp.Instance)).XC;
				float f1 = (float) (o + n) / (float) (p + q);

				gameutil.I(surface1, i1, j1, 30, 10, f1, Colours.Red, Colours.Green);
			}
		}
		
		if (k != null)
		{
			k.I(surface1);
		}
	}

	final void Z() {
		if (s < 0)
			s++;
		else if (j == 0) {
			I();
			v = true;
		} else {
			round--;
			if (round <= 0) {
				I();
				v = true;
				round = j;
			}
		}
		if (k != null)
			k.Z();
	}

	void I() {
		switch (DI) {
			case 5: // '\005'
				S();
				s++;
				return;

			case 8: // '\b'
				D();
				return;

			case 6: // '\006'
				B();
				s++;
				return;

			case 3: // '\003'
				C();
				s++;
				return;

			case 4: // '\004'
				HNSM();
				s++;
				return;

			case 2: // '\002'
				F();
				if (f)
					b++;
				s++;
				return;

			case 7: // '\007'
			default:
				F();
				break;
		}
		if (f)
			b++;
		s++;
	}

	final void C() {
		J += K;
		S += L;
		if (f)
			b++;
		F();
	}

	final void HNSM() {
		float f1 = K * O;
		float f2 = L * O;
		K = K - f1;
		L = L - f2;
		J += K;
		S += L;
		F();
		if (f)
			b++;
	}

	final void S() {
		K += W;
		L += X;
		J += K;
		S += L;
		if (f)
			b++;
		F();
	}

	final void B() {
		if (P) {
			if (Q != null && Q.e == 1 && Q.v) {
				R = Q.J;
				T = Q.S;
			}
			if (P) {
				float f1 = (R + U) - J;
				float f2 = (T + V) - S;
				float f3 = (float) Math.sqrt(f1 * f1 + f2 * f2);
				float f4 = K * K + L * L;
				if (cos) {
					if (f3 < 1.0F) {
						W = 0.0F;
						X = 0.0F;
						K = 0.0F;
						L = 0.0F;
					} else {
						W = (f1 / f3) * N;
						X = (f2 / f3) * N;
						if (f3 < M) {
							K = K * (f3 / M);
							L = L * (f3 / M);
						}
					}
				} else if (f3 < 1.0F && f4 < 0.04F) {
					K = (float) Math.random() * 2.0F - 1.0F;
					L = (float) Math.random() * 2.0F - 1.0F;
					W = 0.0F;
					X = 0.0F;
				} else if (f3 < 0.001F) {
					W = 0.0F;
					X = 0.0F;
				} else {
					W = (f1 / f3) * N;
					X = (f2 / f3) * N;
				}
			}
		}
		K = (K - K * O) + W;
		L = (L - L * O) + X;
		J += K;
		S += L;
		if (f)
			b++;
		F();
	}

	final void D() {
		if (P) {
			if (Q != null && Q.e == 1 && Q.v) {
				R = Q.J;
				T = Q.S;
			}
			if (P) {
				float f1 = (R + U) - J;
				float f2 = (T + V) - S;
				if (f1 == 0.0F) {
					if (f2 >= 0.0F)
						i = 1.570796F;
					else
						i = 4.712389F;
				} else {
					float f3 = f2 / f1;
					i = (float) Math.atan(f3);
					if (f1 >= 0.0F) {
						if (f2 < 0.0F)
							i = 6.283185F + i;
					} else {
						i = 3.141593F + i;
					}
				}
				float f4 = i - Y;
				if (f4 < -3.141593F)
					f4 += 6.283185F;
				else if (f4 > 3.141593F)
					f4 -= 6.283185F;
				if (f4 < -z)
					Y -= z;
				else if (f4 > z)
					Y += z;
				else
					Y += f4;
				if (Y < 0.0F)
					Y += 6.283185F;
				else if (Y >= 6.283185F)
					Y -= 6.283185F;
				d = x.I(Y);
				W = (float) Math.cos(Y) * N;
				X = (float) Math.sin(Y) * N;
			}
		}
		if (f)
			b++;
		y = x.I(d, b);
		K = (K - K * O) + W;
		L = (L - L * O) + X;
		J += K;
		S += L;
		F();
		s++;
	}

	final void I(GameObject oGameObject1) {
		if (oGameObject1 != null && oGameObject1.e == 1) {
			float f1 = oGameObject1.J - J;
			float f3 = oGameObject1.S - S;
			if (f1 == 0.0F) {
				if (f3 >= 0.0F)
					i = 1.570796F;
				else
					i = 4.712389F;
			} else {
				float f4 = f3 / f1;
				i = (float) Math.atan(f4);
				if (f1 >= 0.0F) {
					if (f3 < 0.0F)
						i = 6.283185F + i;
				} else {
					i = 3.141593F + i;
				}
			}
		}
		float f2 = i - Y;
		if (f2 < -3.1415926535897931D)
			f2 += 6.283185F;
		else if (f2 > 3.1415926535897931D)
			f2 -= 6.283185F;
		if (f2 < -z)
			Y -= z;
		else if (f2 > z)
			Y += z;
		else
			Y = i;
		if (Y < 0.0F) {
			for (; Y < 0.0F; Y += 6.283185F)
				;
			return;
		}
		if (Y >= 6.283185F)
			for (; Y >= 6.283185F; Y -= 6.283185F)
				;
	}

	final void F() {
		if (y != null) {
			A = ((int) (J + 0.5F) - y.D) + y.E;
			E = ((int) (S + 0.5F) - y.F) + y.G;
			G = A + y.C;
			H = E + y.B;
		}
	}

	final void I(float f1, float f2, boolean flag) {
		J = f1;
		S = f2;
		K = 0.0F;
		L = 0.0F;
		W = 0.0F;
		X = 0.0F;
		P = false;
		f = flag;
		DI = 2;
	}

	final void I(float f1, float f2, float f3, float f4, float f5, float f6, boolean flag) {
		J = f1;
		S = f2;
		K = f3;
		L = f4;
		W = f5;
		X = f6;
		P = false;
		f = flag;
		DI = 5;
	}

	final void I(float f1, float f2, float f3, float f4, boolean flag) {
		J = f1;
		S = f2;
		K = f3;
		L = f4;
		W = 0.0F;
		X = 0.0F;
		P = false;
		f = flag;
		DI = 3;
	}

	final void Z(float f1, float f2, float f3, float f4, float f5, float f6, boolean flag) {
		J = f1;
		S = f2;
		K = f3;
		L = f4;
		M = f5;
		N = f5 * 0.08F;
		O = f6;
		W = 0.0F;
		X = 0.0F;
		f = flag;
		DI = 4;
	}

	final void I(float f1, float f2, float f3, float f4, float f5, boolean flag) {
		J = f1;
		S = f2;
		float f6 = f3 - f1;
		float f7 = f4 - f2;
		float f8 = (float) Math.sqrt(f6 * f6 + f7 * f7);
		if (f8 != 0.0F) {
			K = (f6 / f8) * f5;
			L = (f7 / f8) * f5;
		} else {
			K = 1.0F;
			L = 0.0F;
		}
		P = false;
		W = 0.0F;
		X = 0.0F;
		f = flag;
		DI = 3;
	}

	final void I(float f1, float f2, GameObject oGameObject1, float f3, float f4, float f5, float f6, boolean flag,
			boolean flag1) {
		J = f1;
		S = f2;
		if (oGameObject1 != null) {
			f3 = oGameObject1.J;
			f4 = oGameObject1.S;
		}
		U = 0.0F;
		V = 0.0F;
		P = true;
		cos = flag;
		Q = oGameObject1;
		R = f3;
		T = f4;
		float f7 = f3 - f1;
		float f8 = f4 - f2;
		float f9 = (float) Math.sqrt(f7 * f7 + f8 * f8);
		if (f9 == 0.0F) {
			K = 0.0F;
			L = f5;
		} else {
			K = (f7 / f9) * f5;
			L = (f8 / f9) * f5;
		}
		W = K;
		X = L;
		M = f5;
		N = f5 * f6;
		O = f6;
		f = flag1;
		DI = 6;
	}

	final void I(float f1, float f2, GameObject oGameObject1, float f3, float f4, float f5, float f6, float f7,
			boolean flag) {
		J = f1;
		S = f2;
		if (oGameObject1 != null) {
			f3 = oGameObject1.J;
			f4 = oGameObject1.S;
		}
		U = 0.0F;
		V = 0.0F;
		if (!atan) {
			atan = true;
			float f8 = f3 - J;
			float f9 = f4 - S;
			if (f8 == 0.0F) {
				if (f9 >= 0.0F)
					Y = 1.570796F;
				else
					Y = 4.712389F;
			} else {
				float f10 = f9 / f8;
				Y = (float) Math.atan(f10);
				if (f8 >= 0.0F) {
					if (f9 < 0.0F)
						Y = 6.283185F + Y;
				} else {
					Y = 3.141593F + Y;
				}
			}
		}
		K = (float) Math.cos(Y) * f5;
		L = (float) Math.sin(Y) * f5;
		W = K;
		X = L;
		M = f5;
		N = f5 * f7;
		O = f7;
		P = true;
		Q = oGameObject1;
		R = f3;
		T = f4;
		z = x.S * f6;
		c = f6;
		W = (float) Math.cos(Y) * f5;
		X = (float) Math.sin(Y) * f5;
		b = 0;
		d = x.I(Y);
		y = x.I(d, b);
		f = flag;
		DI = 8;
	}

	void equip(boolean flag, GameObject oGameObject1) {
		e = 2;
		if (EI == 2 && !flag && ascore > 0)
			GameApp.Instance.Z(ascore);
		if (k != null) {
			oGameObjectlist oGameObjectlist1 = k;
			oGameObjectlist1.I(flag, oGameObject1, -1, -1, -1, -1);
		}
		if (II) {
			gameobjectivelist gameobjectivelist1;
			if (EI == 2)
				gameobjectivelist1 = GameApp.Instance.Mission.C;
			else
				gameobjectivelist1 = GameApp.Instance.Mission.I;
			if (flag)
				gameobjectivelist1.E++;
			else
				gameobjectivelist1.S++;
			if (gameobjectivelist1.F != -1) {
				int i1 = 0;
				int j1 = 0;
				if (gameobjectivelist1.J != -1) {
					j1 += gameobjectivelist1.S;
					i1 += gameobjectivelist1.J;
				}
				if (gameobjectivelist1.A != -1) {
					j1 += gameobjectivelist1.E;
					i1 += gameobjectivelist1.A;
				}
				if (j1 >= i1) {
					GameApp.Instance.Mission.B = ZI;
					GameApp.Instance.Mission.I(gameobjectivelist1.F);
				}
			}
		}
	}

	boolean Z(GameObject oGameObject1) {
		if (A < oGameObject1.G && G > oGameObject1.A && E < oGameObject1.H && H > oGameObject1.E
				&& atan(oGameObject1)) {
			int i1 = oGameObject1.m + oGameObject1.n;
			int j1 = m + n;
			I(i1, oGameObject1);
			oGameObject1.I(j1, this);
			return true;
		} else {
			return false;
		}
	}

	final boolean atan(GameObject oGameObject1) {
		if (y == null || oGameObject1.y == null)
			return false;
		sprite sprite1 = y;
		sprite sprite2 = oGameObject1.y;
		int i1 = sprite1.Z;
		int j1 = sprite2.Z;
		rlepart rlepart1 = sprite1.I[0];
		rlepart rlepart2 = sprite2.I[0];
		int k1 = E + rlepart1.Z;
		int l1 = oGameObject1.E + rlepart2.Z;
		int i2 = 0;
		for (int j2 = 0; i2 < i1 && j2 < j1;)
			if (k1 == l1) {
				int k2 = A + rlepart1.I;
				int l2 = k2 + rlepart1.C;
				int i3 = oGameObject1.A + rlepart2.I;
				int j3 = i3 + rlepart2.C;
				if (k2 < j3 && l2 > i3)
					return true;
				if (k2 < i3) {
					if (++i2 < i1) {
						rlepart1 = sprite1.I[i2];
						k1 = E + rlepart1.Z;
					}
				} else if (++j2 < j1) {
					rlepart2 = sprite2.I[j2];
					l1 = oGameObject1.E + rlepart2.Z;
				}
			} else if (k1 < l1) {
				if (++i2 < i1) {
					rlepart1 = sprite1.I[i2];
					k1 = E + rlepart1.Z;
				}
			} else if (++j2 < j1) {
				rlepart2 = sprite2.I[j2];
				l1 = oGameObject1.E + rlepart2.Z;
			}

		return false;
	}

	void I(int i1, GameObject oGameObject1) {
		if (e != 1)
			return;
		int j1 = 0;
		int k1 = 0;
		if (n > 0)
			if (i1 > n) {
				j1 = n;
				if (!r)
					n = 0;
				i1 -= n;
			} else {
				j1 = i1;
				if (!r)
					n -= i1;
				i1 = 0;
			}
		if (o > 0)
			if (i1 > o) {
				k1 = o;
				if (!r)
					o = 0;
			} else {
				k1 = i1;
				if (!r)
					o -= i1;
			}
		if (o <= 0) {
			equip(false, oGameObject1);
			return;
		}
		if (k1 > 0 || j1 > 0)
			I(oGameObject1, k1, j1);
	}

	void I(GameObject oGameObject1, int i1, int j1) {
		if (j1 > 0 && p > 0) {
			sqrt = 0;
			t = 5 + (j1 / p) * 8;
		}
	}

	final void Z(float f1, float f2, boolean flag) {
		if (flag) {
			m = (int) (sin * f1);
			n = (int) (p * f2);
			o = (int) (q * f1);
		} else {
			m += (int) (sin * f1);
			n += (int) (p * f2);
			o += (int) (q * f1);
			if (m > sin)
				m = sin;
			if (n > p)
				n = p;
			if (o > q)
				o = q;
		}
		I(((GameObject) (null)), 0, 0);
	}

	final void I(int i1) {
		e = i1;
	}

	final void I(String s1) {
		II = true;
		ZI = s1;
	}
}
