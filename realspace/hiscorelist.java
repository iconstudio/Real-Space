package realspace;
// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.

// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   star_y

import java.awt.Color;

class hiscorelist {

	hiscorelist(int i) {
		toString = i;
		valueOf = 0;
		F = new String[i];
		HNSM = new String[i];
		append = new String[i];
	}

	public final void I(gameapp gameapp, String s, Color color, Color color1, gamefont gamefont, int i, int j, float f,
			float f1, int k) {
		String s1 = s;
		for (int l = 0; l < valueOf; l++)
			s1 = s1 + "|" + F[l] + "   " + append[l];

		gametext gametext1 = (gametext) ((gamebase) (gameapp)).wC.I(((gamebase) (gameapp)).vC);
		if (gametext1 != null) {
			gametext1.I(s1, color, gamefont, true, i, j, 500, k, 0, true);
			gametext1.I(i, j, f * ((gamebase) (gameapp)).view_scale, f1 * ((gamebase) (gameapp)).view_scale);
			if (color1 != null)
				gametext1.B = color1;
		}
	}

	String F[];
	String HNSM[];
	String append[];
	int toString;
	int valueOf;
}
