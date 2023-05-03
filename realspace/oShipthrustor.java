package realspace;

final class oShipthrustor
{
	oShipthrustor(final GameApp applet)
	{
		gameApplet = applet;
		HNSM = new float[25];
		cos = new float[25];
		sin = new float[25];
		sqrt = new float[25];
		I = new int[25];

		D = new float[5];
		J = new float[5];

		E = null;
	}

	final void I(final int i, final int j, final int k, final float f, final SpriteGroup atlas)
	{
		E = atlas;
		H = i;
		K = j;
		M = f;
		B = k;
		I();
		G = true;
	}

	final void I()
	{
		Z = 0;
		S = 0;
		A = 0;
		L = 0;
		G = false;
	}

	final void I(final float f, final float f1)
	{
		if (G && S < 5)
		{
			D[S] = f;
			J[S] = f1;
			S++;
		}
	}

	final void I(final oSpaceship owner) {
		if (S > 0) {
			for (int i = 0; i < Z; i++) {
				HNSM[i] += sin[i];
				cos[i] += sqrt[i];
				sin[i] = sin[i] * 0.7F;
				sqrt[i] = sqrt[i] * 0.7F;
				I[i]++;
				if (I[i] >= B) {
					int k = i + 1;
					for (int l = i; k < Z; l++) {
						HNSM[l] = HNSM[k];
						cos[l] = cos[k];
						sin[l] = sin[k];
						sqrt[l] = sqrt[k];
						I[l] = I[k];
						k++;
					}

					Z--;
				}
			}

			if (owner.QI == 3 || owner.QI == 4)
			{
				L++;
				if (L % K == 0 && Z < 25)
				{
					float f = (owner.hAccel * owner.hAccel + owner.vAccel * owner.vAccel) * M;

					if (f > 0.01F)
					{
						final float f1 = ((float) owner.frameIndex / (float) owner.myAtlas.xCapacity)
								* 6.283185F;

						final float f2 = (float) Math.cos(f1);
						final float f3 = (float) Math.sin(f1);
						for (int j = 0; j < H && Z < 25; j++)
						{
							f = (float) Math.sqrt(f);

							final float f4 = D[A];
							final float f5 = J[A];
							HNSM[Z] = (owner.myX + owner.mySprite.E + f4 * f2)
									- f5 * f3;
							cos[Z] = owner.myY + owner.mySprite.G + f4 * f3
									+ f5 * f2;

							sin[Z] = owner.hSpeed - f2 * f;
							sqrt[Z] = owner.vSpeed - f3 * f;
							I[Z] = 0;
							Z++;

							A = (A + 1) % S;
						}
					}
				}
			}
		}
	}

	final void I(final Canvas canvas)
	{
		if (S > 0)
		{
			if (E == null)
			{
				for (int k = 0; k < Z; k++)
				{
					final int i = mask.Pick(I[k], B);
					canvas.I((int) HNSM[k] + gameApplet.viewRelativeX, (int) cos[k] + gameApplet.viewRelativeY, 3, 3, i);
				}

				return;
			}
			for (int l = 0; l < Z; l++)
			{
				final int j = (E.spriteFrames[0] * I[l]) / B;

				if (j < E.spriteFrames[0])
				{
					final Sprite sprite1 = E.GetSprite(0, j);

					canvas.Draw(sprite1, ((int) HNSM[l] - sprite1.D) + gameApplet.viewRelativeX, ((int) cos[l] - sprite1.F) + gameApplet.viewRelativeY, gameApplet);
				}
			}

		}
	}

	GameApp gameApplet;
	float HNSM[];
	float cos[];
	float sin[];
	float sqrt[];
	int I[];
	int Z;
	Palette mask;
	int B;
	float D[];
	float J[];
	int S;
	int A;
	SpriteGroup E;
	boolean G;
	int H;
	int K;
	int L;
	float M;
}
