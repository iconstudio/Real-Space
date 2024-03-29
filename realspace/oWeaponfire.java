package realspace;

final class oWeaponfire extends GameObject
{
	oWeaponfire(GameApp applet)
	{
		super(applet);
		
		F = new int[4];
		HNSM = new int[4];
		max = new int[200][4];
		min = new int[200][4];
		random = new int[5];
	}

	final void I(SpriteGroup sprite_group1, SpriteGroup sprite_group2, oWeapon oWeapon1, GameObject oGameObject1,
			int i, int j, int k, int l, float f) {
		oSpaceship oSpaceship1 = (oSpaceship) ((GameObject) (oWeapon1)).myFollower;
		float f1 = (float) Math.cos(((GameObject) (oSpaceship1)).myRotation);
		float f4 = (float) Math.sin(((GameObject) (oSpaceship1)).myRotation);
		super.myX = (((GameObject) (oSpaceship1)).myX + ((GameObject) (oSpaceship1)).mySprite.E + oWeapon1.I * f1)
				- oWeapon1.Z * f4;
		super.myY = ((GameObject) (oSpaceship1)).myY + ((GameObject) (oSpaceship1)).mySprite.G + oWeapon1.I * f4
				+ oWeapon1.Z * f1;
		if (((GameObject) (oWeapon1)).mySprite != null)
			if (oWeapon1.F) {
				float f2 = (float) Math.cos(((GameObject) (oWeapon1)).myRotation);
				float f5 = (float) Math.sin(((GameObject) (oWeapon1)).myRotation);
				float f7 = 1.0F;
				if ((oWeapon1.NI & 1) == 0)
					f7 = -1F;
				super.myX += (((GameObject) (oWeapon1)).mySprite.E + oWeapon1.C * f2)
						- (oWeapon1.B + oWeapon1.D * f7) * f5;
				super.myY += ((GameObject) (oWeapon1)).mySprite.G + oWeapon1.C * f5
						+ (oWeapon1.B + oWeapon1.D * f7) * f2;
			} else {
				super.myX += ((GameObject) (oWeapon1)).mySprite.E + oWeapon1.C;
				super.myY += ((GameObject) (oWeapon1)).mySprite.G + oWeapon1.B;
			}
		int i1 = 0;
		int j1 = 0;
		if (i == 4) {
			float f3 = (float) Math.cos(((GameObject) (oSpaceship1)).myRotation + oWeapon1.zI);
			float f6 = (float) Math.sin(((GameObject) (oSpaceship1)).myRotation + oWeapon1.zI);
			i1 = (int) (super.myX + f3 * 50F);
			j1 = (int) (super.myY + f6 * 50F);
		} else if (oGameObject1 != null) {
			i1 = (int) oGameObject1.myX;
			j1 = (int) oGameObject1.myY;
		}
		F(sprite_group1, sprite_group2, oGameObject1, i, j, k, (int) super.myX, (int) super.myY, i1, j1, l, f);
		super.myFollower = oWeapon1;
	}

	@SuppressWarnings("unused")
	final void F(SpriteGroup sprite_group1, SpriteGroup sprite_group2, GameObject oGameObject1, int i, int j, int k, int l, int i1, int j1, int k1, int l1, float f)
	{
		super.Awake(sprite_group1, 6, k, 1, 0, false);
		D = sprite_group2;
		super.M = f;
		super.shipGrade = i;
		super.EI = j;
		super.myParent = oGameObject1;
		B = false;
		super.a = l1;
		super.BI = 1.0F;

		if (oGameObject1 != null && (super.shipGrade == 1 || super.shipGrade == 3))
		{
			float f1 = gameutil.I(l, i1, f, oGameObject1.myX, oGameObject1.myY, oGameObject1.hSpeed, oGameObject1.vSpeed);

			if (f1 > 1.0F)
			{
				j1 = (int) (oGameObject1.myX + oGameObject1.hSpeed * f1);
				k1 = (int) (oGameObject1.myY + oGameObject1.vSpeed * f1);
			}
		}
		switch (super.shipGrade) {
		case 1: // '\001'
			SetupPhysics4(l, i1, j1, k1, f, true);
			return;

		case 3: // '\003'
			SetupPhysics6(l, i1, null, j1, k1, f, 0.8F, 0.2F, true);
			SetupPhysics4(l, i1, j1, k1, f, true);
			return;

		case 2: // '\002'
			SetupPhysics5(l, i1, oGameObject1, j1, k1, f, 0.2F, false, true);
			return;

		case 4: // '\004'
			SetupPhysics6(l, i1, oGameObject1, j1, k1, f, 0.8F, 0.2F, true);
			return;

		case 5: // '\005'
			if (j == 2)
				LI = GameApp.Instance.MZ;
			else
				LI = GameApp.Instance.LZ;
			super.a = (int) (f + 0.5F);
			float f2 = j1 - l;
			float f4 = k1 - i1;
			float f6 = (float) Math.sqrt(f2 * f2 + f4 * f4);
			if (f6 != 0.0F) {
				I = (-f4 / f6) * Math.min(Math.max(k * 0.05F, 1.0F), 4F);
				Z = (f2 / f6) * Math.min(Math.max(k * 0.05F, 1.0F), 4F);
			} else {
				I = 1.0F;
				Z = 1.0F;
			}
			F[0] = (l - (int) I) + (GameApp.Instance).viewRelativeX;
			HNSM[0] = (i1 - (int) Z) + (GameApp.Instance).viewRelativeY;
			F[1] = l + (int) I + (GameApp.Instance).viewRelativeX;
			HNSM[1] = i1 + (int) Z + (GameApp.Instance).viewRelativeY;
			F[2] = j1 + (int) I + (GameApp.Instance).viewRelativeX;
			HNSM[2] = k1 + (int) Z + (GameApp.Instance).viewRelativeY;
			F[3] = (j1 - (int) I) + (GameApp.Instance).viewRelativeX;
			HNSM[3] = (k1 - (int) Z) + (GameApp.Instance).viewRelativeY;
			return;

		case 6: // '\006'
			super.myX = l;
			super.myY = i1;
			if (j == 2)
				LI = GameApp.Instance.MZ;
			else
				LI = GameApp.Instance.LZ;
			Palette palette1;
			super.a = 40 + (palette1 = LI).GetCapacity() + 1;
			C = 5;
			float f3 = j1 - l;
			float f5 = k1 - i1;
			float f7 = (float) Math.sqrt(f3 * f3 + f5 * f5);
			if (f7 != 0.0F) {
				I = (-f5 / f7) * Math.min(Math.max(k * 0.3F, 1.0F), 4F);
				Z = (f3 / f7) * Math.min(Math.max(k * 0.3F, 1.0F), 4F);
			} else {
				I = 1.0F;
				Z = 1.0F;
			}
			float f16 = f * 0.41F;
			for (int j2 = 0; j2 < C; j2++) {
				int i2 = 40 * j2;
				float f12 = l - (int) I;
				float f13 = l + (int) I;
				float f14 = i1 - (int) Z;
				float f15 = i1 + (int) Z;
				max[i2][0] = (int) f12;
				min[i2][0] = (int) f14;
				max[i2][3] = (int) f13;
				min[i2][3] = (int) f15;
				random[j2] = 40;
				float f8 = (f3 / f7) * f;
				float f9 = (f5 / f7) * f;
				for (int k2 = 1; k2 < 40; k2++) {
					float f10 = (float) Math.random() * f16 - f16 / 2.0F;
					float f11 = (float) Math.random() * f16 - f16 / 2.0F;
					f12 += f8 + f10;
					f13 += f8 + f10;
					f14 += f9 + f11;
					f15 += f9 + f11;
					max[i2][1] = (int) f12;
					min[i2][1] = (int) f14;
					max[i2][2] = (int) f13;
					min[i2][2] = (int) f15;
					i2++;
					max[i2][0] = (int) f12;
					min[i2][0] = (int) f14;
					max[i2][3] = (int) f13;
					min[i2][3] = (int) f15;
				}

				max[i2][1] = (int) f12;
				min[i2][1] = (int) f14;
				max[i2][2] = (int) f13;
				min[i2][2] = (int) f15;
			}

			return;
		}
	}

	@Override
	final void Update() {
		switch (super.shipGrade) {
		case 1: // '\001'
			super.mySprite = super.myAtlas.GetSprite(super.frameIndex, super.animationIndex);
			UpdateWithSpeed();
			timeSinceEpoch++;
			if (timeSinceEpoch >= super.a)
				Attach(true, null);
			break;

		case 3: // '\003'
			super.mySprite = super.myAtlas.GetSprite(super.frameIndex, super.animationIndex);
			UpdateWithSpeed();
			timeSinceEpoch++;
			if (timeSinceEpoch >= super.a)
				Attach(true, null);
			break;

		case 2: // '\002'
			super.mySprite = super.myAtlas.GetSprite(super.frameIndex, super.animationIndex);
			UpdateWithFollower1();
			timeSinceEpoch++;

			if (timeSinceEpoch >= super.a)
			{
				Attach(true, null);
			}
			break;

		case 4: // '\004'
			UpdateWithFollower2();
			timeSinceEpoch++;

			if (timeSinceEpoch >= super.a)
			{
				Attach(true, null);
			}
			break;

		case 5: // '\005'
			timeSinceEpoch++;
			if (timeSinceEpoch >= super.a)
			{
				Attach(false, null);
			}
			else if (super.myFollower != null && super.myFollower.IsDisabled())
			{
				Attach(true, null);
			}
			else
			{
				if (super.myFollower != null)
				{
					F[0] = (int) (super.myFollower.myX - I) + (GameApp.Instance).viewRelativeX;
					HNSM[0] = (int) (super.myFollower.myY - Z) + (GameApp.Instance).viewRelativeY;
					F[1] = (int) (super.myFollower.myX + I) + (GameApp.Instance).viewRelativeX;
					HNSM[1] = (int) (super.myFollower.myY + Z) + (GameApp.Instance).viewRelativeY;
				}

				if (super.myParent != null)
				{
					F[2] = (int) (super.myParent.myX + I) + (GameApp.Instance).viewRelativeX;
					HNSM[2] = (int) (super.myParent.myY + Z) + (GameApp.Instance).viewRelativeY;
					F[3] = (int) (super.myParent.myX - I) + (GameApp.Instance).viewRelativeX;
					HNSM[3] = (int) (super.myParent.myY - Z) + (GameApp.Instance).viewRelativeY;
				}
			}
			break;

		case 6: // '\006'
			timeSinceEpoch++;
			if (timeSinceEpoch >= super.a)
				Attach(false, null);
			break;
		}
		if (D != null && super.IsActivated() && timeSinceEpoch % 3 == 0) {
			Explosion explosion1 = (Explosion) GameApp.Instance.rZ.GiveLastInstanceTo(GameApp.Instance.pZ);
			if (explosion1 != null)
				explosion1.I(D, 1, super.myX, super.myY, super.hSpeed * 0.4F, super.vSpeed * 0.4F, 0, 1, 0, false);
		}
	}

	@Override
	@SuppressWarnings("unused")
	final void Draw(Canvas surface) {
		switch (super.shipGrade) {
		case 6: // '\006'
			Palette palette1 = LI;
			int i = palette1.GetCapacity();
			for (int j = 0; j < C; j++) {
				// int i1 = 40 * j;
				int k = 0;
				for (int l = timeSinceEpoch; k < i; l--) {
					// boolean _tmp = l >= 0 && l < random[j];
					k++;
				}

			}

			return;

		default:
			super.Draw(surface);
			// fall through

		case 5: // '\005'
			return;
		}
	}

	@Override
	public final boolean CheckCollision(GameObject oGameObject1) {
		switch (super.shipGrade) {
		case 5: // '\005'
			break;

		case 6: // '\006'
			if (super.IsActivated() && oGameObject1.IsActivated()) {
				for (int i = 0; i < C; i++)
					if (timeSinceEpoch < random[i]) {
						int j = 40 * i + timeSinceEpoch;
						if (max[j][0] < oGameObject1.borderRight && max[j][1] > oGameObject1.borderLeft && min[j][0] < oGameObject1.borderTop
								&& min[j][1] > oGameObject1.borderBottom) {
							if (oGameObject1.JI == 6) {
								for (int k = 0; k < C; k++)
									random[k] = Math.min(timeSinceEpoch + 1, super.a);

							} else {
								random[i] = Math.min(timeSinceEpoch + 1, super.a);
							}
							if (!B) {
								B = true;
								if (oGameObject1.JI == 9 || oGameObject1.JI == 8 && oGameObject1.prefabID == 130)
									GameApp.Instance.everySFXs.Play(GameApp.Instance.UZ, true, false);
								else
									GameApp.Instance.everySFXs.Play(GameApp.Instance.VZ, true, false);
								Explosion explosion1 = (Explosion) GameApp.Instance.rZ.GiveLastInstanceTo(GameApp.Instance.qZ);
								if (explosion1 != null)
									explosion1.I(GameApp.Instance.I, 1, max[j][1], min[j][1], max[j][1] - max[j][0],
											min[j][1] - min[j][0], 1, 2, super.m + super.n, true);
							}
							oGameObject1.I(super.m, this);
							return true;
						}
					}

			}
			break;

		default:
			return super.CheckCollision(oGameObject1);
		}
		return false;
	}

	@Override
	public final void Attach(boolean flag, GameObject oGameObject1) {
		if (!flag) {
			SpriteGroup sprite_group1;
			if (super.EI == 2)
				sprite_group1 = GameApp.Instance.I;
			else
				sprite_group1 = GameApp.Instance.Z;
			switch (super.shipGrade) {
			default:
				break;

			case 1: // '\001'
			case 2: // '\002'
				Explosion explosion1 = (Explosion) GameApp.Instance.rZ.GiveLastInstanceTo(GameApp.Instance.qZ);
				if (explosion1 != null) {
					explosion1.I(sprite_group1, 1, super.myX, super.myY, super.hSpeed, super.vSpeed, 1, 2, super.m + super.n, true);
					if (oGameObject1 != null
							&& (oGameObject1.JI == 9 || oGameObject1.JI == 8 && oGameObject1.prefabID == 130))
						GameApp.Instance.everySFXs.Play(GameApp.Instance.UZ, true, false);
					else
						GameApp.Instance.everySFXs.Play(GameApp.Instance.VZ, true, false);
				}
				break;

			case 3: // '\003'
			case 4: // '\004'
				Explosion explosion2 = (Explosion) GameApp.Instance.rZ.GiveLastInstanceTo(GameApp.Instance.qZ);
				if (explosion2 == null)
					break;
				explosion2.I(sprite_group1, 1, super.myX, super.myY, super.hSpeed, super.vSpeed, 1, 2, super.m + super.n, true);
				if (oGameObject1 != null && (oGameObject1.JI == 9 || oGameObject1.JI == 8 && oGameObject1.prefabID == 130))
					GameApp.Instance.everySFXs.Play(GameApp.Instance.UZ, true, false);
				else
					GameApp.Instance.everySFXs.Play(GameApp.Instance.VZ, true, false);
				break;

			case 5: // '\005'
				if (super.myParent == null || super.myParent.IsDisabled())
					break;
				super.myParent.I(super.m, this);
				Explosion explosion3 = (Explosion) GameApp.Instance.rZ.GiveLastInstanceTo(GameApp.Instance.qZ);
				if (explosion3 != null)
					explosion3.I(sprite_group1, 1, super.myParent.myX, super.myParent.myY, Z, -I, 1, 2, 0, true);
				break;
			}
		}
		super.Attach(flag, oGameObject1);
	}

	int F[];
	int HNSM[];
	float I;
	float Z;
	int max[][];
	int min[][];
	int random[];
	int C;
	boolean B;
	SpriteGroup D;
	Palette LI;
}
