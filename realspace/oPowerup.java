package realspace;
// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.

// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   star_y

import java.awt.Color;

final class oPowerup extends GameObject {
	oPowerup(GameApp applet) {
		super(applet);
	}

	final void Z(int i) {
		sprite_group sprite_group1 = null;
		switch (i) {
			case 1: // '\001'
				sprite_group1 = GameApp.Instance.iI;
				break;

			case 2: // '\002'
				sprite_group1 = GameApp.Instance.zI;
				break;

			case 3: // '\003'
				sprite_group1 = GameApp.Instance.cI;
				break;

			case 4: // '\004'
				sprite_group1 = GameApp.Instance.bI;
				break;

			case 5: // '\005'
				sprite_group1 = GameApp.Instance.dI;
				break;
		}
		super.Awake(sprite_group1, 11, 0, 0, 0, true);
		super.ascore = 500;
		F = i;
		super.BI = 1.0F;
	}

	@Override
	final void I() {
		super.s++;
		if (super.s >= 500) {
			Equip(true, null);
			return;
		}
		super.y = super.x.I(super.d, super.s >> 2);
		C();
		if (super.J < GameApp.Instance.fZ) {
			super.J = GameApp.Instance.fZ;
			super.K = Math.abs(super.K);
			F();
		} else if (super.J > GameApp.Instance.jZ) {
			super.J = GameApp.Instance.jZ;
			super.K = -Math.abs(super.K);
			F();
		}
		if (super.S < GameApp.Instance.sZ) {
			super.S = GameApp.Instance.sZ;
			super.L = Math.abs(super.L);
			F();
			return;
		}
		if (super.S > GameApp.Instance.aZ) {
			super.S = GameApp.Instance.aZ;
			super.L = -Math.abs(super.L);
			F();
		}
	}

	@Override
	final void Equip(boolean flag, GameObject oGameObject1) {
		if (!flag && oGameObject1 != null) {
			String s = "";
			switch (F) {
				case 1: // '\001'
					GameObjectPool oGameObjectlist1 = GameApp.Instance.dZ;
					oGameObjectlist1.I(0.35F, 0.35F, false, -1, -1, -1, -1);
					s = "Sheild Boost";
					break;

				case 2: // '\002'
					GameApp.Instance.kZ += 20;
					GameApp.Instance.kZ = Math.min(GameApp.Instance.kZ, 200);
					s = "Beam Weapon";
					break;

				case 3: // '\003'
					GameApp.Instance.lZ += 20;
					GameApp.Instance.lZ = Math.min(GameApp.Instance.lZ, 200);
					s = "Bolt Weapon";
					break;

				case 4: // '\004'
					GameApp.Instance.mZ += 20;
					GameApp.Instance.mZ = Math.min(GameApp.Instance.mZ, 200);
					s = "Rockets";
					break;

				case 5: // '\005'
					GameApp.Instance.eZ = 1;
					GameApp.Instance.gZ = 500;
					s = "Double Fire";
					break;
			}
			GameApp.Instance.NZ.I(GameApp.Instance.bZ, true, false);

			GameLabel gametext1 = (GameLabel) (GameApp.Instance).wC.I((GameApp.Instance).vC);
			if (gametext1 != null) {
				gametext1.Draw(s, Color.white, (GameApp.Instance).eC, false, (int) super.J, (int) super.S, 0, 45,
						0, true);
				gametext1.I(GameApp.Instance.GZ, null);
			}
		}

		super.Equip(flag, oGameObject1);
	}

	int F;
}
