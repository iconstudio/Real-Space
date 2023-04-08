package realspace;
// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.

// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   star_y

final class explosionbit extends GameObject {

	explosionbit(GameApp gameapp1) {
		super(gameapp1);
	}

	final void I(sprite_group sprite_group1, sprite_group sprite_group2, GameObject oGameObject1, int i) {
		super.initialize(sprite_group1, 10, i, 0, 0, true);
		HNSM = sprite_group2;
		I = 0.1F + (float) Math.random() * 0.1F * 6.283185F;
		if (Math.random() < 0.5D)
			I = I * -1F;
		super.Y = (float) Math.random() * 6.283185F;
		I(oGameObject1.J, oGameObject1.S,
				(float) ((Math.random() - 0.5D) * (i * 0.12D + 15D)) + oGameObject1.K * 0.65F,
				(float) ((Math.random() - 0.5D) * (i * 0.12D + 15D)) + oGameObject1.L * 0.65F, false);
		super.a = (int) ((float) Math.random() * 20F) + 6 + i / 4;
	}

	@Override
	final void I() {
		super.s++;
		if (super.s >= super.a) {
			equip(true, null);
			return;
		}
		super.Y += I;
		if (super.Y < 0.0F)
			for (; super.Y < 0.0F; super.Y += 6.283185F)
				;
		else if (super.Y >= 6.283185F)
			for (; super.Y >= 6.283185F; super.Y -= 6.283185F)
				;
		super.d = super.x.I(super.Y);
		super.y = super.x.I(super.d, super.b);
		C();
		if (super.s % 2 == 0 && HNSM != null) {
			Explosion explosion1 = (Explosion) GameApp.Instance.rZ.I(GameApp.Instance.pZ);
			if (explosion1 != null)
				explosion1.I(HNSM, 1, super.J, super.S, super.K * 0.1F, super.L * 0.1F, 0, 1, 0, false);
		}
	}

	sprite_group HNSM;
	float I;
}
