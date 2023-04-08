package realspace;
// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.

// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   star_y

final class oWaypoint extends GameObject {
	oWaypoint(GameApp gameapp) {
		super(gameapp);
	}

	final void I(int i, int j) {
		super.Awake(null, 11, 1, 0, 0, true);
		I = j;
		Z = i;
	}

	int I;
	int Z;
}
