package realspace;

final class SpriteGroup
{
	public SpriteGroup(final GameApp gameapp, final int vertical) 
	{
		Initialize(gameapp, 1, vertical);
	}

	public SpriteGroup(final GameApp gameapp, final int horizontal, final int vertical)
	{
		Initialize(gameapp, horizontal, vertical);
	}

	private void Initialize(final GameApp gameapp, final int horizontal, final int vertical)
	{
		gameApplet = gameapp;

		internalList = new Sprite[horizontal][vertical];
		spriteFrames = new int[horizontal];
		for (int k = 0; k < horizontal; k++)
		{
			spriteFrames[k] = 0;
		}

		xCapacity = horizontal;
		yCapacity = vertical;

		C = 0;
		B = 0;
		J = false;
		S = 6.283185F / horizontal;
		A = S * 0.5F;
	}

	final Sprite GetSprite(final int i, final int j) {
		int k, l;
		try
		{
			k = i % xCapacity;
			l = j % spriteFrames[k];
		}
		catch (final Exception _ex)
		{
			k = 0;
			l = 0;
		}

		return internalList[k][l];
	}

	final int GetFrameByRotation(final float rotation)
	{
		int index;
		if (J)
		{
			index = Math.round(((rotation - 3.141593F / (xCapacity * 2)) / (float) Math.PI) * xCapacity);
		}
		else
		{
			index = Math.max((int) ((rotation - A) / S + 0.5F), 0);
		}

		return index % xCapacity;
	}

	final Sprite I(final int i, final int j, final int k)
	{
		final int l = i % xCapacity;

		int i1 = (j * spriteFrames[l]) / k;
		if (i1 >= spriteFrames[l])
		{
			i1 = spriteFrames[l] - 1;
		}

		return internalList[l][i1];
	}

	final void I(final int i, final Sprite sprite1)
	{
		final int j = spriteFrames[i];

		if (j < yCapacity)
		{
			internalList[i][j] = sprite1;
			if (sprite1.C > C)
			{
				C = sprite1.C;
				D = sprite1.C;
			}

			if (sprite1.B > B)
			{
				B = sprite1.B;
				F = sprite1.B;
			}

			spriteFrames[i] = j + 1;
		}
	}

	final void I(final float f, final int i, final int j, final int k, final int l, final int i1, final int j1, final int k1, final Bitmap imagepixels, final int l1, final int i2, final int j2, final Canvas surface)
	{
		for (int k2 = i2; k2 < j2; k2++)
		{
			final Sprite sprite1 = Sprite.I(f, (float) ((6.2831853071795862D / l1) * k2), i, j, k, l, i1, j1, k1, imagepixels, surface, gameApplet);

			if (sprite1 != null)
			{
				I(k2, sprite1);
			}
		}

	}

	final void I(final int i, final float f, final int j, final int k, final int l, final int i1, final int j1, final int k1, final int l1, final Bitmap imagepixels, final int i2, final int j2, final int k2, final Canvas surface)
	{
		for (int l2 = j2; l2 < k2; l2++)
		{
			final Sprite sprite1 = Sprite.I(f, (float) ((6.2831853071795862D / i2) * l2), j, k, l, i1, j1, k1, l1, imagepixels, surface, gameApplet);
			if (sprite1 != null)
			{
				I(i, sprite1);
			}
		}
	}

	GameApp gameApplet;
	private Sprite internalList[][];
	int spriteFrames[];
	int yCapacity;
	int xCapacity;

	int C;
	int B;
	float D;
	float F;
	boolean J;
	float S;
	float A;
}
