package realspace;

final class GameCamera extends GameObject
{
	public GameCamera(GameApp applet)
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
		if (GameApp.Instance.currentMission.O == 1001 && super.myFollower == null)
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
					oGameObjectlist1 = GameApp.Instance.vZ;
				else
					oGameObjectlist1 = GameApp.Instance.wZ;

				int i = oGameObjectlist1.mySize;
				if (0 < i)
				{
					int j = (int) (Math.random() * 0.99900000000000011D * i);

					I(j < 0 || j >= oGameObjectlist1.mySize ? null : oGameObjectlist1.internalList[j], true, 30F, 0.02F);
				}

				HNSM = -1;
			}
		}

		if (super.myFollower != null)
		{
			if (super.myFollower.activeMode != 1)
			{
				super.myFollower = null;
				super.P = false;

				CleanupPhysics(super.myX, super.myY, super.hasAnimation);
			}
			else if (!super.myFollower.isVisible || !super.myFollower.isEnabled)
			{
				super.Update();
			}
			else if (wouldResetStarfield)
			{
				super.myX = super.myFollower.myX;
				super.myY = super.myFollower.myY;
				super.hSpeed = super.myFollower.hSpeed;
				super.vSpeed = super.myFollower.vSpeed;
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

		GameApp.Instance.WC = (int) (-super.myX) + (GameApp.Instance).viewWidth / 2;
		GameApp.Instance.XC = (int) (-super.myY) + (GameApp.Instance).viewHeight / 2;
	}

	final void I(float f, float f1, final boolean reset_starfield, float f2, float f3) {
		wouldResetStarfield = reset_starfield;
		super.myFollower = null;

		if (reset_starfield)
		{
			CleanupPhysics(f, f1, false);
			if (GameApp.Instance.gameStarfield != null)
			{
				GameApp.Instance.gameStarfield.initialize();
			}
		}
		else
		{
			SetupPhysics5(super.myX, super.myY, null, f, f1, f2, f3, true, false);
		}

		GameApp.Instance.WC = (int) (-super.myX) + (GameApp.Instance).viewWidth / 2;
		GameApp.Instance.XC = (int) (-super.myY) + (GameApp.Instance).viewHeight / 2;
	}

	final void I(GameObject oGameObject1, final boolean reset_starfield, float f, float f1) {
		wouldResetStarfield = reset_starfield;
		super.myFollower = oGameObject1;

		if (wouldResetStarfield)
		{
			float f2 = super.myFollower.myX - super.myX;
			float f3 = super.myFollower.myY - super.myY;
			super.myX = super.myFollower.myX;
			super.myY = super.myFollower.myY;
			super.hSpeed = 0.0F;
			super.vSpeed = 0.0F;

			if (f2 * f2 + f3 * f3 > 16F && GameApp.Instance.gameStarfield != null)
			{
				GameApp.Instance.gameStarfield.initialize();
			}
		}
		else
		{
			SetupPhysics5(super.myX, super.myY, oGameObject1, 0.0F, 0.0F, f, f1, true, false);
		}
		GameApp.Instance.WC = (int) (-super.myX) + (GameApp.Instance).viewWidth / 2;
		GameApp.Instance.XC = (int) (-super.myY) + (GameApp.Instance).viewHeight / 2;
	}

	final boolean A()
	{
		if (!super.P)
		{
			return true;
		}

		float f = super.myX - super.myDestX;
		float f1 = super.myY - super.myDestY;

		return f * f + f1 * f1 < 2.0F;
	}

	boolean wouldResetStarfield;
	int HNSM;
}
