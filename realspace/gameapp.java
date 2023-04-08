package realspace;

import java.awt.Color;
import java.awt.Event;
import java.awt.Rectangle;
import java.net.URL;

public final class GameApp extends AppletImplements {
	private static final long serialVersionUID = -3548637070195402558L;

	public static GameApp Instance = null;
	private int cheatCode;

	public GameApp() {
		super();

		Instance = this;
	}

	@Override
	public final void init() {
		super.xC = 25;
		super.yC = 1000 / super.xC;
		setBackground(Color.black);

		super.init();
		labelTitle = "Realspace 2 - Emperor's Revenge";
		appletName = "realspace2";

		surfaceCreated = false;
		gray = false;
		green = false;
		round = false;
		PC = -1;
		QC = 1;
		nZ = 12F * super.viewScale;
		getAppletContext = (int) (220F * super.viewScale);
		Mission = new gamemission(this, 1000);
		DZ = new palette(this, 8);

		palette palette1 = DZ;
		Color color = Color.yellow.brighter().brighter();
		int i1 = color.getRGB();
		if (palette1.Z < palette1.C) {
			palette1.I[palette1.Z] = i1;
			palette1.Z++;
		}
		palette1 = DZ;
		color = Color.yellow.brighter();
		i1 = color.getRGB();
		if (palette1.Z < palette1.C) {
			palette1.I[palette1.Z] = i1;
			palette1.Z++;
		}
		palette1 = DZ;
		color = Color.yellow;
		i1 = color.getRGB();
		if (palette1.Z < palette1.C) {
			palette1.I[palette1.Z] = i1;
			palette1.Z++;
		}
		palette1 = DZ;
		color = Color.yellow.darker();
		i1 = color.getRGB();
		if (palette1.Z < palette1.C) {
			palette1.I[palette1.Z] = i1;
			palette1.Z++;
		}
		palette1 = DZ;
		color = Color.red.brighter();
		i1 = color.getRGB();
		if (palette1.Z < palette1.C) {
			palette1.I[palette1.Z] = i1;
			palette1.Z++;
		}
		palette1 = DZ;
		color = Color.red;
		i1 = color.getRGB();
		if (palette1.Z < palette1.C) {
			palette1.I[palette1.Z] = i1;
			palette1.Z++;
		}
		palette1 = DZ;
		color = Color.red.darker();
		i1 = color.getRGB();
		if (palette1.Z < palette1.C) {
			palette1.I[palette1.Z] = i1;
			palette1.Z++;
		}
		palette1 = DZ;
		color = Color.red.darker().darker();
		i1 = color.getRGB();
		if (palette1.Z < palette1.C) {
			palette1.I[palette1.Z] = i1;
			palette1.Z++;
		}
		FZ = new palette(this, 9);
		palette1 = FZ;
		color = Color.pink.brighter();
		i1 = color.getRGB();
		if (palette1.Z < palette1.C) {
			palette1.I[palette1.Z] = i1;
			palette1.Z++;
		}
		palette1 = FZ;
		color = Color.pink;
		i1 = color.getRGB();
		if (palette1.Z < palette1.C) {
			palette1.I[palette1.Z] = i1;
			palette1.Z++;
		}
		palette1 = FZ;
		color = Color.gray.brighter().brighter();
		i1 = color.getRGB();
		if (palette1.Z < palette1.C) {
			palette1.I[palette1.Z] = i1;
			palette1.Z++;
		}
		palette1 = FZ;
		color = Color.gray.brighter();
		i1 = color.getRGB();
		if (palette1.Z < palette1.C) {
			palette1.I[palette1.Z] = i1;
			palette1.Z++;
		}
		palette1 = FZ;
		color = Color.gray;
		i1 = color.getRGB();
		if (palette1.Z < palette1.C) {
			palette1.I[palette1.Z] = i1;
			palette1.Z++;
		}
		palette1 = FZ;
		color = Color.gray.darker();
		i1 = color.getRGB();
		if (palette1.Z < palette1.C) {
			palette1.I[palette1.Z] = i1;
			palette1.Z++;
		}
		palette1 = FZ;
		color = Color.gray.darker().darker();
		i1 = color.getRGB();
		if (palette1.Z < palette1.C) {
			palette1.I[palette1.Z] = i1;
			palette1.Z++;
		}
		palette1 = FZ;
		color = Color.blue.darker();
		i1 = color.getRGB();
		if (palette1.Z < palette1.C) {
			palette1.I[palette1.Z] = i1;
			palette1.Z++;
		}
		palette1 = FZ;
		color = Color.blue.darker().darker();
		i1 = color.getRGB();
		if (palette1.Z < palette1.C) {
			palette1.I[palette1.Z] = i1;
			palette1.Z++;
		}
		darker = new palette(this, 28);
		darker.I(Color.red.darker().darker().getRGB(), Color.red.brighter().brighter().getRGB(), 14, false, true);
		darker.I(Color.red.brighter().brighter().getRGB(), Color.red.darker().darker().getRGB(), 14, false, true);
		freeMemory = new palette(this, 28);
		freeMemory.I(Color.darkGray.getRGB(), Color.lightGray.getRGB(), 14, false, true);
		freeMemory.I(Color.lightGray.getRGB(), Color.darkGray.getRGB(), 14, false, true);
		HZ = new palette(this, 9);
		palette1 = HZ;
		color = Color.black;
		Color color1 = Color.gray;
		int color1_int;
		palette1.I(color.getRGB(), color1.getRGB(), 9, true, false);
		flashcolor_white = new palette(this, 11);
		palette1 = flashcolor_white;
		color = Color.black;
		color1 = Color.lightGray.brighter();
		palette1.I(color.getRGB(), color1.getRGB(), 11, true, false);
		flashcolor_red = new palette(this, 9);
		palette1 = flashcolor_red;
		color = Color.black;
		color1 = Color.red.brighter().brighter();
		palette1.I(color.getRGB(), color1.getRGB(), 9, true, false);
		flashcolor_navy = new palette(this, 9);
		palette1 = flashcolor_navy;
		color = Color.black;
		color1 = Color.blue.brighter();
		palette1.I(color.getRGB(), color1.getRGB(), 9, true, false);
		AZ = new palette(this, 9);
		palette1 = AZ;
		color = Color.black;
		color1 = Color.white;
		palette1.I(color.getRGB(), color1.getRGB(), 9, true, false);
		flashcolor_yellow = new palette(this, 9);
		palette1 = flashcolor_yellow;
		color = Color.black;
		color1 = Color.yellow;
		palette1.I(color.getRGB(), color1.getRGB(), 9, true, false);
		GZ = new palette(this, 12);
		palette1 = GZ;
		color = Color.yellow;
		color1 = Color.black;
		palette1.I(color.getRGB(), color1.getRGB(), 12, false, false);
		charAt = new palette(this, 6);
		palette1 = charAt;
		color = Color.gray;
		color1 = Color.black;
		palette1.I(color.getRGB(), color1.getRGB(), 6, false, false);
		cos = new palette(this, 6);
		palette1 = cos;
		color = Color.blue;
		color1 = Color.black;
		palette1.I(color.getRGB(), color1.getRGB(), 6, false, false);
		darkGray = new palette(this, 8);
		palette1 = darkGray;
		color = Color.white;
		color1 = Color.black;
		palette1.I(color.getRGB(), color1.getRGB(), 8, false, false);
		LZ = new palette(this, 5);
		palette1 = LZ;
		color = Color.green.brighter();
		color1_int = color.getRGB();
		if (palette1.Z < palette1.C) {
			palette1.I[palette1.Z] = color1_int;
			palette1.Z++;
		}
		palette1 = LZ;
		color = Color.green.brighter();
		color1_int = color.getRGB();
		if (palette1.Z < palette1.C) {
			palette1.I[palette1.Z] = color1_int;
			palette1.Z++;
		}
		palette1 = LZ;
		color = Color.green;
		color1_int = color.getRGB();
		if (palette1.Z < palette1.C) {
			palette1.I[palette1.Z] = color1_int;
			palette1.Z++;
		}
		palette1 = LZ;
		color = Color.green.darker();
		color1_int = color.getRGB();
		if (palette1.Z < palette1.C) {
			palette1.I[palette1.Z] = color1_int;
			palette1.Z++;
		}
		palette1 = LZ;
		color = Color.green.darker().darker();
		color1_int = color.getRGB();
		if (palette1.Z < palette1.C) {
			palette1.I[palette1.Z] = color1_int;
			palette1.Z++;
		}
		MZ = new palette(this, 5);
		palette1 = MZ;
		color = Color.red.brighter();
		color1_int = color.getRGB();
		if (palette1.Z < palette1.C) {
			palette1.I[palette1.Z] = color1_int;
			palette1.Z++;
		}
		palette1 = MZ;
		color = Color.red.brighter();
		color1_int = color.getRGB();
		if (palette1.Z < palette1.C) {
			palette1.I[palette1.Z] = color1_int;
			palette1.Z++;
		}
		palette1 = MZ;
		color = Color.red;
		color1_int = color.getRGB();
		if (palette1.Z < palette1.C) {
			palette1.I[palette1.Z] = color1_int;
			palette1.Z++;
		}
		palette1 = MZ;
		color = Color.red.darker();
		color1_int = color.getRGB();
		if (palette1.Z < palette1.C) {
			palette1.I[palette1.Z] = color1_int;
			palette1.Z++;
		}
		palette1 = MZ;
		color = Color.red.darker().darker();
		color1_int = color.getRGB();
		if (palette1.Z < palette1.C) {
			palette1.I[palette1.Z] = color1_int;
			palette1.Z++;
		}
		I((-5000F * viewScale) / 2.0F, (5000F * viewScale) / 2.0F, (-5000F * viewScale) / 2.0F, (5000F * viewScale) / 2.0F);
		fZ = worldBorderLeft + screen_width / 2.0F + 200F;
		jZ = worldBorderRight - screen_width / 2.0F - 200F;
		sZ = worldBorderTop + screen_height / 2.0F + 200F;
		aZ = worldBorderBottom - screen_height / 2.0F - 200F;

		lightGray = (int) (viewWidth * 0.25F);
		min = (int) (viewHeight * 0.25F);

		lightGray = Math.min(lightGray, min);
		min = lightGray;

		out = lightGray / 6;
		pink = min / 6;
		keyUp = super.viewWidth - lightGray - (int) (40F * super.viewScale);
		length = super.viewHeight - min - (int) (50F * super.viewScale);
		println = keyUp + lightGray / 2;
		random = length + min / 2;

		red = lightGray / super.worldHrz;
		repaint = min / super.worldVrt;

		super.labelLoading = null;
		super.EB = 0;
		super.GB = 1;
		repaint();
	}

	@Override
	public final void I() {
		execute_cheat();
		if (gray) {
			gray = false;
			if (super.pC)
				I(false);
		}
		if (green) {
			green = false;
			Mission.Z();
		}
		Camera.I();

		oGameObjectlist obj = dZ;
		oSpaceship nobj = (oSpaceship) ((obj).C <= 0 ? null : (obj).Z[0]);
		if (nobj != null && ((GameObject) (nobj)).s >= 0 && (nobj).QI == 4) {
			if (gZ > 0) {
				gZ--;
				if (gZ == 0)
					eZ = 0;
			}
			if (!super.pC) {
				if (getCodeBase != 1 && super.qC) {
					if (getCodeBase == 2) {
						float f1 = (float) Math.cos(nobj.Y);
						float f3 = (float) Math.sin(nobj.Y);
						nobj.W = f1 * ((GameObject) (nobj)).N;
						nobj.X = f3 * ((GameObject) (nobj)).N;
					} else {
						float f2 = (float) (-Math.cos(((GameObject) (nobj)).Y));
						float f4 = (float) (-Math.sin(((GameObject) (nobj)).Y));
						nobj.W = f2 * ((GameObject) (nobj)).N * 0.3F;
						nobj.X = f4 * ((GameObject) (nobj)).N * 0.3F;
					}
					nobj.K += ((GameObject) (nobj)).W;
					nobj.L += ((GameObject) (nobj)).X;
				} else {
					nobj.W = 0.0F;
					nobj.X = 0.0F;
				}
				if (getBackground != 1) {
					if (getBackground == 2) {
						getRGB -= 0.02454369F;
						if (getRGB < -0.1963495F)
							getRGB = -0.1963495F;
						nobj.Y += getRGB;
						if (((GameObject) (nobj)).Y < 0.0F)
							nobj.Y += 6.283185F;
					} else if (getBackground == 3) {
						getRGB += 0.02454369F;
						if (getRGB > 0.1963495F)
							getRGB = 0.1963495F;
						nobj.Y += getRGB;
						if (((GameObject) (nobj)).Y >= 6.283185F)
							nobj.Y -= 6.283185F;
					}
					nobj.d = ((GameObject) (nobj)).x.I(((GameObject) (nobj)).Y);
				}
			} 
			else if (super.qC && Math.random() * 10D > 9D)
			{
				abs();
			}
				
			if (((GameObject) (nobj)).J <= fZ) 
			{
				if (((GameObject) (nobj)).K < 0.0F)
					nobj.K = 0.0F;
				nobj.J = fZ;
				((GameObject) (nobj)).F();
			} 
			else if (((GameObject) (nobj)).J >= jZ) 
			{
				if (((GameObject) (nobj)).K > 0.0F)
					nobj.K = 0.0F;
				nobj.J = jZ;
				((GameObject) (nobj)).F();
			}

			if (((GameObject) (nobj)).S <= sZ) 
			{
				if (((GameObject) (nobj)).L < 0.0F)
					nobj.L = 0.0F;
				nobj.S = sZ;
				((GameObject) (nobj)).F();
			} 
			else if (((GameObject) (nobj)).S >= aZ) 
			{
				if (((GameObject) (nobj)).L > 0.0F)
					nobj.L = 0.0F;
				nobj.S = aZ;
				((GameObject) (nobj)).F();
			}
		}
		Starfield.update(((GameObject) (Camera)).K, ((GameObject) (Camera)).L);
		super.I();
		Mission.I();
		dZ.Z();
		oZ.Z();
		pZ.Z();
		qZ.Z();
		tZ.Z();
		vZ.Z();
		wZ.Z();
		yZ.Z();
		IC.Z();
		ZC.Z();
		AC.Z();
		EC.Z();
		GC.Z();
		BC.Z();
		IC.Z(wZ);
		IC.Z(GC);
		ZC.Z(wZ);
		wZ.Z(vZ);
		wZ.Z(dZ);
		wZ.Z(EC);
		vZ.Z(GC);
		yZ.Z(ZC);
		yZ.Z(vZ);
		yZ.Z(dZ);
		yZ.Z(EC);
		dZ.Z(BC);
		dZ.C();
		oZ.C();
		pZ.C();
		qZ.C();
		tZ.C();
		vZ.C();
		wZ.C();
		yZ.C();
		IC.C();
		ZC.C();
		AC.C();
		EC.C();
		GC.C();
		BC.C();
	}

	@Override
	public final void I(surface surf_dest) {
		surface surface2 = super.lC;
		surface surface3 = super.mC;
		System.arraycopy(surface3.B, 0, surface2.B, 0, surface2.C);

		if (!assetsLoaded) {
			int i1 = (super.viewWidth - 200) / 2;
			int i2 = (super.viewHeight - 200) / 2;
			if (blue != null)
				surf_dest.I(blue, i1, i2, this);
			if (super.GB > 0) {
				i1 += 6;
				i2 += 147;
				gameutil.I(surf_dest, i1, i2, 188, 20, (float) super.EB / (float) super.GB, 0xff4040ff,
						Colours.Green);
			}
			return;
		}

		if (!surfaceCreated)
			surfaceCreated = true;

		Starfield.draw(surf_dest);
		AC.I(surf_dest);
		EC.I(surf_dest);
		GC.I(surf_dest);

		if (!super.pC && NC) {
			int dx = (int) (20F * super.viewScale);
			int dy = (int) (25F * super.viewScale);
			surf_dest.draw_string(super.uC, Colours.White, super.hFontSmall, dx - 1, dy + 1);

			GameObject target = dZ.Z[0];
			GameObject obj = dZ.C <= 0 ? null : target;

			if (obj != null && obj.e == 1) {
				int k1 = (int) (220F * super.viewScale);
				surf_dest.draw_string("Damage", Colours.White, super.hFontSmall, k1 - 1, dy + 1);
				k1 += super.hFontSmall.I("Damage") + 7;
				Font gamefont1 = super.hFontSmall;
				dy -= (gamefont1.C * 3) / 5;
				float f1 = (float) ((obj).o + (obj).n) / (float) ((obj).p + (obj).q);
				if (f1 < MC) {
					MC = f1;
				} else if (f1 > MC) {
					if (f1 - MC > 0.01F)
						MC += 0.01F;
					else
						MC = f1;
				}

				Object obj1;
				gameutil.I(surf_dest, k1, dy + 2, getAppletContext, ((Font) (obj1 = super.eC)).C - 4, MC,
						Colours.Red, Colours.Yellow);
				surf_dest.I(k1, dy, getAppletContext, ((Font) (obj1 = super.eC)).C, Colours.DarkGreen, 1);
				int k3 = (int) (35F * super.viewScale);
				int i4 = (int) (20F * super.viewScale);
				int k4 = i4 + (int) (48F * super.viewScale);
				float f2 = Math.abs(super.IB % 22L - 11F) * 0.059F + 0.35F;
				dy = (int) (super.viewHeight * 0.7F);
				if (hZ == 1)
					surf_dest.I(arraycopy.I(0, 0), f2, i4, dy, this);
				else
					surf_dest.I(arraycopy.I(0, 0), i4, dy, this);
				surf_dest.draw_string("-", Colours.White, super.eC, k4, dy + super.eC.C + 2);
				dy += k3;
				obj1 = String.valueOf(kZ);
				if (hZ == 2)
					surf_dest.I(arraycopy.I(1, 0), f2, i4, dy, this);
				else
					surf_dest.I(arraycopy.I(1, 0), i4, dy, this);
				surf_dest.draw_string(((String) (obj1)), Colours.White, super.eC, k4, dy + super.eC.C + 2);
				dy += k3;
				obj1 = String.valueOf(lZ);
				if (hZ == 3)
					surf_dest.I(arraycopy.I(2, 0), f2, i4, dy, this);
				else
					surf_dest.I(arraycopy.I(2, 0), i4, dy, this);
				surf_dest.draw_string(((String) (obj1)), Colours.White, super.eC, k4, dy + super.eC.C + 2);
				dy += k3;
				obj1 = String.valueOf(mZ);
				if (hZ == 4)
					surf_dest.I(arraycopy.I(3, 0), f2, i4, dy, this);
				else
					surf_dest.I(arraycopy.I(3, 0), i4, dy, this);
				surf_dest.draw_string(((String) (obj1)), Colours.White, super.eC, k4, dy + super.eC.C + 2);
			}
			surf_dest.I(keyUp, length, lightGray, min, getBackground().getRGB());
		}
		vZ.I(surf_dest);
		wZ.I(surf_dest);
		dZ.I(surf_dest);
		oZ.I(surf_dest);
		pZ.I(surf_dest);
		yZ.I(surf_dest);
		tZ.I(surf_dest);
		qZ.I(surf_dest);
		IC.I(surf_dest);
		ZC.I(surf_dest);
		BC.I(surf_dest);
		if (super.pC) {
			surf_dest.draw_string("Click Anywhere Or Press Any Key To Start", Color.red.getRGB(), super.hFontSmall,
					super.viewWidth / 2 - super.hFontSmall.I("Click Anywhere Or Press Any Key To Start") / 2 - 1,
					super.viewHeight / 8 + 1);
			surf_dest.draw_string("Click Anywhere Or Press Any Key To Start", Color.yellow.getRGB(), super.hFontSmall,
					super.viewWidth / 2 - super.hFontSmall.I("Click Anywhere Or Press Any Key To Start") / 2,
					super.viewHeight / 8);
		} else if (NC) {
			int l1 = 1;
			int k2 = keyUp + out;
			for (; l1 < 6; l1++) {
				surf_dest.I(k2, length, 1, min, 0xff004000);
				k2 += out;
			}

			l1 = 1;
			k2 = length + pink;
			for (; l1 < 6; l1++) {
				surf_dest.I(keyUp, k2, lightGray, 1, 0xff004000);
				k2 += pink;
			}
			surf_dest.I(keyUp, length, lightGray, min, Colours.DarkGreen, 1);
			surf_dest.I(black.I(0, 0), keyUp + (lightGray - black.C) / 2, length + min + 2, this);

			int l2 = println + (int) (((GameObject) (Camera)).J * red);
			int i3 = random + (int) (((GameObject) (Camera)).S * repaint);
			surf_dest.I(l2 - 1, i3 - 1, 3, 3, Colours.Green);

			int j3 = (int) ((super.viewWidth * red) / 2.0F);
			int l3 = (int) ((super.viewHeight * red) / 2.0F);
			int j4 = l2 + j3;
			int l4 = i3 + l3;
			l2 -= j3;
			i3 -= l3;
			surf_dest.I(l2, i3, 2, 5, Colours.Green);
			surf_dest.I(l2 + 2, i3, 3, 2, Colours.Green);
			surf_dest.I(j4 - 1, i3, 2, 5, Colours.Green);
			surf_dest.I(j4 - 4, i3, 3, 2, Colours.Green);
			surf_dest.I(l2, l4 - 4, 2, 5, Colours.Green);
			surf_dest.I(l2 + 2, l4 - 1, 3, 2, Colours.Green);
			surf_dest.I(j4 - 1, l4 - 4, 2, 5, Colours.Green);
			surf_dest.I(j4 - 4, l4 - 1, 3, 2, Colours.Green);

			F(surf_dest, EC, false, 3, 3, Colours.LightGray, Colours.DarkGray);
			F(surf_dest, vZ, false, 3, 3, Colours.LightGray, Colours.DarkGray);
			F(surf_dest, wZ, false, 3, 3, Colours.Red, Colours.Maroon);
			F(surf_dest, GC, false, 3, 3, Colours.Red, Colours.Maroon);
			F(surf_dest, BC, true, 3, 3, Colours.Lemon, Colours.DarkYellow);
		}
		super.I(surf_dest);
	}

	public final void F(surface surface1, oGameObjectlist oGameObjectlist1, boolean flag, int i1, int j1, int k1,
			int l1) {
		int k2 = i1 / 2;
		int l2 = j1 / 2;

		for (int i3 = 0; i3 < oGameObjectlist1.C; i3++) {
			GameObject oGameObject1 = oGameObjectlist1.Z[i3];

			if (oGameObject1.e == 1 && oGameObject1.v && oGameObject1.w) {
				int i2 = (println + (int) (oGameObject1.J * red)) - k2;
				int j2 = (random + (int) (oGameObject1.S * repaint)) - l2;

				if (flag || oGameObject1.s < 28) {
					if (oGameObject1.s % 8 < 4)
						surface1.I(i2, j2, i1, j1, k1);
					else
						surface1.I(i2, j2, i1, j1, l1);
				} else {
					surface1.I(i2, j2, i1, j1, k1);
				}
			}
		}

	}

	public final void execute_cheat() {
		if (cheatCode != 0 && !super.pC) {
			super.tC = true;
			boolean flag = true;

			switch (cheatCode) {
				default:
					break;

				case 1: // '\001'
					super.uC = "Cheater: Kill All";
					oGameObjectlist oGameObjectlist1 = wZ;
					oGameObjectlist1.I(false, null, -1, -1, -1, -1);
					oGameObjectlist1 = yZ;
					oGameObjectlist1.I(false, null, -1, -1, -1, -1);
					break;

				case 5: // '\005'
					super.uC = "Cheater: Kill Friend";
					oGameObjectlist oGameObjectlist2 = vZ;
					if (oGameObjectlist2.C > 0)
						oGameObjectlist2.Z[0].equip(false, null);
					break;

				case 2: // '\002'
					super.uC = "Cheater: Repair";
					oGameObjectlist oGameObjectlist3 = vZ;
					oGameObjectlist3.I(1.0F, 1.0F, true, -1, -1, -1, -1);
					oGameObjectlist3 = dZ;
					oGameObjectlist3.I(1.0F, 1.0F, true, -1, -1, -1, -1);
					break;

				case 3: // '\003'
					super.uC = "Cheater: Invulnerable";
					oGameObjectlist oGameObjectlist4 = vZ;
					int k1 = oGameObjectlist4.C;
					for (int i1 = 0; i1 < k1; i1++) {
						oGameObjectlist4 = vZ;
						GameObject oGameObject1 = i1 < 0 || i1 >= oGameObjectlist4.C ? null : oGameObjectlist4.Z[i1];
						if (i1 == 0 && oGameObject1.r)
							flag = false;
						oGameObject1.r = flag;
					}

					oGameObjectlist4 = dZ;
					k1 = oGameObjectlist4.C;

					for (int j1 = 0; j1 < k1; j1++) {
						oGameObjectlist oGameObjectlist5 = dZ;
						GameObject oGameObject2 = j1 < 0 || j1 >= oGameObjectlist5.C ? null : oGameObjectlist5.Z[j1];
						if (j1 == 0 && oGameObject2.r)
							flag = false;
						oGameObject2.r = flag;
					}

					break;

				case 4: // '\004'
					super.uC = "Cheater: Skip Mission";
					Mission.Z();
					break;
			}
		}

		cheatCode = 0;
	}

	@Override
	public final boolean keyDown(Event event, int i1) {
		super.keyDown(event, i1);

		if (!super.isPaused && super.assetsLoaded)
			if (super.pC)
				switch (i1) {
					default:
						gray = true;
						break;

					case 80: // 'P'
					case 112: // 'p'
						break;
				}
			else if (Mission.O == 300 || Mission.O == 301 || Mission.O == 302) {
				switch (i1) {
					case 1004:
					case 1006:
						I(PC - 1);
						break;

					case 1005:
					case 1007:
						I(PC + 1);
						break;

					case 10: // '\n'
					case 32: // ' '
						J(PC);
						break;

					case 27: // '\033'
						J(-2);
						break;
				}
			} else {
				switch (i1) {
					case 1004:
						if (getCodeBase != 2)
							getCodeBase = 2;
						break;

					case 1005:
						if (getCodeBase != 3)
							getCodeBase = 3;
						break;

					case 1006:
						if (getBackground != 2) {
							getBackground = 2;
							getRGB = 0.0F;
						}
						break;

					case 1007:
						if (getBackground != 3) {
							getBackground = 3;
							getRGB = 0.0F;
						}
						break;

					case 32: // ' '
					case 65: // 'star_blinking'
					case 97: // 'a'
						if (super.qC) {
							abs();
						} else {
							oGameObjectlist oGameObjectlist1 = super.vC;
							if (oGameObjectlist1.I(1, -1, -1, -1, -1, 10F) != null)
								green = true;
						}
						break;

					case 10: // '\n'
					case 27: // '\033'
						oGameObjectlist oGameObjectlist2 = super.vC;
						if (oGameObjectlist2.I(1, -1, -1, -1, 10, -1F) != null)
							green = true;
						break;

					case 49: // '1'
						hZ = 1;
						break;

					case 50: // '2'
						if (kZ > 0)
							hZ = 2;
						break;

					case 51: // '3'
						if (lZ > 0)
							hZ = 3;
						break;

					case 52: // '4'
						if (mZ > 0)
							hZ = 4;
						break;

					case 1009:
						I(false);
						break;

					case 35: // '#'
						I(true);
						oGameObjectlist oGameObjectlist3 = super.vC;
						oGameObjectlist3.I(true, null, -1, -1, -1, -1);
						Mission.I(1200);
						break;

					case 64: // '@'
						round = !round;
						break;

					case 33: // '!'
						if (super.xC == 25) {
							super.xC = 80;
							super.yC = 1000 / super.xC;
						} else {
							super.xC = 25;
							super.yC = 1000 / super.xC;
						}
						break;
				}

				/*
				 * ASCII
				 * 065 == A
				 * 090 == Z
				 * 097 == a
				 * 122 == z
				 */

				if (null == lastInputString || 0 == lastInputString.length()) {
					return false;
				}

				if (lastInputString.equals("fry")) 
				{
					cheatCode = 1;
				} 
				else if (lastInputString.equals("woy")) 
				{
					cheatCode = 5;
				} 
				else if (lastInputString.equals("xif")) 
				{
					cheatCode = 2;
				} 
				else if (lastInputString.equals("ekab"))
				{
					cheatCode = 3;
				} 
				else if (lastInputString.equals("tak"))
				{
					cheatCode = 4;
				}
			}
		return true;
	}

	@Override
	@SuppressWarnings("deprecation")
	public final boolean keyUp(Event event, int i1) {
		super.keyUp(event, i1);
		switch (i1) {
			default:
				break;

			case 50: // '2'
			case 56: // '8'
			case 1004:
			case 1005:
				getCodeBase = 1;
				break;

			case 52: // '4'
			case 54: // '6'
			case 1006:
			case 1007:
				getBackground = 1;
				break;

			case 32: // ' '
			case 65: // 'star_blinking'
			case 97: // 'a'
				oGameObjectlist obj = dZ;
				oSpaceship nobj = (oSpaceship) (obj.C <= 0 ? null : obj.Z[0]);
				if (nobj != null) {
					nobj.Z = false;
					nobj.C = 0;
					nobj.B = 0;
				}
				break;
		}
		return true;
	}

	@Override
	public final boolean mouseDown(Event event, int i1, int j1) {
		if (!super.isPaused && super.assetsLoaded)
			if (super.pC) {
				boolean flag = false;
				GameLabel gametext2 = (GameLabel) super.vC.I(i1, j1);
				if (gametext2 != null && ((GameObject) (gametext2)).HI == 3) {
					flag = true;
					try {
						getAppletContext().showDocument(
								new URL(super.labelURL + "?game=realspace2&refer=" + getCodeBase() + labelURLSuffix),
								"_blank");
					} catch (Exception exception) {
						System.out.println("showDocument failed " + exception);
					}
				}
				if (!flag)
					gray = true;
			} else {
				GameLabel gametext1 = (GameLabel) super.vC.I(i1, j1);
				if (gametext1 != null)
					J(((GameObject) (gametext1)).HI);
			}
		return true;
	}

	@Override
	public final boolean mouseMove(Event event, int i1, int j1) {
		if (!super.isPaused && super.assetsLoaded && (Mission.O == 300 || Mission.O == 301 || Mission.O == 302)) {
			GameLabel gametext1 = (GameLabel) super.vC.I(i1, j1);
			if (gametext1 != null)
				I(((GameObject) (gametext1)).HI);
		}
		return true;
	}

	final void I(int i1) {
		boolean flag = false;
		oGameObjectlist oGameObjectlist1 = super.vC;
		int j1 = oGameObjectlist1.C;
		for (int k1 = 0; k1 < j1; k1++) {
			Object obj = super.vC;
			obj = k1 < 0 || k1 >= ((oGameObjectlist) (obj)).C ? null : ((oGameObjectlist) (obj)).Z[k1];
			if (obj != null && ((GameObject) (obj)).HI != -1 && ((GameObject) (obj)).HI == i1)
				flag = true;
		}

		if (flag) {
			PC = i1;
			for (int l1 = 0; l1 < j1; l1++) {
				oGameObjectlist obj1 = super.vC;
				GameLabel nobj = (GameLabel) (l1 < 0 || l1 >= obj1.C ? null : obj1.Z[l1]);
				if (nobj != null && ((GameObject) (nobj)).HI != -1)
					if (((GameObject) (nobj)).HI == i1) {
						palette palette1 = darker;
						palette palette2 = freeMemory;
						nobj.D = palette1;
						nobj.LI = palette2;
					} else {
						nobj.D = (nobj).MI;
						nobj.LI = (nobj).NI;
					}
			}

		}
	}

	final void J(int i1) {
		if (Mission.O == 300) {
			switch (i1) {
				case 1: // '\001'
					Mission.I(301);
					return;

				case 2: // '\002'
					Mission.I(302);
					return;

				case 3: // '\003'
					try {
						getAppletContext().showDocument(
								new URL(super.labelURL + "?game=realspace2&refer=" + getCodeBase() + labelURLSuffix),
								"_blank");
						return;
					} catch (Exception exception) {
						System.out.println("showDocument failed " + exception);
					}
					return;
			}
			oGameObjectlist oGameObjectlist1 = super.vC;
			oGameObjectlist1.I(true, null, -1, -1, -1, -1);
			I(true);
			return;
		}
		if (Mission.O == 301) {
			switch (i1) {
				case 1: // '\001'
					Mission.Q = 0;
					Mission.I(100);
					return;

				case 2: // '\002'
					Mission.Q = 1;
					Mission.I(100);
					return;

				case 3: // '\003'
					Mission.Q = 2;
					Mission.I(100);
					return;

				case 4: // '\004'
					Mission.Q = 3;
					Mission.I(100);
					return;
			}
			Mission.I(300);
			I(1);
			return;
		}
		if (Mission.O == 302) {
			switch (i1) {
				case 1: // '\001'
					QC = 1;
					starfield starfield1 = Starfield;
					int j1 = Starfield.star_number_start;
					starfield1.star_number = Math.min(j1, starfield1.star_number_start);
					break;

				case 2: // '\002'
					QC = 2;
					starfield starfield2 = Starfield;
					int k1 = Starfield.star_number_start / 2;
					starfield2.star_number = Math.min(k1, starfield2.star_number_start);
					break;

				case 3: // '\003'
					QC = 3;
					starfield starfield3 = Starfield;
					int l1 = Starfield.star_number_start / 4;
					starfield3.star_number = Math.min(l1, starfield3.star_number_start);
					break;
			}
			Mission.I(300);
			I(2);
			return;
		}
		if (i1 == 10)
			green = true;
	}

	final void abs() {
		oGameObjectlist obj = dZ;
		oSpaceship nobj = (oSpaceship) (obj.C <= 0 ? null : obj.Z[0]);
		if (nobj != null && ((GameObject) (nobj)).s >= 0 && nobj.QI == 4 && !nobj.Z) {
			nobj.J();
			nobj.Z = true;
			nobj.C = 5;
			nobj.B = 0;
		}
	}

	@Override
	public final boolean LoadAssets() {
		int k2 = 0;
		brighter();
		int l2 = k2++;
		super.labelLoading = null;
		super.EB = l2;
		super.GB = 112;
		repaint();
		imagepixels imagepixels1 = I("images/title1.jpg");
		blue = new sprite(200, 200, 0, 0, 0, 0, super.lC, false, imagepixels1, this);
		imagepixels1.Z = null;
		imagepixels1 = null;
		System.gc();
		l2 = k2++;
		super.labelLoading = null;
		super.EB = l2;
		super.GB = 112;
		repaint();
		imagepixels1 = I("images/spacefont.gif");
		super.eC = new Font(this, (int) (17.6F * super.viewScale), (int) (2.2F * super.viewScale),
				(int) (2.2F * super.viewScale));
		black(super.eC, imagepixels1, 0.55F * super.viewScale);
		super.hFontSmall = new Font(this, (int) (22.4F * super.viewScale), (int) (2.8F * super.viewScale),
				(int) (2.8F * super.viewScale));
		black(super.hFontSmall, imagepixels1, 0.7F * super.viewScale);
		super.label_font = new Font(this, (int) (27.2F * super.viewScale), (int) (3.4F * super.viewScale),
				(int) (3.4F * super.viewScale));
		black(super.label_font, imagepixels1, 0.85F * super.viewScale);
		super.hFontLarge = new Font(this, (int) (32F * super.viewScale), (int) (4F * super.viewScale),
				(int) (4F * super.viewScale));
		black(super.hFontLarge, imagepixels1, super.viewScale);
		l2 = k2++;
		super.labelLoading = "Loading And Preparing Resources";
		super.EB = l2;
		super.GB = 112;
		repaint();
		imagepixels1.Z = null;
		imagepixels1 = null;
		System.gc();
		l2 = k2 += 2;
		super.labelLoading = "Loading And Preparing Resources";
		super.EB = l2;
		super.GB = 112;
		repaint();
		NZ = new gamesoundlist(this, 14);
		PZ = NZ.sound_add("sounds/fire2.au", true);
		QZ = NZ.sound_add("sounds/fire5.au", false);
		OZ = NZ.sound_add("sounds/fire1.au", true);
		RZ = NZ.sound_add("sounds/fire3.au", true);
		TZ = NZ.sound_add("sounds/explosion_sm1.au", true);
		UZ = NZ.sound_add("sounds/explosion_sm2.au", true);
		VZ = NZ.sound_add("sounds/explosion_sm3.au", true);
		WZ = NZ.sound_add("sounds/explosion_med1.au", true);
		XZ = NZ.sound_add("sounds/explosion_lrg1.au", true);
		YZ = NZ.sound_add("sounds/explosion_lrg2.au", true);
		iZ = NZ.sound_add("sounds/explosion_lrg3.au", true);
		zZ = NZ.sound_add("sounds/levelstart.au", false);
		cZ = NZ.sound_add("sounds/levelend.au", false);
		bZ = NZ.sound_add("sounds/powerup2.au", false);
		for (int i1 = 0; i1 < NZ.number; i1++) {
			k2 += 2;
			super.labelLoading = "Loading And Preparing Resources";
			super.EB = k2;
			super.GB = 112;

			repaint();
			NZ.I(i1);
		}

		gamemusicpiece gamemusicpiece1, gamemusicpiece2, gamemusicpiece3, gamemusicpiece4;
		try {
			gamemusicpiece1 = new gamemusicpiece(this, "sounds/music1.au");
			k2 += 2;
			super.labelLoading = "Loading And Preparing Resources";
			super.EB = k2;
			super.GB = 112;
			repaint();
			gamemusicpiece2 = new gamemusicpiece(this, "sounds/music2.au");
			k2 += 2;
			super.labelLoading = "Loading And Preparing Resources";
			super.EB = k2;
			super.GB = 112;
			repaint();
			gamemusicpiece3 = new gamemusicpiece(this, "sounds/music3.au");
			k2 += 2;
			super.labelLoading = "Loading And Preparing Resources";
			super.EB = k2;
			super.GB = 112;
			repaint();
			gamemusicpiece4 = new gamemusicpiece(this, "sounds/music4.au");
			k2 += 2;
			super.labelLoading = "Loading And Preparing Resources";
			super.EB = k2;
			super.GB = 112;
			repaint();
			gc = new gamemusicseq(12);
			gc.I(gamemusicpiece1);
			gc.I(gamemusicpiece1);
			gc.I(gamemusicpiece1);
			gc.I(gamemusicpiece4);
			gc.I(gamemusicpiece4);
			gc.I(gamemusicpiece4);
			gc.I(gamemusicpiece3);
			gc.I(gamemusicpiece3);
			gc.I(gamemusicpiece4);
			gc.I(gamemusicpiece4);
			gc.I(gamemusicpiece3);
			gc.I(gamemusicpiece3);
			gc.I(gamemusicpiece2);
			gc.I(gamemusicpiece2);
			gc.I(gamemusicpiece2);
			gc.I();
			gamemusicpiece1 = null;
			gamemusicpiece2 = null;
			gamemusicpiece3 = null;
			gamemusicpiece4 = null;
		} catch (Exception _ex) {
			System.out.println("ERROR: exception during music load");
			gc = null;
		}
		System.gc();
		System.out.println("after music load  totalMemory=" + String.valueOf(Runtime.getRuntime().totalMemory())
				+ " freeMemory=" + String.valueOf(Runtime.getRuntime().freeMemory()));
		// gamemusicpiece1 = k2 += 3;
		super.labelLoading = "Loading And Preparing Resources";
		super.EB = k2;
		super.GB = 112;
		repaint();
		if ((imagepixels1 = I("images/ships1.gif")) == null)
			return false;
		G = new sprite_group(this, 64, 1);
		Object obj = G;
		float f1 = super.viewScale, factor;
		Object obj1 = super.lC;
		((sprite_group) (obj)).I(f1, 1, 27, 11, 277, 9, 0, 0, imagepixels1, 64, 0, 64, ((surface) (obj1)));
		H = new sprite_group(this, 64, 1);
		obj = H;
		f1 = super.viewScale;
		obj1 = super.lC;
		((sprite_group) (obj)).I(f1, 1, 17, 24, 282, 29, 0, 0, imagepixels1, 64, 0, 64, ((surface) (obj1)));
		K = new sprite_group(this, 64, 1);
		obj = K;
		f1 = super.viewScale;
		obj1 = super.lC;
		((sprite_group) (obj)).I(f1, 1, 19, 21, 282, 60, 0, 0, imagepixels1, 64, 0, 64, ((surface) (obj1)));
		L = new sprite_group(this, 64, 1);
		obj = L;
		f1 = super.viewScale;
		obj1 = super.lC;
		((sprite_group) (obj)).I(f1, 1, 23, 16, 318, 61, 0, 0, imagepixels1, 64, 0, 64, ((surface) (obj1)));
		M = new sprite_group(this, 64, 1);
		obj = M;
		f1 = super.viewScale;
		obj1 = super.lC;
		((sprite_group) (obj)).I(f1, 1, 26, 11, 354, 35, 0, 0, imagepixels1, 64, 0, 64, ((surface) (obj1)));
		N = new sprite_group(this, 64, 1);
		obj = N;
		f1 = super.viewScale;
		obj1 = super.lC;
		((sprite_group) (obj)).I(f1, 1, 18, 16, 357, 58, 0, 0, imagepixels1, 64, 0, 64, ((surface) (obj1)));
		O = new sprite_group(this, 64, 1);
		obj = O;
		f1 = super.viewScale;
		obj1 = super.lC;
		((sprite_group) (obj)).I(f1, 1, 23, 11, 390, 60, 0, 0, imagepixels1, 64, 0, 64, ((surface) (obj1)));
		P = new sprite_group(this, 64, 1);
		obj = P;
		f1 = super.viewScale;
		obj1 = super.lC;
		((sprite_group) (obj)).I(f1, 1, 23, 19, 390, 32, 0, 0, imagepixels1, 64, 0, 64, ((surface) (obj1)));
		obj = k2++;
		super.labelLoading = "Loading And Preparing Resources";
		super.EB = ((int) (obj));
		super.GB = 112;
		repaint();
		k = new sprite_group(this, 32, 1);
		arraycopy(k, super.viewScale, 3, 4, 55, 22, imagepixels1, 32, 0, 32);
		obj = k2++;
		super.labelLoading = "Loading And Preparing Resources";
		super.EB = ((int) (obj));
		super.GB = 112;
		repaint();
		l = new sprite_group(this, 32, 1);
		arraycopy(l, super.viewScale, 3, 5, 91, 21, imagepixels1, 32, 0, 32);
		obj = k2++;
		super.labelLoading = "Loading And Preparing Resources";
		super.EB = ((int) (obj));
		super.GB = 112;
		repaint();
		m = new sprite_group(this, 32, 1);
		arraycopy(m, super.viewScale, 3, 7, 123, 27, imagepixels1, 32, 0, 32);
		obj = k2++;
		super.labelLoading = "Loading And Preparing Resources";
		super.EB = ((int) (obj));
		super.GB = 112;
		repaint();
		obj = k2++;
		super.labelLoading = "Loading And Preparing Resources";
		super.EB = ((int) (obj));
		super.GB = 112;
		repaint();
		n = new sprite_group(this, 32, 1);
		arraycopy(n, super.viewScale, 3, 12, 159, 24, imagepixels1, 32, 0, 32);
		obj = k2++;
		super.labelLoading = "Loading And Preparing Resources";
		super.EB = ((int) (obj));
		super.GB = 112;
		repaint();
		o = new sprite_group(this, 32, 1);
		arraycopy(o, super.viewScale, 3, 44, 55, 32, imagepixels1, 32, 0, 32);
		obj = k2++;
		super.labelLoading = "Loading And Preparing Resources";
		super.EB = ((int) (obj));
		super.GB = 112;
		repaint();
		p = new sprite_group(this, 32, 1);
		arraycopy(p, super.viewScale, 3, 47, 96, 45, imagepixels1, 32, 0, 32);
		obj = k2++;
		super.labelLoading = "Loading And Preparing Resources";
		super.EB = ((int) (obj));
		super.GB = 112;
		repaint();
		q = new sprite_group(this, 32, 1);
		arraycopy(q, super.viewScale, 3, 47, 148, 34, imagepixels1, 32, 0, 32);
		obj = k2++;
		super.labelLoading = "Loading And Preparing Resources";
		super.EB = ((int) (obj));
		super.GB = 112;
		repaint();
		obj = k2++;
		super.labelLoading = "Loading And Preparing Resources";
		super.EB = ((int) (obj));
		super.GB = 112;
		repaint();
		r = new sprite_group(this, 32, 1);
		arraycopy(r, super.viewScale, 3, 95, 8, 51, imagepixels1, 32, 0, 32);
		obj = k2++;
		super.labelLoading = "Loading And Preparing Resources";
		super.EB = ((int) (obj));
		super.GB = 112;
		repaint();
		t = new sprite_group(this, 32, 1);
		arraycopy(t, super.viewScale, 3, 152, 10, 44, imagepixels1, 32, 0, 32);
		obj = k2++;
		super.labelLoading = "Loading And Preparing Resources";
		super.EB = ((int) (obj));
		super.GB = 112;
		repaint();
		obj = k2++;
		super.labelLoading = "Loading And Preparing Resources";
		super.EB = ((int) (obj));
		super.GB = 112;
		repaint();
		u = new sprite_group(this, 32, 1);
		arraycopy(u, super.viewScale, 3, 150, 125, 46, imagepixels1, 32, 0, 32);
		obj = k2++;
		super.labelLoading = "Loading And Preparing Resources";
		super.EB = ((int) (obj));
		super.GB = 112;
		repaint();
		v = new sprite_group(this, 32, 1);
		arraycopy(v, super.viewScale, 3, 8, 192, 48, imagepixels1, 32, 0, 32);
		obj = k2++;
		super.labelLoading = "Loading And Preparing Resources";
		super.EB = ((int) (obj));
		super.GB = 112;
		repaint();
		w = new sprite_group(this, 32, 1);
		arraycopy(w, super.viewScale, 3, 390, 169, 86, imagepixels1, 32, 0, 32);
		obj = k2++;
		super.labelLoading = "Loading And Preparing Resources";
		super.EB = ((int) (obj));
		super.GB = 112;
		repaint();
		II = new sprite_group(this, 1);
		append(II, super.viewScale, 0.0F, 0, 244, 136, 112, imagepixels1);
		FI = new sprite_group(this, 64, 1);
		FI.I(super.viewScale, 3, 33, 32, 100, 133, 6, 0, imagepixels1, 64, 0, 64, super.lC);
		ZI = new sprite_group(this, 1);
		append(ZI, super.viewScale, 0.0F, 0, 125, 172, 49, imagepixels1);
		CI = new sprite_group(this, 1);
		append(CI, super.viewScale, 0.0F, 0, 181, 174, 46, imagepixels1);
		BI = new sprite_group(this, 1);
		append(BI, super.viewScale, 0.0F, 0, 120, 223, 36, imagepixels1);
		DI = new sprite_group(this, 1);
		append(DI, super.viewScale, 0.0F, 0, 186, 224, 32, imagepixels1);
		obj = k2++;
		super.labelLoading = "Loading And Preparing Resources";
		super.EB = ((int) (obj));
		super.GB = 112;
		repaint();
		JI = new sprite_group(this, 1);
		append(JI, super.viewScale, 0.0F, 0, 450, 8, 240, imagepixels1);
		SI = new sprite_group(this, 1);
		append(SI, super.viewScale, 0.0F, 0, 401, 146, 20, imagepixels1);
		AI = new sprite_group(this, 1);
		append(AI, super.viewScale, 0.0F, 0, 401, 89, 47, imagepixels1);
		EI = new sprite_group(this, 1);
		append(EI, super.viewScale, 0.0F, 0, 341, 81, 53, imagepixels1);
		GI = new sprite_group(this, 1);
		append(GI, super.viewScale, 0.0F, 0, 299, 85, 45, imagepixels1);
		obj = k2++;
		super.labelLoading = "Loading And Preparing Resources";
		super.EB = ((int) (obj));
		super.GB = 112;
		repaint();
		HI = new sprite_group(this, 64, 1);
		HI.I(super.viewScale, 0, 13, 10, 251, 8, 2, 0, imagepixels1, 64, 0, 64, super.lC);
		imagepixels1.Z = null;
		imagepixels1 = null;
		System.gc();
		obj = k2 += 3;
		super.labelLoading = "Loading And Preparing Resources";
		super.EB = ((int) (obj));
		super.GB = 112;
		repaint();
		if ((imagepixels1 = I("images/ships2.gif")) == null)
			return false;
		obj = k2++;
		super.labelLoading = "Loading And Preparing Resources";
		super.EB = ((int) (obj));
		super.GB = 112;
		repaint();
		U = new sprite_group(this, 32, 1);
		arraycopy(U, super.viewScale, 3, 7, 60, 32, imagepixels1, 32, 0, 32);
		obj = k2++;
		super.labelLoading = "Loading And Preparing Resources";
		super.EB = ((int) (obj));
		super.GB = 112;
		repaint();
		V = new sprite_group(this, 32, 1);
		arraycopy(V, super.viewScale, 3, 16, 98, 33, imagepixels1, 32, 0, 32);
		obj = k2++;
		super.labelLoading = "Loading And Preparing Resources";
		super.EB = ((int) (obj));
		super.GB = 112;
		repaint();
		W = new sprite_group(this, 32, 1);
		arraycopy(W, super.viewScale, 3, 11, 136, 37, imagepixels1, 32, 0, 32);
		obj = k2++;
		super.labelLoading = "Loading And Preparing Resources";
		super.EB = ((int) (obj));
		super.GB = 112;
		repaint();
		obj = k2++;
		super.labelLoading = "Loading And Preparing Resources";
		super.EB = ((int) (obj));
		super.GB = 112;
		repaint();
		X = new sprite_group(this, 32, 1);
		arraycopy(X, super.viewScale, 3, 10, 178, 38, imagepixels1, 32, 0, 32);
		obj = k2++;
		super.labelLoading = "Loading And Preparing Resources";
		super.EB = ((int) (obj));
		super.GB = 112;
		repaint();
		Y = new sprite_group(this, 64, 1);
		arraycopy(Y, super.viewScale, 3, 53, 54, 41, imagepixels1, 64, 0, 64);
		obj = k2++;
		super.labelLoading = "Loading And Preparing Resources";
		super.EB = ((int) (obj));
		super.GB = 112;
		repaint();
		i = new sprite_group(this, 32, 1);
		arraycopy(i, super.viewScale, 3, 55, 105, 46, imagepixels1, 32, 0, 32);
		obj = k2++;
		super.labelLoading = "Loading And Preparing Resources";
		super.EB = ((int) (obj));
		super.GB = 112;
		repaint();
		obj = k2++;
		super.labelLoading = "Loading And Preparing Resources";
		super.EB = ((int) (obj));
		super.GB = 112;
		repaint();
		z = new sprite_group(this, 32, 1);
		arraycopy(z, super.viewScale, 3, 57, 151, 50, imagepixels1, 32, 0, 32);
		obj = k2++;
		super.labelLoading = "Loading And Preparing Resources";
		super.EB = ((int) (obj));
		super.GB = 112;
		repaint();
		c = new sprite_group(this, 32, 1);
		arraycopy(c, super.viewScale, 3, 108, 47, 106, imagepixels1, 32, 0, 32);
		obj = k2++;
		super.labelLoading = "Loading And Preparing Resources";
		super.EB = ((int) (obj));
		super.GB = 112;
		repaint();
		obj = k2++;
		super.labelLoading = "Loading And Preparing Resources";
		super.EB = ((int) (obj));
		super.GB = 112;
		repaint();
		b = new sprite_group(this, 32, 1);
		arraycopy(b, super.viewScale, 3, 111, 159, 66, imagepixels1, 32, 0, 32);
		obj = k2++;
		super.labelLoading = "Loading And Preparing Resources";
		super.EB = ((int) (obj));
		super.GB = 112;
		repaint();
		d = new sprite_group(this, 32, 1);
		arraycopy(d, super.viewScale, 3, 233, 6, 88, imagepixels1, 32, 0, 32);
		obj = k2++;
		super.labelLoading = "Loading And Preparing Resources";
		super.EB = ((int) (obj));
		super.GB = 112;
		repaint();
		f = new sprite_group(this, 32, 1);
		arraycopy(f, super.viewScale, 3, 228, 117, 104, imagepixels1, 32, 0, 32);
		obj = k2++;
		super.labelLoading = "Loading And Preparing Resources";
		super.EB = ((int) (obj));
		super.GB = 112;
		repaint();
		j = new sprite_group(this, 1);
		append(j, super.viewScale, 0.0F, 0, 322, 5, 108, imagepixels1);
		s = new sprite_group(this, 1);
		append(s, super.viewScale, 0.0F, 0, 400, 126, 25, imagepixels1);
		a = new sprite_group(this, 1);
		append(a, super.viewScale, 0.0F, 0, 426, 126, 25, imagepixels1);
		e = new sprite_group(this, 1);
		append(e, super.viewScale, 0.0F, 0, 400, 161, 17, imagepixels1);
		g = new sprite_group(this, 1);
		append(g, super.viewScale, 0.0F, 0, 430, 160, 17, imagepixels1);
		obj = k2++;
		super.labelLoading = "Loading And Preparing Resources";
		super.EB = ((int) (obj));
		super.GB = 112;
		repaint();
		h = new sprite_group(this, 1);
		append(h, super.viewScale, 0.0F, 0, 460, 2, 282, imagepixels1);
		obj = k2++;
		super.labelLoading = "Loading And Preparing Resources";
		super.EB = ((int) (obj));
		super.GB = 112;
		repaint();
		F = new sprite_group(this, 12);
		append(F, super.viewScale, 0.0F, 0, 5, 227, 23, imagepixels1);
		append(F, super.viewScale, 0.0F, 0, 36, 227, 23, imagepixels1);
		append(F, super.viewScale, 0.0F, 0, 66, 227, 23, imagepixels1);
		append(F, super.viewScale, 0.0F, 0, 97, 227, 23, imagepixels1);
		append(F, super.viewScale, 0.0F, 0, 127, 227, 23, imagepixels1);
		append(F, super.viewScale, 0.0F, 0, 157, 227, 23, imagepixels1);
		append(F, super.viewScale, 0.0F, 0, 187, 227, 23, imagepixels1);
		append(F, super.viewScale, 0.0F, 0, 217, 227, 23, imagepixels1);
		append(F, super.viewScale, 0.0F, 0, 247, 227, 23, imagepixels1);
		append(F, super.viewScale, 0.0F, 0, 277, 227, 23, imagepixels1);
		append(F, super.viewScale, 0.0F, 0, 307, 227, 23, imagepixels1);
		append(F, super.viewScale, 0.0F, 0, 337, 227, 23, imagepixels1);
		obj = k2++;
		super.labelLoading = "Loading And Preparing Resources";
		super.EB = ((int) (obj));
		super.GB = 112;
		repaint();
		HNSM = new sprite_group(this, 12);
		append(HNSM, super.viewScale, 0.0F, 0, 6, 256, 27, imagepixels1);
		append(HNSM, super.viewScale, 0.0F, 0, 37, 256, 27, imagepixels1);
		append(HNSM, super.viewScale, 0.0F, 0, 67, 256, 27, imagepixels1);
		append(HNSM, super.viewScale, 0.0F, 0, 97, 256, 27, imagepixels1);
		append(HNSM, super.viewScale, 0.0F, 0, 127, 256, 27, imagepixels1);
		append(HNSM, super.viewScale, 0.0F, 0, 157, 256, 27, imagepixels1);
		append(HNSM, super.viewScale, 0.0F, 0, 186, 256, 27, imagepixels1);
		append(HNSM, super.viewScale, 0.0F, 0, 216, 256, 27, imagepixels1);
		append(HNSM, super.viewScale, 0.0F, 0, 247, 256, 27, imagepixels1);
		append(HNSM, super.viewScale, 0.0F, 0, 276, 256, 27, imagepixels1);
		append(HNSM, super.viewScale, 0.0F, 0, 306, 256, 27, imagepixels1);
		append(HNSM, super.viewScale, 0.0F, 0, 336, 256, 27, imagepixels1);
		obj = k2++;
		super.labelLoading = "Loading And Preparing Resources";
		super.EB = ((int) (obj));
		super.GB = 112;
		repaint();
		abs = new sprite_group(this, 64, 1);
		abs.I(super.viewScale, 0, 13, 10, 133, 5, 2, 0, imagepixels1, 64, 0, 64, super.lC);
		KI = new sprite_group(this, 64, 1);
		KI.I(super.viewScale, 0, 14, 11, 132, 26, 2, 0, imagepixels1, 64, 0, 64, super.lC);
		imagepixels1.Z = null;
		imagepixels1 = null;
		System.gc();
		float f2 = k2 += 3;
		super.labelLoading = "Loading And Preparing Resources";
		super.EB = (int) f2;
		super.GB = 112;
		repaint();
		if ((imagepixels1 = I("images/effects4.jpg")) == null)
			return false;
		imagepixels1.I(0, 20, 0, 20, 0, 20);
		imagepixels1.I(368, 212, 302, 236, imagepixels1, 302, 236);
		imagepixels1.I(183, 158, 298, 443, imagepixels1, 298, 443);
		jI = new sprite_group(this, 2);
		sprite_group sprite_group1 = jI;
		float f3 = super.viewScale;
		Object obj3 = super.lC;
		Object obj2 = sprite.I(f3, 0.0F, 0, 269, 263, 13, 2, 0, 0, imagepixels1, ((surface) (obj3)), this);
		sprite_group1.I(0, ((sprite) (obj2)));
		sprite_group1 = jI;
		obj2 = super.viewScale * 0.6F;
		obj3 = super.lC;
		obj2 = sprite.I(((float) (obj2)), 0.0F, 0, 269, 263, 13, 2, 0, 0, imagepixels1, ((surface) (obj3)), this);
		sprite_group1.I(0, ((sprite) (obj2)));
		sI = new sprite_group(this, 2);
		sprite_group1 = sI;
		obj2 = super.viewScale;
		obj3 = super.lC;
		obj2 = sprite.I(((float) (obj2)), 0.0F, 0, 226, 226, 320, 7, 0, 0, imagepixels1, ((surface) (obj3)), this);
		sprite_group1.I(0, ((sprite) (obj2)));
		sprite_group1 = sI;
		obj2 = super.viewScale * 0.6F;
		obj3 = super.lC;
		obj2 = sprite.I(((float) (obj2)), 0.0F, 0, 226, 226, 320, 7, 0, 0, imagepixels1, ((surface) (obj3)), this);
		sprite_group1.I(0, ((sprite) (obj2)));
		mI = new sprite_group(this, 2);
		sprite_group1 = mI;
		obj2 = super.viewScale;
		obj3 = super.lC;
		obj2 = sprite.I(((float) (obj2)), 0.0F, 0, 280, 279, 16, 271, 0, 0, imagepixels1, ((surface) (obj3)), this);
		sprite_group1.I(0, ((sprite) (obj2)));
		sprite_group1 = mI;
		obj2 = super.viewScale * 0.6F;
		obj3 = super.lC;
		obj2 = sprite.I(((float) (obj2)), 0.0F, 0, 280, 279, 16, 271, 0, 0, imagepixels1, ((surface) (obj3)), this);
		sprite_group1.I(0, ((sprite) (obj2)));
		vI = new sprite_group(this, 1);
		sprite_group1 = vI;
		obj2 = super.viewScale;
		obj3 = super.lC;
		obj2 = sprite.I(((float) (obj2)), 0.0F, 0, 176, 208, 480, 240, 0, 0, imagepixels1, ((surface) (obj3)), this);
		sprite_group1.I(0, ((sprite) (obj2)));
		wI = new sprite_group(this, 1);
		sprite_group1 = wI;
		obj2 = super.viewScale;
		obj3 = super.lC;
		obj2 = sprite.I(((float) (obj2)), 0.0F, 0, 156, 200, 305, 239, 0, 0, imagepixels1, ((surface) (obj3)), this);
		sprite_group1.I(0, ((sprite) (obj2)));
		xI = new sprite_group(this, 1);
		sprite_group1 = xI;
		obj2 = super.viewScale;
		obj3 = super.lC;
		obj2 = sprite.I(((float) (obj2)), 0.0F, 0, 183, 158, 298, 443, 0, 0, imagepixels1, ((surface) (obj3)), this);
		sprite_group1.I(0, ((sprite) (obj2)));
		gI = new sprite_group(this, 1, 1);
		sprite_group1 = gI;
		obj2 = super.viewScale;
		obj3 = super.lC;
		obj2 = sprite.I(((float) (obj2)), 0.0F, 0, 233, 201, 434, 596, 0, 0, imagepixels1, ((surface) (obj3)), this);
		sprite_group1.I(0, ((sprite) (obj2)));
		hI = new sprite_group(this, 16, 1);
		hI.I(super.viewScale, 0, 36, 30, 35, 691, 0, 0, imagepixels1, 16, 0, 16, super.lC);
		kI = new sprite_group(this, 1, 1);
		sprite_group1 = kI;
		obj2 = super.viewScale;
		obj3 = super.lC;
		obj2 = sprite.I(((float) (obj2)), 0.0F, 0, 65, 49, 30, 742, 0, 0, imagepixels1, ((surface) (obj3)), this);
		sprite_group1.I(0, ((sprite) (obj2)));
		lI = new sprite_group(this, 1, 1);
		sprite_group1 = lI;
		obj2 = super.viewScale;
		obj3 = super.lC;
		obj2 = sprite.I(((float) (obj2)), 5.969026F, 0, 119, 108, 114, 685, 0, 0, imagepixels1, ((surface) (obj3)),
				this);
		sprite_group1.I(0, ((sprite) (obj2)));
		yI = new sprite_group(this, 2);
		sprite_group1 = yI;
		obj2 = super.viewScale;
		obj3 = super.lC;
		obj2 = sprite.I(((float) (obj2)), 0.0F, 0, 124, 124, 37, 557, 0, 0, imagepixels1, ((surface) (obj3)), this);
		sprite_group1.I(0, ((sprite) (obj2)));
		sprite_group1 = yI;
		obj2 = super.viewScale * 0.55F;
		obj3 = super.lC;
		obj2 = sprite.I(((float) (obj2)), 0.0F, 0, 124, 124, 37, 557, 0, 0, imagepixels1, ((surface) (obj3)), this);
		sprite_group1.I(0, ((sprite) (obj2)));
		IZ = new sprite_group(this, 2);
		sprite_group1 = IZ;
		obj2 = super.viewScale;
		obj3 = super.lC;
		obj2 = sprite.I(((float) (obj2)), 0.0F, 0, 124, 124, 177, 557, 0, 0, imagepixels1, ((surface) (obj3)), this);
		sprite_group1.I(0, ((sprite) (obj2)));
		sprite_group1 = IZ;
		obj2 = super.viewScale * 0.6F;
		obj3 = super.lC;
		obj2 = sprite.I(((float) (obj2)), 0.0F, 0, 124, 124, 177, 557, 0, 0, imagepixels1, ((surface) (obj3)), this);
		sprite_group1.I(0, ((sprite) (obj2)));
		imagepixels1.Z = null;
		imagepixels1 = null;
		System.gc();
		factor = k2 += 3;
		super.labelLoading = "Loading And Preparing Resources";
		super.EB = (int) factor;
		super.GB = 112;
		repaint();
		if ((imagepixels1 = I("images/effects3.jpg")) == null)
			return false;
		imagepixels1.I(0, 20, 0, 20, 0, 20);
		imagepixels1.I(114, 120, 17, 263, imagepixels1, 17, 402);
		nI = new sprite_group(this, 1);
		sprite_group1 = nI;
		obj2 = super.viewScale;
		obj3 = super.lC;
		obj2 = sprite.I(((float) (obj2)), 0.0F, 0, 123, 121, 10, 8, 0, 0, imagepixels1, ((surface) (obj3)), this);
		sprite_group1.I(0, ((sprite) (obj2)));
		tI = new sprite_group(this, 2);
		sprite_group1 = tI;
		obj2 = super.viewScale;
		obj3 = super.lC;
		obj2 = sprite.I(((float) (obj2)), 0.0F, 0, 65, 65, 7, 157, 0, 0, imagepixels1, ((surface) (obj3)), this);
		sprite_group1.I(0, ((sprite) (obj2)));
		sprite_group1 = tI;
		obj2 = super.viewScale * 0.6F;
		obj3 = super.lC;
		obj2 = sprite.I(((float) (obj2)), 0.0F, 0, 65, 65, 7, 157, 0, 0, imagepixels1, ((surface) (obj3)), this);
		sprite_group1.I(0, ((sprite) (obj2)));
		uI = new sprite_group(this, 2);
		sprite_group1 = uI;
		obj2 = super.viewScale;
		obj3 = super.lC;
		obj2 = sprite.I(((float) (obj2)), 0.0F, 0, 123, 122, 166, 281, 0, 0, imagepixels1, ((surface) (obj3)), this);
		sprite_group1.I(0, ((sprite) (obj2)));
		sprite_group1 = uI;
		obj2 = super.viewScale * 0.5F;
		obj3 = super.lC;
		obj2 = sprite.I(((float) (obj2)), 0.0F, 0, 123, 122, 166, 281, 0, 0, imagepixels1, ((surface) (obj3)), this);
		sprite_group1.I(0, ((sprite) (obj2)));
		eI = new sprite_group(this, 1, 4);
		sprite_group1 = eI;
		obj2 = super.viewScale;
		obj3 = super.lC;
		obj2 = sprite.I(((float) (obj2)), 0.0F, 0, 277, 276, 317, 239, 0, 0, imagepixels1, ((surface) (obj3)), this);
		sprite_group1.I(0, ((sprite) (obj2)));
		sprite_group1 = eI;
		obj2 = super.viewScale;
		obj3 = super.lC;
		obj2 = sprite.I(((float) (obj2)), 0.0F, 0, 270, 270, 385, 520, 0, 0, imagepixels1, ((surface) (obj3)), this);
		sprite_group1.I(0, ((sprite) (obj2)));
		sprite_group1 = eI;
		obj2 = super.viewScale * 0.6F;
		obj3 = super.lC;
		obj2 = sprite.I(((float) (obj2)), 0.0F, 0, 270, 270, 385, 520, 0, 0, imagepixels1, ((surface) (obj3)), this);
		sprite_group1.I(0, ((sprite) (obj2)));
		sprite_group1 = eI;
		obj2 = super.viewScale * 0.6F;
		obj3 = super.lC;
		obj2 = sprite.I(((float) (obj2)), 0.0F, 0, 277, 276, 317, 239, 0, 0, imagepixels1, ((surface) (obj3)), this);
		sprite_group1.I(0, ((sprite) (obj2)));
		pI = new sprite_group(this, 1);
		sprite_group1 = pI;
		obj2 = super.viewScale;
		obj3 = super.lC;
		obj2 = sprite.I(((float) (obj2)), 0.0F, 0, 162, 161, 145, 5, 0, 0, imagepixels1, ((surface) (obj3)), this);
		sprite_group1.I(0, ((sprite) (obj2)));
		qI = new sprite_group(this, 1);
		sprite_group1 = qI;
		obj2 = super.viewScale;
		obj3 = super.lC;
		obj2 = sprite.I(((float) (obj2)), 0.0F, 0, 89, 88, 86, 169, 0, 0, imagepixels1, ((surface) (obj3)), this);
		sprite_group1.I(0, ((sprite) (obj2)));
		aI = new sprite_group(this, 2);
		sprite_group1 = aI;
		obj2 = super.viewScale;
		obj3 = super.lC;
		obj2 = sprite.I(((float) (obj2)), 0.0F, 0, 364, 160, 4, 542, 0, 0, imagepixels1, ((surface) (obj3)), this);
		sprite_group1.I(0, ((sprite) (obj2)));
		sprite_group1 = aI;
		obj2 = super.viewScale * 0.6F;
		obj3 = super.lC;
		obj2 = sprite.I(((float) (obj2)), 0.0F, 0, 364, 160, 4, 542, 0, 0, imagepixels1, ((surface) (obj3)), this);
		sprite_group1.I(0, ((sprite) (obj2)));
		rI = new sprite_group(this, 1);
		sprite_group1 = rI;
		obj2 = super.viewScale;
		obj3 = super.lC;
		obj2 = sprite.I(((float) (obj2)), 0.0F, 0, 89, 89, 156, 419, 0, 0, imagepixels1, ((surface) (obj3)), this);
		sprite_group1.I(0, ((sprite) (obj2)));
		oI = new sprite_group(this, 2);
		sprite_group1 = oI;
		obj2 = super.viewScale;
		obj3 = super.lC;
		obj2 = sprite.I(((float) (obj2)), 0.0F, 0, 229, 229, 339, 5, 0, 0, imagepixels1, ((surface) (obj3)), this);
		sprite_group1.I(0, ((sprite) (obj2)));
		sprite_group1 = oI;
		obj2 = super.viewScale * 0.6F;
		obj3 = super.lC;
		obj2 = sprite.I(((float) (obj2)), 0.0F, 0, 229, 229, 339, 5, 0, 0, imagepixels1, ((surface) (obj3)), this);
		sprite_group1.I(0, ((sprite) (obj2)));
		brighter = new sprite_group(this, 1);
		sprite_group1 = brighter;
		obj2 = super.viewScale;
		obj3 = super.lC;
		obj2 = sprite.I(((float) (obj2)), 0.0F, 0, 114, 119, 17, 263, 0, 0, imagepixels1, ((surface) (obj3)), this);
		sprite_group1.I(0, ((sprite) (obj2)));
		sStarWhite = new sprite_group(this, 3);
		append(sStarWhite, super.viewScale * 0.55F, 0.0F, 0, 5, 702, 30, imagepixels1);
		append(sStarWhite, super.viewScale * 0.55F, 0.0F, 0, 32, 702, 30, imagepixels1);
		append(sStarWhite, super.viewScale * 0.55F, 0.0F, 0, 58, 702, 30, imagepixels1);
		sStarRed = new sprite_group(this, 3);
		append(sStarRed, super.viewScale * 0.55F, 0.0F, 0, 5, 734, 30, imagepixels1);
		append(sStarRed, super.viewScale * 0.55F, 0.0F, 0, 32, 734, 30, imagepixels1);
		append(sStarRed, super.viewScale * 0.55F, 0.0F, 0, 58, 734, 30, imagepixels1);
		sStarBlue = new sprite_group(this, 3);
		append(sStarBlue, super.viewScale * 0.55F, 0.0F, 0, 5, 764, 30, imagepixels1);
		append(sStarBlue, super.viewScale * 0.55F, 0.0F, 0, 32, 764, 30, imagepixels1);
		append(sStarBlue, super.viewScale * 0.55F, 0.0F, 0, 58, 764, 30, imagepixels1);
		// gameimagelist1 = k2++;
		super.labelLoading = "Loading And Preparing Resources";
		super.EB = k2 - 1;
		super.GB = 112;
		repaint();
		sprite_group_ship = new sprite_group(this, 52);
		sprite_group1 = sprite_group_ship;
		obj2 = super.viewScale * 0.2F;
		obj3 = super.lC;
		obj2 = sprite.I(((float) (obj2)), 0.0F, 0, 114, 119, 17, 263, 0, 0, imagepixels1, ((surface) (obj3)), this);
		sprite_group1.I(0, ((sprite) (obj2)));
		sprite_group1 = sprite_group_ship;
		obj2 = super.viewScale * 0.3F;
		obj3 = super.lC;
		obj2 = sprite.I(((float) (obj2)), 0.7853982F, 0, 114, 119, 17, 263, 0, 0, imagepixels1, ((surface) (obj3)),
				this);
		sprite_group1.I(0, ((sprite) (obj2)));
		sprite_group1 = sprite_group_ship;
		obj2 = super.viewScale * 0.4F;
		obj3 = super.lC;
		obj2 = sprite.I(((float) (obj2)), 1.570796F, 0, 114, 119, 17, 263, 0, 0, imagepixels1, ((surface) (obj3)),
				this);
		sprite_group1.I(0, ((sprite) (obj2)));
		sprite_group1 = sprite_group_ship;
		obj2 = super.viewScale * 0.5F;
		obj3 = super.lC;
		obj2 = sprite.I(((float) (obj2)), 2.356194F, 0, 114, 119, 17, 263, 0, 0, imagepixels1, ((surface) (obj3)),
				this);
		sprite_group1.I(0, ((sprite) (obj2)));
		sprite_group1 = sprite_group_ship;
		obj2 = super.viewScale * 0.6F;
		obj3 = super.lC;
		obj2 = sprite.I(((float) (obj2)), 3.141593F, 0, 114, 119, 17, 263, 0, 0, imagepixels1, ((surface) (obj3)),
				this);
		sprite_group1.I(0, ((sprite) (obj2)));
		sprite_group1 = sprite_group_ship;
		obj2 = super.viewScale * 0.7F;
		obj3 = super.lC;
		obj2 = sprite.I(((float) (obj2)), 3.926991F, 0, 114, 119, 17, 263, 0, 0, imagepixels1, ((surface) (obj3)),
				this);
		sprite_group1.I(0, ((sprite) (obj2)));
		sprite_group1 = sprite_group_ship;
		obj2 = super.viewScale * 0.8F;
		obj3 = super.lC;
		obj2 = sprite.I(((float) (obj2)), 4.712389F, 0, 114, 119, 17, 263, 0, 0, imagepixels1, ((surface) (obj3)),
				this);
		sprite_group1.I(0, ((sprite) (obj2)));
		sprite_group1 = sprite_group_ship;
		obj2 = super.viewScale * 0.9F;
		obj3 = super.lC;
		obj2 = sprite.I(((float) (obj2)), 5.497787F, 0, 114, 119, 17, 263, 0, 0, imagepixels1, ((surface) (obj3)),
				this);
		sprite_group1.I(0, ((sprite) (obj2)));
		factor = super.viewScale;
		obj2 = super.lC;
		obj = sprite.I(factor, 0.0F, 0, 114, 119, 17, 263, 0, 0, imagepixels1, ((surface) (obj2)), this);
		factor = super.viewScale;
		obj2 = super.lC;
		sprite sprite1 = sprite.I(factor, 0.5215044F, 0, 114, 119, 17, 263, 0, 0, imagepixels1, ((surface) (obj2)),
				this);
		factor = super.viewScale;
		obj2 = super.lC;
		obj1 = sprite.I(factor, 1.04615F, 0, 114, 119, 17, 263, 0, 0, imagepixels1, ((surface) (obj2)), this);
		factor = super.viewScale;
		obj2 = super.lC;
		sprite sprite10 = sprite.I(factor, 1.570796F, 0, 114, 119, 17, 263, 0, 0, imagepixels1, ((surface) (obj2)),
				this);
		factor = super.viewScale;
		obj2 = super.lC;
		sprite sprite13 = sprite.I(factor, 2.095442F, 0, 114, 119, 17, 263, 0, 0, imagepixels1, ((surface) (obj2)),
				this);
		factor = super.viewScale;
		obj2 = super.lC;
		sprite sprite14 = sprite.I(factor, 2.616947F, 0, 114, 119, 17, 263, 0, 0, imagepixels1, ((surface) (obj2)),
				this);
		factor = super.viewScale;
		obj2 = super.lC;
		sprite sprite15 = sprite.I(factor, 3.141593F, 0, 114, 119, 17, 263, 0, 0, imagepixels1, ((surface) (obj2)),
				this);
		factor = super.viewScale;
		obj2 = super.lC;
		sprite sprite16 = sprite.I(factor, 3.506017F, 0, 114, 119, 17, 263, 0, 0, imagepixels1, ((surface) (obj2)),
				this);
		factor = super.viewScale;
		obj2 = super.lC;
		sprite sprite17 = sprite.I(factor, 4.187743F, 0, 114, 119, 17, 263, 0, 0, imagepixels1, ((surface) (obj2)),
				this);
		factor = super.viewScale;
		obj2 = super.lC;
		sprite sprite18 = sprite.I(factor, 4.712389F, 0, 114, 119, 17, 263, 0, 0, imagepixels1, ((surface) (obj2)),
				this);
		factor = super.viewScale;
		obj2 = super.lC;
		sprite sprite19 = sprite.I(factor, 5.237035F, 0, 114, 119, 17, 263, 0, 0, imagepixels1, ((surface) (obj2)),
				this);
		factor = super.viewScale;
		obj2 = super.lC;
		sprite sprite20 = sprite.I(factor, 5.758539F, 0, 114, 119, 17, 263, 0, 0, imagepixels1, ((surface) (obj2)),
				this);
		for (int j1 = 0; j1 < 3; j1++) {
			sprite_group1 = sprite_group_ship;
			sprite_group1.I(0, ((sprite) (obj)));
			sprite_group1 = sprite_group_ship;
			sprite_group1.I(0, sprite1);
			sprite_group1 = sprite_group_ship;
			sprite_group1.I(0, ((sprite) (obj1)));
			sprite_group1 = sprite_group_ship;
			sprite_group1.I(0, sprite10);
			sprite_group1 = sprite_group_ship;
			sprite_group1.I(0, sprite13);
			sprite_group1 = sprite_group_ship;
			sprite_group1.I(0, sprite14);
			sprite_group1 = sprite_group_ship;
			sprite_group1.I(0, sprite15);
			sprite_group1 = sprite_group_ship;
			sprite_group1.I(0, sprite16);
			sprite_group1 = sprite_group_ship;
			sprite_group1.I(0, sprite17);
			sprite_group1 = sprite_group_ship;
			sprite_group1.I(0, sprite18);
			sprite_group1 = sprite_group_ship;
			sprite_group1.I(0, sprite19);
			sprite_group1 = sprite_group_ship;
			sprite_group1.I(0, sprite20);
		}

		sprite_group1 = sprite_group_ship;
		obj2 = super.viewScale * 0.9F;
		obj3 = super.lC;
		obj2 = sprite.I(((float) (obj2)), 0.7853982F, 0, 114, 119, 17, 263, 0, 0, imagepixels1, ((surface) (obj3)),
				this);
		sprite_group1.I(0, ((sprite) (obj2)));
		sprite_group1 = sprite_group_ship;
		obj2 = super.viewScale * 0.8F;
		obj3 = super.lC;
		obj2 = sprite.I(((float) (obj2)), 0.7853982F, 0, 114, 119, 17, 263, 0, 0, imagepixels1, ((surface) (obj3)),
				this);
		sprite_group1.I(0, ((sprite) (obj2)));
		sprite_group1 = sprite_group_ship;
		obj2 = super.viewScale * 0.7F;
		obj3 = super.lC;
		obj2 = sprite.I(((float) (obj2)), 1.570796F, 0, 114, 119, 17, 263, 0, 0, imagepixels1, ((surface) (obj3)),
				this);
		sprite_group1.I(0, ((sprite) (obj2)));
		sprite_group1 = sprite_group_ship;
		obj2 = super.viewScale * 0.6F;
		obj3 = super.lC;
		obj2 = sprite.I(((float) (obj2)), 2.356194F, 0, 114, 119, 17, 263, 0, 0, imagepixels1, ((surface) (obj3)),
				this);
		sprite_group1.I(0, ((sprite) (obj2)));
		sprite_group1 = sprite_group_ship;
		obj2 = super.viewScale * 0.5F;
		obj3 = super.lC;
		obj2 = sprite.I(((float) (obj2)), 3.141593F, 0, 114, 119, 17, 263, 0, 0, imagepixels1, ((surface) (obj3)),
				this);
		sprite_group1.I(0, ((sprite) (obj2)));
		sprite_group1 = sprite_group_ship;
		obj2 = super.viewScale * 0.4F;
		obj3 = super.lC;
		obj2 = sprite.I(((float) (obj2)), 3.926991F, 0, 114, 119, 17, 263, 0, 0, imagepixels1, ((surface) (obj3)),
				this);
		sprite_group1.I(0, ((sprite) (obj2)));
		sprite_group1 = sprite_group_ship;
		obj2 = super.viewScale * 0.3F;
		obj3 = super.lC;
		obj2 = sprite.I(((float) (obj2)), 4.712389F, 0, 114, 119, 17, 263, 0, 0, imagepixels1, ((surface) (obj3)),
				this);
		sprite_group1.I(0, ((sprite) (obj2)));
		sprite_group1 = sprite_group_ship;
		obj2 = super.viewScale * 0.2F;
		obj3 = super.lC;
		obj2 = sprite.I(((float) (obj2)), 5.497787F, 0, 114, 119, 17, 263, 0, 0, imagepixels1, ((surface) (obj3)),
				this);
		sprite_group1.I(0, ((sprite) (obj2)));
		imagepixels1.Z = null;
		imagepixels1 = null;
		System.gc();
		palette agamecolorlist[] = { charAt, cos, darkGray };
		Starfield = new starfield(this, 150, 3, agamecolorlist);
		obj2 = k2 += 3;
		super.labelLoading = "Loading And Preparing Resources";
		super.EB = ((int) (obj2));
		super.GB = 112;
		repaint();
		if ((imagepixels1 = I("images/kaboom2.gif")) == null)
			return false;
		imagepixels1.I(580, 54, 6, 111, imagepixels1, 6, 111);
		imagepixels1.I(120, 20, 340, 6, imagepixels1, 340, 26);
		imagepixels1.I(204, 20, 594, 125, imagepixels1, 594, 145);
		imagepixels1.I(160, 19, 339, 55, imagepixels1, 339, 74);
		imagepixels1.I(400, 40, 3, 387, imagepixels1, 3, 427);
		imagepixels1.I(907, 79, 5, 174, imagepixels1, 5, 174);
		imagepixels1.I(904, 106, 5, 265, imagepixels1, 5, 265);
		obj2 = k2++;
		super.labelLoading = "Loading And Preparing Resources";
		super.EB = ((int) (obj2));
		super.GB = 112;
		repaint();
		black = new sprite_group(this, 1);
		obj2 = black;
		float f4 = super.viewScale;

		surface surface1 = super.lC;
		sprite.I(f4, 0.0F, 0, 114, 36, 4, 4, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		I = new sprite_group(this, 6);
		obj2 = I;
		f4 = super.viewScale * 0.12F;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 0, 115, 107, 509, 6, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = I;
		f4 = super.viewScale * 0.14F;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 0, 115, 107, 509, 6, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = I;
		f4 = super.viewScale * 0.17F;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 0, 115, 107, 509, 6, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = I;
		f4 = super.viewScale * 0.21F;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 0, 115, 107, 509, 6, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = I;
		f4 = super.viewScale * 0.26F;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 0, 115, 107, 509, 6, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = I;
		f4 = super.viewScale * 0.32F;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 0, 115, 107, 509, 6, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		Z = new sprite_group(this, 6);
		obj2 = Z;
		f4 = super.viewScale * 0.12F;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 0, 78, 77, 633, 21, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = Z;
		f4 = super.viewScale * 0.14F;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 0, 78, 77, 633, 21, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = Z;
		f4 = super.viewScale * 0.17F;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 0, 78, 77, 633, 21, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = Z;
		f4 = super.viewScale * 0.21F;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 0, 78, 77, 633, 21, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = Z;
		f4 = super.viewScale * 0.26F;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 0, 78, 77, 633, 21, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = Z;
		f4 = super.viewScale * 0.32F;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 0, 78, 77, 633, 21, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		C = new sprite_group(this, 10);
		obj2 = C;
		f4 = super.viewScale * 2.0F;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 0, 42, 42, 9, 118, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = C;
		f4 = super.viewScale * 2.0F;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 0, 54, 51, 58, 112, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = C;
		f4 = super.viewScale * 2.0F;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 0, 57, 53, 114, 112, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = C;
		f4 = super.viewScale * 2.0F;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 0, 58, 54, 174, 111, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = C;
		f4 = super.viewScale * 2.0F;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 0, 58, 55, 238, 112, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = C;
		f4 = super.viewScale * 2.0F;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 0, 55, 51, 299, 112, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = C;
		f4 = super.viewScale * 2.0F;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 0, 54, 51, 360, 112, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = C;
		f4 = super.viewScale * 2.0F;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 0, 57, 51, 414, 112, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = C;
		f4 = super.viewScale * 2.0F;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 0, 52, 48, 472, 112, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = C;
		f4 = super.viewScale * 2.0F;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 0, 48, 46, 536, 114, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = k2++;
		super.labelLoading = "Loading And Preparing Resources";
		super.EB = ((int) (obj2));
		super.GB = 112;
		repaint();
		B = new sprite_group(this, 14);
		append(B, super.viewScale * 1.4F, 0.0F, 0, 23, 174, 79, imagepixels1);
		append(B, super.viewScale * 1.4F, 0.0F, 0, 73, 174, 79, imagepixels1);
		append(B, super.viewScale * 1.4F, 0.0F, 0, 138, 174, 79, imagepixels1);
		append(B, super.viewScale * 1.4F, 0.0F, 0, 200, 174, 79, imagepixels1);
		append(B, super.viewScale * 1.4F, 0.0F, 0, 263, 174, 79, imagepixels1);
		append(B, super.viewScale * 1.4F, 0.0F, 0, 330, 174, 79, imagepixels1);
		append(B, super.viewScale * 1.4F, 0.0F, 0, 395, 174, 79, imagepixels1);
		append(B, super.viewScale * 1.4F, 0.0F, 0, 461, 174, 79, imagepixels1);
		append(B, super.viewScale * 1.4F, 0.0F, 0, 525, 174, 79, imagepixels1);
		append(B, super.viewScale * 1.4F, 0.0F, 0, 590, 174, 79, imagepixels1);
		append(B, super.viewScale * 1.4F, 0.0F, 0, 656, 174, 79, imagepixels1);
		append(B, super.viewScale * 1.4F, 0.0F, 0, 721, 174, 79, imagepixels1);
		append(B, super.viewScale * 1.4F, 0.0F, 0, 786, 174, 79, imagepixels1);
		append(B, super.viewScale * 1.4F, 0.0F, 0, 852, 174, 79, imagepixels1);
		D = new sprite_group(this, 8);
		append(D, super.viewScale * 1.2F, 0.0F, 0, 29, 265, 106, imagepixels1);
		append(D, super.viewScale * 1.2F, 0.0F, 0, 130, 265, 106, imagepixels1);
		append(D, super.viewScale * 1.2F, 0.0F, 0, 240, 265, 106, imagepixels1);
		append(D, super.viewScale * 1.2F, 0.0F, 0, 354, 265, 106, imagepixels1);
		append(D, super.viewScale * 1.2F, 0.0F, 0, 467, 265, 106, imagepixels1);
		append(D, super.viewScale * 1.2F, 0.0F, 0, 584, 265, 106, imagepixels1);
		append(D, super.viewScale * 1.2F, 0.0F, 0, 711, 265, 106, imagepixels1);
		append(D, super.viewScale * 1.2F, 0.0F, 0, 873, 265, 106, imagepixels1);
		obj2 = k2++;
		super.labelLoading = "Loading And Preparing Resources";
		super.EB = ((int) (obj2));
		super.GB = 112;
		repaint();
		J = new sprite_group(this, 10);
		obj2 = J;
		f4 = super.viewScale * 0.65F;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 0, 12, 11, 17, 402, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = J;
		f4 = super.viewScale * 0.65F;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 0, 17, 19, 55, 397, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = J;
		f4 = super.viewScale * 0.65F;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 0, 24, 26, 92, 397, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = J;
		f4 = super.viewScale * 0.65F;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 0, 30, 28, 121, 395, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = J;
		f4 = super.viewScale * 0.65F;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 0, 35, 34, 168, 393, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = J;
		f4 = super.viewScale * 0.65F;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 0, 37, 35, 206, 392, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = J;
		f4 = super.viewScale * 0.65F;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 0, 40, 40, 244, 387, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = J;
		f4 = super.viewScale * 0.65F;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 0, 40, 40, 284, 387, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = J;
		f4 = super.viewScale * 0.65F;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 0, 40, 40, 324, 387, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = J;
		f4 = super.viewScale * 0.65F;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 0, 40, 40, 364, 387, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = k2++;
		super.labelLoading = "Loading And Preparing Resources";
		super.EB = ((int) (obj2));
		super.GB = 112;
		repaint();
		S = new sprite_group(this, 14);
		append(S, super.viewScale * 0.4F, 0.0F, 0, 23, 174, 79, imagepixels1);
		append(S, super.viewScale * 0.4F, 0.0F, 0, 73, 174, 79, imagepixels1);
		append(S, super.viewScale * 0.4F, 0.0F, 0, 138, 174, 79, imagepixels1);
		append(S, super.viewScale * 0.4F, 0.0F, 0, 200, 174, 79, imagepixels1);
		append(S, super.viewScale * 0.4F, 0.0F, 0, 263, 174, 79, imagepixels1);
		append(S, super.viewScale * 0.4F, 0.0F, 0, 330, 174, 79, imagepixels1);
		append(S, super.viewScale * 0.4F, 0.0F, 0, 395, 174, 79, imagepixels1);
		append(S, super.viewScale * 0.4F, 0.0F, 0, 461, 174, 79, imagepixels1);
		append(S, super.viewScale * 0.4F, 0.0F, 0, 525, 174, 79, imagepixels1);
		append(S, super.viewScale * 0.4F, 0.0F, 0, 590, 174, 79, imagepixels1);
		append(S, super.viewScale * 0.4F, 0.0F, 0, 656, 174, 79, imagepixels1);
		append(S, super.viewScale * 0.4F, 0.0F, 0, 721, 174, 79, imagepixels1);
		append(S, super.viewScale * 0.4F, 0.0F, 0, 786, 174, 79, imagepixels1);
		append(S, super.viewScale * 0.4F, 0.0F, 0, 852, 174, 79, imagepixels1);
		A = new sprite_group(this, 9);
		append(A, super.viewScale * 0.4F, 0.0F, 0, 29, 265, 106, imagepixels1);
		append(A, super.viewScale * 0.4F, 0.0F, 0, 130, 265, 106, imagepixels1);
		append(A, super.viewScale * 0.4F, 0.0F, 0, 240, 265, 106, imagepixels1);
		append(A, super.viewScale * 0.4F, 0.0F, 0, 354, 265, 106, imagepixels1);
		append(A, super.viewScale * 0.4F, 0.0F, 0, 467, 265, 106, imagepixels1);
		append(A, super.viewScale * 0.4F, 0.0F, 0, 584, 265, 106, imagepixels1);
		append(A, super.viewScale * 0.4F, 0.0F, 0, 711, 265, 106, imagepixels1);
		E = new sprite_group(this, 8);
		append(E, super.viewScale, 0.0F, 0, 342, 55, 19, imagepixels1);
		append(E, super.viewScale, 0.0F, 0, 361, 55, 19, imagepixels1);
		append(E, super.viewScale, 0.0F, 0, 381, 55, 19, imagepixels1);
		append(E, super.viewScale, 0.0F, 0, 401, 55, 19, imagepixels1);
		append(E, super.viewScale, 0.0F, 0, 421, 55, 19, imagepixels1);
		append(E, super.viewScale, 0.0F, 0, 442, 55, 19, imagepixels1);
		append(E, super.viewScale, 0.0F, 0, 463, 55, 19, imagepixels1);
		append(E, super.viewScale, 0.0F, 0, 483, 55, 19, imagepixels1);
		obj2 = k2++;
		super.labelLoading = "Loading And Preparing Resources";
		super.EB = ((int) (obj2));
		super.GB = 112;
		repaint();
		Q = new sprite_group(this, 10);
		obj2 = Q;
		f4 = super.viewScale * 0.6F;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 0, 8, 9, 600, 131, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = Q;
		f4 = super.viewScale * 0.6F;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 0, 13, 14, 617, 128, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = Q;
		f4 = super.viewScale * 0.6F;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 0, 14, 14, 637, 128, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = Q;
		f4 = super.viewScale * 0.6F;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 0, 20, 20, 654, 125, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = Q;
		f4 = super.viewScale * 0.6F;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 0, 20, 20, 674, 125, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = Q;
		f4 = super.viewScale * 0.6F;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 0, 20, 20, 694, 125, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = Q;
		f4 = super.viewScale * 0.6F;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 0, 19, 20, 715, 125, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = Q;
		f4 = super.viewScale * 0.6F;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 0, 19, 20, 735, 125, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = Q;
		f4 = super.viewScale * 0.6F;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 0, 19, 20, 755, 125, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = Q;
		f4 = super.viewScale * 0.6F;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 0, 20, 19, 774, 125, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		R = new sprite_group(this, 10);
		obj2 = R;
		f4 = super.viewScale * 0.8F;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 0, 8, 9, 600, 131, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = R;
		f4 = super.viewScale * 0.8F;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 0, 13, 14, 617, 128, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = R;
		f4 = super.viewScale * 0.8F;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 0, 14, 14, 637, 128, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = R;
		f4 = super.viewScale * 0.8F;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 0, 20, 20, 654, 125, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = R;
		f4 = super.viewScale * 0.8F;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 0, 20, 20, 674, 125, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = R;
		f4 = super.viewScale * 0.8F;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 0, 20, 20, 694, 125, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = R;
		f4 = super.viewScale * 0.8F;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 0, 19, 20, 715, 125, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = R;
		f4 = super.viewScale * 0.8F;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 0, 19, 20, 735, 125, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = R;
		f4 = super.viewScale * 0.8F;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 0, 19, 20, 755, 125, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = R;
		f4 = super.viewScale * 0.8F;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 0, 20, 19, 774, 125, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		T = new sprite_group(this, 10);
		obj2 = T;
		f4 = super.viewScale;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 0, 8, 9, 600, 131, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = T;
		f4 = super.viewScale;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 0, 13, 14, 617, 128, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = T;
		f4 = super.viewScale;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 0, 14, 14, 637, 128, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = T;
		f4 = super.viewScale;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 0, 20, 20, 654, 125, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = T;
		f4 = super.viewScale;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 0, 20, 20, 674, 125, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = T;
		f4 = super.viewScale;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 0, 20, 20, 694, 125, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = T;
		f4 = super.viewScale;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 0, 19, 20, 715, 125, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = T;
		f4 = super.viewScale;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 0, 19, 20, 735, 125, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = T;
		f4 = super.viewScale;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 0, 19, 20, 755, 125, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = T;
		f4 = super.viewScale;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 0, 20, 19, 774, 125, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		imagepixels1.Z = null;
		imagepixels1 = null;
		System.gc();
		obj2 = k2 += 3;
		super.labelLoading = "Loading And Preparing Resources";
		super.EB = ((int) (obj2));
		super.GB = 112;
		repaint();
		if ((imagepixels1 = I("images/weapons.gif")) == null)
			return false;
		imagepixels1.I(120, 20, 78, 62, imagepixels1, 78, 82);
		imagepixels1.I(32, 16, 147, 109, imagepixels1, 147, 125);
		imagepixels1.I(48, 26, 147, 165, imagepixels1, 147, 165);
		obj2 = k2++;
		super.labelLoading = "Loading And Preparing Resources";
		super.EB = ((int) (obj2));
		super.GB = 112;
		repaint();
		LI = new sprite_group(this, 2);
		obj2 = LI;
		f4 = super.viewScale;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 1, 20, 20, 148, 168, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = LI;
		f4 = super.viewScale;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 1, 21, 21, 173, 168, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = k2++;
		super.labelLoading = "Loading And Preparing Resources";
		super.EB = ((int) (obj2));
		super.GB = 112;
		repaint();
		WI = new sprite_group(this, 2);
		obj2 = WI;
		f4 = super.viewScale;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 1, 16, 16, 147, 109, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = WI;
		f4 = super.viewScale;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 1, 16, 16, 163, 109, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = k2++;
		super.labelLoading = "Loading And Preparing Resources";
		super.EB = ((int) (obj2));
		super.GB = 112;
		repaint();
		OI = new sprite_group(this, 1, 16);
		OI.I(0, super.viewScale, 1, 17, 20, 81, 62, 0, 0, imagepixels1, 16, 0, 16, super.lC);
		MI = new sprite_group(this, 32, 6);
		MI.J = true;
		for (int k1 = 0; k1 < 32; k1++) {
			obj2 = (float) (0.098174770424681035D * k1);
			f4 = super.viewScale;
			surface1 = super.lC;
			obj = sprite.I(f4, ((float) (obj2)), 1, 14, 9, 147, 149, 0, 0, imagepixels1, surface1, this);
			f4 = super.viewScale;
			surface1 = super.lC;
			sprite sprite2 = sprite.I(f4, ((float) (obj2)), 1, 16, 10, 163, 149, 0, 0, imagepixels1, surface1, this);
			f4 = super.viewScale;
			surface1 = super.lC;
			sprite sprite6 = sprite.I(f4, ((float) (obj2)), 1, 23, 12, 182, 148, 0, 0, imagepixels1, surface1, this);
			f4 = super.viewScale;
			surface1 = super.lC;
			sprite sprite11 = sprite.I(f4, ((float) (obj2)), 1, 16, 11, 209, 149, 0, 0, imagepixels1, surface1, this);
			MI.I(k1, ((sprite) (obj)));
			MI.I(k1, sprite2);
			MI.I(k1, sprite6);
			MI.I(k1, sprite11);
			MI.I(k1, sprite6);
			MI.I(k1, sprite2);
		}

		NI = new sprite_group(this, 32, 6);
		NI.J = true;
		for (int l1 = 0; l1 < 32; l1++) {
			obj2 = (float) (0.098174770424681035D * l1);
			f4 = super.viewScale;
			surface1 = super.lC;
			obj = sprite.I(f4, ((float) (obj2)), 1, 12, 10, 5, 4, 0, 0, imagepixels1, surface1, this);
			f4 = super.viewScale;
			surface1 = super.lC;
			sprite sprite3 = sprite.I(f4, ((float) (obj2)), 1, 14, 11, 20, 4, 0, 0, imagepixels1, surface1, this);
			f4 = super.viewScale;
			surface1 = super.lC;
			sprite sprite7 = sprite.I(f4, ((float) (obj2)), 1, 16, 13, 39, 3, 0, 0, imagepixels1, surface1, this);
			f4 = super.viewScale;
			surface1 = super.lC;
			sprite sprite12 = sprite.I(f4, ((float) (obj2)), 1, 20, 14, 60, 3, 0, 0, imagepixels1, surface1, this);
			NI.I(l1, ((sprite) (obj)));
			NI.I(l1, sprite3);
			NI.I(l1, sprite7);
			NI.I(l1, sprite12);
			NI.I(l1, sprite7);
			NI.I(l1, sprite3);
		}

		UI = new sprite_group(this, 32, 3);
		UI.J = true;
		for (int i2 = 0; i2 < 32; i2++) {
			obj2 = (float) (0.098174770424681035D * i2);
			f4 = super.viewScale;
			surface1 = super.lC;
			obj = sprite.I(f4, ((float) (obj2)), 1, 30, 19, 168, 1, 0, 0, imagepixels1, surface1, this);
			f4 = super.viewScale;
			surface1 = super.lC;
			sprite sprite4 = sprite.I(f4, ((float) (obj2)), 1, 30, 16, 168, 21, 0, 0, imagepixels1, surface1, this);
			f4 = super.viewScale;
			surface1 = super.lC;
			sprite sprite8 = sprite.I(f4, ((float) (obj2)), 1, 30, 20, 168, 40, 0, 0, imagepixels1, surface1, this);
			UI.I(i2, ((sprite) (obj)));
			UI.I(i2, sprite4);
			UI.I(i2, sprite8);
		}

		VI = new sprite_group(this, 32, 3);
		VI.J = true;
		for (int j2 = 0; j2 < 32; j2++) {
			obj2 = (float) (0.098174770424681035D * j2);
			f4 = super.viewScale;
			surface1 = super.lC;
			obj = sprite.I(f4, ((float) (obj2)), 1, 30, 15, 132, 3, 0, 0, imagepixels1, surface1, this);
			f4 = super.viewScale;
			surface1 = super.lC;
			sprite sprite5 = sprite.I(f4, ((float) (obj2)), 1, 31, 15, 132, 21, 0, 0, imagepixels1, surface1, this);
			f4 = super.viewScale;
			surface1 = super.lC;
			sprite sprite9 = sprite.I(f4, ((float) (obj2)), 1, 31, 15, 132, 43, 0, 0, imagepixels1, surface1, this);
			VI.I(j2, ((sprite) (obj)));
			VI.I(j2, sprite5);
			VI.I(j2, sprite9);
		}

		obj2 = k2++;
		super.labelLoading = "Loading And Preparing Resources";
		super.EB = ((int) (obj2));
		super.GB = 112;
		repaint();
		PI = new sprite_group(this, 32, 1);
		obj2 = PI;
		f4 = super.viewScale;
		surface1 = super.lC;
		((sprite_group) (obj2)).I(f4, 1, 21, 9, 5, 51, 0, 0, imagepixels1, 32, 0, 32, surface1);
		obj2 = k2++;
		super.labelLoading = "Loading And Preparing Resources";
		super.EB = ((int) (obj2));
		super.GB = 112;
		repaint();
		QI = new sprite_group(this, 32, 1);
		obj2 = QI;
		f4 = super.viewScale;
		surface1 = super.lC;
		((sprite_group) (obj2)).I(f4, 1, 20, 15, 42, 43, 0, 0, imagepixels1, 32, 0, 32, surface1);
		obj2 = k2++;
		super.labelLoading = "Loading And Preparing Resources";
		super.EB = ((int) (obj2));
		super.GB = 112;
		repaint();
		RI = new sprite_group(this, 32, 1);
		obj2 = RI;
		f4 = super.viewScale;
		surface1 = super.lC;
		((sprite_group) (obj2)).I(f4, 1, 21, 17, 41, 61, 0, 0, imagepixels1, 32, 0, 32, surface1);
		obj2 = k2++;
		super.labelLoading = "Loading And Preparing Resources";
		super.EB = ((int) (obj2));
		super.GB = 112;
		repaint();
		TI = new sprite_group(this, 64, 1);
		obj2 = TI;
		f4 = super.viewScale;
		surface1 = super.lC;
		((sprite_group) (obj2)).I(f4, 1, 28, 16, 5, 20, 0, 0, imagepixels1, 64, 0, 64, surface1);
		obj2 = k2++;
		super.labelLoading = "Loading And Preparing Resources";
		super.EB = ((int) (obj2));
		super.GB = 112;
		repaint();
		XI = new sprite_group(this, 32, 1);
		obj2 = XI;
		f4 = super.viewScale;
		surface1 = super.lC;
		((sprite_group) (obj2)).I(f4, 1, 22, 11, 4, 73, 0, 0, imagepixels1, 32, 0, 32, surface1);
		obj2 = k2++;
		super.labelLoading = "Loading And Preparing Resources";
		super.EB = ((int) (obj2));
		super.GB = 112;
		repaint();
		YI = new sprite_group(this, 32, 1);
		obj2 = YI;
		f4 = super.viewScale;
		surface1 = super.lC;
		((sprite_group) (obj2)).I(f4, 1, 24, 20, 38, 21, 0, 0, imagepixels1, 32, 0, 32, surface1);
		obj2 = k2++;
		super.labelLoading = "Loading And Preparing Resources";
		super.EB = ((int) (obj2));
		super.GB = 112;
		repaint();
		append = new sprite_group(this, 32, 1);
		obj2 = append;
		f4 = super.viewScale;
		surface1 = super.lC;
		((sprite_group) (obj2)).I(f4, 1, 26, 9, 2, 86, 0, 0, imagepixels1, 32, 0, 32, surface1);
		obj2 = k2++;
		super.labelLoading = "Loading And Preparing Resources";
		super.EB = ((int) (obj2));
		super.GB = 112;
		repaint();
		iI = new sprite_group(this, 8);
		obj2 = super.viewScale;

		surface temp_surf = super.lC;
		obj = sprite.I(((float) (obj2)), 0.0F, 1, 22, 25, 5, 222, 0, 0, imagepixels1, temp_surf, this);
		obj2 = iI;
		((sprite_group) (obj2)).I(0, ((sprite) (obj)));
		obj2 = iI;
		((sprite_group) (obj2)).I(0, ((sprite) (obj)));
		obj2 = iI;
		((sprite_group) (obj2)).I(0, ((sprite) (obj)));
		obj2 = iI;
		((sprite_group) (obj2)).I(0, ((sprite) (obj)));
		obj2 = iI;
		((sprite_group) (obj2)).I(0, ((sprite) (obj)));
		obj2 = iI;
		f4 = super.viewScale;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 1, 22, 25, 29, 222, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = iI;
		f4 = super.viewScale;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 1, 22, 25, 54, 222, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = iI;
		f4 = super.viewScale;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 1, 22, 25, 76, 222, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		zI = new sprite_group(this, 2);
		obj2 = zI;
		f4 = super.viewScale;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 1, 39, 24, 5, 193, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = zI;
		f4 = super.viewScale;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 1, 39, 24, 47, 193, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		cI = new sprite_group(this, 3);
		obj2 = cI;
		f4 = super.viewScale;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 1, 40, 24, 5, 165, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = cI;
		f4 = super.viewScale;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 1, 40, 24, 47, 165, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = cI;
		f4 = super.viewScale;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 1, 40, 24, 89, 165, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		bI = new sprite_group(this, 1);
		obj2 = bI;
		f4 = super.viewScale;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 1, 37, 28, 5, 251, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		dI = new sprite_group(this, 1);
		obj2 = dI;
		f4 = super.viewScale;
		surface1 = super.lC;
		sprite.I(f4, 0.0F, 1, 37, 24, 47, 254, 0, 0, imagepixels1, surface1, this);
		((sprite_group) (obj2)).I(0, (int) f4);
		obj2 = k2++;

		labelLoading = "Loading And Preparing Resources";
		EB = ((int) (obj2));
		GB = 112;
		repaint();

		surface temp = super.lC;
		arraycopy = new sprite_group(this, 4, 1);
		arraycopy.I(0, sprite.I(((float) (obj2 = super.viewScale)), 0.0F, 1, 40, 24, 89, 193, 0, 0, imagepixels1, temp,
				this));
		arraycopy.I(1, sprite.I(((float) (obj2 = super.viewScale)), 0.0F, 1, 40, 24, 134, 193, 0, 0, imagepixels1,
				temp, this));
		arraycopy.I(2, sprite.I(((float) (obj2 = super.viewScale)), 0.0F, 1, 40, 24, 178, 193, 0, 0, imagepixels1,
				temp, this));
		arraycopy.I(3, sprite.I(((float) (obj2 = super.viewScale)), 0.0F, 1, 40, 24, 225, 193, 0, 0, imagepixels1,
				temp, this));
		imagepixels1.Z = null;
		imagepixels1 = null;

		System.gc();
		assetsLoaded = true;

		System.out.println("after load totalMemory=" + String.valueOf(Runtime.getRuntime().totalMemory())
				+ " freeMemory=" + String.valueOf(Runtime.getRuntime().freeMemory()) + " totalRleBytes="
				+ String.valueOf(sprite.K) + " totalRleParts=" + String.valueOf(sprite.L));
		return true;
	}

	public final void append(sprite_group sprite_group1, float f1, float f2, int i1, int j1, int k1, int l1,
			imagepixels imagepixels1) {
		Rectangle rectangle = imagepixels1.I(j1, k1, l1);
		int i2 = rectangle.width;
		int j2 = rectangle.height;
		int k2 = rectangle.x;
		int l2 = rectangle.y;
		surface surface1 = super.lC;
		sprite sprite1 = sprite.I(f1, f2, i1, i2, j2, k2, l2, 0, 0, imagepixels1, surface1, this);
		sprite_group1.I(0, sprite1);
	}

	public final void arraycopy(sprite_group sprite_group1, float f1, int i1, int j1, int k1, int l1,
			imagepixels imagepixels1, int i2, int j2, int k2) {
		Rectangle rectangle = imagepixels1.I(j1, k1, l1);
		float f2 = super.viewScale;
		int l2 = rectangle.width;
		int i3 = rectangle.height;
		int j3 = rectangle.x;
		int k3 = rectangle.y;
		surface surface1 = super.lC;
		sprite_group1.I(f2, i1, l2, i3, j3, k3, 0, 0, imagepixels1, i2, j2, k2, surface1);
	}

	public final void black(Font gamefont1, imagepixels imagepixels1, float f1) {
		blue("0123456789", gamefont1, imagepixels1, f1, 2, 1, 27, 27);
		blue("ABCDEFGHIJKLM", gamefont1, imagepixels1, f1, 1, 30, 24, 24);
		blue("NOPQRSTUVWXYZ", gamefont1, imagepixels1, f1, 2, 58, 24, 24);
		blue("abcdefghijklm", gamefont1, imagepixels1, f1, 2, 86, 31, 26);
		blue("nopqrstuvwxyz", gamefont1, imagepixels1, f1, 2, 120, 31, 24);
		blue("$()[]", gamefont1, imagepixels1, f1, 2, 160, 28, 28);
		blue("@/,!?#%&*+-':.", gamefont1, imagepixels1, f1, 80, 162, 28, 28);
		int i1 = Math.round(-18F * f1);
		Object obj = super.lC;
		obj = sprite.I(f1, 0.0F, 0, 8, 5, 369, 164, 0, 0, imagepixels1, ((surface) (obj)), this);
		gamefont1.I[34] = ((sprite) (obj));
		gamefont1.Z[34] = i1;
	}

	public final void blue(String s1, Font gamefont1, imagepixels imagepixels1, float f1, int i1, int j1, int k1,
			int l1) {
		int j2 = s1.length();
		for (int k2 = 0; k2 < j2; k2++) {
			char c1 = s1.charAt(k2);
			Rectangle rectangle = imagepixels1.I(i1, j1, k1);
			int i2 = Math.round((((rectangle.y - j1) + rectangle.height) - l1) * f1);
			int l2 = rectangle.width;
			int i3 = rectangle.height;
			int j3 = rectangle.x;
			int k3 = rectangle.y;
			surface surface1 = super.lC;
			sprite sprite1 = sprite.I(f1, 0.0F, 0, l2, i3, j3, k3, 0, 0, imagepixels1, surface1, this);
			gamefont1.I[c1] = sprite1;
			gamefont1.Z[c1] = i2;
			i1 = rectangle.x + rectangle.width + 1;
		}

	}

	@Override
	public final synchronized void I(boolean flag) {
		super.I(flag);
		if (!flag)
			super.vC.I();
		cheatCode = 0;
		getRGB = 0.0F;
		getBackground = 1;
		getCodeBase = 1;

		NZ.I(!pC && toggleMusic);
		if (gc != null) {
			gc.I(!pC && KB);
		}

		if (flag) {
			Mission.I(1000);
			return;
		} else {
			PC = 1;
			Mission.I(300);
			return;
		}
	}

	final void brighter() {
		dZ = new oGameObjectlist(this, 1);
		vZ = new oGameObjectlist(this, 50);
		wZ = new oGameObjectlist(this, 50);
		int j3 = dZ.I + vZ.I + wZ.I;
		xZ = new oGameObjectlist(this, j3);
		for (int i1 = 0; i1 < j3; i1++) {
			oSpaceship oSpaceship1 = new oSpaceship(this);
			oGameObjectlist oGameObjectlist1 = xZ;
			oSpaceship oSpaceship2 = oSpaceship1;
			if (oGameObjectlist1.C < oGameObjectlist1.I) {
				oGameObjectlist1.Z[oGameObjectlist1.C] = oSpaceship2;
				oGameObjectlist1.C++;
			}
		}

		ZC = new oGameObjectlist(this, 15);
		yZ = new oGameObjectlist(this, 30);
		IC = new oGameObjectlist(this, 30);
		j3 = yZ.I + IC.I + ZC.I;
		CC = new oGameObjectlist(this, j3);
		for (int j1 = 0; j1 < j3; j1++) {
			oWeaponfire oWeaponfire1 = new oWeaponfire(this);
			oGameObjectlist oGameObjectlist2 = CC;
			oWeaponfire oWeaponfire2 = oWeaponfire1;
			if (oGameObjectlist2.C < oGameObjectlist2.I) {
				oGameObjectlist2.Z[oGameObjectlist2.C] = oWeaponfire2;
				oGameObjectlist2.C++;
			}
		}

		BC = new oGameObjectlist(this, 5);
		DC = new oGameObjectlist(this, 5);
		for (int k1 = 0; k1 < DC.I; k1++) {
			oPowerup oPowerup1 = new oPowerup(this);
			oGameObjectlist oGameObjectlist3 = DC;
			oPowerup oPowerup2 = oPowerup1;
			if (oGameObjectlist3.C < oGameObjectlist3.I) {
				oGameObjectlist3.Z[oGameObjectlist3.C] = oPowerup2;
				oGameObjectlist3.C++;
			}
		}

		FC = new oGameObjectlist(this, 300);
		for (int l1 = 0; l1 < FC.I; l1++) {
			oWeapon oWeapon1 = new oWeapon(this);
			oGameObjectlist oGameObjectlist4 = FC;
			oWeapon oWeapon2 = oWeapon1;
			if (oGameObjectlist4.C < oGameObjectlist4.I) {
				oGameObjectlist4.Z[oGameObjectlist4.C] = oWeapon2;
				oGameObjectlist4.C++;
			}
		}

		oZ = new oGameObjectlist(this, 40);
		pZ = new oGameObjectlist(this, 80);
		qZ = new oGameObjectlist(this, 40);
		j3 = oZ.I + qZ.I + pZ.I;
		rZ = new oGameObjectlist(this, j3);
		for (int i2 = 0; i2 < j3; i2++) {
			Explosion explosion1 = new Explosion(this);
			oGameObjectlist oGameObjectlist5 = rZ;
			Explosion explosion2 = explosion1;
			if (oGameObjectlist5.C < oGameObjectlist5.I) {
				oGameObjectlist5.Z[oGameObjectlist5.C] = explosion2;
				oGameObjectlist5.C++;
			}
		}

		tZ = new oGameObjectlist(this, 50);
		uZ = new oGameObjectlist(this, 50);
		for (int j2 = 0; j2 < uZ.I; j2++) {
			explosionbit explosionbit1 = new explosionbit(this);
			oGameObjectlist oGameObjectlist6 = uZ;
			explosionbit explosionbit2 = explosionbit1;
			if (oGameObjectlist6.C < oGameObjectlist6.I) {
				oGameObjectlist6.Z[oGameObjectlist6.C] = explosionbit2;
				oGameObjectlist6.C++;
			}
		}

		AC = new oGameObjectlist(this, 30);
		EC = new oGameObjectlist(this, 10);
		GC = new oGameObjectlist(this, 10);
		getRuntime = new oGameObjectlist(this, AC.I + EC.I + EC.I);
		for (int k2 = 0; k2 < getRuntime.I; k2++) {
			GameObject oGameObject1 = new GameObject(this);
			oGameObjectlist oGameObjectlist7 = getRuntime;
			if (oGameObjectlist7.C < oGameObjectlist7.I) {
				oGameObjectlist7.Z[oGameObjectlist7.C] = oGameObject1;
				oGameObjectlist7.C++;
			}
		}

		JC = new oGameObjectlist(this, 25);
		for (int l2 = 0; l2 < JC.I; l2++) {
			oPlanet oPlanet1 = new oPlanet(this);
			oGameObjectlist oGameObjectlist8 = JC;
			oPlanet oPlanet2 = oPlanet1;
			if (oGameObjectlist8.C < oGameObjectlist8.I) {
				oGameObjectlist8.Z[oGameObjectlist8.C] = oPlanet2;
				oGameObjectlist8.C++;
			}
		}

		SC = new oGameObjectlist(this, 10);
		for (int i3 = 0; i3 < SC.I; i3++) {
			oWaypoint oWaypoint1 = new oWaypoint(this);
			oGameObjectlist oGameObjectlist9 = SC;
			oWaypoint oWaypoint2 = oWaypoint1;
			if (oGameObjectlist9.C < oGameObjectlist9.I) {
				oGameObjectlist9.Z[oGameObjectlist9.C] = oWaypoint2;
				oGameObjectlist9.C++;
			}
		}

		Camera = new gamecamera(this);
		Camera.J();
	}

	@Override
	final void C() {
		super.C();
		// surface drawsurface1;
		// if (super.lC != null)
		// drawsurface1 = super.lC;
	}

	@Override
	final void B() 
	{
		NZ.I(!super.pC && toggleMusic);
	}

	@Override
	final void D() 
	{
		if (gc != null)
		{
			gc.I(!super.pC && super.KB);
		}
	}

	final GameObject I(int i1, int j1, int k1, int l1, int i2) {
		if (i1 == -1 || i1 == 2) {
			oGameObjectlist oGameObjectlist1 = wZ;
			GameObject oGameObject1 = oGameObjectlist1.I(1, j1, k1, l1, i2, -1F);
			if (oGameObject1 != null)
				return oGameObject1;
		}

		if (i1 == -1 || i1 == 1) {
			oGameObjectlist oGameObjectlist2 = dZ;
			GameObject oGameObject2 = oGameObjectlist2.I(1, j1, k1, l1, i2, -1F);
			if (oGameObject2 != null)
				return oGameObject2;
			oGameObjectlist2 = vZ;
			oGameObject2 = oGameObjectlist2.I(1, j1, k1, l1, i2, -1F);
			if (oGameObject2 != null)
				return oGameObject2;
		}

		if (i2 != -1) {
			oGameObjectlist oGameObjectlist3 = EC;
			GameObject oGameObject3 = oGameObjectlist3.I(1, j1, k1, l1, i2, -1F);
			if (oGameObject3 != null)
				return oGameObject3;
			oGameObjectlist3 = GC;
			oGameObject3 = oGameObjectlist3.I(1, j1, k1, l1, i2, -1F);
			if (oGameObject3 != null)
				return oGameObject3;
			oGameObjectlist3 = AC;
			oGameObject3 = oGameObjectlist3.I(1, j1, k1, l1, i2, -1F);
			if (oGameObject3 != null)
				return oGameObject3;
		}
		return null;
	}

	sprite_group F;
	sprite_group HNSM;
	sprite_group I;
	sprite_group Z;
	sprite_group C;
	sprite_group B;
	sprite_group D;
	sprite_group J;
	sprite_group S;
	sprite_group A;
	sprite_group E;
	sprite_group G;
	sprite_group H;
	sprite_group K;
	sprite_group L;
	sprite_group M;
	sprite_group N;
	sprite_group O;
	sprite_group P;
	sprite_group Q;
	sprite_group R;
	sprite_group T;
	sprite_group U;
	sprite_group V;
	sprite_group W;
	sprite_group X;
	sprite_group Y;
	sprite_group i;
	sprite_group z;
	sprite_group c;
	sprite_group b;
	sprite_group d;
	sprite_group f;
	sprite_group j;
	sprite_group s;
	sprite_group a;
	sprite_group e;
	sprite_group g;
	sprite_group h;
	sprite_group k;
	sprite_group l;
	sprite_group m;
	sprite_group n;
	sprite_group o;
	sprite_group p;
	sprite_group q;
	sprite_group r;
	sprite_group t;
	sprite_group u;
	sprite_group v;
	sprite_group w;
	sprite_group II;
	sprite_group ZI;
	sprite_group CI;
	sprite_group BI;
	sprite_group DI;
	sprite_group FI;
	sprite_group JI;
	sprite_group SI;
	sprite_group AI;
	sprite_group EI;
	sprite_group GI;
	sprite_group HI;
	sprite_group abs;
	sprite_group KI;
	sprite_group LI;
	sprite_group MI;
	sprite_group NI;
	sprite_group OI;
	sprite_group PI;
	sprite_group QI;
	sprite_group RI;
	sprite_group TI;
	sprite_group UI;
	sprite_group VI;
	sprite_group WI;
	sprite_group XI;
	sprite_group YI;
	sprite_group append;
	sprite_group iI;
	sprite_group zI;
	sprite_group cI;
	sprite_group bI;
	sprite_group dI;
	sprite_group arraycopy;
	sprite_group sprite_group_ship;
	sprite_group black;
	sprite blue;
	sprite_group jI;
	sprite_group sI;
	sprite_group aI;
	sprite_group eI;
	sprite_group gI;
	sprite_group hI;
	sprite_group kI;
	sprite_group lI;
	sprite_group mI;
	sprite_group nI;
	sprite_group oI;
	sprite_group pI;
	sprite_group qI;
	sprite_group rI;
	sprite_group tI;
	sprite_group uI;
	sprite_group vI;
	sprite_group wI;
	sprite_group xI;
	sprite_group brighter;
	sprite_group yI;
	sprite_group IZ;
	sprite_group sStarWhite;
	sprite_group sStarRed;
	sprite_group sStarBlue;
	palette DZ;
	palette FZ;
	palette flashcolor_red;
	palette flashcolor_navy;
	palette AZ;
	palette flashcolor_yellow;
	palette GZ;
	palette HZ;
	palette flashcolor_white;
	palette LZ;
	palette MZ;
	palette charAt;
	palette cos;
	palette darkGray;
	palette darker;
	palette freeMemory;
	gamesoundlist NZ;
	int OZ;
	int PZ;
	int QZ;
	int RZ;
	int TZ;
	int UZ;
	int VZ;
	int WZ;
	int XZ;
	int YZ;
	int iZ;
	int zZ;
	int cZ;
	int bZ;
	gamemusicseq gc;
	int getAppletContext;
	oGameObjectlist dZ;
	int getBackground;
	int getCodeBase;
	float getRGB;
	float fZ;
	float jZ;
	float sZ;
	float aZ;
	int eZ;
	int gZ;
	int hZ;
	int kZ;
	int lZ;
	int mZ;
	float nZ;
	oGameObjectlist oZ;
	oGameObjectlist pZ;
	oGameObjectlist qZ;
	oGameObjectlist rZ;
	oGameObjectlist tZ;
	oGameObjectlist uZ;
	oGameObjectlist vZ;
	oGameObjectlist wZ;
	oGameObjectlist xZ;
	oGameObjectlist yZ;
	oGameObjectlist IC;
	oGameObjectlist ZC;
	oGameObjectlist CC;
	oGameObjectlist BC;
	oGameObjectlist DC;
	oGameObjectlist FC;
	oGameObjectlist getRuntime;
	oGameObjectlist JC;
	oGameObjectlist SC;
	oGameObjectlist AC;
	oGameObjectlist EC;
	oGameObjectlist GC;
	starfield Starfield;
	gamecamera Camera;
	gamemission Mission;
	boolean gray;
	boolean green;
	float MC;
	boolean surfaceCreated;
	boolean NC;
	int keyUp;
	int length;
	int lightGray;
	int min;
	int out;
	int pink;
	int println;
	int random;
	float red;
	float repaint;
	boolean round;
	boolean OC;
	int PC;
	int QC;
}
