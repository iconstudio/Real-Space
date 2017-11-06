package realspace;
// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.

// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   star_y

final class oWeapon extends oGameObject {
	oWeapon(gameapp gameapp1) {
		super(gameapp1);
	}

	final void I(oSpaceship oSpaceship1, boolean flag, float f, float f1, float f2, float f3, float f4, float f5,
			boolean flag1, sprite_group sprite_group1, int i, int j, int k, int l, boolean flag2) {
		super.initialize(sprite_group1, 9, j, k, l, flag2, oSpaceship1, flag);
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
		if (MI && super.owner.OC)
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
	final void I(surface surface) {
		if (super.g.s >= 0)
			super.I(surface);
	}

	final void J() {
		oWeaponfire oWeaponfire1 = null;
		oSpaceship oSpaceship1 = (oSpaceship) super.g;
		NI++;
		if (MI) {
			oGameObject oGameObject1 = oSpaceship1.A();
			if (oGameObject1 != null) {
				if (((oGameObject) (oSpaceship1)).EI == 2)
					oWeaponfire1 = (oWeaponfire) super.owner.CC.I(super.owner.yZ);
				else if (((oGameObject) (oSpaceship1)).EI == 1)
					oWeaponfire1 = (oWeaponfire) super.owner.CC.I(super.owner.IC);
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
						super.owner.NZ.I(XI, true, false);
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
			if (super.owner.hZ == 2) {
				sprite_group1 = super.owner.VI;
				f = UI * 1.5F;
				byte1 = 30;
				byte0 = 75;
				i = super.owner.QZ;
				super.owner.kZ--;
				if (super.owner.kZ == 0)
					super.owner.hZ = 1;
			} else if (super.owner.hZ == 3) {
				sprite_group1 = super.owner.UI;
				f = UI * 1.5F;
				byte1 = 30;
				byte0 = 100;
				i = super.owner.QZ;
				super.owner.lZ--;
				if (super.owner.lZ == 0)
					super.owner.hZ = 1;
			} else if (super.owner.hZ == 4) {
				sprite_group1 = super.owner.TI;
				sprite_group2 = super.owner.Q;
				f = UI * 1.5F;
				byte1 = 30;
				byte0 = 125;
				i = super.owner.RZ;
				super.owner.mZ--;
				if (super.owner.mZ == 0)
					super.owner.hZ = 1;
			} else {
				sprite_group1 = super.owner.MI;
				f = UI;
				byte1 = 30;
				byte0 = 50;
				i = super.owner.QZ;
			}
			int j = sprite_group1.I(0, 0).C;
			float f1 = (float) Math.cos(((oGameObject) (oSpaceship1)).Y);
			float f2 = (float) Math.sin(((oGameObject) (oSpaceship1)).Y);
			float f3 = f1 * UI + ((oGameObject) (oSpaceship1)).K;
			float f4 = f2 * UI + ((oGameObject) (oSpaceship1)).L;
			for (int k = 0; k <= super.owner.eZ; k++) {
				oWeaponfire oWeaponfire2 = (oWeaponfire) super.owner.CC.I(super.owner.ZC);
				if (oWeaponfire2 != null) {
					oWeaponfire2.I(sprite_group1, sprite_group2, this, null, PI, super.EI, byte0, byte1, f);
					oWeaponfire2.I(((oGameObject) (oWeaponfire2)).J + f1 * j * k,
							((oGameObject) (oWeaponfire2)).S + f2 * j * k, f3, f4, true);
					if (XI != -1)
						super.owner.NZ.I(i, true, false);
					oWeaponfire2.d = sprite_group1.I(((oGameObject) (oSpaceship1)).Y);
				}
			}

		}
	}

	final void abs() {
		oSpaceship oSpaceship1 = (oSpaceship) super.g;
		oSpaceship1.I(RI);
		if (oSpaceship1.WI != null) {
			float f4 = (float) Math.cos(((oGameObject) (oSpaceship1)).Y);
			float f5 = (float) Math.sin(((oGameObject) (oSpaceship1)).Y);
			float f = (((oGameObject) (oSpaceship1)).J + ((oGameObject) (oSpaceship1)).y.E + I * f4) - Z * f5;
			float f1 = ((oGameObject) (oSpaceship1)).S + ((oGameObject) (oSpaceship1)).y.G + I * f5 + Z * f4;
			f4 = (float) Math.cos(((oGameObject) (oSpaceship1)).Y + zI);
			f5 = (float) Math.sin(((oGameObject) (oSpaceship1)).Y + zI);
			float f2 = f + f4 * 50F;
			float f3 = f1 + f5 * 50F;
			for (int i = 0; i < YI && oSpaceship1.D > 0; i++) {
				oSpaceship oSpaceship2;
				if (((oGameObject) (oSpaceship1)).EI == 2)
					oSpaceship2 = (oSpaceship) super.owner.xZ.I(super.owner.wZ);
				else
					oSpaceship2 = (oSpaceship) super.owner.xZ.I(super.owner.vZ);
				if (oSpaceship2 != null) {
					oSpaceship2.I(iI, ((oGameObject) (oSpaceship1)).EI, super.owner.Mission.I(1.0F, 0.2F));
					oSpaceship2.QI = 3;
					oSpaceship2.I(f, f1, null, f2, f3, ((oGameObject) (oSpaceship1)).M * 1.5F, 1.0F,
							((oGameObject) (oSpaceship1)).O, true);
					oSpaceship2.Q = oSpaceship1.WI;
					oSpaceship2.s = -i * 8;
					oSpaceship2.g = oSpaceship1;
					oSpaceship1.D--;
				}
			}

		}
	}

	@Override
	final void equip(boolean flag, oGameObject oGameObject1) {
		if (oGameObject1 != null && oGameObject1.JI == 8)
			super.ascore = 0;
		super.equip(flag, oGameObject1);
		if (!flag && super.h) {
			sprite_group sprite_group1 = super.owner.D;
			palette palette = super.owner.DZ;
			super.owner.NZ.I(super.owner.TZ, true, false);
			explosion explosion1 = (explosion) super.owner.rZ.I(super.owner.oZ);
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
						sprite_group2 = super.owner.G;
					else if (f > 0.5D)
						sprite_group2 = super.owner.H;
					else if (f > 0.25D)
						sprite_group2 = super.owner.K;
					else
						sprite_group2 = super.owner.L;
				} else {
					float f1 = (float) Math.random();
					if (f1 > 0.75D)
						sprite_group2 = super.owner.M;
					else if (f1 > 0.5D)
						sprite_group2 = super.owner.N;
					else if (f1 > 0.25D)
						sprite_group2 = super.owner.O;
					else
						sprite_group2 = super.owner.P;
				}
				explosionbit explosionbit1 = (explosionbit) super.owner.uZ.I(super.owner.tZ);
				if (explosionbit1 != null)
					explosionbit1.I(sprite_group2, super.owner.J, this, super.m + super.n);
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
