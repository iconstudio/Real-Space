package realspace;

final class GameCamera extends GameObject
{
	public GameCamera(final GameApp applet)
	{
		super(applet);
	}

	protected final void Awake()
	{
		super.Awake(null, 11, 0, 0, 0, true);

		I(0.0F, 0.0F, true, 0.0F, 0.0F);
		HNSM = -1;
	}

	@Override
	final void Update()
	{
		if (gameApplet.currentMission.usingTriggersCount == 1001 && myParent == null)
		{
			if (HNSM == -1)
			{
				HNSM = 50;
			}
			else if (0 < HNSM)
			{
				HNSM--;
			}
			else
			{
				GameObjectPool oGameObjectlist1;
				if (Math.random() < 0.5D)
					oGameObjectlist1 = gameApplet.vZ;
				else
					oGameObjectlist1 = gameApplet.wZ;

				final int i = oGameObjectlist1.mySize;
				if (0 < i)
				{
					final int j = (int) (Math.random() * 0.99900000000000011D * i);

					I(j < 0 || j >= oGameObjectlist1.mySize ? null : oGameObjectlist1.internalList[j], true, 30F, 0.02F);
				}

				HNSM = -1;
			}
		}

		if (myParent != null)
		{
			if (myParent.IsDisabled())
			{
				myParent = null;
				super.P = false;

				CleanupPhysics(myX, myY, super.hasAnimation);
			}
			else if (!myParent.isVisible || !myParent.isEnabled)
			{
				super.Update();
			}
			else if (wouldResetStarfield)
			{
				myX = myParent.myX;
				myY = myParent.myY;
				hSpeed = myParent.hSpeed;
				vSpeed = myParent.vSpeed;
			}
			else
			{
				UpdateWithFollower1();
			}
		}
		else
		{
			super.Update();
		}

		gameApplet.viewRelativeX = (int) (-myX) + gameApplet.viewWidth / 2;
		gameApplet.viewRelativeY = (int) (-myY) + gameApplet.viewHeight / 2;
	}

	final void I(final float f, final float f1, final boolean reset_starfield, final float f2, final float f3) {
		wouldResetStarfield = reset_starfield;
		myParent = null;

		if (reset_starfield)
		{
			CleanupPhysics(f, f1, false);
			if (gameApplet.gameStarfield != null)
			{
				gameApplet.gameStarfield.initialize();
			}
		}
		else
		{
			SetupPhysics5(myX, myY, null, f, f1, f2, f3, true, false);
		}

		gameApplet.viewRelativeX = (int) (-myX) + gameApplet.viewWidth / 2;
		gameApplet.viewRelativeY = (int) (-myY) + gameApplet.viewHeight / 2;
	}

	final void I(final GameObject oGameObject1, final boolean reset_starfield, final float f, final float f1)
	{
		wouldResetStarfield = reset_starfield;
		myParent = oGameObject1;

		if (wouldResetStarfield)
		{
			final float f2 = myParent.myX - myX;
			final float f3 = myParent.myY - myY;
			myX = myParent.myX;
			myY = myParent.myY;
			hSpeed = 0.0F;
			vSpeed = 0.0F;

			if (f2 * f2 + f3 * f3 > 16F && gameApplet.gameStarfield != null)
			{
				gameApplet.gameStarfield.initialize();
			}
		}
		else
		{
			SetupPhysics5(myX, myY, oGameObject1, 0.0F, 0.0F, f, f1, true, false);
		}
		gameApplet.viewRelativeX = (int) (-myX) + gameApplet.viewWidth / 2;
		gameApplet.viewRelativeY = (int) (-myY) + gameApplet.viewHeight / 2;
	}

	final boolean A()
	{
		if (!super.P)
		{
			return true;
		}

		final float f = myX - super.myDestX;
		final float f1 = myY - super.myDestY;

		return f * f + f1 * f1 < 2.0F;
	}

	boolean wouldResetStarfield;
	int HNSM;
}
