package realspace;
// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.

// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   star_y

import java.awt.Color;

final class oPowerup extends oGameObject {
	oPowerup(gameapp gameapp1) {
		super(gameapp1);
	}

	final void Z(int i) {
		sprite_group sprite_group1 = null;
		switch (i) {
		case 1: // '\001'
			sprite_group1 = super.owner.iI;
			break;

		case 2: // '\002'
			sprite_group1 = super.owner.zI;
			break;

		case 3: // '\003'
			sprite_group1 = super.owner.cI;
			break;

		case 4: // '\004'
			sprite_group1 = super.owner.bI;
			break;

		case 5: // '\005'
			sprite_group1 = super.owner.dI;
			break;
		}
		super.initialize(sprite_group1, 11, 0, 0, 0, true);
		super.ascore = 500;
		F = i;
		super.BI = 1.0F;
	}

	@Override
	final void I() {
		super.s++;
		if (super.s >= 500) {
			equip(true, null);
			return;
		}
		super.y = super.x.I(super.d, super.s >> 2);
		C();
		if (super.J < super.owner.fZ) {
			super.J = super.owner.fZ;
			super.K = Math.abs(super.K);
			F();
		} else if (super.J > super.owner.jZ) {
			super.J = super.owner.jZ;
			super.K = -Math.abs(super.K);
			F();
		}
		if (super.S < super.owner.sZ) {
			super.S = super.owner.sZ;
			super.L = Math.abs(super.L);
			F();
			return;
		}
		if (super.S > super.owner.aZ) {
			super.S = super.owner.aZ;
			super.L = -Math.abs(super.L);
			F();
		}
	}

	@Override
	final void equip(boolean flag, oGameObject oGameObject1) {
		if (!flag && oGameObject1 != null) {
			String s = "";
			switch (F) {
			case 1: // '\001'
				oGameObjectlist oGameObjectlist1 = super.owner.dZ;
				oGameObjectlist1.I(0.35F, 0.35F, false, -1, -1, -1, -1);
				s = "Sheild Boost";
				break;

			case 2: // '\002'
				super.owner.kZ += 20;
				super.owner.kZ = Math.min(super.owner.kZ, 200);
				s = "Beam Weapon";
				break;

			case 3: // '\003'
				super.owner.lZ += 20;
				super.owner.lZ = Math.min(super.owner.lZ, 200);
				s = "Bolt Weapon";
				break;

			case 4: // '\004'
				super.owner.mZ += 20;
				super.owner.mZ = Math.min(super.owner.mZ, 200);
				s = "Rockets";
				break;

			case 5: // '\005'
				super.owner.eZ = 1;
				super.owner.gZ = 500;
				s = "Double Fire";
				break;
			}
			super.owner.NZ.I(super.owner.bZ, true, false);
			gametext gametext1 = (gametext) ((gamebase) (super.owner)).wC.I(((gamebase) (super.owner)).vC);
			if (gametext1 != null) {
				gametext1.I(s, Color.white, ((gamebase) (super.owner)).eC, false, (int) super.J, (int) super.S, 0, 45,
						0, true);
				gametext1.I(super.owner.GZ, null);
			}
		}
		super.equip(flag, oGameObject1);
	}

	int F;
}
