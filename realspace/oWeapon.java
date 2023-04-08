package realspace;
// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.

// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   star_y

final class oWeapon extends GameObject {
	oWeapon(GameApp applet) {
		super(applet);
	}

	final void I(oSpaceship oSpaceship1, boolean flag, float f, float f1, float f2, float f3, float f4, float f5,
			boolean flag1, sprite_group sprite_group1, int i, int j, int k, int l, boolean flag2) {
		super.Awake(sprite_group1, 9, j, k, l, flag2, oSpaceship1, flag);
		super.g = oSpaceship1;
		super.ship_grade = 0;
		super.AI = 0;
		super.EI = super.g.EI;
		super.ascore = i;
		I = f;
		Z = f1;
		C = f2;
		B = f3;
		D = f4;
		F = flag1;
		super.Y = super.g.Y;
		HNSM = true;
		super.x = sprite_group1;
		NI = 0;
		zI = f5;
		super.BI = 1.0F;
		if (super.x != null && flag1) {
			super.d = super.x.I(super.Y);
			super.z = 0.1963495F;
		}
	}

	final void I(sprite_group sprite_group1, sprite_group sprite_group2, int i, int j, int k, boolean flag, int l,
			int i1, float f, float f1, int j1) {
		VI = sprite_group1;
		WI = sprite_group2;
		XI = i;
		random = j;
		LI = k;
		abs = 40 + (int) (Math.random() * LI) + random;
		MI = flag;
		PI = l;
		QI = i1;
		UI = f;
		RI = f1;
		TI = j1;
		OI = 1;
	}

	final void I(int i, int j, float f, int k, int l) {
		abs = 25 + (i + j) / 10;
		random = i;
		LI = j;
		RI = f;
		VI = null;
		WI = null;
		XI = -1;
		MI = true;
		YI = k;
		iI = l;
		OI = 2;
	}

	@Override
	final void I() {
		if (super.x != null)
			if (F) {
				if (super.Q != null) {
					I(super.Q);
					HNSM = false;
				} else {
					float f = super.g.K * super.g.K + super.g.L * super.g.L;
					if (HNSM) {
						if (f < 2.5F && Math.random() * 80D > 79D) {
							super.i = (float) Math.random() * 6.283185F;
							HNSM = false;
							I();
						} else {
							super.i = super.g.Y;
							super.Y = super.g.Y;
						}
					} else {
						if (f > 2.5F)
							super.i = super.g.Y;
						else if (Math.random() * 80D > 79D)
							super.i = (float) Math.random() * 6.283185F;
						I();
						float f2 = Math.abs(super.Y - super.g.Y);
						if (f2 < 0.001F)
							HNSM = true;
					}
				}
				super.d = super.x.I(super.Y);
				super.y = super.x.I(super.d, super.b);
				float f1 = ((float) super.g.d / (float) super.g.x.Z) * 6.283185F;
				float f3 = (float) Math.cos(f1);
				float f4 = (float) Math.sin(f1);
				super.J = super.g.J + Math.round(I * f3 - Z * f4);
				super.S = super.g.S + Math.round(I * f4 + Z * f3);
				F();
			} else {
				super.y = super.x.I(super.d, super.b);
				super.J = super.g.J + I;
				super.S = super.g.S + Z;
				F();
			}
		if (MI && GameApp.Instance.OC)
			if (OI == 2) {
				abs--;
				if (abs <= 0) {
					if (((oSpaceship) super.g).D > 0)
						abs();
					abs = (int) (Math.random() * LI) + random;
					return;
				}
			} else {
				abs--;
				if (abs <= 0) {
					J();
					abs = (int) (Math.random() * LI) + random;
				}
			}
	}

	@Override
	final void Draw(Canvas surface) {
		if (super.g.s >= 0)
			super.Draw(surface);
	}

	final void J() {
		oWeaponfire oWeaponfire1 = null;
		oSpaceship oSpaceship1 = (oSpaceship) super.g;
		NI++;
		if (MI) {
			GameObject oGameObject1 = oSpaceship1.A();
			if (oGameObject1 != null) {
				if (((GameObject) (oSpaceship1)).EI == 2)
					oWeaponfire1 = (oWeaponfire) GameApp.Instance.CC.I(GameApp.Instance.yZ);
				else if (((GameObject) (oSpaceship1)).EI == 1)
					oWeaponfire1 = (oWeaponfire) GameApp.Instance.CC.I(GameApp.Instance.IC);
				if (oWeaponfire1 != null) {
					oSpaceship1.I = oGameObject1;
					super.Q = oGameObject1;
					if (PI == 4) {
						oWeaponfire1.I(VI, WI, this, null, PI, super.EI, QI, TI, UI);
						oWeaponfire1.Q = oGameObject1;
					} else {
						oWeaponfire1.I(VI, WI, this, oGameObject1, PI, super.EI, QI, TI, UI);
					}
					oWeaponfire1.g = oSpaceship1;
					if (XI != -1) {
						GameApp.Instance.NZ.I(XI, true, false);
						return;
					}
				}
			}
		} else {
			sprite_group sprite_group2 = null;
			sprite_group sprite_group1;
			float f;
			byte byte0;
			byte byte1;
			int i;
			if (GameApp.Instance.hZ == 2) {
				sprite_group1 = GameApp.Instance.VI;
				f = UI * 1.5F;
				byte1 = 30;
				byte0 = 75;
				i = GameApp.Instance.QZ;
				GameApp.Instance.kZ--;
				if (GameApp.Instance.kZ == 0)
					GameApp.Instance.hZ = 1;
			} else if (GameApp.Instance.hZ == 3) {
				sprite_group1 = GameApp.Instance.UI;
				f = UI * 1.5F;
				byte1 = 30;
				byte0 = 100;
				i = GameApp.Instance.QZ;
				GameApp.Instance.lZ--;
				if (GameApp.Instance.lZ == 0)
					GameApp.Instance.hZ = 1;
			} else if (GameApp.Instance.hZ == 4) {
				sprite_group1 = GameApp.Instance.TI;
				sprite_group2 = GameApp.Instance.Q;
				f = UI * 1.5F;
				byte1 = 30;
				byte0 = 125;
				i = GameApp.Instance.RZ;
				GameApp.Instance.mZ--;
				if (GameApp.Instance.mZ == 0)
					GameApp.Instance.hZ = 1;
			} else {
				sprite_group1 = GameApp.Instance.MI;
				f = UI;
				byte1 = 30;
				byte0 = 50;
				i = GameApp.Instance.QZ;
			}
			int j = sprite_group1.I(0, 0).C;
			float f1 = (float) Math.cos(((GameObject) (oSpaceship1)).Y);
			float f2 = (float) Math.sin(((GameObject) (oSpaceship1)).Y);
			float f3 = f1 * UI + ((GameObject) (oSpaceship1)).K;
			float f4 = f2 * UI + ((GameObject) (oSpaceship1)).L;
			for (int k = 0; k <= GameApp.Instance.eZ; k++) {
				oWeaponfire oWeaponfire2 = (oWeaponfire) GameApp.Instance.CC.I(GameApp.Instance.ZC);
				if (oWeaponfire2 != null) {
					oWeaponfire2.I(sprite_group1, sprite_group2, this, null, PI, super.EI, byte0, byte1, f);
					oWeaponfire2.I(((GameObject) (oWeaponfire2)).J + f1 * j * k,
							((GameObject) (oWeaponfire2)).S + f2 * j * k, f3, f4, true);
					if (XI != -1)
						GameApp.Instance.NZ.I(i, true, false);
					oWeaponfire2.d = sprite_group1.I(((GameObject) (oSpaceship1)).Y);
				}
			}

		}
	}

	final void abs() {
		oSpaceship oSpaceship1 = (oSpaceship) super.g;
		oSpaceship1.I(RI);
		if (oSpaceship1.WI != null) {
			float f4 = (float) Math.cos(((GameObject) (oSpaceship1)).Y);
			float f5 = (float) Math.sin(((GameObject) (oSpaceship1)).Y);
			float f = (((GameObject) (oSpaceship1)).J + ((GameObject) (oSpaceship1)).y.E + I * f4) - Z * f5;
			float f1 = ((GameObject) (oSpaceship1)).S + ((GameObject) (oSpaceship1)).y.G + I * f5 + Z * f4;
			f4 = (float) Math.cos(((GameObject) (oSpaceship1)).Y + zI);
			f5 = (float) Math.sin(((GameObject) (oSpaceship1)).Y + zI);
			float f2 = f + f4 * 50F;
			float f3 = f1 + f5 * 50F;
			for (int i = 0; i < YI && oSpaceship1.D > 0; i++) {
				oSpaceship oSpaceship2;
				if (((GameObject) (oSpaceship1)).EI == 2)
					oSpaceship2 = (oSpaceship) GameApp.Instance.xZ.I(GameApp.Instance.wZ);
				else
					oSpaceship2 = (oSpaceship) GameApp.Instance.xZ.I(GameApp.Instance.vZ);
				if (oSpaceship2 != null) {
					oSpaceship2.I(iI, ((GameObject) (oSpaceship1)).EI, GameApp.Instance.currentMission.I(1.0F, 0.2F));
					oSpaceship2.QI = 3;
					oSpaceship2.I(f, f1, null, f2, f3, ((GameObject) (oSpaceship1)).M * 1.5F, 1.0F,
							((GameObject) (oSpaceship1)).O, true);
					oSpaceship2.Q = oSpaceship1.WI;
					oSpaceship2.s = -i * 8;
					oSpaceship2.g = oSpaceship1;
					oSpaceship1.D--;
				}
			}

		}
	}

	@Override
	final void Equip(boolean flag, GameObject oGameObject1) {
		if (oGameObject1 != null && oGameObject1.JI == 8)
			super.ascore = 0;
		super.Equip(flag, oGameObject1);
		if (!flag && super.h) {
			sprite_group sprite_group1 = GameApp.Instance.D;
			Palette palette = GameApp.Instance.DZ;
			GameApp.Instance.NZ.I(GameApp.Instance.TZ, true, false);
			Explosion explosion1 = (Explosion) GameApp.Instance.rZ.I(GameApp.Instance.oZ);
			if (explosion1 != null) {
				explosion1.I(sprite_group1, 3, super.J, super.S, super.K, super.L, 1, 2, super.m + super.n, false);
				if (palette != null)
					explosion1.F = palette;
			}
			for (int i = 0; i < 2; i++) {
				sprite_group sprite_group2;
				if (super.g.AI >= 200 && super.g.AI < 300) {
					float f = (float) Math.random();
					if (f > 0.75D)
						sprite_group2 = GameApp.Instance.G;
					else if (f > 0.5D)
						sprite_group2 = GameApp.Instance.H;
					else if (f > 0.25D)
						sprite_group2 = GameApp.Instance.K;
					else
						sprite_group2 = GameApp.Instance.L;
				} else {
					float f1 = (float) Math.random();
					if (f1 > 0.75D)
						sprite_group2 = GameApp.Instance.M;
					else if (f1 > 0.5D)
						sprite_group2 = GameApp.Instance.N;
					else if (f1 > 0.25D)
						sprite_group2 = GameApp.Instance.O;
					else
						sprite_group2 = GameApp.Instance.P;
				}
				explosionbit explosionbit1 = (explosionbit) GameApp.Instance.uZ.I(GameApp.Instance.tZ);
				if (explosionbit1 != null)
					explosionbit1.I(sprite_group2, GameApp.Instance.J, this, super.m + super.n);
			}

		}
	}

	float I;
	float Z;
	float C;
	float B;
	float D;
	boolean F;
	boolean HNSM;
	int abs;
	int random;
	int LI;
	boolean MI;
	int NI;
	int OI;
	int PI;
	int QI;
	float RI;
	int TI;
	float UI;
	sprite_group VI;
	sprite_group WI;
	int XI;
	int YI;
	int iI;
	float zI;
}
