package realspace;

final class oWeapon extends GameObject
{
	oWeapon(GameApp applet)
	{
		super(applet);
	}

	final void I(oSpaceship object, boolean flag, float f, float f1, float f2, float f3, float f4, float f5, boolean flag1, SpriteGroup sprite_group1, int i, int j, int k, int l, boolean flag2)
	{
		super.Awake(sprite_group1, 9, j, k, l, flag2, object, flag);
		super.myFollower = object;
		super.shipGrade = 0;
		prefabID = 0;
		super.EI = super.myFollower.EI;
		super.acqScores = i;
		I = f;
		Z = f1;
		C = f2;
		B = f3;
		D = f4;
		F = flag1;
		super.myRotation = super.myFollower.myRotation;
		HNSM = true;
		super.myAtlas = sprite_group1;
		NI = 0;
		zI = f5;
		super.BI = 1.0F;
		if (super.myAtlas != null && flag1) {
			super.frameIndex = super.myAtlas.GetFrameByRotation(super.myRotation);
			super.z = 0.1963495F;
		}
	}

	final void I(SpriteGroup sprite_group1, SpriteGroup sprite_group2, int i, int j, int k, boolean flag, int l, int i1, float f, float f1, int j1)
	{
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

	final void I(int i, int j, float f, int k, int l)
	{
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
	final void Update()
	{
		if (super.myAtlas != null)
			if (F)
			{
				if (super.myParent != null)
				{
					UpdateWithAttacks(super.myParent);

					HNSM = false;
				}
				else
				{
					float f = super.myFollower.hSpeed * super.myFollower.hSpeed + super.myFollower.vSpeed * super.myFollower.vSpeed;

					if (HNSM)
					{
						if (f < 2.5F && Math.random() * 80D > 79D)
						{
							super.i = (float) Math.random() * 6.283185F;
							HNSM = false;
							Update();
						}
						else
						{
							super.i = super.myFollower.myRotation;
							super.myRotation = super.myFollower.myRotation;
						}
					} else {
						if (f > 2.5F)
							super.i = super.myFollower.myRotation;
						else if (Math.random() * 80D > 79D)
							super.i = (float) Math.random() * 6.283185F;
						Update();
						float f2 = Math.abs(super.myRotation - super.myFollower.myRotation);
						if (f2 < 0.001F)
							HNSM = true;
					}
				}
				super.frameIndex = super.myAtlas.GetFrameByRotation(super.myRotation);
				super.mySprite = super.myAtlas.GetSprite(super.frameIndex, super.animationIndex);
				float f1 = ((float) super.myFollower.frameIndex / (float) super.myFollower.myAtlas.xCapacity) * 6.283185F;
				float f3 = (float) Math.cos(f1);
				float f4 = (float) Math.sin(f1);
				super.myX = super.myFollower.myX + Math.round(I * f3 - Z * f4);
				super.myY = super.myFollower.myY + Math.round(I * f4 + Z * f3);
				CalcCollisionBox();
			} else {
				super.mySprite = super.myAtlas.GetSprite(super.frameIndex, super.animationIndex);
				super.myX = super.myFollower.myX + I;
				super.myY = super.myFollower.myY + Z;
				CalcCollisionBox();
			}
		if (MI && GameApp.Instance.OC)
			if (OI == 2) {
				abs--;
				if (abs <= 0) {
					if (((oSpaceship) super.myFollower).fellowsCount > 0)
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
		if (super.myFollower.timeSinceEpoch >= 0)
			super.Draw(surface);
	}

	final void J() {
		oWeaponfire oWeaponfire1 = null;
		oSpaceship oSpaceship1 = (oSpaceship) myFollower;
		NI++;

		if (MI) {
			GameObject oGameObject1 = oSpaceship1.A();
			if (oGameObject1 != null) {
				if (((GameObject) (oSpaceship1)).EI == 2)
					oWeaponfire1 = (oWeaponfire) GameApp.Instance.CC.GiveLastInstanceTo(GameApp.Instance.yZ);
				else if (((GameObject) (oSpaceship1)).EI == 1)
					oWeaponfire1 = (oWeaponfire) GameApp.Instance.CC.GiveLastInstanceTo(GameApp.Instance.IC);

				if (oWeaponfire1 != null)
				{
					oSpaceship1.I = oGameObject1;
					super.myParent = oGameObject1;

					if (PI == 4) {
						oWeaponfire1.I(VI, WI, this, null, PI, super.EI, QI, TI, UI);
						oWeaponfire1.myParent = oGameObject1;
					} else {
						oWeaponfire1.I(VI, WI, this, oGameObject1, PI, super.EI, QI, TI, UI);
					}
					oWeaponfire1.myFollower = oSpaceship1;
					if (XI != -1) {
						GameApp.Instance.everySFXs.Play(XI, true, false);
						return;
					}
				}
			}
		} else {
			SpriteGroup sprite_group2 = null;
			SpriteGroup sprite_group1;
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
			
			int j = sprite_group1.GetSprite(0, 0).C;
			float f1 = (float) Math.cos(((GameObject) (oSpaceship1)).myRotation);
			float f2 = (float) Math.sin(((GameObject) (oSpaceship1)).myRotation);
			float f3 = f1 * UI + ((GameObject) (oSpaceship1)).hSpeed;
			float f4 = f2 * UI + ((GameObject) (oSpaceship1)).vSpeed;
			for (int k = 0; k <= GameApp.Instance.eZ; k++) {
				oWeaponfire oWeaponfire2 = (oWeaponfire) GameApp.Instance.CC.GiveLastInstanceTo(GameApp.Instance.ZC);
				if (oWeaponfire2 != null) {
					oWeaponfire2.I(sprite_group1, sprite_group2, this, null, PI, super.EI, byte0, byte1, f);
					oWeaponfire2.SetupPhysics2(((GameObject) (oWeaponfire2)).myX + f1 * j * k,
							((GameObject) (oWeaponfire2)).myY + f2 * j * k, f3, f4, true);
					if (XI != -1)
						GameApp.Instance.everySFXs.Play(i, true, false);
					oWeaponfire2.frameIndex = sprite_group1.GetFrameByRotation(((GameObject) (oSpaceship1)).myRotation);
				}
			}

		}
	}

	final void abs() {
		oSpaceship oSpaceship1 = (oSpaceship) super.myFollower;
		oSpaceship1.I(RI);
		if (oSpaceship1.WI != null) {
			float f4 = (float) Math.cos(((GameObject) (oSpaceship1)).myRotation);
			float f5 = (float) Math.sin(((GameObject) (oSpaceship1)).myRotation);
			float f = (((GameObject) (oSpaceship1)).myX + ((GameObject) (oSpaceship1)).mySprite.E + I * f4) - Z * f5;
			float f1 = ((GameObject) (oSpaceship1)).myY + ((GameObject) (oSpaceship1)).mySprite.G + I * f5 + Z * f4;
			f4 = (float) Math.cos(((GameObject) (oSpaceship1)).myRotation + zI);
			f5 = (float) Math.sin(((GameObject) (oSpaceship1)).myRotation + zI);
			float f2 = f + f4 * 50F;
			float f3 = f1 + f5 * 50F;
			for (int i = 0; i < YI && oSpaceship1.fellowsCount > 0; i++) {
				oSpaceship oSpaceship2;
				if (((GameObject) (oSpaceship1)).EI == 2)
					oSpaceship2 = (oSpaceship) GameApp.Instance.xZ.GiveLastInstanceTo(GameApp.Instance.wZ);
				else
					oSpaceship2 = (oSpaceship) GameApp.Instance.xZ.GiveLastInstanceTo(GameApp.Instance.vZ);
					
				if (oSpaceship2 != null)
				{
					oSpaceship2.I(iI, ((GameObject) (oSpaceship1)).EI, GameApp.Instance.currentMission.I(1.0F, 0.2F));
					oSpaceship2.QI = 3;
					oSpaceship2.SetupPhysics6(f, f1, null, f2, f3, ((GameObject) (oSpaceship1)).M * 1.5F, 1.0F,
							((GameObject) (oSpaceship1)).myFriction, true);
					oSpaceship2.myParent = oSpaceship1.WI;
					oSpaceship2.timeSinceEpoch = -i * 8;
					oSpaceship2.myFollower = oSpaceship1;
					oSpaceship1.fellowsCount--;
				}
			}

		}
	}

	@Override
	public final void Attach(boolean flag, GameObject oGameObject1)
	{
		if (oGameObject1 != null && oGameObject1.JI == 8)
		{
			super.acqScores = 0;
		}

		super.Attach(flag, oGameObject1);
		if (!flag && super.h)
		{
			SpriteGroup sprite_group1 = GameApp.Instance.D;
			Palette palette = GameApp.Instance.DZ;

			GameApp.Instance.everySFXs.Play(GameApp.Instance.TZ, true, false);

			Explosion explosion1 = (Explosion) GameApp.Instance.rZ.GiveLastInstanceTo(GameApp.Instance.oZ);
			if (explosion1 != null) {
				explosion1.I(sprite_group1, 3, super.myX, super.myY, super.hSpeed, super.vSpeed, 1, 2, super.m + super.n, false);
				if (palette != null)
					explosion1.F = palette;
			}
			for (int i = 0; i < 2; i++) {
				SpriteGroup sprite_group2;
				if (super.myFollower.prefabID >= 200 && super.myFollower.prefabID < 300) {
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
				explosionbit explosionbit1 = (explosionbit) GameApp.Instance.uZ.GiveLastInstanceTo(GameApp.Instance.tZ);
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
	SpriteGroup VI;
	SpriteGroup WI;
	int XI;
	int YI;
	int iI;
	float zI;
}
