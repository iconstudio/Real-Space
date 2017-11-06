package realspace;
// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.

// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   star_y

final class oPlanet extends oGameObject {
	oPlanet(gameapp gameapp1) {
		super(gameapp1);
	}

	final void I(sprite_group sprite_group1, int i, boolean flag, int j, int k) {
		super.initialize(sprite_group1, 10, 1000, i, 0, flag);
		super.d = j;
		super.b = k;
		super.y = sprite_group1.I(j, k);
		F = 0;
	}

	@Override
	final void I() {
		if (F > 0) {
			HNSM--;
			if (HNSM <= 0) {
				HNSM = 10 + (int) (Math.random() * F);
				F += 10;
				if (F > 60)
					F = 0;
				sprite_group sprite_group1 = null;
				if (Math.random() < 0.5D)
					sprite_group1 = super.owner.D;
				else
					sprite_group1 = super.owner.B;
				explosion explosion1 = (explosion) super.owner.rZ.I(super.owner.qZ);
				if (explosion1 != null)
					explosion1.I(sprite_group1, 1,
							super.J + (float) ((Math.random() - 0.5D) * super.x.C * 0.66000000000000003D),
							super.S + (float) ((Math.random() - 0.5D) * super.x.B * 0.66000000000000003D),
							super.K + (float) (Math.random() - 0.5D) * 0.3F,
							super.L + (float) (Math.random() - 0.5D) * 0.3F, 0, 2, 0, false);
			}
		}
		super.I();
	}

	@Override
	final void equip(boolean flag, oGameObject oGameObject1) {
		if (oGameObject1 != null && oGameObject1.JI == 8)
			super.ascore = 0;
		super.equip(flag, oGameObject1);
		if (!flag) {
			// palette palette = null;
			// palette = super.KI.DZ;
			super.owner.NZ.I(super.owner.YZ, true, false);
			if (super.HI == 103) {
				explosionbit explosionbit1 = (explosionbit) super.owner.uZ.I(super.owner.tZ);
				if (explosionbit1 != null) {
					explosionbit1.I(super.owner.gI, null, this, super.m + super.n);
					explosionbit1.I(super.J - 10F * ((gamebase) (super.owner)).view_scale,
							super.S + 15F * ((gamebase) (super.owner)).view_scale, -0.1F, 0.07F, false);
					explosionbit1.a = 500;
				}
				explosionbit1 = (explosionbit) super.owner.uZ.I(super.owner.tZ);
				if (explosionbit1 != null) {
					explosionbit1.I(super.owner.lI, null, this, super.m + super.n);
					explosionbit1.I(super.J + 70F * ((gamebase) (super.owner)).view_scale,
							super.S + -40F * ((gamebase) (super.owner)).view_scale, 0.4F, -0.2F, false);
					explosionbit1.a = 490;
				}
				explosionbit1 = (explosionbit) super.owner.uZ.I(super.owner.tZ);
				if (explosionbit1 != null) {
					explosionbit1.I(super.owner.kI, null, this, super.m + super.n);
					explosionbit1.I(super.J + 40F * ((gamebase) (super.owner)).view_scale,
							super.S + -90F * ((gamebase) (super.owner)).view_scale, 0.2F, -0.8F, false);
					explosionbit1.a = 480;
				}
				explosionbit1 = (explosionbit) super.owner.uZ.I(super.owner.tZ);
				if (explosionbit1 != null) {
					explosionbit1.I(super.owner.kI, null, this, super.m + super.n);
					explosionbit1.I(super.J + -30F * ((gamebase) (super.owner)).view_scale,
							super.S + -100F * ((gamebase) (super.owner)).view_scale, -0.3F, -0.75F, false);
					explosionbit1.a = 470;
				}
			}
			for (int i = 0; i < 6; i++) {
				explosion explosion1 = (explosion) super.owner.rZ.I(super.owner.qZ);
				if (explosion1 != null) {
					explosion1.I(super.owner.B, 3,
							super.J + (float) (Math.random() * super.y.C - super.y.D),
							super.S + (float) (Math.random() * super.y.B - super.y.F), super.K,
							super.L, 1, 2, 300, false);
					explosion1.s = (int) (Math.random() * -4D);
				}
			}

			for (int j = 0; j < 20; j++) {
				explosion explosion2 = (explosion) super.owner.rZ.I(super.owner.qZ);
				if (explosion2 != null) {
					explosion2.I(super.owner.B, 3,
							super.J + (float) (Math.random() * super.y.C - super.y.D),
							super.S + (float) (Math.random() * super.y.B - super.y.F), super.K,
							super.L, 1, 2, 300, false);
					explosion2.s = (int) (Math.random() * -50D);
				}
			}

			for (int k = 0; k < 30; k++) {
				explosionbit explosionbit2 = (explosionbit) super.owner.uZ.I(super.owner.tZ);
				if (explosionbit2 != null) {
					explosionbit2.I(super.owner.hI, super.owner.J, this, 100);
					explosionbit2.I(super.J + ((float) Math.random() - 0.2F) * 100F,
							super.S + ((float) Math.random() - 0.8F) * 100F,
							((float) Math.random() - 0.2F) * 10F * ((gamebase) (super.owner)).view_scale,
							((float) Math.random() - 0.8F) * 7F * ((gamebase) (super.owner)).view_scale, false);
					explosionbit2.s = (int) (Math.random() * -80D);
					explosionbit2.a = 100;
				}
			}

		}
	}

	@Override
	final void I(oGameObject oGameObject1, int i, int j) {
		if (i > 0 && super.q > 0) {
			F = 5 + (int) (Math.sin((float) super.o / (float) super.q * 1.5707963267948966D) * 20D);
			HNSM = 0;
		} else {
			F = 0;
		}
		if (oGameObject1 != null) {
			for (int k = 0; k < 2; k++) {
				explosionbit explosionbit1 = (explosionbit) super.owner.uZ.I(super.owner.tZ);
				if (explosionbit1 != null)
					explosionbit1.I(super.owner.hI, super.owner.J, oGameObject1, 100);
			}

		}
		super.I(oGameObject1, i, j);
	}

	int F;
	int HNSM;
}
