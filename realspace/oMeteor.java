package realspace;
// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.

// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   star_y

final class oMeteor extends GameObject {
	oMeteor(GameApp applet) {
		super(applet);
	}

	@Override
	final void Update() {
		if (F == -1)
			super.mySprite = super.myAtlas.GetSprite(super.frameIndex, super.myAtlas.spriteFrames[0] - 1 - super.animationIndex % super.myAtlas.spriteFrames[0]);
		else
			super.mySprite = super.myAtlas.GetSprite(super.frameIndex, super.animationIndex);
		UpdateWithSpeed();
		super.timeSinceEpoch++;
		if (super.hSpeed > 0.0F && super.myX > (GameApp.Instance).worldBorderRight
				|| super.hSpeed < 0.0F && super.myX < (GameApp.Instance).worldBorderLeft
				|| super.vSpeed > 0.0F && super.myY > (GameApp.Instance).worldBorderBottom
				|| super.vSpeed < 0.0F && super.myY < (GameApp.Instance).worldBorderTop)
			Equip(true, null);
	}

	@Override
	final void Equip(boolean flag, GameObject oGameObject1) {
		if (oGameObject1 != null && oGameObject1.JI == 8)
			super.acqScores = 0;
		super.Equip(flag, oGameObject1);
		int i = super.m + super.n / 3;
		byte byte0 = 1;
		boolean flag1 = false;
		SpriteGroup sprite_group1 = GameApp.Instance.C;
		Palette palette = null;
		if (!flag) {
			switch (super.shipGrade) {
			case 1: // '\001'
				GameApp.Instance.everySFXs.Play(GameApp.Instance.WZ, true, false);
				break;

			case 2: // '\002'
				GameApp.Instance.everySFXs.Play(GameApp.Instance.WZ, true, false);
				break;

			case 3: // '\003'
				GameApp.Instance.everySFXs.Play(GameApp.Instance.iZ, true, false);
				sprite_group1 = GameApp.Instance.C;
				palette = GameApp.Instance.FZ;
				byte0 = 3;
				flag1 = true;
				break;
			}
			Explosion explosion1 = (Explosion) GameApp.Instance.rZ.GiveLastInstanceTo(GameApp.Instance.oZ);
			if (explosion1 != null) {
				explosion1.I(sprite_group1, byte0, super.myX, super.myY, super.hSpeed, super.vSpeed, 1, 2, i, flag1);
				if (palette != null)
					explosion1.F = palette;
			}
		}
	}

	int F;
}
