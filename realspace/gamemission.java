package realspace;

import java.awt.Color;

final class GameMission
{
	GameMission(final GameApp applet, final int triggers_count)
	{
		B = "";
		gameApplet = applet;
		myTriggers = new Trigger[triggers_count];
		triggersCount = triggers_count;
		
		random = new int[20];
		red = new int[20];
		toString = new float[20];
		S = new int[10];
		A = new int[10];

		I = new GameQuest(applet, 1, 20);
		C = new GameQuest(applet, 2, 20);
		usingTriggersCount = -1;
	}

	final void F(final int using_triggers_count)
	{
		for (int j = 0; j < triggersCount; j++)
		{
			myTriggers[j] = null;
		}
		usingTriggersCount = using_triggers_count;

		Z = 0;
		abs = 0;
		H = 0;
		valueOf = false;
		K = false;
		L = false;
		compareTo = -1;
		println = 0;
		out = 0;
		J = 0;
		D = 0.0F;
		E = 0;
		G = 0;
		I.I();
		C.I();
		append = false;

		GameObjectPool oGameObjectlist1 = gameApplet.vZ;
		int i1 = oGameObjectlist1.mySize;
		for (int k = 0; k < i1; k++)
		{
			oGameObjectlist1 = gameApplet.vZ;
			final oSpaceship ship = (oSpaceship) (k < 0 || k >= oGameObjectlist1.mySize ? null : oGameObjectlist1.internalList[k]);
			ship.II = false;
			ship.NI = false;
			ship.LI = 0;
			ship.MI = -1;
			
			if (!ship.CI)
			{
				ship.Attach(true, null);
			}
			else if (ship.myFollower != null)
			{
				((oSpaceship) (ship.myFollower)).fellowsCount++;
				
				ship.Attach(true, null);
			}
		}

		oGameObjectlist1 = gameApplet.wZ;
		i1 = oGameObjectlist1.mySize;
		for (int l = 0; l < i1; l++)
		{
			final GameObjectPool oGameObjectlist2 = gameApplet.wZ;
			final oSpaceship ship = (oSpaceship) (l < 0 || l >= oGameObjectlist2.mySize ? null : oGameObjectlist2.internalList[l]);
			ship.II = false;
			ship.NI = false;
			ship.LI = 0;
			ship.MI = -1;
			if (!((GameObject) (ship)).CI)
			{
				ship.Attach(true, null);
			}
			else if (((GameObject) (ship)).myFollower != null)
			{
				((oSpaceship) (ship.myFollower)).fellowsCount++;

				ship.Attach(true, null);
			}
		}

		gameApplet.qC = false;
		gameApplet.OC = true;
	}

	final void ExecuteTriggers(final int category) {
		F(category);
		
		final int j = gameApplet.viewWidth / 2;
		final int k = gameApplet.viewHeight / 2;

		final int l = gameApplet.viewWidth / 2;
		final int i1 = gameApplet.viewHeight / 4;

		final int j1 = gameApplet.viewWidth / 2;
		final int k1 = gameApplet.viewHeight / 4;

		final int l1 = gameApplet.viewWidth / 2;
		final int i2 = (gameApplet.viewHeight * 2) / 3;

		final int j2 = (int) (200F * gameApplet.viewScale);
		final int k2 = gameApplet.viewHeight - gameApplet.fontNormal.myHeight - 5;

		final int l2 = gameApplet.viewWidth / 2;
		final int i3 = gameApplet.viewHeight - (gameApplet.fontNormal.myHeight + 20);
		
		Palette temp_palette_1, temp_palette_2;

		switch (category)
		{
			case 1200:
				max(true, true, -1, -1, -1, -1, -1);
				compareTo(1, 3F);
				lightGray(100);
				append(100, 5, 2.0F);
				blue(20, 10, 10, 300);
				gray(2, 100, 121, 2.0F);
				lightGray(2, 20, 10, 10);
				abs();
				lightGray(2000);
				append(true);
				red(1200);
				return;

			case 1101:
				compareTo(false);
				lightGray(30);
				Object obj = gameApplet.flashcolor_white;
				Object obj9 = gameApplet.flashcolor_navy;
				Font gamefont1 = gameApplet.fontSmall;
				Transmision(-1, "Objectives Failed||Aborting Mission", ((Palette) (obj)), ((Palette) (obj9)),
						gamefont1, true, l1, i2, 0, 150, 0, true, true, 1, -1, 0);
				lightGray(100);
				obj = gameApplet.flashcolor_white;
				obj9 = gameApplet.flashcolor_navy;
				gamefont1 = gameApplet.fontNormal;
				Transmision(-1, "Your Ship, The KFS Vengeance|Has Been Destroyed!", ((Palette) (obj)),
						((Palette) (obj9)), gamefont1, true, j1, k1, 0, 190, 0, true, true, 1, -1, 0);
				max(true, false, -1, -1, -1, -1, -1);
				lightGray(140);
				obj = Color.red;
				obj9 = Color.gray;
				gamefont1 = gameApplet.fontLarge;
				F(-1, "Game Over", ((Color) (obj)), ((Color) (obj9)), gamefont1, true, j1, k1, 0, 300, 0, true, true, 2,
						null, null, -1, 0);
				lightGray(5);
				gray();
				blue();
				return;

			case 1100:
				compareTo(false);
				lightGray(30);
				Object obj1 = gameApplet.flashcolor_white;
				Object obj10 = gameApplet.flashcolor_navy;
				Object obj19 = gameApplet.fontSmall;
				Transmision(-1, "Objectives Failed||Aborting Mission", ((Palette) (obj1)), ((Palette) (obj10)),
						((Font) (obj19)), true, l1, i2, 0, 150, 0, true, true, 1, -1, 0);
				lightGray(100);
				obj1 = B + "|Has Been Destroyed!";
				obj10 = gameApplet.flashcolor_white;
				obj19 = gameApplet.flashcolor_navy;
				final Font gamefont7 = gameApplet.fontNormal;
				Transmision(-1, ((String) (obj1)), ((Palette) (obj10)), ((Palette) (obj19)), gamefont7, true, j1,
						k1,
						0, 190, 0, true, true, 1, -1, 0);
				max(true, false, -1, -1, -1, -1, -1);
				lightGray(140);
				obj1 = Color.red;
				obj10 = Color.gray;
				obj19 = gameApplet.fontLarge;
				F(-1, "Game Over", ((Color) (obj1)), ((Color) (obj10)), ((Font) (obj19)), true, j1, k1, 0, 300, 0, true,
						true, 2, null, null, -1, 0);
				lightGray(5);
				gray();
				blue();
				return;

			case 1102:
				append(true);
				lightGray(30);
				Object obj2 = gameApplet.flashcolor_white;
				Object obj11 = gameApplet.flashcolor_navy;
				Font gamefont2 = gameApplet.fontSmall;
				Transmision(-1, "Objectives Failed||Aborting Mission", ((Palette) (obj2)), ((Palette) (obj11)),
						gamefont2, true, l1, i2, 0, 150, 0, true, true, 1, -1, 0);
				lightGray(100);
				obj2 = gameApplet.flashcolor_white;
				obj11 = gameApplet.flashcolor_navy;
				gamefont2 = gameApplet.fontNormal;
				Transmision(-1, "Your Ships Have Been Destroyed!", ((Palette) (obj2)), ((Palette) (obj11)),
						gamefont2,
						true, j1, k1, 0, 190, 0, true, true, 1, -1, 0);
				max(true, false, -1, -1, -1, -1, -1);
				lightGray(140);
				obj2 = Color.red;
				obj11 = Color.gray;
				gamefont2 = gameApplet.fontLarge;
				F(-1, "Game Over", ((Color) (obj2)), ((Color) (obj11)), gamefont2, true, j1, k1, 0, 300, 0, true, true,
						2,
						null, null, -1, 0);
				lightGray(5);
				gray();
				blue();
				return;

			case 1000:
				max(true, true, -1, -1, -1, -1, -1);
				lightGray(10);
				red(1001);
				return;

			case 1001:
				Object obj3 = gameApplet.vZ;
				((GameObjectPool) (obj3)).Attach(true, null, -1, -1, -1, -1);
				obj3 = gameApplet.wZ;
				((GameObjectPool) (obj3)).Attach(true, null, -1, -1, -1, -1);
				toString(9);
				gray(0.0F, 0.0F, true, 30F);
				obj3 = "Visit " + gameApplet.labelSimpleURL;
				Palette palette = gameApplet.flashcolor_white;
				Object obj20 = gameApplet.flashcolor_navy;
				Object obj30 = gameApplet.fontSmall;
				Transmision(3, ((String) (obj3)), palette, ((Palette) (obj20)), ((Font) (obj30)), true, l2, i3, 0,
						10000, 0, true, false, 0, -1, 0);
				lightGray(10);
				obj3 = gameApplet.flashcolor_yellow;
				palette = gameApplet.flashcolor_red;
				obj20 = gameApplet.fontNormal;
				Transmision(-1, "The Terrans Invaded", ((Palette) (obj3)), palette, ((Font) (obj20)), true, j, k,
						0, 70, 0, true, true, 0, -1, 0);
				lightGray(10);
				blue(1, false, false, 1.0F);
				final int ai[] = { 102, 112, 112, 120, 122, -1 };
				InstantiateGroup(1, ai, 3, true, 0.0F, 0.0F, gameApplet.worldDimension[0] / 2.0F, 3F);
				blue(2, false, false, 1.0F);
				final int ai1[] = { 201, 212, 213, 220, 223, -1 };
				InstantiateGroup(2, ai1, 3, true, 0.0F, 0.0F, gameApplet.worldDimension[0] / 2.0F, 3F);
				gray(1, 100, 102, 5F);
				gray(1, 100, 103, 8F);
				gray(1, 100, 111, 4F);
				gray(1, 100, 112, 4F);
				gray(1, 90, 120, 3F);
				gray(1, 90, 121, 3F);
				gray(1, 70, 122, 3F);
				gray(1, 60, 123, 1.5F);
				lightGray(1, 100, 5, 1);
				Z(1, gameApplet.YC + (int) (gameApplet.worldDimension[0] * 0.10000000000000001D),
						gameApplet.zC
								+ (int) (gameApplet.worldDimension[1] * 0.10000000000000001D),
						(int) (gameApplet.worldDimension[0] * 0.8F), (int) (gameApplet.worldDimension[1] * 0.8F));
				gray(2, 100, 202, 3F);
				gray(2, 100, 203, 3F);
				gray(2, 100, 211, 4F);
				gray(2, 100, 212, 4F);
				gray(2, 120, 220, 4.5F);
				gray(2, 110, 221, 4.5F);
				gray(2, 100, 222, 6F);
				gray(2, 100, 223, 6F);
				lightGray(2, 90, 5, 1);
				Z(2, gameApplet.YC + (int) (gameApplet.worldDimension[0] * 0.10000000000000001D),
						gameApplet.zC
								+ (int) (gameApplet.worldDimension[1] * 0.10000000000000001D),
						(int) (gameApplet.worldDimension[0] * 0.8F), (int) (gameApplet.worldDimension[1] * 0.8F));
				abs();
				lightGray(70);
				obj20 = gameApplet.flashcolor_yellow;
				obj30 = gameApplet.flashcolor_red;
				Object obj39 = gameApplet.fontNormal;
				Transmision(-1, "We Struck Back", ((Palette) (obj20)), ((Palette) (obj30)), ((Font) (obj39)), true,
						j, k, 0, 70, 0, true, true, 0, -1, 0);
				lightGray(80);
				obj20 = gameApplet.labelSimpleURL + " Presents";
				obj30 = gameApplet.flashcolor_white;
				obj39 = gameApplet.flashcolor_navy;
				final Font gamefont16 = gameApplet.fontNormal;
				Transmision(-1, ((String) (obj20)), ((Palette) (obj30)), ((Palette) (obj39)), gamefont16, true, j,
						k,
						0, 70, 0, true, true, 0, -1, 0);
				lightGray(80);
				obj20 = gameApplet.flashcolor_white;
				obj30 = gameApplet.flashcolor_navy;
				obj39 = gameApplet.fontNormal;
				Transmision(-1, "Realspace 2 - Emperor's Revenge", ((Palette) (obj20)), ((Palette) (obj30)),
						((Font) (obj39)), true, j, k, 0, 200, 0, true, true, 0, -1, 0);
				lightGray(40);
				obj20 = gameApplet.flashcolor_yellow;
				obj30 = gameApplet.flashcolor_red;
				obj39 = gameApplet.fontSmall;
				final int i4 = j + 50;
				@SuppressWarnings("unused")
				Font gamefont27;
				final int j4 = k + (gamefont27 = gameApplet.fontNormal).myHeight * 2;
				Transmision(-1, "Copyright 2001 AltoParc|www.altoparc.com", ((Palette) (obj20)),
						((Palette) (obj30)),
						((Font) (obj39)), true, i4, j4, 0, 165, 0, true, true, 0, -1, 0);
				lightGray(170);
				obj20 = gameApplet.flashcolor_yellow;
				obj30 = gameApplet.flashcolor_red;
				obj39 = gameApplet.fontNormal;
				Transmision(-1, "We Smashed The Terran Frontier", ((Palette) (obj20)), ((Palette) (obj30)),
						((Font) (obj39)), true, j, k, 0, 70, 0, true, true, 0, -1, 0);
				lightGray(80);
				obj20 = gameApplet.flashcolor_yellow;
				obj30 = gameApplet.flashcolor_red;
				obj39 = gameApplet.fontNormal;
				Transmision(-1, "Destroyed Their Outposts", ((Palette) (obj20)), ((Palette) (obj30)),
						((Font) (obj39)), true, j, k, 0, 70, 0, true, true, 0, -1, 0);
				lightGray(80);
				obj20 = gameApplet.flashcolor_yellow;
				obj30 = gameApplet.flashcolor_red;
				obj39 = gameApplet.fontNormal;
				Transmision(-1, "Apocalypse Outpost Stopped Us", ((Palette) (obj20)), ((Palette) (obj30)),
						((Font) (obj39)), true, j, k, 0, 100, 0, true, true, 0, -1, 0);
				lightGray(110);
				obj20 = gameApplet.flashcolor_yellow;
				obj30 = gameApplet.flashcolor_red;
				obj39 = gameApplet.fontNormal;
				Transmision(-1, "Then The Antaris Crushed Our Forces", ((Palette) (obj20)), ((Palette) (obj30)),
						((Font) (obj39)), true, j, k, 0, 100, 0, true, true, 0, -1, 0);
				lightGray(110);
				obj20 = gameApplet.flashcolor_yellow;
				obj30 = gameApplet.flashcolor_red;
				obj39 = gameApplet.fontNormal;
				Transmision(-1, "We Had Nothing Left To Stop Them", ((Palette) (obj20)), ((Palette) (obj30)),
						((Font) (obj39)), true, j, k, 0, 100, 0, true, true, 0, -1, 0);
				lightGray(110);
				obj20 = gameApplet.flashcolor_yellow;
				obj30 = gameApplet.flashcolor_red;
				obj39 = gameApplet.fontNormal;
				Transmision(-1, "They Attacked And Destroyed All|Worlds That Would Not Succumb",
						((Palette) (obj20)),
						((Palette) (obj30)), ((Font) (obj39)), true, j, k, 0, 140, 0, true, true, 0, -1, 0);
				lightGray(150);
				obj20 = gameApplet.flashcolor_yellow;
				obj30 = gameApplet.flashcolor_red;
				obj39 = gameApplet.fontNormal;
				Transmision(-1, "They Devestated Our Homeworld", ((Palette) (obj20)), ((Palette) (obj30)),
						((Font) (obj39)), true, j, k, 0, 100, 0, true, true, 0, -1, 0);
				lightGray(110);
				obj20 = gameApplet.flashcolor_yellow;
				obj30 = gameApplet.flashcolor_red;
				obj39 = gameApplet.fontNormal;
				Transmision(-1, "The Emperor And The Katuri|People Demand Revenge!", ((Palette) (obj20)),
						((Palette) (obj30)), ((Font) (obj39)), true, j, k, 0, 150, 0, true, true, 0, -1, 0);
				lightGray(160);
				obj20 = gameApplet.flashcolor_yellow;
				obj30 = gameApplet.flashcolor_red;
				obj39 = gameApplet.fontNormal;
				Transmision(-1, "Gather Our Remaing Forces", ((Palette) (obj20)), ((Palette) (obj30)),
						((Font) (obj39)), true, j, k, 0, 70, 0, true, true, 0, -1, 0);
				lightGray(80);
				obj20 = gameApplet.flashcolor_yellow;
				obj30 = gameApplet.flashcolor_red;
				obj39 = gameApplet.fontNormal;
				Transmision(-1, "Drive Back The Terran Defilers", ((Palette) (obj20)), ((Palette) (obj30)),
						((Font) (obj39)), true, j, k, 0, 70, 0, true, true, 0, -1, 0);
				lightGray(80);
				obj20 = gameApplet.flashcolor_yellow;
				obj30 = gameApplet.flashcolor_red;
				obj39 = gameApplet.fontNormal;
				Transmision(-1, "And Exact Our Revenge By Destroying|Their Homeworld... The Earth!",
						((Palette) (obj20)), ((Palette) (obj30)), ((Font) (obj39)), true, j, k, 0, 200, 0, true, true,
						0, -1, 0);
				lightGray(250);
				obj20 = gameApplet.flashcolor_white;
				obj30 = gameApplet.flashcolor_navy;
				obj39 = gameApplet.fontNormal;
				Transmision(-1, "Game Design & Programming||Brian Fisher", ((Palette) (obj20)),
						((Palette) (obj30)),
						((Font) (obj39)), true, j, k, 0, 200, 0, true, true, 0, -1, 0);
				lightGray(250);
				obj20 = gameApplet.flashcolor_white;
				obj30 = gameApplet.flashcolor_navy;
				obj39 = gameApplet.fontNormal;
				Transmision(-1, "Artwork||Rodrigo Aguilar", ((Palette) (obj20)), ((Palette) (obj30)),
						((Font) (obj39)), true, j, k, 0, 200, 0, true, true, 0, -1, 0);
				lightGray(250);
				obj20 = gameApplet.flashcolor_white;
				obj30 = gameApplet.flashcolor_navy;
				obj39 = gameApplet.fontNormal;
				Transmision(-1, "Music||Jason Graves", ((Palette) (obj20)), ((Palette) (obj30)), ((Font) (obj39)),
						true, j, k, 0, 200, 0, true, true, 0, -1, 0);
				lightGray(250);
				obj20 = gameApplet.flashcolor_white;
				obj30 = gameApplet.flashcolor_navy;
				obj39 = gameApplet.fontNormal;
				Transmision(-1,
						"star_blinking Special Thanks To Everyone|That Helped With Testing||You Helped Make This Game Awsome!",
						((Palette) (obj20)), ((Palette) (obj30)), ((Font) (obj39)), true, j, k, 0, 200, 0, true, true,
						0, -1, 0);
				lightGray(3000);
				append(true);
				max(true, false, -1, -1, -1, -1, -1);
				lightGray(200);
				red(1001);
				return;

			case 300:
				gameApplet.NC = false;
				GameObjectPool oGameObjectlist1 = gameApplet.gameUIObjects;
				oGameObjectlist1.Attach(true, null, -1, -1, -1, -1);
				gray(0.0F, 0.0F, true, 30F);
				gameApplet.PC = 1;
				oGameObjectlist1 = gameApplet.oZ;
				oGameObjectlist1.Attach(true, null, -1, -1, -1, -1);
				oGameObjectlist1 = gameApplet.pZ;
				oGameObjectlist1.Attach(true, null, -1, -1, -1, -1);
				oGameObjectlist1 = gameApplet.qZ;
				oGameObjectlist1.Attach(true, null, -1, -1, -1, -1);
				oGameObjectlist1 = gameApplet.tZ;
				oGameObjectlist1.Attach(true, null, -1, -1, -1, -1);
				oGameObjectlist1 = gameApplet.vZ;
				oGameObjectlist1.Attach(true, null, -1, -1, -1, -1);
				oGameObjectlist1 = gameApplet.wZ;
				oGameObjectlist1.Attach(true, null, -1, -1, -1, -1);
				oGameObjectlist1 = gameApplet.yZ;
				oGameObjectlist1.Attach(true, null, -1, -1, -1, -1);
				oGameObjectlist1 = gameApplet.IC;
				oGameObjectlist1.Attach(true, null, -1, -1, -1, -1);
				oGameObjectlist1 = gameApplet.ZC;
				oGameObjectlist1.Attach(true, null, -1, -1, -1, -1);
				oGameObjectlist1 = gameApplet.AC;
				oGameObjectlist1.Attach(true, null, -1, -1, -1, -1);
				oGameObjectlist1 = gameApplet.EC;
				oGameObjectlist1.Attach(true, null, -1, -1, -1, -1);
				oGameObjectlist1 = gameApplet.GC;
				oGameObjectlist1.Attach(true, null, -1, -1, -1, -1);
				oGameObjectlist1 = gameApplet.BC;
				oGameObjectlist1.Attach(true, null, -1, -1, -1, -1);
				toString(10);
				int j3 = (int) (120F * gameApplet.viewScale);
				Object obj12 = gameApplet.flashcolor_yellow;
				Object obj21 = gameApplet.flashcolor_red;
				Object obj31 = gameApplet.fontLarge;
				Transmision(-1, "Choose One Of The Following", ((Palette) (obj12)), ((Palette) (obj21)),
						((Font) (obj31)), true, j, j3, 0, 1000, 0, true, false, 0, -1, 0);
				obj12 = gameApplet.fontSmall;
				j3 += ((Font) (obj12)).myHeight + (int) (35F * gameApplet.viewScale);
				obj12 = gameApplet.flashcolor_white;
				obj21 = gameApplet.flashcolor_navy;
				obj31 = gameApplet.fontNormal;
				Transmision(1, "Start Game", ((Palette) (obj12)), ((Palette) (obj21)), ((Font) (obj31)), true, j,
						j3, 0, 1000, 0, true, false, 0, -1, 0);
				obj12 = gameApplet.fontNormal;
				j3 += ((Font) (obj12)).myHeight + (int) (20F * gameApplet.viewScale);
				obj12 = "Detail Level - Normal / High";
				if (gameApplet.QC == 2)
					obj12 = "Detail Level - Medium";
				else if (gameApplet.QC == 3)
					obj12 = "Detail Level - Low";
				obj21 = gameApplet.flashcolor_white;
				obj31 = gameApplet.flashcolor_navy;
				Object obj40 = gameApplet.fontNormal;
				Transmision(2, ((String) (obj12)), ((Palette) (obj21)), ((Palette) (obj31)), ((Font) (obj40)),
						true, j, j3, 0, 1000, 0, true, false, 0, -1, 0);
				obj21 = gameApplet.fontNormal;
				j3 += ((Font) (obj21)).myHeight * 2 + (int) (20F * gameApplet.viewScale);
				obj21 = "Visit " + gameApplet.labelSimpleURL;
				obj31 = gameApplet.flashcolor_white;
				obj40 = gameApplet.flashcolor_navy;
				final Font gamefont17 = gameApplet.fontNormal;
				Transmision(3, ((String) (obj21)), ((Palette) (obj31)), ((Palette) (obj40)), gamefont17, true, j,
						j3,
						0, 1000, 0, true, false, 0, -1, 0);
				obj21 = gameApplet.fontNormal;
				j3 += ((Font) (obj21)).myHeight * 2 + (int) (20F * gameApplet.viewScale);
				obj21 = gameApplet.flashcolor_white;
				obj31 = gameApplet.flashcolor_navy;
				obj40 = gameApplet.fontNormal;
				Transmision(4, "Return To Demo Mode", ((Palette) (obj21)), ((Palette) (obj31)), ((Font) (obj40)),
						true, j, j3, 0, 1000, 0, true, false, 0, -1, 0);
				max();
				lightGray(1000);
				blue();
				return;

			case 301:
				final GameObjectPool oGameObjectlist2 = gameApplet.gameUIObjects;
				oGameObjectlist2.Attach(true, null, -1, -1, -1, -1);
				gameApplet.PC = 1;
				max(true, true, -1, -1, -1, -1, -1);
				int k3 = (int) (120F * gameApplet.viewScale);
				Object obj13 = gameApplet.flashcolor_yellow;
				Palette palette1 = gameApplet.flashcolor_red;
				Font gamefont8 = gameApplet.fontLarge;
				Transmision(-1, "Choose Game Difficulty", ((Palette) (obj13)), palette1, gamefont8, true, j, k3, 0,
						1000, 0, true, false, 0, -1, 0);
				obj13 = gameApplet.fontSmall;
				k3 += ((Font) (obj13)).myHeight + (int) (35F * gameApplet.viewScale);
				obj13 = gameApplet.flashcolor_white;
				palette1 = gameApplet.flashcolor_navy;
				gamefont8 = gameApplet.fontNormal;
				Transmision(1, "Minor Skirmish", ((Palette) (obj13)), palette1, gamefont8, true, j, k3, 0, 1000, 0,
						true, false, 0, -1, 0);
				obj13 = gameApplet.fontNormal;
				k3 += ((Font) (obj13)).myHeight + (int) (20F * gameApplet.viewScale);
				obj13 = gameApplet.flashcolor_white;
				palette1 = gameApplet.flashcolor_navy;
				gamefont8 = gameApplet.fontNormal;
				Transmision(2, "Under Attack", ((Palette) (obj13)), palette1, gamefont8, true, j, k3, 0, 1000, 0,
						true,
						false, 0, -1, 0);
				obj13 = gameApplet.fontNormal;
				k3 += ((Font) (obj13)).myHeight + (int) (20F * gameApplet.viewScale);
				obj13 = gameApplet.flashcolor_white;
				palette1 = gameApplet.flashcolor_navy;
				gamefont8 = gameApplet.fontNormal;
				Transmision(3, "Major Battle", ((Palette) (obj13)), palette1, gamefont8, true, j, k3, 0, 1000, 0,
						true,
						false, 0, -1, 0);
				obj13 = gameApplet.fontNormal;
				k3 += ((Font) (obj13)).myHeight + (int) (20F * gameApplet.viewScale);
				obj13 = gameApplet.flashcolor_white;
				palette1 = gameApplet.flashcolor_navy;
				gamefont8 = gameApplet.fontNormal;
				Transmision(4, "Blitzkrieg", ((Palette) (obj13)), palette1, gamefont8, true, j, k3, 0, 1000, 0,
						true,
						false, 0, -1, 0);
				obj13 = gameApplet.fontNormal;
				k3 += ((Font) (obj13)).myHeight * 2 + (int) (20F * gameApplet.viewScale);
				obj13 = gameApplet.flashcolor_white;
				palette1 = gameApplet.flashcolor_navy;
				gamefont8 = gameApplet.fontNormal;
				Transmision(5, "Previous Menu", ((Palette) (obj13)), palette1, gamefont8, true, j, k3, 0, 1000, 0,
						true, false, 0, -1, 0);
				max();
				lightGray(1000);
				blue();
				return;

			case 302:
				final GameObjectPool oGameObjectlist3 = gameApplet.gameUIObjects;
				oGameObjectlist3.Attach(true, null, -1, -1, -1, -1);
				gameApplet.PC = gameApplet.QC;
				max(true, true, -1, -1, -1, -1, -1);
				int l3 = (int) (120F * gameApplet.viewScale);
				Object obj14 = gameApplet.flashcolor_yellow;
				Palette palette2 = gameApplet.flashcolor_red;
				Font gamefont9 = gameApplet.fontLarge;
				Transmision(-1, "Choose Detail Level", ((Palette) (obj14)), palette2, gamefont9, true, j, l3, 0,
						1000,
						0, true, false, 0, -1, 0);
				obj14 = gameApplet.fontSmall;
				l3 += ((Font) (obj14)).myHeight + (int) (35F * gameApplet.viewScale);
				obj14 = gameApplet.flashcolor_white;
				palette2 = gameApplet.flashcolor_navy;
				gamefont9 = gameApplet.fontNormal;
				Transmision(1, "Normal / High", ((Palette) (obj14)), palette2, gamefont9, true, j, l3, 0, 1000, 0,
						true, false, 0, -1, 0);
				obj14 = gameApplet.fontNormal;
				l3 += ((Font) (obj14)).myHeight + (int) (20F * gameApplet.viewScale);
				obj14 = gameApplet.flashcolor_white;
				palette2 = gameApplet.flashcolor_navy;
				gamefont9 = gameApplet.fontNormal;
				Transmision(2, "Medium", ((Palette) (obj14)), palette2, gamefont9, true, j, l3, 0, 1000, 0, true,
						false, 0, -1, 0);
				obj14 = gameApplet.fontNormal;
				l3 += ((Font) (obj14)).myHeight + (int) (20F * gameApplet.viewScale);
				obj14 = gameApplet.flashcolor_white;
				palette2 = gameApplet.flashcolor_navy;
				gamefont9 = gameApplet.fontNormal;
				Transmision(3, "Low", ((Palette) (obj14)), palette2, gamefont9, true, j, l3, 0, 1000, 0, true,
						false,
						0, -1, 0);
				obj14 = gameApplet.fontNormal;
				l3 += ((Font) (obj14)).myHeight * 2 + (int) (20F * gameApplet.viewScale);
				obj14 = gameApplet.flashcolor_white;
				palette2 = gameApplet.flashcolor_navy;
				gamefont9 = gameApplet.fontNormal;
				Transmision(4, "Previous Menu", ((Palette) (obj14)), palette2, gamefont9, true, j, l3, 0, 1000, 0,
						true, false, 0, -1, 0);
				max();
				lightGray(1000);
				blue();
				return;

			case 100: // 'd'
				gameApplet.NC = true;
				final GameObjectPool oGameObjectlist4 = gameApplet.gameUIObjects;
				oGameObjectlist4.Attach(true, null, -1, -1, -1, -1);
				max(true, true, -1, -1, -1, -1, -1);
				P = 0;
				lightGray(5);
				red(101);
				return;

			case 101: // 'e'
				final float f = gameApplet.worldBorderLeft + gameApplet.worldDimension[0] * 0.25F;
				final float f19 = gameApplet.worldBorderTop + gameApplet.worldDimension[1] * 0.75F;
				final float f39 = gameApplet.worldBorderLeft + gameApplet.worldDimension[0] * 0.55F;
				final float f49 = gameApplet.worldBorderTop + gameApplet.worldDimension[1] * 0.45F;

				P++;
				toString(1);
				gray(0.0F, 0.0F, true, 30F);
				Palette palette11 = gameApplet.flashcolor_red;
				Palette palette16 = gameApplet.HZ;
				Object obj46 = gameApplet.fontLarge;
				Transmision(-1, "Mission One - Defilers", palette11, palette16, ((Font) (obj46)), true, l, i1, 0,
						80, 0, true, false, 0, -1, 0);
				getName(gameApplet.everySFXs, gameApplet.zZ, false);
				palette11 = gameApplet.flashcolor_white;
				palette16 = gameApplet.flashcolor_navy;
				obj46 = gameApplet.fontNormal;
				Transmision(10, "Skip Intro", palette11, palette16, ((Font) (obj46)), true, j2, k2, 0, 10000, 0,
						true, false, 0, -1, 0);
				lightGray(10);
				float f59 = f19 - 280F * gameApplet.viewScale;
				Instantiate(1, 130, 1, false, f, f59, 0.0F, -1, "");
				f59 = f + 180F * gameApplet.viewScale;
				float f64 = f19 - 180F * gameApplet.viewScale;
				Instantiate(1, 130, 1, false, f59, f64, 0.0F, -1, "");
				f59 = f + 270F * gameApplet.viewScale;
				f64 = f19 - 20F * gameApplet.viewScale;
				Instantiate(1, 130, 1, false, f59, f64, 0.0F, -1, "");
				lightGray(100, false);
				getName();
				lightGray(20);
				temp_palette_1 = gameApplet.AZ;
				temp_palette_2 = gameApplet.flashcolor_navy;
				obj46 = gameApplet.fontNormal;
				Transmision(-1, "Sirius Prime - The Katuri Homeworld", temp_palette_1, temp_palette_2,
						((Font) (obj46)), false, 0, 0, 0, 120, 0, true, true, 1, 100, 2);
				lightGray(130);
				gray(f39, f49, false, 30F);
				getName();
				lightGray(20);
				temp_palette_1 = gameApplet.flashcolor_yellow;
				temp_palette_2 = gameApplet.flashcolor_red;
				obj46 = gameApplet.fontNormal;
				Transmision(-1, "Jump Signatures Detected", temp_palette_1, temp_palette_2, ((Font) (obj46)), true,
						j1, k1, 0, 70, 0, true, true, 1, -1, 0);
				lightGray(10);
				final int ai10[] = { 222, 222, 222, 222, 220, 220, 220, 220, 221, 221, 221, 221, 221, 213, 213, 213, 213, 213,
						213, 211, 211, 211, 211, 212, 212, 212, 212, 201, 201, 201, 201, 202, 202, 203, 203, -1 };
				InstantiateGroup(2, ai10, 3, true, f39, f49, 600F, 4F);
				lightGray(65);
				temp_palette_2 = gameApplet.flashcolor_yellow;
				obj46 = gameApplet.flashcolor_red;
				Object obj47 = gameApplet.fontNormal;
				Transmision(-1, "It's The United Fleet!||The Dogs Mean To End The War", temp_palette_2,
						((Palette) (obj46)), ((Font) (obj47)), true, j1, k1, 0, 100, 0, true, true, 1, -1, 0);
				lightGray(20);
				f64 = f + 100F * gameApplet.viewScale;
				float f68 = f19 - 100F * gameApplet.viewScale;
				gray(f64, f68, false, 30F);
				lightGray(60);
				final int ai13[] = { 121, 120, 111, 111, 112, 101, 102, 101, 101, 102, 102, -1 };
				InstantiateGroup(1, ai13, 3, true, f + 100F * gameApplet.viewScale,
						f19 - 100F * gameApplet.viewScale,
						450F * gameApplet.viewScale,
						4F * gameApplet.viewScale);
				lightGray(30);
				temp_palette_1 = gameApplet.flashcolor_yellow;
				obj47 = gameApplet.flashcolor_red;
				Object obj48 = gameApplet.fontNormal;
				Transmision(-1, "All Remaining Forces... Attack!", temp_palette_1, ((Palette) (obj47)),
						((Font) (obj48)), true, j1, k1, 0, 100, 0, true, true, 1, -1, 0);
				lightGray(50);
				f68 = f + 550F * gameApplet.viewScale;
				float f71 = f19 - 550F * gameApplet.viewScale;
				gray(f68, f71, false, 30F);
				lightGray(50);
				temp_palette_1 = gameApplet.flashcolor_yellow;
				temp_palette_2 = gameApplet.flashcolor_red;
				obj48 = gameApplet.fontNormal;
				Transmision(-1, "Keep Them From The Homeworld||For The Glory Of The Emperor!", temp_palette_1,
						temp_palette_2, ((Font) (obj48)), true, j1, k1, 0, 130, 0, true, true, 1, -1, 0);
				lightGray(180);
				f68 = f + 200F * gameApplet.viewScale;
				f71 = f19 - 200F * gameApplet.viewScale;
				gray(f68, f71, false, 30F);
				lightGray(10);
				temp_palette_1 = gameApplet.flashcolor_yellow;
				temp_palette_2 = gameApplet.flashcolor_red;
				obj48 = gameApplet.fontNormal;
				Transmision(-1, "We Need Re-Enforcments Now!", temp_palette_1, temp_palette_2, ((Font) (obj48)),
						true, j1, k1, 0, 90, 0, true, true, 1, -1, 0);
				lightGray(100);
				toString(2, 1, 8, -1, -1, -1);
				println(2);
				compareTo(false);
				random(1.0F, 2, -1, -1, -1, 100);
				lightGray(100, false);
				getName();
				lightGray(50);
				temp_palette_1 = gameApplet.flashcolor_yellow;
				temp_palette_2 = gameApplet.flashcolor_red;
				obj48 = gameApplet.fontNormal;
				Transmision(-1, "The Homeworld Is Defenseless", temp_palette_1, temp_palette_2, ((Font) (obj48)),
						true, j1, k1, 0, 100, 0, true, true, 1, -1, 0);
				lightGray(120);
				temp_palette_1 = gameApplet.flashcolor_yellow;
				temp_palette_2 = gameApplet.flashcolor_red;
				obj48 = gameApplet.fontLarge;
				Transmision(-1, "United Fleet...||We Surrender", temp_palette_1, temp_palette_2, ((Font) (obj48)),
						true, j1, k1, 0, 70, 0, true, true, 1, -1, 0);
				lightGray(60);
				compareTo(true);
				lightGray(30);
				temp_palette_1 = gameApplet.flashcolor_yellow;
				temp_palette_2 = gameApplet.flashcolor_red;
				obj48 = gameApplet.fontNormal;
				Transmision(-1, "Stop Attacking||Somebody... Anybody... Help!", temp_palette_1, temp_palette_2,
						((Font) (obj48)), true, j1, k1, 0, 90, 0, true, true, 1, -1, 0);
				lightGray(60);
				f68 = f - 200F * gameApplet.viewScale;
				f71 = f19 - 700F * gameApplet.viewScale;
				gray(f68, f71, false, 30F);
				lightGray(50);
				temp_palette_1 = gameApplet.flashcolor_yellow;
				temp_palette_2 = gameApplet.flashcolor_red;
				obj48 = gameApplet.fontNormal;
				Transmision(-1,
						"More Jump Signatures Detected||It's Ours... star_blinking Wing Of Suicide Bombers!",
						temp_palette_1, temp_palette_2, ((Font) (obj48)), true, j1, k1, 0, 120, 0, true, true, 1, -1,
						0);
				lightGray(10);
				final int ai14[] = { 103, 103, 103, 103, 103, 103, -1 };
				InstantiateGroup(1, ai14, 3, true, f - 200F * gameApplet.viewScale,
						f19 - 700F * gameApplet.viewScale, 400F,
						10F * gameApplet.viewScale);
				lightGray(30);
				out(-1, -1, -1, -1, 100, ((SpriteGroup) (null)), 2, 1);
				f71 = f + 200F;
				float f73 = f19 - 200F;
				gray(f71, f73, false, 30F);
				lightGray(50);
				f71 = f + 600F * gameApplet.viewScale;
				f73 = f19 - 600F * gameApplet.viewScale;
				red(2, f71, f73, -1, 1);
				lightGray(20);
				temp_palette_1 = gameApplet.flashcolor_yellow;
				temp_palette_2 = gameApplet.flashcolor_red;
				Font gamefont30 = gameApplet.fontNormal;
				Transmision(-1, "The United Fleet Dogs Are Retreating", temp_palette_1, temp_palette_2, gamefont30,
						true, j1, k1, 0, 80, 0, true, true, 1, -1, 0);
				lightGray(40);
				f71 = f + 600F * gameApplet.viewScale;
				f73 = f19 - 600F * gameApplet.viewScale;
				gray(f71, f73, false, 30F);
				lightGray(50);
				temp_palette_1 = gameApplet.flashcolor_yellow;
				temp_palette_2 = gameApplet.flashcolor_red;
				gamefont30 = gameApplet.fontNormal;
				Transmision(-1,
						"Our Pilots' Ultimate|Sacrifice Saved The Homeworld.||The Emperor Himself Bestows|High Glory To Their Houses!",
						temp_palette_1, temp_palette_2, gamefont30, true, j1, k1, 0, 220, 0, true, true, 1, -1, 0);
				lightGray(170);
				toString(1, 1, -1, -1, -1, -1);
				println(1);
				lightGray(60);
				red(102);
				return;

			case 102: // 'f'
				final float f1 = gameApplet.worldBorderLeft + gameApplet.worldDimension[0] * 0.25F;
				final float f20 = gameApplet.worldBorderTop + gameApplet.worldDimension[1] * 0.75F;
				Object obj22 = gameApplet.gameUIObjects;
				((GameObjectPool) (obj22)).Attach(true, null, -1, -1, -1, -1);
				obj22 = gameApplet.vZ;
				((GameObjectPool) (obj22)).Attach(true, null, -1, -1, -1, -1);
				obj22 = gameApplet.wZ;
				((GameObjectPool) (obj22)).Attach(true, null, -1, -1, -1, -1);
				out(-1, -1, -1, -1, 100, ((SpriteGroup) (null)), 2, 1);
				random(0.0F, 2, -1, -1, -1, 100);
				getName(0.25F);
				compareTo(1, 100);
				compareTo(2, 120);
				blue(1, false, true, 1.0F);
				float f40 = f20 - 220F * gameApplet.viewScale;
				Instantiate(1, 102, 2, true, f1, f40, 3F, -1, "");
				f40 = f1 + 75F * gameApplet.viewScale;
				float f50 = f20 - 220F * gameApplet.viewScale;
				Instantiate(1, 111, 2, true, f40, f50, 3F, -1, "");
				f40 = f1 + 150F * gameApplet.viewScale;
				f50 = f20 - 150F * gameApplet.viewScale;
				Instantiate(1, 121, 2, true, f40, f50, 3F, -1, "");
				f40 = f1 + 200F * gameApplet.viewScale;
				f50 = f20 - 80F * gameApplet.viewScale;
				Instantiate(1, 111, 2, true, f40, f50, 3F, -1, "");
				f40 = f1 + 220F * gameApplet.viewScale;
				Instantiate(1, 102, 2, true, f40, f20, 3F, -1, "");
				blue(1, false, false, 1.0F);
				red(150, f1 + 220F, f20 - 280F, 8.5F);
				abs(2, false, true, true, false);
				temp_palette_1 = gameApplet.flashcolor_yellow;
				Object obj32 = gameApplet.flashcolor_red;
				Font gamefont10 = gameApplet.fontNormal;
				Transmision(-1, "Re-Enforcements Have Arrived", temp_palette_1, ((Palette) (obj32)), gamefont10,
						true,
						j1, k1, 0, 80, 0, true, true, 1, -1, 0);
				toString(2, 1, -1, -1, -1, -1);
				valueOf(2, 1102);
				lightGray(50);
				temp_palette_1 = gameApplet.AZ;
				obj32 = gameApplet.flashcolor_navy;
				gamefont10 = gameApplet.fontSmall;
				Transmision(-1, "KFS Vengeance", temp_palette_1, ((Palette) (obj32)), gamefont10, false, 0, 0, 0,
						80,
						0, true, true, 1, 101, 2);
				lightGray(40);
				abs();
				temp_palette_1 = gameApplet.flashcolor_yellow;
				obj32 = gameApplet.flashcolor_red;
				gamefont10 = gameApplet.fontNormal;
				Transmision(-1,
						"Protect These Ships Until|More Re-Enforcements Arrive.||Atleast One Ship Must Survive!",
						temp_palette_1, ((Palette) (obj32)), gamefont10, true, j1, k1, 0, 200, 0, true, true, 1, -1, 0);
				gray(2, 120, 201, 5.5F + 0.4F * Q);
				lightGray(2, Math.max(70 + -4 * Q, 23), 5, 1);
				lightGray(150);
				gray(2, 100, 202, 5.5F + 0.4F * Q);
				lightGray(2, Math.max(120 + -5 * Q, 40), 10, 2);
				lightGray(300);
				gray(2, 100, 211, 3.5F + 0.4F * Q);
				lightGray(2, Math.max(100 + -4 * Q, 33), 5, 2);
				lightGray(900 + 50 * Q);
				lightGray(2, -1, 0, 0);
				lightGray(75);
				final Color ltg = Color.lightGray;
				obj32 = Color.blue;
				gamefont10 = gameApplet.fontNormal;
				F(-1, "Almost Clear!", ltg, ((Color) (obj32)), gamefont10, true, j1, k1, 0, 60, 0, true, true, 1, null,
						null, -1, 0);
				append(false);
				toString(1, 1, -1, -1, -1, -1);
				println(1);
				lightGray(10);
				temp_palette_1 = gameApplet.flashcolor_white;
				obj32 = gameApplet.flashcolor_navy;
				gamefont10 = gameApplet.fontLarge;
				Transmision(-1, "All Clear!", temp_palette_1, ((Palette) (obj32)), gamefont10, true, j1, k1, 0, 90,
						0,
						true, false, 0, -1, 0);
				getName(gameApplet.everySFXs, gameApplet.cZ, false);
				lightGray(100);
				red(110);
				return;

			case 110: // 'n'
				final float f2 = gameApplet.worldBorderLeft + gameApplet.worldDimension[0] * 0.25F;
				final float f21 = gameApplet.worldBorderTop + gameApplet.worldDimension[1] * 0.75F;
				Object obj23 = gameApplet.wZ;
				((GameObjectPool) (obj23)).Attach(true, null, -1, -1, -1, -1);
				out(1, 0.5F, 0.5F, false, -1, -1, -1, -1);
				P++;
				obj23 = gameApplet.flashcolor_red;
				Palette palette3 = gameApplet.HZ;
				Font gamefont11 = gameApplet.fontLarge;
				Transmision(-1, "Mission Two - The Gathering", ((Palette) (obj23)), palette3, gamefont11, true, l,
						i1,
						0, 80, 0, true, false, 0, -1, 0);
				getName(gameApplet.everySFXs, gameApplet.zZ, false);
				obj23 = gameApplet.flashcolor_white;
				palette3 = gameApplet.flashcolor_navy;
				gamefont11 = gameApplet.fontNormal;
				Transmision(10, "Skip Intro", ((Palette) (obj23)), palette3, gamefont11, true, j2, k2, 0, 10000, 0,
						true, false, 0, -1, 0);
				lightGray(10);
				float f41 = f2 + 250F * gameApplet.viewScale;
				float f51 = f21 - 250F * gameApplet.viewScale;
				gray(f41, f51, false, 30F);
				lightGray(80);
				getName();
				f41 = f2 + 80F * gameApplet.viewScale;
				f51 = f21 - 280F * gameApplet.viewScale;
				Instantiate(1, 101, 2, true, f41, f51, 3F, -1, "");
				f41 = f2 + 160F * gameApplet.viewScale;
				f51 = f21 - 260F * gameApplet.viewScale;
				Instantiate(1, 102, 2, true, f41, f51, 3F, -1, "");
				f41 = f2 + 275F * gameApplet.viewScale;
				f51 = f21 - 195F * gameApplet.viewScale;
				Instantiate(1, 121, 2, true, f41, f51, 3F, -1, "");
				f41 = f2 + 290F * gameApplet.viewScale;
				f51 = f21 - 100F * gameApplet.viewScale;
				Instantiate(1, 101, 2, true, f41, f51, 3F, -1, "");
				f41 = f2 + 300F * gameApplet.viewScale;
				f51 = f21 - 20F * gameApplet.viewScale;
				Instantiate(1, 111, 2, true, f41, f51, 3F, -1, "");
				lightGray(40);
				temp_palette_1 = gameApplet.flashcolor_yellow;
				temp_palette_2 = gameApplet.flashcolor_red;
				gamefont11 = gameApplet.fontNormal;
				Transmision(-1, "Additional Re-Enforcements Have Arrived", temp_palette_1, temp_palette_2,
						gamefont11,
						true, j1, k1, 0, 80, 0, true, true, 1, -1, 0);
				lightGray(90);
				temp_palette_1 = gameApplet.flashcolor_yellow;
				temp_palette_2 = gameApplet.flashcolor_red;
				gamefont11 = gameApplet.fontNormal;
				Transmision(-1, "The Homeworld Is Now Secure||The United Fleet's Gambit|To End The War Has Failed",
						temp_palette_1, temp_palette_2, gamefont11, true, j1, k1, 0, 160, 0, true, true, 1, -1, 0);
				lightGray(170);
				temp_palette_1 = gameApplet.flashcolor_yellow;
				temp_palette_2 = gameApplet.flashcolor_red;
				gamefont11 = gameApplet.fontNormal;
				Transmision(-1,
						"As star_blinking Result, They Have Serious|Weak Points In Their Positions.||We Must Take Advantage Of This!",
						temp_palette_1, temp_palette_2, gamefont11, true, j1, k1, 0, 180, 0, true, true, 1, -1, 0);
				lightGray(100);
				lightGray(101, false);
				getName();
				lightGray(90);
				red(111);
				return;

			case 111: // 'o'
				final Object obj4 = gameApplet.gameUIObjects;
				((GameObjectPool) (obj4)).Attach(true, null, -1, -1, -1, -1);
				getName(0.25F);
				compareTo(1, 110);
				compareTo(2, 100);
				compareTo(3, 100);
				valueOf(1, -1, -1, -1, -1, "");
				lightGray(101, true);
				append(1, 1102, gameApplet.vZ.mySize, -1);
				final float f3 = gameApplet.worldBorderRight - 500F * gameApplet.viewScale;
				final float f22 = gameApplet.worldBorderTop + 500F * gameApplet.viewScale;
				Palette f4 = null;
				red(1, f3, f22, -1, 1);
				abs(2, false, true, true, false);
				f4 = gameApplet.flashcolor_yellow;
				Object obj15 = gameApplet.flashcolor_red;
				Font gamefont3 = gameApplet.fontNormal;
				Transmision(-1,
						"Protect The Ships As They Are|Dispatched To The Jump Point||Atleast One Ship Must Survive!",
						f4,
						((Palette) (obj15)), gamefont3, true, j1, k1, 0, 200, 0, true, true, 1, -1, 0);
				lightGray(100);
				abs(1, 3, 2, 160 + 40 * Q, 40);
				gray(2, 200, 203, 5.5F + 0.4F * Q);
				gray(2, 100, 201, 5.5F + 0.4F * Q);
				lightGray(2, Math.max(75 + -4 * Q, 25), 5, 1);
				abs();
				lightGray(200);
				gray(2, 100, 211, 3.5F + 0.4F * Q);
				lightGray(2, Math.max(125 + -5 * Q, 41), 10, 2);
				lightGray(800 + 50 * Q);
				lightGray(2, Math.max(95 + -4 * Q, 31), 5, 2);
				lightGray(600 + 50 * Q);
				lightGray(2, Math.max(105 + -4 * Q, 35), 5, 1);
				toString(2, 1, -1, -1, -1, -1);
				println(2);
				// f4 = Color.lightGray;
				obj15 = Color.blue;
				gamefont3 = gameApplet.fontNormal;
				F(-1, "All Ships Have Made The Jump||Destroy All Remaining Enemies!", Color.lightGray,
						((Color) (obj15)),
						gamefont3, true, j1, k1, 0, 120, 0, true, true, 1, null, null, -1, 0);
				append(false);
				toString(1, 1, -1, -1, -1, -1);
				println(1);
				random(1);
				lightGray(10);
				f4 = gameApplet.flashcolor_white;
				obj15 = gameApplet.flashcolor_navy;
				gamefont3 = gameApplet.fontLarge;
				Transmision(-1, "All Clear!", f4, ((Palette) (obj15)), gamefont3, true, j1, k1, 0, 90, 0, true,
						false,
						0, -1, 0);
				getName(gameApplet.everySFXs, gameApplet.cZ, false);
				lightGray(100);
				red(120);
				return;

			case 120: // 'x'
				final float f411 = gameApplet.worldBorderLeft + gameApplet.worldDimension[0] * 0.22F;
				final float f23 = gameApplet.worldBorderTop + gameApplet.worldDimension[1] * 0.22F;
				final float f42 = gameApplet.worldBorderLeft + gameApplet.worldDimension[0] * 0.9F;
				final float f52 = gameApplet.worldBorderTop + gameApplet.worldDimension[1] * 0.7F;
				final float f60 = gameApplet.worldBorderLeft + gameApplet.worldDimension[0] * 0.2F;
				final float f65 = gameApplet.worldBorderTop + gameApplet.worldDimension[1] * 0.9F;
				final float f69 = gameApplet.worldBorderLeft + gameApplet.worldDimension[0] * 0.9F;
				final float f72 = gameApplet.worldBorderTop + gameApplet.worldDimension[1] * 0.2F;
				final float f74 = gameApplet.worldBorderLeft + gameApplet.worldDimension[0] * 0.5F;
				final float f75 = gameApplet.worldBorderTop + gameApplet.worldDimension[1] * 0.6F;
				final Object obj49 = gameApplet.wZ;
				((GameObjectPool) (obj49)).Attach(true, null, -1, -1, -1, -1);
				P++;
				toString(2);
				out(1, 0.5F, 0.5F, false, -1, -1, -1, -1);
				F(1, -1, -1, -1, -1, 3);
				float f76 = f411 + 200F * gameApplet.viewScale;
				float f77 = f23 + 200F * gameApplet.viewScale;
				red(2, f76, f77, -1, 3);
				f76 = f411 + 300F * gameApplet.viewScale;
				f77 = f23 - 150F * gameApplet.viewScale;
				red(2, f76, f77, -1, 3);
				f76 = f411 - 150F * gameApplet.viewScale;
				f77 = f23 + 300F * gameApplet.viewScale;
				red(2, f76, f77, -1, 4);
				blue(2, false, true, 1.0F);
				Instantiate(2, 230, 3, false, f411, f23, 0.0F, -1, "");
				f76 = f411 + 110F * gameApplet.viewScale;
				f77 = f23 + 100F * gameApplet.viewScale;
				Instantiate(2, 220, 3, false, f76, f77, 2.0F, -1, "");
				f76 = f411 + 150F * gameApplet.viewScale;
				f77 = f23 - 5F * gameApplet.viewScale;
				Instantiate(2, 211, 3, false, f76, f77, 2.0F, -1, "");
				f76 = f411 + 70F * gameApplet.viewScale;
				f77 = f23 + 180F * gameApplet.viewScale;
				Instantiate(2, 212, 3, false, f76, f77, 2.0F, -1, "");
				f76 = f411 + 210F * gameApplet.viewScale;
				f77 = f23 + 60F * gameApplet.viewScale;
				Instantiate(2, 212, 3, false, f76, f77, 2.0F, -1, "");
				blue(2, false, false, 1.0F);
				f76 = f411 + 500F * gameApplet.viewScale;
				f77 = f23 + 500F * gameApplet.viewScale;
				gray(f76, f77, true, 30F);

				temp_palette_1 = gameApplet.flashcolor_red;
				temp_palette_2 = gameApplet.HZ;
				Font gamefont31 = gameApplet.fontLarge;
				Transmision(-1, "Mission Three - System's Edge", temp_palette_1, temp_palette_2, gamefont31, true,
						l,
						i1, 0, 80, 0, true, false, 0, -1, 0);
				getName(gameApplet.everySFXs, gameApplet.zZ, false);
				temp_palette_1 = gameApplet.flashcolor_white;
				temp_palette_2 = gameApplet.flashcolor_navy;
				gamefont31 = gameApplet.fontNormal;
				Transmision(10, "Skip Intro", temp_palette_1, temp_palette_2, gamefont31, true, j2, k2, 0, 10000,
						0,
						true, false, 0, -1, 0);
				lightGray(10);
				gray(f411, f23, false, 30F);
				lightGray(90);
				getName();
				temp_palette_1 = gameApplet.flashcolor_yellow;
				temp_palette_2 = gameApplet.flashcolor_red;
				gamefont31 = gameApplet.fontNormal;
				Transmision(-1, "This United Fleet Outpost On The|Edge Of The System Must Be Destroyed",
						temp_palette_1, temp_palette_2, gamefont31, true, j1, k1, 0, 160, 0, true, true, 1, -1, 0);
				lightGray(80);
				gray(f42, f52, false, 50F);
				getName();
				blue(2, false, true, 32F);
				Instantiate(2, 212, 3, true, f42, f52, 2.0F, -1, "");
				f76 = f52 - 90F * gameApplet.viewScale;
				Instantiate(2, 220, 3, true, f42, f76, 2.0F, -1, "");
				f76 = f42 - 90F * gameApplet.viewScale;
				Instantiate(2, 211, 3, true, f76, f52, 2.0F, -1, "");
				f76 = f42 + 90F * gameApplet.viewScale;
				Instantiate(2, 202, 3, true, f76, f52, 2.0F, -1, "");
				f76 = f52 + 80F * gameApplet.viewScale;
				Instantiate(2, 203, 3, true, f42, f76, 2.0F, -1, "");
				blue(2, false, true, 16F);
				Instantiate(2, 212, 3, true, f60, f65, 2.0F, -1, "");
				f76 = f65 - 90F * gameApplet.viewScale;
				Instantiate(2, 220, 3, true, f60, f76, 2.0F, -1, "");
				f76 = f60 - 90F * gameApplet.viewScale;
				Instantiate(2, 213, 3, true, f76, f65, 2.0F, -1, "");
				f76 = f65 + 80F * gameApplet.viewScale;
				Instantiate(2, 203, 3, true, f60, f76, 2.0F, -1, "");
				blue(2, false, true, 8F);
				Instantiate(2, 212, 3, true, f69, f72, 2.0F, -1, "");
				f76 = f72 - 90F * gameApplet.viewScale;
				Instantiate(2, 220, 3, true, f69, f76, 2.0F, -1, "");
				f76 = f69 - 90F * gameApplet.viewScale;
				Instantiate(2, 213, 3, true, f76, f72, 2.0F, -1, "");
				f76 = f69 + 90F * gameApplet.viewScale;
				Instantiate(2, 211, 3, true, f76, f72, 2.0F, -1, "");
				f76 = f72 + 80F * gameApplet.viewScale;
				Instantiate(2, 203, 3, true, f69, f76, 2.0F, -1, "");
				blue(2, false, false, 1.0F);
				lightGray(10);
				temp_palette_1 = gameApplet.flashcolor_yellow;
				temp_palette_2 = gameApplet.flashcolor_red;
				gamefont31 = gameApplet.fontNormal;
				Transmision(-1, "Jump Signatures Detected", temp_palette_1, temp_palette_2, gamefont31, true, j1,
						k1,
						0, 70, 0, true, true, 1, -1, 0);
				lightGray(80);
				temp_palette_1 = gameApplet.flashcolor_yellow;
				temp_palette_2 = gameApplet.flashcolor_red;
				gamefont31 = gameApplet.fontNormal;
				Transmision(-1, "The United Fleet Is Attempting|To Re-Enforce Their Outpost", temp_palette_1,
						temp_palette_2, gamefont31, true, j1, k1, 0, 110, 0, true, true, 1, -1, 0);
				lightGray(60);
				gray(f74 + 150F * gameApplet.viewScale, f75, false, 50F);
				getName();
				max(1, f74, f75, 350F, 350F);
				lightGray(140);
				blue(1, false, true, 1.0F);
				f76 = f74 + ((float) Math.random() - 0.5F) * 350F * gameApplet.viewScale;
				f77 = f75 + ((float) Math.random() - 0.5F) * 350F * gameApplet.viewScale;
				Instantiate(1, 120, 2, true, f76, f77, 3.5F, -1, "");
				f76 = f74 + ((float) Math.random() - 0.5F) * 350F * gameApplet.viewScale;
				f77 = f75 + ((float) Math.random() - 0.5F) * 350F * gameApplet.viewScale;
				Instantiate(1, 111, 2, true, f76, f77, 3.5F, -1, "");
				f76 = f74 + ((float) Math.random() - 0.5F) * 350F * gameApplet.viewScale;
				f77 = f75 + ((float) Math.random() - 0.5F) * 350F * gameApplet.viewScale;
				Instantiate(1, 111, 2, true, f76, f77, 3.5F, -1, "");
				f76 = f74 + ((float) Math.random() - 0.5F) * 350F * gameApplet.viewScale;
				f77 = f75 + ((float) Math.random() - 0.5F) * 350F * gameApplet.viewScale;
				Instantiate(1, 102, 2, true, f76, f77, 3.5F, -1, "");
				f76 = f74 + ((float) Math.random() - 0.5F) * 350F * gameApplet.viewScale;
				f77 = f75 + ((float) Math.random() - 0.5F) * 350F * gameApplet.viewScale;
				Instantiate(1, 121, 2, true, f76, f77, 3.5F, -1, "");
				blue(1, false, false, 1.0F);
				temp_palette_1 = gameApplet.flashcolor_yellow;
				temp_palette_2 = gameApplet.flashcolor_red;
				gamefont31 = gameApplet.fontNormal;
				Transmision(-1, "Joining Us Are More Ships", temp_palette_1, temp_palette_2, gamefont31, true, j1,
						k1,
						0, 80, 0, true, true, 1, -1, 0);
				lightGray(50);
				lightGray(101, false);
				lightGray(40);
				getName();
				red(121);
				return;

			case 121: // 'y'
				final float f5 = gameApplet.worldBorderLeft + gameApplet.worldDimension[0] * 0.2F;
				final float f24 = gameApplet.worldBorderTop + gameApplet.worldDimension[1] * 0.2F;
				Object obj24 = gameApplet.gameUIObjects;
				((GameObjectPool) (obj24)).Attach(true, null, -1, -1, -1, -1);
				getName(0.3F);
				compareTo(1, 80);
				compareTo(2, 80);
				compareTo(3, 100);
				compareTo(5, 110);
				obj24 = gameApplet.flashcolor_yellow;
				final Palette palette4 = gameApplet.flashcolor_red;
				Font gamefont12 = gameApplet.fontNormal;
				Transmision(-1,
						"Destroy Their Re-Enforcements|Then Destroy Their Outpost||Atleast One Ship Must Survive!",
						((Palette) (obj24)), palette4, gamefont12, true, j1, k1, 0, 200, 0, true, true, 1, -1, 0);
				float f43 = f5 + 200F * gameApplet.viewScale;
				float f53 = f24 + 200F * gameApplet.viewScale;
				red(2, f43, f53, -1, 3);
				f43 = f5 + 300F * gameApplet.viewScale;
				f53 = f24 - 150F * gameApplet.viewScale;
				red(2, f43, f53, -1, 3);
				f43 = f5 - 150F * gameApplet.viewScale;
				f53 = f24 + 300F * gameApplet.viewScale;
				red(2, f43, f53, -1, 4);
				toString(2, -1, -1, -1, -1, -1);
				valueOf(2, 1102);
				lightGray(101, true);
				abs(1, 3, -1, 0, 0);
				HNSM(1, -1, -1, -1, -1, 3F);
				abs();
				toString(1, 1, -1, -1, -1, -1);
				println(1);
				append(false);
				lightGray(10);
				temp_palette_1 = gameApplet.flashcolor_white;
				temp_palette_2 = gameApplet.flashcolor_navy;
				gamefont12 = gameApplet.fontLarge;
				Transmision(-1, "All Clear!", temp_palette_1, temp_palette_2, gamefont12, true, j1, k1, 0, 90, 0,
						true,
						false, 0, -1, 0);
				getName(gameApplet.everySFXs, gameApplet.cZ, false);
				lightGray(20);
				random(1);
				lightGray(80);
				red(130);
				return;

			case 130:
				final float f6 = gameApplet.worldBorderLeft + gameApplet.worldDimension[0] * 0.5F;
				final float f25 = gameApplet.worldBorderTop + gameApplet.worldDimension[1] * 0.2F;
				P++;
				Object obj25 = gameApplet.wZ;
				((GameObjectPool) (obj25)).Attach(true, null, -1, -1, -1, -1);
				toString(4);
				out(1, 0.5F, 0.5F, false, -1, -1, -1, -1);
				F(1, -1, -1, -1, -1, 3);
				gray(f6, f25, true, 30F);
				obj25 = gameApplet.flashcolor_red;
				Palette palette5 = gameApplet.HZ;
				Object obj41 = gameApplet.fontLarge;
				Transmision(-1, "Mission Four - Transport Alley", ((Palette) (obj25)), palette5, ((Font) (obj41)),
						true, l, i1, 0, 80, 0, true, false, 0, -1, 0);
				getName(gameApplet.everySFXs, gameApplet.zZ, false);
				obj25 = gameApplet.flashcolor_white;
				palette5 = gameApplet.flashcolor_navy;
				obj41 = gameApplet.fontNormal;
				Transmision(10, "Skip Intro", ((Palette) (obj25)), palette5, ((Font) (obj41)), true, j2, k2, 0,
						10000, 0, true, false, 0, -1, 0);
				lightGray(10);
				gray(f6, f25, false, 30F);
				lightGray(90);
				getName();
				obj25 = gameApplet.flashcolor_yellow;
				palette5 = gameApplet.flashcolor_red;
				obj41 = gameApplet.fontNormal;
				Transmision(-1, "Entering The Wolf 359 System", ((Palette) (obj25)), palette5, ((Font) (obj41)),
						true, j1, k1, 0, 80, 0, true, true, 1, -1, 0);
				lightGray(10);
				max(1, f6, f25, 350F, 350F);
				lightGray(101, false);
				lightGray(40);
				blue(1, false, true, 1.0F);
				final int ai2[] = { 102, 112, 112, 121, -1 };
				InstantiateGroup(1, ai2, 2, true, f6, f25, 400F * gameApplet.viewScale, 8F);
				blue(1, false, false, 1.0F);
				lightGray(80);
				palette5 = gameApplet.flashcolor_yellow;
				obj41 = gameApplet.flashcolor_red;
				Font gamefont18 = gameApplet.fontNormal;
				Transmision(-1,
						"Empire Worlds Are Under Siege Here||We Must Break The Terran Siege And|Drive Them From This System",
						palette5, ((Palette) (obj41)), gamefont18, true, j1, k1, 0, 180, 0, true, true, 1, -1, 0);
				lightGray(190);
				palette5 = gameApplet.flashcolor_yellow;
				obj41 = gameApplet.flashcolor_red;
				gamefont18 = gameApplet.fontNormal;
				Transmision(-1, "Terran Tranports Are Attempting|star_blinking Re-Supply Run To Their Forces",
						palette5, ((Palette) (obj41)), gamefont18, true, j1, k1, 0, 150, 0, true, true, 1, -1, 0);
				lightGray(160);
				red(131);
				return;

			case 131:
				final float f7 = gameApplet.worldBorderLeft + gameApplet.worldDimension[0] * 0.5F;
				final float f26 = gameApplet.worldBorderTop + gameApplet.worldDimension[1] * 0.2F;
				Object obj26 = gameApplet.gameUIObjects;
				((GameObjectPool) (obj26)).Attach(true, null, -1, -1, -1, -1);
				getName(0.33F);
				compareTo(2, 100);
				compareTo(3, 100);
				obj26 = gameApplet.flashcolor_yellow;
				Object obj33 = gameApplet.flashcolor_red;
				Font gamefont13 = gameApplet.fontNormal;
				Transmision(-1,
						"Prevent The Terran Transports|From Reaching The Jump Point||Every Last Transport Must Be Destroyed!",
						((Palette) (obj26)), ((Palette) (obj33)), gamefont13, true, j1, k1, 0, 200, 0, true, true, 1,
						-1,
						0);
				abs(2, false, false, false, true);
				lightGray(101, true);
				red(2, f7, f26, -1, 1);
				blue(2, true, false, 1.0F);
				append(2, 132, -1, 1);
				abs(1, 3, -1, 0, 0);
				HNSM(1, -1, -1, -1, -1, 4F);
				abs();
				gray(2, 100, 210, 4F + 0.4F * Q);
				lightGray(2, Math.max(70 + -4 * Q, 23), 5, 1);
				lightGray(300);
				lightGray(2, Math.max(60 + -4 * Q, 20), 5, 1);
				lightGray(500);
				lightGray(2, Math.max(50 + -4 * Q, 16), 5, 1);
				lightGray(900 + 100 * Q);
				lightGray(2, -1, 0, 0);
				lightGray(75);
				obj26 = Color.lightGray;
				obj33 = Color.blue;
				gamefont13 = gameApplet.fontNormal;
				F(-1, "Almost Clear!", ((Color) (obj26)), ((Color) (obj33)), gamefont13, true, j1, k1, 0, 60, 0, true,
						true,
						1, null, null, -1, 0);
				append(false);
				toString(1, 1, -1, -1, -1, -1);
				println(1);
				lightGray(10);
				obj26 = gameApplet.flashcolor_white;
				obj33 = gameApplet.flashcolor_navy;
				gamefont13 = gameApplet.fontLarge;
				Transmision(-1, "All Clear!", ((Palette) (obj26)), ((Palette) (obj33)), gamefont13, true, j1, k1,
						0,
						90, 0, true, false, 0, -1, 0);
				getName(gameApplet.everySFXs, gameApplet.cZ, false);
				lightGray(100);
				red(140);
				return;

			case 132:
				compareTo(false);
				lightGray(30);
				Object obj5 = gameApplet.flashcolor_white;
				Object obj16 = gameApplet.flashcolor_navy;
				Font gamefont4 = gameApplet.fontSmall;
				Transmision(-1, "Objectives Failed||Aborting Mission", ((Palette) (obj5)), ((Palette) (obj16)),
						gamefont4, true, l1, i2, 0, 150, 0, true, true, 1, -1, 0);
				lightGray(100);
				obj5 = gameApplet.flashcolor_white;
				obj16 = gameApplet.flashcolor_navy;
				gamefont4 = gameApplet.fontNormal;
				Transmision(-1, "An Enemy Transport Has Escaped!", ((Palette) (obj5)), ((Palette) (obj16)),
						gamefont4,
						true, j1, k1, 0, 190, 0, true, true, 1, -1, 0);
				max(true, false, -1, -1, -1, -1, -1);
				lightGray(140);
				
				obj5 = Color.red;
				obj16 = Color.gray;
				gamefont4 = gameApplet.fontLarge;
				F(-1, "Game Over", ((Color) (obj5)), ((Color) (obj16)), gamefont4, true, j1, k1, 0, 300, 0, true, true,
						2,
						null, null, -1, 0);
				lightGray(5);
				gray();
				blue();
				return;

			case 140:
				Object obj6 = gameApplet.dZ;
				obj6 = ((GameObjectPool) (obj6)).mySize <= 0 ? null : ((Object) (((GameObjectPool) (obj6)).internalList[0]));
				final float f27 = ((GameObject) (obj6)).myX - 100F * gameApplet.viewScale;
				final float f44 = ((GameObject) (obj6)).myY;
				P++;
				Object obj34 = gameApplet.wZ;
				((GameObjectPool) (obj34)).Attach(true, null, -1, -1, -1, -1);
				out(1, 0.5F, 0.5F, false, -1, -1, -1, -1);
				red(1, 0.0F, 0.0F, -1, 4);
				gray(f27, f44, true, 30F);
				obj34 = gameApplet.flashcolor_red;
				Palette palette12 = gameApplet.HZ;
				Font gamefont19 = gameApplet.fontLarge;
				Transmision(-1, "Mission Five - Siege Lines", ((Palette) (obj34)), palette12, gamefont19, true, l,
						i1,
						0, 80, 0, true, false, 0, -1, 0);
				getName(gameApplet.everySFXs, gameApplet.zZ, false);
				obj34 = gameApplet.flashcolor_white;
				palette12 = gameApplet.flashcolor_navy;
				gamefont19 = gameApplet.fontNormal;
				Transmision(10, "Skip Intro", ((Palette) (obj34)), palette12, gamefont19, true, j2, k2, 0, 10000,
						0,
						true, false, 0, -1, 0);
				lightGray(10);
				gray(f27, f44, false, 30F);
				lightGray(90);
				getName();
				obj34 = gameApplet.flashcolor_yellow;
				palette12 = gameApplet.flashcolor_red;
				gamefont19 = gameApplet.fontNormal;
				Transmision(-1, "The Terrans Have Detected Us|And Dispatched Forces To Deal With Us",
						((Palette) (obj34)), palette12, gamefont19, true, j1, k1, 0, 150, 0, true, true, 1, -1, 0);
				lightGray(10);
				lightGray(101, false);
				lightGray(150);
				red(141);
				return;

			case 141:
				Object obj7 = gameApplet.gameUIObjects;
				gameApplet.gameUIObjects.Attach(true, null, -1, -1, -1, -1);
				
				getName(0.25F);
				compareTo(1, 120);
				compareTo(2, 60);
				compareTo(3, 100);
				compareTo(5, 100);
				compareTo(4, 100);
				obj7 = gameApplet.flashcolor_yellow;
				Object obj17 = gameApplet.flashcolor_red;
				Font gamefont5 = gameApplet.fontNormal;
				Transmision(-1, "Destroy All Incoming Enemies||Protect Your Ships||Atleast One Ship Must Survive!",
						((Palette) (obj7)), ((Palette) (obj17)), gamefont5, true, j1, k1, 0, 200, 0, true, true, 1, -1,
						0);
				abs(2, true, true, true, false);
				abs(1, 3, -1, 0, 0);
				HNSM(1, -1, -1, -1, -1, 4F);
				toString(2, -1, -1, -1, -1, -1);
				valueOf(2, 1102);
				lightGray(101, true);
				abs();
				gray(2, 100, 212, 4F + 0.4F * Q);
				gray(2, 100, 203, 4F + 0.4F * Q);
				gray(2, 100, 202, 4F + 0.4F * Q);
				gray(2, 100, 211, 4F + 0.4F * Q);
				lightGray(2, Math.max(90 + -4 * Q, 30), 5, 1);
				lightGray(300);
				gray(2, 150, 213, 4F + 0.4F * Q);
				lightGray(2, Math.max(80 + -3 * Q, 26), 10, 1);
				lightGray(400);
				gray(2, 200, 220, 4F + 0.4F * Q);
				lightGray(2, Math.max(70 + -3 * Q, 23), 5, 1);
				lightGray(800 + 100 * Q);
				lightGray(2, -1, 0, 0);
				lightGray(75);
				obj7 = Color.lightGray;
				obj17 = Color.blue;
				gamefont5 = gameApplet.fontNormal;
				F(-1, "Almost Clear!", ((Color) (obj7)), ((Color) (obj17)), gamefont5, true, j1, k1, 0, 60, 0, true,
						true,
						1, null, null, -1, 0);
				append(false);
				toString(1, 1, -1, -1, -1, -1);
				println(1);
				lightGray(10);
				obj7 = gameApplet.flashcolor_white;
				obj17 = gameApplet.flashcolor_navy;
				gamefont5 = gameApplet.fontLarge;
				Transmision(-1, "All Clear!", ((Palette) (obj7)), ((Palette) (obj17)), gamefont5, true, j1, k1, 0,
						90,
						0, true, false, 0, -1, 0);
				getName(gameApplet.everySFXs, gameApplet.cZ, false);
				lightGray(20);
				random(1);
				lightGray(80);
				red(150);
				return;

			case 150:
				final float f8 = gameApplet.worldBorderLeft + gameApplet.worldDimension[0] * 0.7F;
				final float f28 = gameApplet.worldBorderTop + gameApplet.worldDimension[1] * 0.3F;
				Palette temp_palette;
				P++;
				final Object obj27 = gameApplet.wZ;
				((GameObjectPool) (obj27)).Attach(true, null, -1, -1, -1, -1);
				out(1, 0.5F, 0.5F, false, -1, -1, -1, -1);
				F(1, -1, -1, -1, -1, 3);
				toString(3);
				blue(1, false, true, 1.0F);
				float f45 = f8 - 220F * gameApplet.viewScale;
				float f54 = f28 + 60F * gameApplet.viewScale;
				Instantiate(1, 130, 1, false, f45, f54, 0.0F, -1, "");
				f45 = f8 - 60F * gameApplet.viewScale;
				f54 = f28 + 220F * gameApplet.viewScale;
				Instantiate(1, 130, 1, false, f45, f54, 0.0F, -1, "");
				blue(1, false, false, 1.0F);
				gray(f8, f28, true, 30F);
				temp_palette = gameApplet.flashcolor_red;
				Palette palette6 = gameApplet.HZ;
				Font gamefont14 = gameApplet.fontLarge;
				Transmision(-1, "Mission Six - Desparate Times", temp_palette, palette6, gamefont14, true, l, i1,
						0,
						80, 0, true, false, 0, -1, 0);
				getName(gameApplet.everySFXs, gameApplet.zZ, false);
				temp_palette = gameApplet.flashcolor_white;
				palette6 = gameApplet.flashcolor_navy;
				gamefont14 = gameApplet.fontNormal;
				Transmision(10, "Skip Intro", temp_palette, palette6, gamefont14, true, j2, k2, 0, 10000, 0, true,
						false, 0, -1, 0);
				lightGray(90);
				getName();
				temp_palette = gameApplet.AZ;
				palette6 = gameApplet.flashcolor_navy;
				gamefont14 = gameApplet.fontNormal;
				Transmision(-1, "Tarymar - Wolf 359 System Main World", temp_palette, palette6, gamefont14, false,
						0,
						0, 0, 120, 0, true, true, 1, 102, 1);
				lightGray(130);
				getName();
				temp_palette = gameApplet.flashcolor_yellow;
				palette6 = gameApplet.flashcolor_red;
				gamefont14 = gameApplet.fontNormal;
				Transmision(-1, "Tarymar Has Thus Far Staved|Off The United Fleet Siege", temp_palette, palette6,
						gamefont14, true, j1, k1, 0, 120, 0, true, true, 1, -1, 0);
				lightGray(130);
				temp_palette = gameApplet.flashcolor_yellow;
				palette6 = gameApplet.flashcolor_red;
				gamefont14 = gameApplet.fontNormal;
				Transmision(-1,
						"The Terrans Are Massing For|star_blinking Final Attack Against Tarymar||Tarymar Cannot Fall",
						temp_palette, palette6, gamefont14, true, j1, k1, 0, 140, 0, true, true, 1, -1, 0);
				lightGray(150);
				red(151);
				return;

			case 151:
				final float f9 = gameApplet.worldBorderLeft + gameApplet.worldDimension[0] * 0.7F;
				final float f29 = gameApplet.worldBorderTop + gameApplet.worldDimension[1] * 0.3F;
				final GameObjectPool oGameObjectlist5 = gameApplet.gameUIObjects;
				oGameObjectlist5.Attach(true, null, -1, -1, -1, -1);
				getName(0.25F);
				compareTo(1, 120);
				compareTo(5, 100);
				float f46 = f9 - 300F * gameApplet.viewScale;
				float f55 = f29 + 300F * gameApplet.viewScale;
				red(1, f46, f55, -1, 3);
				f46 = f9 + 100F * gameApplet.viewScale;
				f55 = f29 + 350F * gameApplet.viewScale;
				red(1, f46, f55, -1, 3);
				f46 = f9 - 350F * gameApplet.viewScale;
				f55 = f29 + 350F * gameApplet.viewScale;
				red(1, f46, f55, -1, 3);
				f46 = f9 - 350F * gameApplet.viewScale;
				f55 = f29 - 100F * gameApplet.viewScale;
				red(1, f46, f55, -1, 4);
				max(1, f9 - 300F * gameApplet.viewScale,
						f29 + 300F * gameApplet.viewScale,
						350F * gameApplet.viewScale, 350F * gameApplet.viewScale);
				lightGray(101, false);
				getName();
				lightGray(101, true);
				lightGray(40);
				blue(1, false, true, 1.0F);
				final int ai3[] = { 121, 120, 111, 112, 112, -1 };
				InstantiateGroup(1, ai3, 2, true, f9 - 300F * gameApplet.viewScale,
						f29 + 300F * gameApplet.viewScale,
						350F * gameApplet.viewScale, 8F);
				blue(1, false, false, 1.0F);
				Object obj35 = gameApplet.flashcolor_yellow;
				Object obj42 = gameApplet.flashcolor_red;
				Font gamefont20 = gameApplet.fontNormal;
				Transmision(-1,
						"Hold Off The United Fleet Advance||Protect The Ships And Outposts||Atleast One Must Survive!",
						((Palette) (obj35)), ((Palette) (obj42)), gamefont20, true, j1, k1, 0, 200, 0, true, true, 1,
						-1,
						0);
				abs(2, false, false, false, true);
				abs(1, 3, -1, 0, 0);
				toString(2, -1, -1, -1, -1, -1);
				valueOf(2, 1102);
				HNSM(1, -1, -1, -1, -1, 3F);
				abs(2, true, false, false, true);
				abs();
				gray(2, 100, 220, 4F + 0.4F * Q);
				gray(2, 80, 221, 4F + 0.4F * Q);
				gray(2, 100, 222, 4F + 0.4F * Q);
				gray(2, 100, 213, 4F + 0.4F * Q);
				gray(2, 100, 212, 4F + 0.4F * Q);
				gray(2, 100, 202, 4F + 0.4F * Q);
				lightGray(2, Math.max(70 + -4 * Q, 23), 5, 1);
				lightGray(300);
				lightGray(2, Math.max(60 + -4 * Q, 20), 5, 1);
				lightGray(500);
				lightGray(2, Math.max(65 + -4 * Q, 21), 5, 1);
				lightGray(900 + 100 * Q);
				lightGray(2, -1, 0, 0);
				lightGray(75);
				obj35 = Color.lightGray;
				obj42 = Color.blue;
				gamefont20 = gameApplet.fontNormal;
				F(-1, "Almost Clear!", ((Color) (obj35)), ((Color) (obj42)), gamefont20, true, j1, k1, 0, 60, 0, true,
						true,
						1, null, null, -1, 0);
				append(false);
				toString(1, 1, -1, -1, -1, -1);
				println(1);
				lightGray(10);
				obj35 = gameApplet.flashcolor_white;
				obj42 = gameApplet.flashcolor_navy;
				gamefont20 = gameApplet.fontLarge;
				Transmision(-1, "All Clear!", ((Palette) (obj35)), ((Palette) (obj42)), gamefont20, true, j1, k1,
						0,
						90, 0, true, false, 0, -1, 0);
				getName(gameApplet.everySFXs, gameApplet.cZ, false);
				lightGray(20);
				random(1);
				lightGray(80);
				red(160);
				return;

			case 160:
				final float f10 = gameApplet.worldBorderLeft + gameApplet.worldDimension[0] * 0.8F;
				final float f30 = gameApplet.worldBorderLeft + gameApplet.worldDimension[0] * 0.2F;
				P++;
				final GameObjectPool oGameObjectlist6 = gameApplet.wZ;
				oGameObjectlist6.Attach(true, null, -1, -1, -1, -1);
				max(true, true, 1, -1, -1, 130, -1);
				out(1, 0.5F, 0.5F, false, -1, -1, -1, -1);
				F(1, -1, -1, -1, -1, 3);
				toString(5);
				blue(1, false, true, 0.0F);
				Instantiate(1, 131, 1, false, f10, 0.0F, 0.0F, -1, "");
				blue(1, false, true, 1.0F);
				final int ai4[] = { 121, 120, 111, 112, -1 };
				InstantiateGroup(1, ai4, 2, true, f10 - 200F * gameApplet.viewScale, 0.0F,
						300F * gameApplet.viewScale, 8F);
				blue(1, false, false, 1.0F);
				gray(f10, 0.0F, true, 30F);
				Palette palette7 = gameApplet.flashcolor_red;
				Palette palette13 = gameApplet.HZ;
				Font gamefont21 = gameApplet.fontLarge;
				Transmision(-1, "Mission Seven - Starbase 69", palette7, palette13, gamefont21, true, l, i1, 0, 80,
						0,
						true, false, 0, -1, 0);
				getName(gameApplet.everySFXs, gameApplet.zZ, false);
				palette7 = gameApplet.flashcolor_white;
				palette13 = gameApplet.flashcolor_navy;
				gamefont21 = gameApplet.fontNormal;
				Transmision(10, "Skip Intro", palette7, palette13, gamefont21, true, j2, k2, 0, 10000, 0, true,
						false,
						0, -1, 0);
				lightGray(90);
				getName();
				palette7 = gameApplet.flashcolor_yellow;
				palette13 = gameApplet.flashcolor_red;
				gamefont21 = gameApplet.fontNormal;
				Transmision(-1, "Starbase 69 In The Centauri|System Must Be Resupplied", palette7, palette13,
						gamefont21, true, j1, k1, 0, 120, 0, true, true, 1, -1, 0);
				lightGray(80);
				gray(f30, 0.0F, false, 30F);
				lightGray(50);
				palette7 = gameApplet.flashcolor_yellow;
				palette13 = gameApplet.flashcolor_red;
				gamefont21 = gameApplet.fontNormal;
				Transmision(-1, "Transports Shall Be Dispatched|To Make star_blinking Re-Supply Run", palette7,
						palette13, gamefont21, true, j1, k1, 0, 120, 0, true, true, 1, -1, 0);
				lightGray(130);
				red(161);
				return;

			case 161:
				final float f11 = gameApplet.worldBorderLeft + gameApplet.worldDimension[0] * 0.8F;
				final float f31 = gameApplet.worldBorderLeft + gameApplet.worldDimension[0] * 0.2F;
				final GameObjectPool oGameObjectlist7 = gameApplet.gameUIObjects;
				oGameObjectlist7.Attach(true, null, -1, -1, -1, -1);
				getName(0.25F);
				compareTo(1, 120);
				compareTo(5, 120);
				compareTo(4, 80);
				red(1, f11, 0.0F, 100, 3);
				red(1, f11 + 200F * gameApplet.viewScale,
						0.0F + 300F * gameApplet.viewScale, 100, 1);
				max(1, f31 - 200F * gameApplet.viewScale,
						0.0F * gameApplet.viewScale,
						350F * gameApplet.viewScale, 350F * gameApplet.viewScale);
				lightGray(101, false);
				getName();
				lightGray(101, true);
				lightGray(40);
				blue(1, false, true, 1.0F);
				final int ai5[] = { 121, 120, -1 };
				InstantiateGroup(1, ai5, 2, true, f31 - 300F * gameApplet.viewScale,
						0.0F + 300F * gameApplet.viewScale,
						350F * gameApplet.viewScale, 8F);
				blue(1, false, false, 1.0F);
				Object obj36 = gameApplet.flashcolor_yellow;
				Object obj43 = gameApplet.flashcolor_red;
				Font gamefont22 = gameApplet.fontNormal;
				Transmision(-1,
						"Protect The Transports As|They Make Their Supply Run||At Most Six Transports Can Be Lost!",
						((Palette) (obj36)), ((Palette) (obj43)), gamefont22, true, j1, k1, 0, 200, 0, true, true, 1,
						-1,
						0);
				abs(2, false, true, false, true);
				abs(1, 3, -1, 0, 0);
				append(1, 162, 6, -1);
				HNSM(1, -1, -1, -1, -1, 3F);
				abs();
				blue(1, true, true, 10F);
				Instantiate(1, 100, 3, false, f31, -50F, 3F, -1, "");
				gray(2, 100, 222, 3F + 0.4F * Q);
				gray(2, 100, 213, 3.5F + 0.4F * Q);
				gray(2, 100, 212, 3.5F + 0.4F * Q);
				gray(2, 100, 202, 4.5F + 0.4F * Q);
				lightGray(2, Math.max(80 + -4 * Q, 26), 5, 1);
				lightGray(50);
				Instantiate(1, 100, 3, false, f31, 50F, 3F, -1, "");
				lightGray(250);
				Instantiate(1, 100, 3, false, f31, -50F, 3F, -1, "");
				lightGray(50);
				Instantiate(1, 100, 3, false, f31, 50F, 3F, -1, "");
				lightGray(250);
				lightGray(2, Math.max(65 + -4 * Q, 21), 5, 1);
				Instantiate(1, 100, 3, false, f31, -50F, 3F, -1, "");
				lightGray(50);
				Instantiate(1, 100, 3, false, f31, 50F, 3F, -1, "");
				lightGray(250);
				Instantiate(1, 100, 3, false, f31, -50F, 3F, -1, "");
				lightGray(50);
				Instantiate(1, 100, 3, false, f31, 50F, 3F, -1, "");
				lightGray(250);
				Instantiate(1, 100, 3, false, f31, -50F, 3F, -1, "");
				lightGray(50);
				Instantiate(1, 100, 3, false, f31, 50F, 3F, -1, "");
				lightGray(250);
				lightGray(2, Math.max(75 + -4 * Q, 25), 5, 1);
				Instantiate(1, 100, 3, false, f31, -50F, 3F, -1, "");
				lightGray(50);
				Instantiate(1, 100, 3, false, f31, 50F, 3F, -1, "");
				lightGray(800);
				lightGray(2, -1, 0, 0);
				lightGray(75);
				obj36 = Color.lightGray;
				obj43 = Color.blue;
				gamefont22 = gameApplet.fontNormal;
				F(-1, "Almost Clear!", ((Color) (obj36)), ((Color) (obj43)), gamefont22, true, j1, k1, 0, 60, 0, true,
						true,
						1, null, null, -1, 0);
				append(false);
				toString(1, 1, -1, -1, -1, -1);
				println(1);
				lightGray(10);
				obj36 = gameApplet.flashcolor_white;
				obj43 = gameApplet.flashcolor_navy;
				gamefont22 = gameApplet.fontLarge;
				Transmision(-1, "All Clear!", ((Palette) (obj36)), ((Palette) (obj43)), gamefont22, true, j1, k1,
						0,
						90, 0, true, false, 0, -1, 0);
				getName(gameApplet.everySFXs, gameApplet.cZ, false);
				lightGray(20);
				random(1);
				lightGray(80);
				red(170);
				return;

			case 162:
				compareTo(false);
				lightGray(30);
				Object obj8 = gameApplet.flashcolor_white;
				Object obj18 = gameApplet.flashcolor_navy;
				Font gamefont6 = gameApplet.fontSmall;
				Transmision(-1, "Objectives Failed||Aborting Mission", ((Palette) (obj8)), ((Palette) (obj18)),
						gamefont6, true, l1, i2, 0, 150, 0, true, true, 1, -1, 0);
				lightGray(100);
				obj8 = gameApplet.flashcolor_white;
				obj18 = gameApplet.flashcolor_navy;
				gamefont6 = gameApplet.fontNormal;
				Transmision(-1, "Too Many Transports Have Been Lost!", ((Palette) (obj8)), ((Palette) (obj18)),
						gamefont6, true, j1, k1, 0, 190, 0, true, true, 1, -1, 0);
				max(true, false, -1, -1, -1, -1, -1);
				lightGray(140);
				obj8 = Color.red;
				obj18 = Color.gray;
				gamefont6 = gameApplet.fontLarge;
				F(-1, "Game Over", ((Color) (obj8)), ((Color) (obj18)), gamefont6, true, j1, k1, 0, 300, 0, true, true,
						2,
						null, null, -1, 0);
				lightGray(5);
				gray();
				blue();
				return;

			case 170:
				final float f12 = gameApplet.worldBorderLeft + gameApplet.worldDimension[0] * 0.4F;
				final float f32 = gameApplet.worldBorderTop + gameApplet.worldDimension[1] * 0.5F;
				P++;
				out(1, 0.5F, 0.5F, false, -1, -1, -1, -1);
				Object obj28 = gameApplet.wZ;
				((GameObjectPool) (obj28)).Attach(true, null, -1, -1, -1, -1);
				max(true, true, 1, -1, -1, 100, -1);
				max(true, true, 1, -1, -1, 131, -1);
				F(1, -1, -1, -1, -1, 3);
				toString(6);
				gray(f12, f32, true, 30F);
				obj28 = gameApplet.flashcolor_red;
				Palette palette8 = gameApplet.HZ;
				Font gamefont15 = gameApplet.fontLarge;
				Transmision(-1, "Mission Eight - Carrier Battle", ((Palette) (obj28)), palette8, gamefont15, true,
						l,
						i1, 0, 80, 0, true, false, 0, -1, 0);
				getName(gameApplet.everySFXs, gameApplet.zZ, false);
				obj28 = gameApplet.flashcolor_white;
				palette8 = gameApplet.flashcolor_navy;
				gamefont15 = gameApplet.fontNormal;
				Transmision(10, "Skip Intro", ((Palette) (obj28)), palette8, gamefont15, true, j2, k2, 0, 10000, 0,
						true, false, 0, -1, 0);
				lightGray(90);
				getName();
				obj28 = gameApplet.flashcolor_yellow;
				palette8 = gameApplet.flashcolor_red;
				gamefont15 = gameApplet.fontNormal;
				Transmision(-1,
						"The Day Of Our Revenge Begins Now||The Assualt Will Now Commence|On The Terran Home System",
						((Palette) (obj28)), palette8, gamefont15, true, j1, k1, 0, 180, 0, true, true, 1, -1, 0);
				lightGray(190);
				getName();
				obj28 = gameApplet.flashcolor_yellow;
				palette8 = gameApplet.flashcolor_red;
				gamefont15 = gameApplet.fontNormal;
				Transmision(-1, "We Will Jump In Just Outside Of|Saturn And Destroy Their Carrier Forces",
						((Palette) (obj28)), palette8, gamefont15, true, j1, k1, 0, 130, 0, true, true, 1, -1, 0);
				lightGray(140);
				red(171);
				return;

			case 171:
				final float f13 = gameApplet.worldBorderLeft + gameApplet.worldDimension[0] * 0.4F;
				final float f33 = gameApplet.worldBorderTop + gameApplet.worldDimension[1] * 0.5F;
				final GameObjectPool oGameObjectlist8 = gameApplet.gameUIObjects;
				oGameObjectlist8.Attach(true, null, -1, -1, -1, -1);
				getName(0.25F);
				compareTo(1, 100);
				compareTo(5, 60);
				compareTo(3, 80);
				compareTo(4, 100);
				max(1, f13, f33, 350F * gameApplet.viewScale,
						350F * gameApplet.viewScale);
				lightGray(101, false);
				getName();
				lightGray(101, true);
				lightGray(50);
				blue(1, false, true, 1.0F);
				final int ai6[] = { 122, 123, 120, 121, 112, 111, 112, 111, -1 };
				InstantiateGroup(1, ai6, 2, true, f13 - 300F * gameApplet.viewScale,
						f33 + 300F * gameApplet.viewScale,
						350F * gameApplet.viewScale, 8F);
				blue(1, false, false, 1.0F);
				Object obj37 = gameApplet.flashcolor_yellow;
				Object obj44 = gameApplet.flashcolor_red;
				Font gamefont23 = gameApplet.fontNormal;
				Transmision(-1, "Destroy All Enemy Ships||Protect Our Ships||Atleast One Must Survive!",
						((Palette) (obj37)), ((Palette) (obj44)), gamefont23, true, j1, k1, 0, 200, 0, true, true, 1,
						-1,
						0);
				abs(1, 3, -1, 0, 0);
				toString(2, -1, -1, -1, -1, -1);
				valueOf(2, 1102);
				HNSM(1, -1, -1, -1, -1, 3F);
				abs(2, true, true, true, true);
				abs();
				gray(2, 150, 223, 4F + 0.4F * Q);
				gray(2, 100, 221, 4F + 0.4F * Q);
				gray(2, 100, 222, 4F + 0.4F * Q);
				gray(2, 120, 212, 4F + 0.4F * Q);
				gray(2, 120, 202, 4F + 0.4F * Q);
				lightGray(2, Math.max(95 + -4 * Q, 31), 5, 1);
				lightGray(300);
				lightGray(2, Math.max(75 + -4 * Q, 25), 5, 1);
				lightGray(500);
				lightGray(2, Math.max(80 + -4 * Q, 26), 5, 1);
				lightGray(900 + 100 * Q);
				lightGray(2, -1, 0, 0);
				lightGray(75);
				obj37 = Color.lightGray;
				obj44 = Color.blue;
				gamefont23 = gameApplet.fontNormal;
				F(-1, "Almost Clear!", ((Color) (obj37)), ((Color) (obj44)), gamefont23, true, j1, k1, 0, 60, 0, true,
						true,
						1, null, null, -1, 0);
				append(false);
				toString(1, 1, -1, -1, -1, -1);
				println(1);
				lightGray(10);
				obj37 = gameApplet.flashcolor_white;
				obj44 = gameApplet.flashcolor_navy;
				gamefont23 = gameApplet.fontLarge;
				Transmision(-1, "All Clear!", ((Palette) (obj37)), ((Palette) (obj44)), gamefont23, true, j1, k1,
						0,
						90, 0, true, false, 0, -1, 0);
				getName(gameApplet.everySFXs, gameApplet.cZ, false);
				lightGray(20);
				random(1);
				lightGray(80);
				red(180);
				return;

			case 180:
				final float f14 = gameApplet.worldBorderLeft + gameApplet.worldDimension[0] * 0.75F;
				final float f34 = gameApplet.worldBorderTop + gameApplet.worldDimension[1] * 0.75F;
				final float f47 = gameApplet.worldBorderLeft + gameApplet.worldDimension[0] * 0.2F;
				final float f56 = gameApplet.worldBorderTop + gameApplet.worldDimension[1] * 0.2F;
				P++;
				final GameObjectPool oGameObjectlist11 = gameApplet.wZ;
				oGameObjectlist11.Attach(true, null, -1, -1, -1, -1);
				out(1, 0.5F, 0.5F, false, -1, -1, -1, -1);
				F(1, -1, -1, -1, -1, 3);
				toString(7);
				blue(2, false, true, 1.0F);
				float f61 = f14 - 320F * gameApplet.viewScale;
				Instantiate(2, 230, 1, false, f61, f34, 0.0F, -1, "");
				f61 = f14 - 180F * gameApplet.viewScale;
				float f66 = f34 - 180F * gameApplet.viewScale;
				Instantiate(2, 230, 1, false, f61, f66, 0.0F, -1, "");
				f61 = f14 + 25F * gameApplet.viewScale;
				f66 = f34 - 310F * gameApplet.viewScale;
				Instantiate(2, 230, 1, false, f61, f66, 0.0F, -1, "");
				final int ai11[] = { 221, 222, 220, 203, 201, 213, -1 };
				InstantiateGroup(2, ai11, 2, true, f14 - 200F * gameApplet.viewScale,
						f34 - 200F * gameApplet.viewScale,
						400F * gameApplet.viewScale, 3F);
				blue(2, false, false, 1.0F);
				f66 = f14 - 80F * gameApplet.viewScale;
				final float f70 = f34 - 80F * gameApplet.viewScale;
				gray(f66, f70, true, 30F);
				Palette palette17 = gameApplet.flashcolor_red;
				Palette palette19 = gameApplet.HZ;
				Font gamefont28 = gameApplet.fontLarge;
				Transmision(-1, "Mission Nine - God Of War", palette17, palette19, gamefont28, true, l, i1, 0, 80,
						0,
						true, false, 0, -1, 0);
				getName(gameApplet.everySFXs, gameApplet.zZ, false);
				palette17 = gameApplet.flashcolor_white;
				palette19 = gameApplet.flashcolor_navy;
				gamefont28 = gameApplet.fontNormal;
				Transmision(10, "Skip Intro", palette17, palette19, gamefont28, true, j2, k2, 0, 10000, 0, true,
						false,
						0, -1, 0);
				lightGray(90);
				getName();
				palette17 = gameApplet.flashcolor_yellow;
				palette19 = gameApplet.flashcolor_red;
				gamefont28 = gameApplet.fontNormal;
				Transmision(-1, "The United Fleet Has Pulled Back||Leaving Mars Defended Mostly By Outposts",
						palette17, palette19, gamefont28, true, j1, k1, 0, 120, 0, true, true, 1, -1, 0);
				lightGray(60);
				gray(f47, f56, false, 30F);
				lightGray(70);
				palette17 = gameApplet.flashcolor_yellow;
				palette19 = gameApplet.flashcolor_red;
				gamefont28 = gameApplet.fontNormal;
				Transmision(-1, "We Will Take Mars Before The Earth", palette17, palette19, gamefont28, true, j1,
						k1,
						0, 100, 0, true, true, 1, -1, 0);
				lightGray(110);
				red(181);
				return;

			case 181:
				final float f15 = gameApplet.worldBorderLeft + gameApplet.worldDimension[0] * 0.2F;
				final float f35 = gameApplet.worldBorderTop + gameApplet.worldDimension[1] * 0.2F;
				final GameObjectPool oGameObjectlist9 = gameApplet.gameUIObjects;
				oGameObjectlist9.Attach(true, null, -1, -1, -1, -1);
				getName(0.25F);
				compareTo(1, 100);
				compareTo(5, 60);
				compareTo(3, 80);
				compareTo(4, 100);
				getName();
				max(1, f15, f35, 350F, 350F);
				abs(2, 3, -1, 0, 0);
				lightGray(101, false);
				getName();
				lightGray(101, true);
				lightGray(50);
				blue(1, false, true, 1.0F);
				final int ai7[] = { 122, 120, 121, -1 };
				InstantiateGroup(1, ai7, 2, true, f15, f35, 400F * gameApplet.viewScale, 3F);
				blue(1, false, false, 1.0F);
				Palette palette9 = gameApplet.flashcolor_yellow;
				Palette palette14 = gameApplet.flashcolor_red;
				Font gamefont24 = gameApplet.fontNormal;
				Transmision(-1, "Destroy All United Fleet Forces||Protect Your Ships||Atleast One Must Survive!",
						palette9, palette14, gamefont24, true, j1, k1, 0, 200, 0, true, true, 1, -1, 0);
				abs(2, true, false, false, true);
				abs(1, 3, -1, 0, 0);
				toString(2, -1, -1, -1, -1, -1);
				valueOf(2, 1102);
				HNSM(1, -1, -1, -1, -1, 3F);
				abs(2, true, false, false, true);
				abs();
				toString(1, 1, -1, -1, -1, -1);
				println(1);
				append(false);
				lightGray(10);
				palette9 = gameApplet.flashcolor_white;
				palette14 = gameApplet.flashcolor_navy;
				gamefont24 = gameApplet.fontLarge;
				Transmision(-1, "All Clear!", palette9, palette14, gamefont24, true, j1, k1, 0, 90, 0, true, false,
						0,
						-1, 0);
				getName(gameApplet.everySFXs, gameApplet.cZ, false);
				lightGray(20);
				random(1);
				lightGray(80);
				red(190);
				return;

			case 190:
				final float f16 = gameApplet.worldBorderLeft + gameApplet.worldDimension[0] * 0.75F;
				final float f36 = gameApplet.worldBorderTop + gameApplet.worldDimension[1] * 0.25F;
				final float f48 = gameApplet.worldBorderLeft + gameApplet.worldDimension[0] * 0.2F;
				final float f57 = gameApplet.worldBorderTop + gameApplet.worldDimension[1] * 0.8F;
				P++;
				final GameObjectPool oGameObjectlist12 = gameApplet.wZ;
				oGameObjectlist12.Attach(true, null, -1, -1, -1, -1);
				out(1, 0.5F, 0.5F, false, -1, -1, -1, -1);
				F(1, -1, -1, -1, -1, 3);
				toString(8);
				blue(2, false, true, 1.0F);
				float f62 = f16 - 300F;
				float f67 = f36 + 60F;
				Instantiate(2, 231, 1, false, f62, f67, 0.0F, -1, "");
				f62 = f16 - 40F;
				f67 = f36 + 240F;
				Instantiate(2, 230, 1, false, f62, f67, 0.0F, -1, "");

				final int ai12[] = { 221, 221, 222, 223, 220, 220, 203, 203, 212, 212, 213, 213, -1 };
				InstantiateGroup(2, ai12, 2, true, f16 - 200F * gameApplet.viewScale, f36 + 200F * gameApplet.viewScale, 400F * gameApplet.viewScale, 3F);

				blue(2, false, false, 1.0F);
				red(2, f16 - 300F * gameApplet.viewScale,
						f36 + 300F * gameApplet.viewScale, 212, 3);
				red(2, f16 + 100F * gameApplet.viewScale,
						f36 + 350F * gameApplet.viewScale, 212, 3);
				red(2, f16 - 350F * gameApplet.viewScale,
						f36 + 350F * gameApplet.viewScale, 212, 3);
				red(2, f16 - 350F * gameApplet.viewScale,
						f36 - 100F * gameApplet.viewScale, 212, 4);
				gray(f16, f36, true, 30F);
				Palette palette18 = gameApplet.flashcolor_red;
				Palette palette20 = gameApplet.HZ;
				Font gamefont29 = gameApplet.fontLarge;
				Transmision(-1, "Final Mission - Apocalypse Now", palette18, palette20, gamefont29, true, l, i1, 0,
						80,
						0, true, false, 0, -1, 0);
				getName(gameApplet.everySFXs, gameApplet.zZ, false);
				palette18 = gameApplet.flashcolor_white;
				palette20 = gameApplet.flashcolor_navy;
				gamefont29 = gameApplet.fontNormal;
				Transmision(10, "Skip Intro", palette18, palette20, gamefont29, true, j2, k2, 0, 10000, 0, true,
						false,
						0, -1, 0);
				lightGray(90);
				getName();
				palette18 = gameApplet.flashcolor_yellow;
				palette20 = gameApplet.flashcolor_red;
				gamefont29 = gameApplet.fontNormal;
				Transmision(-1, "The Time To Exact|Our Revenge Is Upon Us", palette18, palette20, gamefont29, true,
						j1,
						k1, 0, 120, 0, true, true, 1, -1, 0);
				lightGray(80);
				gray(f48, f57, false, 30F);
				lightGray(50);
				palette18 = gameApplet.flashcolor_yellow;
				palette20 = gameApplet.flashcolor_red;
				gamefont29 = gameApplet.fontNormal;
				Transmision(-1, "The Time To Destroy The Earth Is Now!", palette18, palette20, gamefont29, true,
						j1,
						k1, 0, 120, 0, true, true, 1, -1, 0);
				lightGray(130);
				red(191);
				return;

			case 191:
				final float f17 = gameApplet.worldBorderLeft + gameApplet.worldDimension[0] * 0.2F;
				final float f37 = gameApplet.worldBorderTop + gameApplet.worldDimension[1] * 0.8F;
				final GameObjectPool oGameObjectlist10 = gameApplet.gameUIObjects;
				oGameObjectlist10.Attach(true, null, -1, -1, -1, -1);
				getName(0.25F);
				compareTo(1, 120);
				compareTo(5, 80);
				compareTo(4, 100);
				getName();
				max(1, f17, f37, 350F * gameApplet.viewScale,
						350F * gameApplet.viewScale);
				lightGray(101, false);
				abs(2, 3, -1, 0, 0);
				getName();
				lightGray(101, true);
				lightGray(50);
				blue(1, false, true, 1.0F);
				final int ai8[] = { 120, 121, 121, 112, 111, 102, 102, -1 };
				InstantiateGroup(1, ai8, 2, true, f17, f37, 400F * gameApplet.viewScale, 3F);
				final float f58 = f17 - 150F * gameApplet.viewScale;
				final float f63 = f37 + 150F * gameApplet.viewScale;
				Instantiate(1, 123, 2, false, f58, f63, 3F, -1, "");
				blue(1, false, false, 1.0F);
				Palette palette10 = gameApplet.flashcolor_yellow;
				Palette palette15 = gameApplet.flashcolor_red;
				Font gamefont25 = gameApplet.fontNormal;
				Transmision(-1,
						"Destroy All United Fleet Forces||Only Their Complete And Utter|Destruction Is Acceptable!",
						palette10, palette15, gamefont25, true, j1, k1, 0, 200, 0, true, true, 1, -1, 0);
				abs(2, true, false, false, true);
				abs(1, 3, -1, 0, 0);
				HNSM(1, -1, -1, -1, -1, 3F);
				abs(2, true, false, false, true);
				abs();
				toString(1, 1, -1, -1, -1, -1);
				println(1);
				append(false);
				lightGray(10);
				palette10 = gameApplet.flashcolor_white;
				palette15 = gameApplet.flashcolor_navy;
				gamefont25 = gameApplet.fontLarge;
				Transmision(-1, "All Clear!", palette10, palette15, gamefont25, true, j1, k1, 0, 90, 0, true,
						false, 0,
						-1, 0);
				getName(gameApplet.everySFXs, gameApplet.cZ, false);
				lightGray(20);
				red(200);
				return;

			case 200:
				final float f18 = gameApplet.worldBorderLeft + gameApplet.worldDimension[0] * 0.65F;
				final float f38 = gameApplet.worldBorderTop + gameApplet.worldDimension[1] * 0.3F;

				gameApplet.wZ.Attach(true, null, -1, -1, -1, -1);

				random(1);
				lightGray(80);
				append(true);
				lightGray(103, false);
				getName();
				lightGray(10);

				final Object obj29 = gameApplet.flashcolor_yellow;
				Object obj38 = gameApplet.flashcolor_red;
				Object obj45 = gameApplet.fontNormal;
				Transmision(-1,
						"The Earth Is Defenseless...||The Terrans Will Now Pay|For Desvastating Our Homeworld!",
						((Palette) (obj29)), ((Palette) (obj38)), ((Font) (obj45)), true, j1, k1, 0, 140, 0, true, true,
						1, -1, 0);
				lightGray(50);
				gray(f18, f38, false, 30F);
				getName();
				final int ai9[] = { 121, 121, 120, 120, 111, 112, -1 };
				InstantiateGroup(1, ai9, 3, true, f18, f38, 350F * gameApplet.viewScale, 3F);
				random(1.0F, 1, -1, -1, -1, 103);
				lightGray(100);
				lightGray(103, false);
				getName();
				lightGray(220);
				obj38 = gameApplet.flashcolor_yellow;
				obj45 = gameApplet.flashcolor_red;
				Font gamefont26 = gameApplet.fontNormal;
				Transmision(-1, "All Ships Leave Immediately", ((Palette) (obj38)), ((Palette) (obj45)),
						gamefont26,
						true, j1, k1, 0, 80, 0, true, true, 1, -1, 0);
				lightGray(20);
				red(1, f18, f38, -1, 1);
				lightGray(60);
				compareTo(false);
				lightGray(20);
				max(false, true, -1, 10, -1, -1, 103);
				lightGray(150);
				obj38 = gameApplet.flashcolor_yellow;
				obj45 = gameApplet.flashcolor_red;
				gamefont26 = gameApplet.fontNormal;
				Transmision(-1, "Such Shall Be The Fate For All Terrans", ((Palette) (obj38)), ((Palette) (obj45)),
						gamefont26, true, j1, k1, 0, 80, 0, true, true, 1, -1, 0);
				lightGray(90);
				obj38 = gameApplet.flashcolor_yellow;
				obj45 = gameApplet.flashcolor_red;
				gamefont26 = gameApplet.fontNormal;
				Transmision(-1,
						"We Must Now Destroy The One|Place We Could Never Conquer.||Our Nemesis... Apocalypse Outpost",
						((Palette) (obj38)), ((Palette) (obj45)), gamefont26, true, j1, k1, 0, 160, 0, true, true, 1,
						-1,
						0);
				lightGray(170);
				obj38 = gameApplet.flashcolor_white;
				obj45 = gameApplet.flashcolor_navy;
				gamefont26 = gameApplet.fontNormal;
				Transmision(-1, "Coming Next To The Realspace Saga", ((Palette) (obj38)), ((Palette) (obj45)),
						gamefont26, true, j, k, 0, 120, 0, true, true, 0, -1, 0);
				lightGray(130);
				obj38 = gameApplet.flashcolor_white;
				obj45 = gameApplet.flashcolor_navy;
				gamefont26 = gameApplet.fontNormal;
				Transmision(-1, "Realspace 3 - Apocalypse Returns", ((Palette) (obj38)), ((Palette) (obj45)),
						gamefont26, true, j, k, 0, 200, 0, true, true, 0, -1, 0);
				lightGray(210);
				obj38 = Color.red;
				obj45 = Color.gray;
				gamefont26 = gameApplet.fontLarge;
				F(-1, "Game Over", ((Color) (obj38)), ((Color) (obj45)), gamefont26, true, j1, k1, 0, 300, 0, true,
						true, 2,
						null, null, -1, 0);
				lightGray(5);
				gray();
				blue();
				return;
		}
	}

	final void I() {
		label0: {
			label1: {
				I.Z();
				C.Z();
				if (getName > 0) {
					compareTo--;
					if (compareTo == 0) {
						valueOf((int) (Math.random() * lightGray) + 1);
						compareTo = (int) (Math.random() * gray) + getName;
					}
				}

				if (!gameApplet.isAudioMuted && gameApplet.qC)
				{
					final GameObjectPool oGameObjectlist1 = gameApplet.dZ;
					if (oGameObjectlist1.mySize == 0)
						ExecuteTriggers(1101);
				}
				if (valueOf) {
					if (!gameApplet.myCamera.A())
						return;
					valueOf = false;
				}
				if (!K)
					break label0;
				if (gameApplet.wZ.I(1, -1, -1, -1, -1, -1F) != null || gameApplet.yZ.I(1, -1, -1, -1, -1, -1F) != null
						|| gameApplet.BC.I(1, -1, -1, -1, -1, -1F) != null)
					return;
				gameApplet.qC = false;
				
				final GameObjectPool obj = gameApplet.dZ;
				oSpaceship nobj = null;
				nobj = (oSpaceship) (obj.mySize <= 0 ? null : obj.internalList[0]);
				if (nobj != null) {
					nobj.Z = false;
					nobj.C = 0;
					nobj.B = 0;
				}
				final GameObjectPool oGameObjectlist3 = gameApplet.IC;
				if (oGameObjectlist3.mySize == 0) {
					final GameObjectPool oGameObjectlist4 = gameApplet.oZ;
					if (oGameObjectlist4.mySize == 0)
						break label1;
				}
				return;
			}
			K = false;
			return;
		}
		if (H > 0) {
			H--;
			return;
		}
		if (append)
			if (blue == 2) {
				final GameQuest gameobjectivelist1 = C;
				if (gameobjectivelist1.C < gameobjectivelist1.Z || false)
					return;
			} else {
				final GameQuest gameobjectivelist2 = I;
				if (gameobjectivelist2.C < gameobjectivelist2.Z || false)
					return;
			}
		if (L) {
			final GameObjectPool oGameObjectlist2 = gameApplet.wZ;
			final boolean flag1 = M;
			boolean flag;
			if (oGameObjectlist2.mySize <= 0) {
				flag = false;
			} else {
				oGameObjectlist2.internalList[0].Attach(flag1, null);
				flag = true;
			}
			if (!flag) {
				final GameObjectPool oGameObjectlist5 = gameApplet.yZ;
				final boolean flag2 = M;
				if (oGameObjectlist5.mySize <= 0) {
					flag = false;
				} else {
					oGameObjectlist5.internalList[0].Attach(flag2, null);
					flag = true;
				}
			}
			if (!flag) {
				final GameObjectPool oGameObjectlist6 = gameApplet.IC;
				final boolean flag3 = M;
				if (oGameObjectlist6.mySize <= 0) {
					flag = false;
				} else {
					oGameObjectlist6.internalList[0].Attach(flag3, null);
					flag = true;
				}
			}
			if (!flag) {
				final GameObjectPool oGameObjectlist7 = gameApplet.vZ;
				final boolean flag4 = M;
				if (oGameObjectlist7.mySize <= 0) {
					flag = false;
				} else {
					oGameObjectlist7.internalList[0].Attach(flag4, null);
					flag = true;
				}
			}
			if (!flag) {
				final GameObjectPool oGameObjectlist8 = gameApplet.dZ;
				final boolean flag5 = M;
				if (oGameObjectlist8.mySize <= 0) {
					flag = false;
				} else {
					oGameObjectlist8.internalList[0].Attach(flag5, null);
					flag = true;
				}
			}
			if (!flag) {
				final GameObjectPool oGameObjectlist9 = gameApplet.AC;
				final boolean flag6 = M;
				if (oGameObjectlist9.mySize <= 0) {
					flag = false;
				} else {
					oGameObjectlist9.internalList[0].Attach(flag6, null);
					flag = true;
				}
			}
			if (!flag) {
				final GameObjectPool oGameObjectlist10 = gameApplet.EC;
				final boolean flag7 = M;
				if (oGameObjectlist10.mySize <= 0) {
					flag = false;
				} else {
					oGameObjectlist10.internalList[0].Attach(flag7, null);
					flag = true;
				}
			}
			if (!flag) {
				final GameObjectPool oGameObjectlist11 = gameApplet.GC;
				final boolean flag8 = M;
				if (oGameObjectlist11.mySize <= 0) {
					flag = false;
				} else {
					oGameObjectlist11.internalList[0].Attach(flag8, null);
					flag = true;
				}
			}
			if (!flag) {
				final GameObjectPool oGameObjectlist12 = gameApplet.BC;
				final boolean flag9 = M;
				if (oGameObjectlist12.mySize <= 0) {
					flag = false;
				} else {
					oGameObjectlist12.internalList[0].Attach(flag9, null);
					flag = true;
				}
			}
			if (!flag) {
				L = false;
				return;
			} else {
				H = 2;
				return;
			}
		} else {
			HNSM(false);
			return;
		}
	}

	final void HNSM(final boolean flag) {
		boolean flag1 = true;
		while (flag1)
			if (abs >= Z) {
				flag1 = false;
			} else {
				final Trigger trigger = myTriggers[abs];
				abs++;
				switch (trigger.myCategory) {
					default:
						break;

					case 100: // 'd'
						gameApplet.qC = true;
						break;

					case 101: // 'e'
						if (trigger.wouldResetStarfield) {
							gameApplet.qC = false;
							final GameObjectPool obj = gameApplet.dZ;
							oSpaceship nobj = null;
							nobj = (oSpaceship) (obj.mySize <= 0 ? null : (obj).internalList[0]);
							if (nobj != null) {
								nobj.Z = false;
								nobj.C = 0;
								nobj.B = 0;
							}
						} else {
							K = true;
						}
						getName = 0;
						C.M = 0;
						I.M = 0;
						flag1 = false;
						break;

					case 102: // 'f'
						gameApplet.OC = trigger.wouldResetStarfield;
						break;

					case 103: // 'g'
						gameApplet.InitializeSettings(true);
						flag1 = false;
						break;

					case 104: // 'h'
						if (!flag)
							trigger.X.Play(trigger.I, true, trigger.wouldResetStarfield);
						break;

					case 105: // 'i'
						if (!gameApplet.isHiscoreEnabled || gameApplet.tC)
							break;

						// serializedIsGuest.compareTo("1") == 0
						if (gameApplet.isGuest)
						{
							gameApplet.highscoreDialgueHandle.MakePopup();
							
							if (!gameApplet.highscoreDialgueHandle.IsSkippedHighscore())
							{
								final String s = gameApplet.highscoreDialgueHandle.getName();

								gameApplet.I(s, String.valueOf(gameApplet.rC));
							}
						}
						else
						{
							gameApplet.I(gameApplet.NB, String.valueOf(gameApplet.rC));
						}
						break;

					case 106: // 'j'
						if (!gameApplet.isHiscoreEnabled)
							break;

						if (trigger.I == 1)
						{
							gameApplet.TB.I(gameApplet, "Recent High Scores", trigger.Q, trigger.R,
									trigger.U, trigger.Z, trigger.C, trigger.L, trigger.M,
									trigger.B);
						}
						else
						{
							gameApplet.UB.I(gameApplet, "All Time High Scores", trigger.Q,
									trigger.R,
									trigger.U, trigger.Z, trigger.C, trigger.L, trigger.M,
									trigger.B);
						}
						break;

					case 200:
						H = trigger.I;
						flag1 = false;
						break;

					case 203:
						getName(trigger.I, trigger.L, trigger.M, trigger.wouldResetStarfield, trigger.Z,
								trigger.C,
								trigger.B, trigger.D);
						break;

					case 202:
						getName = 0;
						C.M = 0;
						I.M = 0;
						if (flag || trigger.G) {
							if (trigger.I == -1 || trigger.I == 2) {
								GameObjectPool oGameObjectlist1 = gameApplet.wZ;
								boolean flag2 = trigger.wouldResetStarfield;
								int k5 = trigger.Z;
								int i7 = trigger.C;
								int j8 = trigger.B;
								int i9 = trigger.D;
								oGameObjectlist1.Attach(flag2, null, k5, i7, j8, i9);
								oGameObjectlist1 = gameApplet.yZ;
								flag2 = trigger.wouldResetStarfield;
								k5 = trigger.Z;
								i7 = trigger.C;
								j8 = trigger.B;
								i9 = trigger.D;
								oGameObjectlist1.Attach(flag2, null, k5, i7, j8, i9);
							}

							if (trigger.I == -1 || trigger.I == 1) {
								GameObjectPool oGameObjectlist2 = gameApplet.vZ;
								boolean flag3 = trigger.wouldResetStarfield;
								int l5 = trigger.Z;
								int j7 = trigger.C;
								int k8 = trigger.B;
								int j9 = trigger.D;
								oGameObjectlist2.Attach(flag3, null, l5, j7, k8, j9);
								oGameObjectlist2 = gameApplet.IC;
								flag3 = trigger.wouldResetStarfield;
								l5 = trigger.Z;
								j7 = trigger.C;
								k8 = trigger.B;
								j9 = trigger.D;
								oGameObjectlist2.Attach(flag3, null, l5, j7, k8, j9);
								oGameObjectlist2 = gameApplet.dZ;
								flag3 = trigger.wouldResetStarfield;
								l5 = trigger.Z;
								j7 = trigger.C;
								k8 = trigger.B;
								j9 = trigger.D;
								oGameObjectlist2.Attach(flag3, null, l5, j7, k8, j9);
							}
							if (trigger.Z == 10) {
								GameObjectPool oGameObjectlist3 = gameApplet.AC;
								boolean flag4 = trigger.wouldResetStarfield;
								int i6 = trigger.Z;
								int k7 = trigger.C;
								int l8 = trigger.B;
								int k9 = trigger.D;
								oGameObjectlist3.Attach(flag4, null, i6, k7, l8, k9);
								oGameObjectlist3 = gameApplet.EC;
								flag4 = trigger.wouldResetStarfield;
								i6 = trigger.Z;
								k7 = trigger.C;
								l8 = trigger.B;
								k9 = trigger.D;
								oGameObjectlist3.Attach(flag4, null, i6, k7, l8, k9);
								oGameObjectlist3 = gameApplet.GC;
								flag4 = trigger.wouldResetStarfield;
								i6 = trigger.Z;
								k7 = trigger.C;
								l8 = trigger.B;
								k9 = trigger.D;
								oGameObjectlist3.Attach(flag4, null, i6, k7, l8, k9);
							}
						} else {
							L = true;
							M = trigger.wouldResetStarfield;
						}
						flag1 = false;
						break;

					case 432:
						if (trigger.I == 2)
							C.Z(trigger.Z, trigger.C, trigger.B, trigger.D);
						else
							I.Z(trigger.Z, trigger.C, trigger.B, trigger.D);
						break;

					case 461:
						D = trigger.L;
						break;

					case 460:
						if (J < 10) {
							S[J] = trigger.I;
							A[J] = trigger.Z;
							E += trigger.Z;
							J++;
						}
						break;

					case 400:
						if (out < 20) {
							println += trigger.I;
							random[out] = trigger.I;
							red[out] = trigger.Z;
							toString[out] = trigger.L;
							out++;
						}
						break;

					case 402:
						compareTo = trigger.I;
						getName = trigger.I;
						gray = trigger.Z;
						lightGray = trigger.C;
						max = trigger.B;
						break;

					case 403:
						println = 0;
						out = 0;
						break;

					case 410:
						if (trigger.I == 2)
							C.I(trigger.Z, trigger.C, trigger.L);
						else
							I.I(trigger.Z, trigger.C, trigger.L);
						break;

					case 412:
						if (trigger.I == 2)
							C.I(trigger.Z, trigger.C, trigger.B);
						else
							I.I(trigger.Z, trigger.C, trigger.B);
						break;

					case 413:
						if (trigger.I == 2) {
							C.T = 0;
							C.R = 0;
						} else {
							I.T = 0;
							I.R = 0;
						}
						break;

					case 420:
						F(trigger.I, trigger.Z, trigger.L, trigger.G, trigger.wouldResetStarfield, trigger.C,
								trigger.M, trigger.N, trigger.B, trigger.P);
						break;

					case 441:
						Z(trigger.I, trigger.L, trigger.M, trigger.N);
						break;

					case 442:
						if (trigger.I == 2) {
							compareTo(gameApplet.wZ);
						} else {
							compareTo(gameApplet.vZ);
							compareTo(gameApplet.dZ);
						}
						break;

					case 440:
						abs(trigger.I);
						break;

					case 421:
						if (trigger.I == 2) {
							HNSM(gameApplet.wZ, trigger.L, trigger.M, trigger.N, trigger.O);
						} else {
							HNSM(gameApplet.vZ, trigger.L, trigger.M, trigger.N, trigger.O);
							HNSM(gameApplet.dZ, trigger.L, trigger.M, trigger.N, trigger.O);
						}
						break;

					case 422:
						if (trigger.I == 2) {
							final GameObjectPool oGameObjectlist6 = gameApplet.wZ;
							final int i2 = oGameObjectlist6.mySize;
							for (int i = 0; i < i2; i++) {
								final GameObjectPool oGameObjectlist7 = gameApplet.wZ;
								final GameObject oGameObject4 = i < 0 || i >= oGameObjectlist7.mySize ? null
										: oGameObjectlist7.internalList[i];
								if (oGameObject4.IsActivated() && (trigger.Z == -1 || oGameObject4.JI == trigger.Z)
										&& (trigger.C == -1 || oGameObject4.shipGrade == trigger.C)
										&& (trigger.B == -1 || oGameObject4.prefabID == trigger.B)
										&& (trigger.D == -1 || oGameObject4.HI == trigger.D))

									oGameObject4.SetActiveState(trigger.propertyBoolean);
							}

							break;
						}
						GameObjectPool oGameObjectlist8 = gameApplet.vZ;
						int j2 = oGameObjectlist8.mySize;
						for (int j = 0; j < j2; j++) {
							oGameObjectlist8 = gameApplet.vZ;
							final GameObject oGameObject5 = j < 0 || j >= oGameObjectlist8.mySize ? null : oGameObjectlist8.internalList[j];
							if (oGameObject5.IsActivated() && (trigger.Z == -1 || oGameObject5.JI == trigger.Z)
									&& (trigger.C == -1 || oGameObject5.shipGrade == trigger.C)
									&& (trigger.B == -1 || oGameObject5.prefabID == trigger.B)
									&& (trigger.D == -1 || oGameObject5.HI == trigger.D))
							{
								oGameObject5.SetActiveState(trigger.propertyBoolean);
							}
						}

						oGameObjectlist8 = gameApplet.dZ;
						j2 = oGameObjectlist8.mySize;
						for (int k = 0; k < j2; k++) {
							final GameObjectPool oGameObjectlist9 = gameApplet.dZ;
							final GameObject oGameObject6 = k < 0 || k >= oGameObjectlist9.mySize ? null : oGameObjectlist9.internalList[k];
							if (oGameObject6.IsActivated() && (trigger.Z == -1 || oGameObject6.JI == trigger.Z)
									&& (trigger.C == -1 || oGameObject6.shipGrade == trigger.C)
									&& (trigger.B == -1 || oGameObject6.prefabID == trigger.B)
									&& (trigger.D == -1 || oGameObject6.HI == trigger.D))
							{
								oGameObject6.SetActiveState(trigger.propertyBoolean);
							}
						}

						break;

					case 423:
						if (trigger.I == 2) {
							final GameObjectPool oGameObjectlist10 = gameApplet.wZ;
							final int k2 = oGameObjectlist10.mySize;
							for (int l = 0; l < k2; l++) {
								final GameObjectPool oGameObjectlist11 = gameApplet.wZ;
								final GameObject oGameObject7 = l < 0 || l >= oGameObjectlist11.mySize ? null
										: oGameObjectlist11.internalList[l];
								if (oGameObject7.IsActivated() && (trigger.Z == -1 || oGameObject7.JI == trigger.Z)
										&& (trigger.C == -1 || oGameObject7.shipGrade == trigger.C)
										&& (trigger.B == -1 || oGameObject7.prefabID == trigger.B)
										&& (trigger.D == -1 || oGameObject7.HI == trigger.D))
								{
									oGameObject7.I(trigger.P);
								}
							}

							break;
						}
						final GameObjectPool oGameObjectlist12 = gameApplet.vZ;
						final int l2 = oGameObjectlist12.mySize;
						for (int i1 = 0; i1 < l2; i1++) {
							final GameObjectPool oGameObjectlist13 = gameApplet.vZ;
							final GameObject oGameObject8 = i1 < 0 || i1 >= oGameObjectlist13.mySize ? null
									: oGameObjectlist13.internalList[i1];
							if (oGameObject8.IsActivated() && (trigger.Z == -1 || oGameObject8.JI == trigger.Z)
									&& (trigger.C == -1 || oGameObject8.shipGrade == trigger.C)
									&& (trigger.B == -1 || oGameObject8.prefabID == trigger.B)
									&& (trigger.D == -1 || oGameObject8.HI == trigger.D))
								oGameObject8.I(trigger.P);
						}

						break;

					case 424:
						if (trigger.I == 2) {
							final GameObjectPool oGameObjectlist14 = gameApplet.wZ;
							final int i3 = oGameObjectlist14.mySize;
							for (int j1 = 0; j1 < i3; j1++) {
								final GameObjectPool oGameObjectlist15 = gameApplet.wZ;
								final GameObject oGameObject9 = j1 < 0 || j1 >= oGameObjectlist15.mySize ? null
										: oGameObjectlist15.internalList[j1];
								if (oGameObject9.IsActivated() && (trigger.Z == -1 || oGameObject9.JI == trigger.Z)
										&& (trigger.C == -1 || oGameObject9.shipGrade == trigger.C)
										&& (trigger.B == -1 || oGameObject9.prefabID == trigger.B)
										&& (trigger.D == -1 || oGameObject9.HI == trigger.D))
									oGameObject9.CI = trigger.wouldResetStarfield;
							}

							break;
						}
						final GameObjectPool oGameObjectlist16 = gameApplet.vZ;
						final int j3 = oGameObjectlist16.mySize;
						for (int k1 = 0; k1 < j3; k1++) {
							final GameObjectPool oGameObjectlist17 = gameApplet.vZ;
							final GameObject oGameObject10 = k1 < 0 || k1 >= oGameObjectlist17.mySize ? null
									: oGameObjectlist17.internalList[k1];
							if (oGameObject10.IsActivated() && (trigger.Z == -1 || oGameObject10.JI == trigger.Z)
									&& (trigger.C == -1 || oGameObject10.shipGrade == trigger.C)
									&& (trigger.B == -1 || oGameObject10.prefabID == trigger.B)
									&& (trigger.D == -1 || oGameObject10.HI == trigger.D))
								oGameObject10.CI = trigger.wouldResetStarfield;
						}

						break;

					case 426:
						if (trigger.I == 2)
							C.I(trigger.Z, trigger.C, trigger.B, trigger.D);
						else
							I.I(trigger.Z, trigger.C, trigger.B, trigger.D);
						break;

					case 427:
						GameObjectPool oGameObjectlist18;
						if (trigger.I == 2)
							oGameObjectlist18 = gameApplet.wZ;
						else
							oGameObjectlist18 = gameApplet.vZ;
						final int k3 = oGameObjectlist18.mySize;
						for (int l1 = 0; l1 < k3; l1++) {
							final oSpaceship oSpaceship1 = (oSpaceship) (l1 < 0 || l1 >= oGameObjectlist18.mySize ? null
									: oGameObjectlist18.internalList[l1]);
							if (((GameObject) (oSpaceship1)).IsActivated() && (oSpaceship1.QI == 3 || oSpaceship1.QI == 2)
									&& (trigger.Z == -1 || ((GameObject) (oSpaceship1)).JI == trigger.Z)
									&& (trigger.C == -1 || ((GameObject) (oSpaceship1)).shipGrade == trigger.C)
									&& (trigger.B == -1 || ((GameObject) (oSpaceship1)).prefabID == trigger.B)
									&& (trigger.D == -1 || ((GameObject) (oSpaceship1)).HI == trigger.D)) {
								oSpaceship1.M = trigger.L;
								oSpaceship1.accelFactorOnStage = trigger.L * ((GameObject) (oSpaceship1)).myFriction;
							}
						}

						break;

					case 425:
						if (trigger.I == 2) {
							C.wasResetStarfield = trigger.wouldResetStarfield;
							C.H = trigger.G;
							C.K = trigger.L;
						} else {
							I.wasResetStarfield = trigger.wouldResetStarfield;
							I.H = trigger.G;
							I.K = trigger.L;
						}
						break;

					case 428:
						if (trigger.I == 2) {
							final GameQuest gameobjectivelist1 = C;
							final int l3 = trigger.Z;
							final int j6 = trigger.C;
							final int l7 = trigger.B;
							gameobjectivelist1.F = l3;
							gameobjectivelist1.J = j6;
							gameobjectivelist1.A = l7;
						} else {
							final GameQuest gameobjectivelist2 = I;
							final int i4 = trigger.Z;
							final int k6 = trigger.C;
							final int i8 = trigger.B;
							gameobjectivelist2.F = i4;
							gameobjectivelist2.J = k6;
							gameobjectivelist2.A = i8;
						}
						break;

					case 430:
						if (trigger.I == 2)
							blue(trigger.I, gameApplet.wZ, trigger.Z, trigger.C, trigger.B, trigger.L);
						else
							blue(trigger.I, gameApplet.vZ, trigger.Z, trigger.C, trigger.B, trigger.L);
						break;

					case 600:
						final GameLabel gametext1 = (GameLabel) gameApplet.wC
								.GiveLastInstanceTo(gameApplet.gameUIObjects);
						if (gametext1 == null)
							break;

						gametext1.Draw(trigger.P, trigger.Q, trigger.U, trigger.K, trigger.I,
								trigger.Z, trigger.C, trigger.B, trigger.D, trigger.wouldResetStarfield);

						if (trigger.G)
							gametext1.Z(trigger.propertyBoolean);

						if (trigger.J != -1)
						{
							final int j4 = trigger.J;
							gametext1.HI = j4;
						}
						if (trigger.H)
							gametext1.ApplyColours(trigger.V, trigger.W);
						else if (trigger.R != null) {
							final Color color = trigger.R;
							gametext1.B = color;
						}
						if (trigger.Y != null && trigger.T != null) {
							final Color color1 = trigger.T;
							final SpriteGroup sprite_group1 = trigger.Y;
							gametext1.OI = color1;
							gametext1.QI = sprite_group1;
							gametext1.PI = 2;
						}
						if (trigger.S == -1)
							break;
						final GameObject oGameObject3 = gameApplet.I(-1, -1, -1, -1, trigger.S);
						if (oGameObject3 != null) {
							final int l6 = trigger.A;
							gametext1.UI = oGameObject3;
							gametext1.VI = l6;
							gametext1.TI = false;
						}
						break;

					case 602:
						final GameLabel gametext2 = (GameLabel) gameApplet.wC
								.GiveLastInstanceTo(gameApplet.gameUIObjects);
						if (gametext2 == null)
							break;
						gametext2.Draw(trigger.P, trigger.Q, trigger.U, trigger.K, trigger.I,
								trigger.Z, trigger.C, trigger.B, trigger.D, trigger.wouldResetStarfield);
						if (trigger.G)
							gametext2.Z(trigger.propertyBoolean);
						gametext2.I(trigger.I, trigger.Z,
								trigger.L * gameApplet.viewScale,
								trigger.M * gameApplet.viewScale);

						if (trigger.H)
						{
							gametext2.ApplyColours(trigger.V, trigger.W);
							break;
						}
						if (trigger.R != null) {
							final Color color2 = trigger.R;
							gametext2.B = color2;
						}
						break;

					case 206:
						valueOf = true;
						flag1 = false;
						break;

					case 204:
						gameApplet.myCamera.I(trigger.L, trigger.M, trigger.wouldResetStarfield,
								trigger.N * gameApplet.viewScale, 0.02F);
						break;

					case 205:
						GameObject oGameObject1;
						if (trigger.I == 101) {
							final GameObjectPool oGameObjectlist5 = gameApplet.dZ;
							oGameObject1 = oGameObjectlist5.mySize <= 0 ? null : oGameObjectlist5.internalList[0];
						} else {
							oGameObject1 = gameApplet.I(-1, -1, -1, -1, trigger.I);
						}
						if (oGameObject1 != null)
							gameApplet.myCamera.I(oGameObject1, trigger.wouldResetStarfield, 30F, 0.02F);
						break;

					case 107: // 'k'
						gameApplet.I(gameApplet.PC);
						break;

					case 431:
						final GameObject prefab = gameApplet.I(trigger.I, trigger.Z, trigger.C, trigger.B, trigger.D);
						if (prefab == null)
						{
							break;
						}

						prefab.frameIndex = trigger.propertyBoolean;
						prefab.animationIndex = trigger.J;
						if (trigger.Y != null)
							prefab.myAtlas = trigger.Y;

						prefab.SetSprite(prefab.myAtlas.GetSprite(prefab.frameIndex, prefab.animationIndex));
						break;

					case 450:
						if (trigger.I == 2)
							C.I(trigger.L, trigger.Z, trigger.C, trigger.B, trigger.D);
						else
							I.I(trigger.L, trigger.Z, trigger.C, trigger.B, trigger.D);
						break;

					case 451:
						if (trigger.I == 2) {
							final GameQuest gameobjectivelist3 = C;
							if (gameobjectivelist3.Z < gameobjectivelist3.objectivesCount) {
								final GameObjective gameobjective1 = gameobjectivelist3.myObjectives[gameobjectivelist3.Z];
								gameobjective1.myCategory = 2;
								gameobjectivelist3.Z++;
							}
							break;
						}
						final GameQuest gameobjectivelist4 = I;
						if (gameobjectivelist4.Z < gameobjectivelist4.objectivesCount) {
							final GameObjective gameobjective2 = gameobjectivelist4.myObjectives[gameobjectivelist4.Z];
							gameobjective2.myCategory = 2;
							gameobjectivelist4.Z++;
						}
						break;

					case 456:
						if (trigger.I == 2)
							C.I(trigger.L, trigger.M, trigger.Z, trigger.C);
						else
							I.I(trigger.L, trigger.M, trigger.Z, trigger.C);
						break;

					case 452:
						if (trigger.I == 2) {
							final GameQuest gameobjectivelist5 = C;
							final int k4 = trigger.Z;
							if (gameobjectivelist5.Z < gameobjectivelist5.objectivesCount) {
								final GameObjective gameobjective3 = gameobjectivelist5.myObjectives[gameobjectivelist5.Z];
								gameobjective3.myCategory = 3;
								gameobjective3.H = k4;
								gameobjective3.K = 0;
								gameobjectivelist5.Z++;
							}
							break;
						}
						final GameQuest gameobjectivelist6 = I;
						final int l4 = trigger.Z;
						if (gameobjectivelist6.Z < gameobjectivelist6.objectivesCount) {
							final GameObjective gameobjective4 = gameobjectivelist6.myObjectives[gameobjectivelist6.Z];
							gameobjective4.myCategory = 3;
							gameobjective4.H = l4;
							gameobjective4.K = 0;
							gameobjectivelist6.Z++;
						}
						break;

					case 457:
						if (trigger.I == 2)
							C.I();
						else
							I.I();
						break;

					case 453:
						if (trigger.I == 2)
							C.I(trigger.Z, trigger.C, trigger.B, trigger.D, trigger.propertyBoolean);
						else
							I.I(trigger.Z, trigger.C, trigger.B, trigger.D, trigger.propertyBoolean);
						break;

					case 454:
						if (trigger.I == 2) {
							final GameQuest gameobjectivelist7 = C;
							final int i5 = trigger.Z;
							if (gameobjectivelist7.Z < gameobjectivelist7.objectivesCount) {
								final GameObjective gameobjective5 = gameobjectivelist7.myObjectives[gameobjectivelist7.Z];
								gameobjective5.myCategory = 6;
								gameobjective5.L = i5;
								gameobjectivelist7.Z++;
							}
							break;
						}
						final GameQuest gameobjectivelist8 = I;
						final int j5 = trigger.Z;
						if (gameobjectivelist8.Z < gameobjectivelist8.objectivesCount) {
							final GameObjective gameobjective6 = gameobjectivelist8.myObjectives[gameobjectivelist8.Z];
							gameobjective6.myCategory = 6;
							gameobjective6.L = j5;
							gameobjectivelist8.Z++;
						}
						break;

					case 455:
						append = true;
						blue = trigger.I;
						flag1 = false;
						break;

					case 501:
						if (flag) {
							GameObjectPool oGameObjectlist4 = gameApplet.oZ;
							oGameObjectlist4.Attach(true, null, -1, -1, -1, -1);
							oGameObjectlist4 = gameApplet.qZ;
							oGameObjectlist4.Attach(true, null, -1, -1, -1, -1);
							oGameObjectlist4 = gameApplet.yZ;
							oGameObjectlist4.Attach(true, null, -1, -1, -1, -1);
							oGameObjectlist4 = gameApplet.IC;
							oGameObjectlist4.Attach(true, null, -1, -1, -1, -1);
							oGameObjectlist4 = gameApplet.pZ;
							oGameObjectlist4.Attach(true, null, -1, -1, -1, -1);
							oGameObjectlist4 = gameApplet.tZ;
							oGameObjectlist4.Attach(true, null, -1, -1, -1, -1);
							oGameObjectlist4 = gameApplet.ZC;
							oGameObjectlist4.Attach(true, null, -1, -1, -1, -1);
							oGameObjectlist4 = gameApplet.gameUIObjects;
							oGameObjectlist4.Attach(true, null, -1, -1, -1, -1);
							oGameObjectlist4 = gameApplet.BC;
							oGameObjectlist4.Attach(true, null, -1, -1, -1, -1);
							gameApplet.dZ.C();
							gameApplet.oZ.C();
							gameApplet.pZ.C();
							gameApplet.qZ.C();
							gameApplet.tZ.C();
							gameApplet.vZ.C();
							gameApplet.wZ.C();
							gameApplet.yZ.C();
							gameApplet.IC.C();
							gameApplet.ZC.C();
							gameApplet.AC.C();
							gameApplet.EC.C();
							gameApplet.GC.C();
							gameApplet.BC.C();
						}
						ExecuteTriggers(trigger.I);
						flag1 = false;
						break;
				}
			}
	}

	final void CompleteImmediately() {
		for (final int i = usingTriggersCount; abs < Z && usingTriggersCount == i;)
			HNSM(true);

	}

	final void Z(final int i, final int j, final int k, final int l, final int i1) {
		final Trigger missioncmd1 = new Trigger(432);
		missioncmd1.I = i;
		missioncmd1.Z = j;
		missioncmd1.C = k;
		missioncmd1.B = l;
		missioncmd1.D = i1;
		if (Z < triggersCount) {
			myTriggers[Z] = missioncmd1;
			Z++;
		}
	}

	final void abs(final int i, final boolean flag, final boolean flag1, final boolean flag2, final boolean flag3) {
		if (flag)
			Z(i, gameApplet.YC,
					gameApplet.zC + (int) (gameApplet.worldDimension[1] * 0.10000000000000001D), 0,
					(int) (gameApplet.worldDimension[1] * 0.8F));
		if (flag2)
			Z(i, gameApplet.iC,
					gameApplet.zC + (int) (gameApplet.worldDimension[1] * 0.10000000000000001D), 0,
					(int) (gameApplet.worldDimension[1] * 0.8F));
		if (flag1)
			Z(i, gameApplet.YC + (int) (gameApplet.worldDimension[0] * 0.1F),
					gameApplet.zC,
					(int) (gameApplet.worldDimension[0] * 0.8F), 0);
		if (flag3)
			Z(i, gameApplet.YC, gameApplet.cC,
					(int) (gameApplet.worldDimension[0] * 0.8F), 0);
	}

	final void append(final int i, final int j, final float f) {
		final Trigger missioncmd1 = new Trigger(400);
		missioncmd1.I = i;
		missioncmd1.Z = j;
		missioncmd1.L = f;
		if (Z < triggersCount) {
			myTriggers[Z] = missioncmd1;
			Z++;
		}
	}

	final void blue(final int i, final int j, final int k, final int l) {
		final Trigger missioncmd1 = new Trigger(402);
		missioncmd1.I = i;
		missioncmd1.Z = j;
		missioncmd1.C = k;
		missioncmd1.B = l;
		if (Z < triggersCount) {
			myTriggers[Z] = missioncmd1;
			Z++;
		}
	}

	final void compareTo(final int i, final int j) {
		final Trigger missioncmd1 = new Trigger(460);
		missioncmd1.I = i;
		missioncmd1.Z = j;
		if (Z < triggersCount) {
			myTriggers[Z] = missioncmd1;
			Z++;
		}
	}

	final void getName(final float f) {
		final Trigger missioncmd1 = new Trigger(461);
		missioncmd1.L = f;
		if (Z < triggersCount) {
			myTriggers[Z] = missioncmd1;
			Z++;
		}
	}

	final void gray(final int i, final int j, final int k, final float f) {
		final Trigger missioncmd1 = new Trigger(410);
		missioncmd1.I = i;
		missioncmd1.Z = j;
		missioncmd1.C = k;
		missioncmd1.L = f;
		if (Z < triggersCount) {
			myTriggers[Z] = missioncmd1;
			Z++;
		}
	}

	final void lightGray(final int i, final int j, final int k, final int l) {
		final Trigger missioncmd1 = new Trigger(412);
		missioncmd1.I = i;
		missioncmd1.Z = j;
		missioncmd1.C = k;
		missioncmd1.B = l;
		if (Z < triggersCount) {
			myTriggers[Z] = missioncmd1;
			Z++;
		}
	}

	final void max(final int i, final float f, final float f1, final float f2, final float f3) {
		final Trigger missioncmd1 = new Trigger(421);
		missioncmd1.I = i;
		missioncmd1.L = f;
		missioncmd1.M = f1;
		missioncmd1.N = f2;
		missioncmd1.O = f3;
		if (Z < triggersCount) {
			myTriggers[Z] = missioncmd1;
			Z++;
		}
	}

	final void Instantiate(final int i, final int type, final int k, final boolean flag, final float f, final float f1, final float f2, final int l, final String s)
	{
		final Trigger missioncmd1 = new Trigger(420);
		missioncmd1.I = i;
		missioncmd1.Z = type;
		missioncmd1.C = k;
		missioncmd1.B = l;
		missioncmd1.L = f2;
		missioncmd1.wouldResetStarfield = false;
		missioncmd1.G = flag;
		missioncmd1.M = f;
		missioncmd1.N = f1;
		missioncmd1.P = s;

		if (Z < triggersCount)
		{
			myTriggers[Z] = missioncmd1;
			Z++;
		}
	}

	final void InstantiateGroup(final int i, final int id_group[], final int j, final boolean flag, final float x, final float y, final float f2, final float f3)
	{
		for (int k = 0; id_group[k] != -1; k++)
		{
			final int object_id = id_group[k];

			final float cx = x + ((float) Math.random() - 0.5F) * f2;
			final float cy = y + ((float) Math.random() - 0.5F) * f2;
			Instantiate(i, object_id, j, flag, cx, cy, f3, -1, "");
		}
	}

	final void random(final int i)
	{
		final Trigger missioncmd1 = new Trigger(442);
		missioncmd1.I = i;
		if (Z < triggersCount) {
			myTriggers[Z] = missioncmd1;
			Z++;
		}
	}

	final void red(final int i, final float f, final float f1, final float f2) {
		final Trigger missioncmd1 = new Trigger(441);
		missioncmd1.I = i;
		missioncmd1.L = f;
		missioncmd1.M = f1;
		missioncmd1.N = f2;
		if (Z < triggersCount) {
			myTriggers[Z] = missioncmd1;
			Z++;
		}
	}

	final void toString(final int i) {
		final Trigger missioncmd1 = new Trigger(440);
		missioncmd1.I = i;
		if (Z < triggersCount) {
			myTriggers[Z] = missioncmd1;
			Z++;
		}
	}

	final void valueOf(final int i, final int j, final int k, final int l, final int i1, final String s) {
		final Trigger missioncmd1 = new Trigger(423);
		missioncmd1.I = i;
		missioncmd1.Z = j;
		missioncmd1.C = k;
		missioncmd1.B = l;
		missioncmd1.D = i1;
		missioncmd1.P = s;
		if (Z < triggersCount) {
			myTriggers[Z] = missioncmd1;
			Z++;
		}
	}

	final void F(final int i, final int j, final int k, final int l, final int i1, final int actve_mode)
	{
		final Trigger missioncmd1 = new Trigger(422);
		missioncmd1.I = i;
		missioncmd1.Z = j;
		missioncmd1.C = k;
		missioncmd1.B = l;
		missioncmd1.D = i1;
		missioncmd1.propertyBoolean = actve_mode;

		if (Z < triggersCount)
		{
			myTriggers[Z] = missioncmd1;
			Z++;
		}
	}

	final void HNSM(final int i, final int j, final int k, final int l, final int i1, final float f) {
		final Trigger missioncmd1 = new Trigger(427);
		missioncmd1.I = i;
		missioncmd1.Z = j;
		missioncmd1.C = k;
		missioncmd1.B = l;
		missioncmd1.D = i1;
		missioncmd1.L = f;

		if (Z < triggersCount)
		{
			myTriggers[Z] = missioncmd1;
			Z++;
		}
	}

	final void abs(final int i, final int j, final int k, final int l, final int i1) {
		final Trigger missioncmd1 = new Trigger(426);
		missioncmd1.I = i;
		missioncmd1.Z = j;
		missioncmd1.C = k;
		missioncmd1.B = l;
		missioncmd1.D = i1;

		if (Z < triggersCount)
		{
			myTriggers[Z] = missioncmd1;
			Z++;
		}
	}

	final void append(final int i, final int j, final int k, final int l) {
		final Trigger missioncmd1 = new Trigger(428);
		missioncmd1.I = i;
		missioncmd1.Z = j;
		missioncmd1.C = k;
		missioncmd1.B = l;

		if (Z < triggersCount)
		{
			myTriggers[Z] = missioncmd1;
			Z++;
		}
	}

	final void blue(final int i, final boolean flag, final boolean flag1, final float f) {
		final Trigger missioncmd1 = new Trigger(425);
		missioncmd1.I = i;
		missioncmd1.wouldResetStarfield = flag;
		missioncmd1.G = flag1;
		missioncmd1.L = f;
		if (Z < triggersCount) {
			myTriggers[Z] = missioncmd1;
			Z++;
		}
	}

	final void compareTo(final int i, final float f) {
		final Trigger missioncmd1 = new Trigger(429);
		missioncmd1.I = i;
		missioncmd1.L = f;
		if (Z < triggersCount) {
			myTriggers[Z] = missioncmd1;
			Z++;
		}
	}

	final void getName() {
		final Trigger missioncmd1 = new Trigger(206);
		if (Z < triggersCount) {
			myTriggers[Z] = missioncmd1;
			Z++;
		}
	}

	final void gray(final float f, final float f1, final boolean flag, final float f2) {
		final Trigger missioncmd1 = new Trigger(204);
		missioncmd1.L = f;
		missioncmd1.M = f1;
		missioncmd1.N = f2;
		missioncmd1.wouldResetStarfield = flag;
		if (Z < triggersCount) {
			myTriggers[Z] = missioncmd1;
			Z++;
		}
	}

	final void lightGray(final int i, final boolean flag) {
		final Trigger missioncmd1 = new Trigger(205);
		missioncmd1.I = i;
		missioncmd1.wouldResetStarfield = flag;
		if (Z < triggersCount) {
			myTriggers[Z] = missioncmd1;
			Z++;
		}
	}

	final void max() {
		final Trigger missioncmd1 = new Trigger(107);
		if (Z < triggersCount) {
			myTriggers[Z] = missioncmd1;
			Z++;
		}
	}

	final void out(final int i, final int j, final int k, final int l, final int i1, final SpriteGroup sprite_group1, final int j1, final int k1) {
		final Trigger missioncmd1 = new Trigger(431);
		missioncmd1.I = i;
		missioncmd1.Z = j;
		missioncmd1.C = k;
		missioncmd1.B = l;
		missioncmd1.D = i1;
		missioncmd1.propertyBoolean = j1;
		missioncmd1.J = k1;
		missioncmd1.Y = sprite_group1;
		if (Z < triggersCount) {
			myTriggers[Z] = missioncmd1;
			Z++;
		}
	}

	final void println(final int i) {
		final Trigger missioncmd1 = new Trigger(455);
		missioncmd1.I = i;
		if (Z < triggersCount) {
			myTriggers[Z] = missioncmd1;
			Z++;
		}
	}

	final void random(final float f, final int i, final int j, final int k, final int l, final int i1) {
		final Trigger missioncmd1 = new Trigger(450);
		missioncmd1.L = f;
		missioncmd1.I = i;
		missioncmd1.Z = j;
		missioncmd1.C = k;
		missioncmd1.B = l;
		missioncmd1.D = i1;
		if (Z < triggersCount) {
			myTriggers[Z] = missioncmd1;
			Z++;
		}
	}

	final void red(final int i, final float f, final float f1, final int j, final int k) {
		final Trigger missioncmd1 = new Trigger(456);
		missioncmd1.I = i;
		missioncmd1.Z = j;
		missioncmd1.C = k;
		missioncmd1.L = f;
		missioncmd1.M = f1;
		if (Z < triggersCount) {
			myTriggers[Z] = missioncmd1;
			Z++;
		}
	}

	final void toString(final int i, final int j, final int k, final int l, final int i1, final int j1) {
		final Trigger missioncmd1 = new Trigger(453);
		missioncmd1.I = i;
		missioncmd1.Z = j;
		missioncmd1.C = k;
		missioncmd1.B = l;
		missioncmd1.D = i1;
		missioncmd1.propertyBoolean = j1;

		if (Z < triggersCount)
		{
			myTriggers[Z] = missioncmd1;
			Z++;
		}
	}

	final void valueOf(final int i, final int j) {
		final Trigger missioncmd1 = new Trigger(454);
		missioncmd1.I = i;
		missioncmd1.Z = j;
		if (Z < triggersCount) {
			myTriggers[Z] = missioncmd1;
			Z++;
		}
	}

	final void F(final int i, final String s, final Color color, final Color color1, final Font gamefont1, final boolean flag, final int j, final int k, final int l,
			final int i1, final int j1, final boolean flag1, final boolean flag2, final int k1, final SpriteGroup sprite_group1, final Color color2, final int l1,
			final int i2) {
		final Trigger missioncmd1 = new Trigger(600);
		missioncmd1.P = s;
		missioncmd1.Q = color;
		missioncmd1.R = color1;
		missioncmd1.T = color2;
		missioncmd1.V = null;
		missioncmd1.W = null;
		missioncmd1.Y = sprite_group1;
		missioncmd1.U = gamefont1;
		missioncmd1.I = j;
		missioncmd1.Z = k;
		missioncmd1.C = l;
		missioncmd1.B = i1;
		missioncmd1.D = j1;
		missioncmd1.propertyBoolean = k1;
		missioncmd1.J = i;
		missioncmd1.S = l1;
		missioncmd1.A = i2;
		missioncmd1.wouldResetStarfield = flag1;
		missioncmd1.G = flag2;
		missioncmd1.H = false;
		missioncmd1.K = flag;
		if (Z < triggersCount) {
			myTriggers[Z] = missioncmd1;
			Z++;
		}
	}

	final void Transmision(final int i, final String s, final Palette main_color, final Palette under_color, final Font quote_font, final boolean flag, final int j, final int k, final int l, final int i1, final int j1, final boolean flag1, final boolean flag2, final int k1, final int l1, final int i2)
	{
		final Trigger missioncmd1 = new Trigger(600);
		missioncmd1.P = s;
		missioncmd1.Q = null;
		missioncmd1.R = null;

		missioncmd1.V = main_color;
		missioncmd1.W = under_color;
		missioncmd1.U = quote_font;
		missioncmd1.I = j;
		missioncmd1.Z = k;
		missioncmd1.C = l;
		missioncmd1.B = i1;
		missioncmd1.D = j1;
		missioncmd1.propertyBoolean = k1;

		missioncmd1.J = i;
		missioncmd1.S = l1;
		missioncmd1.A = i2;
		missioncmd1.wouldResetStarfield = flag1;
		missioncmd1.G = flag2;
		missioncmd1.H = true;
		missioncmd1.K = flag;

		if (Z < triggersCount)
		{
			myTriggers[Z] = missioncmd1;
			Z++;
		}
	}

	final void abs()
	{
		final Trigger missioncmd1 = new Trigger(100);

		if (Z < triggersCount)
		{
			myTriggers[Z] = missioncmd1;
			Z++;
		}
	}

	final void append(final boolean flag)
	{
		final Trigger missioncmd1 = new Trigger(101);
		missioncmd1.wouldResetStarfield = flag;

		if (Z < triggersCount)
		{
			myTriggers[Z] = missioncmd1;
			Z++;
		}
	}

	final void blue()
	{
		final Trigger missioncmd1 = new Trigger(103);

		if (Z < triggersCount) {
			myTriggers[Z] = missioncmd1;
			Z++;
		}
	}

	final void compareTo(final boolean flag)
	{
		final Trigger missioncmd1 = new Trigger(102);
		missioncmd1.wouldResetStarfield = flag;

		if (Z < triggersCount) {
			myTriggers[Z] = missioncmd1;
			Z++;
		}
	}

	final void getName(final GameSoundPool gamesoundlist1, final int i, final boolean flag)
	{
		final Trigger missioncmd1 = new Trigger(104);
		missioncmd1.X = gamesoundlist1;
		missioncmd1.I = i;
		missioncmd1.wouldResetStarfield = flag;

		if (Z < triggersCount)
		{
			myTriggers[Z] = missioncmd1;
			Z++;
		}
	}

	final void gray()
	{
		final Trigger missioncmd1 = new Trigger(105);

		if (Z < triggersCount) {
			myTriggers[Z] = missioncmd1;
			Z++;
		}
	}

	final void lightGray(final int i)
	{
		final Trigger missioncmd1 = new Trigger(200);
		missioncmd1.I = i;

		if (Z < triggersCount)
		{
			myTriggers[Z] = missioncmd1;
			Z++;
		}
	}

	final void max(final boolean flag, final boolean flag1, final int i, final int j, final int k, final int l, final int i1)
	{
		final Trigger missioncmd1 = new Trigger(202);

		missioncmd1.wouldResetStarfield = flag;
		missioncmd1.G = flag1;
		missioncmd1.I = i;
		missioncmd1.Z = j;
		missioncmd1.C = k;
		missioncmd1.B = l;
		missioncmd1.D = i1;

		if (Z < triggersCount)
		{
			myTriggers[Z] = missioncmd1;
			Z++;
		}
	}

	final void out(final int i, final float f, final float f1, final boolean flag, final int j, final int k, final int l, final int i1)
	{
		final Trigger missioncmd1 = new Trigger(203);
		missioncmd1.I = i;
		missioncmd1.Z = j;
		missioncmd1.C = k;
		missioncmd1.B = l;
		missioncmd1.D = i1;
		missioncmd1.L = f;
		missioncmd1.M = f1;
		missioncmd1.wouldResetStarfield = flag;

		if (Z < triggersCount)
		{
			myTriggers[Z] = missioncmd1;
			Z++;
		}
	}

	final void red(final int i)
	{
		final Trigger missioncmd1 = new Trigger(501);
		missioncmd1.I = i;

		if (Z < triggersCount)
		{
			myTriggers[Z] = missioncmd1;
			Z++;
		}
	}

	final void valueOf(final int i)
	{
		for (int j4 = 0; j4 < i; j4++)
		{
			int k4 = (int) (Math.random() * 2D);
			if (k4 == 0)
				k4 = -1;
			int l4 = (int) (Math.random() * println);
			for (int i5 = 0; i5 < out; i5++)
				if (l4 > random[i5]) {
					l4 -= random[i5];
				} else {
					final int j5 = (int) (Math.random() * 4D);
					switch (j5) {
						case 0: // '\0'
							final int j = gameApplet.YC;
							final int j1 = gameApplet.zC
									+ (int) (Math.random() * gameApplet.worldDimension[1]);
							final int j2 = gameApplet.iC;
							final int j3 = (int) (Math.random() * (gameApplet.worldDimension[1] + max)) + max / 2;
							break;

						case 1: // '\001'
							final int k = gameApplet.iC;
							final int k1 = gameApplet.zC
									+ (int) (Math.random() * gameApplet.worldDimension[1]);
							final int k2 = gameApplet.YC;
							final int k3 = gameApplet.zC
									+ (int) (Math.random() * (gameApplet.worldDimension[1] + max)) + max / 2;
							break;

						case 2: // '\002'
							final int l = gameApplet.YC
									+ (int) (Math.random() * gameApplet.worldDimension[0]);
							final int l1 = gameApplet.cC;
							final int l2 = gameApplet.YC
									+ (int) (Math.random() * (gameApplet.worldDimension[0] + max)) + max / 2;
							final int l3 = gameApplet.YC;
							break;

						default:
							final int i1 = gameApplet.YC
									+ (int) (Math.random() * gameApplet.worldDimension[0]);
							final int i2 = gameApplet.zC;
							final int i3 = gameApplet.YC
									+ (int) (Math.random() * (gameApplet.worldDimension[0] + max)) + max / 2;
							final int i4 = gameApplet.cC;
							break;
					}
				}

		}

	}

	final void F(final int i, final int j, final float f, final boolean flag, final boolean flag1, final int k, final float f1, final float f2, final int l, final String s) {
		float f3;
		float f4;
		if (flag1) {
			final int i1 = (int) (Math.random() * 3D);
			switch (i1) {
				case 0: // '\0'
					f3 = -50F;
					f4 = (float) (Math.random() * (gameApplet.viewHeight * 0.40000000000000002D)
							- 50D);
					break;

				case 1: // '\001'
					f3 = (float) (Math.random() * (gameApplet.viewWidth + 100F)) - 50F;
					f4 = -50F;
					break;

				default:
					f3 = (float) (gameApplet.viewWidth + 50D);
					f4 = (float) (Math.random() * (gameApplet.viewHeight * 0.40000000000000002D)
							- 50D);
					break;
			}
		} else {
			f3 = f1;
			f4 = f2;
		}

		final int j1 = (int) (Math.random() * 40D);
		if (flag) {
			final Explosion explosion1 = (Explosion) gameApplet.rZ.GiveLastInstanceTo(gameApplet.qZ);
			if (explosion1 != null) {
				explosion1.I(gameApplet.sprite_group_ship, 1, (int) f3 - -50F, (int) f4, 0.0F, 0.0F, 1, 2, 0, false);
				explosion1.timeSinceEpoch = -j1;
			}
		}

		oSpaceship oSpaceship1 = null;
		if (i == 2)
			oSpaceship1 = (oSpaceship) gameApplet.xZ.GiveLastInstanceTo(gameApplet.wZ);
		else
			oSpaceship1 = (oSpaceship) gameApplet.xZ.GiveLastInstanceTo(gameApplet.vZ);
		if (oSpaceship1 != null) {
			oSpaceship1.I(j, i, I(1.0F, 0.2F) * gameApplet.viewScale);
			oSpaceship1.QI = k;
			oSpaceship1.HI = l;
			if (i == 2) {
				if (C.wasResetStarfield) {
					oSpaceship1.II = true;
					oSpaceship1.ZI = s;
				}
				oSpaceship1.CI = C.H;
				if (C.K >= 0.0F)
					oSpaceship1.BI = C.K;
			} else {
				if (I.wasResetStarfield) {
					oSpaceship1.II = true;
					oSpaceship1.ZI = s;
				}
				oSpaceship1.CI = I.H;
				if (I.K >= 0.0F)
					oSpaceship1.BI = I.K;
			}
			if (k == 1) {
				oSpaceship1.CleanupPhysics(f3, f4, true);
				return;
			}
			if (flag) {
				oSpaceship1.SetupPhysics6(f3 - -50F, f4, null, f3, f4, f * gameApplet.viewScale, 1.0F, 0.15F,
						true);
				if (k == 2) {
					oSpaceship1.SetupPhysics2(((GameObject) (oSpaceship1)).myX, ((GameObject) (oSpaceship1)).myY, 0.0F, 0.0F, true);
					oSpaceship1.SetupPhysics5(((GameObject) (oSpaceship1)).myX, ((GameObject) (oSpaceship1)).myY, null, f3, f4,
							f * gameApplet.viewScale, 0.15F, false, true);
				}
				oSpaceship1.timeSinceEpoch = -j1 - 20;
				return;
			}
			if (k == 2) {
				oSpaceship1.SetupPhysics5(f3, f4, null, f3, f4, f * gameApplet.viewScale, 0.15F, false, true);
				return;
			}
			oSpaceship1.SetupPhysics6(f3 - 5F, f4, null, f3, f4, f * gameApplet.viewScale, 1.0F, 0.15F, true);
		}
	}

	final void HNSM(final GameObjectPool oGameObjectlist1, final float f, final float f1, final float f2, final float f3) {
		final int i = oGameObjectlist1.mySize;
		for (int j = 0; j < i; j++) {
			final oSpaceship oSpaceship1 = (oSpaceship) (j < 0 || j >= oGameObjectlist1.mySize ? null : oGameObjectlist1.internalList[j]);
			if (((GameObject) (oSpaceship1)).GetActiveState() == ActiveMode.DisableExtent) {
				float f4 = f + ((float) Math.random() - 0.5F) * f2;
				final float f5 = f1 + ((float) Math.random() - 0.5F) * f3;
				int k = 0;
				if (((GameObject) (oSpaceship1)).HI == 101)
					f4 = f + f2 / 2.0F + 50F;
				else
					k = (int) (Math.random() * 40D);
				final Explosion explosion1 = (Explosion) gameApplet.rZ.GiveLastInstanceTo(gameApplet.qZ);
				if (explosion1 != null) {
					explosion1.I(gameApplet.sprite_group_ship, 1, (int) f4 - -50F, (int) f5, 0.0F, 0.0F, 1, 2, 0,
							false);
					explosion1.timeSinceEpoch = -k;
				}

				oSpaceship1.SetActiveState(ActiveMode.Activated);
				if (((GameObject) (oSpaceship1)).HI == 101) {
					oSpaceship1.SetupPhysics3(f4, f5, 2.0F, 0.0F, ((GameObject) (oSpaceship1)).M, ((GameObject) (oSpaceship1)).myFriction,
							false);
					oSpaceship1.timeSinceEpoch = -10;
					oSpaceship1.QI = 4;
				} else {
					oSpaceship1.QI = 2;
					oSpaceship1.SetupPhysics6(f4 - -50F, f5, null, f4, f5, ((GameObject) (oSpaceship1)).M,
							((GameObject) (oSpaceship1)).c, ((GameObject) (oSpaceship1)).myFriction,
							((GameObject) (oSpaceship1)).hasAnimation);
					oSpaceship1.SetupPhysics2(((GameObject) (oSpaceship1)).myX, ((GameObject) (oSpaceship1)).myY, 0.0F, 0.0F, true);
					oSpaceship1.SetupPhysics5(((GameObject) (oSpaceship1)).myX, ((GameObject) (oSpaceship1)).myY, null, f4, f5,
							((GameObject) (oSpaceship1)).M, ((GameObject) (oSpaceship1)).myFriction, false, true);
					oSpaceship1.timeSinceEpoch = -k - 20;
				}
			}
		}

	}

	final void Z(final int i, final float f, final float f1, final float f2) {
		final oSpaceship oSpaceship1 = (oSpaceship) gameApplet.xZ.GiveLastInstanceTo(gameApplet.dZ);
		if (oSpaceship1 != null) {
			oSpaceship1.I(i, 1, 0.0F);
			oSpaceship1.SetupPhysics3(f, f1, 2.0F, 0.0F, f2 * gameApplet.viewScale, 0.03F, false);
			oSpaceship1.timeSinceEpoch = -10;
			oSpaceship1.QI = 4;
			gameApplet.myCamera.I(oSpaceship1, true, 0.0F, 0.0F);
			oSpaceship1.HI = 101;
			oSpaceship1.CI = true;
			oSpaceship1.BI = 0.3F;
			final Explosion explosion1 = (Explosion) gameApplet.rZ.GiveLastInstanceTo(gameApplet.qZ);
			if (explosion1 != null)
				explosion1.I(gameApplet.sprite_group_ship, 1, (int) f, (int) f1, 0.0F, 0.0F, 1, 2, 0, false);
			gameApplet.MC = 0.0F;
			gameApplet.eZ = 0;
			gameApplet.gZ = 0;
			gameApplet.hZ = 1;
			gameApplet.kZ = 0;
			gameApplet.lZ = 0;
			gameApplet.mZ = 0;
		}
	}

	final void abs(final int i) {
		gameApplet.EC.I();
		gameApplet.GC.I();
		gameApplet.AC.I();
		for (int j = 0; j < 5; j++)
			append((gameApplet.worldBorderLeft + (float) Math.random() * gameApplet.worldDimension[0]) * 0.8F,
					(gameApplet.worldBorderTop + (float) Math.random() * gameApplet.worldDimension[1]) * 0.8F,
					-1, -1, 0, true,
					gameApplet.vI, 0);

		for (int k = 0; k < 5; k++)
			append((gameApplet.worldBorderLeft + (float) Math.random() * gameApplet.worldDimension[0]) * 0.8F,
					(gameApplet.worldBorderTop + (float) Math.random() * gameApplet.worldDimension[1]) * 0.8F,
					-1, -1, 0, true,
					gameApplet.wI, 0);

		for (int l = 0; l < 5; l++)
			append((gameApplet.worldBorderLeft + (float) Math.random() * gameApplet.worldDimension[0]) * 0.8F,
					(gameApplet.worldBorderTop + (float) Math.random() * gameApplet.worldDimension[1]) * 0.8F,
					-1, -1, 0, true,
					gameApplet.xI, 0);

		switch (i) {
			case 9: // '\t'
				append(0.45F, 0.55F, -1, -1, 0, true, gameApplet.eI, 1);
				append(0.41F, 0.52F, -1, -1, 0, true, gameApplet.tI, 0);
				append(0.58F, 0.42F, -1, -1, 0, true, gameApplet.pI, 0);
				append(0.6F, 0.59F, -1, -1, 0, true, gameApplet.nI, 0);
				append(0.45F, 0.4F, -1, -1, 0, true, gameApplet.nI, 0);
				append(0.35F, 0.3F, -1, -1, 0, true, gameApplet.qI, 0);
				append(0.62F, 0.38F, -1, -1, 0, true, gameApplet.IZ, 0);
				return;

			case 10: // '\n'
				gameApplet.AC.I();
				append(0.53F, 0.52F, -1, -1, 0, true, gameApplet.vI, 0);
				append(0.465F, 0.47F, -1, -1, 0, true, gameApplet.wI, 0);
				append(0.53F, 0.465F, -1, -1, 0, true, gameApplet.jI, 1);
				append(0.475F, 0.53F, -1, -1, 0, true, gameApplet.eI, 3);
				return;

			case 1: // '\001'
				append(0.25F, 0.75F, 100, 1, 10000, true, gameApplet.eI, 0);
				append(0.21F, 0.72F, -1, -1, 0, true, gameApplet.tI, 0);
				append(0.58F, 0.42F, -1, -1, 0, true, gameApplet.pI, 0);
				append(0.6F, 0.59F, -1, -1, 0, true, gameApplet.nI, 0);
				append(0.45F, 0.4F, -1, -1, 0, true, gameApplet.nI, 0);
				append(0.55F, 0.73F, -1, -1, 0, true, gameApplet.qI, 0);
				append(0.4F, 0.68F, -1, -1, 0, true, gameApplet.qI, 0);
				append(0.2F, 0.3F, -1, -1, 0, true, gameApplet.qI, 0);
				append(0.65F, 0.5F, -1, -1, 0, true, gameApplet.qI, 0);
				append(0.35F, 0.55F, -1, -1, 0, true, gameApplet.IZ, 0);
				return;

			case 2: // '\002'
				append(0.35F, 0.65F, -1, -1, 0, true, gameApplet.eI, 2);
				append(0.34F, 0.62F, -1, -1, 0, true, gameApplet.tI, 1);
				append(0.6F, 0.52F, -1, -1, 0, true, gameApplet.nI, 0);
				append(0.45F, 0.4F, -1, -1, 0, true, gameApplet.pI, 0);
				append(0.25F, 0.25F, -1, -1, 0, true, gameApplet.qI, 0);
				append(0.75F, 0.35F, -1, -1, 0, true, gameApplet.qI, 0);
				append(0.4F, 0.55F, -1, -1, 0, true, gameApplet.IZ, 1);
				return;

			case 4: // '\004'
				append(0.47F, 0.44F, -1, -1, 0, true, gameApplet.mI, 1);
				append(0.3F, 0.28F, -1, -1, 0, true, gameApplet.nI, 0);
				append(0.6F, 0.55F, -1, -1, 0, true, gameApplet.nI, 0);
				append(0.7F, 0.35F, -1, -1, 0, true, gameApplet.rI, 0);
				append(0.69F, 0.62F, -1, -1, 0, true, gameApplet.rI, 0);
				append(0.26F, 0.58F, -1, -1, 0, true, gameApplet.qI, 0);
				append(0.45F, 0.55F, -1, -1, 0, true, gameApplet.IZ, 1);
				append(0.32F, 0.5F, -1, -1, 0, true, gameApplet.oI, 1);
				return;

			case 3: // '\003'
				append(0.7F, 0.3F, 102, -1, 0, true, gameApplet.mI, 0);
				append(0.4F, 0.6F, -1, -1, 0, true, gameApplet.oI, 0);
				append(0.43F, 0.48F, -1, -1, 0, true, gameApplet.IZ, 0);
				append(0.35F, 0.25F, -1, -1, 0, true, gameApplet.nI, 0);
				append(0.63F, 0.63F, -1, -1, 0, true, gameApplet.nI, 0);
				append(0.25F, 0.7F, -1, -1, 0, true, gameApplet.rI, 0);
				append(0.55F, 0.35F, -1, -1, 0, true, gameApplet.rI, 0);
				append(0.74F, 0.55F, -1, -1, 0, true, gameApplet.qI, 0);
				return;

			case 5: // '\005'
				append(0.51F, 0.54F, -1, -1, 0, true, gameApplet.oI, 0);
				append(0.35F, 0.42F, -1, -1, 0, true, gameApplet.IZ, 1);
				append(0.42F, 0.38F, -1, -1, 0, true, gameApplet.yI, 1);
				append(0.24F, 0.56F, -1, -1, 0, true, gameApplet.pI, 0);
				append(0.35F, 0.71F, -1, -1, 0, true, gameApplet.nI, 0);
				append(0.7F, 0.31F, -1, -1, 0, true, gameApplet.nI, 0);
				append(0.23F, 0.26F, -1, -1, 0, true, gameApplet.rI, 0);
				append(0.54F, 0.22F, -1, -1, 0, true, gameApplet.rI, 0);
				append(0.74F, 0.63F, -1, -1, 0, true, gameApplet.qI, 0);
				return;

			case 6: // '\006'
				append(0.39F, 0.52F, -1, -1, 0, true, gameApplet.aI, 0);
				append(0.71F, 0.54F, -1, -1, 0, true, gameApplet.yI, 1);
				append(0.48F, 0.61F, -1, -1, 0, true, gameApplet.uI, 1);
				append(0.5F, 0.63F, -1, -1, 0, true, gameApplet.jI, 1);
				append(0.6F, 0.34F, -1, -1, 0, true, gameApplet.sI, 1);
				return;

			case 7: // '\007'
				append(0.75F, 0.75F, -1, -1, 0, true, gameApplet.sI, 0);
				append(0.39F, 0.52F, -1, -1, 0, true, gameApplet.aI, 1);
				append(0.71F, 0.54F, -1, -1, 0, true, gameApplet.yI, 0);
				append(0.48F, 0.61F, -1, -1, 0, true, gameApplet.uI, 1);
				append(0.5F, 0.63F, -1, -1, 0, true, gameApplet.jI, 1);
				return;

			case 8: // '\b'
				append(0.71F, 0.61F, -1, -1, 0, true, gameApplet.uI, 0);
				append(0.75F, 0.25F, 103, 2, 10000, true, gameApplet.jI, 0);
				append(0.39F, 0.52F, -1, -1, 0, true, gameApplet.aI, 1);
				append(0.71F, 0.54F, -1, -1, 0, true, gameApplet.yI, 0);
				append(0.5F, 0.63F, -1, -1, 0, true, gameApplet.sI, 1);
				return;
		}
		System.out.println("launchBackground undefined nBackgroundType");
	}

	final void append(float f, float f1, final int i, final int j, final int k, final boolean flag, final SpriteGroup sprite_group1, final int l) {
		if (Math.abs(f) < 1.0F && Math.abs(f1) < 1.0F) {
			f = gameApplet.worldDimension[0] * f - gameApplet.worldDimension[0] / 2.0F;
			f1 = gameApplet.worldDimension[1] * f1 - gameApplet.worldDimension[1] / 2.0F;
		}
		oPlanet oPlanet1;
		if (j != -1) {
			if (j == 1)
				oPlanet1 = (oPlanet) gameApplet.JC.GiveLastInstanceTo(gameApplet.EC);
			else
				oPlanet1 = (oPlanet) gameApplet.JC.GiveLastInstanceTo(gameApplet.GC);
		} else {
			oPlanet1 = (oPlanet) gameApplet.JC.GiveLastInstanceTo(gameApplet.AC);
		}
		if (oPlanet1 != null) {
			oPlanet1.Initialize(sprite_group1, k, flag, 0, l);
			oPlanet1.CleanupPhysics(f, f1, false);
			if (i != -1)
				oPlanet1.HI = i;
		}
	}

	final void blue(final int i, final GameObjectPool oGameObjectlist1, final int j, final int k, final int l, final float f) {
		int i2 = 0;
		int j2 = 0;
		final int k2 = oGameObjectlist1.mySize;
		if (k2 == 0)
			return;
		final oSpaceship aspaceship[] = new oSpaceship[k2];
		for (int i1 = 0; i1 < k2; i1++) {
			final oSpaceship oSpaceship1 = (oSpaceship) (i1 < 0 || i1 >= oGameObjectlist1.mySize ? null : oGameObjectlist1.internalList[i1]);
			if (((GameObject) (oSpaceship1)).prefabID == j) {
				aspaceship[i2] = oSpaceship1;
				i2++;
			}
		}

		if (i2 == 0)
			return;
		final oSpaceship aspaceship1[] = new oSpaceship[k2];
		for (int j1 = 0; j1 < k2; j1++) {
			final oSpaceship oSpaceship2 = (oSpaceship) (j1 < 0 || j1 >= oGameObjectlist1.mySize ? null : oGameObjectlist1.internalList[j1]);
			if (((GameObject) (oSpaceship2)).prefabID == k) {
				aspaceship1[j2] = oSpaceship2;
				j2++;
			}
		}

		if (j2 == 0)
			return;
		int k1 = 0;
		for (int l1 = 0; k1 < i2; l1++) {
			if (l1 >= j2)
				l1 = 0;
			aspaceship[k1].I(aspaceship1[l1], l, f);
			k1++;
		}

	}

	final void compareTo(final GameObjectPool oGameObjectlist1)
	{
		final int i = oGameObjectlist1.mySize;
		for (int j = 0; j < i; j++)
		{
			final oSpaceship oSpaceship1 = (oSpaceship) (j < 0 || j >= oGameObjectlist1.mySize ? null : oGameObjectlist1.internalList[j]);

			if (((GameObject) (oSpaceship1)).IsActivated())
			{
				oSpaceship1.QI = 3;
				oSpaceship1.MI = 25;

				final Explosion explosion1 = (Explosion) gameApplet.rZ.GiveLastInstanceTo(gameApplet.qZ);
				if (explosion1 != null)
					explosion1.I(gameApplet.sprite_group_ship, 1,
							(int) (((GameObject) (oSpaceship1)).myX + ((GameObject) (oSpaceship1)).hSpeed * 25F),
							(int) (((GameObject) (oSpaceship1)).myY + ((GameObject) (oSpaceship1)).vSpeed * 25F), 0.0F, 0.0F,
							1, 2, 0, false);
				oSpaceship1.SetupPhysics2(((GameObject) (oSpaceship1)).myX, ((GameObject) (oSpaceship1)).myY,
						((GameObject) (oSpaceship1)).hSpeed, ((GameObject) (oSpaceship1)).vSpeed,
						((GameObject) (oSpaceship1)).hasAnimation);
			}
		}

	}

	final void getName(final int i, final float f, final float f1, final boolean flag, final int j, final int k, final int l, final int i1)
	{
		if (i == 1)
		{
			gameApplet.vZ.I(f, f1, flag, j, k, l, i1);
			gameApplet.dZ.I(f, f1, flag, j, k, l, i1);
			gameApplet.EC.I(f, f1, flag, j, k, l, i1);
			return;
		}
		else
		{
			gameApplet.wZ.I(f, f1, flag, j, k, l, i1);
			gameApplet.GC.I(f, f1, flag, j, k, l, i1);
			return;
		}
	}

	final float I(final float f, final float f1)
	{
		if (f1 < 0.0F)
			return Math.max(f + f1 * Q, f / 3F);
		else
			return f + f1 * Q;
	}

	Trigger myTriggers[];
	int triggersCount;
	int Z;
	int abs;
	GameQuest I;
	GameQuest C;
	boolean append;
	int blue;
	String B;
	int compareTo;
	int getName;
	int gray;
	int lightGray;
	int max;
	int out;
	int println;
	int random[];
	int red[];
	float toString[];
	float D;
	int J;
	int S[];
	int A[];
	int E;
	int G;
	boolean valueOf;
	int H;
	boolean K;
	boolean L;
	boolean M;
	GameApp gameApplet;
	int usingTriggersCount;
	int P;
	int Q;
}
