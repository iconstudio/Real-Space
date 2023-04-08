package realspace;
// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.

// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   star_y

final class oPlanet extends GameObject {
	oPlanet(GameApp applet) {
		super(applet);
	}

	final void I(sprite_group sprite_group1, int i, boolean flag, int j, int k) {
		super.Awake(sprite_group1, 10, 1000, i, 0, flag);
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
					sprite_group1 = GameApp.Instance.D;
				else
					sprite_group1 = GameApp.Instance.B;
				Explosion explosion1 = (Explosion) GameApp.Instance.rZ.I(GameApp.Instance.qZ);
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
	final void Equip(boolean flag, GameObject oGameObject1) {
		if (oGameObject1 != null && oGameObject1.JI == 8)
			super.ascore = 0;
		super.Equip(flag, oGameObject1);
		if (!flag) {
			// palette palette = null;
			// palette = super.KI.DZ;
			GameApp.Instance.NZ.I(GameApp.Instance.YZ, true, false);
			if (super.HI == 103) {
				explosionbit explosionbit1 = (explosionbit) GameApp.Instance.uZ.I(GameApp.Instance.tZ);
				if (explosionbit1 != null) {
					explosionbit1.I(GameApp.Instance.gI, null, this, super.m + super.n);
					explosionbit1.I(super.J - 10F * (GameApp.Instance).viewScale,
							super.S + 15F * (GameApp.Instance).viewScale, -0.1F, 0.07F, false);
					explosionbit1.a = 500;
				}
				explosionbit1 = (explosionbit) GameApp.Instance.uZ.I(GameApp.Instance.tZ);
				if (explosionbit1 != null) {
					explosionbit1.I(GameApp.Instance.lI, null, this, super.m + super.n);
					explosionbit1.I(super.J + 70F * (GameApp.Instance).viewScale,
							super.S + -40F * (GameApp.Instance).viewScale, 0.4F, -0.2F, false);
					explosionbit1.a = 490;
				}
				explosionbit1 = (explosionbit) GameApp.Instance.uZ.I(GameApp.Instance.tZ);
				if (explosionbit1 != null) {
					explosionbit1.I(GameApp.Instance.kI, null, this, super.m + super.n);
					explosionbit1.I(super.J + 40F * (GameApp.Instance).viewScale,
							super.S + -90F * (GameApp.Instance).viewScale, 0.2F, -0.8F, false);
					explosionbit1.a = 480;
				}
				explosionbit1 = (explosionbit) GameApp.Instance.uZ.I(GameApp.Instance.tZ);
				if (explosionbit1 != null) {
					explosionbit1.I(GameApp.Instance.kI, null, this, super.m + super.n);
					explosionbit1.I(super.J + -30F * (GameApp.Instance).viewScale,
							super.S + -100F * (GameApp.Instance).viewScale, -0.3F, -0.75F, false);
					explosionbit1.a = 470;
				}
			}
			for (int i = 0; i < 6; i++) {
				Explosion explosion1 = (Explosion) GameApp.Instance.rZ.I(GameApp.Instance.qZ);
				if (explosion1 != null) {
					explosion1.I(GameApp.Instance.B, 3,
							super.J + (float) (Math.random() * super.y.C - super.y.D),
							super.S + (float) (Math.random() * super.y.B - super.y.F), super.K,
							super.L, 1, 2, 300, false);
					explosion1.s = (int) (Math.random() * -4D);
				}
			}

			for (int j = 0; j < 20; j++) {
				Explosion explosion2 = (Explosion) GameApp.Instance.rZ.I(GameApp.Instance.qZ);
				if (explosion2 != null) {
					explosion2.I(GameApp.Instance.B, 3,
							super.J + (float) (Math.random() * super.y.C - super.y.D),
							super.S + (float) (Math.random() * super.y.B - super.y.F), super.K,
							super.L, 1, 2, 300, false);
					explosion2.s = (int) (Math.random() * -50D);
				}
			}

			for (int k = 0; k < 30; k++) {
				explosionbit explosionbit2 = (explosionbit) GameApp.Instance.uZ.I(GameApp.Instance.tZ);
				if (explosionbit2 != null) {
					explosionbit2.I(GameApp.Instance.hI, GameApp.Instance.J, this, 100);
					explosionbit2.I(super.J + ((float) Math.random() - 0.2F) * 100F,
							super.S + ((float) Math.random() - 0.8F) * 100F,
							((float) Math.random() - 0.2F) * 10F * (GameApp.Instance).viewScale,
							((float) Math.random() - 0.8F) * 7F * (GameApp.Instance).viewScale, false);
					explosionbit2.s = (int) (Math.random() * -80D);
					explosionbit2.a = 100;
				}
			}

		}
	}

	@Override
	final void I(GameObject oGameObject1, int i, int j) {
		if (i > 0 && super.q > 0) {
			F = 5 + (int) (Math.sin((float) super.o / (float) super.q * 1.5707963267948966D) * 20D);
			HNSM = 0;
		} else {
			F = 0;
		}
		if (oGameObject1 != null) {
			for (int k = 0; k < 2; k++) {
				explosionbit explosionbit1 = (explosionbit) GameApp.Instance.uZ.I(GameApp.Instance.tZ);
				if (explosionbit1 != null)
					explosionbit1.I(GameApp.Instance.hI, GameApp.Instance.J, oGameObject1, 100);
			}

		}
		super.I(oGameObject1, i, j);
	}

	int F;
	int HNSM;
}
