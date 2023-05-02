package realspace;

import java.awt.Color;

final class Explosion extends GameObject
{
	int HNSM;
	int I;
	int Z;
	boolean hashCode;
	float C;
	float B;
	int D;
	Palette F;

	float explosion_property_0[];
	float explosion_property_1[];
	float explosion_property_2[];
	float explosion_property_3[];

	public Explosion(GameApp applet)
	{
		super(applet);

		explosion_property_0 = new float[40];
		explosion_property_1 = new float[40];
		explosion_property_2 = new float[40];
		explosion_property_3 = new float[40];
	}

	public final void I(SpriteGroup sprite_group1, int i, float f, float f1, float f2, float f3, int j, int k, int l,
			boolean flag) {
		super.Awake(sprite_group1, 3, l, 0, 0, true);
		SetupPhysics2(f, f1, f2 * 0.66F, f3 * 0.66F, true);
		F = null;
		super.shipGrade = i;
		HNSM = k;
		super.j = j;
		hashCode = false;
		D = 0;
		Z = 0;
		I = 0;
		HNSM = 1;
		if (i == 2 || i == 3) {
			Z = 10 + l / 5;
			D = Math.min(D + 15 + (int) (l * 0.20000000000000001D), 40);
			if (GameApp.Instance.QC == 2)
				D = D / 2;
			else if (GameApp.Instance.QC == 3)
				D = 0;
			for (int i1 = 0; i1 < D; i1++) {
				explosion_property_2[i1] = (float) ((Math.random() - 0.5D) * (l * 0.050000000000000003D + 8D));
				explosion_property_3[i1] = (float) ((Math.random() - 0.5D) * (l * 0.050000000000000003D + 8D));
				explosion_property_0[i1] = f + explosion_property_2[i1] * 5F;
				explosion_property_1[i1] = f1 + explosion_property_3[i1] * 5F;
			}

			C = (float) (l * 0.20000000000000001D + 10D);
			B = C;
			if (flag) {
				int j1 = super.m / 2;
				HNSM(j1, GameApp.Instance.vZ);
				HNSM(j1, GameApp.Instance.wZ);
				HNSM(j1, GameApp.Instance.yZ);
				super.m = 0;
			}
		}

		if (i == 3 || i == 1) {
			hashCode = true;
			HNSM = k;
			if (HNSM <= 0)
				HNSM = 1;
			I = super.myAtlas.spriteFrames[super.frameIndex] * HNSM;
		}
		super.a = Math.max(I, Z);
	}

	@Override
	final void Update() {
		super.timeSinceEpoch++;
		if (super.timeSinceEpoch >= super.a) {
			Equip(true, null);
			return;
		}
		if (super.timeSinceEpoch < Z) {
			for (int i = 0; i < D; i++) {
				explosion_property_0[i] += explosion_property_2[i] + super.hSpeed;
				explosion_property_1[i] += explosion_property_3[i] + super.vSpeed;
			}

		}
		if (hashCode && super.timeSinceEpoch < I)
			super.mySprite = super.myAtlas.GetSprite(super.frameIndex, super.timeSinceEpoch / HNSM);
		UpdateWithSpeed();
	}

	@Override
	final void Draw(Canvas canvas) {
		if (super.isEnabled)
		{
			if (hashCode && super.timeSinceEpoch < I)
				super.Draw(canvas);
			if (super.timeSinceEpoch < Z && D > 0) {
				int i;
				if (F != null)
					i = F.Pick(super.timeSinceEpoch, super.a);
				else
					i = Color.lightGray.hashCode();
				for (int j = 0; j < D; j++)
					canvas.I((int) explosion_property_0[j] + (GameApp.Instance).WC,
							(int) explosion_property_1[j] + (GameApp.Instance).XC, 3, 3, i);

			}
		}
	}

	@Override
	final void I(int i, GameObject oGameObject1) {
		if (super.m > 0) {
			if (i > super.m) {
				super.m = 0;
				return;
			}
			super.m -= i;
		}
	}

	final void HNSM(int i, GameObjectPool pool)
	{
		int j1 = i * i;
		if (i <= 0)
			return;

		for (int k1 = 0; k1 < pool.mySize; k1++)
		{
			GameObject oGameObject1 = pool.internalList[k1];
			if (oGameObject1.activeMode == 1 && oGameObject1.isVisible && oGameObject1.h && oGameObject1.BI >= 0.0001F)
			{
				if (oGameObject1.l)
					HNSM(i, oGameObject1.myWeapons);

				int j = (int) (super.myX - oGameObject1.myX);
				int k = (int) (super.myY - oGameObject1.myY);
				int l = j * j + k * k;
				if (l < j1)
				{
					int i1 = ((super.m + super.n) * (i - l)) / i;
					if (i1 > 0)
					{
						oGameObject1.I(i1, this);
					}
				}
			}
		}

	}
}
