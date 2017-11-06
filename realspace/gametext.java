package realspace;
// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.

// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   star_y

import java.awt.Color;

final class gametext extends oGameObject {

	gametext(gameapp gameapp) {
		super(gameapp);
		XI = new int[51];
		YI = new int[51];
		iI = new int[51];
	}

	final void I(String s, Color color, font gamefont1, boolean flag, int i, int j, int k, int l, int i1,
			boolean flag1) {
		if (gamefont1 == null)
			return;
		super.initialize(null, 4, 0, 0, 0, true);
		F = s.toCharArray();
		HNSM = s.length();
		super.j = 0;
		I = l;
		toCharArray = 0;
		getRGB = false;
		C = color;
		B = null;
		D = null;
		LI = null;
		MI = null;
		NI = null;
		RI = gamefont1;
		TI = flag;
		UI = null;
		super.HI = -1;
		QI = null;
		OI = null;
		if (i1 > 0)
			super.s = -i1;
		min = HNSM;
		XI[0] = 0;
		YI[0] = HNSM;
		zI = 0;
		WI = 0;
		int j1 = 0;
		for (int k1 = 0; k1 < HNSM && zI < 51; k1++) {
			j1 = RI.I(F, XI[zI], (k1 - XI[zI]) + 1);
			if (j1 > WI)
				WI = j1;
			if (F[k1] == '|') {
				YI[zI] = k1 - XI[zI];
				iI[zI] = j1;
				zI++;
				if (zI < 51) {
					XI[zI] = k1;
					YI[zI] = HNSM - k1;
				}
				F[k1] = ' ';
			} else if (k > 0 && j1 > k) {
				YI[zI] = k1 - XI[zI];
				iI[zI] = j1;
				zI++;
				if (zI < 51) {
					XI[zI] = k1;
					YI[zI] = HNSM - k1;
				}
			}
		}

		if (zI < 51) {
			iI[zI] = j1;
			zI++;
		}
		cI = zI;
		super.J = i;
		super.S = j;
		Z = flag1;
	}

	final void I(float f, float f1, float f2, float f3) {
		super.I(f, f1, f2, f3, false);
	}

	final void I(palette palette1, palette palette2) {
		D = palette1;
		MI = palette1;
		LI = palette2;
		NI = palette2;
	}

	final void Z(int i) {
		getRGB = true;
		length = 0;
		max = i;
		min = 0;
		cI = 0;
	}

	@Override
	final void I() {
		if (UI != null) {
			if (UI.e != 1)
				UI = null;
			else if (UI.v) {
				super.J = UI.J;
				if (VI == 1) {
					font gamefont1 = RI;
					super.S = UI.E - gamefont1.C;
					if (Z && super.DI == 1) {
						font gamefont2 = RI;
						super.S -= (gamefont2.C * (zI - 1)) / 2;
					}
				} else {
					font gamefont3 = RI;
					super.S = UI.H + gamefont3.C;
					if (Z && super.DI == 1) {
						font gamefont4 = RI;
						super.S += (gamefont4.C * (zI - 1)) / 2;
					}
				}
				F();
			}
		} else {
			super.I();
		}
		if (I != 0) {
			toCharArray++;
			if (toCharArray >= I)
				equip(true, null);
		}
		if (getRGB) {
			length--;
			if (length <= 0) {
				min++;
				length = max;
				if (cI < zI && min >= XI[cI] + YI[cI])
					cI++;
			}
		}
	}

	@Override
	final void I(surface surface1) {
		int i = 0;
		int j;
		int k;
		if (TI) {
			j = (int) super.J;
			k = (int) super.S;
		} else {
			j = (int) super.J + ((gamebase) (super.owner)).WC;
			k = (int) super.S + ((gamebase) (super.owner)).XC;
		}
		if (Z && super.DI == 1) {
			font gamefont1 = RI;
			k -= (gamefont1.C * (zI - 1)) / 2;
		}
		super.A = j;
		super.G = j;
		font gamefont2 = RI;
		super.E = k - gamefont2.C;
		super.H = k;
		if (OI != null) {
			int l = WI;
			font gamefont3 = RI;
			int j1 = gamefont3.C * zI;
			int l1 = QI.I(0, 0).C;
			int j2 = QI.I(0, 0).B;
			int l2 = l + PI * 2;
			int j3 = j1 + PI * 2;
			int l3 = l2 / l1 + 1;
			int i4 = j3 / j2 + 1;
			l2 = l3 * l1;
			j3 = i4 * j2;
			font gamefont8 = RI;
			int k4 = k - gamefont8.C - PI;
			int j4;
			if (Z)
				j4 = j - l2 / 2;
			else
				j4 = j - PI;
			int l4 = j4 + l3 * l1;
			int i5 = k4 + i4 * j2;
			surface1.I(j4, k4, l2, j3, OI.getRGB());
			for (int j5 = 0; j5 < l3; j5++) {
				surface1.I(QI.I(0, 1), j4 + j5 * l1, k4 - j2, super.owner);
				surface1.I(QI.I(0, 7), j4 + j5 * l1, i5, super.owner);
			}

			for (int k5 = 0; k5 < i4; k5++) {
				surface1.I(QI.I(0, 3), j4 - l1, k4 + k5 * j2, super.owner);
				surface1.I(QI.I(0, 5), l4, k4 + k5 * j2, super.owner);
			}

			surface1.I(QI.I(0, 0), j4 - l1, k4 - j2, super.owner);
			surface1.I(QI.I(0, 2), l4, k4 - j2, super.owner);
			surface1.I(QI.I(0, 6), j4 - l1, i5, super.owner);
			surface1.I(QI.I(0, 8), l4, i5, super.owner);
		}
		int k2 = 0;
		// boolean flag = false;
		if (LI != null)
			k2 = LI.I(toCharArray, I);
		else if (B != null)
			k2 = B.getRGB();
		int i2;
		if (D != null)
			i2 = D.I(toCharArray, I);
		else
			i2 = C.getRGB();
		for (; i <= cI && i < zI; i++) {
			int k1 = YI[i];
			int k3 = j;
			if (Z)
				k3 = j - iI[i] / 2;
			else
				k3 = j;
			super.A = Math.min(super.A, k3);
			super.G = Math.max(super.G, k3 + iI[i]);
			super.H = k;
			int i3 = 0;
			for (int i1 = XI[i]; i3 < k1 && i1 < min && i1 < HNSM; i3++) {
				char c = F[i1];
				font gamefont4 = RI;
				sprite sprite1 = c <= 0 || c >= font.D ? null : gamefont4.I[c];
				if (sprite1 != null) {
					if (B != null || LI != null) {
						if (getRGB && LI != null)
							if (min > HNSM + LI.C)
								k2 = LI.I(toCharArray, I);
							else
								k2 = LI.I(min - i1);
						font gamefont5 = RI;
						surface1.I(sprite1, k2, k3 - 1,
								(k - sprite1.B) + (c <= 0 || c >= font.D ? 0 : gamefont5.Z[c]) + 1, super.owner);
					}
					if (getRGB && D != null)
						if (min > HNSM + D.C)
							i2 = D.I(toCharArray, I);
						else
							i2 = D.I(min - i1);
					font gamefont6 = RI;
					surface1.I(sprite1, i2, k3, (k - sprite1.B) + (c <= 0 || c >= font.D ? 0 : gamefont6.Z[c]),
							super.owner);
					k3 += sprite1.C + RI.B;
				} else if (c == ' ')
					k3 += RI.B * 2;
				else
					k3 += RI.B;
				i1++;
			}

			font gamefont7 = RI;
			k += gamefont7.C;
		}

	}

	char F[];
	int HNSM;
	boolean getRGB;
	int length;
	int max;
	int min;
	int toCharArray;
	int I;
	boolean Z;
	Color C;
	Color B;
	palette D;
	palette LI;
	palette MI;
	palette NI;
	Color OI;
	int PI;
	sprite_group QI;
	font RI;
	boolean TI;
	oGameObject UI;
	int VI;
	int WI;
	int XI[];
	int YI[];
	int iI[];
	int zI;
	int cI;
}
