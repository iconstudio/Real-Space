package src;
// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.

// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   star_y

final class oSpaceship extends oGameObject {
	oSpaceship(gameapp gameapp1) {
		super(gameapp1);
		YI = 100000F;
		thrustors = new oShipthrustor(gameapp1);
		super.k = new oGameObjectlist(gameapp1, 10);
	}

	protected final void initialize(sprite_group spr, int grade, int j, int k, int score, int attr1, int attr2,
			int attr3, boolean flag, int l1) {
		super.initialize(spr, 8, attr1, attr2, attr3, flag);
		super.ship_grade = grade;
		super.AI = j;
		super.EI = k;
		super.j = l1;
		super.J = 0.0F;
		super.S = 0.0F;
		super.K = 0.0F;
		super.L = 0.0F;
		F = 0.0F;
		I = null;
		HNSM = 0.0F;
		abs = 0;
		Z = false;
		max = 0;
		println = 0;
		super.ascore = score;
		super.BI = 1.0F;
		RI = false;
		LI = 0;
		MI = -1;
		out = false;
		NI = false;
		QI = 1;
		OI = 0;
		PI = true;
		D = 0;
		thrustors.I();
	}

	final void I(int i, int j, float f) {
		float f2 = 400F * ((gamebase) (super.owner)).view_scale;
		byte byte0 = 80;
		float f4 = 400F * ((gamebase) (super.owner)).view_scale;
		byte byte1 = 100;
		// float f7 = 400F * ((gamebase) (super.KI)).ZB;
		// byte byte2 = 80;
		float f9 = 400F * ((gamebase) (super.owner)).view_scale;
		char c = '\240';
		float f10 = 800F * ((gamebase) (super.owner)).view_scale;
		float f1;
		float f3;
		float f8;
		if (j == 2) {
			f1 = 7F * f;
			f3 = 6F * f;
			// float f5 = 7F * f;
			f8 = 7F * f;
		} else {
			f1 = 10F * f;
			f3 = 9F * f;
			// float f6 = 9F * f;
			f8 = 8F * f;
		}

		switch (i) {
		case 100: // 'd'
			initialize(super.owner.U, 1, i, j, 0, 30, 45, 95, false, 0);
			if (super.owner.QC == 1)
				thrustors.I(1, 5, 12, 16F, super.owner.Q);
			else if (super.owner.QC == 2)
				thrustors.I(1, 10, 12, 16F, super.owner.Q);
			thrustors.I(-14F, 0F);
			return;

		case 101: // 'e'
			initialize(super.owner.V, 1, i, j, 0, 30, 50, 0, false, 0);
			sprite_group sprite_group1 = super.owner.LI;
			int k = super.owner.OZ;
			weaponize(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, false, null, false, sprite_group1, null, k, 50, 40, true, 2,
					30, f3, f4, byte1);
			if (super.owner.QC == 1)
				thrustors.I(1, 5, 12, 16F, super.owner.Q);
			else if (super.owner.QC == 2)
				thrustors.I(1, 10, 12, 16F, super.owner.Q);
			thrustors.I(-10F * ((gamebase) (super.owner)).view_scale, 0F * ((gamebase) (super.owner)).view_scale);
			return;

		case 102: // 'f'
			initialize(super.owner.W, 1, i, j, 0, 30, 35, 55, false, 0);
			weaponize(16F * ((gamebase) (super.owner)).view_scale, -10F * ((gamebase) (super.owner)).view_scale, 0.0F, 0.0F,
					0.0F, 0.0F, false, null, false, super.owner.RI, super.owner.Q, super.owner.RZ, 70, 40, true, 4, 30, f8, f9,
					c);
			weaponize(16F * ((gamebase) (super.owner)).view_scale, 10F * ((gamebase) (super.owner)).view_scale, 0.0F, 0.0F,
					0.0F, 0.0F, false, null, false, super.owner.RI, super.owner.Q, super.owner.RZ, 70, 40, true, 4, 30, f8, f9,
					c);
			if (super.owner.QC == 1)
				thrustors.I(1, 5, 12, 16F, super.owner.Q);
			else if (super.owner.QC == 2)
				thrustors.I(1, 10, 12, 16F, super.owner.Q);
			thrustors.I(-15F * ((gamebase) (super.owner)).view_scale, -7F * ((gamebase) (super.owner)).view_scale);
			thrustors.I(-15F * ((gamebase) (super.owner)).view_scale, 7F * ((gamebase) (super.owner)).view_scale);
			return;

		case 103: // 'g'
			initialize(super.owner.X, 1, i, j, 0, 200, 45, 0, false, 0);
			abs();
			if (super.owner.QC == 1)
				thrustors.I(1, 5, 12, 16F, super.owner.Q);
			else if (super.owner.QC == 2)
				thrustors.I(1, 10, 12, 16F, super.owner.Q);
			thrustors.I(-15F * ((gamebase) (super.owner)).view_scale, 0F * ((gamebase) (super.owner)).view_scale);
			return;

		case 111: // 'o'
			initialize(super.owner.i, 2, i, j, 0, 50, 80, 95, false, 0);
			sprite_group sprite_group2 = super.owner.LI;
			int l = super.owner.OZ;
			weaponize(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, false, null, false, sprite_group2, null, l, 30, 20, true, 2,
					45, f3, f4, byte1);
			if (super.owner.QC == 1)
				thrustors.I(1, 5, 12, 16F, super.owner.R);
			else if (super.owner.QC == 2)
				thrustors.I(1, 10, 12, 16F, super.owner.R);
			thrustors.I(-20F * ((gamebase) (super.owner)).view_scale, 0F * ((gamebase) (super.owner)).view_scale);
			return;

		case 112: // 'p'
			initialize(super.owner.z, 2, i, j, 0, 50, 90, 110, false, 0);
			weaponize(2.0F * ((gamebase) (super.owner)).view_scale, -15F * ((gamebase) (super.owner)).view_scale, 0.0F, 0.0F,
					0.0F, 0.0F, false, null, false, super.owner.QI, super.owner.Q, super.owner.RZ, 40, 30, true, 4, 40, f8, f9,
					c);
			weaponize(2.0F * ((gamebase) (super.owner)).view_scale, 15F * ((gamebase) (super.owner)).view_scale, 0.0F, 0.0F,
					0.0F, 0.0F, false, null, false, super.owner.QI, super.owner.Q, super.owner.RZ, 40, 30, true, 4, 40, f8, f9,
					c);
			if (super.owner.QC == 1)
				thrustors.I(1, 4, 12, 16F, super.owner.R);
			else if (super.owner.QC == 2)
				thrustors.I(1, 8, 12, 16F, super.owner.R);
			thrustors.I(-15F * ((gamebase) (super.owner)).view_scale, -12F * ((gamebase) (super.owner)).view_scale);
			thrustors.I(-15F * ((gamebase) (super.owner)).view_scale, 12F * ((gamebase) (super.owner)).view_scale);
			return;

		case 120: // 'x'
			initialize(super.owner.c, 3, i, j, 0, 70, 120, 250, false, 0);
			if (super.owner.QC == 1)
				thrustors.I(1, 2, 12, 16F, super.owner.T);
			else if (super.owner.QC == 2)
				thrustors.I(1, 4, 12, 16F, super.owner.T);
			thrustors.I(-41F * ((gamebase) (super.owner)).view_scale, -28F * ((gamebase) (super.owner)).view_scale);
			thrustors.I(-41F * ((gamebase) (super.owner)).view_scale, 28F * ((gamebase) (super.owner)).view_scale);
			weaponize(30F * ((gamebase) (super.owner)).view_scale, -21F * ((gamebase) (super.owner)).view_scale,
					2.0F * ((gamebase) (super.owner)).view_scale, 0.0F, 0.0F, 0.0F, true, super.owner.KI, false, super.owner.MI,
					null, super.owner.PZ, 20, 12, true, 3, 50, super.owner.nZ, f2, 30);
			weaponize(30F * ((gamebase) (super.owner)).view_scale, 21F * ((gamebase) (super.owner)).view_scale,
					2.0F * ((gamebase) (super.owner)).view_scale, 0.0F, 0.0F, 0.0F, true, super.owner.KI, false, super.owner.MI,
					null, super.owner.PZ, 20, 12, true, 3, 50, super.owner.nZ, f2, 30);
			weaponize(-2F * ((gamebase) (super.owner)).view_scale, -45F * ((gamebase) (super.owner)).view_scale, 0.0F, 0.0F,
					0.0F, 0.0F, false, null, false, super.owner.RI, super.owner.Q, super.owner.RZ, 22, 12, true, 4, 45, f8, f9,
					c);
			weaponize(-2F * ((gamebase) (super.owner)).view_scale, 45F * ((gamebase) (super.owner)).view_scale, 0.0F, 0.0F,
					0.0F, 0.0F, false, null, false, super.owner.RI, super.owner.Q, super.owner.RZ, 22, 12, true, 4, 45, f8, f9,
					c);
			return;

		case 121: // 'y'
			initialize(super.owner.b, 3, i, j, 0, 70, 110, 250, false, 0);
			if (super.owner.QC == 1)
				thrustors.I(1, 2, 12, 16F, super.owner.T);
			else if (super.owner.QC == 2)
				thrustors.I(1, 4, 12, 16F, super.owner.T);
			thrustors.I(-50F * ((gamebase) (super.owner)).view_scale, -18F * ((gamebase) (super.owner)).view_scale);
			thrustors.I(-50F * ((gamebase) (super.owner)).view_scale, 18F * ((gamebase) (super.owner)).view_scale);
			weaponize(-2F * ((gamebase) (super.owner)).view_scale, -16F * ((gamebase) (super.owner)).view_scale,
					2.0F * ((gamebase) (super.owner)).view_scale, 0.0F, 0.0F, 0.0F, true, super.owner.KI, false, super.owner.MI,
					null, super.owner.PZ, 20, 12, true, 3, 50, super.owner.nZ, f2, 30);
			weaponize(-2F * ((gamebase) (super.owner)).view_scale, 16F * ((gamebase) (super.owner)).view_scale,
					2.0F * ((gamebase) (super.owner)).view_scale, 0.0F, 0.0F, 0.0F, true, super.owner.KI, false, super.owner.MI,
					null, super.owner.PZ, 20, 12, true, 3, 50, super.owner.nZ, f2, 30);
			return;

		case 122: // 'z'
			initialize(super.owner.d, 3, i, j, 0, 70, 100, 160, false, 0);
			if (super.owner.QC == 1)
				thrustors.I(1, 2, 12, 16F, super.owner.T);
			else if (super.owner.QC == 2)
				thrustors.I(1, 4, 12, 16F, super.owner.T);
			thrustors.I(-32F * ((gamebase) (super.owner)).view_scale, -6F * ((gamebase) (super.owner)).view_scale);
			thrustors.I(-32F * ((gamebase) (super.owner)).view_scale, 6F * ((gamebase) (super.owner)).view_scale);
			thruster_add(-5F, -40F, null, false, 40, 10, f10, 4.712389F, 1, 4, 101);
			thruster_add(-5F, 40F, null, false, 40, 10, f10, 1.570796F, 1, 4, 101);
			return;

		case 123: // '{'
			initialize(super.owner.f, 3, i, j, 0, 70, 160, 250, false, 0);
			if (super.owner.QC == 1)
				thrustors.I(1, 2, 12, 16F, super.owner.T);
			else if (super.owner.QC == 2)
				thrustors.I(1, 4, 12, 16F, super.owner.T);
			thrustors.I(-71F * ((gamebase) (super.owner)).view_scale, -11F * ((gamebase) (super.owner)).view_scale);
			thrustors.I(-74F * ((gamebase) (super.owner)).view_scale, 0.0F * ((gamebase) (super.owner)).view_scale);
			thrustors.I(-71F * ((gamebase) (super.owner)).view_scale, 11F * ((gamebase) (super.owner)).view_scale);
			thruster_add(-32F, -40F, null, false, 40, 10, f10, 4.712389F, 1, 5, 101);
			thruster_add(-32F, 40F, null, false, 40, 10, f10, 1.570796F, 1, 5, 101);
			thruster_add(34F, -32F, null, false, 40, 10, f10, 4.712389F, 1, 5, 101);
			thruster_add(34F, 32F, null, false, 40, 10, f10, 1.570796F, 1, 5, 101);
			return;

		case 130:
			initialize(super.owner.j, 4, i, j, 0, 100, 300, 500, false, 0);
			weaponize(18F * ((gamebase) (super.owner)).view_scale, -35F * ((gamebase) (super.owner)).view_scale, 0.0F, 0.0F,
					0.0F, 0.0F, true, super.owner.KI, false, super.owner.MI, null, super.owner.PZ, 12, 5, true, 3, 50,
					super.owner.nZ, f2, 30);
			weaponize(18F * ((gamebase) (super.owner)).view_scale, -18F * ((gamebase) (super.owner)).view_scale, 0.0F, 0.0F,
					0.0F, 0.0F, true, super.owner.KI, false, super.owner.MI, null, super.owner.PZ, 12, 5, true, 3, 50,
					super.owner.nZ, f2, 30);
			weaponize(-58F * ((gamebase) (super.owner)).view_scale, -18F * ((gamebase) (super.owner)).view_scale, 0.0F, 0.0F,
					0.0F, 3.926991F, false, super.owner.s, true, super.owner.PI, super.owner.Q, super.owner.RZ, 30, 25, true, 4, 50,
					f8, f9, c);
			weaponize(58F * ((gamebase) (super.owner)).view_scale, -18F * ((gamebase) (super.owner)).view_scale, 0.0F, 0.0F,
					0.0F, 5.497787F, false, super.owner.a, true, super.owner.PI, super.owner.Q, super.owner.RZ, 30, 25, true, 4, 50,
					f8, f9, c);
			weaponize(-62F * ((gamebase) (super.owner)).view_scale, 33F * ((gamebase) (super.owner)).view_scale, 0.0F, 0.0F,
					0.0F, 2.356194F, false, super.owner.e, true, super.owner.PI, super.owner.Q, super.owner.RZ, 30, 25, true, 4, 50,
					f8, f9, c);
			weaponize(62F * ((gamebase) (super.owner)).view_scale, 32F * ((gamebase) (super.owner)).view_scale, 0.0F, 0.0F,
					0.0F, 0.7853982F, false, super.owner.g, true, super.owner.PI, super.owner.Q, super.owner.RZ, 30, 25, true, 4,
					50, f8, f9, c);
			return;

		case 131:
			initialize(super.owner.h, 4, i, j, 0, 100, 300, 800, false, 0);
			return;

		case 200:
			initialize(super.owner.k, 1, i, j, 200, 30, 20, 50, false, 0);
			if (super.owner.QC == 1)
				thrustors.I(1, 5, 12, 16F, super.owner.Q);
			else if (super.owner.QC == 2)
				thrustors.I(1, 10, 12, 16F, super.owner.Q);
			thrustors.I(-14F * ((gamebase) (super.owner)).view_scale, 0F * ((gamebase) (super.owner)).view_scale);
			return;

		case 201:
			initialize(super.owner.l, 1, i, j, 200, 20, 30, 0, false, 0);
			sprite_group sprite_group3 = super.owner.WI;
			int i1 = super.owner.OZ;
			weaponize(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, false, null, false, sprite_group3, null, i1, 45, 30, true, 1,
					30, f1, f2, byte0);
			if (super.owner.QC == 1)
				thrustors.I(1, 5, 12, 16F, super.owner.Q);
			else if (super.owner.QC == 2)
				thrustors.I(1, 10, 12, 16F, super.owner.Q);
			thrustors.I(-14F * ((gamebase) (super.owner)).view_scale, 0F * ((gamebase) (super.owner)).view_scale);
			return;

		case 202:
			initialize(super.owner.m, 1, i, j, 200, 20, 20, 40, false, 0);
			sprite_group sprite_group4 = super.owner.WI;
			int j1 = super.owner.OZ;
			weaponize(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, false, null, false, sprite_group4, null, j1, 40, 30, true, 1,
					30, f1, f2, byte0);
			if (super.owner.QC == 1)
				thrustors.I(1, 5, 12, 16F, super.owner.Q);
			else if (super.owner.QC == 2)
				thrustors.I(1, 10, 12, 16F, super.owner.Q);
			thrustors.I(-14F * ((gamebase) (super.owner)).view_scale, 0F * ((gamebase) (super.owner)).view_scale);
			return;

		case 203:
			initialize(super.owner.n, 1, i, j, 300, 25, 20, 40, false, 0);
			sprite_group sprite_group5 = super.owner.OI;
			int k1 = super.owner.OZ;
			weaponize(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, false, null, false, sprite_group5, null, k1, 40, 30, true, 2,
					40, f3, f4, byte1);
			if (super.owner.QC == 1)
				thrustors.I(1, 5, 12, 16F, super.owner.Q);
			else if (super.owner.QC == 2)
				thrustors.I(1, 10, 12, 16F, super.owner.Q);
			thrustors.I(-12F * ((gamebase) (super.owner)).view_scale, -4F * ((gamebase) (super.owner)).view_scale);
			thrustors.I(-12F * ((gamebase) (super.owner)).view_scale, 4F * ((gamebase) (super.owner)).view_scale);
			return;

		case 210:
			initialize(super.owner.o, 2, i, j, 400, 50, 60, 90, false, 0);
			if (super.owner.QC == 1)
				thrustors.I(1, 5, 12, 16F, super.owner.R);
			else if (super.owner.QC == 2)
				thrustors.I(1, 10, 12, 16F, super.owner.R);
			thrustors.I(-18F * ((gamebase) (super.owner)).view_scale, -5F * ((gamebase) (super.owner)).view_scale);
			thrustors.I(-18F * ((gamebase) (super.owner)).view_scale, 5F * ((gamebase) (super.owner)).view_scale);
			return;

		case 211:
			initialize(super.owner.p, 2, i, j, 500, 40, 60, 80, false, 0);
			weaponize(13F * ((gamebase) (super.owner)).view_scale, -17F * ((gamebase) (super.owner)).view_scale, 0.0F, 0.0F,
					0.0F, 0.0F, false, null, false, super.owner.LI, null, super.owner.OZ, 50, 40, true, 1, 45, f1, f2, byte0);
			weaponize(13F * ((gamebase) (super.owner)).view_scale, 17F * ((gamebase) (super.owner)).view_scale, 0.0F, 0.0F,
					0.0F, 0.0F, false, null, false, super.owner.LI, null, super.owner.OZ, 50, 40, true, 1, 45, f1, f2, byte0);
			if (super.owner.QC == 1)
				thrustors.I(2, 5, 12, 16F, super.owner.Q);
			else if (super.owner.QC == 2)
				thrustors.I(2, 10, 12, 16F, super.owner.Q);
			thrustors.I(-18F * ((gamebase) (super.owner)).view_scale, -8F * ((gamebase) (super.owner)).view_scale);
			thrustors.I(-18F * ((gamebase) (super.owner)).view_scale, 0.0F * ((gamebase) (super.owner)).view_scale);
			thrustors.I(-18F * ((gamebase) (super.owner)).view_scale, 8F * ((gamebase) (super.owner)).view_scale);
			return;

		case 212:
			initialize(super.owner.q, 2, i, j, 600, 40, 70, 30, false, 0);
			sprite_group sprite_group6 = super.owner.WI;
			int l1 = super.owner.OZ;
			weaponize(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, false, null, false, sprite_group6, null, l1, 35, 30, true, 2,
					45, f3, f4, byte1);
			if (super.owner.QC == 1)
				thrustors.I(2, 5, 12, 16F, super.owner.Q);
			else if (super.owner.QC == 2)
				thrustors.I(2, 10, 12, 16F, super.owner.Q);
			thrustors.I(-14F * ((gamebase) (super.owner)).view_scale, -10F * ((gamebase) (super.owner)).view_scale);
			thrustors.I(-15F * ((gamebase) (super.owner)).view_scale, 2.0F * ((gamebase) (super.owner)).view_scale);
			thrustors.I(-15F * ((gamebase) (super.owner)).view_scale, -2F * ((gamebase) (super.owner)).view_scale);
			thrustors.I(-14F * ((gamebase) (super.owner)).view_scale, 10F * ((gamebase) (super.owner)).view_scale);
			return;

		case 213:
			initialize(super.owner.r, 2, i, j, 700, 50, 70, 100, false, 0);
			weaponize(0.0F * ((gamebase) (super.owner)).view_scale, -20F * ((gamebase) (super.owner)).view_scale, 0.0F, 0.0F,
					0.0F, 0.0F, false, null, false, super.owner.XI, super.owner.Q, super.owner.RZ, 35, 25, true, 4, 45, f8, f9,
					c);
			weaponize(0.0F * ((gamebase) (super.owner)).view_scale, 20F * ((gamebase) (super.owner)).view_scale, 0.0F, 0.0F,
					0.0F, 0.0F, false, null, false, super.owner.XI, super.owner.Q, super.owner.RZ, 35, 25, true, 4, 45, f8, f9,
					c);
			if (super.owner.QC == 1)
				thrustors.I(2, 5, 12, 16F, super.owner.R);
			else if (super.owner.QC == 2)
				thrustors.I(2, 10, 12, 16F, super.owner.R);
			thrustors.I(-22F * ((gamebase) (super.owner)).view_scale, -7F * ((gamebase) (super.owner)).view_scale);
			thrustors.I(-22F * ((gamebase) (super.owner)).view_scale, 7F * ((gamebase) (super.owner)).view_scale);
			return;

		case 220:
			initialize(super.owner.t, 3, i, j, 900, 70, 80, 150, false, 0);
			if (super.owner.QC == 1)
				thrustors.I(2, 3, 12, 16F, super.owner.T);
			else if (super.owner.QC == 2)
				thrustors.I(1, 3, 12, 16F, super.owner.T);
			thrustors.I(-40F * ((gamebase) (super.owner)).view_scale, -18F * ((gamebase) (super.owner)).view_scale);
			thrustors.I(-45F * ((gamebase) (super.owner)).view_scale, 0.0F * ((gamebase) (super.owner)).view_scale);
			thrustors.I(-40F * ((gamebase) (super.owner)).view_scale, 18F * ((gamebase) (super.owner)).view_scale);
			weaponize(-11F * ((gamebase) (super.owner)).view_scale, -14F * ((gamebase) (super.owner)).view_scale, 0.0F, 0.0F,
					0.0F, 0.0F, true, super.owner.HI, false, super.owner.NI, null, super.owner.PZ, 22, 12, true, 3, 60,
					super.owner.nZ, f2, 30);
			weaponize(-11F * ((gamebase) (super.owner)).view_scale, 14F * ((gamebase) (super.owner)).view_scale, 0.0F, 0.0F,
					0.0F, 0.0F, true, super.owner.HI, false, super.owner.NI, null, super.owner.PZ, 22, 12, true, 3, 60,
					super.owner.nZ, f2, 30);
			return;

		case 221:
			initialize(super.owner.u, 3, i, j, 800, 60, 60, 120, false, 0);
			if (super.owner.QC == 1)
				thrustors.I(2, 3, 12, 16F, super.owner.T);
			else if (super.owner.QC == 2)
				thrustors.I(1, 4, 12, 16F, super.owner.T);
			thrustors.I(-23F * ((gamebase) (super.owner)).view_scale, -16F * ((gamebase) (super.owner)).view_scale);
			thrustors.I(-28F * ((gamebase) (super.owner)).view_scale, 0.0F * ((gamebase) (super.owner)).view_scale);
			thrustors.I(-23F * ((gamebase) (super.owner)).view_scale, 16F * ((gamebase) (super.owner)).view_scale);
			weaponize(12F * ((gamebase) (super.owner)).view_scale, -12F * ((gamebase) (super.owner)).view_scale, 0.0F, 0.0F,
					0.0F, 0.0F, false, null, false, super.owner.XI, super.owner.Q, super.owner.RZ, 25, 12, true, 4, 45, f8, f9,
					c);
			weaponize(12F * ((gamebase) (super.owner)).view_scale, 12F * ((gamebase) (super.owner)).view_scale, 0.0F, 0.0F,
					0.0F, 0.0F, false, null, false, super.owner.XI, super.owner.Q, super.owner.RZ, 25, 12, true, 4, 45, f8, f9,
					c);
			return;

		case 222:
			initialize(super.owner.v, 3, i, j, 1000, 80, 100, 220, false, 0);
			if (super.owner.QC == 1)
				thrustors.I(2, 3, 12, 16F, super.owner.T);
			else if (super.owner.QC == 2)
				thrustors.I(1, 3, 12, 16F, super.owner.T);
			thrustors.I(-42F * ((gamebase) (super.owner)).view_scale, -15F * ((gamebase) (super.owner)).view_scale);
			thrustors.I(-50F * ((gamebase) (super.owner)).view_scale, 9F * ((gamebase) (super.owner)).view_scale);
			thrustors.I(-50F * ((gamebase) (super.owner)).view_scale, -9F * ((gamebase) (super.owner)).view_scale);
			thrustors.I(-42F * ((gamebase) (super.owner)).view_scale, 15F * ((gamebase) (super.owner)).view_scale);
			weaponize(17F * ((gamebase) (super.owner)).view_scale, -10F * ((gamebase) (super.owner)).view_scale, 0.0F, 0.0F,
					0.0F, 0.0F, true, super.owner.HI, false, super.owner.NI, null, super.owner.PZ, 25, 15, true, 3, 50,
					super.owner.nZ, f2, 30);
			weaponize(17F * ((gamebase) (super.owner)).view_scale, 10F * ((gamebase) (super.owner)).view_scale, 0.0F, 0.0F,
					0.0F, 0.0F, true, super.owner.HI, false, super.owner.NI, null, super.owner.PZ, 25, 15, true, 3, 50,
					super.owner.nZ, f2, 30);
			weaponize(5F * ((gamebase) (super.owner)).view_scale, -15F * ((gamebase) (super.owner)).view_scale, 0.0F, 0.0F,
					0.0F, 0.0F, true, super.owner.HI, false, super.owner.NI, null, super.owner.PZ, 25, 15, true, 3, 50,
					super.owner.nZ, f2, 30);
			weaponize(5F * ((gamebase) (super.owner)).view_scale, 15F * ((gamebase) (super.owner)).view_scale, 0.0F, 0.0F,
					0.0F, 0.0F, true, super.owner.HI, false, super.owner.NI, null, super.owner.PZ, 25, 15, true, 3, 50,
					super.owner.nZ, f2, 30);
			return;

		case 223:
			initialize(super.owner.w, 3, i, j, 1500, 70, 70, 150, false, 0);
			if (super.owner.QC == 1)
				thrustors.I(2, 3, 12, 16F, super.owner.T);
			else if (super.owner.QC == 2)
				thrustors.I(1, 3, 12, 16F, super.owner.T);
			thrustors.I(-18F * ((gamebase) (super.owner)).view_scale, -39F * ((gamebase) (super.owner)).view_scale);
			thrustors.I(-26F * ((gamebase) (super.owner)).view_scale, -34F * ((gamebase) (super.owner)).view_scale);
			thrustors.I(-26F * ((gamebase) (super.owner)).view_scale, 34F * ((gamebase) (super.owner)).view_scale);
			thrustors.I(-18F * ((gamebase) (super.owner)).view_scale, 39F * ((gamebase) (super.owner)).view_scale);
			thruster_add(-27F, 0.0F, null, false, 35, 15, f10, 3.141593F, 1, 5, 202);
			return;

		case 230:
			initialize(super.owner.II, 4, i, j, 5000, 100, 400, 600, false, 0);
			weaponize(0.0F * ((gamebase) (super.owner)).view_scale, 18F * ((gamebase) (super.owner)).view_scale, 0.0F, 0.0F,
					10F, 0.0F, true, super.owner.FI, false, super.owner.NI, null, super.owner.PZ, 12, 5, true, 3, 50,
					super.owner.nZ, f2, 30);
			weaponize(-52F * ((gamebase) (super.owner)).view_scale, -12F * ((gamebase) (super.owner)).view_scale, 0.0F, 0.0F,
					0.0F, 3.926991F, false, super.owner.ZI, true, super.owner.YI, super.owner.Q, super.owner.RZ, 30, 25, true, 4,
					50, f8, f9, c);
			weaponize(51F * ((gamebase) (super.owner)).view_scale, -13F * ((gamebase) (super.owner)).view_scale, 0.0F, 0.0F,
					0.0F, 5.497787F, false, super.owner.CI, true, super.owner.YI, super.owner.Q, super.owner.RZ, 30, 25, true, 4,
					50, f8, f9, c);
			weaponize(-70F * ((gamebase) (super.owner)).view_scale, 33F * ((gamebase) (super.owner)).view_scale, 0.0F, 0.0F,
					0.0F, 2.356194F, false, super.owner.BI, true, super.owner.YI, super.owner.Q, super.owner.RZ, 30, 25, true, 4,
					50, f8, f9, c);
			weaponize(70F * ((gamebase) (super.owner)).view_scale, 30F * ((gamebase) (super.owner)).view_scale, 0.0F, 0.0F,
					0.0F, 0.7853982F, false, super.owner.DI, true, super.owner.YI, super.owner.Q, super.owner.RZ, 30, 25, true, 4,
					50, f8, f9, c);
			return;

		case 231:
			initialize(super.owner.JI, 4, i, j, 10000, 100, 600, 1000, false, 0);
			weaponize(-101F * ((gamebase) (super.owner)).view_scale, 85F * ((gamebase) (super.owner)).view_scale, 4F, 0.0F,
					0.0F, 2.199115F, false, super.owner.SI, true, super.owner.XI, super.owner.Q, super.owner.RZ, 15, 5, true, 4, 50,
					f8, f9, c);
			weaponize(-40F * ((gamebase) (super.owner)).view_scale, 125F * ((gamebase) (super.owner)).view_scale, 0.0F, 0.0F,
					0.0F, 2.199115F, false, super.owner.AI, true, super.owner.XI, super.owner.Q, super.owner.RZ, 15, 5, true, 4, 50,
					f8, f9, c);
			thruster_add(61F * ((gamebase) (super.owner)).view_scale, 108F * ((gamebase) (super.owner)).view_scale,
					super.owner.EI, true, 40, 20, f10, 1.256637F, 1, 18, 203);
			thruster_add(103F * ((gamebase) (super.owner)).view_scale, 40F * ((gamebase) (super.owner)).view_scale,
					super.owner.GI, true, 40, 20, f10, 1.256637F, 1, 18, 212);
			return;

		case 150:
			initialize(super.owner.Y, 4, i, j, 0, 70, 200, 350, false, 0);
			if (super.owner.QC == 1)
				thrustors.I(2, 2, 10, 16F, super.owner.R);
			else if (super.owner.QC == 2)
				thrustors.I(1, 3, 10, 16F, super.owner.R);
			else
				thrustors.I(1, 5, 10, 16F, super.owner.R);
			thrustors.I(-16F * ((gamebase) (super.owner)).view_scale, -16F * ((gamebase) (super.owner)).view_scale);
			thrustors.I(-20F * ((gamebase) (super.owner)).view_scale, 0.0F * ((gamebase) (super.owner)).view_scale);
			thrustors.I(-16F * ((gamebase) (super.owner)).view_scale, 16F * ((gamebase) (super.owner)).view_scale);
			weaponize(10F, -6F, 0.0F, 0.0F, 0.0F, 0.0F, false, null, false, super.owner.UI, null, super.owner.QZ, 10, 0,
					false, 1, 70, super.owner.nZ, f2, 30);
			weaponize(10F, 6F, 0.0F, 0.0F, 0.0F, 0.0F, false, null, false, super.owner.VI, null, super.owner.QZ, 10, 0, false,
					1, 70, super.owner.nZ, f2, 30);
			return;
		}
		System.out.println("initStandardShip - undefined ship type");
	}

	final void I() {
		super.y = super.x.I(super.d, super.b);
		if (println > 0) {
			random--;
			if (random <= 0) {
				random = 10 + (int) (Math.random() * (double) println);
				if (super.ship_grade == 4 && super.AI != 150)
					random = random / 2;
				sprite_group sprite_group1 = null;
				switch ((int) (Math.random() * 3D)) {
				case 0: // '\0'
					sprite_group1 = super.owner.S;
					break;

				case 1: // '\001'
					sprite_group1 = super.owner.A;
					break;

				default:
					sprite_group1 = super.owner.E;
					break;
				}
				explosion explosion1 = (explosion) super.owner.rZ.I(super.owner.qZ);
				if (explosion1 != null)
					explosion1.I(sprite_group1, 1,
							super.J + (float) ((Math.random() - 0.5D) * (double) super.x.C * 0.66000000000000003D),
							super.S + (float) ((Math.random() - 0.5D) * (double) super.x.B * 0.66000000000000003D),
							super.K + (float) (Math.random() - 0.5D) * (float) super.x.B * 0.05F,
							super.L + (float) (Math.random() - 0.5D) * (float) super.x.B * 0.05F, 0, 4, 0, false);
			}
		}
		super.I();
		if (super.J < ((gamebase) (super.owner)).bC) {
			super.J = ((gamebase) (super.owner)).bC;
			super.K = 0.0F;
			F();
		} else if (super.J > ((gamebase) (super.owner)).dC) {
			super.J = ((gamebase) (super.owner)).dC;
			super.K = 0.0F;
			F();
		}
		if (super.S < ((gamebase) (super.owner)).fC) {
			super.S = ((gamebase) (super.owner)).fC;
			super.L = 0.0F;
			F();
		} else if (super.S > ((gamebase) (super.owner)).jC) {
			super.S = ((gamebase) (super.owner)).jC;
			super.L = 0.0F;
			F();
		}
		if (I != null && I.e != 1)
			I = null;
		if (super.g != null && super.g.e == 2)
			super.g = null;
		if (RI) {
			if (TI) {
				UI++;
				if (UI >= 20)
					switch (VI) {
					case 1: // '\001'
						equip(true, null);
						break;

					case 2: // '\002'
						if (UI == 20)
							I(super.J, super.S, super.K, super.L, 0.0F, 0.05F, true);
						else if (super.S > ((gamebase) (super.owner)).screen_height + super.y.J)
							equip(true, null);
						break;
					}
			} else if (Math.abs(super.Q.J - super.J) < 10F && Math.abs(super.Q.S - super.S) < 10F)
				TI = true;
		} else {
			switch (QI) {
			case 1: // '\001'
			case 4: // '\004'
			default:
				break;

			case 2: // '\002'
				if ((I == null || I.e != 1) && Math.random() * 80D > 79D)
					super.i = (float) Math.random() * 6.283185F;
				I(I);
				super.d = super.x.I(super.Y);
				break;

			case 3: // '\003'
				if (OI > 0) {
					OI--;
					if (OI == 0 && super.Q == null)
						E();
					break;
				}
				if (MI >= 0) {
					if (MI > 0) {
						MI--;
						break;
					}
					if (super.CI)
						super.e = 3;
					else
						equip(true, null);
					break;
				}
				if (super.Q == null) {
					E();
					if (super.Q != null || super.s % 20 != 0)
						break;
					float f = (super.R + super.U) - super.J;
					float f2 = (super.T + super.V) - super.S;
					if (f * f + f2 * f2 < 10000F) {
						super.R = (float) ((gamebase) (super.owner)).YC + ((gamebase) (super.owner)).sC * 0.1F
								+ (float) Math.random() * 0.8F * ((gamebase) (super.owner)).sC;
						super.T = (float) ((gamebase) (super.owner)).zC + ((gamebase) (super.owner)).aC * 0.1F
								+ (float) Math.random() * 0.8F * ((gamebase) (super.owner)).aC;
						super.U = 0.0F;
						super.V = 0.0F;
					}
					break;
				}
				if (super.Q.JI != 11)
					break;
				float f1 = (super.Q.J + super.U) - super.J;
				float f3 = (super.Q.S + super.V) - super.S;
				if (f1 * f1 + f3 * f3 >= 10000F)
					break;
				oWaypoint oWaypoint1 = (oWaypoint) super.Q;
				LI++;
				super.Q = null;
				if (oWaypoint1.I == 1) {
					MI = 25;
					explosion explosion2 = (explosion) super.owner.rZ.I(super.owner.qZ);
					if (explosion2 != null)
						explosion2.I(super.owner.sprite_group_ship, 1, (int) (super.J + super.K * 25F),
								(int) (super.S + super.L * 25F), 0.0F, 0.0F, 1, 2, 0, false);
					I(super.J, super.S, super.K, super.L, super.f);
					break;
				}
				if (oWaypoint1.I == 4) {
					LI = 0;
					E();
					break;
				}
				if (oWaypoint1.I == 2) {
					I(super.J, super.S, null, super.J + super.K * 10F, super.S + super.L * 10F, super.M, super.O, false,
							true);
					QI = 2;
				} else {
					E();
				}
				break;
			}
		}
		thrustors.I(this);
		if (Z) {
			B++;
			if (B >= C) {
				J();
				B = 0;
			}
		}
	}

	final void I(surface surface) {
		thrustors.I(surface);
		super.I(surface);
	}

	final void abs() {
		out = true;
		PI = false;
		super.U = 0.0F;
		super.V = 0.0F;
	}

	final void weaponize(float f, float f1, float f2, float f3, float f4, float f5, boolean flag,
			sprite_group sprite_group1, boolean flag1, sprite_group sprite_group2, sprite_group sprite_group3, int i,
			int j, int k, boolean flag2, int l, int i1, float f6, float f7, int j1) {
		oWeapon oWeapon1 = (oWeapon) super.owner.FC.I(super.k);
		if (oWeapon1 != null) {
			oWeapon1.I(this, flag1, f, f1, f2, f3, f4, f5, flag, sprite_group1, 0, 0, 1, 0, false);
			oWeapon1.I(sprite_group2, sprite_group3, i, j, k, flag2, l, i1, f6, f7, j1);
			abs = l;
			F += (float) i1 / ((float) j + (float) k * 0.5F);
			HNSM = Math.max(HNSM, f7);
		}
	}

	final void thruster_add(float f, float f1, sprite_group sprite_group1, boolean flag, int i, int j, float f2,
			float f3, int k, int l, int i1) {
		oWeapon oWeapon1 = (oWeapon) super.owner.FC.I(super.k);
		if (oWeapon1 != null) {
			oWeapon1.I(this, flag, f, f1, 0.0F, 0.0F, 0.0F, f3, false, sprite_group1, 0, 0, 1, 0, false);
			oWeapon1.I(i, j, f2, k, i1);
			D += l * k;
			F += 100F / ((float) i + (float) j * 0.5F);
		}
	}

	final void J() {
		oGameObjectlist oGameObjectlist1 = super.k;
		int k = oGameObjectlist1.C;
		for (int i = max + 1; i < k; i++) {
			oWeapon oWeapon1 = (oWeapon) super.k.Z[i];
			if (!oWeapon1.MI) {
				oWeapon1.J();
				max = i;
				return;
			}
		}

		for (int j = 0; j <= max; j++) {
			oWeapon oWeapon2 = (oWeapon) super.k.Z[j];
			if (!oWeapon2.MI) {
				oWeapon2.J();
				max = j;
				return;
			}
		}

	}

	protected final oGameObject A() {
		WI = null;
		if (super.EI == 2) {
			out(super.owner.vZ, HNSM);
			out(super.owner.dZ, HNSM);
			out(super.owner.EC, HNSM);
		} else if (super.EI == 1) {
			out(super.owner.wZ, HNSM);
			out(super.owner.GC, HNSM);
		}
		return WI;
	}

	protected final void out(oGameObjectlist oGameObjectlist1, float f) {
		float f8 = f * f;
		float f3 = F;
		int j = oGameObjectlist1.C;
		for (int k = 0; k < j; k++) {
			oGameObject oGameObject1 = k < 0 || k >= oGameObjectlist1.C ? null : oGameObjectlist1.Z[k];
			if (oGameObject1.e == 1 && oGameObject1.v && oGameObject1.h && oGameObject1.BI > 0.0001F) {
				if (oGameObject1.l)
					out(oGameObject1.k, f);
				float f9 = oGameObject1.J - super.J;
				float f10 = oGameObject1.S - super.S;
				if (f9 * f9 + f10 * f10 <= f8) {
					float f2 = (float) (oGameObject1.n + oGameObject1.o) / f3;
					float f1 = 0.0F;
					if (oGameObject1.JI == 8) {
						oSpaceship oSpaceship1 = (oSpaceship) oGameObject1;
						f1 = oSpaceship1.F;
					} else if (oGameObject1.JI == 7) {
						oMeteor oMeteor1 = (oMeteor) oGameObject1;
						if (((oGameObject) (oMeteor1)).L != 0.0F) {
							float f6 = (((oGameObject) (oMeteor1)).S - super.S) / ((oGameObject) (oMeteor1)).L;
							if (f6 > 7F && f6 < 50F) {
								float f7 = ((oGameObject) (oMeteor1)).J + ((oGameObject) (oMeteor1)).K * f6;
								int i;
								if (((oGameObject) (oMeteor1)).ship_grade == 3)
									i = ((oGameObject) (oMeteor1)).m / 2;
								else
									i = ((oGameObject) (oMeteor1)).x.C / 2;
								if ((float) super.A < f7 + (float) i && (float) super.G > f7 - (float) i)
									f1 = ((oGameObject) (oMeteor1)).m;
							}
						}
					}
					f1 *= oGameObject1.BI;
					float f4;
					if (f1 > 0.0F)
						f4 = (float) (super.n + super.o) / f1;
					else if (oGameObject1.BI > 1.0F)
						f4 = 10F / oGameObject1.BI;
					else
						f4 = YI;
					if ((double) f4 != 0.0D) {
						float f5;
						if (super.EI == 2)
							f5 = f4 * f2 * ((float) Math.random() * 1.5F + 0.75F);
						else
							f5 = f4 * f2 * ((float) Math.random() * 0.5F + 0.75F);
						if (WI == null || f5 < XI) {
							WI = oGameObject1;
							XI = f5;
						}
					}
				}
			}
		}

	}

	@SuppressWarnings("unused")
	final void E() {
		Object obj = null;
		gameobjectivelist gameobjectivelist1;
		if (super.EI == 2)
			gameobjectivelist1 = super.owner.Mission.C;
		else
			gameobjectivelist1 = super.owner.Mission.I;
		oGameObjectlist oGameObjectlist2;
		while (obj == null && LI < (oGameObjectlist2 = gameobjectivelist1.D).C) {
			oGameObjectlist oGameObjectlist1 = gameobjectivelist1.D;
			int i = LI;
			oWaypoint oWaypoint1 = (oWaypoint) (i < 0 || i >= oGameObjectlist1.C ? null : oGameObjectlist1.Z[i]);
			if (oWaypoint1.Z == -1 || super.AI == oWaypoint1.Z)
				obj = oWaypoint1;
			else
				LI++;
		}
		if (obj == null)
			obj = I(-1F);
		if (obj != null) {
			if (super.DI != 8) {
				I(super.J, super.S, ((oGameObject) (obj)), 0.0F, 0.0F, super.M, super.c, super.O, super.f);
			} else {
				super.Q = ((oGameObject) (obj));
				super.P = true;
			}
			if (PI) {
				super.U = ((float) Math.random() - 0.5F) * 200F;
				super.V = ((float) Math.random() - 0.5F) * 200F;
			}
		}
	}

	protected final oGameObject I(float f) {
		WI = null;
		if (super.EI == 2) {
			println(super.owner.vZ, f);
			println(super.owner.EC, f);
			if (WI == null)
				println(super.owner.dZ, f);
		} else if (super.EI == 1) {
			println(super.owner.wZ, f);
			println(super.owner.GC, f);
		}
		return WI;
	}

	protected final void println(oGameObjectlist oGameObjectlist1, float f) {
		float f8 = f * f;
		float f3 = F;
		int j = oGameObjectlist1.C;
		for (int k = 0; k < j; k++) {
			oGameObject oGameObject1 = k < 0 || k >= oGameObjectlist1.C ? null : oGameObjectlist1.Z[k];
			if (oGameObject1.e == 1 && oGameObject1.v && oGameObject1.h && oGameObject1.BI > 0.0001F) {
				float f10 = oGameObject1.J - super.J;
				float f11 = oGameObject1.S - super.S;
				float f9 = f10 * f10 + f11 * f11;
				if (f <= 0.0F || f9 <= f8) {
					float f2 = (float) (oGameObject1.n + oGameObject1.o) / f3;
					float f1 = 0.0F;
					if (oGameObject1.JI == 8) {
						oSpaceship oSpaceship1 = (oSpaceship) oGameObject1;
						f1 = oSpaceship1.F;
					} else if (oGameObject1.JI == 7) {
						oMeteor oMeteor1 = (oMeteor) oGameObject1;
						if (((oGameObject) (oMeteor1)).L != 0.0F) {
							float f6 = (((oGameObject) (oMeteor1)).S - super.S) / ((oGameObject) (oMeteor1)).L;
							if (f6 > 7F && f6 < 50F) {
								float f7 = ((oGameObject) (oMeteor1)).J + ((oGameObject) (oMeteor1)).K * f6;
								int i;
								if (((oGameObject) (oMeteor1)).ship_grade == 3)
									i = ((oGameObject) (oMeteor1)).m / 2;
								else
									i = ((oGameObject) (oMeteor1)).x.C / 2;
								if ((float) super.A < f7 + (float) i && (float) super.G > f7 - (float) i)
									f1 = ((oGameObject) (oMeteor1)).m;
							}
						}
					}
					float f4;
					if (f1 > 0.0F)
						f4 = (float) (super.n + super.o) / f1;
					else if (oGameObject1.BI > 1.0F)
						f4 = 10F / oGameObject1.BI;
					else
						f4 = YI;
					if ((double) f4 != 0.0D) {
						float f5 = f4 * f2 * ((float) Math.random() * 0.625F + 0.75F);
						f5 *= 1.0F / oGameObject1.BI;
						f5 *= 1.0F - Math.min(5000F / (float) Math.sqrt(f9), 0.001F);
						if (WI == null || f5 < XI) {
							WI = oGameObject1;
							XI = f5;
						}
					}
				}
			}
		}

	}

	final void I(oSpaceship oSpaceship1, int i, float f) {
		RI = true;
		VI = i;
		UI = 0;
		TI = false;
		I(super.J, super.S, oSpaceship1, 0.0F, 0.0F, f, 0.2F, false, true);
	}

	final void equip(boolean flag, oGameObject oGameObject1) {
		if (flag)
			super.ascore = 0;
		else if (super.EI == 2 && oGameObject1 != null && (oGameObject1.JI == 8 && oGameObject1.AI == 150
				|| oGameObject1.JI == 6 && oGameObject1.g != null && oGameObject1.g.g != null && oGameObject1.g.g.AI == 150)) {
			boolean flag1 = false;
			if (super.owner.Mission.J > 0 && Math.random() < (double) super.owner.Mission.D) {
				flag1 = true;
			} else {
				super.owner.Mission.G++;
				int i = Math.round((1.0F / super.owner.Mission.D) * 1.5F);
				if (super.owner.Mission.G >= i)
					flag1 = true;
			}
			if (flag1) {
				super.owner.Mission.G = 0;
				int k = super.owner.Mission.J;
				int l = -1;
				int i1 = (int) (Math.random() * (double) super.owner.Mission.E);
				for (int j1 = 0; j1 < k && l == -1; j1++) {
					int j = super.owner.Mission.A[j1];
					if (i1 > j)
						i1 -= j;
					else
						l = super.owner.Mission.S[j1];
				}

				if (l != -1) {
					oPowerup oPowerup1 = (oPowerup) super.owner.DC.I(super.owner.BC);
					if (oPowerup1 != null) {
						oPowerup1.Z(l);
						float f3 = super.K * 0.3F;
						float f4 = super.L * 0.3F;
						if (super.J < (float) ((gamebase) (super.owner)).YC + ((gamebase) (super.owner)).screen_width * 2.0F
								&& super.K < 0.0F)
							super.K = -super.K;
						if (super.J > (float) ((gamebase) (super.owner)).iC - ((gamebase) (super.owner)).screen_width * 2.0F
								&& super.K > 0.0F)
							super.K = -super.K;
						if (super.S < (float) ((gamebase) (super.owner)).zC + ((gamebase) (super.owner)).screen_height * 2.0F
								&& super.L < 0.0F)
							super.L = -super.L;
						if (super.S > (float) ((gamebase) (super.owner)).cC - ((gamebase) (super.owner)).screen_height * 2.0F
								&& super.L > 0.0F)
							super.L = -super.L;
						oPowerup1.I(super.J, super.S, f3, f4, true);
					}
				}
			}
		} else {
			super.ascore = 0;
		}
		super.equip(flag, oGameObject1);
		byte byte0 = 0;
		byte byte1 = 0;
		if (!flag) {
			sprite_group sprite_group1 = null;
			palette palette = null;
			float f = (float) Math.random();
			if ((double) f > 0.67000000000000004D)
				sprite_group1 = super.owner.D;
			else if ((double) f > 0.33000000000000002D)
				sprite_group1 = super.owner.B;
			else
				sprite_group1 = super.owner.C;
			switch (super.ship_grade) {
			default:
				break;

			case 1: // '\001'
				if (super.owner.QC == 1)
					byte1 = 2;
				else if (super.owner.QC == 2)
					byte1 = 1;
				if (super.EI == 2) {
					if (super.AI == 102)
						super.owner.NZ.I(super.owner.XZ, true, false);
					else
						super.owner.NZ.I(super.owner.TZ, true, false);
					palette = super.owner.DZ;
				} else if (super.EI == 1) {
					super.owner.NZ.I(super.owner.TZ, true, false);
					palette = super.owner.FZ;
				}
				break;

			case 2: // '\002'
				if (super.owner.QC == 1)
					byte1 = 3;
				else if (super.owner.QC == 2)
					byte1 = 1;
				super.owner.NZ.I(super.owner.WZ, true, false);
				if (super.EI == 2) {
					palette = super.owner.DZ;
					break;
				}
				if (super.EI == 1)
					palette = super.owner.FZ;
				break;

			case 3: // '\003'
				if (super.owner.QC == 1)
					byte1 = 4;
				else if (super.owner.QC == 2)
					byte1 = 2;
				if (super.EI == 2) {
					super.owner.NZ.I(super.owner.XZ, true, false);
					palette = super.owner.DZ;
					break;
				}
				if (super.EI == 1) {
					super.owner.NZ.I(super.owner.YZ, true, false);
					palette = super.owner.FZ;
				}
				break;

			case 4: // '\004'
				if (super.owner.QC == 1)
					byte1 = 7;
				else if (super.owner.QC == 2)
					byte1 = 3;
				byte0 = 5;
				if (super.EI == 2) {
					super.owner.NZ.I(super.owner.YZ, true, false);
					palette = super.owner.DZ;
					break;
				}
				if (super.EI == 1) {
					super.owner.NZ.I(super.owner.YZ, true, false);
					palette = super.owner.FZ;
				}
				break;
			}
			explosion explosion1 = (explosion) super.owner.rZ.I(super.owner.oZ);
			if (explosion1 != null) {
				explosion1.I(sprite_group1, 3, super.J, super.S, super.K, super.L, 1, 2, super.m + super.n, out);
				if (palette != null)
					explosion1.F = palette;
			}
			for (int k1 = 0; k1 < byte1; k1++) {
				sprite_group sprite_group2;
				if (super.AI >= 200 && super.AI < 300) {
					float f1 = (float) Math.random();
					if ((double) f1 > 0.75D)
						sprite_group2 = super.owner.G;
					else if ((double) f1 > 0.5D)
						sprite_group2 = super.owner.H;
					else if ((double) f1 > 0.25D)
						sprite_group2 = super.owner.K;
					else
						sprite_group2 = super.owner.L;
				} else {
					float f2 = (float) Math.random();
					if ((double) f2 > 0.75D)
						sprite_group2 = super.owner.M;
					else if ((double) f2 > 0.5D)
						sprite_group2 = super.owner.N;
					else if ((double) f2 > 0.25D)
						sprite_group2 = super.owner.O;
					else
						sprite_group2 = super.owner.P;
				}
				explosionbit explosionbit1 = (explosionbit) super.owner.uZ.I(super.owner.tZ);
				if (explosionbit1 != null)
					explosionbit1.I(sprite_group2, super.owner.J, this, super.m + super.n);
			}

			for (int l1 = 0; l1 < byte0; l1++) {
				explosion explosion2 = (explosion) super.owner.rZ.I(super.owner.qZ);
				if (explosion2 != null) {
					explosion2.I(sprite_group1, 3,
							super.J + (float) (Math.random() * (double) super.y.C - (double) super.y.D),
							super.S + (float) (Math.random() * (double) super.y.B - (double) super.y.F), super.K,
							super.L, 1, 2, 300, false);
					explosion2.s = (int) (Math.random() * -30D);
				}
			}

		}
	}

	final boolean Z(oGameObject oGameObject1) {
		if (oGameObject1.JI != 10 && super.Z(oGameObject1))
			return true;
		if (oGameObject1.JI == 8 || oGameObject1.JI == 10) {
			if (oGameObject1.JI == 10 && super.Q != null && super.Q.JI == 11)
				return false;
			int i = (int) (super.J - oGameObject1.J);
			if (i > -500 && i < 500) {
				int j = (int) (super.S - oGameObject1.S);
				if (j > -500 && j < 500) {
					int k = (int) (HNSM * 0.6F);
					int l = super.y.A + oGameObject1.y.A;
					if (l > k) {
						k = l;
						if (oGameObject1.JI == 8)
							if (oGameObject1.ship_grade == 4)
								k = (int) ((float) k * 1.5F);
							else
								k = (int) ((float) k * 2.5F);
					}
					int i1 = k * k;
					int j1 = i * i + j * j;
					if (j1 < i1) {
						random(i, j, j1);
						if (oGameObject1.JI == 8) {
							oSpaceship oSpaceship1 = (oSpaceship) oGameObject1;
							oSpaceship1.random(-i, -j, j1);
						}
					}
				}
			}
		}
		return false;
	}

	final void random(int i, int j, int k) {
		if (OI > 0 || !PI || QI != 3)
			return;
		float f;
		float f1;
		if (k == 0) {
			f = 0.0F;
			f1 = 1.0F;
		} else {
			float f2 = (float) Math.sqrt((float) k);
			f = (float) i / f2;
			f1 = (float) j / f2;
		}
		super.R = super.J + f * (0.7F + (float) Math.random() * 0.6F) * 300F + ((float) Math.random() * 300F - 150F);
		super.T = super.S + f1 * (0.7F + (float) Math.random() * 0.6F) * 300F + ((float) Math.random() * 300F - 150F);
		super.Q = null;
		OI = 60;
	}

	final void I(oGameObject oGameObject1, int i, int j) {
		if (i > 0 && super.q > 0) {
			println = 5 + (int) (Math.sin((double) ((float) super.o / (float) super.q) * 1.5707963267948966D) * 20D);
			random = 0;
		} else {
			println = 0;
		}
		super.I(oGameObject1, i, j);
	}

	float F;
	oGameObject I;
	float HNSM;
	int abs;
	boolean Z;
	int C;
	int B;
	int max;
	int D;
	oShipthrustor thrustors;
	boolean out;
	int println;
	int random;
	int LI;
	int MI;
	boolean NI;
	int OI;
	boolean PI;
	int QI;
	boolean RI;
	boolean TI;
	int UI;
	int VI;
	oGameObject WI;
	float XI;
	float YI;
}
