package src;
// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.

// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   star_y

final class starfield {

	starfield(gameapp gameapp1, int number, int j, palette agamecolorlist[]) {
		owner = gameapp1;
		star_number = number;
		star_number_start = number;
		random = j;
		B = agamecolorlist;
		star_x = new float[number];
		star_y = new float[number];
		C = new palette[number];
		D = new int[number];
		J = new int[number];
		star_fade = new boolean[number];
		star_blinkcounter = new int[number];
		star_lifetime = new int[number];
		star_blinking = new boolean[number];
		star_blink = new int[number];
		star_z = new float[number];
		star_sprite_groups = new sprite_group[number];
		initialize();
	}

	final void initialize() {
		for (int i = 0; i < star_number; i++) {
			if (i <= 4)
				star_sprite_groups[i] = owner.sStarWhite;
			else if (i <= 8)
				star_sprite_groups[i] = owner.sStarRed;
			else if (i <= 12)
				star_sprite_groups[i] = owner.sStarBlue;
			else
				star_sprite_groups[i] = null;
			star_x[i] = (int) (Math.random() * (double) ((gamebase) (owner)).view_width);
			star_y[i] = (int) (Math.random() * (double) ((gamebase) (owner)).view_height);
			star_z[i] = (-0.55F + (float) Math.random() * 0.35F) * ((gamebase) (owner)).view_scale;
			star_fade[i] = false;
			star_blinkcounter[i] = 0;
			if (star_sprite_groups[i] == null)
				star_blink[i] = (int) (Math.random() * 45D) + 10;
			else
				star_blink[i] = (int) (Math.random() * 80D) + 40;
			D[i] = (int) (Math.random() * 2D) + 1;
			J[i] = (int) (Math.random() * 2D) + 1;
			if (J[i] > D[i])
				J[i] = D[i];
			int j = (int) (Math.random() * (double) ((float) random - 0.0001F));
			C[i] = B[j];
		}

	}

	final void update(float hspeed, float vspeed) {
		for (int i = 0; i < star_number; i++) {
			star_x[i] += hspeed * star_z[i];
			star_y[i] += vspeed * star_z[i];
			if (star_x[i] < 0.0F || star_y[i] < 0.0F || star_x[i] > (float) ((gamebase) (owner)).view_width
					|| star_y[i] > (float) ((gamebase) (owner)).view_height) {
				if (Math.random() < 0.5D) {
					star_y[i] = (int) (Math.random() * (double) ((gamebase) (owner)).view_height);
					if (hspeed > 0.0F)
						star_x[i] = ((gamebase) (owner)).screen_width;
					else
						star_x[i] = 0.0F;
				} else {
					star_x[i] = (int) (Math.random() * (double) ((gamebase) (owner)).view_width);
					if (vspeed > 0.0F)
						star_y[i] = ((gamebase) (owner)).screen_height;
					else
						star_y[i] = 0.0F;
				}
				star_z[i] = (-0.55F + (float) Math.random() * 0.35F) * ((gamebase) (owner)).view_scale;
			}
			if (star_fade[i]) {
				if (star_blinking[i]) {
					star_blinkcounter[i]++;
					if (star_blinkcounter[i] >= star_lifetime[i]) {
						star_blinkcounter[i] = star_lifetime[i];
						star_blinking[i] = false;
					}
				} else {
					star_blinkcounter[i]--;
					if (star_blinkcounter[i] <= 0) {
						star_fade[i] = false;
						star_blinkcounter[i] = 0;
						if (star_sprite_groups[i] == null)
							star_blink[i] = (int) (Math.random() * 45D) + 10;
						else
							star_blink[i] = (int) (Math.random() * 80D) + 40;
					}
				}
			} else {
				star_blinkcounter[i]++;
				if (star_blinkcounter[i] >= star_blink[i]) {
					star_blinkcounter[i] = 0;
					star_fade[i] = true;
					star_blinking[i] = true;
					star_lifetime[i] = (int) (Math.random() * 15D) + 3;
				}
			}
		}

	}

	final void draw(surface surface1) {
		for (int i = 0; i < star_number; i++)
			if (star_sprite_groups[i] == null) {
				int j;
				if (star_fade[i])
					j = C[i].I(star_blinkcounter[i], star_lifetime[i]);
				else
					j = C[i].I(0);
				surface1.I((int) star_x[i], (int) star_y[i], D[i], J[i], j);
			} else {
				sprite sprite1;
				if (star_fade[i])
					sprite1 = star_sprite_groups[i].I(0, star_blinkcounter[i], star_lifetime[i]);
				else
					sprite1 = star_sprite_groups[i].I(0, 0);
				surface1.I(sprite1, ((int) star_x[i] - sprite1.D) + sprite1.E,
						((int) star_y[i] - sprite1.F) + sprite1.G, owner);
			}

	}

	int star_number_start;
	int star_number;
	float star_x[];
	float star_y[];
	int random;
	palette C[];
	palette B[];
	int D[];
	int J[];
	boolean star_fade[];
	boolean star_blinking[];
	int star_blinkcounter[];
	int star_lifetime[];
	int star_blink[];
	float star_z[];
	sprite_group star_sprite_groups[];
	gameapp owner;
}
