package realspace;

final class oPlanet extends GameObject 
{
	public oPlanet(final GameApp applet)
	{
		super(applet);
	}

	final void Initialize(final SpriteGroup atlasa, final int i, final boolean flag, final int j, final int k)
	{
		super.Awake(atlasa, 10, 1000, i, 0, flag);
		super.frameIndex = j;
		super.animationIndex = k;
		super.mySprite = atlasa.GetSprite(j, k);
		F = 0;
	}

	@Override
	final void Update()
	{
		if (F > 0)
		{
			HNSM--;
			if (HNSM <= 0)
			{
				HNSM = 10 + (int) (Math.random() * F);
				F += 10;
				if (F > 60)
					F = 0;

				SpriteGroup atlas = null;
				if (Math.random() < 0.5D)
					atlas = GameApp.Instance.D;
				else
					atlas = GameApp.Instance.B;

				final Explosion explosion1 = (Explosion) GameApp.Instance.rZ.GiveLastInstanceTo(GameApp.Instance.qZ);
				if (explosion1 != null)
					explosion1.I(atlas, 1,
							super.myX + (float) ((Math.random() - 0.5D) * super.myAtlas.C * 0.66000000000000003D),
							super.myY + (float) ((Math.random() - 0.5D) * super.myAtlas.B * 0.66000000000000003D),
							super.hSpeed + (float) (Math.random() - 0.5D) * 0.3F,
							super.vSpeed + (float) (Math.random() - 0.5D) * 0.3F, 0, 2, 0, false);
			}
		}
		super.Update();
	}

	@Override
	final void Equip(final boolean flag, final GameObject oGameObject1) {
		if (oGameObject1 != null && oGameObject1.JI == 8)
		{
			super.acqScores = 0;
		}

		super.Equip(flag, oGameObject1);

		// Unattach
		if (!flag)
		{
			// palette palette = null;
			// palette = super.KI.DZ;
			GameApp.Instance.everySFXs.Play(GameApp.Instance.YZ, true, false);
			if (super.HI == 103) {
				explosionbit explosionbit1 = (explosionbit) GameApp.Instance.uZ.GiveLastInstanceTo(GameApp.Instance.tZ);
				if (explosionbit1 != null) {
					explosionbit1.I(GameApp.Instance.gI, null, this, super.m + super.n);
					explosionbit1.SetupPhysics2(super.myX - 10F * (GameApp.Instance).viewScale,
							super.myY + 15F * (GameApp.Instance).viewScale, -0.1F, 0.07F, false);
					explosionbit1.a = 500;
				}
				explosionbit1 = (explosionbit) GameApp.Instance.uZ.GiveLastInstanceTo(GameApp.Instance.tZ);
				if (explosionbit1 != null) {
					explosionbit1.I(GameApp.Instance.lI, null, this, super.m + super.n);
					explosionbit1.SetupPhysics2(super.myX + 70F * (GameApp.Instance).viewScale,
							super.myY + -40F * (GameApp.Instance).viewScale, 0.4F, -0.2F, false);
					explosionbit1.a = 490;
				}
				explosionbit1 = (explosionbit) GameApp.Instance.uZ.GiveLastInstanceTo(GameApp.Instance.tZ);
				if (explosionbit1 != null) {
					explosionbit1.I(GameApp.Instance.kI, null, this, super.m + super.n);
					explosionbit1.SetupPhysics2(super.myX + 40F * (GameApp.Instance).viewScale,
							super.myY + -90F * (GameApp.Instance).viewScale, 0.2F, -0.8F, false);
					explosionbit1.a = 480;
				}
				explosionbit1 = (explosionbit) GameApp.Instance.uZ.GiveLastInstanceTo(GameApp.Instance.tZ);
				if (explosionbit1 != null) {
					explosionbit1.I(GameApp.Instance.kI, null, this, super.m + super.n);
					explosionbit1.SetupPhysics2(super.myX + -30F * (GameApp.Instance).viewScale,
							super.myY + -100F * (GameApp.Instance).viewScale, -0.3F, -0.75F, false);
					explosionbit1.a = 470;
				}
			}
			for (int i = 0; i < 6; i++) {
				final Explosion explosion1 = (Explosion) GameApp.Instance.rZ.GiveLastInstanceTo(GameApp.Instance.qZ);
				if (explosion1 != null) {
					explosion1.I(GameApp.Instance.B, 3,
							super.myX + (float) (Math.random() * super.mySprite.C - super.mySprite.D),
							super.myY + (float) (Math.random() * super.mySprite.B - super.mySprite.F), super.hSpeed,
							super.vSpeed, 1, 2, 300, false);
					explosion1.timeSinceEpoch = (int) (Math.random() * -4D);
				}
			}

			for (int j = 0; j < 20; j++) {
				final Explosion explosion2 = (Explosion) GameApp.Instance.rZ.GiveLastInstanceTo(GameApp.Instance.qZ);
				if (explosion2 != null) {
					explosion2.I(GameApp.Instance.B, 3,
							super.myX + (float) (Math.random() * super.mySprite.C - super.mySprite.D),
							super.myY + (float) (Math.random() * super.mySprite.B - super.mySprite.F), super.hSpeed,
							super.vSpeed, 1, 2, 300, false);
					explosion2.timeSinceEpoch = (int) (Math.random() * -50D);
				}
			}

			for (int k = 0; k < 30; k++) {
				final explosionbit explosionbit2 = (explosionbit) GameApp.Instance.uZ.GiveLastInstanceTo(GameApp.Instance.tZ);
				if (explosionbit2 != null) {
					explosionbit2.I(GameApp.Instance.hI, GameApp.Instance.J, this, 100);
					explosionbit2.SetupPhysics2(super.myX + ((float) Math.random() - 0.2F) * 100F,
							super.myY + ((float) Math.random() - 0.8F) * 100F,
							((float) Math.random() - 0.2F) * 10F * (GameApp.Instance).viewScale,
							((float) Math.random() - 0.8F) * 7F * (GameApp.Instance).viewScale, false);
					explosionbit2.timeSinceEpoch = (int) (Math.random() * -80D);
					explosionbit2.a = 100;
				}
			}
		}
	}

	@Override
	final void I(final GameObject oGameObject1, final int i, final int j) {
		if (i > 0 && super.q > 0) {
			F = 5 + (int) (Math.sin((float) super.o / (float) super.q * 1.5707963267948966D) * 20D);
			HNSM = 0;
		} else {
			F = 0;
		}
		if (oGameObject1 != null) {
			for (int k = 0; k < 2; k++) {
				final explosionbit explosionbit1 = (explosionbit) GameApp.Instance.uZ.GiveLastInstanceTo(GameApp.Instance.tZ);
				if (explosionbit1 != null)
					explosionbit1.I(GameApp.Instance.hI, GameApp.Instance.J, oGameObject1, 100);
			}

		}
		super.I(oGameObject1, i, j);
	}

	int F;
	int HNSM;
}
