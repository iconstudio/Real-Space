package realspace;

import java.awt.Color;
import java.awt.Event;
import java.awt.Rectangle;
import java.net.URL;

public final class GameApp extends AppletImplements {
	private static final long serialVersionUID = -3548637070195402558L;

	public static GameApp Instance = null;
	private int cheatCode;

	public GameApp() 
	{
		super();

		Instance = this;
	}

	@Override
	public final void init()
	{
		setBackground(Color.black);

		super.init();
		labelTitle = "Realspace 2 - Emperor's Revenge";
		appletName = "realspace2";

		isSurfaceCreated = false;
		clearedSettings = false;
		cheatedCowLevel = false;
		round = false;
		PC = -1;
		QC = 1;
		nZ = 12F * super.viewScale;
		getAppletContext = (int) (220F * super.viewScale);
		currentMission = new GameMission(this, 1000);
		
		DZ = new Palette(8);
		Palette temp_pallete = DZ;
		Color temp_color1 = Color.yellow.brighter().brighter();
		int i1 = temp_color1.getRGB();
		if (temp_pallete.GetSize() < temp_pallete.GetCapacity())
		{
			temp_pallete.AddColor(i1);
		}
		temp_pallete = DZ;
		temp_color1 = Color.yellow.brighter();
		i1 = temp_color1.getRGB();
		if (temp_pallete.GetSize() < temp_pallete.GetCapacity())
		{
			temp_pallete.AddColor(i1);
		}
		temp_pallete = DZ;
		temp_color1 = Color.yellow;
		i1 = temp_color1.getRGB();
		if (temp_pallete.GetSize() < temp_pallete.GetCapacity())
		{
			temp_pallete.AddColor(i1);
		}
		temp_pallete = DZ;
		temp_color1 = Color.yellow.darker();
		i1 = temp_color1.getRGB();
		if (temp_pallete.GetSize() < temp_pallete.GetCapacity())
		{
			temp_pallete.AddColor(i1);
		}
		temp_pallete = DZ;
		temp_color1 = Color.red.brighter();
		i1 = temp_color1.getRGB();
		if (temp_pallete.GetSize() < temp_pallete.GetCapacity())
		{
			temp_pallete.AddColor(i1);
		}
		temp_pallete = DZ;
		temp_color1 = Color.red;
		i1 = temp_color1.getRGB();
		if (temp_pallete.GetSize() < temp_pallete.GetCapacity())
		{
			temp_pallete.AddColor(i1);
		}
		temp_pallete = DZ;
		temp_color1 = Color.red.darker();
		i1 = temp_color1.getRGB();
		if (temp_pallete.GetSize() < temp_pallete.GetCapacity())
		{
			temp_pallete.AddColor(i1);
		}
		temp_pallete = DZ;
		temp_color1 = Color.red.darker().darker();
		i1 = temp_color1.getRGB();
		if (temp_pallete.GetSize() < temp_pallete.GetCapacity())
		{
			temp_pallete.AddColor(i1);
		}
		FZ = new Palette(9);
		temp_pallete = FZ;
		temp_color1 = Color.pink.brighter();
		i1 = temp_color1.getRGB();
		if (temp_pallete.GetSize() < temp_pallete.GetCapacity())
		{
			temp_pallete.AddColor(i1);
		}
		temp_pallete = FZ;
		temp_color1 = Color.pink;
		i1 = temp_color1.getRGB();
		if (temp_pallete.GetSize() < temp_pallete.GetCapacity())
		{
			temp_pallete.AddColor(i1);
		}
		temp_pallete = FZ;
		temp_color1 = Color.gray.brighter().brighter();
		i1 = temp_color1.getRGB();
		if (temp_pallete.GetSize() < temp_pallete.GetCapacity())
		{
			temp_pallete.AddColor(i1);
		}
		temp_pallete = FZ;
		temp_color1 = Color.gray.brighter();
		i1 = temp_color1.getRGB();
		if (temp_pallete.GetSize() < temp_pallete.GetCapacity())
		{
			temp_pallete.AddColor(i1);
		}
		temp_pallete = FZ;
		temp_color1 = Color.gray;
		i1 = temp_color1.getRGB();
		if (temp_pallete.GetSize() < temp_pallete.GetCapacity())
		{
			temp_pallete.AddColor(i1);
		}
		temp_pallete = FZ;
		temp_color1 = Color.gray.darker();
		i1 = temp_color1.getRGB();
		if (temp_pallete.GetSize() < temp_pallete.GetCapacity())
		{
			temp_pallete.AddColor(i1);
		}
		temp_pallete = FZ;
		temp_color1 = Color.gray.darker().darker();
		i1 = temp_color1.getRGB();
		if (temp_pallete.GetSize() < temp_pallete.GetCapacity())
		{
			temp_pallete.AddColor(i1);
		}
		temp_pallete = FZ;
		temp_color1 = Color.blue.darker();
		i1 = temp_color1.getRGB();
		if (temp_pallete.GetSize() < temp_pallete.GetCapacity())
		{
			temp_pallete.AddColor(i1);
		}
		temp_pallete = FZ;
		temp_color1 = Color.blue.darker().darker();
		i1 = temp_color1.getRGB();
		if (temp_pallete.GetSize() < temp_pallete.GetCapacity())
		{
			temp_pallete.AddColor(i1);
		}

		darker = new Palette(28);
		darker.EnumerateColors(Color.red.darker().darker().getRGB(), Color.red.brighter().brighter().getRGB(), 14, false, true);
		darker.EnumerateColors(Color.red.brighter().brighter().getRGB(), Color.red.darker().darker().getRGB(), 14, false, true);

		freeMemory = new Palette(28);
		freeMemory.EnumerateColors(Color.darkGray.getRGB(), Color.lightGray.getRGB(), 14, false, true);
		freeMemory.EnumerateColors(Color.lightGray.getRGB(), Color.darkGray.getRGB(), 14, false, true);

		HZ = new Palette(9);
		temp_pallete = HZ;
		temp_color1 = Color.black;
		Color temp_color2 = Color.gray;
		int temp_color1code;
		temp_pallete.EnumerateColors(temp_color1.getRGB(), temp_color2.getRGB(), 9, true, false);

		flashcolor_white = new Palette(11);
		temp_pallete = flashcolor_white;
		temp_color1 = Color.black;
		temp_color2 = Color.lightGray.brighter();
		temp_pallete.EnumerateColors(temp_color1.getRGB(), temp_color2.getRGB(), 11, true, false);

		flashcolor_red = new Palette(9);
		temp_pallete = flashcolor_red;
		temp_color1 = Color.black;
		temp_color2 = Color.red.brighter().brighter();
		temp_pallete.EnumerateColors(temp_color1.getRGB(), temp_color2.getRGB(), 9, true, false);

		flashcolor_navy = new Palette(9);
		temp_pallete = flashcolor_navy;
		temp_color1 = Color.black;
		temp_color2 = Color.blue.brighter();
		temp_pallete.EnumerateColors(temp_color1.getRGB(), temp_color2.getRGB(), 9, true, false);

		AZ = new Palette(9);
		temp_pallete = AZ;
		temp_color1 = Color.black;
		temp_color2 = Color.white;
		temp_pallete.EnumerateColors(temp_color1.getRGB(), temp_color2.getRGB(), 9, true, false);

		flashcolor_yellow = new Palette(9);
		temp_pallete = flashcolor_yellow;
		temp_color1 = Color.black;
		temp_color2 = Color.yellow;
		temp_pallete.EnumerateColors(temp_color1.getRGB(), temp_color2.getRGB(), 9, true, false);

		GZ = new Palette(12);
		temp_pallete = GZ;
		temp_color1 = Color.yellow;
		temp_color2 = Color.black;
		temp_pallete.EnumerateColors(temp_color1.getRGB(), temp_color2.getRGB(), 12, false, false);

		charAt = new Palette(6);
		temp_pallete = charAt;
		temp_color1 = Color.gray;
		temp_color2 = Color.black;
		temp_pallete.EnumerateColors(temp_color1.getRGB(), temp_color2.getRGB(), 6, false, false);

		cos = new Palette(6);
		temp_pallete = cos;
		temp_color1 = Color.blue;
		temp_color2 = Color.black;
		temp_pallete.EnumerateColors(temp_color1.getRGB(), temp_color2.getRGB(), 6, false, false);

		darkGray = new Palette(8);
		temp_pallete = darkGray;
		temp_color1 = Color.white;
		temp_color2 = Color.black;
		temp_pallete.EnumerateColors(temp_color1.getRGB(), temp_color2.getRGB(), 8, false, false);

		LZ = new Palette(5);
		temp_pallete = LZ;
		temp_color1 = Color.green.brighter();
		temp_color1code = temp_color1.getRGB();
		if (temp_pallete.GetSize() < temp_pallete.GetCapacity())
		{
			temp_pallete.AddColor(temp_color1code);
		}

		temp_pallete = LZ;
		temp_color1 = Color.green.brighter();
		temp_color1code = temp_color1.getRGB();
		if (temp_pallete.GetSize() < temp_pallete.GetCapacity())
		{
			temp_pallete.AddColor(temp_color1code);
		}

		temp_pallete = LZ;
		temp_color1 = Color.green;
		temp_color1code = temp_color1.getRGB();
		if (temp_pallete.GetSize() < temp_pallete.GetCapacity())
		{
			temp_pallete.AddColor(temp_color1code);
		}

		temp_pallete = LZ;
		temp_color1 = Color.green.darker();
		temp_color1code = temp_color1.getRGB();
		if (temp_pallete.GetSize() < temp_pallete.GetCapacity())
		{
			temp_pallete.AddColor(temp_color1code);
		}

		temp_pallete = LZ;
		temp_color1 = Color.green.darker().darker();
		temp_color1code = temp_color1.getRGB();
		if (temp_pallete.GetSize() < temp_pallete.GetCapacity())
		{
			temp_pallete.AddColor(temp_color1code);
		}

		MZ = new Palette(5);
		temp_pallete = MZ;
		temp_color1 = Color.red.brighter();
		temp_color1code = temp_color1.getRGB();
		if (temp_pallete.GetSize() < temp_pallete.GetCapacity())
		{
			temp_pallete.AddColor(temp_color1code);
		}

		temp_pallete = MZ;
		temp_color1 = Color.red.brighter();
		temp_color1code = temp_color1.getRGB();
		if (temp_pallete.GetSize() < temp_pallete.GetCapacity()) 
		{
			temp_pallete.AddColor(temp_color1code);
		}

		temp_pallete = MZ;
		temp_color1 = Color.red;
		temp_color1code = temp_color1.getRGB();
		if (temp_pallete.GetSize() < temp_pallete.GetCapacity())
		{
			temp_pallete.AddColor(temp_color1code);
		}

		temp_pallete = MZ;
		temp_color1 = Color.red.darker();
		temp_color1code = temp_color1.getRGB();
		if (temp_pallete.GetSize() < temp_pallete.GetCapacity())
		{
			temp_pallete.AddColor(temp_color1code);
		}

		temp_pallete = MZ;
		temp_color1 = Color.red.darker().darker();
		temp_color1code = temp_color1.getRGB();
		if (temp_pallete.GetSize() < temp_pallete.GetCapacity())
		{
			temp_pallete.AddColor(temp_color1code);
		}

		final float world_size = 5000f;
		InitializeWorldDimensions((-world_size * viewScale) / 2.0F, (world_size * viewScale) / 2.0F, (-world_size * viewScale) / 2.0F, (world_size * viewScale) / 2.0F);

		viewBorderLeft = worldBorderLeft + screen_width / 2.0F + 200F;
		viewBorderRight = worldBorderRight - screen_width / 2.0F - 200F;
		viewBorderTop = worldBorderTop + screen_height / 2.0F + 200F;
		viewBorderBottom = worldBorderBottom - screen_height / 2.0F - 200F;

		lightGray = (int) (viewWidth * 0.25F);
		min = (int) (viewHeight * 0.25F);

		lightGray = Math.min(lightGray, min);
		min = lightGray;

		out = lightGray / 6;
		pink = min / 6;
		keyUp = viewWidth - lightGray - (int) (40F * viewScale);
		length = viewHeight - min - (int) (50F * viewScale);
		println = keyUp + lightGray / 2;
		random = length + min / 2;

		red = lightGray / worldDimension[0];
		repaint = min / worldDimension[1];

		labelLoading = null;
		loadProgress = 0;
		repaint();
	}

	@Override
	public final void I()
	{
		ExecuteCheat();

		if (clearedSettings)
		{
			clearedSettings = false;

			if (super.isAudioMuted)
			{
				InitializeSettings(false);
			}
		}

		if (cheatedCowLevel)
		{
			cheatedCowLevel = false;
			currentMission.CompleteImmediately();
		}
		myCamera.Update();

		final GameObjectPool obj = dZ;
		final oSpaceship nobj = (oSpaceship) (obj.GetSize() <= 0 ? null : (obj).internalList[0]);

		if (nobj != null && nobj.timeSinceEpoch >= 0 && (nobj).QI == 4)
		{
			if (gZ > 0)
			{
				gZ--;
				if (gZ == 0)
					eZ = 0;
			}

			if (!super.isAudioMuted)
			{
				if (getCodeBase != 1 && super.qC)
				{
					if (getCodeBase == 2)
					{
						final float f1 = (float) Math.cos(nobj.myRotation);
						final float f3 = (float) Math.sin(nobj.myRotation);

						nobj.hAccel = f1 * nobj.accelFactorOnStage;
						nobj.vAccel = f3 * nobj.accelFactorOnStage;
					}
					else
					{
						final float f2 = (float) (-Math.cos(nobj.myRotation));
						final float f4 = (float) (-Math.sin(nobj.myRotation));

						nobj.hAccel = f2 * nobj.accelFactorOnStage * 0.3F;
						nobj.vAccel = f4 * nobj.accelFactorOnStage * 0.3F;
					}

					nobj.hSpeed += nobj.hAccel;
					nobj.vSpeed += nobj.vAccel;
				}
				else
				{
					nobj.hAccel = 0.0F;
					nobj.vAccel = 0.0F;
				}

				if (getBackground != 1)
				{
					if (getBackground == 2)
					{
						getRGB -= 0.02454369F;
						if (getRGB < -0.1963495F)
						{
							getRGB = -0.1963495F;
						}
						nobj.myRotation += getRGB;

						if (nobj.myRotation < 0.0F)
						{
							nobj.myRotation += 6.283185F;
						}
					}
					else if (getBackground == 3)
					{
						getRGB += 0.02454369F;
						if (getRGB > 0.1963495F)
						{
							getRGB = 0.1963495F;
						}
						nobj.myRotation += getRGB;

						if (nobj.myRotation >= 6.283185F)
						{
							nobj.myRotation -= 6.283185F;
						}
					}

					nobj.frameIndex = nobj.myAtlas.GetFrameByRotation(nobj.myRotation);
				}
			}
			else if (super.qC && Math.random() * 10D > 9D)
			{
				abs();
			}

			if (nobj.myX <= viewBorderLeft)
			{
				if (nobj.hSpeed < 0.0F)
				{
					nobj.hSpeed = 0.0F;
				}
				nobj.myX = viewBorderLeft;
				nobj.CalcCollisionBox();
			}
			else if (nobj.myX >= viewBorderRight)
			{
				if (nobj.hSpeed > 0.0F)
				{
					nobj.hSpeed = 0.0F;
				}
				nobj.myX = viewBorderRight;
				nobj.CalcCollisionBox();
			}

			if (nobj.myY <= viewBorderTop)
			{
				if (nobj.vSpeed < 0.0F)
				{
					nobj.vSpeed = 0.0F;
				}
				nobj.myY = viewBorderTop;
				nobj.CalcCollisionBox();
			}
			else if (nobj.myY >= viewBorderBottom)
			{
				if (nobj.vSpeed > 0.0F)
				{
					nobj.vSpeed = 0.0F;
				}
				nobj.myY = viewBorderBottom;
				nobj.CalcCollisionBox();
			}
		}

		gameStarfield.update(myCamera.hSpeed, myCamera.vSpeed);

		super.I();
		currentMission.I();

		dZ.Warp();
		oZ.Warp();
		pZ.Warp();
		qZ.Warp();
		tZ.Warp();
		vZ.Warp();
		wZ.Warp();
		yZ.Warp();
		IC.Warp();
		ZC.Warp();
		AC.Warp();
		EC.Warp();
		GC.Warp();
		BC.Warp();
		IC.CheckCollision(wZ);
		IC.CheckCollision(GC);
		ZC.CheckCollision(wZ);
		wZ.CheckCollision(vZ);
		wZ.CheckCollision(dZ);
		wZ.CheckCollision(EC);
		vZ.CheckCollision(GC);
		yZ.CheckCollision(ZC);
		yZ.CheckCollision(vZ);
		yZ.CheckCollision(dZ);
		yZ.CheckCollision(EC);
		dZ.CheckCollision(BC);

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
	public final void RenderScene(final Canvas applet_surface)
	{
		final Canvas surface2 = super.applicationCanvas;
		final Canvas surface3 = super.mC;
		System.arraycopy(surface3.canvasBuffer, 0, surface2.canvasBuffer, 0, surface2.myDimensionSize);

		if (!isAssetsLoaded)
		{
			int i1 = (super.viewWidth - 200) / 2;
			int i2 = (super.viewHeight - 200) / 2;

			if (spriteTitle != null)
			{
				applet_surface.Draw(spriteTitle, i1, i2, this);
			}

			if (0 < loadProgress)
			{
				i1 += 6;
				i2 += 147;
				gameutil.DrawGaugebar(applet_surface, i1, i2, 188, 20,
						(float) super.loadProgress / (float) super.loadMaxProgress, 0xff4040ff,
						Colours.Green);
			}

			return;
		}

		if (!isSurfaceCreated)
		{
			isSurfaceCreated = true;
		}

		gameStarfield.draw(applet_surface);
		AC.Draw(applet_surface);
		EC.Draw(applet_surface);
		GC.Draw(applet_surface);

		// Render the main menu
		if (!super.isAudioMuted && NC)
		{
			final int dx = (int) (20F * super.viewScale);
			int dy = (int) (25F * super.viewScale);
			applet_surface.DrawLabel(super.uC, Colours.White, super.fontSmall, dx - 1, dy + 1);

			final GameObject target = dZ.internalList[0];
			final GameObject obj = dZ.GetSize() <= 0 ? null : target;

			if (obj != null && obj.IsActivated())
			{
				int k1 = (int) (220F * super.viewScale);
				applet_surface.DrawLabel("Damage", Colours.White, super.fontSmall, k1 - 1, dy + 1);
				k1 += super.fontSmall.I("Damage") + 7;
				final Font gamefont1 = super.fontSmall;
				dy -= (gamefont1.myHeight * 3) / 5;

				final float f1 = (float) ((obj).o + (obj).n) / (float) ((obj).p + (obj).q);
				if (f1 < MC)
				{
					MC = f1;
				} else if (f1 > MC)
				{
					if (f1 - MC > 0.01F)
						MC += 0.01F;
					else
						MC = f1;
				}

				Object obj1;
				gameutil.DrawGaugebar(applet_surface, k1, dy + 2, getAppletContext, ((Font) (obj1 = super.fontTiny)).myHeight - 4, MC, Colours.Red, Colours.Yellow);

				applet_surface.I(k1, dy, getAppletContext, ((Font) (obj1 = super.fontTiny)).myHeight, Colours.DarkGreen, 1);

				final int k3 = (int) (35F * super.viewScale);
				final int i4 = (int) (20F * super.viewScale);
				final int k4 = i4 + (int) (48F * super.viewScale);
				final float f2 = Math.abs(super.IB % 22L - 11F) * 0.059F + 0.35F;
				dy = (int) (super.viewHeight * 0.7F);
				if (hZ == 1)
					applet_surface.DrawSprite(arraycopy.GetSprite(0, 0), f2, i4, dy, this);
				else
					applet_surface.Draw(arraycopy.GetSprite(0, 0), i4, dy, this);
				applet_surface.DrawLabel("-", Colours.White, super.fontTiny, k4, dy + super.fontTiny.myHeight + 2);
				dy += k3;
				obj1 = String.valueOf(kZ);
				if (hZ == 2)
					applet_surface.DrawSprite(arraycopy.GetSprite(1, 0), f2, i4, dy, this);
				else
					applet_surface.Draw(arraycopy.GetSprite(1, 0), i4, dy, this);
				applet_surface.DrawLabel(((String) (obj1)), Colours.White, super.fontTiny, k4, dy + super.fontTiny.myHeight + 2);
				dy += k3;
				obj1 = String.valueOf(lZ);
				if (hZ == 3)
					applet_surface.DrawSprite(arraycopy.GetSprite(2, 0), f2, i4, dy, this);
				else
					applet_surface.Draw(arraycopy.GetSprite(2, 0), i4, dy, this);
				applet_surface.DrawLabel(((String) (obj1)), Colours.White, super.fontTiny, k4, dy + super.fontTiny.myHeight + 2);
				dy += k3;
				obj1 = String.valueOf(mZ);
				if (hZ == 4)
					applet_surface.DrawSprite(arraycopy.GetSprite(3, 0), f2, i4, dy, this);
				else
					applet_surface.Draw(arraycopy.GetSprite(3, 0), i4, dy, this);
				applet_surface.DrawLabel(((String) (obj1)), Colours.White, super.fontTiny, k4, dy + super.fontTiny.myHeight + 2);
			}

			applet_surface.I(keyUp, length, lightGray, min, getBackground().getRGB());
		}

		vZ.Draw(applet_surface);
		wZ.Draw(applet_surface);
		dZ.Draw(applet_surface);
		oZ.Draw(applet_surface);
		pZ.Draw(applet_surface);
		yZ.Draw(applet_surface);
		tZ.Draw(applet_surface);
		qZ.Draw(applet_surface);
		IC.Draw(applet_surface);
		ZC.Draw(applet_surface);
		BC.Draw(applet_surface);

		// Render the main menu
		if (super.isAudioMuted) {
			applet_surface.DrawLabel("Click Anywhere Or Press Any Key To Start", Color.red.getRGB(), super.fontSmall,
					super.viewWidth / 2 - super.fontSmall.I("Click Anywhere Or Press Any Key To Start") / 2 - 1,
					super.viewHeight / 8 + 1);
			applet_surface.DrawLabel("Click Anywhere Or Press Any Key To Start", Color.yellow.getRGB(),
					super.fontSmall,
					super.viewWidth / 2 - super.fontSmall.I("Click Anywhere Or Press Any Key To Start") / 2,
					super.viewHeight / 8);
		} else if (NC) {
			int l1 = 1;
			int k2 = keyUp + out;
			for (; l1 < 6; l1++) {
				applet_surface.I(k2, length, 1, min, 0xff004000);
				k2 += out;
			}

			l1 = 1;
			k2 = length + pink;
			for (; l1 < 6; l1++) {
				applet_surface.I(keyUp, k2, lightGray, 1, 0xff004000);
				k2 += pink;
			}
			applet_surface.I(keyUp, length, lightGray, min, Colours.DarkGreen, 1);
			applet_surface.Draw(black.GetSprite(0, 0), keyUp + (lightGray - black.C) / 2, length + min + 2, this);

			int l2 = println + (int) (myCamera.myX * red);
			int i3 = random + (int) (myCamera.myY * repaint);
			applet_surface.I(l2 - 1, i3 - 1, 3, 3, Colours.Green);

			final int j3 = (int) ((super.viewWidth * red) / 2.0F);
			final int l3 = (int) ((super.viewHeight * red) / 2.0F);
			final int j4 = l2 + j3;
			final int l4 = i3 + l3;
			l2 -= j3;
			i3 -= l3;
			applet_surface.I(l2, i3, 2, 5, Colours.Green);
			applet_surface.I(l2 + 2, i3, 3, 2, Colours.Green);
			applet_surface.I(j4 - 1, i3, 2, 5, Colours.Green);
			applet_surface.I(j4 - 4, i3, 3, 2, Colours.Green);
			applet_surface.I(l2, l4 - 4, 2, 5, Colours.Green);
			applet_surface.I(l2 + 2, l4 - 1, 3, 2, Colours.Green);
			applet_surface.I(j4 - 1, l4 - 4, 2, 5, Colours.Green);
			applet_surface.I(j4 - 4, l4 - 1, 3, 2, Colours.Green);

			F(applet_surface, EC, false, 3, 3, Colours.LightGray, Colours.DarkGray);
			F(applet_surface, vZ, false, 3, 3, Colours.LightGray, Colours.DarkGray);
			F(applet_surface, wZ, false, 3, 3, Colours.Red, Colours.Maroon);
			F(applet_surface, GC, false, 3, 3, Colours.Red, Colours.Maroon);
			F(applet_surface, BC, true, 3, 3, Colours.Lemon, Colours.DarkYellow);
		}
		super.RenderScene(applet_surface);
	}

	public final void F(final Canvas canvas, final GameObjectPool pool, final boolean flag, final int i1, final int j1, final int k1, final int l1)
	{
		final int k2 = i1 / 2;
		final int l2 = j1 / 2;

		for (int i3 = 0; i3 < pool.mySize; i3++)
		{
			final GameObject obj = pool.internalList[i3];

			if (obj.IsActivated() && obj.isVisible && obj.isEnabled)
			{
				final int i2 = (println + (int) (obj.myX * red)) - k2;
				final int j2 = (random + (int) (obj.myY * repaint)) - l2;

				if (flag || obj.timeSinceEpoch < 28)
				{
					if (obj.timeSinceEpoch % 8 < 4)
						canvas.I(i2, j2, i1, j1, k1);
					else
						canvas.I(i2, j2, i1, j1, l1);
				}
				else
				{
					canvas.I(i2, j2, i1, j1, k1);
				}
			}
		}
	}

	public final void ExecuteCheat()
	{
		if (cheatCode != 0 && !super.isAudioMuted)
		{
			super.tC = true;
			boolean flag = true;

			switch (cheatCode)
			{
				default:
					break;

				case 1: // '\001'
					super.uC = "Cheater: Kill All";

					wZ.Attach(false, null, -1, -1, -1, -1);
					yZ.Attach(false, null, -1, -1, -1, -1);
					break;

				case 5: // '\005'
					super.uC = "Cheater: Kill Friend";

					if (0 < vZ.GetSize()) {
						vZ.internalList[0].Attach(false, null);
					}
					break;

				case 2: // '\002'
					super.uC = "Cheater: Repair";

					vZ.I(1.0F, 1.0F, true, -1, -1, -1, -1);
					dZ.I(1.0F, 1.0F, true, -1, -1, -1, -1);
					break;

				case 3: // '\003'
					super.uC = "Cheater: Invulnerable";

					// copy
					GameObjectPool temp_list = vZ;
					int temp_count = temp_list.GetSize();

					for (int i = 0; i < temp_count; i++) {
						// reference from original
						final GameObject ally = i < 0 || i >= temp_list.GetSize() ? null : vZ.internalList[i];

						if (i == 0 && ally.r) {
							flag = false;
						}
						ally.r = flag;
					}

					// copy
					temp_list = dZ;
					temp_count = temp_list.GetSize();

					for (int j = 0; j < temp_count; j++) {
						// reference from original
						final GameObject ally = j < 0 || j >= temp_list.GetSize() ? null : dZ.internalList[j];

						if (j == 0 && ally.r) {
							flag = false;
						}

						ally.r = flag;
					}

					break;

				case 4: // '\004'
					super.uC = "Cheater: Skip Mission";

					currentMission.CompleteImmediately();
					break;
			}
		}

		cheatCode = 0;
	}

	@Override
	public final boolean keyDown(final Event event, final int keycode) 
	{
		super.keyDown(event, keycode);

		if (!isPaused && isAssetsLoaded) 
		{
			if (super.isAudioMuted)
			{
				switch (keycode) {
					default:
						clearedSettings = true;
						break;

					case 80: // 'P'
					case 112: // 'p'
						break;
				}
			}
			else if (currentMission.usingTriggersCount == 300 || currentMission.usingTriggersCount == 301 || currentMission.usingTriggersCount == 302) {
				switch (keycode) {
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
				switch (keycode) {
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
						if (super.qC)
						{
							abs();
						}
						else
						{
							final GameObjectPool oGameObjectlist1 = super.gameUIObjects;
							
							if (oGameObjectlist1.I(1, -1, -1, -1, -1, 10F) != null)
							{
								cheatedCowLevel = true;
							}
						}
						break;

					case 10: // '\n'
					case 27: // '\033'
						final GameObjectPool oGameObjectlist2 = super.gameUIObjects;
						if (oGameObjectlist2.I(1, -1, -1, -1, 10, -1F) != null)
						{
							cheatedCowLevel = true;
						}
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
						InitializeSettings(false);
						break;

					case 35: // '#'
						InitializeSettings(true);
						
						gameUIObjects.Attach(true, null, -1, -1, -1, -1);
						currentMission.ExecuteTriggers(1200);
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

				if (null == lastInputString || 0 == lastInputString.length()) 
				{
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
		}

		return true;
	}

	@Override
	@SuppressWarnings("deprecation")
	public final boolean keyUp(final Event event, final int i1) {
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
				final GameObjectPool obj = dZ;
				final oSpaceship nobj = (oSpaceship) (obj.GetSize() <= 0 ? null : obj.internalList[0]);
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
	public final boolean mouseDown(final Event event, final int mx, final int my) {
		if (!super.isPaused && super.isAssetsLoaded)
		{if (super.isAudioMuted)
			{
				boolean flag = false;

				final GameLabel gametext2 = (GameLabel) super.gameUIObjects.OnMouseHover(mx, my);
				if (gametext2 != null && ((GameObject) (gametext2)).HI == 3)
				{
					flag = true;

					try
					{
						getAppletContext().showDocument(
								new URL(super.labelURL + "?game=realspace2&refer=" + getCodeBase() + labelURLSuffix),
								"_blank");
					}
					catch (final Exception exception)
					{
						System.out.println("showDocument failed " + exception);
					}
				}

				if (!flag)
				{
					clearedSettings = true;
				}
			}
			else
			{
				final GameLabel gametext1 = (GameLabel) super.gameUIObjects.OnMouseHover(mx, my);
				if (gametext1 != null)
				{
					J(((GameObject) (gametext1)).HI);
				}
			}
		}

		return true;
	}

	@Override
	public final boolean mouseMove(final Event event, final int mx, final int my)
	{
		if (!super.isPaused && super.isAssetsLoaded && (currentMission.usingTriggersCount == 300 || currentMission.usingTriggersCount == 301 || currentMission.usingTriggersCount == 302))
		{
			final GameLabel gametext1 = (GameLabel) super.gameUIObjects.OnMouseHover(mx, my);

			if (gametext1 != null)
			{
				I(((GameObject) (gametext1)).HI);
			}
		}

		return true;
	}

	final void I(final int i1)
	{
		boolean flag = false;
		final GameObjectPool oGameObjectlist1 = super.gameUIObjects;
		final int j1 = oGameObjectlist1.mySize;
		for (int k1 = 0; k1 < j1; k1++) {
			Object obj = super.gameUIObjects;
			obj = k1 < 0 || k1 >= ((GameObjectPool) (obj)).GetSize() ? null : ((GameObjectPool) (obj)).internalList[k1];
			if (obj != null && ((GameObject) (obj)).HI != -1 && ((GameObject) (obj)).HI == i1)
				flag = true;
		}

		if (flag) {
			PC = i1;
			for (int l1 = 0; l1 < j1; l1++) {
				final GameObjectPool obj1 = super.gameUIObjects;
				final GameLabel nobj = (GameLabel) (l1 < 0 || l1 >= obj1.GetSize() ? null : obj1.internalList[l1]);
				if (nobj != null && nobj.HI != -1)
					{if (nobj.HI == i1)
					{
						final Palette palette1 = darker;
						final Palette palette2 = freeMemory;
						nobj.D = palette1;
						nobj.LI = palette2;
					}
					else
					{
						nobj.D = nobj.MI;
						nobj.LI = nobj.NI;
					}
				}
			}
		}
	}

	final void J(final int i1)
	{
		if (currentMission.usingTriggersCount == 300)
		{
			switch (i1) {
				case 1: // '\001'
					currentMission.ExecuteTriggers(301);
					return;

				case 2: // '\002'
					currentMission.ExecuteTriggers(302);
					return;

				case 3: // '\003'
					try {
						getAppletContext().showDocument(
								new URL(super.labelURL + "?game=realspace2&refer=" + getCodeBase() + labelURLSuffix),
								"_blank");

						return;
					} catch (final Exception exception) {
						System.out.println("showDocument failed " + exception);
					}

					return;
			}

			final GameObjectPool oGameObjectlist1 = super.gameUIObjects;
			oGameObjectlist1.Attach(true, null, -1, -1, -1, -1);
			InitializeSettings(true);
			return;
		}

		if (currentMission.usingTriggersCount == 301)
		{
			switch (i1) {
				case 1: // '\001'
					currentMission.Q = 0;
					currentMission.ExecuteTriggers(100);
					return;

				case 2: // '\002'
					currentMission.Q = 1;
					currentMission.ExecuteTriggers(100);
					return;

				case 3: // '\003'
					currentMission.Q = 2;
					currentMission.ExecuteTriggers(100);
					return;

				case 4: // '\004'
					currentMission.Q = 3;
					currentMission.ExecuteTriggers(100);
					return;
			}
			currentMission.ExecuteTriggers(300);
			I(1);
			return;
		}

		if (currentMission.usingTriggersCount == 302)
		{
			switch (i1) {
				case 1: // '\001'
					QC = 1;
					final oStarfield starfield1 = gameStarfield;
					final int j1 = gameStarfield.star_number_start;
					starfield1.star_number = Math.min(j1, starfield1.star_number_start);
					break;

				case 2: // '\002'
					QC = 2;
					final oStarfield starfield2 = gameStarfield;
					final int k1 = gameStarfield.star_number_start / 2;
					starfield2.star_number = Math.min(k1, starfield2.star_number_start);
					break;

				case 3: // '\003'
					QC = 3;
					final oStarfield starfield3 = gameStarfield;
					final int l1 = gameStarfield.star_number_start / 4;
					starfield3.star_number = Math.min(l1, starfield3.star_number_start);
					break;
			}
			currentMission.ExecuteTriggers(300);
			I(2);
			return;
		}
		if (i1 == 10)
			cheatedCowLevel = true;
	}

	final void abs()
	{
		final GameObjectPool obj = dZ;
		final oSpaceship nobj = (oSpaceship) (obj.GetSize() <= 0 ? null : obj.internalList[0]);
		if (nobj != null && nobj.timeSinceEpoch >= 0 && nobj.QI == 4 && !nobj.Z) {
			nobj.J();
			nobj.Z = true;
			nobj.C = 5;
			nobj.B = 0;
		}
	}

	@Override
	public final boolean LoadAssets()
	{
		int current_loading_progress = 0;
		InitializeInstancePools();

		super.labelLoading = null;
		super.loadProgress = ++current_loading_progress;
		repaint();

		//
		Bitmap temp_bitmap = LoadSprite("images/title1.jpg");
		spriteTitle = new Sprite(200, 200, 0, 0, 0, 0, super.applicationCanvas, false, temp_bitmap, this);
		temp_bitmap.myData = null;
		temp_bitmap = null;
		System.gc();

		//
		super.labelLoading = null;
		super.loadProgress = ++current_loading_progress;

		repaint();

		//
		Bitmap font_img = LoadSprite("images/spacefont.gif");

		fontTiny = new Font((int) (17.6F * viewScale), (int) (2.2F * viewScale));
		InitializeFont(fontTiny, font_img, 0.55F * viewScale);

		fontSmall = new Font((int) (22.4F * viewScale), (int) (2.8F * viewScale));
		InitializeFont(fontSmall, font_img, 0.7F * viewScale);

		fontNormal = new Font((int) (27.2F * viewScale), (int) (3.4F * viewScale));
		InitializeFont(fontNormal, font_img, 0.85F * viewScale);

		fontLarge = new Font((int) (32F * viewScale), (int) (4F * viewScale));
		InitializeFont(fontLarge, font_img, viewScale);

		font_img.myData = null;
		font_img = null;
		System.gc();

		//
		current_loading_progress += 2;
		super.labelLoading = "Loading And Preparing Resources";
		super.loadProgress = current_loading_progress;
		repaint();

		//
		everySFXs = new GameSoundPool(this, 14);
		PZ = everySFXs.Load("sounds/fire2.au", true);
		QZ = everySFXs.Load("sounds/fire5.au", false);
		OZ = everySFXs.Load("sounds/fire1.au", true);
		RZ = everySFXs.Load("sounds/fire3.au", true);
		TZ = everySFXs.Load("sounds/explosion_sm1.au", true);
		UZ = everySFXs.Load("sounds/explosion_sm2.au", true);
		VZ = everySFXs.Load("sounds/explosion_sm3.au", true);
		WZ = everySFXs.Load("sounds/explosion_med1.au", true);
		XZ = everySFXs.Load("sounds/explosion_lrg1.au", true);
		YZ = everySFXs.Load("sounds/explosion_lrg2.au", true);
		iZ = everySFXs.Load("sounds/explosion_lrg3.au", true);
		zZ = everySFXs.Load("sounds/levelstart.au", false);
		cZ = everySFXs.Load("sounds/levelend.au", false);
		bZ = everySFXs.Load("sounds/powerup2.au", false);
		
		for (int i1 = 0; i1 < everySFXs.mySize; i1++)
		{
			current_loading_progress += 2;
			super.labelLoading = "Loading And Preparing Resources";
			super.loadProgress = current_loading_progress;

			repaint();
			everySFXs.PlayOnce(i1);
		}

		// Loads music
		MusicPiece chords[] = new MusicPiece[4];
		try
		{
			//
			chords[0] = new MusicPiece(this, "sounds/music1.au");
			current_loading_progress += 2;
			super.labelLoading = "Loading And Preparing Resources";
			super.loadProgress = current_loading_progress;
			repaint();

			//
			chords[1] = new MusicPiece(this, "sounds/music2.au");
			current_loading_progress += 2;
			super.labelLoading = "Loading And Preparing Resources";
			super.loadProgress = current_loading_progress;
			repaint();

			//
			chords[2] = new MusicPiece(this, "sounds/music3.au");
			current_loading_progress += 2;
			super.labelLoading = "Loading And Preparing Resources";
			super.loadProgress = current_loading_progress;
			repaint();

			//
			chords[3] = new MusicPiece(this, "sounds/music4.au");
			current_loading_progress += 2;
			super.labelLoading = "Loading And Preparing Resources";
			super.loadProgress = current_loading_progress;
			repaint();

			//
			gameMusic = new MusicSequence(12);
			gameMusic.Add(chords[0]);
			gameMusic.Add(chords[0]);
			gameMusic.Add(chords[0]);
			gameMusic.Add(chords[3]);
			gameMusic.Add(chords[3]);
			gameMusic.Add(chords[3]);
			gameMusic.Add(chords[2]);
			gameMusic.Add(chords[2]);
			gameMusic.Add(chords[3]);
			gameMusic.Add(chords[3]);
			gameMusic.Add(chords[2]);
			gameMusic.Add(chords[2]);
			gameMusic.Add(chords[1]);
			gameMusic.Add(chords[1]);
			gameMusic.Add(chords[1]);
			gameMusic.Initialize();

			chords[0] = null;
			chords[1] = null;
			chords[2] = null;
			chords[3] = null;
			chords = null;
		}
		catch (final Exception e)
		{
			System.out.println("ERROR: exception during music load");
			gameMusic = null;
		}

		System.gc();
		System.out.println("after music load totalMemory=" + String.valueOf(Runtime.getRuntime().totalMemory())
 + " freeMemory=" + String.valueOf(Runtime.getRuntime().freeMemory()));

		// gamemusicpiece1 = k2 += 3;
		super.labelLoading = "Loading And Preparing Resources";
		super.loadProgress = current_loading_progress;

		repaint();
		if (null == (temp_bitmap = LoadSprite("images/ships1.gif")))
		{
			return false;
		}

		G = new SpriteGroup(this, 64, 1);
		Object obj = G;
		float f1 = super.viewScale, factor;
		Object obj1 = super.applicationCanvas;
		((SpriteGroup) (obj)).I(f1, 1, 27, 11, 277, 9, 0, 0, temp_bitmap, 64, 0, 64, ((Canvas) (obj1)));
		H = new SpriteGroup(this, 64, 1);
		obj = H;
		f1 = super.viewScale;
		obj1 = super.applicationCanvas;
		((SpriteGroup) (obj)).I(f1, 1, 17, 24, 282, 29, 0, 0, temp_bitmap, 64, 0, 64, ((Canvas) (obj1)));

		K = new SpriteGroup(this, 64, 1);
		obj = K;
		f1 = super.viewScale;
		obj1 = super.applicationCanvas;
		((SpriteGroup) (obj)).I(f1, 1, 19, 21, 282, 60, 0, 0, temp_bitmap, 64, 0, 64, ((Canvas) (obj1)));

		L = new SpriteGroup(this, 64, 1);
		obj = L;
		f1 = super.viewScale;
		obj1 = super.applicationCanvas;
		((SpriteGroup) (obj)).I(f1, 1, 23, 16, 318, 61, 0, 0, temp_bitmap, 64, 0, 64, ((Canvas) (obj1)));

		M = new SpriteGroup(this, 64, 1);
		obj = M;
		f1 = super.viewScale;
		obj1 = super.applicationCanvas;
		((SpriteGroup) (obj)).I(f1, 1, 26, 11, 354, 35, 0, 0, temp_bitmap, 64, 0, 64, ((Canvas) (obj1)));
		N = new SpriteGroup(this, 64, 1);
		obj = N;
		f1 = super.viewScale;
		obj1 = super.applicationCanvas;
		((SpriteGroup) (obj)).I(f1, 1, 18, 16, 357, 58, 0, 0, temp_bitmap, 64, 0, 64, ((Canvas) (obj1)));

		O = new SpriteGroup(this, 64, 1);
		obj = O;
		f1 = super.viewScale;
		obj1 = super.applicationCanvas;
		((SpriteGroup) (obj)).I(f1, 1, 23, 11, 390, 60, 0, 0, temp_bitmap, 64, 0, 64, ((Canvas) (obj1)));

		P = new SpriteGroup(this, 64, 1);
		obj = P;
		f1 = super.viewScale;
		obj1 = super.applicationCanvas;
		((SpriteGroup) (obj)).I(f1, 1, 23, 19, 390, 32, 0, 0, temp_bitmap, 64, 0, 64, ((Canvas) (obj1)));

		super.labelLoading = "Loading And Preparing Resources";
		super.loadProgress = ++current_loading_progress;

		repaint();
		k = new SpriteGroup(this, 32, 1);
		arraycopy(k, super.viewScale, 3, 4, 55, 22, temp_bitmap, 32, 0, 32);

		super.labelLoading = "Loading And Preparing Resources";
		super.loadProgress = ++current_loading_progress;

		repaint();
		l = new SpriteGroup(this, 32, 1);
		arraycopy(l, super.viewScale, 3, 5, 91, 21, temp_bitmap, 32, 0, 32);

		super.labelLoading = "Loading And Preparing Resources";
		super.loadProgress = ++current_loading_progress;

		repaint();
		m = new SpriteGroup(this, 32, 1);
		arraycopy(m, super.viewScale, 3, 7, 123, 27, temp_bitmap, 32, 0, 32);

		super.labelLoading = "Loading And Preparing Resources";
		super.loadProgress = ++current_loading_progress;

		repaint();
		super.labelLoading = "Loading And Preparing Resources";
		super.loadProgress = ++current_loading_progress;

		repaint();
		n = new SpriteGroup(this, 32, 1);
		arraycopy(n, super.viewScale, 3, 12, 159, 24, temp_bitmap, 32, 0, 32);
		
		super.labelLoading = "Loading And Preparing Resources";
		super.loadProgress = ++current_loading_progress;

		repaint();
		o = new SpriteGroup(this, 32, 1);
		arraycopy(o, super.viewScale, 3, 44, 55, 32, temp_bitmap, 32, 0, 32);
		
		super.labelLoading = "Loading And Preparing Resources";
		super.loadProgress = ++current_loading_progress;

		repaint();
		p = new SpriteGroup(this, 32, 1);
		arraycopy(p, super.viewScale, 3, 47, 96, 45, temp_bitmap, 32, 0, 32);
		
		super.labelLoading = "Loading And Preparing Resources";
		super.loadProgress = ++current_loading_progress;

		repaint();
		q = new SpriteGroup(this, 32, 1);
		arraycopy(q, super.viewScale, 3, 47, 148, 34, temp_bitmap, 32, 0, 32);
		
		super.labelLoading = "Loading And Preparing Resources";
		super.loadProgress = ++current_loading_progress;

		repaint();
		super.labelLoading = "Loading And Preparing Resources";
		super.loadProgress = ++current_loading_progress;

		repaint();
		r = new SpriteGroup(this, 32, 1);
		arraycopy(r, super.viewScale, 3, 95, 8, 51, temp_bitmap, 32, 0, 32);
		
		super.labelLoading = "Loading And Preparing Resources";
		super.loadProgress = ++current_loading_progress;

		repaint();
		t = new SpriteGroup(this, 32, 1);
		arraycopy(t, super.viewScale, 3, 152, 10, 44, temp_bitmap, 32, 0, 32);
		
		super.labelLoading = "Loading And Preparing Resources";
		super.loadProgress = ++current_loading_progress;

		repaint();
		super.labelLoading = "Loading And Preparing Resources";
		super.loadProgress = ++current_loading_progress;

		repaint();
		u = new SpriteGroup(this, 32, 1);
		arraycopy(u, super.viewScale, 3, 150, 125, 46, temp_bitmap, 32, 0, 32);
		
		super.labelLoading = "Loading And Preparing Resources";
		super.loadProgress = ++current_loading_progress;

		repaint();
		v = new SpriteGroup(this, 32, 1);
		arraycopy(v, super.viewScale, 3, 8, 192, 48, temp_bitmap, 32, 0, 32);
		
		super.labelLoading = "Loading And Preparing Resources";
		super.loadProgress = ++current_loading_progress;

		repaint();
		w = new SpriteGroup(this, 32, 1);
		arraycopy(w, super.viewScale, 3, 390, 169, 86, temp_bitmap, 32, 0, 32);
		
		super.labelLoading = "Loading And Preparing Resources";
		super.loadProgress = ++current_loading_progress;

		repaint();
		II = new SpriteGroup(this, 1);
		append(II, super.viewScale, 0.0F, 0, 244, 136, 112, temp_bitmap);

		FI = new SpriteGroup(this, 64, 1);
		FI.I(super.viewScale, 3, 33, 32, 100, 133, 6, 0, temp_bitmap, 64, 0, 64, super.applicationCanvas);

		ZI = new SpriteGroup(this, 1);
		append(ZI, super.viewScale, 0.0F, 0, 125, 172, 49, temp_bitmap);

		CI = new SpriteGroup(this, 1);
		append(CI, super.viewScale, 0.0F, 0, 181, 174, 46, temp_bitmap);

		BI = new SpriteGroup(this, 1);
		append(BI, super.viewScale, 0.0F, 0, 120, 223, 36, temp_bitmap);

		DI = new SpriteGroup(this, 1);
		append(DI, super.viewScale, 0.0F, 0, 186, 224, 32, temp_bitmap);
		
		super.labelLoading = "Loading And Preparing Resources";
		super.loadProgress = ++current_loading_progress;

		repaint();
		JI = new SpriteGroup(this, 1);
		append(JI, super.viewScale, 0.0F, 0, 450, 8, 240, temp_bitmap);
		SI = new SpriteGroup(this, 1);
		append(SI, super.viewScale, 0.0F, 0, 401, 146, 20, temp_bitmap);
		AI = new SpriteGroup(this, 1);
		append(AI, super.viewScale, 0.0F, 0, 401, 89, 47, temp_bitmap);
		EI = new SpriteGroup(this, 1);
		append(EI, super.viewScale, 0.0F, 0, 341, 81, 53, temp_bitmap);
		GI = new SpriteGroup(this, 1);
		append(GI, super.viewScale, 0.0F, 0, 299, 85, 45, temp_bitmap);
		
		super.labelLoading = "Loading And Preparing Resources";
		super.loadProgress = ++current_loading_progress;

		repaint();
		HI = new SpriteGroup(this, 64, 1);
		HI.I(super.viewScale, 0, 13, 10, 251, 8, 2, 0, temp_bitmap, 64, 0, 64, super.applicationCanvas);
		temp_bitmap.myData = null;
		temp_bitmap = null;
		System.gc();

		obj = current_loading_progress += 3;
		super.labelLoading = "Loading And Preparing Resources";
		super.loadProgress = ((int) (obj));

		repaint();
		if ((temp_bitmap = LoadSprite("images/ships2.gif")) == null)
		{
			return false;
		}

		obj = current_loading_progress++;
		super.labelLoading = "Loading And Preparing Resources";
		super.loadProgress = ++current_loading_progress;

		repaint();
		U = new SpriteGroup(this, 32, 1);
		arraycopy(U, super.viewScale, 3, 7, 60, 32, temp_bitmap, 32, 0, 32);
		
		super.labelLoading = "Loading And Preparing Resources";
		super.loadProgress = ++current_loading_progress;

		repaint();
		V = new SpriteGroup(this, 32, 1);
		arraycopy(V, super.viewScale, 3, 16, 98, 33, temp_bitmap, 32, 0, 32);
		
		super.labelLoading = "Loading And Preparing Resources";
		super.loadProgress = ++current_loading_progress;

		repaint();
		W = new SpriteGroup(this, 32, 1);
		arraycopy(W, super.viewScale, 3, 11, 136, 37, temp_bitmap, 32, 0, 32);

		super.labelLoading = "Loading And Preparing Resources";
		super.loadProgress = ++current_loading_progress;

		repaint();
		super.labelLoading = "Loading And Preparing Resources";
		super.loadProgress = ++current_loading_progress;

		repaint();
		X = new SpriteGroup(this, 32, 1);
		arraycopy(X, super.viewScale, 3, 10, 178, 38, temp_bitmap, 32, 0, 32);
		
		super.labelLoading = "Loading And Preparing Resources";
		super.loadProgress = ++current_loading_progress;

		repaint();
		Y = new SpriteGroup(this, 64, 1);
		arraycopy(Y, super.viewScale, 3, 53, 54, 41, temp_bitmap, 64, 0, 64);
		
		super.labelLoading = "Loading And Preparing Resources";
		super.loadProgress = ++current_loading_progress;

		repaint();
		i = new SpriteGroup(this, 32, 1);
		arraycopy(i, super.viewScale, 3, 55, 105, 46, temp_bitmap, 32, 0, 32);
		
		super.labelLoading = "Loading And Preparing Resources";
		super.loadProgress = ++current_loading_progress;

		repaint();
		super.labelLoading = "Loading And Preparing Resources";
		super.loadProgress = ++current_loading_progress;

		repaint();
		z = new SpriteGroup(this, 32, 1);
		arraycopy(z, super.viewScale, 3, 57, 151, 50, temp_bitmap, 32, 0, 32);
		
		super.labelLoading = "Loading And Preparing Resources";
		super.loadProgress = ++current_loading_progress;

		repaint();
		c = new SpriteGroup(this, 32, 1);
		arraycopy(c, super.viewScale, 3, 108, 47, 106, temp_bitmap, 32, 0, 32);

		super.labelLoading = "Loading And Preparing Resources";
		super.loadProgress = ++current_loading_progress;

		repaint();
		super.labelLoading = "Loading And Preparing Resources";
		super.loadProgress = ++current_loading_progress;

		repaint();
		b = new SpriteGroup(this, 32, 1);
		arraycopy(b, super.viewScale, 3, 111, 159, 66, temp_bitmap, 32, 0, 32);
		
		super.labelLoading = "Loading And Preparing Resources";
		super.loadProgress = ++current_loading_progress;

		repaint();
		d = new SpriteGroup(this, 32, 1);
		arraycopy(d, super.viewScale, 3, 233, 6, 88, temp_bitmap, 32, 0, 32);
		
		super.labelLoading = "Loading And Preparing Resources";
		super.loadProgress = ++current_loading_progress;

		repaint();
		f = new SpriteGroup(this, 32, 1);
		arraycopy(f, super.viewScale, 3, 228, 117, 104, temp_bitmap, 32, 0, 32);
		
		super.labelLoading = "Loading And Preparing Resources";
		super.loadProgress = ++current_loading_progress;

		repaint();
		j = new SpriteGroup(this, 1);
		append(j, super.viewScale, 0.0F, 0, 322, 5, 108, temp_bitmap);
		s = new SpriteGroup(this, 1);
		append(s, super.viewScale, 0.0F, 0, 400, 126, 25, temp_bitmap);
		a = new SpriteGroup(this, 1);
		append(a, super.viewScale, 0.0F, 0, 426, 126, 25, temp_bitmap);
		e = new SpriteGroup(this, 1);
		append(e, super.viewScale, 0.0F, 0, 400, 161, 17, temp_bitmap);
		g = new SpriteGroup(this, 1);
		append(g, super.viewScale, 0.0F, 0, 430, 160, 17, temp_bitmap);
		
		super.labelLoading = "Loading And Preparing Resources";
		super.loadProgress = ++current_loading_progress;

		repaint();
		h = new SpriteGroup(this, 1);
		append(h, super.viewScale, 0.0F, 0, 460, 2, 282, temp_bitmap);
		
		super.labelLoading = "Loading And Preparing Resources";
		super.loadProgress = ++current_loading_progress;
		repaint();

		F = new SpriteGroup(this, 12);
		append(F, super.viewScale, 0.0F, 0, 5, 227, 23, temp_bitmap);
		append(F, super.viewScale, 0.0F, 0, 36, 227, 23, temp_bitmap);
		append(F, super.viewScale, 0.0F, 0, 66, 227, 23, temp_bitmap);
		append(F, super.viewScale, 0.0F, 0, 97, 227, 23, temp_bitmap);
		append(F, super.viewScale, 0.0F, 0, 127, 227, 23, temp_bitmap);
		append(F, super.viewScale, 0.0F, 0, 157, 227, 23, temp_bitmap);
		append(F, super.viewScale, 0.0F, 0, 187, 227, 23, temp_bitmap);
		append(F, super.viewScale, 0.0F, 0, 217, 227, 23, temp_bitmap);
		append(F, super.viewScale, 0.0F, 0, 247, 227, 23, temp_bitmap);
		append(F, super.viewScale, 0.0F, 0, 277, 227, 23, temp_bitmap);
		append(F, super.viewScale, 0.0F, 0, 307, 227, 23, temp_bitmap);
		append(F, super.viewScale, 0.0F, 0, 337, 227, 23, temp_bitmap);
		
		super.labelLoading = "Loading And Preparing Resources";
		super.loadProgress = ++current_loading_progress;

		repaint();
		HNSM = new SpriteGroup(this, 12);
		append(HNSM, super.viewScale, 0.0F, 0, 6, 256, 27, temp_bitmap);
		append(HNSM, super.viewScale, 0.0F, 0, 37, 256, 27, temp_bitmap);
		append(HNSM, super.viewScale, 0.0F, 0, 67, 256, 27, temp_bitmap);
		append(HNSM, super.viewScale, 0.0F, 0, 97, 256, 27, temp_bitmap);
		append(HNSM, super.viewScale, 0.0F, 0, 127, 256, 27, temp_bitmap);
		append(HNSM, super.viewScale, 0.0F, 0, 157, 256, 27, temp_bitmap);
		append(HNSM, super.viewScale, 0.0F, 0, 186, 256, 27, temp_bitmap);
		append(HNSM, super.viewScale, 0.0F, 0, 216, 256, 27, temp_bitmap);
		append(HNSM, super.viewScale, 0.0F, 0, 247, 256, 27, temp_bitmap);
		append(HNSM, super.viewScale, 0.0F, 0, 276, 256, 27, temp_bitmap);
		append(HNSM, super.viewScale, 0.0F, 0, 306, 256, 27, temp_bitmap);
		append(HNSM, super.viewScale, 0.0F, 0, 336, 256, 27, temp_bitmap);
		
		super.labelLoading = "Loading And Preparing Resources";
		super.loadProgress = ++current_loading_progress;

		repaint();
		abs = new SpriteGroup(this, 64, 1);
		abs.I(super.viewScale, 0, 13, 10, 133, 5, 2, 0, temp_bitmap, 64, 0, 64, super.applicationCanvas);
		KI = new SpriteGroup(this, 64, 1);
		KI.I(super.viewScale, 0, 14, 11, 132, 26, 2, 0, temp_bitmap, 64, 0, 64, super.applicationCanvas);
		temp_bitmap.myData = null;
		temp_bitmap = null;
		System.gc();

		final float f2 = current_loading_progress += 3;
		super.labelLoading = "Loading And Preparing Resources";
		super.loadProgress = (int) f2;

		repaint();
		if ((temp_bitmap = LoadSprite("images/effects4.jpg")) == null)
		{
			return false;
		}
		temp_bitmap.MakeOpaque(0, 20, 0, 20, 0, 20);
		temp_bitmap.ReadAtlas(368, 212, 302, 236, temp_bitmap, 302, 236);
		temp_bitmap.ReadAtlas(183, 158, 298, 443, temp_bitmap, 298, 443);

		jI = new SpriteGroup(this, 2);
		SpriteGroup sprite_group1 = jI;
		final float f3 = super.viewScale;
		Object obj3 = super.applicationCanvas;
		Object temp_object2 = Sprite.I(f3, 0.0F, 0, 269, 263, 13, 2, 0, 0, temp_bitmap, ((Canvas) (obj3)), this);
		sprite_group1.I(0, ((Sprite) (temp_object2)));

		sprite_group1 = jI;
		temp_object2 = super.viewScale * 0.6F;
		obj3 = super.applicationCanvas;
		temp_object2 = Sprite.I(((float) (temp_object2)), 0.0F, 0, 269, 263, 13, 2, 0, 0, temp_bitmap, ((Canvas) (obj3)), this);
		sprite_group1.I(0, ((Sprite) (temp_object2)));

		sI = new SpriteGroup(this, 2);
		sprite_group1 = sI;
		temp_object2 = super.viewScale;
		obj3 = super.applicationCanvas;
		temp_object2 = Sprite.I(((float) (temp_object2)), 0.0F, 0, 226, 226, 320, 7, 0, 0, temp_bitmap, ((Canvas) (obj3)), this);
		sprite_group1.I(0, ((Sprite) (temp_object2)));

		sprite_group1 = sI;
		temp_object2 = super.viewScale * 0.6F;
		obj3 = super.applicationCanvas;
		temp_object2 = Sprite.I(((float) (temp_object2)), 0.0F, 0, 226, 226, 320, 7, 0, 0, temp_bitmap, ((Canvas) (obj3)), this);
		sprite_group1.I(0, ((Sprite) (temp_object2)));

		mI = new SpriteGroup(this, 2);
		sprite_group1 = mI;
		temp_object2 = super.viewScale;
		obj3 = super.applicationCanvas;
		temp_object2 = Sprite.I(((float) (temp_object2)), 0.0F, 0, 280, 279, 16, 271, 0, 0, temp_bitmap, ((Canvas) (obj3)), this);
		sprite_group1.I(0, ((Sprite) (temp_object2)));

		sprite_group1 = mI;
		temp_object2 = super.viewScale * 0.6F;
		obj3 = super.applicationCanvas;
		temp_object2 = Sprite.I(((float) (temp_object2)), 0.0F, 0, 280, 279, 16, 271, 0, 0, temp_bitmap, ((Canvas) (obj3)), this);
		sprite_group1.I(0, ((Sprite) (temp_object2)));

		vI = new SpriteGroup(this, 1);
		sprite_group1 = vI;
		temp_object2 = super.viewScale;
		obj3 = super.applicationCanvas;
		temp_object2 = Sprite.I(((float) (temp_object2)), 0.0F, 0, 176, 208, 480, 240, 0, 0, temp_bitmap, ((Canvas) (obj3)), this);
		sprite_group1.I(0, ((Sprite) (temp_object2)));

		wI = new SpriteGroup(this, 1);
		sprite_group1 = wI;
		temp_object2 = super.viewScale;
		obj3 = super.applicationCanvas;
		temp_object2 = Sprite.I(((float) (temp_object2)), 0.0F, 0, 156, 200, 305, 239, 0, 0, temp_bitmap, ((Canvas) (obj3)), this);
		sprite_group1.I(0, ((Sprite) (temp_object2)));

		xI = new SpriteGroup(this, 1);
		sprite_group1 = xI;
		temp_object2 = super.viewScale;
		obj3 = super.applicationCanvas;
		temp_object2 = Sprite.I(((float) (temp_object2)), 0.0F, 0, 183, 158, 298, 443, 0, 0, temp_bitmap, ((Canvas) (obj3)), this);
		sprite_group1.I(0, ((Sprite) (temp_object2)));

		gI = new SpriteGroup(this, 1, 1);
		sprite_group1 = gI;
		temp_object2 = super.viewScale;
		obj3 = super.applicationCanvas;
		temp_object2 = Sprite.I(((float) (temp_object2)), 0.0F, 0, 233, 201, 434, 596, 0, 0, temp_bitmap, ((Canvas) (obj3)), this);
		sprite_group1.I(0, ((Sprite) (temp_object2)));

		hI = new SpriteGroup(this, 16, 1);
		hI.I(super.viewScale, 0, 36, 30, 35, 691, 0, 0, temp_bitmap, 16, 0, 16, super.applicationCanvas);
		kI = new SpriteGroup(this, 1, 1);
		sprite_group1 = kI;
		temp_object2 = super.viewScale;
		obj3 = super.applicationCanvas;
		temp_object2 = Sprite.I(((float) (temp_object2)), 0.0F, 0, 65, 49, 30, 742, 0, 0, temp_bitmap, ((Canvas) (obj3)), this);
		sprite_group1.I(0, ((Sprite) (temp_object2)));

		lI = new SpriteGroup(this, 1, 1);
		sprite_group1 = lI;
		temp_object2 = super.viewScale;
		obj3 = super.applicationCanvas;
		temp_object2 = Sprite.I(((float) (temp_object2)), 5.969026F, 0, 119, 108, 114, 685, 0, 0, temp_bitmap, ((Canvas) (obj3)),
				this);
		sprite_group1.I(0, ((Sprite) (temp_object2)));

		yI = new SpriteGroup(this, 2);
		sprite_group1 = yI;
		temp_object2 = super.viewScale;
		obj3 = super.applicationCanvas;
		temp_object2 = Sprite.I(((float) (temp_object2)), 0.0F, 0, 124, 124, 37, 557, 0, 0, temp_bitmap, ((Canvas) (obj3)), this);
		sprite_group1.I(0, ((Sprite) (temp_object2)));

		sprite_group1 = yI;
		temp_object2 = super.viewScale * 0.55F;
		obj3 = super.applicationCanvas;
		temp_object2 = Sprite.I(((float) (temp_object2)), 0.0F, 0, 124, 124, 37, 557, 0, 0, temp_bitmap, ((Canvas) (obj3)), this);
		sprite_group1.I(0, ((Sprite) (temp_object2)));

		IZ = new SpriteGroup(this, 2);
		sprite_group1 = IZ;
		temp_object2 = super.viewScale;
		obj3 = super.applicationCanvas;
		temp_object2 = Sprite.I(((float) (temp_object2)), 0.0F, 0, 124, 124, 177, 557, 0, 0, temp_bitmap, ((Canvas) (obj3)), this);
		sprite_group1.I(0, ((Sprite) (temp_object2)));

		sprite_group1 = IZ;
		temp_object2 = super.viewScale * 0.6F;
		obj3 = super.applicationCanvas;
		temp_object2 = Sprite.I(((float) (temp_object2)), 0.0F, 0, 124, 124, 177, 557, 0, 0, temp_bitmap, ((Canvas) (obj3)), this);
		sprite_group1.I(0, ((Sprite) (temp_object2)));

		temp_bitmap.myData = null;
		temp_bitmap = null;
		System.gc();

		factor = current_loading_progress += 3;
		super.labelLoading = "Loading And Preparing Resources";
		super.loadProgress = (int) factor;

		repaint();
		if ((temp_bitmap = LoadSprite("images/effects3.jpg")) == null)
		{
			return false;
		}
		temp_bitmap.MakeOpaque(0, 20, 0, 20, 0, 20);
		temp_bitmap.ReadAtlas(114, 120, 17, 263, temp_bitmap, 17, 402);

		nI = new SpriteGroup(this, 1);
		sprite_group1 = nI;
		temp_object2 = super.viewScale;
		obj3 = super.applicationCanvas;
		temp_object2 = Sprite.I(((float) (temp_object2)), 0.0F, 0, 123, 121, 10, 8, 0, 0, temp_bitmap, ((Canvas) (obj3)), this);
		sprite_group1.I(0, ((Sprite) (temp_object2)));
		tI = new SpriteGroup(this, 2);
		sprite_group1 = tI;
		temp_object2 = super.viewScale;
		obj3 = super.applicationCanvas;
		temp_object2 = Sprite.I(((float) (temp_object2)), 0.0F, 0, 65, 65, 7, 157, 0, 0, temp_bitmap, ((Canvas) (obj3)), this);
		sprite_group1.I(0, ((Sprite) (temp_object2)));
		sprite_group1 = tI;
		temp_object2 = super.viewScale * 0.6F;
		obj3 = super.applicationCanvas;
		temp_object2 = Sprite.I(((float) (temp_object2)), 0.0F, 0, 65, 65, 7, 157, 0, 0, temp_bitmap, ((Canvas) (obj3)), this);
		sprite_group1.I(0, ((Sprite) (temp_object2)));
		uI = new SpriteGroup(this, 2);
		sprite_group1 = uI;
		temp_object2 = super.viewScale;
		obj3 = super.applicationCanvas;
		temp_object2 = Sprite.I(((float) (temp_object2)), 0.0F, 0, 123, 122, 166, 281, 0, 0, temp_bitmap, ((Canvas) (obj3)), this);
		sprite_group1.I(0, ((Sprite) (temp_object2)));
		sprite_group1 = uI;
		temp_object2 = super.viewScale * 0.5F;
		obj3 = super.applicationCanvas;
		temp_object2 = Sprite.I(((float) (temp_object2)), 0.0F, 0, 123, 122, 166, 281, 0, 0, temp_bitmap, ((Canvas) (obj3)), this);
		sprite_group1.I(0, ((Sprite) (temp_object2)));
		eI = new SpriteGroup(this, 1, 4);
		sprite_group1 = eI;
		temp_object2 = super.viewScale;
		obj3 = super.applicationCanvas;
		temp_object2 = Sprite.I(((float) (temp_object2)), 0.0F, 0, 277, 276, 317, 239, 0, 0, temp_bitmap, ((Canvas) (obj3)), this);
		sprite_group1.I(0, ((Sprite) (temp_object2)));
		sprite_group1 = eI;
		temp_object2 = super.viewScale;
		obj3 = super.applicationCanvas;
		temp_object2 = Sprite.I(((float) (temp_object2)), 0.0F, 0, 270, 270, 385, 520, 0, 0, temp_bitmap, ((Canvas) (obj3)), this);
		sprite_group1.I(0, ((Sprite) (temp_object2)));
		sprite_group1 = eI;
		temp_object2 = super.viewScale * 0.6F;
		obj3 = super.applicationCanvas;
		temp_object2 = Sprite.I(((float) (temp_object2)), 0.0F, 0, 270, 270, 385, 520, 0, 0, temp_bitmap, ((Canvas) (obj3)), this);
		sprite_group1.I(0, ((Sprite) (temp_object2)));
		sprite_group1 = eI;
		temp_object2 = super.viewScale * 0.6F;
		obj3 = super.applicationCanvas;
		temp_object2 = Sprite.I(((float) (temp_object2)), 0.0F, 0, 277, 276, 317, 239, 0, 0, temp_bitmap, ((Canvas) (obj3)), this);
		sprite_group1.I(0, ((Sprite) (temp_object2)));
		pI = new SpriteGroup(this, 1);
		sprite_group1 = pI;
		temp_object2 = super.viewScale;
		obj3 = super.applicationCanvas;
		temp_object2 = Sprite.I(((float) (temp_object2)), 0.0F, 0, 162, 161, 145, 5, 0, 0, temp_bitmap, ((Canvas) (obj3)), this);
		sprite_group1.I(0, ((Sprite) (temp_object2)));
		qI = new SpriteGroup(this, 1);
		sprite_group1 = qI;
		temp_object2 = super.viewScale;
		obj3 = super.applicationCanvas;
		temp_object2 = Sprite.I(((float) (temp_object2)), 0.0F, 0, 89, 88, 86, 169, 0, 0, temp_bitmap, ((Canvas) (obj3)), this);
		sprite_group1.I(0, ((Sprite) (temp_object2)));
		aI = new SpriteGroup(this, 2);
		sprite_group1 = aI;
		temp_object2 = super.viewScale;
		obj3 = super.applicationCanvas;
		temp_object2 = Sprite.I(((float) (temp_object2)), 0.0F, 0, 364, 160, 4, 542, 0, 0, temp_bitmap, ((Canvas) (obj3)), this);
		sprite_group1.I(0, ((Sprite) (temp_object2)));
		sprite_group1 = aI;
		temp_object2 = super.viewScale * 0.6F;
		obj3 = super.applicationCanvas;
		temp_object2 = Sprite.I(((float) (temp_object2)), 0.0F, 0, 364, 160, 4, 542, 0, 0, temp_bitmap, ((Canvas) (obj3)), this);
		sprite_group1.I(0, ((Sprite) (temp_object2)));
		rI = new SpriteGroup(this, 1);
		sprite_group1 = rI;
		temp_object2 = super.viewScale;
		obj3 = super.applicationCanvas;
		temp_object2 = Sprite.I(((float) (temp_object2)), 0.0F, 0, 89, 89, 156, 419, 0, 0, temp_bitmap, ((Canvas) (obj3)), this);
		sprite_group1.I(0, ((Sprite) (temp_object2)));
		oI = new SpriteGroup(this, 2);
		sprite_group1 = oI;
		temp_object2 = super.viewScale;
		obj3 = super.applicationCanvas;
		temp_object2 = Sprite.I(((float) (temp_object2)), 0.0F, 0, 229, 229, 339, 5, 0, 0, temp_bitmap, ((Canvas) (obj3)), this);
		sprite_group1.I(0, ((Sprite) (temp_object2)));
		sprite_group1 = oI;
		temp_object2 = super.viewScale * 0.6F;
		obj3 = super.applicationCanvas;
		temp_object2 = Sprite.I(((float) (temp_object2)), 0.0F, 0, 229, 229, 339, 5, 0, 0, temp_bitmap, ((Canvas) (obj3)), this);
		sprite_group1.I(0, ((Sprite) (temp_object2)));
		brighter = new SpriteGroup(this, 1);
		sprite_group1 = brighter;
		temp_object2 = super.viewScale;
		obj3 = super.applicationCanvas;
		temp_object2 = Sprite.I(((float) (temp_object2)), 0.0F, 0, 114, 119, 17, 263, 0, 0, temp_bitmap, ((Canvas) (obj3)), this);
		sprite_group1.I(0, ((Sprite) (temp_object2)));
		sStarWhite = new SpriteGroup(this, 3);
		append(sStarWhite, super.viewScale * 0.55F, 0.0F, 0, 5, 702, 30, temp_bitmap);
		append(sStarWhite, super.viewScale * 0.55F, 0.0F, 0, 32, 702, 30, temp_bitmap);
		append(sStarWhite, super.viewScale * 0.55F, 0.0F, 0, 58, 702, 30, temp_bitmap);
		sStarRed = new SpriteGroup(this, 3);
		append(sStarRed, super.viewScale * 0.55F, 0.0F, 0, 5, 734, 30, temp_bitmap);
		append(sStarRed, super.viewScale * 0.55F, 0.0F, 0, 32, 734, 30, temp_bitmap);
		append(sStarRed, super.viewScale * 0.55F, 0.0F, 0, 58, 734, 30, temp_bitmap);
		sStarBlue = new SpriteGroup(this, 3);
		append(sStarBlue, super.viewScale * 0.55F, 0.0F, 0, 5, 764, 30, temp_bitmap);
		append(sStarBlue, super.viewScale * 0.55F, 0.0F, 0, 32, 764, 30, temp_bitmap);
		append(sStarBlue, super.viewScale * 0.55F, 0.0F, 0, 58, 764, 30, temp_bitmap);
		// gameimagelist1 = k2++;
		super.labelLoading = "Loading And Preparing Resources";
		super.loadProgress = current_loading_progress - 1;

		repaint();
		sprite_group_ship = new SpriteGroup(this, 52);
		sprite_group1 = sprite_group_ship;
		temp_object2 = super.viewScale * 0.2F;
		obj3 = super.applicationCanvas;
		temp_object2 = Sprite.I(((float) (temp_object2)), 0.0F, 0, 114, 119, 17, 263, 0, 0, temp_bitmap, ((Canvas) (obj3)), this);
		sprite_group1.I(0, ((Sprite) (temp_object2)));
		sprite_group1 = sprite_group_ship;
		temp_object2 = super.viewScale * 0.3F;
		obj3 = super.applicationCanvas;
		temp_object2 = Sprite.I(((float) (temp_object2)), 0.7853982F, 0, 114, 119, 17, 263, 0, 0, temp_bitmap, ((Canvas) (obj3)),
				this);
		sprite_group1.I(0, ((Sprite) (temp_object2)));
		sprite_group1 = sprite_group_ship;
		temp_object2 = super.viewScale * 0.4F;
		obj3 = super.applicationCanvas;
		temp_object2 = Sprite.I(((float) (temp_object2)), 1.570796F, 0, 114, 119, 17, 263, 0, 0, temp_bitmap, ((Canvas) (obj3)),
				this);
		sprite_group1.I(0, ((Sprite) (temp_object2)));
		sprite_group1 = sprite_group_ship;
		temp_object2 = super.viewScale * 0.5F;
		obj3 = super.applicationCanvas;
		temp_object2 = Sprite.I(((float) (temp_object2)), 2.356194F, 0, 114, 119, 17, 263, 0, 0, temp_bitmap, ((Canvas) (obj3)),
				this);
		sprite_group1.I(0, ((Sprite) (temp_object2)));
		sprite_group1 = sprite_group_ship;
		temp_object2 = super.viewScale * 0.6F;
		obj3 = super.applicationCanvas;
		temp_object2 = Sprite.I(((float) (temp_object2)), 3.141593F, 0, 114, 119, 17, 263, 0, 0, temp_bitmap, ((Canvas) (obj3)),
				this);
		sprite_group1.I(0, ((Sprite) (temp_object2)));
		sprite_group1 = sprite_group_ship;
		temp_object2 = super.viewScale * 0.7F;
		obj3 = super.applicationCanvas;
		temp_object2 = Sprite.I(((float) (temp_object2)), 3.926991F, 0, 114, 119, 17, 263, 0, 0, temp_bitmap, ((Canvas) (obj3)),
				this);
		sprite_group1.I(0, ((Sprite) (temp_object2)));
		sprite_group1 = sprite_group_ship;
		temp_object2 = super.viewScale * 0.8F;
		obj3 = super.applicationCanvas;
		temp_object2 = Sprite.I(((float) (temp_object2)), 4.712389F, 0, 114, 119, 17, 263, 0, 0, temp_bitmap, ((Canvas) (obj3)),
				this);
		sprite_group1.I(0, ((Sprite) (temp_object2)));
		sprite_group1 = sprite_group_ship;
		temp_object2 = super.viewScale * 0.9F;
		obj3 = super.applicationCanvas;
		temp_object2 = Sprite.I(((float) (temp_object2)), 5.497787F, 0, 114, 119, 17, 263, 0, 0, temp_bitmap, ((Canvas) (obj3)),
				this);
		sprite_group1.I(0, ((Sprite) (temp_object2)));
		factor = super.viewScale;
		temp_object2 = super.applicationCanvas;
		obj = Sprite.I(factor, 0.0F, 0, 114, 119, 17, 263, 0, 0, temp_bitmap, ((Canvas) (temp_object2)), this);
		factor = super.viewScale;
		temp_object2 = super.applicationCanvas;
		final Sprite sprite1 = Sprite.I(factor, 0.5215044F, 0, 114, 119, 17, 263, 0, 0, temp_bitmap, ((Canvas) (temp_object2)),
				this);
		factor = super.viewScale;
		temp_object2 = super.applicationCanvas;
		obj1 = Sprite.I(factor, 1.04615F, 0, 114, 119, 17, 263, 0, 0, temp_bitmap, ((Canvas) (temp_object2)), this);
		factor = super.viewScale;
		temp_object2 = super.applicationCanvas;
		final Sprite sprite10 = Sprite.I(factor, 1.570796F, 0, 114, 119, 17, 263, 0, 0, temp_bitmap, ((Canvas) (temp_object2)),
				this);
		factor = super.viewScale;
		temp_object2 = super.applicationCanvas;
		final Sprite sprite13 = Sprite.I(factor, 2.095442F, 0, 114, 119, 17, 263, 0, 0, temp_bitmap, ((Canvas) (temp_object2)),
				this);
		factor = super.viewScale;
		temp_object2 = super.applicationCanvas;
		final Sprite sprite14 = Sprite.I(factor, 2.616947F, 0, 114, 119, 17, 263, 0, 0, temp_bitmap, ((Canvas) (temp_object2)),
				this);
		factor = super.viewScale;
		temp_object2 = super.applicationCanvas;
		final Sprite sprite15 = Sprite.I(factor, 3.141593F, 0, 114, 119, 17, 263, 0, 0, temp_bitmap, ((Canvas) (temp_object2)),
				this);
		factor = super.viewScale;
		temp_object2 = super.applicationCanvas;
		final Sprite sprite16 = Sprite.I(factor, 3.506017F, 0, 114, 119, 17, 263, 0, 0, temp_bitmap, ((Canvas) (temp_object2)),
				this);
		factor = super.viewScale;
		temp_object2 = super.applicationCanvas;
		final Sprite sprite17 = Sprite.I(factor, 4.187743F, 0, 114, 119, 17, 263, 0, 0, temp_bitmap, ((Canvas) (temp_object2)),
				this);
		factor = super.viewScale;
		temp_object2 = super.applicationCanvas;
		final Sprite sprite18 = Sprite.I(factor, 4.712389F, 0, 114, 119, 17, 263, 0, 0, temp_bitmap, ((Canvas) (temp_object2)),
				this);
		factor = super.viewScale;
		temp_object2 = super.applicationCanvas;
		final Sprite sprite19 = Sprite.I(factor, 5.237035F, 0, 114, 119, 17, 263, 0, 0, temp_bitmap, ((Canvas) (temp_object2)),
				this);
		factor = super.viewScale;
		temp_object2 = super.applicationCanvas;
		final Sprite sprite20 = Sprite.I(factor, 5.758539F, 0, 114, 119, 17, 263, 0, 0, temp_bitmap, ((Canvas) (temp_object2)),
				this);
		for (int j1 = 0; j1 < 3; j1++) {
			sprite_group1 = sprite_group_ship;
			sprite_group1.I(0, ((Sprite) (obj)));
			sprite_group1 = sprite_group_ship;
			sprite_group1.I(0, sprite1);
			sprite_group1 = sprite_group_ship;
			sprite_group1.I(0, ((Sprite) (obj1)));
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
		temp_object2 = super.viewScale * 0.9F;
		obj3 = super.applicationCanvas;
		temp_object2 = Sprite.I(((float) (temp_object2)), 0.7853982F, 0, 114, 119, 17, 263, 0, 0, temp_bitmap, ((Canvas) (obj3)),
				this);
		sprite_group1.I(0, ((Sprite) (temp_object2)));
		sprite_group1 = sprite_group_ship;
		temp_object2 = super.viewScale * 0.8F;
		obj3 = super.applicationCanvas;
		temp_object2 = Sprite.I(((float) (temp_object2)), 0.7853982F, 0, 114, 119, 17, 263, 0, 0, temp_bitmap, ((Canvas) (obj3)),
				this);
		sprite_group1.I(0, ((Sprite) (temp_object2)));
		sprite_group1 = sprite_group_ship;
		temp_object2 = super.viewScale * 0.7F;
		obj3 = super.applicationCanvas;
		temp_object2 = Sprite.I(((float) (temp_object2)), 1.570796F, 0, 114, 119, 17, 263, 0, 0, temp_bitmap, ((Canvas) (obj3)),
				this);
		sprite_group1.I(0, ((Sprite) (temp_object2)));
		sprite_group1 = sprite_group_ship;
		temp_object2 = super.viewScale * 0.6F;
		obj3 = super.applicationCanvas;
		temp_object2 = Sprite.I(((float) (temp_object2)), 2.356194F, 0, 114, 119, 17, 263, 0, 0, temp_bitmap, ((Canvas) (obj3)),
				this);
		sprite_group1.I(0, ((Sprite) (temp_object2)));
		sprite_group1 = sprite_group_ship;
		temp_object2 = super.viewScale * 0.5F;
		obj3 = super.applicationCanvas;
		temp_object2 = Sprite.I(((float) (temp_object2)), 3.141593F, 0, 114, 119, 17, 263, 0, 0, temp_bitmap, ((Canvas) (obj3)),
				this);
		sprite_group1.I(0, ((Sprite) (temp_object2)));
		sprite_group1 = sprite_group_ship;
		temp_object2 = super.viewScale * 0.4F;
		obj3 = super.applicationCanvas;
		temp_object2 = Sprite.I(((float) (temp_object2)), 3.926991F, 0, 114, 119, 17, 263, 0, 0, temp_bitmap, ((Canvas) (obj3)),
				this);
		sprite_group1.I(0, ((Sprite) (temp_object2)));
		sprite_group1 = sprite_group_ship;
		temp_object2 = super.viewScale * 0.3F;
		obj3 = super.applicationCanvas;
		temp_object2 = Sprite.I(((float) (temp_object2)), 4.712389F, 0, 114, 119, 17, 263, 0, 0, temp_bitmap, ((Canvas) (obj3)),
				this);
		sprite_group1.I(0, ((Sprite) (temp_object2)));
		sprite_group1 = sprite_group_ship;
		temp_object2 = super.viewScale * 0.2F;
		obj3 = super.applicationCanvas;
		temp_object2 = Sprite.I(((float) (temp_object2)), 5.497787F, 0, 114, 119, 17, 263, 0, 0, temp_bitmap, ((Canvas) (obj3)),
				this);
		sprite_group1.I(0, ((Sprite) (temp_object2)));
		temp_bitmap.myData = null;
		temp_bitmap = null;
		System.gc();
		final Palette agamecolorlist[] = { charAt, cos, darkGray };
		gameStarfield = new oStarfield(this, 150, 3, agamecolorlist);
		temp_object2 = current_loading_progress += 3;
		super.labelLoading = "Loading And Preparing Resources";
		super.loadProgress = ((int) (temp_object2));

		repaint();
		if ((temp_bitmap = LoadSprite("images/kaboom2.gif")) == null)
			return false;
		temp_bitmap.ReadAtlas(580, 54, 6, 111, temp_bitmap, 6, 111);
		temp_bitmap.ReadAtlas(120, 20, 340, 6, temp_bitmap, 340, 26);
		temp_bitmap.ReadAtlas(204, 20, 594, 125, temp_bitmap, 594, 145);
		temp_bitmap.ReadAtlas(160, 19, 339, 55, temp_bitmap, 339, 74);
		temp_bitmap.ReadAtlas(400, 40, 3, 387, temp_bitmap, 3, 427);
		temp_bitmap.ReadAtlas(907, 79, 5, 174, temp_bitmap, 5, 174);
		temp_bitmap.ReadAtlas(904, 106, 5, 265, temp_bitmap, 5, 265);
		
		super.labelLoading = "Loading And Preparing Resources";
		super.loadProgress = ++current_loading_progress;

		repaint();
		black = new SpriteGroup(this, 1);
		temp_object2 = black;
		float temp_float4 = super.viewScale;

		Canvas temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 0, 114, 36, 4, 4, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		I = new SpriteGroup(this, 6);
		temp_object2 = I;
		temp_float4 = super.viewScale * 0.12F;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 0, 115, 107, 509, 6, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		temp_object2 = I;
		temp_float4 = super.viewScale * 0.14F;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 0, 115, 107, 509, 6, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		temp_object2 = I;
		temp_float4 = super.viewScale * 0.17F;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 0, 115, 107, 509, 6, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		temp_object2 = I;
		temp_float4 = super.viewScale * 0.21F;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 0, 115, 107, 509, 6, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		temp_object2 = I;
		temp_float4 = super.viewScale * 0.26F;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 0, 115, 107, 509, 6, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		temp_object2 = I;
		temp_float4 = super.viewScale * 0.32F;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 0, 115, 107, 509, 6, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		Z = new SpriteGroup(this, 6);
		temp_object2 = Z;
		temp_float4 = super.viewScale * 0.12F;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 0, 78, 77, 633, 21, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		temp_object2 = Z;
		temp_float4 = super.viewScale * 0.14F;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 0, 78, 77, 633, 21, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		temp_object2 = Z;
		temp_float4 = super.viewScale * 0.17F;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 0, 78, 77, 633, 21, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		temp_object2 = Z;
		temp_float4 = super.viewScale * 0.21F;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 0, 78, 77, 633, 21, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		temp_object2 = Z;
		temp_float4 = super.viewScale * 0.26F;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 0, 78, 77, 633, 21, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		temp_object2 = Z;
		temp_float4 = super.viewScale * 0.32F;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 0, 78, 77, 633, 21, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		C = new SpriteGroup(this, 10);
		temp_object2 = C;
		temp_float4 = super.viewScale * 2.0F;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 0, 42, 42, 9, 118, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		temp_object2 = C;
		temp_float4 = super.viewScale * 2.0F;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 0, 54, 51, 58, 112, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		temp_object2 = C;
		temp_float4 = super.viewScale * 2.0F;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 0, 57, 53, 114, 112, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		temp_object2 = C;
		temp_float4 = super.viewScale * 2.0F;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 0, 58, 54, 174, 111, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		temp_object2 = C;
		temp_float4 = super.viewScale * 2.0F;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 0, 58, 55, 238, 112, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		temp_object2 = C;
		temp_float4 = super.viewScale * 2.0F;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 0, 55, 51, 299, 112, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		temp_object2 = C;
		temp_float4 = super.viewScale * 2.0F;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 0, 54, 51, 360, 112, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		temp_object2 = C;
		temp_float4 = super.viewScale * 2.0F;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 0, 57, 51, 414, 112, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		temp_object2 = C;
		temp_float4 = super.viewScale * 2.0F;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 0, 52, 48, 472, 112, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		temp_object2 = C;
		temp_float4 = super.viewScale * 2.0F;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 0, 48, 46, 536, 114, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		temp_object2 = current_loading_progress++;
		super.labelLoading = "Loading And Preparing Resources";
		super.loadProgress = ((int) (temp_object2));

		repaint();
		B = new SpriteGroup(this, 14);
		append(B, super.viewScale * 1.4F, 0.0F, 0, 23, 174, 79, temp_bitmap);
		append(B, super.viewScale * 1.4F, 0.0F, 0, 73, 174, 79, temp_bitmap);
		append(B, super.viewScale * 1.4F, 0.0F, 0, 138, 174, 79, temp_bitmap);
		append(B, super.viewScale * 1.4F, 0.0F, 0, 200, 174, 79, temp_bitmap);
		append(B, super.viewScale * 1.4F, 0.0F, 0, 263, 174, 79, temp_bitmap);
		append(B, super.viewScale * 1.4F, 0.0F, 0, 330, 174, 79, temp_bitmap);
		append(B, super.viewScale * 1.4F, 0.0F, 0, 395, 174, 79, temp_bitmap);
		append(B, super.viewScale * 1.4F, 0.0F, 0, 461, 174, 79, temp_bitmap);
		append(B, super.viewScale * 1.4F, 0.0F, 0, 525, 174, 79, temp_bitmap);
		append(B, super.viewScale * 1.4F, 0.0F, 0, 590, 174, 79, temp_bitmap);
		append(B, super.viewScale * 1.4F, 0.0F, 0, 656, 174, 79, temp_bitmap);
		append(B, super.viewScale * 1.4F, 0.0F, 0, 721, 174, 79, temp_bitmap);
		append(B, super.viewScale * 1.4F, 0.0F, 0, 786, 174, 79, temp_bitmap);
		append(B, super.viewScale * 1.4F, 0.0F, 0, 852, 174, 79, temp_bitmap);
		D = new SpriteGroup(this, 8);
		append(D, super.viewScale * 1.2F, 0.0F, 0, 29, 265, 106, temp_bitmap);
		append(D, super.viewScale * 1.2F, 0.0F, 0, 130, 265, 106, temp_bitmap);
		append(D, super.viewScale * 1.2F, 0.0F, 0, 240, 265, 106, temp_bitmap);
		append(D, super.viewScale * 1.2F, 0.0F, 0, 354, 265, 106, temp_bitmap);
		append(D, super.viewScale * 1.2F, 0.0F, 0, 467, 265, 106, temp_bitmap);
		append(D, super.viewScale * 1.2F, 0.0F, 0, 584, 265, 106, temp_bitmap);
		append(D, super.viewScale * 1.2F, 0.0F, 0, 711, 265, 106, temp_bitmap);
		append(D, super.viewScale * 1.2F, 0.0F, 0, 873, 265, 106, temp_bitmap);
		temp_object2 = current_loading_progress++;
		super.labelLoading = "Loading And Preparing Resources";
		super.loadProgress = ((int) (temp_object2));

		repaint();
		J = new SpriteGroup(this, 10);
		temp_object2 = J;
		temp_float4 = super.viewScale * 0.65F;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 0, 12, 11, 17, 402, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		temp_object2 = J;
		temp_float4 = super.viewScale * 0.65F;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 0, 17, 19, 55, 397, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		temp_object2 = J;
		temp_float4 = super.viewScale * 0.65F;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 0, 24, 26, 92, 397, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		temp_object2 = J;
		temp_float4 = super.viewScale * 0.65F;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 0, 30, 28, 121, 395, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		temp_object2 = J;
		temp_float4 = super.viewScale * 0.65F;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 0, 35, 34, 168, 393, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		temp_object2 = J;
		temp_float4 = super.viewScale * 0.65F;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 0, 37, 35, 206, 392, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		temp_object2 = J;
		temp_float4 = super.viewScale * 0.65F;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 0, 40, 40, 244, 387, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		temp_object2 = J;
		temp_float4 = super.viewScale * 0.65F;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 0, 40, 40, 284, 387, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		temp_object2 = J;
		temp_float4 = super.viewScale * 0.65F;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 0, 40, 40, 324, 387, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		temp_object2 = J;
		temp_float4 = super.viewScale * 0.65F;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 0, 40, 40, 364, 387, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		temp_object2 = current_loading_progress++;
		super.labelLoading = "Loading And Preparing Resources";
		super.loadProgress = ((int) (temp_object2));

		repaint();
		S = new SpriteGroup(this, 14);
		append(S, super.viewScale * 0.4F, 0.0F, 0, 23, 174, 79, temp_bitmap);
		append(S, super.viewScale * 0.4F, 0.0F, 0, 73, 174, 79, temp_bitmap);
		append(S, super.viewScale * 0.4F, 0.0F, 0, 138, 174, 79, temp_bitmap);
		append(S, super.viewScale * 0.4F, 0.0F, 0, 200, 174, 79, temp_bitmap);
		append(S, super.viewScale * 0.4F, 0.0F, 0, 263, 174, 79, temp_bitmap);
		append(S, super.viewScale * 0.4F, 0.0F, 0, 330, 174, 79, temp_bitmap);
		append(S, super.viewScale * 0.4F, 0.0F, 0, 395, 174, 79, temp_bitmap);
		append(S, super.viewScale * 0.4F, 0.0F, 0, 461, 174, 79, temp_bitmap);
		append(S, super.viewScale * 0.4F, 0.0F, 0, 525, 174, 79, temp_bitmap);
		append(S, super.viewScale * 0.4F, 0.0F, 0, 590, 174, 79, temp_bitmap);
		append(S, super.viewScale * 0.4F, 0.0F, 0, 656, 174, 79, temp_bitmap);
		append(S, super.viewScale * 0.4F, 0.0F, 0, 721, 174, 79, temp_bitmap);
		append(S, super.viewScale * 0.4F, 0.0F, 0, 786, 174, 79, temp_bitmap);
		append(S, super.viewScale * 0.4F, 0.0F, 0, 852, 174, 79, temp_bitmap);
		A = new SpriteGroup(this, 9);
		append(A, super.viewScale * 0.4F, 0.0F, 0, 29, 265, 106, temp_bitmap);
		append(A, super.viewScale * 0.4F, 0.0F, 0, 130, 265, 106, temp_bitmap);
		append(A, super.viewScale * 0.4F, 0.0F, 0, 240, 265, 106, temp_bitmap);
		append(A, super.viewScale * 0.4F, 0.0F, 0, 354, 265, 106, temp_bitmap);
		append(A, super.viewScale * 0.4F, 0.0F, 0, 467, 265, 106, temp_bitmap);
		append(A, super.viewScale * 0.4F, 0.0F, 0, 584, 265, 106, temp_bitmap);
		append(A, super.viewScale * 0.4F, 0.0F, 0, 711, 265, 106, temp_bitmap);
		E = new SpriteGroup(this, 8);
		append(E, super.viewScale, 0.0F, 0, 342, 55, 19, temp_bitmap);
		append(E, super.viewScale, 0.0F, 0, 361, 55, 19, temp_bitmap);
		append(E, super.viewScale, 0.0F, 0, 381, 55, 19, temp_bitmap);
		append(E, super.viewScale, 0.0F, 0, 401, 55, 19, temp_bitmap);
		append(E, super.viewScale, 0.0F, 0, 421, 55, 19, temp_bitmap);
		append(E, super.viewScale, 0.0F, 0, 442, 55, 19, temp_bitmap);
		append(E, super.viewScale, 0.0F, 0, 463, 55, 19, temp_bitmap);
		append(E, super.viewScale, 0.0F, 0, 483, 55, 19, temp_bitmap);
		temp_object2 = current_loading_progress++;
		super.labelLoading = "Loading And Preparing Resources";
		super.loadProgress = ((int) (temp_object2));

		repaint();
		Q = new SpriteGroup(this, 10);
		temp_object2 = Q;
		temp_float4 = super.viewScale * 0.6F;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 0, 8, 9, 600, 131, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		temp_object2 = Q;
		temp_float4 = super.viewScale * 0.6F;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 0, 13, 14, 617, 128, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		temp_object2 = Q;
		temp_float4 = super.viewScale * 0.6F;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 0, 14, 14, 637, 128, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		temp_object2 = Q;
		temp_float4 = super.viewScale * 0.6F;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 0, 20, 20, 654, 125, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		temp_object2 = Q;
		temp_float4 = super.viewScale * 0.6F;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 0, 20, 20, 674, 125, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		temp_object2 = Q;
		temp_float4 = super.viewScale * 0.6F;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 0, 20, 20, 694, 125, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		temp_object2 = Q;
		temp_float4 = super.viewScale * 0.6F;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 0, 19, 20, 715, 125, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		temp_object2 = Q;
		temp_float4 = super.viewScale * 0.6F;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 0, 19, 20, 735, 125, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		temp_object2 = Q;
		temp_float4 = super.viewScale * 0.6F;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 0, 19, 20, 755, 125, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		temp_object2 = Q;
		temp_float4 = super.viewScale * 0.6F;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 0, 20, 19, 774, 125, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		R = new SpriteGroup(this, 10);
		temp_object2 = R;
		temp_float4 = super.viewScale * 0.8F;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 0, 8, 9, 600, 131, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		temp_object2 = R;
		temp_float4 = super.viewScale * 0.8F;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 0, 13, 14, 617, 128, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		temp_object2 = R;
		temp_float4 = super.viewScale * 0.8F;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 0, 14, 14, 637, 128, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		temp_object2 = R;
		temp_float4 = super.viewScale * 0.8F;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 0, 20, 20, 654, 125, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		temp_object2 = R;
		temp_float4 = super.viewScale * 0.8F;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 0, 20, 20, 674, 125, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		temp_object2 = R;
		temp_float4 = super.viewScale * 0.8F;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 0, 20, 20, 694, 125, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		temp_object2 = R;
		temp_float4 = super.viewScale * 0.8F;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 0, 19, 20, 715, 125, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		temp_object2 = R;
		temp_float4 = super.viewScale * 0.8F;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 0, 19, 20, 735, 125, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		temp_object2 = R;
		temp_float4 = super.viewScale * 0.8F;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 0, 19, 20, 755, 125, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		temp_object2 = R;
		temp_float4 = super.viewScale * 0.8F;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 0, 20, 19, 774, 125, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		T = new SpriteGroup(this, 10);
		temp_object2 = T;
		temp_float4 = super.viewScale;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 0, 8, 9, 600, 131, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		temp_object2 = T;
		temp_float4 = super.viewScale;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 0, 13, 14, 617, 128, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		temp_object2 = T;
		temp_float4 = super.viewScale;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 0, 14, 14, 637, 128, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		temp_object2 = T;
		temp_float4 = super.viewScale;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 0, 20, 20, 654, 125, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		temp_object2 = T;
		temp_float4 = super.viewScale;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 0, 20, 20, 674, 125, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		temp_object2 = T;
		temp_float4 = super.viewScale;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 0, 20, 20, 694, 125, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		temp_object2 = T;
		temp_float4 = super.viewScale;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 0, 19, 20, 715, 125, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		temp_object2 = T;
		temp_float4 = super.viewScale;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 0, 19, 20, 735, 125, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		temp_object2 = T;
		temp_float4 = super.viewScale;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 0, 19, 20, 755, 125, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		temp_object2 = T;
		temp_float4 = super.viewScale;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 0, 20, 19, 774, 125, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		temp_bitmap.myData = null;
		temp_bitmap = null;
		System.gc();
		temp_object2 = current_loading_progress += 3;
		super.labelLoading = "Loading And Preparing Resources";
		super.loadProgress = ((int) (temp_object2));

		repaint();
		if ((temp_bitmap = LoadSprite("images/weapons.gif")) == null)
			return false;
		temp_bitmap.ReadAtlas(120, 20, 78, 62, temp_bitmap, 78, 82);
		temp_bitmap.ReadAtlas(32, 16, 147, 109, temp_bitmap, 147, 125);
		temp_bitmap.ReadAtlas(48, 26, 147, 165, temp_bitmap, 147, 165);
		temp_object2 = current_loading_progress++;
		super.labelLoading = "Loading And Preparing Resources";
		super.loadProgress = ((int) (temp_object2));

		repaint();
		LI = new SpriteGroup(this, 2);
		temp_object2 = LI;
		temp_float4 = super.viewScale;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 1, 20, 20, 148, 168, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		temp_object2 = LI;
		temp_float4 = super.viewScale;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 1, 21, 21, 173, 168, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		temp_object2 = current_loading_progress++;
		super.labelLoading = "Loading And Preparing Resources";
		super.loadProgress = ((int) (temp_object2));

		repaint();
		WI = new SpriteGroup(this, 2);
		temp_object2 = WI;
		temp_float4 = super.viewScale;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 1, 16, 16, 147, 109, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		temp_object2 = WI;
		temp_float4 = super.viewScale;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 1, 16, 16, 163, 109, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		temp_object2 = current_loading_progress++;
		super.labelLoading = "Loading And Preparing Resources";
		super.loadProgress = ((int) (temp_object2));

		repaint();
		OI = new SpriteGroup(this, 1, 16);
		OI.I(0, super.viewScale, 1, 17, 20, 81, 62, 0, 0, temp_bitmap, 16, 0, 16, super.applicationCanvas);
		MI = new SpriteGroup(this, 32, 6);
		MI.J = true;
		for (int k1 = 0; k1 < 32; k1++) {
			temp_object2 = (float) (0.098174770424681035D * k1);
			temp_float4 = super.viewScale;
			temp_canvas = super.applicationCanvas;
			obj = Sprite.I(temp_float4, ((float) (temp_object2)), 1, 14, 9, 147, 149, 0, 0, temp_bitmap, temp_canvas, this);
			temp_float4 = super.viewScale;
			temp_canvas = super.applicationCanvas;
			final Sprite sprite2 = Sprite.I(temp_float4, ((float) (temp_object2)), 1, 16, 10, 163, 149, 0, 0, temp_bitmap, temp_canvas, this);
			temp_float4 = super.viewScale;
			temp_canvas = super.applicationCanvas;
			final Sprite sprite6 = Sprite.I(temp_float4, ((float) (temp_object2)), 1, 23, 12, 182, 148, 0, 0, temp_bitmap, temp_canvas, this);
			temp_float4 = super.viewScale;
			temp_canvas = super.applicationCanvas;
			final Sprite sprite11 = Sprite.I(temp_float4, ((float) (temp_object2)), 1, 16, 11, 209, 149, 0, 0, temp_bitmap, temp_canvas, this);
			MI.I(k1, ((Sprite) (obj)));
			MI.I(k1, sprite2);
			MI.I(k1, sprite6);
			MI.I(k1, sprite11);
			MI.I(k1, sprite6);
			MI.I(k1, sprite2);
		}

		NI = new SpriteGroup(this, 32, 6);
		NI.J = true;

		for (int l1 = 0; l1 < 32; l1++) {
			temp_object2 = (float) (0.098174770424681035D * l1);
			temp_float4 = super.viewScale;
			temp_canvas = super.applicationCanvas;

			obj = Sprite.I(temp_float4, ((float) (temp_object2)), 1, 12, 10, 5, 4, 0, 0, temp_bitmap, temp_canvas, this);
			temp_float4 = super.viewScale;
			temp_canvas = super.applicationCanvas;

			final Sprite sprite3 = Sprite.I(temp_float4, ((float) (temp_object2)), 1, 14, 11, 20, 4, 0, 0, temp_bitmap, temp_canvas, this);
			temp_float4 = super.viewScale;
			temp_canvas = super.applicationCanvas;

			final Sprite sprite7 = Sprite.I(temp_float4, ((float) (temp_object2)), 1, 16, 13, 39, 3, 0, 0, temp_bitmap, temp_canvas, this);
			temp_float4 = super.viewScale;
			temp_canvas = super.applicationCanvas;

			final Sprite sprite12 = Sprite.I(temp_float4, ((float) (temp_object2)), 1, 20, 14, 60, 3, 0, 0, temp_bitmap, temp_canvas, this);

			NI.I(l1, ((Sprite) (obj)));
			NI.I(l1, sprite3);
			NI.I(l1, sprite7);
			NI.I(l1, sprite12);
			NI.I(l1, sprite7);
			NI.I(l1, sprite3);
		}

		UI = new SpriteGroup(this, 32, 3);
		UI.J = true;
		for (int i2 = 0; i2 < 32; i2++)
		{
			temp_object2 = (float) (0.098174770424681035D * i2);
			temp_float4 = super.viewScale;
			temp_canvas = super.applicationCanvas;

			obj = Sprite.I(temp_float4, ((float) (temp_object2)), 1, 30, 19, 168, 1, 0, 0, temp_bitmap, temp_canvas, this);
			temp_float4 = super.viewScale;
			temp_canvas = super.applicationCanvas;

			final Sprite sprite4 = Sprite.I(temp_float4, ((float) (temp_object2)), 1, 30, 16, 168, 21, 0, 0, temp_bitmap, temp_canvas, this);
			temp_float4 = super.viewScale;
			temp_canvas = super.applicationCanvas;

			final Sprite sprite8 = Sprite.I(temp_float4, ((float) (temp_object2)), 1, 30, 20, 168, 40, 0, 0, temp_bitmap, temp_canvas, this);

			UI.I(i2, ((Sprite) (obj)));
			UI.I(i2, sprite4);
			UI.I(i2, sprite8);
		}

		VI = new SpriteGroup(this, 32, 3);
		VI.J = true;

		for (int j2 = 0; j2 < 32; j2++)
		{
			temp_object2 = (float) (0.098174770424681035D * j2);
			temp_float4 = super.viewScale;
			temp_canvas = super.applicationCanvas;

			obj = Sprite.I(temp_float4, ((float) (temp_object2)), 1, 30, 15, 132, 3, 0, 0, temp_bitmap, temp_canvas, this);
			temp_float4 = super.viewScale;
			temp_canvas = super.applicationCanvas;

			final Sprite sprite5 = Sprite.I(temp_float4, ((float) (temp_object2)), 1, 31, 15, 132, 21, 0, 0, temp_bitmap, temp_canvas, this);
			temp_float4 = super.viewScale;
			temp_canvas = super.applicationCanvas;

			final Sprite sprite9 = Sprite.I(temp_float4, ((float) (temp_object2)), 1, 31, 15, 132, 43, 0, 0, temp_bitmap, temp_canvas, this);

			VI.I(j2, ((Sprite) (obj)));
			VI.I(j2, sprite5);
			VI.I(j2, sprite9);
		}

		temp_object2 = current_loading_progress++;
		super.labelLoading = "Loading And Preparing Resources";
		super.loadProgress = ((int) (temp_object2));

		repaint();
		PI = new SpriteGroup(this, 32, 1);
		temp_object2 = PI;
		temp_float4 = super.viewScale;
		temp_canvas = super.applicationCanvas;
		((SpriteGroup) (temp_object2)).I(temp_float4, 1, 21, 9, 5, 51, 0, 0, temp_bitmap, 32, 0, 32, temp_canvas);
		temp_object2 = current_loading_progress++;
		super.labelLoading = "Loading And Preparing Resources";
		super.loadProgress = ((int) (temp_object2));

		repaint();
		QI = new SpriteGroup(this, 32, 1);
		temp_object2 = QI;
		temp_float4 = super.viewScale;
		temp_canvas = super.applicationCanvas;
		((SpriteGroup) (temp_object2)).I(temp_float4, 1, 20, 15, 42, 43, 0, 0, temp_bitmap, 32, 0, 32, temp_canvas);
		temp_object2 = current_loading_progress++;
		super.labelLoading = "Loading And Preparing Resources";
		super.loadProgress = ((int) (temp_object2));

		repaint();
		RI = new SpriteGroup(this, 32, 1);
		temp_object2 = RI;
		temp_float4 = super.viewScale;
		temp_canvas = super.applicationCanvas;
		((SpriteGroup) (temp_object2)).I(temp_float4, 1, 21, 17, 41, 61, 0, 0, temp_bitmap, 32, 0, 32, temp_canvas);
		temp_object2 = current_loading_progress++;
		super.labelLoading = "Loading And Preparing Resources";
		super.loadProgress = ((int) (temp_object2));

		repaint();
		TI = new SpriteGroup(this, 64, 1);
		temp_object2 = TI;
		temp_float4 = super.viewScale;
		temp_canvas = super.applicationCanvas;
		((SpriteGroup) (temp_object2)).I(temp_float4, 1, 28, 16, 5, 20, 0, 0, temp_bitmap, 64, 0, 64, temp_canvas);
		temp_object2 = current_loading_progress++;
		super.labelLoading = "Loading And Preparing Resources";
		super.loadProgress = ((int) (temp_object2));

		repaint();
		XI = new SpriteGroup(this, 32, 1);
		temp_object2 = XI;
		temp_float4 = super.viewScale;
		temp_canvas = super.applicationCanvas;
		((SpriteGroup) (temp_object2)).I(temp_float4, 1, 22, 11, 4, 73, 0, 0, temp_bitmap, 32, 0, 32, temp_canvas);
		temp_object2 = current_loading_progress++;
		super.labelLoading = "Loading And Preparing Resources";
		super.loadProgress = ((int) (temp_object2));

		repaint();
		YI = new SpriteGroup(this, 32, 1);
		temp_object2 = YI;
		temp_float4 = super.viewScale;
		temp_canvas = super.applicationCanvas;
		((SpriteGroup) (temp_object2)).I(temp_float4, 1, 24, 20, 38, 21, 0, 0, temp_bitmap, 32, 0, 32, temp_canvas);
		temp_object2 = current_loading_progress++;
		super.labelLoading = "Loading And Preparing Resources";
		super.loadProgress = ((int) (temp_object2));

		repaint();
		append = new SpriteGroup(this, 32, 1);
		temp_object2 = append;
		temp_float4 = super.viewScale;
		temp_canvas = super.applicationCanvas;
		((SpriteGroup) (temp_object2)).I(temp_float4, 1, 26, 9, 2, 86, 0, 0, temp_bitmap, 32, 0, 32, temp_canvas);
		temp_object2 = current_loading_progress++;
		super.labelLoading = "Loading And Preparing Resources";
		super.loadProgress = ((int) (temp_object2));

		repaint();
		iI = new SpriteGroup(this, 8);
		temp_object2 = super.viewScale;

		final Canvas temp_surf = super.applicationCanvas;
		obj = Sprite.I(((float) (temp_object2)), 0.0F, 1, 22, 25, 5, 222, 0, 0, temp_bitmap, temp_surf, this);
		
		temp_object2 = iI;
		((SpriteGroup) (temp_object2)).I(0, ((Sprite) (obj)));
		temp_object2 = iI;
		((SpriteGroup) (temp_object2)).I(0, ((Sprite) (obj)));
		temp_object2 = iI;
		((SpriteGroup) (temp_object2)).I(0, ((Sprite) (obj)));
		temp_object2 = iI;
		((SpriteGroup) (temp_object2)).I(0, ((Sprite) (obj)));
		temp_object2 = iI;
		((SpriteGroup) (temp_object2)).I(0, ((Sprite) (obj)));
		temp_object2 = iI;
		
		temp_float4 = super.viewScale;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 1, 22, 25, 29, 222, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);

		temp_object2 = iI;
		temp_float4 = super.viewScale;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 1, 22, 25, 54, 222, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);

		temp_object2 = iI;
		temp_float4 = super.viewScale;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 1, 22, 25, 76, 222, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);

		zI = new SpriteGroup(this, 2);
		temp_object2 = zI;
		temp_float4 = super.viewScale;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 1, 39, 24, 5, 193, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);

		temp_object2 = zI;
		temp_float4 = super.viewScale;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 1, 39, 24, 47, 193, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);

		cI = new SpriteGroup(this, 3);
		temp_object2 = cI;
		temp_float4 = super.viewScale;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 1, 40, 24, 5, 165, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);

		temp_object2 = cI;
		temp_float4 = super.viewScale;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 1, 40, 24, 47, 165, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);

		temp_object2 = cI;
		temp_float4 = super.viewScale;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 1, 40, 24, 89, 165, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);

		bI = new SpriteGroup(this, 1);
		temp_object2 = bI;
		temp_float4 = super.viewScale;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 1, 37, 28, 5, 251, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);

		dI = new SpriteGroup(this, 1);
		temp_object2 = dI;
		temp_float4 = super.viewScale;
		temp_canvas = super.applicationCanvas;
		Sprite.I(temp_float4, 0.0F, 1, 37, 24, 47, 254, 0, 0, temp_bitmap, temp_canvas, this);
		((SpriteGroup) (temp_object2)).GetSprite(0, (int) temp_float4);
		temp_object2 = current_loading_progress++;

		labelLoading = "Loading And Preparing Resources";
		loadProgress = (int) (temp_object2);
		repaint();

		final Canvas temp = super.applicationCanvas;
		arraycopy = new SpriteGroup(this, 4, 1);
		arraycopy.I(0, Sprite.I(((float) (temp_object2 = super.viewScale)), 0.0F, 1, 40, 24, 89, 193, 0, 0, temp_bitmap, temp,
				this));
		arraycopy.I(1, Sprite.I(((float) (temp_object2 = super.viewScale)), 0.0F, 1, 40, 24, 134, 193, 0, 0, temp_bitmap,
				temp, this));
		arraycopy.I(2, Sprite.I(((float) (temp_object2 = super.viewScale)), 0.0F, 1, 40, 24, 178, 193, 0, 0, temp_bitmap,
				temp, this));
		arraycopy.I(3, Sprite.I(((float) (temp_object2 = super.viewScale)), 0.0F, 1, 40, 24, 225, 193, 0, 0, temp_bitmap,
				temp, this));
		temp_bitmap.myData = null;
		temp_bitmap = null;

		System.gc();
		isAssetsLoaded = true;

		System.out.println("after load totalMemory=" + String.valueOf(Runtime.getRuntime().totalMemory())
				+ " freeMemory=" + String.valueOf(Runtime.getRuntime().freeMemory()) + " totalRleBytes="
				+ String.valueOf(Sprite.K) + " totalRleParts=" + String.valueOf(Sprite.L));

		return true;
	}

	public final void append(final SpriteGroup sprite_group1, final float f1, final float f2, final int i1, final int j1, final int k1, final int l1, final Bitmap imagepixels1)
	{
		final Rectangle rectangle = imagepixels1.GetRectFromAtlas(j1, k1, l1);
		final int i2 = rectangle.width;
		final int j2 = rectangle.height;
		final int k2 = rectangle.x;
		final int l2 = rectangle.y;
		final Canvas surface1 = super.applicationCanvas;
		final Sprite sprite1 = Sprite.I(f1, f2, i1, i2, j2, k2, l2, 0, 0, imagepixels1, surface1, this);

		sprite_group1.I(0, sprite1);
	}

	public final void arraycopy(final SpriteGroup sprite_group1, final float f1, final int i1, final int j1, final int k1, final int l1, final Bitmap imagepixels1, final int i2, final int j2, final int k2)
	{
		final Rectangle rectangle = imagepixels1.GetRectFromAtlas(j1, k1, l1);
		final float f2 = super.viewScale;
		final int l2 = rectangle.width;
		final int i3 = rectangle.height;
		final int j3 = rectangle.x;
		final int k3 = rectangle.y;
		final Canvas surface1 = super.applicationCanvas;
		sprite_group1.I(f2, i1, l2, i3, j3, k3, 0, 0, imagepixels1, i2, j2, k2, surface1);
	}

	public final void InitializeFont(final Font target_font, final Bitmap font_bitmap, final float scale) 
	{
		CreateFontBy("0123456789", target_font, font_bitmap, scale, 2, 1, 27, 27);
		CreateFontBy("ABCDEFGHIJKLM", target_font, font_bitmap, scale, 1, 30, 24, 24);
		CreateFontBy("NOPQRSTUVWXYZ", target_font, font_bitmap, scale, 2, 58, 24, 24);
		CreateFontBy("abcdefghijklm", target_font, font_bitmap, scale, 2, 86, 31, 26);
		CreateFontBy("nopqrstuvwxyz", target_font, font_bitmap, scale, 2, 120, 31, 24);
		CreateFontBy("$()[]", target_font, font_bitmap, scale, 2, 160, 28, 28);
		CreateFontBy("@/,!?#%&*+-':.", target_font, font_bitmap, scale, 80, 162, 28, 28);

		final int i1 = Math.round(-18F * scale);

		final Sprite result = Sprite.I(scale, 0.0F, 0, 8, 5, 369, 164, 0, 0, font_bitmap, super.applicationCanvas, this);

		target_font.fragSprites[34] = result;
		target_font.Z[34] = i1;
	}

	public final void CreateFontBy(final String ref_string, final Font target_font, final Bitmap bitmap, final float scale, int index, final int x, final int y, final int l1)
	{
		final int ref_length = ref_string.length();
		for (int i = 0; i < ref_length; i++)
		{
			final char parsing_char = ref_string.charAt(i);

			final Rectangle rect = bitmap.GetRectFromAtlas(index, x, y);
			//final int font_height = ;
			final int i2 = Math.round((((rect.y - x) + rect.height) - l1) * scale);

			final int l2 = rect.width;
			final int i3 = rect.height;
			final int j3 = rect.x;
			final int k3 = rect.y;

			final Canvas surface1 = super.applicationCanvas;
			final Sprite result = Sprite.I(scale, 0.0F, 0, l2, i3, j3, k3, 0, 0, bitmap, surface1, this);

			target_font.fragSprites[parsing_char] = result;
			target_font.Z[parsing_char] = i2;
			index = rect.x + rect.width + 1;
		}
	}

	@Override
	public final synchronized void InitializeSettings(final boolean flag)
	{
		super.InitializeSettings(flag);
		if (!flag)
		{
			super.gameUIObjects.I();
		}

		cheatCode = 0;
		getRGB = 0.0F;
		getBackground = 1;
		getCodeBase = 1;

		everySFXs.ToggleLoop(!isAudioMuted && toggleAudio);
		if (gameMusic != null)
		{
			gameMusic.SetPlay(!isAudioMuted && isMusicOn);
		}

		if (flag)
		{
			currentMission.ExecuteTriggers(1000);
			return;
		}
		else
		{
			PC = 1;
			currentMission.ExecuteTriggers(300);
			return;
		}
	}

	final void InitializeInstancePools()
	{
		dZ = new GameObjectPool(this, 1);
		vZ = new GameObjectPool(this, 50);
		wZ = new GameObjectPool(this, 50);

		int j3 = dZ.myCapacity + vZ.myCapacity + wZ.myCapacity;
		xZ = new GameObjectPool(this, j3);

		for (int i1 = 0; i1 < j3; i1++)
		{
			final oSpaceship oSpaceship1 = new oSpaceship(this);
			final GameObjectPool oGameObjectlist1 = xZ;
			final oSpaceship oSpaceship2 = oSpaceship1;
			if (oGameObjectlist1.mySize < oGameObjectlist1.myCapacity)
			{
				oGameObjectlist1.internalList[oGameObjectlist1.mySize] = oSpaceship2;
				oGameObjectlist1.mySize++;
			}
		}

		ZC = new GameObjectPool(this, 15);
		yZ = new GameObjectPool(this, 30);
		IC = new GameObjectPool(this, 30);
		j3 = yZ.myCapacity + IC.myCapacity + ZC.myCapacity;
		CC = new GameObjectPool(this, j3);

		for (int j1 = 0; j1 < j3; j1++)
		{
			final oWeaponfire oWeaponfire1 = new oWeaponfire(this);
			final GameObjectPool oGameObjectlist2 = CC;
			final oWeaponfire oWeaponfire2 = oWeaponfire1;

			if (oGameObjectlist2.mySize < oGameObjectlist2.myCapacity)
			{
				oGameObjectlist2.internalList[oGameObjectlist2.mySize] = oWeaponfire2;
				oGameObjectlist2.mySize++;
			}
		}

		BC = new GameObjectPool(this, 5);
		DC = new GameObjectPool(this, 5);
		for (int k1 = 0; k1 < DC.myCapacity; k1++)
		{
			final oPowerup oPowerup1 = new oPowerup(this);
			final GameObjectPool oGameObjectlist3 = DC;
			final oPowerup oPowerup2 = oPowerup1;
			if (oGameObjectlist3.mySize < oGameObjectlist3.myCapacity)
			{
				oGameObjectlist3.internalList[oGameObjectlist3.mySize] = oPowerup2;
				oGameObjectlist3.mySize++;
			}
		}

		FC = new GameObjectPool(this, 300);
		for (int l1 = 0; l1 < FC.myCapacity; l1++)
		{
			final oWeapon oWeapon1 = new oWeapon(this);
			final GameObjectPool oGameObjectlist4 = FC;
			final oWeapon oWeapon2 = oWeapon1;
			if (oGameObjectlist4.mySize < oGameObjectlist4.myCapacity)
			{
				oGameObjectlist4.internalList[oGameObjectlist4.mySize] = oWeapon2;
				oGameObjectlist4.mySize++;
			}
		}

		oZ = new GameObjectPool(this, 40);
		pZ = new GameObjectPool(this, 80);
		qZ = new GameObjectPool(this, 40);
		j3 = oZ.myCapacity + qZ.myCapacity + pZ.myCapacity;
		rZ = new GameObjectPool(this, j3);
		for (int i2 = 0; i2 < j3; i2++) {
			final Explosion explosion1 = new Explosion(this);
			final GameObjectPool oGameObjectlist5 = rZ;
			final Explosion explosion2 = explosion1;
			if (oGameObjectlist5.mySize < oGameObjectlist5.myCapacity) {
				oGameObjectlist5.internalList[oGameObjectlist5.mySize] = explosion2;
				oGameObjectlist5.mySize++;
			}
		}

		tZ = new GameObjectPool(this, 50);
		uZ = new GameObjectPool(this, 50);
		for (int j2 = 0; j2 < uZ.myCapacity; j2++) {
			final explosionbit explosionbit1 = new explosionbit(this);
			final GameObjectPool oGameObjectlist6 = uZ;
			final explosionbit explosionbit2 = explosionbit1;
			if (oGameObjectlist6.mySize < oGameObjectlist6.myCapacity) {
				oGameObjectlist6.internalList[oGameObjectlist6.mySize] = explosionbit2;
				oGameObjectlist6.mySize++;
			}
		}

		AC = new GameObjectPool(this, 30);
		EC = new GameObjectPool(this, 10);
		GC = new GameObjectPool(this, 10);
		getRuntime = new GameObjectPool(this, AC.myCapacity + EC.myCapacity + EC.myCapacity);
		for (int k2 = 0; k2 < getRuntime.myCapacity; k2++) {
			final GameObject oGameObject1 = new GameObject(this);
			final GameObjectPool oGameObjectlist7 = getRuntime;
			if (oGameObjectlist7.mySize < oGameObjectlist7.myCapacity) {
				oGameObjectlist7.internalList[oGameObjectlist7.mySize] = oGameObject1;
				oGameObjectlist7.mySize++;
			}
		}

		JC = new GameObjectPool(this, 25);
		for (int l2 = 0; l2 < JC.myCapacity; l2++)
		{
			final oPlanet oPlanet1 = new oPlanet(this);
			final GameObjectPool oGameObjectlist8 = JC;
			final oPlanet oPlanet2 = oPlanet1;
			if (oGameObjectlist8.mySize < oGameObjectlist8.myCapacity) {
				oGameObjectlist8.internalList[oGameObjectlist8.mySize] = oPlanet2;
				oGameObjectlist8.mySize++;
			}
		}

		SC = new GameObjectPool(this, 10);
		for (int i3 = 0; i3 < SC.myCapacity; i3++)
		{
			final oWaypoint oWaypoint1 = new oWaypoint(this);
			final GameObjectPool oGameObjectlist9 = SC;
			final oWaypoint oWaypoint2 = oWaypoint1;
			if (oGameObjectlist9.mySize < oGameObjectlist9.myCapacity) {
				oGameObjectlist9.internalList[oGameObjectlist9.mySize] = oWaypoint2;
				oGameObjectlist9.mySize++;
			}
		}

		myCamera = new GameCamera(this);
		myCamera.Awake();
	}

	@Override
	final void Cleanup()
	{
		super.Cleanup();
		// surface drawsurface1;
		// if (super.lC != null)
		// drawsurface1 = super.lC;
	}

	@Override
	final void B()
	{
		everySFXs.ToggleLoop(!super.isAudioMuted && toggleAudio);
	}

	@Override
	final void D()
	{
		if (gameMusic != null)
		{
			gameMusic.SetPlay(!super.isAudioMuted && super.isMusicOn);
		}
	}

	final GameObject I(final int i1, final int j1, final int k1, final int l1, final int i2) {
		if (i1 == -1 || i1 == 2) {
			final GameObjectPool oGameObjectlist1 = wZ;
			final GameObject oGameObject1 = oGameObjectlist1.I(1, j1, k1, l1, i2, -1F);
			if (oGameObject1 != null)
				return oGameObject1;
		}

		if (i1 == -1 || i1 == 1) {
			GameObjectPool oGameObjectlist2 = dZ;
			GameObject oGameObject2 = oGameObjectlist2.I(1, j1, k1, l1, i2, -1F);
			if (oGameObject2 != null)
				return oGameObject2;
			oGameObjectlist2 = vZ;
			oGameObject2 = oGameObjectlist2.I(1, j1, k1, l1, i2, -1F);
			if (oGameObject2 != null)
				return oGameObject2;
		}

		if (i2 != -1) {
			GameObjectPool oGameObjectlist3 = EC;
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

	SpriteGroup F;
	SpriteGroup HNSM;
	SpriteGroup I;
	SpriteGroup Z;
	SpriteGroup C;
	SpriteGroup B;
	SpriteGroup D;
	SpriteGroup J;
	SpriteGroup S;
	SpriteGroup A;
	SpriteGroup E;
	SpriteGroup G;
	SpriteGroup H;
	SpriteGroup K;
	SpriteGroup L;
	SpriteGroup M;
	SpriteGroup N;
	SpriteGroup O;
	SpriteGroup P;
	SpriteGroup Q;
	SpriteGroup R;
	SpriteGroup T;
	SpriteGroup U;
	SpriteGroup V;
	SpriteGroup W;
	SpriteGroup X;
	SpriteGroup Y;
	SpriteGroup i;
	SpriteGroup z;
	SpriteGroup c;
	SpriteGroup b;
	SpriteGroup d;
	SpriteGroup f;
	SpriteGroup j;
	SpriteGroup s;
	SpriteGroup a;
	SpriteGroup e;
	SpriteGroup g;
	SpriteGroup h;
	SpriteGroup k;
	SpriteGroup l;
	SpriteGroup m;
	SpriteGroup n;
	SpriteGroup o;
	SpriteGroup p;
	SpriteGroup q;
	SpriteGroup r;
	SpriteGroup t;
	SpriteGroup u;
	SpriteGroup v;
	SpriteGroup w;
	SpriteGroup II;
	SpriteGroup ZI;
	SpriteGroup CI;
	SpriteGroup BI;
	SpriteGroup DI;
	SpriteGroup FI;
	SpriteGroup JI;
	SpriteGroup SI;
	SpriteGroup AI;
	SpriteGroup EI;
	SpriteGroup GI;
	SpriteGroup HI;
	SpriteGroup abs;
	SpriteGroup KI;
	SpriteGroup LI;
	SpriteGroup MI;
	SpriteGroup NI;
	SpriteGroup OI;
	SpriteGroup PI;
	SpriteGroup QI;
	SpriteGroup RI;
	SpriteGroup TI;
	SpriteGroup UI;
	SpriteGroup VI;
	SpriteGroup WI;
	SpriteGroup XI;
	SpriteGroup YI;
	SpriteGroup append;
	SpriteGroup iI;
	SpriteGroup zI;
	SpriteGroup cI;
	SpriteGroup bI;
	SpriteGroup dI;
	SpriteGroup arraycopy;
	SpriteGroup sprite_group_ship;
	SpriteGroup black;
	Sprite spriteTitle;
	SpriteGroup jI;
	SpriteGroup sI;
	SpriteGroup aI;
	SpriteGroup eI;
	SpriteGroup gI;
	SpriteGroup hI;
	SpriteGroup kI;
	SpriteGroup lI;
	SpriteGroup mI;
	SpriteGroup nI;
	SpriteGroup oI;
	SpriteGroup pI;
	SpriteGroup qI;
	SpriteGroup rI;
	SpriteGroup tI;
	SpriteGroup uI;
	SpriteGroup vI;
	SpriteGroup wI;
	SpriteGroup xI;
	SpriteGroup brighter;
	SpriteGroup yI;
	SpriteGroup IZ;
	SpriteGroup sStarWhite;
	SpriteGroup sStarRed;
	SpriteGroup sStarBlue;
	Palette DZ;
	Palette FZ;
	Palette flashcolor_red;
	Palette flashcolor_navy;
	Palette AZ;
	Palette flashcolor_yellow;
	Palette GZ;
	Palette HZ;
	Palette flashcolor_white;
	Palette LZ;
	Palette MZ;
	Palette charAt;
	Palette cos;
	Palette darkGray;
	Palette darker;
	Palette freeMemory;
	GameSoundPool everySFXs;
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
	MusicSequence gameMusic;
	int getAppletContext;
	GameObjectPool dZ;
	int getBackground;
	int getCodeBase;
	float getRGB;
	float viewBorderLeft;
	float viewBorderRight;
	float viewBorderTop;
	float viewBorderBottom;
	int eZ;
	int gZ;
	int hZ;
	int kZ;
	int lZ;
	int mZ;
	float nZ;
	GameObjectPool oZ;
	GameObjectPool pZ;
	GameObjectPool qZ;
	GameObjectPool rZ;
	GameObjectPool tZ;
	GameObjectPool uZ;
	GameObjectPool vZ;
	GameObjectPool wZ;
	GameObjectPool xZ;
	GameObjectPool yZ;
	GameObjectPool IC;
	GameObjectPool ZC;
	GameObjectPool CC;
	GameObjectPool BC;
	GameObjectPool DC;
	GameObjectPool FC;
	GameObjectPool getRuntime;
	GameObjectPool JC;
	GameObjectPool SC;
	GameObjectPool AC;
	GameObjectPool EC;
	GameObjectPool GC;
	oStarfield gameStarfield;
	GameCamera myCamera;
	GameMission currentMission;
	boolean clearedSettings;
	boolean cheatedCowLevel;
	float MC;
	boolean isSurfaceCreated;
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
