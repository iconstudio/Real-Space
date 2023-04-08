package realspace;
// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.

// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   star_y

import java.awt.Color;

final class gamemission {
	gamemission(GameApp owner, int i) {
		B = "";
		this.owner = owner;
		F = new missioncmd[i];
		HNSM = i;
		random = new int[20];
		red = new int[20];
		toString = new float[20];
		S = new int[10];
		A = new int[10];
		I = new gameobjectivelist(owner, 1, 20);
		C = new gameobjectivelist(owner, 2, 20);
		O = -1;
	}

	final void F(int i) {
		O = i;
		for (int j = 0; j < HNSM; j++)
			F[j] = null;

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
		GameObjectPool oGameObjectlist1 = owner.vZ;
		int i1 = oGameObjectlist1.mySize;
		for (int k = 0; k < i1; k++) {
			oGameObjectlist1 = owner.vZ;
			oSpaceship oSpaceship1 = (oSpaceship) (k < 0 || k >= oGameObjectlist1.mySize ? null : oGameObjectlist1.internalList[k]);
			oSpaceship1.II = false;
			oSpaceship1.NI = false;
			oSpaceship1.LI = 0;
			oSpaceship1.MI = -1;
			if (!((GameObject) (oSpaceship1)).CI)
				oSpaceship1.Equip(true, null);
			else if (((GameObject) (oSpaceship1)).g != null) {
				((oSpaceship) ((GameObject) (oSpaceship1)).g).D++;
				oSpaceship1.Equip(true, null);
			}
		}

		oGameObjectlist1 = owner.wZ;
		i1 = oGameObjectlist1.mySize;
		for (int l = 0; l < i1; l++) {
			GameObjectPool oGameObjectlist2 = owner.wZ;
			oSpaceship oSpaceship2 = (oSpaceship) (l < 0 || l >= oGameObjectlist2.mySize ? null : oGameObjectlist2.internalList[l]);
			oSpaceship2.II = false;
			oSpaceship2.NI = false;
			oSpaceship2.LI = 0;
			oSpaceship2.MI = -1;
			if (!((GameObject) (oSpaceship2)).CI)
				oSpaceship2.Equip(true, null);
			else if (((GameObject) (oSpaceship2)).g != null) {
				((oSpaceship) ((GameObject) (oSpaceship2)).g).D++;
				oSpaceship2.Equip(true, null);
			}
		}

		owner.qC = false;
		owner.OC = true;
	}

	final void I(int i) {
		F(i);
		int j = owner.viewWidth / 2;
		int k = owner.viewHeight / 2;
		int l = owner.viewWidth / 2;
		int i1 = owner.viewHeight / 4;
		int j1 = owner.viewWidth / 2;
		int k1 = owner.viewHeight / 4;
		int l1 = owner.viewWidth / 2;
		int i2 = (owner.viewHeight * 2) / 3;
		int j2 = (int) (200F * owner.viewScale);
		int k2 = owner.viewHeight - owner.label_font.C - 5;
		int l2 = owner.viewWidth / 2;
		int i3 = owner.viewHeight - (owner.label_font.C + 20);
		Palette temp_palette_1, temp_palette_2;

		switch (i) {
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
				Object obj = owner.flashcolor_white;
				Object obj9 = owner.flashcolor_navy;
				Font gamefont1 = owner.hFontSmall;
				show_flashstring(-1, "Objectives Failed||Aborting Mission", ((Palette) (obj)), ((Palette) (obj9)),
						gamefont1, true, l1, i2, 0, 150, 0, true, true, 1, -1, 0);
				lightGray(100);
				obj = owner.flashcolor_white;
				obj9 = owner.flashcolor_navy;
				gamefont1 = owner.label_font;
				show_flashstring(-1, "Your Ship, The KFS Vengeance|Has Been Destroyed!", ((Palette) (obj)),
						((Palette) (obj9)), gamefont1, true, j1, k1, 0, 190, 0, true, true, 1, -1, 0);
				max(true, false, -1, -1, -1, -1, -1);
				lightGray(140);
				obj = Color.red;
				obj9 = Color.gray;
				gamefont1 = owner.hFontLarge;
				F(-1, "Game Over", ((Color) (obj)), ((Color) (obj9)), gamefont1, true, j1, k1, 0, 300, 0, true, true, 2,
						null, null, -1, 0);
				lightGray(5);
				gray();
				blue();
				return;

			case 1100:
				compareTo(false);
				lightGray(30);
				Object obj1 = owner.flashcolor_white;
				Object obj10 = owner.flashcolor_navy;
				Object obj19 = owner.hFontSmall;
				show_flashstring(-1, "Objectives Failed||Aborting Mission", ((Palette) (obj1)), ((Palette) (obj10)),
						((Font) (obj19)), true, l1, i2, 0, 150, 0, true, true, 1, -1, 0);
				lightGray(100);
				obj1 = B + "|Has Been Destroyed!";
				obj10 = owner.flashcolor_white;
				obj19 = owner.flashcolor_navy;
				Font gamefont7 = owner.label_font;
				show_flashstring(-1, ((String) (obj1)), ((Palette) (obj10)), ((Palette) (obj19)), gamefont7, true, j1,
						k1,
						0, 190, 0, true, true, 1, -1, 0);
				max(true, false, -1, -1, -1, -1, -1);
				lightGray(140);
				obj1 = Color.red;
				obj10 = Color.gray;
				obj19 = owner.hFontLarge;
				F(-1, "Game Over", ((Color) (obj1)), ((Color) (obj10)), ((Font) (obj19)), true, j1, k1, 0, 300, 0, true,
						true, 2, null, null, -1, 0);
				lightGray(5);
				gray();
				blue();
				return;

			case 1102:
				append(true);
				lightGray(30);
				Object obj2 = owner.flashcolor_white;
				Object obj11 = owner.flashcolor_navy;
				Font gamefont2 = owner.hFontSmall;
				show_flashstring(-1, "Objectives Failed||Aborting Mission", ((Palette) (obj2)), ((Palette) (obj11)),
						gamefont2, true, l1, i2, 0, 150, 0, true, true, 1, -1, 0);
				lightGray(100);
				obj2 = owner.flashcolor_white;
				obj11 = owner.flashcolor_navy;
				gamefont2 = owner.label_font;
				show_flashstring(-1, "Your Ships Have Been Destroyed!", ((Palette) (obj2)), ((Palette) (obj11)),
						gamefont2,
						true, j1, k1, 0, 190, 0, true, true, 1, -1, 0);
				max(true, false, -1, -1, -1, -1, -1);
				lightGray(140);
				obj2 = Color.red;
				obj11 = Color.gray;
				gamefont2 = owner.hFontLarge;
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
				Object obj3 = owner.vZ;
				((GameObjectPool) (obj3)).I(true, null, -1, -1, -1, -1);
				obj3 = owner.wZ;
				((GameObjectPool) (obj3)).I(true, null, -1, -1, -1, -1);
				toString(9);
				gray(0.0F, 0.0F, true, 30F);
				obj3 = "Visit " + owner.labelSimpleURL;
				Palette palette = owner.flashcolor_white;
				Object obj20 = owner.flashcolor_navy;
				Object obj30 = owner.hFontSmall;
				show_flashstring(3, ((String) (obj3)), palette, ((Palette) (obj20)), ((Font) (obj30)), true, l2, i3, 0,
						10000, 0, true, false, 0, -1, 0);
				lightGray(10);
				obj3 = owner.flashcolor_yellow;
				palette = owner.flashcolor_red;
				obj20 = owner.label_font;
				show_flashstring(-1, "The Terrans Invaded", ((Palette) (obj3)), palette, ((Font) (obj20)), true, j, k,
						0, 70, 0, true, true, 0, -1, 0);
				lightGray(10);
				blue(1, false, false, 1.0F);
				int ai[] = { 102, 112, 112, 120, 122, -1 };
				instance_create_group(1, ai, 3, true, 0.0F, 0.0F, owner.worldHrz / 2.0F, 3F);
				blue(2, false, false, 1.0F);
				int ai1[] = { 201, 212, 213, 220, 223, -1 };
				instance_create_group(2, ai1, 3, true, 0.0F, 0.0F, owner.worldHrz / 2.0F, 3F);
				gray(1, 100, 102, 5F);
				gray(1, 100, 103, 8F);
				gray(1, 100, 111, 4F);
				gray(1, 100, 112, 4F);
				gray(1, 90, 120, 3F);
				gray(1, 90, 121, 3F);
				gray(1, 70, 122, 3F);
				gray(1, 60, 123, 1.5F);
				lightGray(1, 100, 5, 1);
				Z(1, owner.YC + (int) (owner.worldHrz * 0.10000000000000001D),
						owner.zC
								+ (int) (owner.worldVrt * 0.10000000000000001D),
						(int) (owner.worldHrz * 0.8F), (int) (owner.worldVrt * 0.8F));
				gray(2, 100, 202, 3F);
				gray(2, 100, 203, 3F);
				gray(2, 100, 211, 4F);
				gray(2, 100, 212, 4F);
				gray(2, 120, 220, 4.5F);
				gray(2, 110, 221, 4.5F);
				gray(2, 100, 222, 6F);
				gray(2, 100, 223, 6F);
				lightGray(2, 90, 5, 1);
				Z(2, owner.YC + (int) (owner.worldHrz * 0.10000000000000001D),
						owner.zC
								+ (int) (owner.worldVrt * 0.10000000000000001D),
						(int) (owner.worldHrz * 0.8F), (int) (owner.worldVrt * 0.8F));
				abs();
				lightGray(70);
				obj20 = owner.flashcolor_yellow;
				obj30 = owner.flashcolor_red;
				Object obj39 = owner.label_font;
				show_flashstring(-1, "We Struck Back", ((Palette) (obj20)), ((Palette) (obj30)), ((Font) (obj39)), true,
						j, k, 0, 70, 0, true, true, 0, -1, 0);
				lightGray(80);
				obj20 = owner.labelSimpleURL + " Presents";
				obj30 = owner.flashcolor_white;
				obj39 = owner.flashcolor_navy;
				Font gamefont16 = owner.label_font;
				show_flashstring(-1, ((String) (obj20)), ((Palette) (obj30)), ((Palette) (obj39)), gamefont16, true, j,
						k,
						0, 70, 0, true, true, 0, -1, 0);
				lightGray(80);
				obj20 = owner.flashcolor_white;
				obj30 = owner.flashcolor_navy;
				obj39 = owner.label_font;
				show_flashstring(-1, "Realspace 2 - Emperor's Revenge", ((Palette) (obj20)), ((Palette) (obj30)),
						((Font) (obj39)), true, j, k, 0, 200, 0, true, true, 0, -1, 0);
				lightGray(40);
				obj20 = owner.flashcolor_yellow;
				obj30 = owner.flashcolor_red;
				obj39 = owner.hFontSmall;
				int i4 = j + 50;
				@SuppressWarnings("unused")
				Font gamefont27;
				int j4 = k + (gamefont27 = owner.label_font).C * 2;
				show_flashstring(-1, "Copyright 2001 AltoParc|www.altoparc.com", ((Palette) (obj20)),
						((Palette) (obj30)),
						((Font) (obj39)), true, i4, j4, 0, 165, 0, true, true, 0, -1, 0);
				lightGray(170);
				obj20 = owner.flashcolor_yellow;
				obj30 = owner.flashcolor_red;
				obj39 = owner.label_font;
				show_flashstring(-1, "We Smashed The Terran Frontier", ((Palette) (obj20)), ((Palette) (obj30)),
						((Font) (obj39)), true, j, k, 0, 70, 0, true, true, 0, -1, 0);
				lightGray(80);
				obj20 = owner.flashcolor_yellow;
				obj30 = owner.flashcolor_red;
				obj39 = owner.label_font;
				show_flashstring(-1, "Destroyed Their Outposts", ((Palette) (obj20)), ((Palette) (obj30)),
						((Font) (obj39)), true, j, k, 0, 70, 0, true, true, 0, -1, 0);
				lightGray(80);
				obj20 = owner.flashcolor_yellow;
				obj30 = owner.flashcolor_red;
				obj39 = owner.label_font;
				show_flashstring(-1, "Apocalypse Outpost Stopped Us", ((Palette) (obj20)), ((Palette) (obj30)),
						((Font) (obj39)), true, j, k, 0, 100, 0, true, true, 0, -1, 0);
				lightGray(110);
				obj20 = owner.flashcolor_yellow;
				obj30 = owner.flashcolor_red;
				obj39 = owner.label_font;
				show_flashstring(-1, "Then The Antaris Crushed Our Forces", ((Palette) (obj20)), ((Palette) (obj30)),
						((Font) (obj39)), true, j, k, 0, 100, 0, true, true, 0, -1, 0);
				lightGray(110);
				obj20 = owner.flashcolor_yellow;
				obj30 = owner.flashcolor_red;
				obj39 = owner.label_font;
				show_flashstring(-1, "We Had Nothing Left To Stop Them", ((Palette) (obj20)), ((Palette) (obj30)),
						((Font) (obj39)), true, j, k, 0, 100, 0, true, true, 0, -1, 0);
				lightGray(110);
				obj20 = owner.flashcolor_yellow;
				obj30 = owner.flashcolor_red;
				obj39 = owner.label_font;
				show_flashstring(-1, "They Attacked And Destroyed All|Worlds That Would Not Succumb",
						((Palette) (obj20)),
						((Palette) (obj30)), ((Font) (obj39)), true, j, k, 0, 140, 0, true, true, 0, -1, 0);
				lightGray(150);
				obj20 = owner.flashcolor_yellow;
				obj30 = owner.flashcolor_red;
				obj39 = owner.label_font;
				show_flashstring(-1, "They Devestated Our Homeworld", ((Palette) (obj20)), ((Palette) (obj30)),
						((Font) (obj39)), true, j, k, 0, 100, 0, true, true, 0, -1, 0);
				lightGray(110);
				obj20 = owner.flashcolor_yellow;
				obj30 = owner.flashcolor_red;
				obj39 = owner.label_font;
				show_flashstring(-1, "The Emperor And The Katuri|People Demand Revenge!", ((Palette) (obj20)),
						((Palette) (obj30)), ((Font) (obj39)), true, j, k, 0, 150, 0, true, true, 0, -1, 0);
				lightGray(160);
				obj20 = owner.flashcolor_yellow;
				obj30 = owner.flashcolor_red;
				obj39 = owner.label_font;
				show_flashstring(-1, "Gather Our Remaing Forces", ((Palette) (obj20)), ((Palette) (obj30)),
						((Font) (obj39)), true, j, k, 0, 70, 0, true, true, 0, -1, 0);
				lightGray(80);
				obj20 = owner.flashcolor_yellow;
				obj30 = owner.flashcolor_red;
				obj39 = owner.label_font;
				show_flashstring(-1, "Drive Back The Terran Defilers", ((Palette) (obj20)), ((Palette) (obj30)),
						((Font) (obj39)), true, j, k, 0, 70, 0, true, true, 0, -1, 0);
				lightGray(80);
				obj20 = owner.flashcolor_yellow;
				obj30 = owner.flashcolor_red;
				obj39 = owner.label_font;
				show_flashstring(-1, "And Exact Our Revenge By Destroying|Their Homeworld... The Earth!",
						((Palette) (obj20)), ((Palette) (obj30)), ((Font) (obj39)), true, j, k, 0, 200, 0, true, true,
						0, -1, 0);
				lightGray(250);
				obj20 = owner.flashcolor_white;
				obj30 = owner.flashcolor_navy;
				obj39 = owner.label_font;
				show_flashstring(-1, "Game Design & Programming||Brian Fisher", ((Palette) (obj20)),
						((Palette) (obj30)),
						((Font) (obj39)), true, j, k, 0, 200, 0, true, true, 0, -1, 0);
				lightGray(250);
				obj20 = owner.flashcolor_white;
				obj30 = owner.flashcolor_navy;
				obj39 = owner.label_font;
				show_flashstring(-1, "Artwork||Rodrigo Aguilar", ((Palette) (obj20)), ((Palette) (obj30)),
						((Font) (obj39)), true, j, k, 0, 200, 0, true, true, 0, -1, 0);
				lightGray(250);
				obj20 = owner.flashcolor_white;
				obj30 = owner.flashcolor_navy;
				obj39 = owner.label_font;
				show_flashstring(-1, "Music||Jason Graves", ((Palette) (obj20)), ((Palette) (obj30)), ((Font) (obj39)),
						true, j, k, 0, 200, 0, true, true, 0, -1, 0);
				lightGray(250);
				obj20 = owner.flashcolor_white;
				obj30 = owner.flashcolor_navy;
				obj39 = owner.label_font;
				show_flashstring(-1,
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
				owner.NC = false;
				GameObjectPool oGameObjectlist1 = owner.vC;
				oGameObjectlist1.I(true, null, -1, -1, -1, -1);
				gray(0.0F, 0.0F, true, 30F);
				owner.PC = 1;
				oGameObjectlist1 = owner.oZ;
				oGameObjectlist1.I(true, null, -1, -1, -1, -1);
				oGameObjectlist1 = owner.pZ;
				oGameObjectlist1.I(true, null, -1, -1, -1, -1);
				oGameObjectlist1 = owner.qZ;
				oGameObjectlist1.I(true, null, -1, -1, -1, -1);
				oGameObjectlist1 = owner.tZ;
				oGameObjectlist1.I(true, null, -1, -1, -1, -1);
				oGameObjectlist1 = owner.vZ;
				oGameObjectlist1.I(true, null, -1, -1, -1, -1);
				oGameObjectlist1 = owner.wZ;
				oGameObjectlist1.I(true, null, -1, -1, -1, -1);
				oGameObjectlist1 = owner.yZ;
				oGameObjectlist1.I(true, null, -1, -1, -1, -1);
				oGameObjectlist1 = owner.IC;
				oGameObjectlist1.I(true, null, -1, -1, -1, -1);
				oGameObjectlist1 = owner.ZC;
				oGameObjectlist1.I(true, null, -1, -1, -1, -1);
				oGameObjectlist1 = owner.AC;
				oGameObjectlist1.I(true, null, -1, -1, -1, -1);
				oGameObjectlist1 = owner.EC;
				oGameObjectlist1.I(true, null, -1, -1, -1, -1);
				oGameObjectlist1 = owner.GC;
				oGameObjectlist1.I(true, null, -1, -1, -1, -1);
				oGameObjectlist1 = owner.BC;
				oGameObjectlist1.I(true, null, -1, -1, -1, -1);
				toString(10);
				int j3 = (int) (120F * owner.viewScale);
				Object obj12 = owner.flashcolor_yellow;
				Object obj21 = owner.flashcolor_red;
				Object obj31 = owner.hFontLarge;
				show_flashstring(-1, "Choose One Of The Following", ((Palette) (obj12)), ((Palette) (obj21)),
						((Font) (obj31)), true, j, j3, 0, 1000, 0, true, false, 0, -1, 0);
				obj12 = owner.hFontSmall;
				j3 += ((Font) (obj12)).C + (int) (35F * owner.viewScale);
				obj12 = owner.flashcolor_white;
				obj21 = owner.flashcolor_navy;
				obj31 = owner.label_font;
				show_flashstring(1, "Start Game", ((Palette) (obj12)), ((Palette) (obj21)), ((Font) (obj31)), true, j,
						j3, 0, 1000, 0, true, false, 0, -1, 0);
				obj12 = owner.label_font;
				j3 += ((Font) (obj12)).C + (int) (20F * owner.viewScale);
				obj12 = "Detail Level - Normal / High";
				if (owner.QC == 2)
					obj12 = "Detail Level - Medium";
				else if (owner.QC == 3)
					obj12 = "Detail Level - Low";
				obj21 = owner.flashcolor_white;
				obj31 = owner.flashcolor_navy;
				Object obj40 = owner.label_font;
				show_flashstring(2, ((String) (obj12)), ((Palette) (obj21)), ((Palette) (obj31)), ((Font) (obj40)),
						true, j, j3, 0, 1000, 0, true, false, 0, -1, 0);
				obj21 = owner.label_font;
				j3 += ((Font) (obj21)).C * 2 + (int) (20F * owner.viewScale);
				obj21 = "Visit " + owner.labelSimpleURL;
				obj31 = owner.flashcolor_white;
				obj40 = owner.flashcolor_navy;
				Font gamefont17 = owner.label_font;
				show_flashstring(3, ((String) (obj21)), ((Palette) (obj31)), ((Palette) (obj40)), gamefont17, true, j,
						j3,
						0, 1000, 0, true, false, 0, -1, 0);
				obj21 = owner.label_font;
				j3 += ((Font) (obj21)).C * 2 + (int) (20F * owner.viewScale);
				obj21 = owner.flashcolor_white;
				obj31 = owner.flashcolor_navy;
				obj40 = owner.label_font;
				show_flashstring(4, "Return To Demo Mode", ((Palette) (obj21)), ((Palette) (obj31)), ((Font) (obj40)),
						true, j, j3, 0, 1000, 0, true, false, 0, -1, 0);
				max();
				lightGray(1000);
				blue();
				return;

			case 301:
				GameObjectPool oGameObjectlist2 = owner.vC;
				oGameObjectlist2.I(true, null, -1, -1, -1, -1);
				owner.PC = 1;
				max(true, true, -1, -1, -1, -1, -1);
				int k3 = (int) (120F * owner.viewScale);
				Object obj13 = owner.flashcolor_yellow;
				Palette palette1 = owner.flashcolor_red;
				Font gamefont8 = owner.hFontLarge;
				show_flashstring(-1, "Choose Game Difficulty", ((Palette) (obj13)), palette1, gamefont8, true, j, k3, 0,
						1000, 0, true, false, 0, -1, 0);
				obj13 = owner.hFontSmall;
				k3 += ((Font) (obj13)).C + (int) (35F * owner.viewScale);
				obj13 = owner.flashcolor_white;
				palette1 = owner.flashcolor_navy;
				gamefont8 = owner.label_font;
				show_flashstring(1, "Minor Skirmish", ((Palette) (obj13)), palette1, gamefont8, true, j, k3, 0, 1000, 0,
						true, false, 0, -1, 0);
				obj13 = owner.label_font;
				k3 += ((Font) (obj13)).C + (int) (20F * owner.viewScale);
				obj13 = owner.flashcolor_white;
				palette1 = owner.flashcolor_navy;
				gamefont8 = owner.label_font;
				show_flashstring(2, "Under Attack", ((Palette) (obj13)), palette1, gamefont8, true, j, k3, 0, 1000, 0,
						true,
						false, 0, -1, 0);
				obj13 = owner.label_font;
				k3 += ((Font) (obj13)).C + (int) (20F * owner.viewScale);
				obj13 = owner.flashcolor_white;
				palette1 = owner.flashcolor_navy;
				gamefont8 = owner.label_font;
				show_flashstring(3, "Major Battle", ((Palette) (obj13)), palette1, gamefont8, true, j, k3, 0, 1000, 0,
						true,
						false, 0, -1, 0);
				obj13 = owner.label_font;
				k3 += ((Font) (obj13)).C + (int) (20F * owner.viewScale);
				obj13 = owner.flashcolor_white;
				palette1 = owner.flashcolor_navy;
				gamefont8 = owner.label_font;
				show_flashstring(4, "Blitzkrieg", ((Palette) (obj13)), palette1, gamefont8, true, j, k3, 0, 1000, 0,
						true,
						false, 0, -1, 0);
				obj13 = owner.label_font;
				k3 += ((Font) (obj13)).C * 2 + (int) (20F * owner.viewScale);
				obj13 = owner.flashcolor_white;
				palette1 = owner.flashcolor_navy;
				gamefont8 = owner.label_font;
				show_flashstring(5, "Previous Menu", ((Palette) (obj13)), palette1, gamefont8, true, j, k3, 0, 1000, 0,
						true, false, 0, -1, 0);
				max();
				lightGray(1000);
				blue();
				return;

			case 302:
				GameObjectPool oGameObjectlist3 = owner.vC;
				oGameObjectlist3.I(true, null, -1, -1, -1, -1);
				owner.PC = owner.QC;
				max(true, true, -1, -1, -1, -1, -1);
				int l3 = (int) (120F * owner.viewScale);
				Object obj14 = owner.flashcolor_yellow;
				Palette palette2 = owner.flashcolor_red;
				Font gamefont9 = owner.hFontLarge;
				show_flashstring(-1, "Choose Detail Level", ((Palette) (obj14)), palette2, gamefont9, true, j, l3, 0,
						1000,
						0, true, false, 0, -1, 0);
				obj14 = owner.hFontSmall;
				l3 += ((Font) (obj14)).C + (int) (35F * owner.viewScale);
				obj14 = owner.flashcolor_white;
				palette2 = owner.flashcolor_navy;
				gamefont9 = owner.label_font;
				show_flashstring(1, "Normal / High", ((Palette) (obj14)), palette2, gamefont9, true, j, l3, 0, 1000, 0,
						true, false, 0, -1, 0);
				obj14 = owner.label_font;
				l3 += ((Font) (obj14)).C + (int) (20F * owner.viewScale);
				obj14 = owner.flashcolor_white;
				palette2 = owner.flashcolor_navy;
				gamefont9 = owner.label_font;
				show_flashstring(2, "Medium", ((Palette) (obj14)), palette2, gamefont9, true, j, l3, 0, 1000, 0, true,
						false, 0, -1, 0);
				obj14 = owner.label_font;
				l3 += ((Font) (obj14)).C + (int) (20F * owner.viewScale);
				obj14 = owner.flashcolor_white;
				palette2 = owner.flashcolor_navy;
				gamefont9 = owner.label_font;
				show_flashstring(3, "Low", ((Palette) (obj14)), palette2, gamefont9, true, j, l3, 0, 1000, 0, true,
						false,
						0, -1, 0);
				obj14 = owner.label_font;
				l3 += ((Font) (obj14)).C * 2 + (int) (20F * owner.viewScale);
				obj14 = owner.flashcolor_white;
				palette2 = owner.flashcolor_navy;
				gamefont9 = owner.label_font;
				show_flashstring(4, "Previous Menu", ((Palette) (obj14)), palette2, gamefont9, true, j, l3, 0, 1000, 0,
						true, false, 0, -1, 0);
				max();
				lightGray(1000);
				blue();
				return;

			case 100: // 'd'
				owner.NC = true;
				GameObjectPool oGameObjectlist4 = owner.vC;
				oGameObjectlist4.I(true, null, -1, -1, -1, -1);
				max(true, true, -1, -1, -1, -1, -1);
				P = 0;
				lightGray(5);
				red(101);
				return;

			case 101: // 'e'
				float f = owner.worldBorderLeft + owner.worldHrz * 0.25F;
				float f19 = owner.worldBorderTop + owner.worldVrt * 0.75F;
				float f39 = owner.worldBorderLeft + owner.worldHrz * 0.55F;
				float f49 = owner.worldBorderTop + owner.worldVrt * 0.45F;

				P++;
				toString(1);
				gray(0.0F, 0.0F, true, 30F);
				Palette palette11 = owner.flashcolor_red;
				Palette palette16 = owner.HZ;
				Object obj46 = owner.hFontLarge;
				show_flashstring(-1, "Mission One - Defilers", palette11, palette16, ((Font) (obj46)), true, l, i1, 0,
						80, 0, true, false, 0, -1, 0);
				getName(owner.NZ, owner.zZ, false);
				palette11 = owner.flashcolor_white;
				palette16 = owner.flashcolor_navy;
				obj46 = owner.label_font;
				show_flashstring(10, "Skip Intro", palette11, palette16, ((Font) (obj46)), true, j2, k2, 0, 10000, 0,
						true, false, 0, -1, 0);
				lightGray(10);
				float f59 = f19 - 280F * owner.viewScale;
				instance_create(1, 130, 1, false, f, f59, 0.0F, -1, "");
				f59 = f + 180F * owner.viewScale;
				float f64 = f19 - 180F * owner.viewScale;
				instance_create(1, 130, 1, false, f59, f64, 0.0F, -1, "");
				f59 = f + 270F * owner.viewScale;
				f64 = f19 - 20F * owner.viewScale;
				instance_create(1, 130, 1, false, f59, f64, 0.0F, -1, "");
				lightGray(100, false);
				getName();
				lightGray(20);
				temp_palette_1 = owner.AZ;
				temp_palette_2 = owner.flashcolor_navy;
				obj46 = owner.label_font;
				show_flashstring(-1, "Sirius Prime - The Katuri Homeworld", temp_palette_1, temp_palette_2,
						((Font) (obj46)), false, 0, 0, 0, 120, 0, true, true, 1, 100, 2);
				lightGray(130);
				gray(f39, f49, false, 30F);
				getName();
				lightGray(20);
				temp_palette_1 = owner.flashcolor_yellow;
				temp_palette_2 = owner.flashcolor_red;
				obj46 = owner.label_font;
				show_flashstring(-1, "Jump Signatures Detected", temp_palette_1, temp_palette_2, ((Font) (obj46)), true,
						j1, k1, 0, 70, 0, true, true, 1, -1, 0);
				lightGray(10);
				int ai10[] = { 222, 222, 222, 222, 220, 220, 220, 220, 221, 221, 221, 221, 221, 213, 213, 213, 213, 213,
						213, 211, 211, 211, 211, 212, 212, 212, 212, 201, 201, 201, 201, 202, 202, 203, 203, -1 };
				instance_create_group(2, ai10, 3, true, f39, f49, 600F, 4F);
				lightGray(65);
				temp_palette_2 = owner.flashcolor_yellow;
				obj46 = owner.flashcolor_red;
				Object obj47 = owner.label_font;
				show_flashstring(-1, "It's The United Fleet!||The Dogs Mean To End The War", temp_palette_2,
						((Palette) (obj46)), ((Font) (obj47)), true, j1, k1, 0, 100, 0, true, true, 1, -1, 0);
				lightGray(20);
				f64 = f + 100F * owner.viewScale;
				float f68 = f19 - 100F * owner.viewScale;
				gray(f64, f68, false, 30F);
				lightGray(60);
				int ai13[] = { 121, 120, 111, 111, 112, 101, 102, 101, 101, 102, 102, -1 };
				instance_create_group(1, ai13, 3, true, f + 100F * owner.viewScale,
						f19 - 100F * owner.viewScale,
						450F * owner.viewScale,
						4F * owner.viewScale);
				lightGray(30);
				temp_palette_1 = owner.flashcolor_yellow;
				obj47 = owner.flashcolor_red;
				Object obj48 = owner.label_font;
				show_flashstring(-1, "All Remaining Forces... Attack!", temp_palette_1, ((Palette) (obj47)),
						((Font) (obj48)), true, j1, k1, 0, 100, 0, true, true, 1, -1, 0);
				lightGray(50);
				f68 = f + 550F * owner.viewScale;
				float f71 = f19 - 550F * owner.viewScale;
				gray(f68, f71, false, 30F);
				lightGray(50);
				temp_palette_1 = owner.flashcolor_yellow;
				temp_palette_2 = owner.flashcolor_red;
				obj48 = owner.label_font;
				show_flashstring(-1, "Keep Them From The Homeworld||For The Glory Of The Emperor!", temp_palette_1,
						temp_palette_2, ((Font) (obj48)), true, j1, k1, 0, 130, 0, true, true, 1, -1, 0);
				lightGray(180);
				f68 = f + 200F * owner.viewScale;
				f71 = f19 - 200F * owner.viewScale;
				gray(f68, f71, false, 30F);
				lightGray(10);
				temp_palette_1 = owner.flashcolor_yellow;
				temp_palette_2 = owner.flashcolor_red;
				obj48 = owner.label_font;
				show_flashstring(-1, "We Need Re-Enforcments Now!", temp_palette_1, temp_palette_2, ((Font) (obj48)),
						true, j1, k1, 0, 90, 0, true, true, 1, -1, 0);
				lightGray(100);
				toString(2, 1, 8, -1, -1, -1);
				println(2);
				compareTo(false);
				random(1.0F, 2, -1, -1, -1, 100);
				lightGray(100, false);
				getName();
				lightGray(50);
				temp_palette_1 = owner.flashcolor_yellow;
				temp_palette_2 = owner.flashcolor_red;
				obj48 = owner.label_font;
				show_flashstring(-1, "The Homeworld Is Defenseless", temp_palette_1, temp_palette_2, ((Font) (obj48)),
						true, j1, k1, 0, 100, 0, true, true, 1, -1, 0);
				lightGray(120);
				temp_palette_1 = owner.flashcolor_yellow;
				temp_palette_2 = owner.flashcolor_red;
				obj48 = owner.hFontLarge;
				show_flashstring(-1, "United Fleet...||We Surrender", temp_palette_1, temp_palette_2, ((Font) (obj48)),
						true, j1, k1, 0, 70, 0, true, true, 1, -1, 0);
				lightGray(60);
				compareTo(true);
				lightGray(30);
				temp_palette_1 = owner.flashcolor_yellow;
				temp_palette_2 = owner.flashcolor_red;
				obj48 = owner.label_font;
				show_flashstring(-1, "Stop Attacking||Somebody... Anybody... Help!", temp_palette_1, temp_palette_2,
						((Font) (obj48)), true, j1, k1, 0, 90, 0, true, true, 1, -1, 0);
				lightGray(60);
				f68 = f - 200F * owner.viewScale;
				f71 = f19 - 700F * owner.viewScale;
				gray(f68, f71, false, 30F);
				lightGray(50);
				temp_palette_1 = owner.flashcolor_yellow;
				temp_palette_2 = owner.flashcolor_red;
				obj48 = owner.label_font;
				show_flashstring(-1,
						"More Jump Signatures Detected||It's Ours... star_blinking Wing Of Suicide Bombers!",
						temp_palette_1, temp_palette_2, ((Font) (obj48)), true, j1, k1, 0, 120, 0, true, true, 1, -1,
						0);
				lightGray(10);
				int ai14[] = { 103, 103, 103, 103, 103, 103, -1 };
				instance_create_group(1, ai14, 3, true, f - 200F * owner.viewScale,
						f19 - 700F * owner.viewScale, 400F,
						10F * owner.viewScale);
				lightGray(30);
				out(-1, -1, -1, -1, 100, ((sprite_group) (null)), 2, 1);
				f71 = f + 200F;
				float f73 = f19 - 200F;
				gray(f71, f73, false, 30F);
				lightGray(50);
				f71 = f + 600F * owner.viewScale;
				f73 = f19 - 600F * owner.viewScale;
				red(2, f71, f73, -1, 1);
				lightGray(20);
				temp_palette_1 = owner.flashcolor_yellow;
				temp_palette_2 = owner.flashcolor_red;
				Font gamefont30 = owner.label_font;
				show_flashstring(-1, "The United Fleet Dogs Are Retreating", temp_palette_1, temp_palette_2, gamefont30,
						true, j1, k1, 0, 80, 0, true, true, 1, -1, 0);
				lightGray(40);
				f71 = f + 600F * owner.viewScale;
				f73 = f19 - 600F * owner.viewScale;
				gray(f71, f73, false, 30F);
				lightGray(50);
				temp_palette_1 = owner.flashcolor_yellow;
				temp_palette_2 = owner.flashcolor_red;
				gamefont30 = owner.label_font;
				show_flashstring(-1,
						"Our Pilots' Ultimate|Sacrifice Saved The Homeworld.||The Emperor Himself Bestows|High Glory To Their Houses!",
						temp_palette_1, temp_palette_2, gamefont30, true, j1, k1, 0, 220, 0, true, true, 1, -1, 0);
				lightGray(170);
				toString(1, 1, -1, -1, -1, -1);
				println(1);
				lightGray(60);
				red(102);
				return;

			case 102: // 'f'
				float f1 = owner.worldBorderLeft + owner.worldHrz * 0.25F;
				float f20 = owner.worldBorderTop + owner.worldVrt * 0.75F;
				Object obj22 = owner.vC;
				((GameObjectPool) (obj22)).I(true, null, -1, -1, -1, -1);
				obj22 = owner.vZ;
				((GameObjectPool) (obj22)).I(true, null, -1, -1, -1, -1);
				obj22 = owner.wZ;
				((GameObjectPool) (obj22)).I(true, null, -1, -1, -1, -1);
				out(-1, -1, -1, -1, 100, ((sprite_group) (null)), 2, 1);
				random(0.0F, 2, -1, -1, -1, 100);
				getName(0.25F);
				compareTo(1, 100);
				compareTo(2, 120);
				blue(1, false, true, 1.0F);
				float f40 = f20 - 220F * owner.viewScale;
				instance_create(1, 102, 2, true, f1, f40, 3F, -1, "");
				f40 = f1 + 75F * owner.viewScale;
				float f50 = f20 - 220F * owner.viewScale;
				instance_create(1, 111, 2, true, f40, f50, 3F, -1, "");
				f40 = f1 + 150F * owner.viewScale;
				f50 = f20 - 150F * owner.viewScale;
				instance_create(1, 121, 2, true, f40, f50, 3F, -1, "");
				f40 = f1 + 200F * owner.viewScale;
				f50 = f20 - 80F * owner.viewScale;
				instance_create(1, 111, 2, true, f40, f50, 3F, -1, "");
				f40 = f1 + 220F * owner.viewScale;
				instance_create(1, 102, 2, true, f40, f20, 3F, -1, "");
				blue(1, false, false, 1.0F);
				red(150, f1 + 220F, f20 - 280F, 8.5F);
				abs(2, false, true, true, false);
				temp_palette_1 = owner.flashcolor_yellow;
				Object obj32 = owner.flashcolor_red;
				Font gamefont10 = owner.label_font;
				show_flashstring(-1, "Re-Enforcements Have Arrived", temp_palette_1, ((Palette) (obj32)), gamefont10,
						true,
						j1, k1, 0, 80, 0, true, true, 1, -1, 0);
				toString(2, 1, -1, -1, -1, -1);
				valueOf(2, 1102);
				lightGray(50);
				temp_palette_1 = owner.AZ;
				obj32 = owner.flashcolor_navy;
				gamefont10 = owner.hFontSmall;
				show_flashstring(-1, "KFS Vengeance", temp_palette_1, ((Palette) (obj32)), gamefont10, false, 0, 0, 0,
						80,
						0, true, true, 1, 101, 2);
				lightGray(40);
				abs();
				temp_palette_1 = owner.flashcolor_yellow;
				obj32 = owner.flashcolor_red;
				gamefont10 = owner.label_font;
				show_flashstring(-1,
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
				Color ltg = Color.lightGray;
				obj32 = Color.blue;
				gamefont10 = owner.label_font;
				F(-1, "Almost Clear!", ltg, ((Color) (obj32)), gamefont10, true, j1, k1, 0, 60, 0, true, true, 1, null,
						null, -1, 0);
				append(false);
				toString(1, 1, -1, -1, -1, -1);
				println(1);
				lightGray(10);
				temp_palette_1 = owner.flashcolor_white;
				obj32 = owner.flashcolor_navy;
				gamefont10 = owner.hFontLarge;
				show_flashstring(-1, "All Clear!", temp_palette_1, ((Palette) (obj32)), gamefont10, true, j1, k1, 0, 90,
						0,
						true, false, 0, -1, 0);
				getName(owner.NZ, owner.cZ, false);
				lightGray(100);
				red(110);
				return;

			case 110: // 'n'
				float f2 = owner.worldBorderLeft + owner.worldHrz * 0.25F;
				float f21 = owner.worldBorderTop + owner.worldVrt * 0.75F;
				Object obj23 = owner.wZ;
				((GameObjectPool) (obj23)).I(true, null, -1, -1, -1, -1);
				out(1, 0.5F, 0.5F, false, -1, -1, -1, -1);
				P++;
				obj23 = owner.flashcolor_red;
				Palette palette3 = owner.HZ;
				Font gamefont11 = owner.hFontLarge;
				show_flashstring(-1, "Mission Two - The Gathering", ((Palette) (obj23)), palette3, gamefont11, true, l,
						i1,
						0, 80, 0, true, false, 0, -1, 0);
				getName(owner.NZ, owner.zZ, false);
				obj23 = owner.flashcolor_white;
				palette3 = owner.flashcolor_navy;
				gamefont11 = owner.label_font;
				show_flashstring(10, "Skip Intro", ((Palette) (obj23)), palette3, gamefont11, true, j2, k2, 0, 10000, 0,
						true, false, 0, -1, 0);
				lightGray(10);
				float f41 = f2 + 250F * owner.viewScale;
				float f51 = f21 - 250F * owner.viewScale;
				gray(f41, f51, false, 30F);
				lightGray(80);
				getName();
				f41 = f2 + 80F * owner.viewScale;
				f51 = f21 - 280F * owner.viewScale;
				instance_create(1, 101, 2, true, f41, f51, 3F, -1, "");
				f41 = f2 + 160F * owner.viewScale;
				f51 = f21 - 260F * owner.viewScale;
				instance_create(1, 102, 2, true, f41, f51, 3F, -1, "");
				f41 = f2 + 275F * owner.viewScale;
				f51 = f21 - 195F * owner.viewScale;
				instance_create(1, 121, 2, true, f41, f51, 3F, -1, "");
				f41 = f2 + 290F * owner.viewScale;
				f51 = f21 - 100F * owner.viewScale;
				instance_create(1, 101, 2, true, f41, f51, 3F, -1, "");
				f41 = f2 + 300F * owner.viewScale;
				f51 = f21 - 20F * owner.viewScale;
				instance_create(1, 111, 2, true, f41, f51, 3F, -1, "");
				lightGray(40);
				temp_palette_1 = owner.flashcolor_yellow;
				temp_palette_2 = owner.flashcolor_red;
				gamefont11 = owner.label_font;
				show_flashstring(-1, "Additional Re-Enforcements Have Arrived", temp_palette_1, temp_palette_2,
						gamefont11,
						true, j1, k1, 0, 80, 0, true, true, 1, -1, 0);
				lightGray(90);
				temp_palette_1 = owner.flashcolor_yellow;
				temp_palette_2 = owner.flashcolor_red;
				gamefont11 = owner.label_font;
				show_flashstring(-1, "The Homeworld Is Now Secure||The United Fleet's Gambit|To End The War Has Failed",
						temp_palette_1, temp_palette_2, gamefont11, true, j1, k1, 0, 160, 0, true, true, 1, -1, 0);
				lightGray(170);
				temp_palette_1 = owner.flashcolor_yellow;
				temp_palette_2 = owner.flashcolor_red;
				gamefont11 = owner.label_font;
				show_flashstring(-1,
						"As star_blinking Result, They Have Serious|Weak Points In Their Positions.||We Must Take Advantage Of This!",
						temp_palette_1, temp_palette_2, gamefont11, true, j1, k1, 0, 180, 0, true, true, 1, -1, 0);
				lightGray(100);
				lightGray(101, false);
				getName();
				lightGray(90);
				red(111);
				return;

			case 111: // 'o'
				Object obj4 = owner.vC;
				((GameObjectPool) (obj4)).I(true, null, -1, -1, -1, -1);
				getName(0.25F);
				compareTo(1, 110);
				compareTo(2, 100);
				compareTo(3, 100);
				valueOf(1, -1, -1, -1, -1, "");
				lightGray(101, true);
				append(1, 1102, owner.vZ.mySize, -1);
				float f3 = owner.worldBorderRight - 500F * owner.viewScale;
				float f22 = owner.worldBorderTop + 500F * owner.viewScale;
				Palette f4 = null;
				red(1, f3, f22, -1, 1);
				abs(2, false, true, true, false);
				f4 = owner.flashcolor_yellow;
				Object obj15 = owner.flashcolor_red;
				Font gamefont3 = owner.label_font;
				show_flashstring(-1,
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
				gamefont3 = owner.label_font;
				F(-1, "All Ships Have Made The Jump||Destroy All Remaining Enemies!", Color.lightGray,
						((Color) (obj15)),
						gamefont3, true, j1, k1, 0, 120, 0, true, true, 1, null, null, -1, 0);
				append(false);
				toString(1, 1, -1, -1, -1, -1);
				println(1);
				random(1);
				lightGray(10);
				f4 = owner.flashcolor_white;
				obj15 = owner.flashcolor_navy;
				gamefont3 = owner.hFontLarge;
				show_flashstring(-1, "All Clear!", f4, ((Palette) (obj15)), gamefont3, true, j1, k1, 0, 90, 0, true,
						false,
						0, -1, 0);
				getName(owner.NZ, owner.cZ, false);
				lightGray(100);
				red(120);
				return;

			case 120: // 'x'
				float f411 = owner.worldBorderLeft + owner.worldHrz * 0.22F;
				float f23 = owner.worldBorderTop + owner.worldVrt * 0.22F;
				float f42 = owner.worldBorderLeft + owner.worldHrz * 0.9F;
				float f52 = owner.worldBorderTop + owner.worldVrt * 0.7F;
				float f60 = owner.worldBorderLeft + owner.worldHrz * 0.2F;
				float f65 = owner.worldBorderTop + owner.worldVrt * 0.9F;
				float f69 = owner.worldBorderLeft + owner.worldHrz * 0.9F;
				float f72 = owner.worldBorderTop + owner.worldVrt * 0.2F;
				float f74 = owner.worldBorderLeft + owner.worldHrz * 0.5F;
				float f75 = owner.worldBorderTop + owner.worldVrt * 0.6F;
				Object obj49 = owner.wZ;
				((GameObjectPool) (obj49)).I(true, null, -1, -1, -1, -1);
				P++;
				toString(2);
				out(1, 0.5F, 0.5F, false, -1, -1, -1, -1);
				F(1, -1, -1, -1, -1, 3);
				float f76 = f411 + 200F * owner.viewScale;
				float f77 = f23 + 200F * owner.viewScale;
				red(2, f76, f77, -1, 3);
				f76 = f411 + 300F * owner.viewScale;
				f77 = f23 - 150F * owner.viewScale;
				red(2, f76, f77, -1, 3);
				f76 = f411 - 150F * owner.viewScale;
				f77 = f23 + 300F * owner.viewScale;
				red(2, f76, f77, -1, 4);
				blue(2, false, true, 1.0F);
				instance_create(2, 230, 3, false, f411, f23, 0.0F, -1, "");
				f76 = f411 + 110F * owner.viewScale;
				f77 = f23 + 100F * owner.viewScale;
				instance_create(2, 220, 3, false, f76, f77, 2.0F, -1, "");
				f76 = f411 + 150F * owner.viewScale;
				f77 = f23 - 5F * owner.viewScale;
				instance_create(2, 211, 3, false, f76, f77, 2.0F, -1, "");
				f76 = f411 + 70F * owner.viewScale;
				f77 = f23 + 180F * owner.viewScale;
				instance_create(2, 212, 3, false, f76, f77, 2.0F, -1, "");
				f76 = f411 + 210F * owner.viewScale;
				f77 = f23 + 60F * owner.viewScale;
				instance_create(2, 212, 3, false, f76, f77, 2.0F, -1, "");
				blue(2, false, false, 1.0F);
				f76 = f411 + 500F * owner.viewScale;
				f77 = f23 + 500F * owner.viewScale;
				gray(f76, f77, true, 30F);

				temp_palette_1 = owner.flashcolor_red;
				temp_palette_2 = owner.HZ;
				Font gamefont31 = owner.hFontLarge;
				show_flashstring(-1, "Mission Three - System's Edge", temp_palette_1, temp_palette_2, gamefont31, true,
						l,
						i1, 0, 80, 0, true, false, 0, -1, 0);
				getName(owner.NZ, owner.zZ, false);
				temp_palette_1 = owner.flashcolor_white;
				temp_palette_2 = owner.flashcolor_navy;
				gamefont31 = owner.label_font;
				show_flashstring(10, "Skip Intro", temp_palette_1, temp_palette_2, gamefont31, true, j2, k2, 0, 10000,
						0,
						true, false, 0, -1, 0);
				lightGray(10);
				gray(f411, f23, false, 30F);
				lightGray(90);
				getName();
				temp_palette_1 = owner.flashcolor_yellow;
				temp_palette_2 = owner.flashcolor_red;
				gamefont31 = owner.label_font;
				show_flashstring(-1, "This United Fleet Outpost On The|Edge Of The System Must Be Destroyed",
						temp_palette_1, temp_palette_2, gamefont31, true, j1, k1, 0, 160, 0, true, true, 1, -1, 0);
				lightGray(80);
				gray(f42, f52, false, 50F);
				getName();
				blue(2, false, true, 32F);
				instance_create(2, 212, 3, true, f42, f52, 2.0F, -1, "");
				f76 = f52 - 90F * owner.viewScale;
				instance_create(2, 220, 3, true, f42, f76, 2.0F, -1, "");
				f76 = f42 - 90F * owner.viewScale;
				instance_create(2, 211, 3, true, f76, f52, 2.0F, -1, "");
				f76 = f42 + 90F * owner.viewScale;
				instance_create(2, 202, 3, true, f76, f52, 2.0F, -1, "");
				f76 = f52 + 80F * owner.viewScale;
				instance_create(2, 203, 3, true, f42, f76, 2.0F, -1, "");
				blue(2, false, true, 16F);
				instance_create(2, 212, 3, true, f60, f65, 2.0F, -1, "");
				f76 = f65 - 90F * owner.viewScale;
				instance_create(2, 220, 3, true, f60, f76, 2.0F, -1, "");
				f76 = f60 - 90F * owner.viewScale;
				instance_create(2, 213, 3, true, f76, f65, 2.0F, -1, "");
				f76 = f65 + 80F * owner.viewScale;
				instance_create(2, 203, 3, true, f60, f76, 2.0F, -1, "");
				blue(2, false, true, 8F);
				instance_create(2, 212, 3, true, f69, f72, 2.0F, -1, "");
				f76 = f72 - 90F * owner.viewScale;
				instance_create(2, 220, 3, true, f69, f76, 2.0F, -1, "");
				f76 = f69 - 90F * owner.viewScale;
				instance_create(2, 213, 3, true, f76, f72, 2.0F, -1, "");
				f76 = f69 + 90F * owner.viewScale;
				instance_create(2, 211, 3, true, f76, f72, 2.0F, -1, "");
				f76 = f72 + 80F * owner.viewScale;
				instance_create(2, 203, 3, true, f69, f76, 2.0F, -1, "");
				blue(2, false, false, 1.0F);
				lightGray(10);
				temp_palette_1 = owner.flashcolor_yellow;
				temp_palette_2 = owner.flashcolor_red;
				gamefont31 = owner.label_font;
				show_flashstring(-1, "Jump Signatures Detected", temp_palette_1, temp_palette_2, gamefont31, true, j1,
						k1,
						0, 70, 0, true, true, 1, -1, 0);
				lightGray(80);
				temp_palette_1 = owner.flashcolor_yellow;
				temp_palette_2 = owner.flashcolor_red;
				gamefont31 = owner.label_font;
				show_flashstring(-1, "The United Fleet Is Attempting|To Re-Enforce Their Outpost", temp_palette_1,
						temp_palette_2, gamefont31, true, j1, k1, 0, 110, 0, true, true, 1, -1, 0);
				lightGray(60);
				gray(f74 + 150F * owner.viewScale, f75, false, 50F);
				getName();
				max(1, f74, f75, 350F, 350F);
				lightGray(140);
				blue(1, false, true, 1.0F);
				f76 = f74 + ((float) Math.random() - 0.5F) * 350F * owner.viewScale;
				f77 = f75 + ((float) Math.random() - 0.5F) * 350F * owner.viewScale;
				instance_create(1, 120, 2, true, f76, f77, 3.5F, -1, "");
				f76 = f74 + ((float) Math.random() - 0.5F) * 350F * owner.viewScale;
				f77 = f75 + ((float) Math.random() - 0.5F) * 350F * owner.viewScale;
				instance_create(1, 111, 2, true, f76, f77, 3.5F, -1, "");
				f76 = f74 + ((float) Math.random() - 0.5F) * 350F * owner.viewScale;
				f77 = f75 + ((float) Math.random() - 0.5F) * 350F * owner.viewScale;
				instance_create(1, 111, 2, true, f76, f77, 3.5F, -1, "");
				f76 = f74 + ((float) Math.random() - 0.5F) * 350F * owner.viewScale;
				f77 = f75 + ((float) Math.random() - 0.5F) * 350F * owner.viewScale;
				instance_create(1, 102, 2, true, f76, f77, 3.5F, -1, "");
				f76 = f74 + ((float) Math.random() - 0.5F) * 350F * owner.viewScale;
				f77 = f75 + ((float) Math.random() - 0.5F) * 350F * owner.viewScale;
				instance_create(1, 121, 2, true, f76, f77, 3.5F, -1, "");
				blue(1, false, false, 1.0F);
				temp_palette_1 = owner.flashcolor_yellow;
				temp_palette_2 = owner.flashcolor_red;
				gamefont31 = owner.label_font;
				show_flashstring(-1, "Joining Us Are More Ships", temp_palette_1, temp_palette_2, gamefont31, true, j1,
						k1,
						0, 80, 0, true, true, 1, -1, 0);
				lightGray(50);
				lightGray(101, false);
				lightGray(40);
				getName();
				red(121);
				return;

			case 121: // 'y'
				float f5 = owner.worldBorderLeft + owner.worldHrz * 0.2F;
				float f24 = owner.worldBorderTop + owner.worldVrt * 0.2F;
				Object obj24 = owner.vC;
				((GameObjectPool) (obj24)).I(true, null, -1, -1, -1, -1);
				getName(0.3F);
				compareTo(1, 80);
				compareTo(2, 80);
				compareTo(3, 100);
				compareTo(5, 110);
				obj24 = owner.flashcolor_yellow;
				Palette palette4 = owner.flashcolor_red;
				Font gamefont12 = owner.label_font;
				show_flashstring(-1,
						"Destroy Their Re-Enforcements|Then Destroy Their Outpost||Atleast One Ship Must Survive!",
						((Palette) (obj24)), palette4, gamefont12, true, j1, k1, 0, 200, 0, true, true, 1, -1, 0);
				float f43 = f5 + 200F * owner.viewScale;
				float f53 = f24 + 200F * owner.viewScale;
				red(2, f43, f53, -1, 3);
				f43 = f5 + 300F * owner.viewScale;
				f53 = f24 - 150F * owner.viewScale;
				red(2, f43, f53, -1, 3);
				f43 = f5 - 150F * owner.viewScale;
				f53 = f24 + 300F * owner.viewScale;
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
				temp_palette_1 = owner.flashcolor_white;
				temp_palette_2 = owner.flashcolor_navy;
				gamefont12 = owner.hFontLarge;
				show_flashstring(-1, "All Clear!", temp_palette_1, temp_palette_2, gamefont12, true, j1, k1, 0, 90, 0,
						true,
						false, 0, -1, 0);
				getName(owner.NZ, owner.cZ, false);
				lightGray(20);
				random(1);
				lightGray(80);
				red(130);
				return;

			case 130:
				float f6 = owner.worldBorderLeft + owner.worldHrz * 0.5F;
				float f25 = owner.worldBorderTop + owner.worldVrt * 0.2F;
				P++;
				Object obj25 = owner.wZ;
				((GameObjectPool) (obj25)).I(true, null, -1, -1, -1, -1);
				toString(4);
				out(1, 0.5F, 0.5F, false, -1, -1, -1, -1);
				F(1, -1, -1, -1, -1, 3);
				gray(f6, f25, true, 30F);
				obj25 = owner.flashcolor_red;
				Palette palette5 = owner.HZ;
				Object obj41 = owner.hFontLarge;
				show_flashstring(-1, "Mission Four - Transport Alley", ((Palette) (obj25)), palette5, ((Font) (obj41)),
						true, l, i1, 0, 80, 0, true, false, 0, -1, 0);
				getName(owner.NZ, owner.zZ, false);
				obj25 = owner.flashcolor_white;
				palette5 = owner.flashcolor_navy;
				obj41 = owner.label_font;
				show_flashstring(10, "Skip Intro", ((Palette) (obj25)), palette5, ((Font) (obj41)), true, j2, k2, 0,
						10000, 0, true, false, 0, -1, 0);
				lightGray(10);
				gray(f6, f25, false, 30F);
				lightGray(90);
				getName();
				obj25 = owner.flashcolor_yellow;
				palette5 = owner.flashcolor_red;
				obj41 = owner.label_font;
				show_flashstring(-1, "Entering The Wolf 359 System", ((Palette) (obj25)), palette5, ((Font) (obj41)),
						true, j1, k1, 0, 80, 0, true, true, 1, -1, 0);
				lightGray(10);
				max(1, f6, f25, 350F, 350F);
				lightGray(101, false);
				lightGray(40);
				blue(1, false, true, 1.0F);
				int ai2[] = { 102, 112, 112, 121, -1 };
				instance_create_group(1, ai2, 2, true, f6, f25, 400F * owner.viewScale, 8F);
				blue(1, false, false, 1.0F);
				lightGray(80);
				palette5 = owner.flashcolor_yellow;
				obj41 = owner.flashcolor_red;
				Font gamefont18 = owner.label_font;
				show_flashstring(-1,
						"Empire Worlds Are Under Siege Here||We Must Break The Terran Siege And|Drive Them From This System",
						palette5, ((Palette) (obj41)), gamefont18, true, j1, k1, 0, 180, 0, true, true, 1, -1, 0);
				lightGray(190);
				palette5 = owner.flashcolor_yellow;
				obj41 = owner.flashcolor_red;
				gamefont18 = owner.label_font;
				show_flashstring(-1, "Terran Tranports Are Attempting|star_blinking Re-Supply Run To Their Forces",
						palette5, ((Palette) (obj41)), gamefont18, true, j1, k1, 0, 150, 0, true, true, 1, -1, 0);
				lightGray(160);
				red(131);
				return;

			case 131:
				float f7 = owner.worldBorderLeft + owner.worldHrz * 0.5F;
				float f26 = owner.worldBorderTop + owner.worldVrt * 0.2F;
				Object obj26 = owner.vC;
				((GameObjectPool) (obj26)).I(true, null, -1, -1, -1, -1);
				getName(0.33F);
				compareTo(2, 100);
				compareTo(3, 100);
				obj26 = owner.flashcolor_yellow;
				Object obj33 = owner.flashcolor_red;
				Font gamefont13 = owner.label_font;
				show_flashstring(-1,
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
				gamefont13 = owner.label_font;
				F(-1, "Almost Clear!", ((Color) (obj26)), ((Color) (obj33)), gamefont13, true, j1, k1, 0, 60, 0, true,
						true,
						1, null, null, -1, 0);
				append(false);
				toString(1, 1, -1, -1, -1, -1);
				println(1);
				lightGray(10);
				obj26 = owner.flashcolor_white;
				obj33 = owner.flashcolor_navy;
				gamefont13 = owner.hFontLarge;
				show_flashstring(-1, "All Clear!", ((Palette) (obj26)), ((Palette) (obj33)), gamefont13, true, j1, k1,
						0,
						90, 0, true, false, 0, -1, 0);
				getName(owner.NZ, owner.cZ, false);
				lightGray(100);
				red(140);
				return;

			case 132:
				compareTo(false);
				lightGray(30);
				Object obj5 = owner.flashcolor_white;
				Object obj16 = owner.flashcolor_navy;
				Font gamefont4 = owner.hFontSmall;
				show_flashstring(-1, "Objectives Failed||Aborting Mission", ((Palette) (obj5)), ((Palette) (obj16)),
						gamefont4, true, l1, i2, 0, 150, 0, true, true, 1, -1, 0);
				lightGray(100);
				obj5 = owner.flashcolor_white;
				obj16 = owner.flashcolor_navy;
				gamefont4 = owner.label_font;
				show_flashstring(-1, "An Enemy Transport Has Escaped!", ((Palette) (obj5)), ((Palette) (obj16)),
						gamefont4,
						true, j1, k1, 0, 190, 0, true, true, 1, -1, 0);
				max(true, false, -1, -1, -1, -1, -1);
				lightGray(140);
				obj5 = Color.red;
				obj16 = Color.gray;
				gamefont4 = owner.hFontLarge;
				F(-1, "Game Over", ((Color) (obj5)), ((Color) (obj16)), gamefont4, true, j1, k1, 0, 300, 0, true, true,
						2,
						null, null, -1, 0);
				lightGray(5);
				gray();
				blue();
				return;

			case 140:
				Object obj6 = owner.dZ;
				obj6 = ((GameObjectPool) (obj6)).mySize <= 0 ? null : ((Object) (((GameObjectPool) (obj6)).internalList[0]));
				float f27 = ((GameObject) (obj6)).J - 100F * owner.viewScale;
				float f44 = ((GameObject) (obj6)).S;
				P++;
				Object obj34 = owner.wZ;
				((GameObjectPool) (obj34)).I(true, null, -1, -1, -1, -1);
				out(1, 0.5F, 0.5F, false, -1, -1, -1, -1);
				red(1, 0.0F, 0.0F, -1, 4);
				gray(f27, f44, true, 30F);
				obj34 = owner.flashcolor_red;
				Palette palette12 = owner.HZ;
				Font gamefont19 = owner.hFontLarge;
				show_flashstring(-1, "Mission Five - Siege Lines", ((Palette) (obj34)), palette12, gamefont19, true, l,
						i1,
						0, 80, 0, true, false, 0, -1, 0);
				getName(owner.NZ, owner.zZ, false);
				obj34 = owner.flashcolor_white;
				palette12 = owner.flashcolor_navy;
				gamefont19 = owner.label_font;
				show_flashstring(10, "Skip Intro", ((Palette) (obj34)), palette12, gamefont19, true, j2, k2, 0, 10000,
						0,
						true, false, 0, -1, 0);
				lightGray(10);
				gray(f27, f44, false, 30F);
				lightGray(90);
				getName();
				obj34 = owner.flashcolor_yellow;
				palette12 = owner.flashcolor_red;
				gamefont19 = owner.label_font;
				show_flashstring(-1, "The Terrans Have Detected Us|And Dispatched Forces To Deal With Us",
						((Palette) (obj34)), palette12, gamefont19, true, j1, k1, 0, 150, 0, true, true, 1, -1, 0);
				lightGray(10);
				lightGray(101, false);
				lightGray(150);
				red(141);
				return;

			case 141:
				Object obj7 = owner.vC;
				owner.vC.I(true, null, -1, -1, -1, -1);
				
				getName(0.25F);
				compareTo(1, 120);
				compareTo(2, 60);
				compareTo(3, 100);
				compareTo(5, 100);
				compareTo(4, 100);
				obj7 = owner.flashcolor_yellow;
				Object obj17 = owner.flashcolor_red;
				Font gamefont5 = owner.label_font;
				show_flashstring(-1, "Destroy All Incoming Enemies||Protect Your Ships||Atleast One Ship Must Survive!",
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
				gamefont5 = owner.label_font;
				F(-1, "Almost Clear!", ((Color) (obj7)), ((Color) (obj17)), gamefont5, true, j1, k1, 0, 60, 0, true,
						true,
						1, null, null, -1, 0);
				append(false);
				toString(1, 1, -1, -1, -1, -1);
				println(1);
				lightGray(10);
				obj7 = owner.flashcolor_white;
				obj17 = owner.flashcolor_navy;
				gamefont5 = owner.hFontLarge;
				show_flashstring(-1, "All Clear!", ((Palette) (obj7)), ((Palette) (obj17)), gamefont5, true, j1, k1, 0,
						90,
						0, true, false, 0, -1, 0);
				getName(owner.NZ, owner.cZ, false);
				lightGray(20);
				random(1);
				lightGray(80);
				red(150);
				return;

			case 150:
				float f8 = owner.worldBorderLeft + owner.worldHrz * 0.7F;
				float f28 = owner.worldBorderTop + owner.worldVrt * 0.3F;
				Palette temp_palette;
				P++;
				Object obj27 = owner.wZ;
				((GameObjectPool) (obj27)).I(true, null, -1, -1, -1, -1);
				out(1, 0.5F, 0.5F, false, -1, -1, -1, -1);
				F(1, -1, -1, -1, -1, 3);
				toString(3);
				blue(1, false, true, 1.0F);
				float f45 = f8 - 220F * owner.viewScale;
				float f54 = f28 + 60F * owner.viewScale;
				instance_create(1, 130, 1, false, f45, f54, 0.0F, -1, "");
				f45 = f8 - 60F * owner.viewScale;
				f54 = f28 + 220F * owner.viewScale;
				instance_create(1, 130, 1, false, f45, f54, 0.0F, -1, "");
				blue(1, false, false, 1.0F);
				gray(f8, f28, true, 30F);
				temp_palette = owner.flashcolor_red;
				Palette palette6 = owner.HZ;
				Font gamefont14 = owner.hFontLarge;
				show_flashstring(-1, "Mission Six - Desparate Times", temp_palette, palette6, gamefont14, true, l, i1,
						0,
						80, 0, true, false, 0, -1, 0);
				getName(owner.NZ, owner.zZ, false);
				temp_palette = owner.flashcolor_white;
				palette6 = owner.flashcolor_navy;
				gamefont14 = owner.label_font;
				show_flashstring(10, "Skip Intro", temp_palette, palette6, gamefont14, true, j2, k2, 0, 10000, 0, true,
						false, 0, -1, 0);
				lightGray(90);
				getName();
				temp_palette = owner.AZ;
				palette6 = owner.flashcolor_navy;
				gamefont14 = owner.label_font;
				show_flashstring(-1, "Tarymar - Wolf 359 System Main World", temp_palette, palette6, gamefont14, false,
						0,
						0, 0, 120, 0, true, true, 1, 102, 1);
				lightGray(130);
				getName();
				temp_palette = owner.flashcolor_yellow;
				palette6 = owner.flashcolor_red;
				gamefont14 = owner.label_font;
				show_flashstring(-1, "Tarymar Has Thus Far Staved|Off The United Fleet Siege", temp_palette, palette6,
						gamefont14, true, j1, k1, 0, 120, 0, true, true, 1, -1, 0);
				lightGray(130);
				temp_palette = owner.flashcolor_yellow;
				palette6 = owner.flashcolor_red;
				gamefont14 = owner.label_font;
				show_flashstring(-1,
						"The Terrans Are Massing For|star_blinking Final Attack Against Tarymar||Tarymar Cannot Fall",
						temp_palette, palette6, gamefont14, true, j1, k1, 0, 140, 0, true, true, 1, -1, 0);
				lightGray(150);
				red(151);
				return;

			case 151:
				float f9 = owner.worldBorderLeft + owner.worldHrz * 0.7F;
				float f29 = owner.worldBorderTop + owner.worldVrt * 0.3F;
				GameObjectPool oGameObjectlist5 = owner.vC;
				oGameObjectlist5.I(true, null, -1, -1, -1, -1);
				getName(0.25F);
				compareTo(1, 120);
				compareTo(5, 100);
				float f46 = f9 - 300F * owner.viewScale;
				float f55 = f29 + 300F * owner.viewScale;
				red(1, f46, f55, -1, 3);
				f46 = f9 + 100F * owner.viewScale;
				f55 = f29 + 350F * owner.viewScale;
				red(1, f46, f55, -1, 3);
				f46 = f9 - 350F * owner.viewScale;
				f55 = f29 + 350F * owner.viewScale;
				red(1, f46, f55, -1, 3);
				f46 = f9 - 350F * owner.viewScale;
				f55 = f29 - 100F * owner.viewScale;
				red(1, f46, f55, -1, 4);
				max(1, f9 - 300F * owner.viewScale,
						f29 + 300F * owner.viewScale,
						350F * owner.viewScale, 350F * owner.viewScale);
				lightGray(101, false);
				getName();
				lightGray(101, true);
				lightGray(40);
				blue(1, false, true, 1.0F);
				int ai3[] = { 121, 120, 111, 112, 112, -1 };
				instance_create_group(1, ai3, 2, true, f9 - 300F * owner.viewScale,
						f29 + 300F * owner.viewScale,
						350F * owner.viewScale, 8F);
				blue(1, false, false, 1.0F);
				Object obj35 = owner.flashcolor_yellow;
				Object obj42 = owner.flashcolor_red;
				Font gamefont20 = owner.label_font;
				show_flashstring(-1,
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
				gamefont20 = owner.label_font;
				F(-1, "Almost Clear!", ((Color) (obj35)), ((Color) (obj42)), gamefont20, true, j1, k1, 0, 60, 0, true,
						true,
						1, null, null, -1, 0);
				append(false);
				toString(1, 1, -1, -1, -1, -1);
				println(1);
				lightGray(10);
				obj35 = owner.flashcolor_white;
				obj42 = owner.flashcolor_navy;
				gamefont20 = owner.hFontLarge;
				show_flashstring(-1, "All Clear!", ((Palette) (obj35)), ((Palette) (obj42)), gamefont20, true, j1, k1,
						0,
						90, 0, true, false, 0, -1, 0);
				getName(owner.NZ, owner.cZ, false);
				lightGray(20);
				random(1);
				lightGray(80);
				red(160);
				return;

			case 160:
				float f10 = owner.worldBorderLeft + owner.worldHrz * 0.8F;
				float f30 = owner.worldBorderLeft + owner.worldHrz * 0.2F;
				P++;
				GameObjectPool oGameObjectlist6 = owner.wZ;
				oGameObjectlist6.I(true, null, -1, -1, -1, -1);
				max(true, true, 1, -1, -1, 130, -1);
				out(1, 0.5F, 0.5F, false, -1, -1, -1, -1);
				F(1, -1, -1, -1, -1, 3);
				toString(5);
				blue(1, false, true, 0.0F);
				instance_create(1, 131, 1, false, f10, 0.0F, 0.0F, -1, "");
				blue(1, false, true, 1.0F);
				int ai4[] = { 121, 120, 111, 112, -1 };
				instance_create_group(1, ai4, 2, true, f10 - 200F * owner.viewScale, 0.0F,
						300F * owner.viewScale, 8F);
				blue(1, false, false, 1.0F);
				gray(f10, 0.0F, true, 30F);
				Palette palette7 = owner.flashcolor_red;
				Palette palette13 = owner.HZ;
				Font gamefont21 = owner.hFontLarge;
				show_flashstring(-1, "Mission Seven - Starbase 69", palette7, palette13, gamefont21, true, l, i1, 0, 80,
						0,
						true, false, 0, -1, 0);
				getName(owner.NZ, owner.zZ, false);
				palette7 = owner.flashcolor_white;
				palette13 = owner.flashcolor_navy;
				gamefont21 = owner.label_font;
				show_flashstring(10, "Skip Intro", palette7, palette13, gamefont21, true, j2, k2, 0, 10000, 0, true,
						false,
						0, -1, 0);
				lightGray(90);
				getName();
				palette7 = owner.flashcolor_yellow;
				palette13 = owner.flashcolor_red;
				gamefont21 = owner.label_font;
				show_flashstring(-1, "Starbase 69 In The Centauri|System Must Be Resupplied", palette7, palette13,
						gamefont21, true, j1, k1, 0, 120, 0, true, true, 1, -1, 0);
				lightGray(80);
				gray(f30, 0.0F, false, 30F);
				lightGray(50);
				palette7 = owner.flashcolor_yellow;
				palette13 = owner.flashcolor_red;
				gamefont21 = owner.label_font;
				show_flashstring(-1, "Transports Shall Be Dispatched|To Make star_blinking Re-Supply Run", palette7,
						palette13, gamefont21, true, j1, k1, 0, 120, 0, true, true, 1, -1, 0);
				lightGray(130);
				red(161);
				return;

			case 161:
				float f11 = owner.worldBorderLeft + owner.worldHrz * 0.8F;
				float f31 = owner.worldBorderLeft + owner.worldHrz * 0.2F;
				GameObjectPool oGameObjectlist7 = owner.vC;
				oGameObjectlist7.I(true, null, -1, -1, -1, -1);
				getName(0.25F);
				compareTo(1, 120);
				compareTo(5, 120);
				compareTo(4, 80);
				red(1, f11, 0.0F, 100, 3);
				red(1, f11 + 200F * owner.viewScale,
						0.0F + 300F * owner.viewScale, 100, 1);
				max(1, f31 - 200F * owner.viewScale,
						0.0F * owner.viewScale,
						350F * owner.viewScale, 350F * owner.viewScale);
				lightGray(101, false);
				getName();
				lightGray(101, true);
				lightGray(40);
				blue(1, false, true, 1.0F);
				int ai5[] = { 121, 120, -1 };
				instance_create_group(1, ai5, 2, true, f31 - 300F * owner.viewScale,
						0.0F + 300F * owner.viewScale,
						350F * owner.viewScale, 8F);
				blue(1, false, false, 1.0F);
				Object obj36 = owner.flashcolor_yellow;
				Object obj43 = owner.flashcolor_red;
				Font gamefont22 = owner.label_font;
				show_flashstring(-1,
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
				instance_create(1, 100, 3, false, f31, -50F, 3F, -1, "");
				gray(2, 100, 222, 3F + 0.4F * Q);
				gray(2, 100, 213, 3.5F + 0.4F * Q);
				gray(2, 100, 212, 3.5F + 0.4F * Q);
				gray(2, 100, 202, 4.5F + 0.4F * Q);
				lightGray(2, Math.max(80 + -4 * Q, 26), 5, 1);
				lightGray(50);
				instance_create(1, 100, 3, false, f31, 50F, 3F, -1, "");
				lightGray(250);
				instance_create(1, 100, 3, false, f31, -50F, 3F, -1, "");
				lightGray(50);
				instance_create(1, 100, 3, false, f31, 50F, 3F, -1, "");
				lightGray(250);
				lightGray(2, Math.max(65 + -4 * Q, 21), 5, 1);
				instance_create(1, 100, 3, false, f31, -50F, 3F, -1, "");
				lightGray(50);
				instance_create(1, 100, 3, false, f31, 50F, 3F, -1, "");
				lightGray(250);
				instance_create(1, 100, 3, false, f31, -50F, 3F, -1, "");
				lightGray(50);
				instance_create(1, 100, 3, false, f31, 50F, 3F, -1, "");
				lightGray(250);
				instance_create(1, 100, 3, false, f31, -50F, 3F, -1, "");
				lightGray(50);
				instance_create(1, 100, 3, false, f31, 50F, 3F, -1, "");
				lightGray(250);
				lightGray(2, Math.max(75 + -4 * Q, 25), 5, 1);
				instance_create(1, 100, 3, false, f31, -50F, 3F, -1, "");
				lightGray(50);
				instance_create(1, 100, 3, false, f31, 50F, 3F, -1, "");
				lightGray(800);
				lightGray(2, -1, 0, 0);
				lightGray(75);
				obj36 = Color.lightGray;
				obj43 = Color.blue;
				gamefont22 = owner.label_font;
				F(-1, "Almost Clear!", ((Color) (obj36)), ((Color) (obj43)), gamefont22, true, j1, k1, 0, 60, 0, true,
						true,
						1, null, null, -1, 0);
				append(false);
				toString(1, 1, -1, -1, -1, -1);
				println(1);
				lightGray(10);
				obj36 = owner.flashcolor_white;
				obj43 = owner.flashcolor_navy;
				gamefont22 = owner.hFontLarge;
				show_flashstring(-1, "All Clear!", ((Palette) (obj36)), ((Palette) (obj43)), gamefont22, true, j1, k1,
						0,
						90, 0, true, false, 0, -1, 0);
				getName(owner.NZ, owner.cZ, false);
				lightGray(20);
				random(1);
				lightGray(80);
				red(170);
				return;

			case 162:
				compareTo(false);
				lightGray(30);
				Object obj8 = owner.flashcolor_white;
				Object obj18 = owner.flashcolor_navy;
				Font gamefont6 = owner.hFontSmall;
				show_flashstring(-1, "Objectives Failed||Aborting Mission", ((Palette) (obj8)), ((Palette) (obj18)),
						gamefont6, true, l1, i2, 0, 150, 0, true, true, 1, -1, 0);
				lightGray(100);
				obj8 = owner.flashcolor_white;
				obj18 = owner.flashcolor_navy;
				gamefont6 = owner.label_font;
				show_flashstring(-1, "Too Many Transports Have Been Lost!", ((Palette) (obj8)), ((Palette) (obj18)),
						gamefont6, true, j1, k1, 0, 190, 0, true, true, 1, -1, 0);
				max(true, false, -1, -1, -1, -1, -1);
				lightGray(140);
				obj8 = Color.red;
				obj18 = Color.gray;
				gamefont6 = owner.hFontLarge;
				F(-1, "Game Over", ((Color) (obj8)), ((Color) (obj18)), gamefont6, true, j1, k1, 0, 300, 0, true, true,
						2,
						null, null, -1, 0);
				lightGray(5);
				gray();
				blue();
				return;

			case 170:
				float f12 = owner.worldBorderLeft + owner.worldHrz * 0.4F;
				float f32 = owner.worldBorderTop + owner.worldVrt * 0.5F;
				P++;
				out(1, 0.5F, 0.5F, false, -1, -1, -1, -1);
				Object obj28 = owner.wZ;
				((GameObjectPool) (obj28)).I(true, null, -1, -1, -1, -1);
				max(true, true, 1, -1, -1, 100, -1);
				max(true, true, 1, -1, -1, 131, -1);
				F(1, -1, -1, -1, -1, 3);
				toString(6);
				gray(f12, f32, true, 30F);
				obj28 = owner.flashcolor_red;
				Palette palette8 = owner.HZ;
				Font gamefont15 = owner.hFontLarge;
				show_flashstring(-1, "Mission Eight - Carrier Battle", ((Palette) (obj28)), palette8, gamefont15, true,
						l,
						i1, 0, 80, 0, true, false, 0, -1, 0);
				getName(owner.NZ, owner.zZ, false);
				obj28 = owner.flashcolor_white;
				palette8 = owner.flashcolor_navy;
				gamefont15 = owner.label_font;
				show_flashstring(10, "Skip Intro", ((Palette) (obj28)), palette8, gamefont15, true, j2, k2, 0, 10000, 0,
						true, false, 0, -1, 0);
				lightGray(90);
				getName();
				obj28 = owner.flashcolor_yellow;
				palette8 = owner.flashcolor_red;
				gamefont15 = owner.label_font;
				show_flashstring(-1,
						"The Day Of Our Revenge Begins Now||The Assualt Will Now Commence|On The Terran Home System",
						((Palette) (obj28)), palette8, gamefont15, true, j1, k1, 0, 180, 0, true, true, 1, -1, 0);
				lightGray(190);
				getName();
				obj28 = owner.flashcolor_yellow;
				palette8 = owner.flashcolor_red;
				gamefont15 = owner.label_font;
				show_flashstring(-1, "We Will Jump In Just Outside Of|Saturn And Destroy Their Carrier Forces",
						((Palette) (obj28)), palette8, gamefont15, true, j1, k1, 0, 130, 0, true, true, 1, -1, 0);
				lightGray(140);
				red(171);
				return;

			case 171:
				float f13 = owner.worldBorderLeft + owner.worldHrz * 0.4F;
				float f33 = owner.worldBorderTop + owner.worldVrt * 0.5F;
				GameObjectPool oGameObjectlist8 = owner.vC;
				oGameObjectlist8.I(true, null, -1, -1, -1, -1);
				getName(0.25F);
				compareTo(1, 100);
				compareTo(5, 60);
				compareTo(3, 80);
				compareTo(4, 100);
				max(1, f13, f33, 350F * owner.viewScale,
						350F * owner.viewScale);
				lightGray(101, false);
				getName();
				lightGray(101, true);
				lightGray(50);
				blue(1, false, true, 1.0F);
				int ai6[] = { 122, 123, 120, 121, 112, 111, 112, 111, -1 };
				instance_create_group(1, ai6, 2, true, f13 - 300F * owner.viewScale,
						f33 + 300F * owner.viewScale,
						350F * owner.viewScale, 8F);
				blue(1, false, false, 1.0F);
				Object obj37 = owner.flashcolor_yellow;
				Object obj44 = owner.flashcolor_red;
				Font gamefont23 = owner.label_font;
				show_flashstring(-1, "Destroy All Enemy Ships||Protect Our Ships||Atleast One Must Survive!",
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
				gamefont23 = owner.label_font;
				F(-1, "Almost Clear!", ((Color) (obj37)), ((Color) (obj44)), gamefont23, true, j1, k1, 0, 60, 0, true,
						true,
						1, null, null, -1, 0);
				append(false);
				toString(1, 1, -1, -1, -1, -1);
				println(1);
				lightGray(10);
				obj37 = owner.flashcolor_white;
				obj44 = owner.flashcolor_navy;
				gamefont23 = owner.hFontLarge;
				show_flashstring(-1, "All Clear!", ((Palette) (obj37)), ((Palette) (obj44)), gamefont23, true, j1, k1,
						0,
						90, 0, true, false, 0, -1, 0);
				getName(owner.NZ, owner.cZ, false);
				lightGray(20);
				random(1);
				lightGray(80);
				red(180);
				return;

			case 180:
				float f14 = owner.worldBorderLeft + owner.worldHrz * 0.75F;
				float f34 = owner.worldBorderTop + owner.worldVrt * 0.75F;
				float f47 = owner.worldBorderLeft + owner.worldHrz * 0.2F;
				float f56 = owner.worldBorderTop + owner.worldVrt * 0.2F;
				P++;
				GameObjectPool oGameObjectlist11 = owner.wZ;
				oGameObjectlist11.I(true, null, -1, -1, -1, -1);
				out(1, 0.5F, 0.5F, false, -1, -1, -1, -1);
				F(1, -1, -1, -1, -1, 3);
				toString(7);
				blue(2, false, true, 1.0F);
				float f61 = f14 - 320F * owner.viewScale;
				instance_create(2, 230, 1, false, f61, f34, 0.0F, -1, "");
				f61 = f14 - 180F * owner.viewScale;
				float f66 = f34 - 180F * owner.viewScale;
				instance_create(2, 230, 1, false, f61, f66, 0.0F, -1, "");
				f61 = f14 + 25F * owner.viewScale;
				f66 = f34 - 310F * owner.viewScale;
				instance_create(2, 230, 1, false, f61, f66, 0.0F, -1, "");
				int ai11[] = { 221, 222, 220, 203, 201, 213, -1 };
				instance_create_group(2, ai11, 2, true, f14 - 200F * owner.viewScale,
						f34 - 200F * owner.viewScale,
						400F * owner.viewScale, 3F);
				blue(2, false, false, 1.0F);
				f66 = f14 - 80F * owner.viewScale;
				float f70 = f34 - 80F * owner.viewScale;
				gray(f66, f70, true, 30F);
				Palette palette17 = owner.flashcolor_red;
				Palette palette19 = owner.HZ;
				Font gamefont28 = owner.hFontLarge;
				show_flashstring(-1, "Mission Nine - God Of War", palette17, palette19, gamefont28, true, l, i1, 0, 80,
						0,
						true, false, 0, -1, 0);
				getName(owner.NZ, owner.zZ, false);
				palette17 = owner.flashcolor_white;
				palette19 = owner.flashcolor_navy;
				gamefont28 = owner.label_font;
				show_flashstring(10, "Skip Intro", palette17, palette19, gamefont28, true, j2, k2, 0, 10000, 0, true,
						false,
						0, -1, 0);
				lightGray(90);
				getName();
				palette17 = owner.flashcolor_yellow;
				palette19 = owner.flashcolor_red;
				gamefont28 = owner.label_font;
				show_flashstring(-1, "The United Fleet Has Pulled Back||Leaving Mars Defended Mostly By Outposts",
						palette17, palette19, gamefont28, true, j1, k1, 0, 120, 0, true, true, 1, -1, 0);
				lightGray(60);
				gray(f47, f56, false, 30F);
				lightGray(70);
				palette17 = owner.flashcolor_yellow;
				palette19 = owner.flashcolor_red;
				gamefont28 = owner.label_font;
				show_flashstring(-1, "We Will Take Mars Before The Earth", palette17, palette19, gamefont28, true, j1,
						k1,
						0, 100, 0, true, true, 1, -1, 0);
				lightGray(110);
				red(181);
				return;

			case 181:
				float f15 = owner.worldBorderLeft + owner.worldHrz * 0.2F;
				float f35 = owner.worldBorderTop + owner.worldVrt * 0.2F;
				GameObjectPool oGameObjectlist9 = owner.vC;
				oGameObjectlist9.I(true, null, -1, -1, -1, -1);
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
				int ai7[] = { 122, 120, 121, -1 };
				instance_create_group(1, ai7, 2, true, f15, f35, 400F * owner.viewScale, 3F);
				blue(1, false, false, 1.0F);
				Palette palette9 = owner.flashcolor_yellow;
				Palette palette14 = owner.flashcolor_red;
				Font gamefont24 = owner.label_font;
				show_flashstring(-1, "Destroy All United Fleet Forces||Protect Your Ships||Atleast One Must Survive!",
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
				palette9 = owner.flashcolor_white;
				palette14 = owner.flashcolor_navy;
				gamefont24 = owner.hFontLarge;
				show_flashstring(-1, "All Clear!", palette9, palette14, gamefont24, true, j1, k1, 0, 90, 0, true, false,
						0,
						-1, 0);
				getName(owner.NZ, owner.cZ, false);
				lightGray(20);
				random(1);
				lightGray(80);
				red(190);
				return;

			case 190:
				float f16 = owner.worldBorderLeft + owner.worldHrz * 0.75F;
				float f36 = owner.worldBorderTop + owner.worldVrt * 0.25F;
				float f48 = owner.worldBorderLeft + owner.worldHrz * 0.2F;
				float f57 = owner.worldBorderTop + owner.worldVrt * 0.8F;
				P++;
				GameObjectPool oGameObjectlist12 = owner.wZ;
				oGameObjectlist12.I(true, null, -1, -1, -1, -1);
				out(1, 0.5F, 0.5F, false, -1, -1, -1, -1);
				F(1, -1, -1, -1, -1, 3);
				toString(8);
				blue(2, false, true, 1.0F);
				float f62 = f16 - 300F;
				float f67 = f36 + 60F;
				instance_create(2, 231, 1, false, f62, f67, 0.0F, -1, "");
				f62 = f16 - 40F;
				f67 = f36 + 240F;
				instance_create(2, 230, 1, false, f62, f67, 0.0F, -1, "");
				int ai12[] = { 221, 221, 222, 223, 220, 220, 203, 203, 212, 212, 213, 213, -1 };
				instance_create_group(2, ai12, 2, true, f16 - 200F * owner.viewScale,
						f36 + 200F * owner.viewScale,
						400F * owner.viewScale, 3F);
				blue(2, false, false, 1.0F);
				red(2, f16 - 300F * owner.viewScale,
						f36 + 300F * owner.viewScale, 212, 3);
				red(2, f16 + 100F * owner.viewScale,
						f36 + 350F * owner.viewScale, 212, 3);
				red(2, f16 - 350F * owner.viewScale,
						f36 + 350F * owner.viewScale, 212, 3);
				red(2, f16 - 350F * owner.viewScale,
						f36 - 100F * owner.viewScale, 212, 4);
				gray(f16, f36, true, 30F);
				Palette palette18 = owner.flashcolor_red;
				Palette palette20 = owner.HZ;
				Font gamefont29 = owner.hFontLarge;
				show_flashstring(-1, "Final Mission - Apocalypse Now", palette18, palette20, gamefont29, true, l, i1, 0,
						80,
						0, true, false, 0, -1, 0);
				getName(owner.NZ, owner.zZ, false);
				palette18 = owner.flashcolor_white;
				palette20 = owner.flashcolor_navy;
				gamefont29 = owner.label_font;
				show_flashstring(10, "Skip Intro", palette18, palette20, gamefont29, true, j2, k2, 0, 10000, 0, true,
						false,
						0, -1, 0);
				lightGray(90);
				getName();
				palette18 = owner.flashcolor_yellow;
				palette20 = owner.flashcolor_red;
				gamefont29 = owner.label_font;
				show_flashstring(-1, "The Time To Exact|Our Revenge Is Upon Us", palette18, palette20, gamefont29, true,
						j1,
						k1, 0, 120, 0, true, true, 1, -1, 0);
				lightGray(80);
				gray(f48, f57, false, 30F);
				lightGray(50);
				palette18 = owner.flashcolor_yellow;
				palette20 = owner.flashcolor_red;
				gamefont29 = owner.label_font;
				show_flashstring(-1, "The Time To Destroy The Earth Is Now!", palette18, palette20, gamefont29, true,
						j1,
						k1, 0, 120, 0, true, true, 1, -1, 0);
				lightGray(130);
				red(191);
				return;

			case 191:
				float f17 = owner.worldBorderLeft + owner.worldHrz * 0.2F;
				float f37 = owner.worldBorderTop + owner.worldVrt * 0.8F;
				GameObjectPool oGameObjectlist10 = owner.vC;
				oGameObjectlist10.I(true, null, -1, -1, -1, -1);
				getName(0.25F);
				compareTo(1, 120);
				compareTo(5, 80);
				compareTo(4, 100);
				getName();
				max(1, f17, f37, 350F * owner.viewScale,
						350F * owner.viewScale);
				lightGray(101, false);
				abs(2, 3, -1, 0, 0);
				getName();
				lightGray(101, true);
				lightGray(50);
				blue(1, false, true, 1.0F);
				int ai8[] = { 120, 121, 121, 112, 111, 102, 102, -1 };
				instance_create_group(1, ai8, 2, true, f17, f37, 400F * owner.viewScale, 3F);
				float f58 = f17 - 150F * owner.viewScale;
				float f63 = f37 + 150F * owner.viewScale;
				instance_create(1, 123, 2, false, f58, f63, 3F, -1, "");
				blue(1, false, false, 1.0F);
				Palette palette10 = owner.flashcolor_yellow;
				Palette palette15 = owner.flashcolor_red;
				Font gamefont25 = owner.label_font;
				show_flashstring(-1,
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
				palette10 = owner.flashcolor_white;
				palette15 = owner.flashcolor_navy;
				gamefont25 = owner.hFontLarge;
				show_flashstring(-1, "All Clear!", palette10, palette15, gamefont25, true, j1, k1, 0, 90, 0, true,
						false, 0,
						-1, 0);
				getName(owner.NZ, owner.cZ, false);
				lightGray(20);
				red(200);
				return;

			case 200:
				float f18 = owner.worldBorderLeft + owner.worldHrz * 0.65F;
				float f38 = owner.worldBorderTop + owner.worldVrt * 0.3F;
				Object obj29 = owner.wZ;
				((GameObjectPool) (obj29)).I(true, null, -1, -1, -1, -1);
				random(1);
				lightGray(80);
				append(true);
				lightGray(103, false);
				getName();
				lightGray(10);
				obj29 = owner.flashcolor_yellow;
				Object obj38 = owner.flashcolor_red;
				Object obj45 = owner.label_font;
				show_flashstring(-1,
						"The Earth Is Defenseless...||The Terrans Will Now Pay|For Desvastating Our Homeworld!",
						((Palette) (obj29)), ((Palette) (obj38)), ((Font) (obj45)), true, j1, k1, 0, 140, 0, true, true,
						1, -1, 0);
				lightGray(50);
				gray(f18, f38, false, 30F);
				getName();
				int ai9[] = { 121, 121, 120, 120, 111, 112, -1 };
				instance_create_group(1, ai9, 3, true, f18, f38, 350F * owner.viewScale, 3F);
				random(1.0F, 1, -1, -1, -1, 103);
				lightGray(100);
				lightGray(103, false);
				getName();
				lightGray(220);
				obj38 = owner.flashcolor_yellow;
				obj45 = owner.flashcolor_red;
				Font gamefont26 = owner.label_font;
				show_flashstring(-1, "All Ships Leave Immediately", ((Palette) (obj38)), ((Palette) (obj45)),
						gamefont26,
						true, j1, k1, 0, 80, 0, true, true, 1, -1, 0);
				lightGray(20);
				red(1, f18, f38, -1, 1);
				lightGray(60);
				compareTo(false);
				lightGray(20);
				max(false, true, -1, 10, -1, -1, 103);
				lightGray(150);
				obj38 = owner.flashcolor_yellow;
				obj45 = owner.flashcolor_red;
				gamefont26 = owner.label_font;
				show_flashstring(-1, "Such Shall Be The Fate For All Terrans", ((Palette) (obj38)), ((Palette) (obj45)),
						gamefont26, true, j1, k1, 0, 80, 0, true, true, 1, -1, 0);
				lightGray(90);
				obj38 = owner.flashcolor_yellow;
				obj45 = owner.flashcolor_red;
				gamefont26 = owner.label_font;
				show_flashstring(-1,
						"We Must Now Destroy The One|Place We Could Never Conquer.||Our Nemesis... Apocalypse Outpost",
						((Palette) (obj38)), ((Palette) (obj45)), gamefont26, true, j1, k1, 0, 160, 0, true, true, 1,
						-1,
						0);
				lightGray(170);
				obj38 = owner.flashcolor_white;
				obj45 = owner.flashcolor_navy;
				gamefont26 = owner.label_font;
				show_flashstring(-1, "Coming Next To The Realspace Saga", ((Palette) (obj38)), ((Palette) (obj45)),
						gamefont26, true, j, k, 0, 120, 0, true, true, 0, -1, 0);
				lightGray(130);
				obj38 = owner.flashcolor_white;
				obj45 = owner.flashcolor_navy;
				gamefont26 = owner.label_font;
				show_flashstring(-1, "Realspace 3 - Apocalypse Returns", ((Palette) (obj38)), ((Palette) (obj45)),
						gamefont26, true, j, k, 0, 200, 0, true, true, 0, -1, 0);
				lightGray(210);
				obj38 = Color.red;
				obj45 = Color.gray;
				gamefont26 = owner.hFontLarge;
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

				if (!owner.pC && owner.qC) {
					GameObjectPool oGameObjectlist1 = owner.dZ;
					if (oGameObjectlist1.mySize == 0)
						I(1101);
				}
				if (valueOf) {
					if (!owner.Camera.A())
						return;
					valueOf = false;
				}
				if (!K)
					break label0;
				if (owner.wZ.I(1, -1, -1, -1, -1, -1F) != null || owner.yZ.I(1, -1, -1, -1, -1, -1F) != null
						|| owner.BC.I(1, -1, -1, -1, -1, -1F) != null)
					return;
				owner.qC = false;
				
				GameObjectPool obj = owner.dZ;
				oSpaceship nobj = null;
				nobj = (oSpaceship) (obj.mySize <= 0 ? null : obj.internalList[0]);
				if (nobj != null) {
					nobj.Z = false;
					nobj.C = 0;
					nobj.B = 0;
				}
				GameObjectPool oGameObjectlist3 = owner.IC;
				if (oGameObjectlist3.mySize == 0) {
					GameObjectPool oGameObjectlist4 = owner.oZ;
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
				gameobjectivelist gameobjectivelist1 = C;
				if (gameobjectivelist1.C < gameobjectivelist1.Z || false)
					return;
			} else {
				gameobjectivelist gameobjectivelist2 = I;
				if (gameobjectivelist2.C < gameobjectivelist2.Z || false)
					return;
			}
		if (L) {
			GameObjectPool oGameObjectlist2 = owner.wZ;
			boolean flag1 = M;
			boolean flag;
			if (oGameObjectlist2.mySize <= 0) {
				flag = false;
			} else {
				oGameObjectlist2.internalList[0].Equip(flag1, null);
				flag = true;
			}
			if (!flag) {
				GameObjectPool oGameObjectlist5 = owner.yZ;
				boolean flag2 = M;
				if (oGameObjectlist5.mySize <= 0) {
					flag = false;
				} else {
					oGameObjectlist5.internalList[0].Equip(flag2, null);
					flag = true;
				}
			}
			if (!flag) {
				GameObjectPool oGameObjectlist6 = owner.IC;
				boolean flag3 = M;
				if (oGameObjectlist6.mySize <= 0) {
					flag = false;
				} else {
					oGameObjectlist6.internalList[0].Equip(flag3, null);
					flag = true;
				}
			}
			if (!flag) {
				GameObjectPool oGameObjectlist7 = owner.vZ;
				boolean flag4 = M;
				if (oGameObjectlist7.mySize <= 0) {
					flag = false;
				} else {
					oGameObjectlist7.internalList[0].Equip(flag4, null);
					flag = true;
				}
			}
			if (!flag) {
				GameObjectPool oGameObjectlist8 = owner.dZ;
				boolean flag5 = M;
				if (oGameObjectlist8.mySize <= 0) {
					flag = false;
				} else {
					oGameObjectlist8.internalList[0].Equip(flag5, null);
					flag = true;
				}
			}
			if (!flag) {
				GameObjectPool oGameObjectlist9 = owner.AC;
				boolean flag6 = M;
				if (oGameObjectlist9.mySize <= 0) {
					flag = false;
				} else {
					oGameObjectlist9.internalList[0].Equip(flag6, null);
					flag = true;
				}
			}
			if (!flag) {
				GameObjectPool oGameObjectlist10 = owner.EC;
				boolean flag7 = M;
				if (oGameObjectlist10.mySize <= 0) {
					flag = false;
				} else {
					oGameObjectlist10.internalList[0].Equip(flag7, null);
					flag = true;
				}
			}
			if (!flag) {
				GameObjectPool oGameObjectlist11 = owner.GC;
				boolean flag8 = M;
				if (oGameObjectlist11.mySize <= 0) {
					flag = false;
				} else {
					oGameObjectlist11.internalList[0].Equip(flag8, null);
					flag = true;
				}
			}
			if (!flag) {
				GameObjectPool oGameObjectlist12 = owner.BC;
				boolean flag9 = M;
				if (oGameObjectlist12.mySize <= 0) {
					flag = false;
				} else {
					oGameObjectlist12.internalList[0].Equip(flag9, null);
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

	final void HNSM(boolean flag) {
		boolean flag1 = true;
		while (flag1)
			if (abs >= Z) {
				flag1 = false;
			} else {
				missioncmd missioncmd1 = F[abs];
				abs++;
				switch (missioncmd1.i) {
					default:
						break;

					case 100: // 'd'
						owner.qC = true;
						break;

					case 101: // 'e'
						if (missioncmd1.E) {
							owner.qC = false;
							GameObjectPool obj = owner.dZ;
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
						owner.OC = missioncmd1.E;
						break;

					case 103: // 'g'
						owner.I(true);
						flag1 = false;
						break;

					case 104: // 'h'
						if (!flag)
							missioncmd1.X.I(missioncmd1.I, true, missioncmd1.E);
						break;

					case 105: // 'i'
						if (!owner.isHiscoreEnabled || owner.tC)
							break;

						// serializedIsGuest.compareTo("1") == 0
						if (owner.isGuest) {
							owner.highscoreDialgueHandle.I();
							if (!owner.highscoreDialgueHandle.Z()) {
								String s = owner.highscoreDialgueHandle.getName();
								owner.I(s, String.valueOf(owner.rC));
							}
						} else {
							owner.I(owner.NB, String.valueOf(owner.rC));
						}
						break;

					case 106: // 'j'
						if (!owner.isHiscoreEnabled)
							break;
						if (missioncmd1.I == 1)
							owner.TB.I(owner, "Recent High Scores", missioncmd1.Q, missioncmd1.R,
									missioncmd1.U, missioncmd1.Z, missioncmd1.C, missioncmd1.L, missioncmd1.M,
									missioncmd1.B);
						else
							owner.UB.I(owner, "All Time High Scores", missioncmd1.Q,
									missioncmd1.R,
									missioncmd1.U, missioncmd1.Z, missioncmd1.C, missioncmd1.L, missioncmd1.M,
									missioncmd1.B);
						break;

					case 200:
						H = missioncmd1.I;
						flag1 = false;
						break;

					case 203:
						getName(missioncmd1.I, missioncmd1.L, missioncmd1.M, missioncmd1.E, missioncmd1.Z,
								missioncmd1.C,
								missioncmd1.B, missioncmd1.D);
						break;

					case 202:
						getName = 0;
						C.M = 0;
						I.M = 0;
						if (flag || missioncmd1.G) {
							if (missioncmd1.I == -1 || missioncmd1.I == 2) {
								GameObjectPool oGameObjectlist1 = owner.wZ;
								boolean flag2 = missioncmd1.E;
								int k5 = missioncmd1.Z;
								int i7 = missioncmd1.C;
								int j8 = missioncmd1.B;
								int i9 = missioncmd1.D;
								oGameObjectlist1.I(flag2, null, k5, i7, j8, i9);
								oGameObjectlist1 = owner.yZ;
								flag2 = missioncmd1.E;
								k5 = missioncmd1.Z;
								i7 = missioncmd1.C;
								j8 = missioncmd1.B;
								i9 = missioncmd1.D;
								oGameObjectlist1.I(flag2, null, k5, i7, j8, i9);
							}

							if (missioncmd1.I == -1 || missioncmd1.I == 1) {
								GameObjectPool oGameObjectlist2 = owner.vZ;
								boolean flag3 = missioncmd1.E;
								int l5 = missioncmd1.Z;
								int j7 = missioncmd1.C;
								int k8 = missioncmd1.B;
								int j9 = missioncmd1.D;
								oGameObjectlist2.I(flag3, null, l5, j7, k8, j9);
								oGameObjectlist2 = owner.IC;
								flag3 = missioncmd1.E;
								l5 = missioncmd1.Z;
								j7 = missioncmd1.C;
								k8 = missioncmd1.B;
								j9 = missioncmd1.D;
								oGameObjectlist2.I(flag3, null, l5, j7, k8, j9);
								oGameObjectlist2 = owner.dZ;
								flag3 = missioncmd1.E;
								l5 = missioncmd1.Z;
								j7 = missioncmd1.C;
								k8 = missioncmd1.B;
								j9 = missioncmd1.D;
								oGameObjectlist2.I(flag3, null, l5, j7, k8, j9);
							}
							if (missioncmd1.Z == 10) {
								GameObjectPool oGameObjectlist3 = owner.AC;
								boolean flag4 = missioncmd1.E;
								int i6 = missioncmd1.Z;
								int k7 = missioncmd1.C;
								int l8 = missioncmd1.B;
								int k9 = missioncmd1.D;
								oGameObjectlist3.I(flag4, null, i6, k7, l8, k9);
								oGameObjectlist3 = owner.EC;
								flag4 = missioncmd1.E;
								i6 = missioncmd1.Z;
								k7 = missioncmd1.C;
								l8 = missioncmd1.B;
								k9 = missioncmd1.D;
								oGameObjectlist3.I(flag4, null, i6, k7, l8, k9);
								oGameObjectlist3 = owner.GC;
								flag4 = missioncmd1.E;
								i6 = missioncmd1.Z;
								k7 = missioncmd1.C;
								l8 = missioncmd1.B;
								k9 = missioncmd1.D;
								oGameObjectlist3.I(flag4, null, i6, k7, l8, k9);
							}
						} else {
							L = true;
							M = missioncmd1.E;
						}
						flag1 = false;
						break;

					case 432:
						if (missioncmd1.I == 2)
							C.Z(missioncmd1.Z, missioncmd1.C, missioncmd1.B, missioncmd1.D);
						else
							I.Z(missioncmd1.Z, missioncmd1.C, missioncmd1.B, missioncmd1.D);
						break;

					case 461:
						D = missioncmd1.L;
						break;

					case 460:
						if (J < 10) {
							S[J] = missioncmd1.I;
							A[J] = missioncmd1.Z;
							E += missioncmd1.Z;
							J++;
						}
						break;

					case 400:
						if (out < 20) {
							println += missioncmd1.I;
							random[out] = missioncmd1.I;
							red[out] = missioncmd1.Z;
							toString[out] = missioncmd1.L;
							out++;
						}
						break;

					case 402:
						compareTo = missioncmd1.I;
						getName = missioncmd1.I;
						gray = missioncmd1.Z;
						lightGray = missioncmd1.C;
						max = missioncmd1.B;
						break;

					case 403:
						println = 0;
						out = 0;
						break;

					case 410:
						if (missioncmd1.I == 2)
							C.I(missioncmd1.Z, missioncmd1.C, missioncmd1.L);
						else
							I.I(missioncmd1.Z, missioncmd1.C, missioncmd1.L);
						break;

					case 412:
						if (missioncmd1.I == 2)
							C.I(missioncmd1.Z, missioncmd1.C, missioncmd1.B);
						else
							I.I(missioncmd1.Z, missioncmd1.C, missioncmd1.B);
						break;

					case 413:
						if (missioncmd1.I == 2) {
							C.T = 0;
							C.R = 0;
						} else {
							I.T = 0;
							I.R = 0;
						}
						break;

					case 420:
						F(missioncmd1.I, missioncmd1.Z, missioncmd1.L, missioncmd1.G, missioncmd1.E, missioncmd1.C,
								missioncmd1.M, missioncmd1.N, missioncmd1.B, missioncmd1.P);
						break;

					case 441:
						Z(missioncmd1.I, missioncmd1.L, missioncmd1.M, missioncmd1.N);
						break;

					case 442:
						if (missioncmd1.I == 2) {
							compareTo(owner.wZ);
						} else {
							compareTo(owner.vZ);
							compareTo(owner.dZ);
						}
						break;

					case 440:
						abs(missioncmd1.I);
						break;

					case 421:
						if (missioncmd1.I == 2) {
							HNSM(owner.wZ, missioncmd1.L, missioncmd1.M, missioncmd1.N, missioncmd1.O);
						} else {
							HNSM(owner.vZ, missioncmd1.L, missioncmd1.M, missioncmd1.N, missioncmd1.O);
							HNSM(owner.dZ, missioncmd1.L, missioncmd1.M, missioncmd1.N, missioncmd1.O);
						}
						break;

					case 422:
						if (missioncmd1.I == 2) {
							GameObjectPool oGameObjectlist6 = owner.wZ;
							int i2 = oGameObjectlist6.mySize;
							for (int i = 0; i < i2; i++) {
								GameObjectPool oGameObjectlist7 = owner.wZ;
								GameObject oGameObject4 = i < 0 || i >= oGameObjectlist7.mySize ? null
										: oGameObjectlist7.internalList[i];
								if (oGameObject4.e == 1 && (missioncmd1.Z == -1 || oGameObject4.JI == missioncmd1.Z)
										&& (missioncmd1.C == -1 || oGameObject4.ship_grade == missioncmd1.C)
										&& (missioncmd1.B == -1 || oGameObject4.AI == missioncmd1.B)
										&& (missioncmd1.D == -1 || oGameObject4.HI == missioncmd1.D))
									oGameObject4.I(missioncmd1.F);
							}

							break;
						}
						GameObjectPool oGameObjectlist8 = owner.vZ;
						int j2 = oGameObjectlist8.mySize;
						for (int j = 0; j < j2; j++) {
							oGameObjectlist8 = owner.vZ;
							GameObject oGameObject5 = j < 0 || j >= oGameObjectlist8.mySize ? null : oGameObjectlist8.internalList[j];
							if (oGameObject5.e == 1 && (missioncmd1.Z == -1 || oGameObject5.JI == missioncmd1.Z)
									&& (missioncmd1.C == -1 || oGameObject5.ship_grade == missioncmd1.C)
									&& (missioncmd1.B == -1 || oGameObject5.AI == missioncmd1.B)
									&& (missioncmd1.D == -1 || oGameObject5.HI == missioncmd1.D))
								oGameObject5.I(missioncmd1.F);
						}

						oGameObjectlist8 = owner.dZ;
						j2 = oGameObjectlist8.mySize;
						for (int k = 0; k < j2; k++) {
							GameObjectPool oGameObjectlist9 = owner.dZ;
							GameObject oGameObject6 = k < 0 || k >= oGameObjectlist9.mySize ? null : oGameObjectlist9.internalList[k];
							if (oGameObject6.e == 1 && (missioncmd1.Z == -1 || oGameObject6.JI == missioncmd1.Z)
									&& (missioncmd1.C == -1 || oGameObject6.ship_grade == missioncmd1.C)
									&& (missioncmd1.B == -1 || oGameObject6.AI == missioncmd1.B)
									&& (missioncmd1.D == -1 || oGameObject6.HI == missioncmd1.D))
								oGameObject6.I(missioncmd1.F);
						}

						break;

					case 423:
						if (missioncmd1.I == 2) {
							GameObjectPool oGameObjectlist10 = owner.wZ;
							int k2 = oGameObjectlist10.mySize;
							for (int l = 0; l < k2; l++) {
								GameObjectPool oGameObjectlist11 = owner.wZ;
								GameObject oGameObject7 = l < 0 || l >= oGameObjectlist11.mySize ? null
										: oGameObjectlist11.internalList[l];
								if (oGameObject7.e == 1 && (missioncmd1.Z == -1 || oGameObject7.JI == missioncmd1.Z)
										&& (missioncmd1.C == -1 || oGameObject7.ship_grade == missioncmd1.C)
										&& (missioncmd1.B == -1 || oGameObject7.AI == missioncmd1.B)
										&& (missioncmd1.D == -1 || oGameObject7.HI == missioncmd1.D))
									oGameObject7.I(missioncmd1.P);
							}

							break;
						}
						GameObjectPool oGameObjectlist12 = owner.vZ;
						int l2 = oGameObjectlist12.mySize;
						for (int i1 = 0; i1 < l2; i1++) {
							GameObjectPool oGameObjectlist13 = owner.vZ;
							GameObject oGameObject8 = i1 < 0 || i1 >= oGameObjectlist13.mySize ? null
									: oGameObjectlist13.internalList[i1];
							if (oGameObject8.e == 1 && (missioncmd1.Z == -1 || oGameObject8.JI == missioncmd1.Z)
									&& (missioncmd1.C == -1 || oGameObject8.ship_grade == missioncmd1.C)
									&& (missioncmd1.B == -1 || oGameObject8.AI == missioncmd1.B)
									&& (missioncmd1.D == -1 || oGameObject8.HI == missioncmd1.D))
								oGameObject8.I(missioncmd1.P);
						}

						break;

					case 424:
						if (missioncmd1.I == 2) {
							GameObjectPool oGameObjectlist14 = owner.wZ;
							int i3 = oGameObjectlist14.mySize;
							for (int j1 = 0; j1 < i3; j1++) {
								GameObjectPool oGameObjectlist15 = owner.wZ;
								GameObject oGameObject9 = j1 < 0 || j1 >= oGameObjectlist15.mySize ? null
										: oGameObjectlist15.internalList[j1];
								if (oGameObject9.e == 1 && (missioncmd1.Z == -1 || oGameObject9.JI == missioncmd1.Z)
										&& (missioncmd1.C == -1 || oGameObject9.ship_grade == missioncmd1.C)
										&& (missioncmd1.B == -1 || oGameObject9.AI == missioncmd1.B)
										&& (missioncmd1.D == -1 || oGameObject9.HI == missioncmd1.D))
									oGameObject9.CI = missioncmd1.E;
							}

							break;
						}
						GameObjectPool oGameObjectlist16 = owner.vZ;
						int j3 = oGameObjectlist16.mySize;
						for (int k1 = 0; k1 < j3; k1++) {
							GameObjectPool oGameObjectlist17 = owner.vZ;
							GameObject oGameObject10 = k1 < 0 || k1 >= oGameObjectlist17.mySize ? null
									: oGameObjectlist17.internalList[k1];
							if (oGameObject10.e == 1 && (missioncmd1.Z == -1 || oGameObject10.JI == missioncmd1.Z)
									&& (missioncmd1.C == -1 || oGameObject10.ship_grade == missioncmd1.C)
									&& (missioncmd1.B == -1 || oGameObject10.AI == missioncmd1.B)
									&& (missioncmd1.D == -1 || oGameObject10.HI == missioncmd1.D))
								oGameObject10.CI = missioncmd1.E;
						}

						break;

					case 426:
						if (missioncmd1.I == 2)
							C.I(missioncmd1.Z, missioncmd1.C, missioncmd1.B, missioncmd1.D);
						else
							I.I(missioncmd1.Z, missioncmd1.C, missioncmd1.B, missioncmd1.D);
						break;

					case 427:
						GameObjectPool oGameObjectlist18;
						if (missioncmd1.I == 2)
							oGameObjectlist18 = owner.wZ;
						else
							oGameObjectlist18 = owner.vZ;
						int k3 = oGameObjectlist18.mySize;
						for (int l1 = 0; l1 < k3; l1++) {
							oSpaceship oSpaceship1 = (oSpaceship) (l1 < 0 || l1 >= oGameObjectlist18.mySize ? null
									: oGameObjectlist18.internalList[l1]);
							if (((GameObject) (oSpaceship1)).e == 1 && (oSpaceship1.QI == 3 || oSpaceship1.QI == 2)
									&& (missioncmd1.Z == -1 || ((GameObject) (oSpaceship1)).JI == missioncmd1.Z)
									&& (missioncmd1.C == -1 || ((GameObject) (oSpaceship1)).ship_grade == missioncmd1.C)
									&& (missioncmd1.B == -1 || ((GameObject) (oSpaceship1)).AI == missioncmd1.B)
									&& (missioncmd1.D == -1 || ((GameObject) (oSpaceship1)).HI == missioncmd1.D)) {
								oSpaceship1.M = missioncmd1.L;
								oSpaceship1.N = missioncmd1.L * ((GameObject) (oSpaceship1)).O;
							}
						}

						break;

					case 425:
						if (missioncmd1.I == 2) {
							C.G = missioncmd1.E;
							C.H = missioncmd1.G;
							C.K = missioncmd1.L;
						} else {
							I.G = missioncmd1.E;
							I.H = missioncmd1.G;
							I.K = missioncmd1.L;
						}
						break;

					case 428:
						if (missioncmd1.I == 2) {
							gameobjectivelist gameobjectivelist1 = C;
							int l3 = missioncmd1.Z;
							int j6 = missioncmd1.C;
							int l7 = missioncmd1.B;
							gameobjectivelist1.F = l3;
							gameobjectivelist1.J = j6;
							gameobjectivelist1.A = l7;
						} else {
							gameobjectivelist gameobjectivelist2 = I;
							int i4 = missioncmd1.Z;
							int k6 = missioncmd1.C;
							int i8 = missioncmd1.B;
							gameobjectivelist2.F = i4;
							gameobjectivelist2.J = k6;
							gameobjectivelist2.A = i8;
						}
						break;

					case 430:
						if (missioncmd1.I == 2)
							blue(missioncmd1.I, owner.wZ, missioncmd1.Z, missioncmd1.C, missioncmd1.B, missioncmd1.L);
						else
							blue(missioncmd1.I, owner.vZ, missioncmd1.Z, missioncmd1.C, missioncmd1.B, missioncmd1.L);
						break;

					case 600:
						GameLabel gametext1 = (GameLabel) owner.wC
								.I(owner.vC);
						if (gametext1 == null)
							break;
						gametext1.Draw(missioncmd1.P, missioncmd1.Q, missioncmd1.U, missioncmd1.K, missioncmd1.I,
								missioncmd1.Z, missioncmd1.C, missioncmd1.B, missioncmd1.D, missioncmd1.E);
						if (missioncmd1.G)
							gametext1.Z(missioncmd1.F);
						if (missioncmd1.J != -1) {
							int j4 = missioncmd1.J;
							gametext1.HI = j4;
						}
						if (missioncmd1.H)
							gametext1.I(missioncmd1.V, missioncmd1.W);
						else if (missioncmd1.R != null) {
							Color color = missioncmd1.R;
							gametext1.B = color;
						}
						if (missioncmd1.Y != null && missioncmd1.T != null) {
							Color color1 = missioncmd1.T;
							sprite_group sprite_group1 = missioncmd1.Y;
							gametext1.OI = color1;
							gametext1.QI = sprite_group1;
							gametext1.PI = 2;
						}
						if (missioncmd1.S == -1)
							break;
						GameObject oGameObject3 = owner.I(-1, -1, -1, -1, missioncmd1.S);
						if (oGameObject3 != null) {
							int l6 = missioncmd1.A;
							gametext1.UI = oGameObject3;
							gametext1.VI = l6;
							gametext1.TI = false;
						}
						break;

					case 602:
						GameLabel gametext2 = (GameLabel) owner.wC
								.I(owner.vC);
						if (gametext2 == null)
							break;
						gametext2.Draw(missioncmd1.P, missioncmd1.Q, missioncmd1.U, missioncmd1.K, missioncmd1.I,
								missioncmd1.Z, missioncmd1.C, missioncmd1.B, missioncmd1.D, missioncmd1.E);
						if (missioncmd1.G)
							gametext2.Z(missioncmd1.F);
						gametext2.I(missioncmd1.I, missioncmd1.Z,
								missioncmd1.L * owner.viewScale,
								missioncmd1.M * owner.viewScale);
						if (missioncmd1.H) {
							gametext2.I(missioncmd1.V, missioncmd1.W);
							break;
						}
						if (missioncmd1.R != null) {
							Color color2 = missioncmd1.R;
							gametext2.B = color2;
						}
						break;

					case 206:
						valueOf = true;
						flag1 = false;
						break;

					case 204:
						owner.Camera.I(missioncmd1.L, missioncmd1.M, missioncmd1.E,
								missioncmd1.N * owner.viewScale, 0.02F);
						break;

					case 205:
						GameObject oGameObject1;
						if (missioncmd1.I == 101) {
							GameObjectPool oGameObjectlist5 = owner.dZ;
							oGameObject1 = oGameObjectlist5.mySize <= 0 ? null : oGameObjectlist5.internalList[0];
						} else {
							oGameObject1 = owner.I(-1, -1, -1, -1, missioncmd1.I);
						}
						if (oGameObject1 != null)
							owner.Camera.I(oGameObject1, missioncmd1.E, 30F, 0.02F);
						break;

					case 107: // 'k'
						owner.I(owner.PC);
						break;

					case 431:
						GameObject oGameObject2 = owner.I(missioncmd1.I, missioncmd1.Z, missioncmd1.C, missioncmd1.B,
								missioncmd1.D);
						if (oGameObject2 == null)
							break;
						oGameObject2.d = missioncmd1.F;
						oGameObject2.b = missioncmd1.J;
						if (missioncmd1.Y != null)
							oGameObject2.x = missioncmd1.Y;
						oGameObject2.y = oGameObject2.x.I(oGameObject2.d, oGameObject2.b);
						break;

					case 450:
						if (missioncmd1.I == 2)
							C.I(missioncmd1.L, missioncmd1.Z, missioncmd1.C, missioncmd1.B, missioncmd1.D);
						else
							I.I(missioncmd1.L, missioncmd1.Z, missioncmd1.C, missioncmd1.B, missioncmd1.D);
						break;

					case 451:
						if (missioncmd1.I == 2) {
							gameobjectivelist gameobjectivelist3 = C;
							if (gameobjectivelist3.Z < gameobjectivelist3.B) {
								gameobjective gameobjective1 = gameobjectivelist3.I[gameobjectivelist3.Z];
								gameobjective1.I = 2;
								gameobjectivelist3.Z++;
							}
							break;
						}
						gameobjectivelist gameobjectivelist4 = I;
						if (gameobjectivelist4.Z < gameobjectivelist4.B) {
							gameobjective gameobjective2 = gameobjectivelist4.I[gameobjectivelist4.Z];
							gameobjective2.I = 2;
							gameobjectivelist4.Z++;
						}
						break;

					case 456:
						if (missioncmd1.I == 2)
							C.I(missioncmd1.L, missioncmd1.M, missioncmd1.Z, missioncmd1.C);
						else
							I.I(missioncmd1.L, missioncmd1.M, missioncmd1.Z, missioncmd1.C);
						break;

					case 452:
						if (missioncmd1.I == 2) {
							gameobjectivelist gameobjectivelist5 = C;
							int k4 = missioncmd1.Z;
							if (gameobjectivelist5.Z < gameobjectivelist5.B) {
								gameobjective gameobjective3 = gameobjectivelist5.I[gameobjectivelist5.Z];
								gameobjective3.I = 3;
								gameobjective3.H = k4;
								gameobjective3.K = 0;
								gameobjectivelist5.Z++;
							}
							break;
						}
						gameobjectivelist gameobjectivelist6 = I;
						int l4 = missioncmd1.Z;
						if (gameobjectivelist6.Z < gameobjectivelist6.B) {
							gameobjective gameobjective4 = gameobjectivelist6.I[gameobjectivelist6.Z];
							gameobjective4.I = 3;
							gameobjective4.H = l4;
							gameobjective4.K = 0;
							gameobjectivelist6.Z++;
						}
						break;

					case 457:
						if (missioncmd1.I == 2)
							C.I();
						else
							I.I();
						break;

					case 453:
						if (missioncmd1.I == 2)
							C.I(missioncmd1.Z, missioncmd1.C, missioncmd1.B, missioncmd1.D, missioncmd1.F);
						else
							I.I(missioncmd1.Z, missioncmd1.C, missioncmd1.B, missioncmd1.D, missioncmd1.F);
						break;

					case 454:
						if (missioncmd1.I == 2) {
							gameobjectivelist gameobjectivelist7 = C;
							int i5 = missioncmd1.Z;
							if (gameobjectivelist7.Z < gameobjectivelist7.B) {
								gameobjective gameobjective5 = gameobjectivelist7.I[gameobjectivelist7.Z];
								gameobjective5.I = 6;
								gameobjective5.L = i5;
								gameobjectivelist7.Z++;
							}
							break;
						}
						gameobjectivelist gameobjectivelist8 = I;
						int j5 = missioncmd1.Z;
						if (gameobjectivelist8.Z < gameobjectivelist8.B) {
							gameobjective gameobjective6 = gameobjectivelist8.I[gameobjectivelist8.Z];
							gameobjective6.I = 6;
							gameobjective6.L = j5;
							gameobjectivelist8.Z++;
						}
						break;

					case 455:
						append = true;
						blue = missioncmd1.I;
						flag1 = false;
						break;

					case 501:
						if (flag) {
							GameObjectPool oGameObjectlist4 = owner.oZ;
							oGameObjectlist4.I(true, null, -1, -1, -1, -1);
							oGameObjectlist4 = owner.qZ;
							oGameObjectlist4.I(true, null, -1, -1, -1, -1);
							oGameObjectlist4 = owner.yZ;
							oGameObjectlist4.I(true, null, -1, -1, -1, -1);
							oGameObjectlist4 = owner.IC;
							oGameObjectlist4.I(true, null, -1, -1, -1, -1);
							oGameObjectlist4 = owner.pZ;
							oGameObjectlist4.I(true, null, -1, -1, -1, -1);
							oGameObjectlist4 = owner.tZ;
							oGameObjectlist4.I(true, null, -1, -1, -1, -1);
							oGameObjectlist4 = owner.ZC;
							oGameObjectlist4.I(true, null, -1, -1, -1, -1);
							oGameObjectlist4 = owner.vC;
							oGameObjectlist4.I(true, null, -1, -1, -1, -1);
							oGameObjectlist4 = owner.BC;
							oGameObjectlist4.I(true, null, -1, -1, -1, -1);
							owner.dZ.C();
							owner.oZ.C();
							owner.pZ.C();
							owner.qZ.C();
							owner.tZ.C();
							owner.vZ.C();
							owner.wZ.C();
							owner.yZ.C();
							owner.IC.C();
							owner.ZC.C();
							owner.AC.C();
							owner.EC.C();
							owner.GC.C();
							owner.BC.C();
						}
						I(missioncmd1.I);
						flag1 = false;
						break;
				}
			}
	}

	final void CompleteImmediately() {
		for (int i = O; abs < Z && O == i;)
			HNSM(true);

	}

	final void Z(int i, int j, int k, int l, int i1) {
		missioncmd missioncmd1 = new missioncmd(432);
		missioncmd1.I = i;
		missioncmd1.Z = j;
		missioncmd1.C = k;
		missioncmd1.B = l;
		missioncmd1.D = i1;
		if (Z < HNSM) {
			F[Z] = missioncmd1;
			Z++;
		}
	}

	final void abs(int i, boolean flag, boolean flag1, boolean flag2, boolean flag3) {
		if (flag)
			Z(i, owner.YC,
					owner.zC + (int) (owner.worldVrt * 0.10000000000000001D), 0,
					(int) (owner.worldVrt * 0.8F));
		if (flag2)
			Z(i, owner.iC,
					owner.zC + (int) (owner.worldVrt * 0.10000000000000001D), 0,
					(int) (owner.worldVrt * 0.8F));
		if (flag1)
			Z(i, owner.YC + (int) (owner.worldHrz * 0.1F),
					owner.zC,
					(int) (owner.worldHrz * 0.8F), 0);
		if (flag3)
			Z(i, owner.YC, owner.cC,
					(int) (owner.worldHrz * 0.8F), 0);
	}

	final void append(int i, int j, float f) {
		missioncmd missioncmd1 = new missioncmd(400);
		missioncmd1.I = i;
		missioncmd1.Z = j;
		missioncmd1.L = f;
		if (Z < HNSM) {
			F[Z] = missioncmd1;
			Z++;
		}
	}

	final void blue(int i, int j, int k, int l) {
		missioncmd missioncmd1 = new missioncmd(402);
		missioncmd1.I = i;
		missioncmd1.Z = j;
		missioncmd1.C = k;
		missioncmd1.B = l;
		if (Z < HNSM) {
			F[Z] = missioncmd1;
			Z++;
		}
	}

	final void compareTo(int i, int j) {
		missioncmd missioncmd1 = new missioncmd(460);
		missioncmd1.I = i;
		missioncmd1.Z = j;
		if (Z < HNSM) {
			F[Z] = missioncmd1;
			Z++;
		}
	}

	final void getName(float f) {
		missioncmd missioncmd1 = new missioncmd(461);
		missioncmd1.L = f;
		if (Z < HNSM) {
			F[Z] = missioncmd1;
			Z++;
		}
	}

	final void gray(int i, int j, int k, float f) {
		missioncmd missioncmd1 = new missioncmd(410);
		missioncmd1.I = i;
		missioncmd1.Z = j;
		missioncmd1.C = k;
		missioncmd1.L = f;
		if (Z < HNSM) {
			F[Z] = missioncmd1;
			Z++;
		}
	}

	final void lightGray(int i, int j, int k, int l) {
		missioncmd missioncmd1 = new missioncmd(412);
		missioncmd1.I = i;
		missioncmd1.Z = j;
		missioncmd1.C = k;
		missioncmd1.B = l;
		if (Z < HNSM) {
			F[Z] = missioncmd1;
			Z++;
		}
	}

	final void max(int i, float f, float f1, float f2, float f3) {
		missioncmd missioncmd1 = new missioncmd(421);
		missioncmd1.I = i;
		missioncmd1.L = f;
		missioncmd1.M = f1;
		missioncmd1.N = f2;
		missioncmd1.O = f3;
		if (Z < HNSM) {
			F[Z] = missioncmd1;
			Z++;
		}
	}

	final void instance_create(int i, int type, int k, boolean flag, float f, float f1, float f2, int l, String s) {
		missioncmd missioncmd1 = new missioncmd(420);
		missioncmd1.I = i;
		missioncmd1.Z = type;
		missioncmd1.C = k;
		missioncmd1.B = l;
		missioncmd1.L = f2;
		missioncmd1.E = false;
		missioncmd1.G = flag;
		missioncmd1.M = f;
		missioncmd1.N = f1;
		missioncmd1.P = s;
		if (Z < HNSM) {
			F[Z] = missioncmd1;
			Z++;
		}
	}

	final void instance_create_group(int i, int list[], int j, boolean flag, float f, float f1, float f2, float f3) {
		for (int k = 0; list[k] != -1; k++) {
			int l = list[k];
			float f4 = f + ((float) Math.random() - 0.5F) * f2;
			float f5 = f1 + ((float) Math.random() - 0.5F) * f2;
			instance_create(i, l, j, flag, f4, f5, f3, -1, "");
		}

	}

	final void random(int i) {
		missioncmd missioncmd1 = new missioncmd(442);
		missioncmd1.I = i;
		if (Z < HNSM) {
			F[Z] = missioncmd1;
			Z++;
		}
	}

	final void red(int i, float f, float f1, float f2) {
		missioncmd missioncmd1 = new missioncmd(441);
		missioncmd1.I = i;
		missioncmd1.L = f;
		missioncmd1.M = f1;
		missioncmd1.N = f2;
		if (Z < HNSM) {
			F[Z] = missioncmd1;
			Z++;
		}
	}

	final void toString(int i) {
		missioncmd missioncmd1 = new missioncmd(440);
		missioncmd1.I = i;
		if (Z < HNSM) {
			F[Z] = missioncmd1;
			Z++;
		}
	}

	final void valueOf(int i, int j, int k, int l, int i1, String s) {
		missioncmd missioncmd1 = new missioncmd(423);
		missioncmd1.I = i;
		missioncmd1.Z = j;
		missioncmd1.C = k;
		missioncmd1.B = l;
		missioncmd1.D = i1;
		missioncmd1.P = s;
		if (Z < HNSM) {
			F[Z] = missioncmd1;
			Z++;
		}
	}

	final void F(int i, int j, int k, int l, int i1, int j1) {
		missioncmd missioncmd1 = new missioncmd(422);
		missioncmd1.I = i;
		missioncmd1.Z = j;
		missioncmd1.C = k;
		missioncmd1.B = l;
		missioncmd1.D = i1;
		missioncmd1.F = j1;
		if (Z < HNSM) {
			F[Z] = missioncmd1;
			Z++;
		}
	}

	final void HNSM(int i, int j, int k, int l, int i1, float f) {
		missioncmd missioncmd1 = new missioncmd(427);
		missioncmd1.I = i;
		missioncmd1.Z = j;
		missioncmd1.C = k;
		missioncmd1.B = l;
		missioncmd1.D = i1;
		missioncmd1.L = f;
		if (Z < HNSM) {
			F[Z] = missioncmd1;
			Z++;
		}
	}

	final void abs(int i, int j, int k, int l, int i1) {
		missioncmd missioncmd1 = new missioncmd(426);
		missioncmd1.I = i;
		missioncmd1.Z = j;
		missioncmd1.C = k;
		missioncmd1.B = l;
		missioncmd1.D = i1;
		if (Z < HNSM) {
			F[Z] = missioncmd1;
			Z++;
		}
	}

	final void append(int i, int j, int k, int l) {
		missioncmd missioncmd1 = new missioncmd(428);
		missioncmd1.I = i;
		missioncmd1.Z = j;
		missioncmd1.C = k;
		missioncmd1.B = l;
		if (Z < HNSM) {
			F[Z] = missioncmd1;
			Z++;
		}
	}

	final void blue(int i, boolean flag, boolean flag1, float f) {
		missioncmd missioncmd1 = new missioncmd(425);
		missioncmd1.I = i;
		missioncmd1.E = flag;
		missioncmd1.G = flag1;
		missioncmd1.L = f;
		if (Z < HNSM) {
			F[Z] = missioncmd1;
			Z++;
		}
	}

	final void compareTo(int i, float f) {
		missioncmd missioncmd1 = new missioncmd(429);
		missioncmd1.I = i;
		missioncmd1.L = f;
		if (Z < HNSM) {
			F[Z] = missioncmd1;
			Z++;
		}
	}

	final void getName() {
		missioncmd missioncmd1 = new missioncmd(206);
		if (Z < HNSM) {
			F[Z] = missioncmd1;
			Z++;
		}
	}

	final void gray(float f, float f1, boolean flag, float f2) {
		missioncmd missioncmd1 = new missioncmd(204);
		missioncmd1.L = f;
		missioncmd1.M = f1;
		missioncmd1.N = f2;
		missioncmd1.E = flag;
		if (Z < HNSM) {
			F[Z] = missioncmd1;
			Z++;
		}
	}

	final void lightGray(int i, boolean flag) {
		missioncmd missioncmd1 = new missioncmd(205);
		missioncmd1.I = i;
		missioncmd1.E = flag;
		if (Z < HNSM) {
			F[Z] = missioncmd1;
			Z++;
		}
	}

	final void max() {
		missioncmd missioncmd1 = new missioncmd(107);
		if (Z < HNSM) {
			F[Z] = missioncmd1;
			Z++;
		}
	}

	final void out(int i, int j, int k, int l, int i1, sprite_group sprite_group1, int j1, int k1) {
		missioncmd missioncmd1 = new missioncmd(431);
		missioncmd1.I = i;
		missioncmd1.Z = j;
		missioncmd1.C = k;
		missioncmd1.B = l;
		missioncmd1.D = i1;
		missioncmd1.F = j1;
		missioncmd1.J = k1;
		missioncmd1.Y = sprite_group1;
		if (Z < HNSM) {
			F[Z] = missioncmd1;
			Z++;
		}
	}

	final void println(int i) {
		missioncmd missioncmd1 = new missioncmd(455);
		missioncmd1.I = i;
		if (Z < HNSM) {
			F[Z] = missioncmd1;
			Z++;
		}
	}

	final void random(float f, int i, int j, int k, int l, int i1) {
		missioncmd missioncmd1 = new missioncmd(450);
		missioncmd1.L = f;
		missioncmd1.I = i;
		missioncmd1.Z = j;
		missioncmd1.C = k;
		missioncmd1.B = l;
		missioncmd1.D = i1;
		if (Z < HNSM) {
			F[Z] = missioncmd1;
			Z++;
		}
	}

	final void red(int i, float f, float f1, int j, int k) {
		missioncmd missioncmd1 = new missioncmd(456);
		missioncmd1.I = i;
		missioncmd1.Z = j;
		missioncmd1.C = k;
		missioncmd1.L = f;
		missioncmd1.M = f1;
		if (Z < HNSM) {
			F[Z] = missioncmd1;
			Z++;
		}
	}

	final void toString(int i, int j, int k, int l, int i1, int j1) {
		missioncmd missioncmd1 = new missioncmd(453);
		missioncmd1.I = i;
		missioncmd1.Z = j;
		missioncmd1.C = k;
		missioncmd1.B = l;
		missioncmd1.D = i1;
		missioncmd1.F = j1;
		if (Z < HNSM) {
			F[Z] = missioncmd1;
			Z++;
		}
	}

	final void valueOf(int i, int j) {
		missioncmd missioncmd1 = new missioncmd(454);
		missioncmd1.I = i;
		missioncmd1.Z = j;
		if (Z < HNSM) {
			F[Z] = missioncmd1;
			Z++;
		}
	}

	final void F(int i, String s, Color color, Color color1, Font gamefont1, boolean flag, int j, int k, int l,
			int i1, int j1, boolean flag1, boolean flag2, int k1, sprite_group sprite_group1, Color color2, int l1,
			int i2) {
		missioncmd missioncmd1 = new missioncmd(600);
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
		missioncmd1.F = k1;
		missioncmd1.J = i;
		missioncmd1.S = l1;
		missioncmd1.A = i2;
		missioncmd1.E = flag1;
		missioncmd1.G = flag2;
		missioncmd1.H = false;
		missioncmd1.K = flag;
		if (Z < HNSM) {
			F[Z] = missioncmd1;
			Z++;
		}
	}

	final void show_flashstring(int i, String s, Palette palette, Palette palette1, Font gamefont1, boolean flag,
			int j, int k, int l, int i1, int j1, boolean flag1, boolean flag2, int k1, int l1, int i2) {
		missioncmd missioncmd1 = new missioncmd(600);
		missioncmd1.P = s;
		missioncmd1.Q = null;
		missioncmd1.R = null;
		missioncmd1.V = palette;
		missioncmd1.W = palette1;
		missioncmd1.U = gamefont1;
		missioncmd1.I = j;
		missioncmd1.Z = k;
		missioncmd1.C = l;
		missioncmd1.B = i1;
		missioncmd1.D = j1;
		missioncmd1.F = k1;
		missioncmd1.J = i;
		missioncmd1.S = l1;
		missioncmd1.A = i2;
		missioncmd1.E = flag1;
		missioncmd1.G = flag2;
		missioncmd1.H = true;
		missioncmd1.K = flag;
		if (Z < HNSM) {
			F[Z] = missioncmd1;
			Z++;
		}
	}

	final void abs() {
		missioncmd missioncmd1 = new missioncmd(100);
		if (Z < HNSM) {
			F[Z] = missioncmd1;
			Z++;
		}
	}

	final void append(boolean flag) {
		missioncmd missioncmd1 = new missioncmd(101);
		missioncmd1.E = flag;
		if (Z < HNSM) {
			F[Z] = missioncmd1;
			Z++;
		}
	}

	final void blue() {
		missioncmd missioncmd1 = new missioncmd(103);
		if (Z < HNSM) {
			F[Z] = missioncmd1;
			Z++;
		}
	}

	final void compareTo(boolean flag) {
		missioncmd missioncmd1 = new missioncmd(102);
		missioncmd1.E = flag;
		if (Z < HNSM) {
			F[Z] = missioncmd1;
			Z++;
		}
	}

	final void getName(GameSoundPool gamesoundlist1, int i, boolean flag) {
		missioncmd missioncmd1 = new missioncmd(104);
		missioncmd1.X = gamesoundlist1;
		missioncmd1.I = i;
		missioncmd1.E = flag;
		if (Z < HNSM) {
			F[Z] = missioncmd1;
			Z++;
		}
	}

	final void gray() {
		missioncmd missioncmd1 = new missioncmd(105);
		if (Z < HNSM) {
			F[Z] = missioncmd1;
			Z++;
		}
	}

	final void lightGray(int i) {
		missioncmd missioncmd1 = new missioncmd(200);
		missioncmd1.I = i;
		if (Z < HNSM) {
			F[Z] = missioncmd1;
			Z++;
		}
	}

	final void max(boolean flag, boolean flag1, int i, int j, int k, int l, int i1) {
		missioncmd missioncmd1 = new missioncmd(202);
		missioncmd1.E = flag;
		missioncmd1.G = flag1;
		missioncmd1.I = i;
		missioncmd1.Z = j;
		missioncmd1.C = k;
		missioncmd1.B = l;
		missioncmd1.D = i1;
		if (Z < HNSM) {
			F[Z] = missioncmd1;
			Z++;
		}
	}

	final void out(int i, float f, float f1, boolean flag, int j, int k, int l, int i1) {
		missioncmd missioncmd1 = new missioncmd(203);
		missioncmd1.I = i;
		missioncmd1.Z = j;
		missioncmd1.C = k;
		missioncmd1.B = l;
		missioncmd1.D = i1;
		missioncmd1.L = f;
		missioncmd1.M = f1;
		missioncmd1.E = flag;
		if (Z < HNSM) {
			F[Z] = missioncmd1;
			Z++;
		}
	}

	final void red(int i) {
		missioncmd missioncmd1 = new missioncmd(501);
		missioncmd1.I = i;
		if (Z < HNSM) {
			F[Z] = missioncmd1;
			Z++;
		}
	}

	@SuppressWarnings("unused")
	final void valueOf(int i) {
		for (int j4 = 0; j4 < i; j4++) {
			int k4 = (int) (Math.random() * 2D);
			if (k4 == 0)
				k4 = -1;
			int l4 = (int) (Math.random() * println);
			for (int i5 = 0; i5 < out; i5++)
				if (l4 > random[i5]) {
					l4 -= random[i5];
				} else {
					int j5 = (int) (Math.random() * 4D);
					switch (j5) {
						case 0: // '\0'
							int j = owner.YC;
							int j1 = owner.zC
									+ (int) (Math.random() * owner.worldVrt);
							int j2 = owner.iC;
							int j3 = (int) (Math.random() * (owner.worldVrt + max)) + max / 2;
							break;

						case 1: // '\001'
							int k = owner.iC;
							int k1 = owner.zC
									+ (int) (Math.random() * owner.worldVrt);
							int k2 = owner.YC;
							int k3 = owner.zC
									+ (int) (Math.random() * (owner.worldVrt + max)) + max / 2;
							break;

						case 2: // '\002'
							int l = owner.YC
									+ (int) (Math.random() * owner.worldHrz);
							int l1 = owner.cC;
							int l2 = owner.YC
									+ (int) (Math.random() * (owner.worldHrz + max)) + max / 2;
							int l3 = owner.YC;
							break;

						default:
							int i1 = owner.YC
									+ (int) (Math.random() * owner.worldHrz);
							int i2 = owner.zC;
							int i3 = owner.YC
									+ (int) (Math.random() * (owner.worldHrz + max)) + max / 2;
							int i4 = owner.cC;
							break;
					}
				}

		}

	}

	final void F(int i, int j, float f, boolean flag, boolean flag1, int k, float f1, float f2, int l, String s) {
		float f3;
		float f4;
		if (flag1) {
			int i1 = (int) (Math.random() * 3D);
			switch (i1) {
				case 0: // '\0'
					f3 = -50F;
					f4 = (float) (Math.random() * (owner.viewHeight * 0.40000000000000002D)
							- 50D);
					break;

				case 1: // '\001'
					f3 = (float) (Math.random() * (owner.viewWidth + 100F)) - 50F;
					f4 = -50F;
					break;

				default:
					f3 = (float) (owner.viewWidth + 50D);
					f4 = (float) (Math.random() * (owner.viewHeight * 0.40000000000000002D)
							- 50D);
					break;
			}
		} else {
			f3 = f1;
			f4 = f2;
		}
		int j1 = (int) (Math.random() * 40D);
		if (flag) {
			Explosion explosion1 = (Explosion) owner.rZ.I(owner.qZ);
			if (explosion1 != null) {
				explosion1.I(owner.sprite_group_ship, 1, (int) f3 - -50F, (int) f4, 0.0F, 0.0F, 1, 2, 0, false);
				explosion1.s = -j1;
			}
		}
		oSpaceship oSpaceship1 = null;
		if (i == 2)
			oSpaceship1 = (oSpaceship) owner.xZ.I(owner.wZ);
		else
			oSpaceship1 = (oSpaceship) owner.xZ.I(owner.vZ);
		if (oSpaceship1 != null) {
			oSpaceship1.I(j, i, I(1.0F, 0.2F) * owner.viewScale);
			oSpaceship1.QI = k;
			oSpaceship1.HI = l;
			if (i == 2) {
				if (C.G) {
					oSpaceship1.II = true;
					oSpaceship1.ZI = s;
				}
				oSpaceship1.CI = C.H;
				if (C.K >= 0.0F)
					oSpaceship1.BI = C.K;
			} else {
				if (I.G) {
					oSpaceship1.II = true;
					oSpaceship1.ZI = s;
				}
				oSpaceship1.CI = I.H;
				if (I.K >= 0.0F)
					oSpaceship1.BI = I.K;
			}
			if (k == 1) {
				oSpaceship1.I(f3, f4, true);
				return;
			}
			if (flag) {
				oSpaceship1.I(f3 - -50F, f4, null, f3, f4, f * owner.viewScale, 1.0F, 0.15F,
						true);
				if (k == 2) {
					oSpaceship1.I(((GameObject) (oSpaceship1)).J, ((GameObject) (oSpaceship1)).S, 0.0F, 0.0F, true);
					oSpaceship1.I(((GameObject) (oSpaceship1)).J, ((GameObject) (oSpaceship1)).S, null, f3, f4,
							f * owner.viewScale, 0.15F, false, true);
				}
				oSpaceship1.s = -j1 - 20;
				return;
			}
			if (k == 2) {
				oSpaceship1.I(f3, f4, null, f3, f4, f * owner.viewScale, 0.15F, false, true);
				return;
			}
			oSpaceship1.I(f3 - 5F, f4, null, f3, f4, f * owner.viewScale, 1.0F, 0.15F, true);
		}
	}

	final void HNSM(GameObjectPool oGameObjectlist1, float f, float f1, float f2, float f3) {
		int i = oGameObjectlist1.mySize;
		for (int j = 0; j < i; j++) {
			oSpaceship oSpaceship1 = (oSpaceship) (j < 0 || j >= oGameObjectlist1.mySize ? null : oGameObjectlist1.internalList[j]);
			if (((GameObject) (oSpaceship1)).e == 3) {
				float f4 = f + ((float) Math.random() - 0.5F) * f2;
				float f5 = f1 + ((float) Math.random() - 0.5F) * f3;
				int k = 0;
				if (((GameObject) (oSpaceship1)).HI == 101)
					f4 = f + f2 / 2.0F + 50F;
				else
					k = (int) (Math.random() * 40D);
				Explosion explosion1 = (Explosion) owner.rZ.I(owner.qZ);
				if (explosion1 != null) {
					explosion1.I(owner.sprite_group_ship, 1, (int) f4 - -50F, (int) f5, 0.0F, 0.0F, 1, 2, 0,
							false);
					explosion1.s = -k;
				}
				oSpaceship1.e = 1;
				if (((GameObject) (oSpaceship1)).HI == 101) {
					oSpaceship1.Z(f4, f5, 2.0F, 0.0F, ((GameObject) (oSpaceship1)).M, ((GameObject) (oSpaceship1)).O,
							false);
					oSpaceship1.s = -10;
					oSpaceship1.QI = 4;
				} else {
					oSpaceship1.QI = 2;
					oSpaceship1.I(f4 - -50F, f5, null, f4, f5, ((GameObject) (oSpaceship1)).M,
							((GameObject) (oSpaceship1)).c, ((GameObject) (oSpaceship1)).O,
							((GameObject) (oSpaceship1)).f);
					oSpaceship1.I(((GameObject) (oSpaceship1)).J, ((GameObject) (oSpaceship1)).S, 0.0F, 0.0F, true);
					oSpaceship1.I(((GameObject) (oSpaceship1)).J, ((GameObject) (oSpaceship1)).S, null, f4, f5,
							((GameObject) (oSpaceship1)).M, ((GameObject) (oSpaceship1)).O, false, true);
					oSpaceship1.s = -k - 20;
				}
			}
		}

	}

	final void Z(int i, float f, float f1, float f2) {
		oSpaceship oSpaceship1 = (oSpaceship) owner.xZ.I(owner.dZ);
		if (oSpaceship1 != null) {
			oSpaceship1.I(i, 1, 0.0F);
			oSpaceship1.Z(f, f1, 2.0F, 0.0F, f2 * owner.viewScale, 0.03F, false);
			oSpaceship1.s = -10;
			oSpaceship1.QI = 4;
			owner.Camera.I(oSpaceship1, true, 0.0F, 0.0F);
			oSpaceship1.HI = 101;
			oSpaceship1.CI = true;
			oSpaceship1.BI = 0.3F;
			Explosion explosion1 = (Explosion) owner.rZ.I(owner.qZ);
			if (explosion1 != null)
				explosion1.I(owner.sprite_group_ship, 1, (int) f, (int) f1, 0.0F, 0.0F, 1, 2, 0, false);
			owner.MC = 0.0F;
			owner.eZ = 0;
			owner.gZ = 0;
			owner.hZ = 1;
			owner.kZ = 0;
			owner.lZ = 0;
			owner.mZ = 0;
		}
	}

	final void abs(int i) {
		owner.EC.I();
		owner.GC.I();
		owner.AC.I();
		for (int j = 0; j < 5; j++)
			append((owner.worldBorderLeft + (float) Math.random() * owner.worldHrz) * 0.8F,
					(owner.worldBorderTop + (float) Math.random() * owner.worldVrt) * 0.8F,
					-1, -1, 0, true,
					owner.vI, 0);

		for (int k = 0; k < 5; k++)
			append((owner.worldBorderLeft + (float) Math.random() * owner.worldHrz) * 0.8F,
					(owner.worldBorderTop + (float) Math.random() * owner.worldVrt) * 0.8F,
					-1, -1, 0, true,
					owner.wI, 0);

		for (int l = 0; l < 5; l++)
			append((owner.worldBorderLeft + (float) Math.random() * owner.worldHrz) * 0.8F,
					(owner.worldBorderTop + (float) Math.random() * owner.worldVrt) * 0.8F,
					-1, -1, 0, true,
					owner.xI, 0);

		switch (i) {
			case 9: // '\t'
				append(0.45F, 0.55F, -1, -1, 0, true, owner.eI, 1);
				append(0.41F, 0.52F, -1, -1, 0, true, owner.tI, 0);
				append(0.58F, 0.42F, -1, -1, 0, true, owner.pI, 0);
				append(0.6F, 0.59F, -1, -1, 0, true, owner.nI, 0);
				append(0.45F, 0.4F, -1, -1, 0, true, owner.nI, 0);
				append(0.35F, 0.3F, -1, -1, 0, true, owner.qI, 0);
				append(0.62F, 0.38F, -1, -1, 0, true, owner.IZ, 0);
				return;

			case 10: // '\n'
				owner.AC.I();
				append(0.53F, 0.52F, -1, -1, 0, true, owner.vI, 0);
				append(0.465F, 0.47F, -1, -1, 0, true, owner.wI, 0);
				append(0.53F, 0.465F, -1, -1, 0, true, owner.jI, 1);
				append(0.475F, 0.53F, -1, -1, 0, true, owner.eI, 3);
				return;

			case 1: // '\001'
				append(0.25F, 0.75F, 100, 1, 10000, true, owner.eI, 0);
				append(0.21F, 0.72F, -1, -1, 0, true, owner.tI, 0);
				append(0.58F, 0.42F, -1, -1, 0, true, owner.pI, 0);
				append(0.6F, 0.59F, -1, -1, 0, true, owner.nI, 0);
				append(0.45F, 0.4F, -1, -1, 0, true, owner.nI, 0);
				append(0.55F, 0.73F, -1, -1, 0, true, owner.qI, 0);
				append(0.4F, 0.68F, -1, -1, 0, true, owner.qI, 0);
				append(0.2F, 0.3F, -1, -1, 0, true, owner.qI, 0);
				append(0.65F, 0.5F, -1, -1, 0, true, owner.qI, 0);
				append(0.35F, 0.55F, -1, -1, 0, true, owner.IZ, 0);
				return;

			case 2: // '\002'
				append(0.35F, 0.65F, -1, -1, 0, true, owner.eI, 2);
				append(0.34F, 0.62F, -1, -1, 0, true, owner.tI, 1);
				append(0.6F, 0.52F, -1, -1, 0, true, owner.nI, 0);
				append(0.45F, 0.4F, -1, -1, 0, true, owner.pI, 0);
				append(0.25F, 0.25F, -1, -1, 0, true, owner.qI, 0);
				append(0.75F, 0.35F, -1, -1, 0, true, owner.qI, 0);
				append(0.4F, 0.55F, -1, -1, 0, true, owner.IZ, 1);
				return;

			case 4: // '\004'
				append(0.47F, 0.44F, -1, -1, 0, true, owner.mI, 1);
				append(0.3F, 0.28F, -1, -1, 0, true, owner.nI, 0);
				append(0.6F, 0.55F, -1, -1, 0, true, owner.nI, 0);
				append(0.7F, 0.35F, -1, -1, 0, true, owner.rI, 0);
				append(0.69F, 0.62F, -1, -1, 0, true, owner.rI, 0);
				append(0.26F, 0.58F, -1, -1, 0, true, owner.qI, 0);
				append(0.45F, 0.55F, -1, -1, 0, true, owner.IZ, 1);
				append(0.32F, 0.5F, -1, -1, 0, true, owner.oI, 1);
				return;

			case 3: // '\003'
				append(0.7F, 0.3F, 102, -1, 0, true, owner.mI, 0);
				append(0.4F, 0.6F, -1, -1, 0, true, owner.oI, 0);
				append(0.43F, 0.48F, -1, -1, 0, true, owner.IZ, 0);
				append(0.35F, 0.25F, -1, -1, 0, true, owner.nI, 0);
				append(0.63F, 0.63F, -1, -1, 0, true, owner.nI, 0);
				append(0.25F, 0.7F, -1, -1, 0, true, owner.rI, 0);
				append(0.55F, 0.35F, -1, -1, 0, true, owner.rI, 0);
				append(0.74F, 0.55F, -1, -1, 0, true, owner.qI, 0);
				return;

			case 5: // '\005'
				append(0.51F, 0.54F, -1, -1, 0, true, owner.oI, 0);
				append(0.35F, 0.42F, -1, -1, 0, true, owner.IZ, 1);
				append(0.42F, 0.38F, -1, -1, 0, true, owner.yI, 1);
				append(0.24F, 0.56F, -1, -1, 0, true, owner.pI, 0);
				append(0.35F, 0.71F, -1, -1, 0, true, owner.nI, 0);
				append(0.7F, 0.31F, -1, -1, 0, true, owner.nI, 0);
				append(0.23F, 0.26F, -1, -1, 0, true, owner.rI, 0);
				append(0.54F, 0.22F, -1, -1, 0, true, owner.rI, 0);
				append(0.74F, 0.63F, -1, -1, 0, true, owner.qI, 0);
				return;

			case 6: // '\006'
				append(0.39F, 0.52F, -1, -1, 0, true, owner.aI, 0);
				append(0.71F, 0.54F, -1, -1, 0, true, owner.yI, 1);
				append(0.48F, 0.61F, -1, -1, 0, true, owner.uI, 1);
				append(0.5F, 0.63F, -1, -1, 0, true, owner.jI, 1);
				append(0.6F, 0.34F, -1, -1, 0, true, owner.sI, 1);
				return;

			case 7: // '\007'
				append(0.75F, 0.75F, -1, -1, 0, true, owner.sI, 0);
				append(0.39F, 0.52F, -1, -1, 0, true, owner.aI, 1);
				append(0.71F, 0.54F, -1, -1, 0, true, owner.yI, 0);
				append(0.48F, 0.61F, -1, -1, 0, true, owner.uI, 1);
				append(0.5F, 0.63F, -1, -1, 0, true, owner.jI, 1);
				return;

			case 8: // '\b'
				append(0.71F, 0.61F, -1, -1, 0, true, owner.uI, 0);
				append(0.75F, 0.25F, 103, 2, 10000, true, owner.jI, 0);
				append(0.39F, 0.52F, -1, -1, 0, true, owner.aI, 1);
				append(0.71F, 0.54F, -1, -1, 0, true, owner.yI, 0);
				append(0.5F, 0.63F, -1, -1, 0, true, owner.sI, 1);
				return;
		}
		System.out.println("launchBackground undefined nBackgroundType");
	}

	final void append(float f, float f1, int i, int j, int k, boolean flag, sprite_group sprite_group1, int l) {
		if (Math.abs(f) < 1.0F && Math.abs(f1) < 1.0F) {
			f = owner.worldHrz * f - owner.worldHrz / 2.0F;
			f1 = owner.worldVrt * f1 - owner.worldVrt / 2.0F;
		}
		oPlanet oPlanet1;
		if (j != -1) {
			if (j == 1)
				oPlanet1 = (oPlanet) owner.JC.I(owner.EC);
			else
				oPlanet1 = (oPlanet) owner.JC.I(owner.GC);
		} else {
			oPlanet1 = (oPlanet) owner.JC.I(owner.AC);
		}
		if (oPlanet1 != null) {
			oPlanet1.I(sprite_group1, k, flag, 0, l);
			oPlanet1.I(f, f1, false);
			if (i != -1)
				oPlanet1.HI = i;
		}
	}

	final void blue(int i, GameObjectPool oGameObjectlist1, int j, int k, int l, float f) {
		int i2 = 0;
		int j2 = 0;
		int k2 = oGameObjectlist1.mySize;
		if (k2 == 0)
			return;
		oSpaceship aspaceship[] = new oSpaceship[k2];
		for (int i1 = 0; i1 < k2; i1++) {
			oSpaceship oSpaceship1 = (oSpaceship) (i1 < 0 || i1 >= oGameObjectlist1.mySize ? null : oGameObjectlist1.internalList[i1]);
			if (((GameObject) (oSpaceship1)).AI == j) {
				aspaceship[i2] = oSpaceship1;
				i2++;
			}
		}

		if (i2 == 0)
			return;
		oSpaceship aspaceship1[] = new oSpaceship[k2];
		for (int j1 = 0; j1 < k2; j1++) {
			oSpaceship oSpaceship2 = (oSpaceship) (j1 < 0 || j1 >= oGameObjectlist1.mySize ? null : oGameObjectlist1.internalList[j1]);
			if (((GameObject) (oSpaceship2)).AI == k) {
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

	final void compareTo(GameObjectPool oGameObjectlist1) {
		int i = oGameObjectlist1.mySize;
		for (int j = 0; j < i; j++) {
			oSpaceship oSpaceship1 = (oSpaceship) (j < 0 || j >= oGameObjectlist1.mySize ? null : oGameObjectlist1.internalList[j]);
			if (((GameObject) (oSpaceship1)).e == 1) {
				oSpaceship1.QI = 3;
				oSpaceship1.MI = 25;
				Explosion explosion1 = (Explosion) owner.rZ.I(owner.qZ);
				if (explosion1 != null)
					explosion1.I(owner.sprite_group_ship, 1,
							(int) (((GameObject) (oSpaceship1)).J + ((GameObject) (oSpaceship1)).K * 25F),
							(int) (((GameObject) (oSpaceship1)).S + ((GameObject) (oSpaceship1)).L * 25F), 0.0F, 0.0F,
							1, 2, 0, false);
				oSpaceship1.I(((GameObject) (oSpaceship1)).J, ((GameObject) (oSpaceship1)).S,
						((GameObject) (oSpaceship1)).K, ((GameObject) (oSpaceship1)).L,
						((GameObject) (oSpaceship1)).f);
			}
		}

	}

	final void getName(int i, float f, float f1, boolean flag, int j, int k, int l, int i1) {
		if (i == 1) {
			owner.vZ.I(f, f1, flag, j, k, l, i1);
			owner.dZ.I(f, f1, flag, j, k, l, i1);
			owner.EC.I(f, f1, flag, j, k, l, i1);
			return;
		} else {
			owner.wZ.I(f, f1, flag, j, k, l, i1);
			owner.GC.I(f, f1, flag, j, k, l, i1);
			return;
		}
	}

	final float I(float f, float f1) {
		if (f1 < 0.0F)
			return Math.max(f + f1 * Q, f / 3F);
		else
			return f + f1 * Q;
	}

	missioncmd F[];
	int HNSM;
	int Z;
	int abs;
	gameobjectivelist I;
	gameobjectivelist C;
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
	GameApp owner;
	int O;
	int P;
	int Q;
}
