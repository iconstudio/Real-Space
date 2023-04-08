package realspace;

final class gameutil {
	static final void DrawGaugebar(Canvas surface1, int i, int j, int k, int l, float f, int color_from, int color_to) 
	{
		int k1 = (int) (k * f);
		int l1 = color_blend(color_from, color_to, f);
		int i2 = (l + 1) / 2;
		int j2 = color_blend(0, l1, 0.35F);

		for (int l2 = 0; l2 < i2; l2++) 
		{
			int k2 = color_blend(j2, l1, l2 / (i2 - 2.0F));
			surface1.I(i, j + l2, k1, 1, k2);
			surface1.I(i, (j + l) - 1 - l2, k1, 1, k2);
		}

	}

	static final int color_blend(int color1, int color2, float f) {
		if (f > 1.0F)
			f = 1.0F;
		int k = (int) (f * 255F);
		int l = 255 - k;
		int j1 = (color1 >> 16 & 0xff) * l;
		int l1 = (color1 >> 8 & 0xff) * l;
		int j2 = (color1 & 0xff) * l;
		int i1 = (color2 >> 16 & 0xff) * k;
		int k1 = (color2 >> 8 & 0xff) * k;
		int i2 = (color2 & 0xff) * k;
		int k2 = 0xff000000 + ((i1 + j1 >> 8) << 16) + ((k1 + l1 >> 8) << 8) + (i2 + j2 >> 8);
		return k2;
	}

	static final float I(float f, float f1, float f2, float f3, float f4, float f5, float f6) {
		float f7 = f3 - f;
		float f8 = f4 - f1;
		float f9 = (f5 * f5 + f6 * f6) - f2 * f2;
		float f10 = 2.0F * f7 * f5 + 2.0F * f8 * f6;
		float f11 = f7 * f7 + f8 * f8;
		float f12 = f10 * f10 - 4F * f9 * f11;
		if (f12 < 0.0F)
			return -1F;
		f12 = (float) Math.sqrt(f12);
		if (f9 == 0.0F)
			return -1F;
		if (f12 < 0.0F)
			return -1F;
		float f13 = (f10 - f12) / (2.0F * f9);
		float f14 = (f10 + f12) / (2.0F * f9);
		if (f13 < 0.0F)
			if (f14 < 0.0F)
				return -1F;
			else
				return f14 * 0.8F;
		if (f14 < 0.0F)
			return f13 * 0.8F;
		if (f13 < f14)
			return f13 * 0.8F;
		else
			return f14 * 0.8F;
	}

	gameutil() {
	}
}
