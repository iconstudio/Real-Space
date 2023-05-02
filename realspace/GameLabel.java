package realspace;

import java.awt.Color;

final class GameLabel extends GameObject
{
	public GameLabel(GameApp applet)
	{
		super(applet);

		XI = new int[51];
		YI = new int[51];
		iI = new int[51];
	}

	public final void Draw(String caption, Color color, Font font, boolean flag, final int x, final int y, int k, int l, int i1, boolean flag1)
	{
		if (font == null)
		{
			return;
		}

		super.Awake(null, 4, 0, 0, 0, true);

		myBuffer = caption.toCharArray();
		mySize = caption.length();
		
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
		RI = font;
		TI = flag;
		UI = null;
		super.HI = -1;
		QI = null;
		OI = null;
		if (i1 > 0)
			super.timeSinceEpoch = -i1;
		min = mySize;
		XI[0] = 0;
		YI[0] = mySize;
		zI = 0;
		WI = 0;
		int j1 = 0;

		for (int k1 = 0; k1 < mySize && zI < 51; k1++)
		{
			j1 = RI.I(myBuffer, XI[zI], (k1 - XI[zI]) + 1);
			if (j1 > WI)
				WI = j1;

			if (myBuffer[k1] == '|')
			{
				YI[zI] = k1 - XI[zI];
				iI[zI] = j1;
				zI++;
				if (zI < 51) {
					XI[zI] = k1;
					YI[zI] = mySize - k1;
				}
				myBuffer[k1] = ' ';
			}
			else if (k > 0 && j1 > k)
			{
				YI[zI] = k1 - XI[zI];
				iI[zI] = j1;
				zI++;
				if (zI < 51) {
					XI[zI] = k1;
					YI[zI] = mySize - k1;
				}
			}
		}

		if (zI < 51)
		{
			iI[zI] = j1;
			zI++;
		}

		cI = zI;
		myX = x;
		myY = y;
		Z = flag1;
	}

	final void I(float f, float f1, float f2, float f3)
	{
		super.SetupPhysics2(f, f1, f2, f3, false);
	}

	final void ApplyColours(Palette main_color, Palette under_color)
	{
		D = main_color;
		MI = main_color;
		LI = under_color;
		NI = under_color;
	}

	final void Z(int i)
	{
		getRGB = true;
		length = 0;
		max = i;
		min = 0;
		cI = 0;
	}

	@Override
	final void Update()
	{
		if (UI != null)
		{
			if (UI.activeMode != 1)
			{
				UI = null;
			}
			else if (UI.isVisible)
			{
				super.myX = UI.myX;

				if (VI == 1) {
					Font gamefont1 = RI;

					// @iconstudio
					// !warning
					// UI.E
					super.myY = UI.borderBottom - gamefont1.myHeight;
					if (Z && super.DI == 1) {
						Font gamefont2 = RI;
						super.myY -= (gamefont2.myHeight * (zI - 1)) / 2;
					}
				} else {
					Font gamefont3 = RI;
					super.myY = UI.borderTop + gamefont3.myHeight;
					if (Z && super.DI == 1) {
						Font gamefont4 = RI;
						super.myY += (gamefont4.myHeight * (zI - 1)) / 2;
					}
				}

				CalcCollisionBox();
			}
		} else {
			super.Update();
		}

		if (I != 0)
		{
			toCharArray++;
			if (toCharArray >= I)
				Equip(true, null);
		}

		if (getRGB)
		{
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
	final void Draw(Canvas surface1)
	{
		int i = 0;
		int j;
		int k;

		if (TI) {
			j = (int) super.myX;
			k = (int) super.myY;
		} else {
			j = (int) super.myX + (GameApp.Instance).WC;
			k = (int) super.myY + (GameApp.Instance).XC;
		}

		if (Z && super.DI == 1) {
			Font gamefont1 = RI;
			k -= (gamefont1.myHeight * (zI - 1)) / 2;
		}
		super.borderLeft = j;
		super.borderRight = j;
		Font gamefont2 = RI;

		// super.E
		super.borderBottom = k - gamefont2.myHeight;
		super.borderTop = k;
		if (OI != null) {
			int l = WI;
			Font gamefont3 = RI;
			int j1 = gamefont3.myHeight * zI;
			int l1 = QI.GetSprite(0, 0).C;
			int j2 = QI.GetSprite(0, 0).B;
			int l2 = l + PI * 2;
			int j3 = j1 + PI * 2;
			int l3 = l2 / l1 + 1;
			int i4 = j3 / j2 + 1;
			l2 = l3 * l1;
			j3 = i4 * j2;
			Font gamefont8 = RI;
			int k4 = k - gamefont8.myHeight - PI;
			int j4;
			if (Z)
				j4 = j - l2 / 2;
			else
				j4 = j - PI;

			int l4 = j4 + l3 * l1;
			int i5 = k4 + i4 * j2;
			surface1.I(j4, k4, l2, j3, OI.getRGB());
			for (int j5 = 0; j5 < l3; j5++) 
			{
				surface1.I(QI.GetSprite(0, 1), j4 + j5 * l1, k4 - j2, GameApp.Instance);
				surface1.I(QI.GetSprite(0, 7), j4 + j5 * l1, i5, GameApp.Instance);
			}

			for (int k5 = 0; k5 < i4; k5++) 
			{
				surface1.I(QI.GetSprite(0, 3), j4 - l1, k4 + k5 * j2, GameApp.Instance);
				surface1.I(QI.GetSprite(0, 5), l4, k4 + k5 * j2, GameApp.Instance);
			}

			surface1.I(QI.GetSprite(0, 0), j4 - l1, k4 - j2, GameApp.Instance);
			surface1.I(QI.GetSprite(0, 2), l4, k4 - j2, GameApp.Instance);
			surface1.I(QI.GetSprite(0, 6), j4 - l1, i5, GameApp.Instance);
			surface1.I(QI.GetSprite(0, 8), l4, i5, GameApp.Instance);
		}

		int k2 = 0;
		// boolean flag = false;
		if (LI != null)
			k2 = LI.Pick(toCharArray, I);
		else if (B != null)
			k2 = B.getRGB();
		int i2;
		if (D != null)
			i2 = D.Pick(toCharArray, I);
		else
			i2 = C.getRGB();
		for (; i <= cI && i < zI; i++) {
			int k1 = YI[i];
			int k3 = j;
			if (Z)
				k3 = j - iI[i] / 2;
			else
				k3 = j;
			super.borderLeft = Math.min(super.borderLeft, k3);
			super.borderRight = Math.max(super.borderRight, k3 + iI[i]);
			super.borderTop = k;
			int i3 = 0;
			for (int i1 = XI[i]; i3 < k1 && i1 < min && i1 < mySize; i3++) {
				char c = myBuffer[i1];
				Font gamefont4 = RI;
				Sprite sprite1 = c <= 0 || c >= Font.D ? null : gamefont4.fragSprites[c];
				if (sprite1 != null) {
					if (B != null || LI != null) {
						if (getRGB && LI != null)
							if (min > mySize + LI.GetCapacity())
								k2 = LI.Pick(toCharArray, I);
							else
								k2 = LI.Pick(min - i1);
						Font gamefont5 = RI;
						surface1.DrawSprite(sprite1, k2, k3 - 1,
								(k - sprite1.B) + (c <= 0 || c >= Font.D ? 0 : gamefont5.Z[c]) + 1, GameApp.Instance);
					}
					if (getRGB && D != null)
						if (min > mySize + D.GetCapacity())
							i2 = D.Pick(toCharArray, I);
						else
							i2 = D.Pick(min - i1);
					Font gamefont6 = RI;
					surface1.DrawSprite(sprite1, i2, k3, (k - sprite1.B) + (c <= 0 || c >= Font.D ? 0 : gamefont6.Z[c]),
							GameApp.Instance);
					k3 += sprite1.C + RI.myScaledWidth;
				} else if (c == ' ')
					k3 += RI.myScaledWidth * 2;
				else
					k3 += RI.myScaledWidth;
				i1++;
			}

			Font gamefont7 = RI;
			k += gamefont7.myHeight;
		}

	}

	char myBuffer[];
	int mySize;
	boolean getRGB;
	int length;
	int max;
	int min;
	int toCharArray;
	int I;
	boolean Z;
	Color C;
	Color B;
	Palette D;
	Palette LI;
	Palette MI;
	Palette NI;
	Color OI;
	int PI;
	SpriteGroup QI;
	Font RI;
	boolean TI;
	GameObject UI;
	int VI;
	int WI;
	int XI[];
	int YI[];
	int iI[];
	int zI;
	int cI;
}
