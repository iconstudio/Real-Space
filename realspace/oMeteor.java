package realspace;
// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.

// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   star_y

final class oMeteor extends oGameObject {
	oMeteor(gameapp gameapp1) {
		super(gameapp1);
	}

	@Override
	final void I() {
		if (F == -1)
			super.y = super.x.I(super.d, super.x.I[0] - 1 - super.b % super.x.I[0]);
		else
			super.y = super.x.I(super.d, super.b);
		C();
		super.s++;
		if (super.K > 0.0F && super.J > ((gamebase) (super.owner)).dC
				|| super.K < 0.0F && super.J < ((gamebase) (super.owner)).bC
				|| super.L > 0.0F && super.S > ((gamebase) (super.owner)).jC
				|| super.L < 0.0F && super.S < ((gamebase) (super.owner)).fC)
			equip(true, null);
	}

	@Override
	final void equip(boolean flag, oGameObject oGameObject1) {
		if (oGameObject1 != null && oGameObject1.JI == 8)
			super.ascore = 0;
		super.equip(flag, oGameObject1);
		int i = super.m + super.n / 3;
		byte byte0 = 1;
		boolean flag1 = false;
		sprite_group sprite_group1 = super.owner.C;
		palette palette = null;
		if (!flag) {
			switch (super.ship_grade) {
			case 1: // '\001'
				super.owner.NZ.I(super.owner.WZ, true, false);
				break;

			case 2: // '\002'
				super.owner.NZ.I(super.owner.WZ, true, false);
				break;

			case 3: // '\003'
				super.owner.NZ.I(super.owner.iZ, true, false);
				sprite_group1 = super.owner.C;
				palette = super.owner.FZ;
				byte0 = 3;
				flag1 = true;
				break;
			}
			explosion explosion1 = (explosion) super.owner.rZ.I(super.owner.oZ);
			if (explosion1 != null) {
				explosion1.I(sprite_group1, byte0, super.J, super.S, super.K, super.L, 1, 2, i, flag1);
				if (palette != null)
					explosion1.F = palette;
			}
		}
	}

	int F;
}
