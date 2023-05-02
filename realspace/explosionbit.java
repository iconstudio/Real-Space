package realspace;

final class explosionbit extends GameObject
{
	explosionbit(GameApp applet)
	{
		super(applet);
	}

	final void I(SpriteGroup sprite_group1, SpriteGroup sprite_group2, GameObject oGameObject1, int i)
	{
		super.Awake(sprite_group1, 10, i, 0, 0, true);
		HNSM = sprite_group2;
		
		I = 0.1F + (float) Math.random() * 0.1F * 6.283185F;
		if (Math.random() < 0.5D)
			I = I * -1F;
		super.myRotation = (float) Math.random() * 6.283185F;

		SetupPhysics2(oGameObject1.myX, oGameObject1.myY,
				(float) ((Math.random() - 0.5D) * (i * 0.12D + 15D)) + oGameObject1.hSpeed * 0.65F,
				(float) ((Math.random() - 0.5D) * (i * 0.12D + 15D)) + oGameObject1.vSpeed * 0.65F, false);

		super.a = (int) ((float) Math.random() * 20F) + 6 + i / 4;
	}

	@Override
	final void Update()
	{
		super.timeSinceEpoch++;
		if (super.timeSinceEpoch >= super.a)
		{
			Equip(true, null);
			return;
		}

		super.myRotation += I;
		if (super.myRotation < 0.0F)
		{
			for (; super.myRotation < 0.0F; super.myRotation += 6.283185F)
			{};
		}
		else if (super.myRotation >= 6.283185F)
		{
			for (; super.myRotation >= 6.283185F; super.myRotation -= 6.283185F)
			{};
		}

		super.frameIndex = super.myAtlas.GetFrameByRotation(super.myRotation);
		super.mySprite = super.myAtlas.GetSprite(super.frameIndex, super.animationIndex);
		UpdateWithSpeed();

		if (super.timeSinceEpoch % 2 == 0 && HNSM != null)
		{
			Explosion explosion1 = (Explosion) GameApp.Instance.rZ.GiveLastInstanceTo(GameApp.Instance.pZ);

			if (explosion1 != null)
			{
				explosion1.I(HNSM, 1, super.myX, super.myY, super.hSpeed * 0.1F, super.vSpeed * 0.1F, 0, 1, 0, false);
			}
		}
	}

	SpriteGroup HNSM;
	float I;
}
