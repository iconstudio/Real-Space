package realspace;
// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.

// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   star_y

final class Font {
	Font(GameApp gameapp, int i, int j, int k) {
		HNSM = gameapp;
		C = i;
		B = j;
		charAt = k;
		I = new sprite[D];
		Z = new int[D];
		for (int l = 0; l < D; l++) {
			I[l] = null;
			Z[l] = -1;
		}

	}

	final int I(char ac[], int i, int j) {
		int k = 0;
		for (int l = 0; l < j;) {
			char c = ac[i];
			if (c > 0 && c < D) {
				sprite sprite1 = I[c];
				if (sprite1 != null)
					k += sprite1.C + B;
				else if (c == ' ')
					k += B * 2;
				else
					k += B;
			} else {
				k += B;
			}
			l++;
			i++;
		}

		return k;
	}

	final int I(String s) {
		int i = 0;
		int j = s.length();
		for (int k = 0; k < j; k++) {
			char c = s.charAt(k);
			if (c > 0 && c < D) {
				sprite sprite1 = I[c];
				if (sprite1 != null)
					i += sprite1.C + B;
				else if (c == ' ')
					i += B * 2;
				else
					i += B;
			} else {
				i += B;
			}
		}

		return i;
	}

	GameApp HNSM;
	sprite I[];
	int Z[];
	int C;
	int B;
	int charAt;
	static int D = 128;

}
