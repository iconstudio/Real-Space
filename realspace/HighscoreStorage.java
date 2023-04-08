package realspace;
// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.

// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   star_y

import java.awt.Color;

class HighscoreStorage {

	HighscoreStorage(int size) {
		mySize = size;
		valueOf = 0;

		F = new String[size];
		HNSM = new String[size];
		append = new String[size];
	}

	public final void I(GameApp gameapp, String s, Color color, Color color1, Font gamefont, int i, int j, float f, float f1, int k) {
		String s1 = s;
		for (int l = 0; l < valueOf; l++)
		{
			s1 = s1 + "|" + F[l] + "   " + append[l];
		}

		GameLabel gametext1 = (GameLabel) gameapp.wC.I(gameapp.vC);
		if (gametext1 != null) {
			gametext1.Draw(s1, color, gamefont, true, i, j, 500, k, 0, true);
			gametext1.I(i, j, f * ((AppletImplements) (gameapp)).viewScale,
					f1 * ((AppletImplements) (gameapp)).viewScale);
			
			if (color1 != null)
			{
				gametext1.B = color1;
			}
		}
	}

	String F[];
	String HNSM[];
	String append[];
	int mySize;
	int valueOf;
}
