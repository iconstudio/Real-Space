package src;
// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.

// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   star_y

import java.awt.Color;

final class Constant {
	Constant() {
	}

	static final int c_white_int;
	static final int c_ltgray_int;
	static final int c_gray_int;
	static final int c_dkgray_int;
	static final int c_ltred_int;
	static final int c_red_int;
	static final int c_maroon_int;
	static final int c_lime_int;
	static final int c_green_int;
	static final int c_dkgreen_int;
	static final int c_ltblue_int;
	static final int c_blue_int;
	static final int c_navy_int;
	static final int c_lemon_int;
	static final int c_yellow_int;
	static final int c_dkyellow_int;

	static {
		c_white_int = Color.white.getRGB();
		c_ltgray_int = Color.gray.brighter().getRGB();
		c_gray_int = Color.gray.getRGB();
		c_dkgray_int = Color.gray.darker().getRGB();
		c_ltred_int = Color.red.brighter().getRGB();
		c_red_int = Color.red.getRGB();
		c_maroon_int = Color.red.darker().darker().getRGB();
		c_lime_int = Color.green.brighter().getRGB();
		c_green_int = Color.green.getRGB();
		c_dkgreen_int = Color.green.darker().getRGB();
		c_ltblue_int = Color.blue.brighter().brighter().getRGB();
		c_blue_int = Color.blue.getRGB();
		c_navy_int = Color.blue.darker().getRGB();
		c_lemon_int = Color.yellow.brighter().getRGB();
		c_yellow_int = Color.yellow.getRGB();
		c_dkyellow_int = Color.yellow.darker().darker().getRGB();
	}
}
