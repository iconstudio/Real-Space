package realspace;

final class oSpaceship extends GameObject
{
	public oSpaceship(final GameApp applet)
	{
		super(applet);
		YI = 100000F;

		myThrustors = new oShipthrustor(applet);
		myWeapons = new GameObjectPool(applet, 10);
	}

	protected final void Initialize(final SpriteGroup atlas, final int ship_grade, final int j, final int k, final int score, final int attr1, final int attr2, final int attr3, final boolean flag, final int l1)
	{
		super.Awake(atlas, 8, attr1, attr2, attr3, flag);
		super.shipGrade = ship_grade;
		super.AI = j;
		super.EI = k;
		super.j = l1;
		
		myX = 0.0F;
		myY = 0.0F;
		hSpeed = 0.0F;
		vSpeed = 0.0F;
		F = 0.0F;
		I = null;
		HNSM = 0.0F;
		abs = 0;
		Z = false;
		max = 0;
		println = 0;
		super.acqScores = score;
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
		myThrustors.I();
	}

	final void I(final int i, final int j, final float f) {
		final float f2 = 400F * gameApplet.viewScale;
		final byte byte0 = 80;
		final float f4 = 400F * gameApplet.viewScale;
		final byte byte1 = 100;
		// float f7 = 400F * ((gamebase) (super.KI)).ZB;
		// byte byte2 = 80;
		final float f9 = 400F * gameApplet.viewScale;
		final char c = '\240';
		final float f10 = 800F * gameApplet.viewScale;
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
			Initialize(gameApplet.U, 1, i, j, 0, 30, 45, 95, false, 0);
			if (gameApplet.QC == 1)
				myThrustors.I(1, 5, 12, 16F, gameApplet.Q);
			else if (gameApplet.QC == 2)
				myThrustors.I(1, 10, 12, 16F, gameApplet.Q);
			myThrustors.I(-14F, 0F);
			return;

		case 101: // 'e'
			Initialize(gameApplet.V, 1, i, j, 0, 30, 50, 0, false, 0);
			final SpriteGroup sprite_group1 = gameApplet.LI;
			final int k = gameApplet.OZ;
			weaponize(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, false, null, false, sprite_group1, null, k, 50, 40, true, 2,
					30, f3, f4, byte1);
			if (gameApplet.QC == 1)
				myThrustors.I(1, 5, 12, 16F, gameApplet.Q);
			else if (gameApplet.QC == 2)
				myThrustors.I(1, 10, 12, 16F, gameApplet.Q);
			myThrustors.I(-10F * gameApplet.viewScale, 0F * gameApplet.viewScale);
			return;

		case 102: // 'f'
			Initialize(gameApplet.W, 1, i, j, 0, 30, 35, 55, false, 0);
			weaponize(16F * gameApplet.viewScale, -10F * gameApplet.viewScale, 0.0F,
					0.0F, 0.0F, 0.0F, false, null, false, gameApplet.RI, gameApplet.Q, gameApplet.RZ, 70, 40, true,
					4, 30, f8, f9, c);
			weaponize(16F * gameApplet.viewScale, 10F * gameApplet.viewScale, 0.0F,
					0.0F, 0.0F, 0.0F, false, null, false, gameApplet.RI, gameApplet.Q, gameApplet.RZ, 70, 40, true,
					4, 30, f8, f9, c);
			if (gameApplet.QC == 1)
				myThrustors.I(1, 5, 12, 16F, gameApplet.Q);
			else if (gameApplet.QC == 2)
				myThrustors.I(1, 10, 12, 16F, gameApplet.Q);
			myThrustors.I(-15F * gameApplet.viewScale, -7F * gameApplet.viewScale);
			myThrustors.I(-15F * gameApplet.viewScale, 7F * gameApplet.viewScale);
			return;

		case 103: // 'g'
			Initialize(gameApplet.X, 1, i, j, 0, 200, 45, 0, false, 0);
			abs();
			if (gameApplet.QC == 1)
				myThrustors.I(1, 5, 12, 16F, gameApplet.Q);
			else if (gameApplet.QC == 2)
				myThrustors.I(1, 10, 12, 16F, gameApplet.Q);
			myThrustors.I(-15F * gameApplet.viewScale, 0F * gameApplet.viewScale);
			return;

		case 111: // 'o'
			Initialize(gameApplet.i, 2, i, j, 0, 50, 80, 95, false, 0);
			final SpriteGroup sprite_group2 = gameApplet.LI;
			final int l = gameApplet.OZ;
			weaponize(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, false, null, false, sprite_group2, null, l, 30, 20, true, 2,
					45, f3, f4, byte1);
			if (gameApplet.QC == 1)
				myThrustors.I(1, 5, 12, 16F, gameApplet.R);
			else if (gameApplet.QC == 2)
				myThrustors.I(1, 10, 12, 16F, gameApplet.R);
			myThrustors.I(-20F * gameApplet.viewScale, 0F * gameApplet.viewScale);
			return;

		case 112: // 'p'
			Initialize(gameApplet.z, 2, i, j, 0, 50, 90, 110, false, 0);
			weaponize(2.0F * gameApplet.viewScale, -15F * gameApplet.viewScale, 0.0F,
					0.0F, 0.0F, 0.0F, false, null, false, gameApplet.QI, gameApplet.Q, gameApplet.RZ, 40, 30, true,
					4, 40, f8, f9, c);
			weaponize(2.0F * gameApplet.viewScale, 15F * gameApplet.viewScale, 0.0F,
					0.0F, 0.0F, 0.0F, false, null, false, gameApplet.QI, gameApplet.Q, gameApplet.RZ, 40, 30, true,
					4, 40, f8, f9, c);
			if (gameApplet.QC == 1)
				myThrustors.I(1, 4, 12, 16F, gameApplet.R);
			else if (gameApplet.QC == 2)
				myThrustors.I(1, 8, 12, 16F, gameApplet.R);
			myThrustors.I(-15F * gameApplet.viewScale, -12F * gameApplet.viewScale);
			myThrustors.I(-15F * gameApplet.viewScale, 12F * gameApplet.viewScale);
			return;

		case 120: // 'x'
			Initialize(gameApplet.c, 3, i, j, 0, 70, 120, 250, false, 0);
			if (gameApplet.QC == 1)
				myThrustors.I(1, 2, 12, 16F, gameApplet.T);
			else if (gameApplet.QC == 2)
				myThrustors.I(1, 4, 12, 16F, gameApplet.T);
			myThrustors.I(-41F * gameApplet.viewScale, -28F * gameApplet.viewScale);
			myThrustors.I(-41F * gameApplet.viewScale, 28F * gameApplet.viewScale);
			weaponize(30F * gameApplet.viewScale, -21F * gameApplet.viewScale,
					2.0F * gameApplet.viewScale, 0.0F, 0.0F, 0.0F, true, gameApplet.KI, false,
					gameApplet.MI, null, gameApplet.PZ, 20, 12, true, 3, 50, gameApplet.nZ, f2, 30);
			weaponize(30F * gameApplet.viewScale, 21F * gameApplet.viewScale,
					2.0F * gameApplet.viewScale, 0.0F, 0.0F, 0.0F, true, gameApplet.KI, false,
					gameApplet.MI, null, gameApplet.PZ, 20, 12, true, 3, 50, gameApplet.nZ, f2, 30);
			weaponize(-2F * gameApplet.viewScale, -45F * gameApplet.viewScale, 0.0F,
					0.0F, 0.0F, 0.0F, false, null, false, gameApplet.RI, gameApplet.Q, gameApplet.RZ, 22, 12, true,
					4, 45, f8, f9, c);
			weaponize(-2F * gameApplet.viewScale, 45F * gameApplet.viewScale, 0.0F,
					0.0F, 0.0F, 0.0F, false, null, false, gameApplet.RI, gameApplet.Q, gameApplet.RZ, 22, 12, true,
					4, 45, f8, f9, c);
			return;

		case 121: // 'y'
			Initialize(gameApplet.b, 3, i, j, 0, 70, 110, 250, false, 0);
			if (gameApplet.QC == 1)
				myThrustors.I(1, 2, 12, 16F, gameApplet.T);
			else if (gameApplet.QC == 2)
				myThrustors.I(1, 4, 12, 16F, gameApplet.T);
			myThrustors.I(-50F * gameApplet.viewScale, -18F * gameApplet.viewScale);
			myThrustors.I(-50F * gameApplet.viewScale, 18F * gameApplet.viewScale);
			weaponize(-2F * gameApplet.viewScale, -16F * gameApplet.viewScale,
					2.0F * gameApplet.viewScale, 0.0F, 0.0F, 0.0F, true, gameApplet.KI, false,
					gameApplet.MI, null, gameApplet.PZ, 20, 12, true, 3, 50, gameApplet.nZ, f2, 30);
			weaponize(-2F * gameApplet.viewScale, 16F * gameApplet.viewScale,
					2.0F * gameApplet.viewScale, 0.0F, 0.0F, 0.0F, true, gameApplet.KI, false,
					gameApplet.MI, null, gameApplet.PZ, 20, 12, true, 3, 50, gameApplet.nZ, f2, 30);
			return;

		case 122: // 'z'
			Initialize(gameApplet.d, 3, i, j, 0, 70, 100, 160, false, 0);
			if (gameApplet.QC == 1)
				myThrustors.I(1, 2, 12, 16F, gameApplet.T);
			else if (gameApplet.QC == 2)
				myThrustors.I(1, 4, 12, 16F, gameApplet.T);
			myThrustors.I(-32F * gameApplet.viewScale, -6F * gameApplet.viewScale);
			myThrustors.I(-32F * gameApplet.viewScale, 6F * gameApplet.viewScale);
			thruster_add(-5F, -40F, null, false, 40, 10, f10, 4.712389F, 1, 4, 101);
			thruster_add(-5F, 40F, null, false, 40, 10, f10, 1.570796F, 1, 4, 101);
			return;

		case 123: // '{'
			Initialize(gameApplet.f, 3, i, j, 0, 70, 160, 250, false, 0);
			if (gameApplet.QC == 1)
				myThrustors.I(1, 2, 12, 16F, gameApplet.T);
			else if (gameApplet.QC == 2)
				myThrustors.I(1, 4, 12, 16F, gameApplet.T);
			myThrustors.I(-71F * gameApplet.viewScale, -11F * gameApplet.viewScale);
			myThrustors.I(-74F * gameApplet.viewScale, 0.0F * gameApplet.viewScale);
			myThrustors.I(-71F * gameApplet.viewScale, 11F * gameApplet.viewScale);
			thruster_add(-32F, -40F, null, false, 40, 10, f10, 4.712389F, 1, 5, 101);
			thruster_add(-32F, 40F, null, false, 40, 10, f10, 1.570796F, 1, 5, 101);
			thruster_add(34F, -32F, null, false, 40, 10, f10, 4.712389F, 1, 5, 101);
			thruster_add(34F, 32F, null, false, 40, 10, f10, 1.570796F, 1, 5, 101);
			return;

		case 130:
			Initialize(gameApplet.j, 4, i, j, 0, 100, 300, 500, false, 0);
			weaponize(18F * gameApplet.viewScale, -35F * gameApplet.viewScale, 0.0F,
					0.0F, 0.0F, 0.0F, true, gameApplet.KI, false, gameApplet.MI, null, gameApplet.PZ, 12, 5, true, 3,
					50, gameApplet.nZ, f2, 30);
			weaponize(18F * gameApplet.viewScale, -18F * gameApplet.viewScale, 0.0F,
					0.0F, 0.0F, 0.0F, true, gameApplet.KI, false, gameApplet.MI, null, gameApplet.PZ, 12, 5, true, 3,
					50, gameApplet.nZ, f2, 30);
			weaponize(-58F * gameApplet.viewScale, -18F * gameApplet.viewScale, 0.0F,
					0.0F, 0.0F, 3.926991F, false, gameApplet.s, true, gameApplet.PI, gameApplet.Q, gameApplet.RZ,
					30, 25, true, 4, 50, f8, f9, c);
			weaponize(58F * gameApplet.viewScale, -18F * gameApplet.viewScale, 0.0F,
					0.0F, 0.0F, 5.497787F, false, gameApplet.a, true, gameApplet.PI, gameApplet.Q, gameApplet.RZ,
					30, 25, true, 4, 50, f8, f9, c);
			weaponize(-62F * gameApplet.viewScale, 33F * gameApplet.viewScale, 0.0F,
					0.0F, 0.0F, 2.356194F, false, gameApplet.e, true, gameApplet.PI, gameApplet.Q, gameApplet.RZ,
					30, 25, true, 4, 50, f8, f9, c);
			weaponize(62F * gameApplet.viewScale, 32F * gameApplet.viewScale, 0.0F,
					0.0F, 0.0F, 0.7853982F, false, gameApplet.g, true, gameApplet.PI, gameApplet.Q, gameApplet.RZ,
					30, 25, true, 4, 50, f8, f9, c);
			return;

		case 131:
			Initialize(gameApplet.h, 4, i, j, 0, 100, 300, 800, false, 0);
			return;

		case 200:
			Initialize(gameApplet.k, 1, i, j, 200, 30, 20, 50, false, 0);
			if (gameApplet.QC == 1)
				myThrustors.I(1, 5, 12, 16F, gameApplet.Q);
			else if (gameApplet.QC == 2)
				myThrustors.I(1, 10, 12, 16F, gameApplet.Q);
			myThrustors.I(-14F * gameApplet.viewScale, 0F * gameApplet.viewScale);
			return;

		case 201:
			Initialize(gameApplet.l, 1, i, j, 200, 20, 30, 0, false, 0);
			final SpriteGroup sprite_group3 = gameApplet.WI;
			final int i1 = gameApplet.OZ;
			weaponize(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, false, null, false, sprite_group3, null, i1, 45, 30, true, 1,
					30, f1, f2, byte0);
			if (gameApplet.QC == 1)
				myThrustors.I(1, 5, 12, 16F, gameApplet.Q);
			else if (gameApplet.QC == 2)
				myThrustors.I(1, 10, 12, 16F, gameApplet.Q);
			myThrustors.I(-14F * gameApplet.viewScale, 0F * gameApplet.viewScale);
			return;

		case 202:
			Initialize(gameApplet.m, 1, i, j, 200, 20, 20, 40, false, 0);
			final SpriteGroup sprite_group4 = gameApplet.WI;
			final int j1 = gameApplet.OZ;
			weaponize(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, false, null, false, sprite_group4, null, j1, 40, 30, true, 1,
					30, f1, f2, byte0);
			if (gameApplet.QC == 1)
				myThrustors.I(1, 5, 12, 16F, gameApplet.Q);
			else if (gameApplet.QC == 2)
				myThrustors.I(1, 10, 12, 16F, gameApplet.Q);
			myThrustors.I(-14F * gameApplet.viewScale, 0F * gameApplet.viewScale);
			return;

		case 203:
			Initialize(gameApplet.n, 1, i, j, 300, 25, 20, 40, false, 0);
			final SpriteGroup sprite_group5 = gameApplet.OI;
			final int k1 = gameApplet.OZ;
			weaponize(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, false, null, false, sprite_group5, null, k1, 40, 30, true, 2,
					40, f3, f4, byte1);
			if (gameApplet.QC == 1)
				myThrustors.I(1, 5, 12, 16F, gameApplet.Q);
			else if (gameApplet.QC == 2)
				myThrustors.I(1, 10, 12, 16F, gameApplet.Q);
			myThrustors.I(-12F * gameApplet.viewScale, -4F * gameApplet.viewScale);
			myThrustors.I(-12F * gameApplet.viewScale, 4F * gameApplet.viewScale);
			return;

		case 210:
			Initialize(gameApplet.o, 2, i, j, 400, 50, 60, 90, false, 0);
			if (gameApplet.QC == 1)
				myThrustors.I(1, 5, 12, 16F, gameApplet.R);
			else if (gameApplet.QC == 2)
				myThrustors.I(1, 10, 12, 16F, gameApplet.R);
			myThrustors.I(-18F * gameApplet.viewScale, -5F * gameApplet.viewScale);
			myThrustors.I(-18F * gameApplet.viewScale, 5F * gameApplet.viewScale);
			return;

		case 211:
			Initialize(gameApplet.p, 2, i, j, 500, 40, 60, 80, false, 0);
			weaponize(13F * gameApplet.viewScale, -17F * gameApplet.viewScale, 0.0F,
					0.0F, 0.0F, 0.0F, false, null, false, gameApplet.LI, null, gameApplet.OZ, 50, 40, true, 1, 45, f1,
					f2, byte0);
			weaponize(13F * gameApplet.viewScale, 17F * gameApplet.viewScale, 0.0F,
					0.0F, 0.0F, 0.0F, false, null, false, gameApplet.LI, null, gameApplet.OZ, 50, 40, true, 1, 45, f1,
					f2, byte0);
			if (gameApplet.QC == 1)
				myThrustors.I(2, 5, 12, 16F, gameApplet.Q);
			else if (gameApplet.QC == 2)
				myThrustors.I(2, 10, 12, 16F, gameApplet.Q);
			myThrustors.I(-18F * gameApplet.viewScale, -8F * gameApplet.viewScale);
			myThrustors.I(-18F * gameApplet.viewScale, 0.0F * gameApplet.viewScale);
			myThrustors.I(-18F * gameApplet.viewScale, 8F * gameApplet.viewScale);
			return;

		case 212:
			Initialize(gameApplet.q, 2, i, j, 600, 40, 70, 30, false, 0);
			final SpriteGroup sprite_group6 = gameApplet.WI;
			final int l1 = gameApplet.OZ;
			weaponize(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, false, null, false, sprite_group6, null, l1, 35, 30, true, 2,
					45, f3, f4, byte1);
			if (gameApplet.QC == 1)
				myThrustors.I(2, 5, 12, 16F, gameApplet.Q);
			else if (gameApplet.QC == 2)
				myThrustors.I(2, 10, 12, 16F, gameApplet.Q);
			myThrustors.I(-14F * gameApplet.viewScale, -10F * gameApplet.viewScale);
			myThrustors.I(-15F * gameApplet.viewScale, 2.0F * gameApplet.viewScale);
			myThrustors.I(-15F * gameApplet.viewScale, -2F * gameApplet.viewScale);
			myThrustors.I(-14F * gameApplet.viewScale, 10F * gameApplet.viewScale);
			return;

		case 213:
			Initialize(gameApplet.r, 2, i, j, 700, 50, 70, 100, false, 0);
			weaponize(0.0F * gameApplet.viewScale, -20F * gameApplet.viewScale, 0.0F,
					0.0F, 0.0F, 0.0F, false, null, false, gameApplet.XI, gameApplet.Q, gameApplet.RZ, 35, 25, true,
					4, 45, f8, f9, c);
			weaponize(0.0F * gameApplet.viewScale, 20F * gameApplet.viewScale, 0.0F,
					0.0F, 0.0F, 0.0F, false, null, false, gameApplet.XI, gameApplet.Q, gameApplet.RZ, 35, 25, true,
					4, 45, f8, f9, c);
			if (gameApplet.QC == 1)
				myThrustors.I(2, 5, 12, 16F, gameApplet.R);
			else if (gameApplet.QC == 2)
				myThrustors.I(2, 10, 12, 16F, gameApplet.R);
			myThrustors.I(-22F * gameApplet.viewScale, -7F * gameApplet.viewScale);
			myThrustors.I(-22F * gameApplet.viewScale, 7F * gameApplet.viewScale);
			return;

		case 220:
			Initialize(gameApplet.t, 3, i, j, 900, 70, 80, 150, false, 0);
			if (gameApplet.QC == 1)
				myThrustors.I(2, 3, 12, 16F, gameApplet.T);
			else if (gameApplet.QC == 2)
				myThrustors.I(1, 3, 12, 16F, gameApplet.T);
			myThrustors.I(-40F * gameApplet.viewScale, -18F * gameApplet.viewScale);
			myThrustors.I(-45F * gameApplet.viewScale, 0.0F * gameApplet.viewScale);
			myThrustors.I(-40F * gameApplet.viewScale, 18F * gameApplet.viewScale);
			weaponize(-11F * gameApplet.viewScale, -14F * gameApplet.viewScale, 0.0F,
					0.0F, 0.0F, 0.0F, true, gameApplet.HI, false, gameApplet.NI, null, gameApplet.PZ, 22, 12, true,
					3, 60, gameApplet.nZ, f2, 30);
			weaponize(-11F * gameApplet.viewScale, 14F * gameApplet.viewScale, 0.0F,
					0.0F, 0.0F, 0.0F, true, gameApplet.HI, false, gameApplet.NI, null, gameApplet.PZ, 22, 12, true,
					3, 60, gameApplet.nZ, f2, 30);
			return;

		case 221:
			Initialize(gameApplet.u, 3, i, j, 800, 60, 60, 120, false, 0);
			if (gameApplet.QC == 1)
				myThrustors.I(2, 3, 12, 16F, gameApplet.T);
			else if (gameApplet.QC == 2)
				myThrustors.I(1, 4, 12, 16F, gameApplet.T);
			myThrustors.I(-23F * gameApplet.viewScale, -16F * gameApplet.viewScale);
			myThrustors.I(-28F * gameApplet.viewScale, 0.0F * gameApplet.viewScale);
			myThrustors.I(-23F * gameApplet.viewScale, 16F * gameApplet.viewScale);
			weaponize(12F * gameApplet.viewScale, -12F * gameApplet.viewScale, 0.0F,
					0.0F, 0.0F, 0.0F, false, null, false, gameApplet.XI, gameApplet.Q, gameApplet.RZ, 25, 12, true,
					4, 45, f8, f9, c);
			weaponize(12F * gameApplet.viewScale, 12F * gameApplet.viewScale, 0.0F,
					0.0F, 0.0F, 0.0F, false, null, false, gameApplet.XI, gameApplet.Q, gameApplet.RZ, 25, 12, true,
					4, 45, f8, f9, c);
			return;

		case 222:
			Initialize(gameApplet.v, 3, i, j, 1000, 80, 100, 220, false, 0);
			if (gameApplet.QC == 1)
				myThrustors.I(2, 3, 12, 16F, gameApplet.T);
			else if (gameApplet.QC == 2)
				myThrustors.I(1, 3, 12, 16F, gameApplet.T);
			myThrustors.I(-42F * gameApplet.viewScale, -15F * gameApplet.viewScale);
			myThrustors.I(-50F * gameApplet.viewScale, 9F * gameApplet.viewScale);
			myThrustors.I(-50F * gameApplet.viewScale, -9F * gameApplet.viewScale);
			myThrustors.I(-42F * gameApplet.viewScale, 15F * gameApplet.viewScale);
			weaponize(17F * gameApplet.viewScale, -10F * gameApplet.viewScale, 0.0F,
					0.0F, 0.0F, 0.0F, true, gameApplet.HI, false, gameApplet.NI, null, gameApplet.PZ, 25, 15, true,
					3, 50, gameApplet.nZ, f2, 30);
			weaponize(17F * gameApplet.viewScale, 10F * gameApplet.viewScale, 0.0F,
					0.0F, 0.0F, 0.0F, true, gameApplet.HI, false, gameApplet.NI, null, gameApplet.PZ, 25, 15, true,
					3, 50, gameApplet.nZ, f2, 30);
			weaponize(5F * gameApplet.viewScale, -15F * gameApplet.viewScale, 0.0F,
					0.0F, 0.0F, 0.0F, true, gameApplet.HI, false, gameApplet.NI, null, gameApplet.PZ, 25, 15, true,
					3, 50, gameApplet.nZ, f2, 30);
			weaponize(5F * gameApplet.viewScale, 15F * gameApplet.viewScale, 0.0F,
					0.0F, 0.0F, 0.0F, true, gameApplet.HI, false, gameApplet.NI, null, gameApplet.PZ, 25, 15, true,
					3, 50, gameApplet.nZ, f2, 30);
			return;

		case 223:
			Initialize(gameApplet.w, 3, i, j, 1500, 70, 70, 150, false, 0);
			if (gameApplet.QC == 1)
				myThrustors.I(2, 3, 12, 16F, gameApplet.T);
			else if (gameApplet.QC == 2)
				myThrustors.I(1, 3, 12, 16F, gameApplet.T);
			myThrustors.I(-18F * gameApplet.viewScale, -39F * gameApplet.viewScale);
			myThrustors.I(-26F * gameApplet.viewScale, -34F * gameApplet.viewScale);
			myThrustors.I(-26F * gameApplet.viewScale, 34F * gameApplet.viewScale);
			myThrustors.I(-18F * gameApplet.viewScale, 39F * gameApplet.viewScale);
			thruster_add(-27F, 0.0F, null, false, 35, 15, f10, 3.141593F, 1, 5, 202);
			return;

		case 230:
			Initialize(gameApplet.II, 4, i, j, 5000, 100, 400, 600, false, 0);
			weaponize(0.0F * gameApplet.viewScale, 18F * gameApplet.viewScale, 0.0F,
					0.0F, 10F, 0.0F, true, gameApplet.FI, false, gameApplet.NI, null, gameApplet.PZ, 12, 5, true, 3,
					50, gameApplet.nZ, f2, 30);
			weaponize(-52F * gameApplet.viewScale, -12F * gameApplet.viewScale, 0.0F,
					0.0F, 0.0F, 3.926991F, false, gameApplet.ZI, true, gameApplet.YI, gameApplet.Q, gameApplet.RZ,
					30, 25, true, 4, 50, f8, f9, c);
			weaponize(51F * gameApplet.viewScale, -13F * gameApplet.viewScale, 0.0F,
					0.0F, 0.0F, 5.497787F, false, gameApplet.CI, true, gameApplet.YI, gameApplet.Q, gameApplet.RZ,
					30, 25, true, 4, 50, f8, f9, c);
			weaponize(-70F * gameApplet.viewScale, 33F * gameApplet.viewScale, 0.0F,
					0.0F, 0.0F, 2.356194F, false, gameApplet.BI, true, gameApplet.YI, gameApplet.Q, gameApplet.RZ,
					30, 25, true, 4, 50, f8, f9, c);
			weaponize(70F * gameApplet.viewScale, 30F * gameApplet.viewScale, 0.0F,
					0.0F, 0.0F, 0.7853982F, false, gameApplet.DI, true, gameApplet.YI, gameApplet.Q, gameApplet.RZ,
					30, 25, true, 4, 50, f8, f9, c);
			return;

		case 231:
			Initialize(gameApplet.JI, 4, i, j, 10000, 100, 600, 1000, false, 0);
			weaponize(-101F * gameApplet.viewScale, 85F * gameApplet.viewScale, 4F,
					0.0F, 0.0F, 2.199115F, false, gameApplet.SI, true, gameApplet.XI, gameApplet.Q, gameApplet.RZ,
					15, 5, true, 4, 50, f8, f9, c);
			weaponize(-40F * gameApplet.viewScale, 125F * gameApplet.viewScale, 0.0F,
					0.0F, 0.0F, 2.199115F, false, gameApplet.AI, true, gameApplet.XI, gameApplet.Q, gameApplet.RZ,
					15, 5, true, 4, 50, f8, f9, c);
			thruster_add(61F * gameApplet.viewScale, 108F * gameApplet.viewScale,
					gameApplet.EI, true, 40, 20, f10, 1.256637F, 1, 18, 203);
			thruster_add(103F * gameApplet.viewScale, 40F * gameApplet.viewScale,
					gameApplet.GI, true, 40, 20, f10, 1.256637F, 1, 18, 212);
			return;

		case 150:
			Initialize(gameApplet.Y, 4, i, j, 0, 70, 200, 350, false, 0);
			if (gameApplet.QC == 1)
				myThrustors.I(2, 2, 10, 16F, gameApplet.R);
			else if (gameApplet.QC == 2)
				myThrustors.I(1, 3, 10, 16F, gameApplet.R);
			else
				myThrustors.I(1, 5, 10, 16F, gameApplet.R);
			myThrustors.I(-16F * gameApplet.viewScale, -16F * gameApplet.viewScale);
			myThrustors.I(-20F * gameApplet.viewScale, 0.0F * gameApplet.viewScale);
			myThrustors.I(-16F * gameApplet.viewScale, 16F * gameApplet.viewScale);
			weaponize(10F, -6F, 0.0F, 0.0F, 0.0F, 0.0F, false, null, false, gameApplet.UI, null, gameApplet.QZ, 10, 0,
					false, 1, 70, gameApplet.nZ, f2, 30);
			weaponize(10F, 6F, 0.0F, 0.0F, 0.0F, 0.0F, false, null, false, gameApplet.VI, null, gameApplet.QZ, 10, 0,
					false, 1, 70, gameApplet.nZ, f2, 30);
			return;
		}
		System.out.println("initStandardShip - undefined ship type");
	}

	@Override
	final void Update() {
		super.mySprite = myAtlas.GetSprite(frameIndex, super.animationIndex);
		if (println > 0) {
			random--;
			if (random <= 0) {
				random = 10 + (int) (Math.random() * println);
				if (super.shipGrade == 4 && super.AI != 150)
					random = random / 2;
				SpriteGroup sprite_group1 = null;
				switch ((int) (Math.random() * 3D)) {
				case 0: // '\0'
					sprite_group1 = gameApplet.S;
					break;

				case 1: // '\001'
					sprite_group1 = gameApplet.A;
					break;

				default:
					sprite_group1 = gameApplet.E;
					break;
				}
				final Explosion explosion1 = (Explosion) gameApplet.rZ.GiveLastInstanceTo(gameApplet.qZ);
				if (explosion1 != null)
					explosion1.I(sprite_group1, 1,
							myX + (float) ((Math.random() - 0.5D) * myAtlas.C * 0.66000000000000003D),
							myY + (float) ((Math.random() - 0.5D) * myAtlas.B * 0.66000000000000003D),
							hSpeed + (float) (Math.random() - 0.5D) * myAtlas.B * 0.05F,
							vSpeed + (float) (Math.random() - 0.5D) * myAtlas.B * 0.05F, 0, 4, 0, false);
			}
		}

		// Limit world borders
		super.Update();
		if (myX < gameApplet.worldBorderLeft)
		{
			myX = gameApplet.worldBorderLeft;
			hSpeed = 0.0F;
			CalcCollisionBox();
		} else if (myX > gameApplet.worldBorderRight)
		{
			myX = gameApplet.worldBorderRight;
			hSpeed = 0.0F;
			CalcCollisionBox();
		}
		if (myY < gameApplet.worldBorderTop)
		{
			myY = gameApplet.worldBorderTop;
			vSpeed = 0.0F;
			CalcCollisionBox();
		} else if (myY > gameApplet.worldBorderBottom)
		{
			myY = gameApplet.worldBorderBottom;
			vSpeed = 0.0F;
			CalcCollisionBox();
		}

		if (I != null && I.activeMode != 1)
			I = null;

		if (super.g != null && super.g.activeMode == 2)
		{
			super.g = null;
		}

		if (RI)
		{
			if (TI)
			{
				UI++;
				if (UI >= 20)
				{
					switch (VI)
					{
					case 1: // '\001'
						Equip(true, null);
						break;

					case 2: // '\002'
						if (UI == 20)
							SetupPhysics1(myX, myY, hSpeed, vSpeed, 0.0F, 0.05F, true);
						else if (myY > gameApplet.screen_height + super.mySprite.J)
							Equip(true, null);
						break;
					}
				}
			}
			else if (Math.abs(myFollower.myX - myX) < 10F && Math.abs(myFollower.myY - myY) < 10F)
			{
				TI = true;
			}
		}
		else
		{
			switch (QI)
			{
			case 1: // '\001'
			case 4: // '\004'
			default:
				break;

			case 2: // '\002'
				if ((I == null || I.activeMode != 1) && Math.random() * 80D > 79D)
					super.i = (float) Math.random() * 6.283185F;
				UpdateWithAttacks(I);

				frameIndex = myAtlas.GetFrameByRotation(myRotation);
				break;

			case 3: // '\003'
				if (OI > 0)
				{
					OI--;
					if (OI == 0 && myFollower == null)
						E();
					break;
				}

				if (MI >= 0)
				{
					if (MI > 0)
					{
						MI--;
						break;
					}

					if (super.CI)
						super.activeMode = 3;
					else
						Equip(true, null);
					break;
				}

				if (myFollower == null)
				{
					E();
					if (myFollower != null || timeSinceEpoch % 20 != 0)
						break;

					final float f = (super.myDestX + hRandomSpeed) - myX;
					final float f2 = (super.myDestY + vRandomSpeed) - myY;
					if (f * f + f2 * f2 < 10000F)
					{
						super.myDestX = gameApplet.YC + gameApplet.worldDimension[0] * 0.1F
								+ (float) Math.random() * 0.8F * gameApplet.worldDimension[0];
						super.myDestY = gameApplet.zC + gameApplet.worldDimension[1] * 0.1F
								+ (float) Math.random() * 0.8F * gameApplet.worldDimension[1];
						hRandomSpeed = 0.0F;
						vRandomSpeed = 0.0F;
					}
					break;
				}
				if (myFollower.JI != 11)
					break;

				final float f1 = (myFollower.myX + hRandomSpeed) - myX;
				final float f3 = (myFollower.myY + vRandomSpeed) - myY;
				if (f1 * f1 + f3 * f3 >= 10000F)
					break;

				final oWaypoint waypoint_1 = (oWaypoint) myFollower;
				LI++;
				myFollower = null;
				if (waypoint_1.I == 1) {
					MI = 25;
					final Explosion explosion2 = (Explosion) gameApplet.rZ.GiveLastInstanceTo(gameApplet.qZ);
					if (explosion2 != null)
						explosion2.I(gameApplet.sprite_group_ship, 1, (int) (myX + hSpeed * 25F),
								(int) (myY + vSpeed * 25F), 0.0F, 0.0F, 1, 2, 0, false);
					SetupPhysics2(myX, myY, hSpeed, vSpeed, hasAnimation);
					break;
				}
				if (waypoint_1.I == 4) {
					LI = 0;
					E();
					break;
				}
				if (waypoint_1.I == 2) {
					SetupPhysics5(myX, myY, null, myX + hSpeed * 10F, myY + vSpeed * 10F, super.M, myFriction, false,
							true);
					QI = 2;
				} else {
					E();
				}
				break;
			}
		}
		myThrustors.I(this);
		if (Z) {
			B++;
			if (B >= C) {
				J();
				B = 0;
			}
		}
	}

	@Override
	final void Draw(final Canvas surface) {
		myThrustors.I(surface);
		super.Draw(surface);
	}

	final void abs() {
		out = true;
		PI = false;
		hRandomSpeed = 0.0F;
		vRandomSpeed = 0.0F;
	}

	final void weaponize(final float f, final float f1, final float f2, final float f3, final float f4, final float f5, final boolean flag,
			final SpriteGroup sprite_group1, final boolean flag1, final SpriteGroup sprite_group2, final SpriteGroup sprite_group3, final int i,
			final int j, final int k, final boolean flag2, final int l, final int i1, final float f6, final float f7, final int j1) {
		final oWeapon oWeapon1 = (oWeapon) gameApplet.FC.GiveLastInstanceTo(super.myWeapons);
		if (oWeapon1 != null) {
			oWeapon1.I(this, flag1, f, f1, f2, f3, f4, f5, flag, sprite_group1, 0, 0, 1, 0, false);
			oWeapon1.I(sprite_group2, sprite_group3, i, j, k, flag2, l, i1, f6, f7, j1);
			abs = l;
			F += i1 / (j + k * 0.5F);
			HNSM = Math.max(HNSM, f7);
		}
	}

	final void thruster_add(final float f, final float f1, final SpriteGroup sprite_group1, final boolean flag, final int i, final int j, final float f2,
			final float f3, final int k, final int l, final int i1) {
		final oWeapon oWeapon1 = (oWeapon) gameApplet.FC.GiveLastInstanceTo(super.myWeapons);
		if (oWeapon1 != null) {
			oWeapon1.I(this, flag, f, f1, 0.0F, 0.0F, 0.0F, f3, false, sprite_group1, 0, 0, 1, 0, false);
			oWeapon1.I(i, j, f2, k, i1);
			D += l * k;
			F += 100F / (i + j * 0.5F);
		}
	}

	final void J() {
		final GameObjectPool oGameObjectlist1 = super.myWeapons;
		final int k = oGameObjectlist1.mySize;
		for (int i = max + 1; i < k; i++) {
			final oWeapon oWeapon1 = (oWeapon) super.myWeapons.internalList[i];
			if (!oWeapon1.MI) {
				oWeapon1.J();
				max = i;
				return;
			}
		}

		for (int j = 0; j <= max; j++) {
			final oWeapon oWeapon2 = (oWeapon) super.myWeapons.internalList[j];
			if (!oWeapon2.MI) {
				oWeapon2.J();
				max = j;
				return;
			}
		}

	}

	protected final GameObject A() {
		WI = null;
		if (super.EI == 2) {
			out(gameApplet.vZ, HNSM);
			out(gameApplet.dZ, HNSM);
			out(gameApplet.EC, HNSM);
		} else if (super.EI == 1) {
			out(gameApplet.wZ, HNSM);
			out(gameApplet.GC, HNSM);
		}
		return WI;
	}

	protected final void out(final GameObjectPool oGameObjectlist1, final float f) {
		final float f8 = f * f;
		final float f3 = F;
		final int j = oGameObjectlist1.mySize;
		for (int k = 0; k < j; k++) {
			final GameObject oGameObject1 = k < 0 || k >= oGameObjectlist1.mySize ? null : oGameObjectlist1.internalList[k];
			if (oGameObject1.activeMode == 1 && oGameObject1.isVisible && oGameObject1.h && oGameObject1.BI > 0.0001F) {
				if (oGameObject1.l)
					out(oGameObject1.myWeapons, f);
				final float f9 = oGameObject1.myX - myX;
				final float f10 = oGameObject1.myY - myY;
				if (f9 * f9 + f10 * f10 <= f8) {
					final float f2 = (oGameObject1.n + oGameObject1.o) / f3;
					float f1 = 0.0F;
					if (oGameObject1.JI == 8) {
						final oSpaceship oSpaceship1 = (oSpaceship) oGameObject1;
						f1 = oSpaceship1.F;
					} else if (oGameObject1.JI == 7) {
						final oMeteor oMeteor1 = (oMeteor) oGameObject1;
						if (((GameObject) (oMeteor1)).vSpeed != 0.0F) {
							final float f6 = (((GameObject) (oMeteor1)).myY - myY) / ((GameObject) (oMeteor1)).vSpeed;
							if (f6 > 7F && f6 < 50F) {
								final float f7 = ((GameObject) (oMeteor1)).myX + ((GameObject) (oMeteor1)).hSpeed * f6;
								int i;
								if (((GameObject) (oMeteor1)).shipGrade == 3)
									i = ((GameObject) (oMeteor1)).m / 2;
								else
									i = ((GameObject) (oMeteor1)).myAtlas.C / 2;
								if (super.borderLeft < f7 + i && super.borderRight > f7 - i)
									f1 = ((GameObject) (oMeteor1)).m;
							}
						}
					}
					f1 *= oGameObject1.BI;
					float f4;
					if (f1 > 0.0F)
						f4 = (super.n + super.o) / f1;
					else if (oGameObject1.BI > 1.0F)
						f4 = 10F / oGameObject1.BI;
					else
						f4 = YI;
					if (f4 != 0.0D) {
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
		GameQuest gameobjectivelist1;
		if (super.EI == 2)
			gameobjectivelist1 = gameApplet.currentMission.C;
		else
			gameobjectivelist1 = gameApplet.currentMission.I;
		GameObjectPool oGameObjectlist2;
		while (obj == null && LI < (oGameObjectlist2 = gameobjectivelist1.D).mySize) {
			final GameObjectPool oGameObjectlist1 = gameobjectivelist1.D;
			final int i = LI;
			final oWaypoint oWaypoint1 = (oWaypoint) (i < 0 || i >= oGameObjectlist1.mySize ? null : oGameObjectlist1.internalList[i]);
			if (oWaypoint1.Z == -1 || super.AI == oWaypoint1.Z)
				obj = oWaypoint1;
			else
				LI++;
		}
		if (obj == null)
			obj = I(-1F);

		if (obj != null)
		{
			if (super.DI != 8)
			{
				SetupPhysics6(myX, myY, ((GameObject) (obj)), 0.0F, 0.0F, super.M, super.c, myFriction, hasAnimation);
			}
			else
			{
				myFollower = ((GameObject) (obj));
				super.P = true;
			}

			if (PI)
			{
				hRandomSpeed = ((float) Math.random() - 0.5F) * 200F;
				vRandomSpeed = ((float) Math.random() - 0.5F) * 200F;
			}
		}
	}

	protected final GameObject I(final float f)
	{
		WI = null;
		if (super.EI == 2)
		{
			println(gameApplet.vZ, f);
			println(gameApplet.EC, f);
			if (WI == null)
				println(gameApplet.dZ, f);
		}
		else if (super.EI == 1)
		{
			println(gameApplet.wZ, f);
			println(gameApplet.GC, f);
		}

		return WI;
	}

	protected final void println(final GameObjectPool oGameObjectlist1, final float f) {
		final float f8 = f * f;
		final float f3 = F;
		final int j = oGameObjectlist1.mySize;
		for (int k = 0; k < j; k++) {
			final GameObject oGameObject1 = k < 0 || k >= oGameObjectlist1.mySize ? null : oGameObjectlist1.internalList[k];
			if (oGameObject1.activeMode == 1 && oGameObject1.isVisible && oGameObject1.h && oGameObject1.BI > 0.0001F) {
				final float f10 = oGameObject1.myX - myX;
				final float f11 = oGameObject1.myY - myY;
				final float f9 = f10 * f10 + f11 * f11;
				if (f <= 0.0F || f9 <= f8) {
					final float f2 = (oGameObject1.n + oGameObject1.o) / f3;
					float f1 = 0.0F;
					if (oGameObject1.JI == 8) {
						final oSpaceship oSpaceship1 = (oSpaceship) oGameObject1;
						f1 = oSpaceship1.F;
					} else if (oGameObject1.JI == 7) {
						final oMeteor oMeteor1 = (oMeteor) oGameObject1;
						if (((GameObject) (oMeteor1)).vSpeed != 0.0F) {
							final float f6 = (((GameObject) (oMeteor1)).myY - myY) / ((GameObject) (oMeteor1)).vSpeed;
							if (f6 > 7F && f6 < 50F) {
								final float f7 = ((GameObject) (oMeteor1)).myX + ((GameObject) (oMeteor1)).hSpeed * f6;
								int i;
								if (((GameObject) (oMeteor1)).shipGrade == 3)
									i = ((GameObject) (oMeteor1)).m / 2;
								else
									i = ((GameObject) (oMeteor1)).myAtlas.C / 2;
								if (super.borderLeft < f7 + i && super.borderRight > f7 - i)
									f1 = ((GameObject) (oMeteor1)).m;
							}
						}
					}
					float f4;
					if (f1 > 0.0F)
						f4 = (super.n + super.o) / f1;
					else if (oGameObject1.BI > 1.0F)
						f4 = 10F / oGameObject1.BI;
					else
						f4 = YI;
					if (f4 != 0.0D) {
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

	final void I(final oSpaceship oSpaceship1, final int i, final float f) {
		RI = true;
		VI = i;
		UI = 0;
		TI = false;
		SetupPhysics5(myX, myY, oSpaceship1, 0.0F, 0.0F, f, 0.2F, false, true);
	}

	@Override
	final void Equip(final boolean flag, final GameObject oGameObject1) {
		if (flag)
			super.acqScores = 0;
		else if (super.EI == 2 && oGameObject1 != null
				&& (oGameObject1.JI == 8 && oGameObject1.AI == 150 || oGameObject1.JI == 6 && oGameObject1.g != null
						&& oGameObject1.g.g != null && oGameObject1.g.g.AI == 150)) {
			boolean flag1 = false;
			if (gameApplet.currentMission.J > 0 && Math.random() < gameApplet.currentMission.D) {
				flag1 = true;
			} else {
				gameApplet.currentMission.G++;
				final int i = Math.round((1.0F / gameApplet.currentMission.D) * 1.5F);
				if (gameApplet.currentMission.G >= i)
					flag1 = true;
			}
			if (flag1) {
				gameApplet.currentMission.G = 0;
				final int k = gameApplet.currentMission.J;
				int l = -1;
				int i1 = (int) (Math.random() * gameApplet.currentMission.E);
				for (int j1 = 0; j1 < k && l == -1; j1++) {
					final int j = gameApplet.currentMission.A[j1];
					if (i1 > j)
						i1 -= j;
					else
						l = gameApplet.currentMission.S[j1];
				}

				if (l != -1) {
					final oPowerup oPowerup1 = (oPowerup) gameApplet.DC.GiveLastInstanceTo(gameApplet.BC);
					if (oPowerup1 != null) {
						oPowerup1.Awake(l);
						final float f3 = hSpeed * 0.3F;
						final float f4 = vSpeed * 0.3F;
						if (myX < gameApplet.YC
								+ gameApplet.screen_width * 2.0F && hSpeed < 0.0F)
							hSpeed = -hSpeed;
						if (myX > gameApplet.iC
								- gameApplet.screen_width * 2.0F && hSpeed > 0.0F)
							hSpeed = -hSpeed;
						if (myY < gameApplet.zC
								+ gameApplet.screen_height * 2.0F && vSpeed < 0.0F)
							vSpeed = -vSpeed;
						if (myY > gameApplet.cC
								- gameApplet.screen_height * 2.0F && vSpeed > 0.0F)
							vSpeed = -vSpeed;
						oPowerup1.SetupPhysics2(myX, myY, f3, f4, true);
					}
				}
			}
		} else {
			super.acqScores = 0;
		}
		super.Equip(flag, oGameObject1);
		byte byte0 = 0;
		byte byte1 = 0;
		if (!flag) {
			SpriteGroup sprite_group1 = null;
			Palette palette = null;
			final float f = (float) Math.random();
			if (f > 0.67000000000000004D)
				sprite_group1 = gameApplet.D;
			else if (f > 0.33000000000000002D)
				sprite_group1 = gameApplet.B;
			else
				sprite_group1 = gameApplet.C;
			switch (super.shipGrade) {
			default:
				break;

			case 1: // '\001'
				if (gameApplet.QC == 1)
					byte1 = 2;
				else if (gameApplet.QC == 2)
					byte1 = 1;
				if (super.EI == 2) {
					if (super.AI == 102)
						gameApplet.everySFXs.Play(gameApplet.XZ, true, false);
					else
						gameApplet.everySFXs.Play(gameApplet.TZ, true, false);
					palette = gameApplet.DZ;
				} else if (super.EI == 1) {
					gameApplet.everySFXs.Play(gameApplet.TZ, true, false);
					palette = gameApplet.FZ;
				}
				break;

			case 2: // '\002'
				if (gameApplet.QC == 1)
					byte1 = 3;
				else if (gameApplet.QC == 2)
					byte1 = 1;
				gameApplet.everySFXs.Play(gameApplet.WZ, true, false);
				if (super.EI == 2) {
					palette = gameApplet.DZ;
					break;
				}
				if (super.EI == 1)
					palette = gameApplet.FZ;
				break;

			case 3: // '\003'
				if (gameApplet.QC == 1)
					byte1 = 4;
				else if (gameApplet.QC == 2)
					byte1 = 2;
				if (super.EI == 2) {
					gameApplet.everySFXs.Play(gameApplet.XZ, true, false);
					palette = gameApplet.DZ;
					break;
				}
				if (super.EI == 1) {
					gameApplet.everySFXs.Play(gameApplet.YZ, true, false);
					palette = gameApplet.FZ;
				}
				break;

			case 4: // '\004'
				if (gameApplet.QC == 1)
					byte1 = 7;
				else if (gameApplet.QC == 2)
					byte1 = 3;
				byte0 = 5;
				if (super.EI == 2) {
					gameApplet.everySFXs.Play(gameApplet.YZ, true, false);
					palette = gameApplet.DZ;
					break;
				}
				if (super.EI == 1) {
					gameApplet.everySFXs.Play(gameApplet.YZ, true, false);
					palette = gameApplet.FZ;
				}
				break;
			}
			final Explosion explosion1 = (Explosion) gameApplet.rZ.GiveLastInstanceTo(gameApplet.oZ);
			if (explosion1 != null) {
				explosion1.I(sprite_group1, 3, myX, myY, hSpeed, vSpeed, 1, 2, super.m + super.n, out);
				if (palette != null)
					explosion1.F = palette;
			}
			for (int k1 = 0; k1 < byte1; k1++) {
				SpriteGroup sprite_group2;
				if (super.AI >= 200 && super.AI < 300) {
					final float f1 = (float) Math.random();
					if (f1 > 0.75D)
						sprite_group2 = gameApplet.G;
					else if (f1 > 0.5D)
						sprite_group2 = gameApplet.H;
					else if (f1 > 0.25D)
						sprite_group2 = gameApplet.K;
					else
						sprite_group2 = gameApplet.L;
				} else {
					final float f2 = (float) Math.random();
					if (f2 > 0.75D)
						sprite_group2 = gameApplet.M;
					else if (f2 > 0.5D)
						sprite_group2 = gameApplet.N;
					else if (f2 > 0.25D)
						sprite_group2 = gameApplet.O;
					else
						sprite_group2 = gameApplet.P;
				}
				final explosionbit explosionbit1 = (explosionbit) gameApplet.uZ.GiveLastInstanceTo(gameApplet.tZ);
				if (explosionbit1 != null)
					explosionbit1.I(sprite_group2, gameApplet.J, this, super.m + super.n);
			}

			for (int l1 = 0; l1 < byte0; l1++) {
				final Explosion explosion2 = (Explosion) gameApplet.rZ.GiveLastInstanceTo(gameApplet.qZ);
				if (explosion2 != null) {
					explosion2.I(sprite_group1, 3,
							myX + (float) (Math.random() * super.mySprite.C - super.mySprite.D),
							myY + (float) (Math.random() * super.mySprite.B - super.mySprite.F), hSpeed,
							vSpeed, 1, 2, 300, false);
					explosion2.timeSinceEpoch = (int) (Math.random() * -30D);
				}
			}

		}
	}

	@Override
	final boolean CheckCollision(final GameObject oGameObject1) {
		if (oGameObject1.JI != 10 && super.CheckCollision(oGameObject1))
			return true;
		if (oGameObject1.JI == 8 || oGameObject1.JI == 10) {
			if (oGameObject1.JI == 10 && myFollower != null && myFollower.JI == 11)
				return false;
			final int i = (int) (myX - oGameObject1.myX);
			if (i > -500 && i < 500) {
				final int j = (int) (myY - oGameObject1.myY);
				if (j > -500 && j < 500) {
					int k = (int) (HNSM * 0.6F);
					final int l = super.mySprite.A + oGameObject1.mySprite.A;
					if (l > k) {
						k = l;
						if (oGameObject1.JI == 8)
							if (oGameObject1.shipGrade == 4)
								k = (int) (k * 1.5F);
							else
								k = (int) (k * 2.5F);
					}
					final int i1 = k * k;
					final int j1 = i * i + j * j;
					if (j1 < i1) {
						random(i, j, j1);
						if (oGameObject1.JI == 8) {
							final oSpaceship oSpaceship1 = (oSpaceship) oGameObject1;
							oSpaceship1.random(-i, -j, j1);
						}
					}
				}
			}
		}
		return false;
	}

	final void random(final int i, final int j, final int k) {
		if (OI > 0 || !PI || QI != 3)
			return;
		float f;
		float f1;
		if (k == 0) {
			f = 0.0F;
			f1 = 1.0F;
		} else {
			final float f2 = (float) Math.sqrt(k);
			f = i / f2;
			f1 = j / f2;
		}
		super.myDestX = myX + f * (0.7F + (float) Math.random() * 0.6F) * 300F + ((float) Math.random() * 300F - 150F);
		super.myDestY = myY + f1 * (0.7F + (float) Math.random() * 0.6F) * 300F + ((float) Math.random() * 300F - 150F);
		myFollower = null;
		OI = 60;
	}

	@Override
	final void I(final GameObject oGameObject1, final int i, final int j) {
		if (i > 0 && super.q > 0) {
			println = 5 + (int) (Math.sin((float) super.o / (float) super.q * 1.5707963267948966D) * 20D);
			random = 0;
		} else {
			println = 0;
		}
		super.I(oGameObject1, i, j);
	}

	float F;
	GameObject I;
	float HNSM;
	int abs;
	boolean Z;
	int C;
	int B;
	int max;
	int D;
	oShipthrustor myThrustors;
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
	GameObject WI;
	float XI;
	float YI;
}
