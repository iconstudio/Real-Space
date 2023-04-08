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
	final void I() {
		if (GameApp.Instance.currentMission.O == 1001 && super.Q == null)
			if (HNSM == -1)
				HNSM = 50;
			else if (HNSM > 0) {
				HNSM--;
			} else {
				GameObjectPool oGameObjectlist1;
				if (Math.random() < 0.5D)
					oGameObjectlist1 = GameApp.Instance.vZ;
				else
					oGameObjectlist1 = GameApp.Instance.wZ;
				int i = oGameObjectlist1.mySize;
				if (i > 0) {
					int j = (int) (Math.random() * 0.99900000000000011D * i);
					I(j < 0 || j >= oGameObjectlist1.mySize ? null : oGameObjectlist1.internalList[j], true, 30F,
							0.02F);
				}
				HNSM = -1;
			}
		if (super.Q != null) {
			if (super.Q.e != 1) {
				super.Q = null;
				super.P = false;
				I(super.J, super.S, super.f);
			} else if (!super.Q.v || !super.Q.w)
				super.I();
			else if (F) {
				super.J = super.Q.J;
				super.S = super.Q.S;
				super.K = super.Q.K;
				super.L = super.Q.L;
			} else {
				B();
			}
		} else {
			super.I();
		}
		GameApp.Instance.WC = (int) (-super.J) + (GameApp.Instance).viewWidth / 2;
		GameApp.Instance.XC = (int) (-super.S) + (GameApp.Instance).viewHeight / 2;
	}

	final void I(float f, float f1, boolean flag, float f2, float f3) {
		F = flag;
		super.Q = null;
		if (flag) {
			I(f, f1, false);
			if (GameApp.Instance.Starfield != null)
				GameApp.Instance.Starfield.initialize();
		} else {
			I(super.J, super.S, null, f, f1, f2, f3, true, false);
		}
		GameApp.Instance.WC = (int) (-super.J) + (GameApp.Instance).viewWidth / 2;
		GameApp.Instance.XC = (int) (-super.S) + (GameApp.Instance).viewHeight / 2;
	}

	final void I(GameObject oGameObject1, boolean flag, float f, float f1) {
		F = flag;
		super.Q = oGameObject1;
		if (F) {
			float f2 = super.Q.J - super.J;
			float f3 = super.Q.S - super.S;
			super.J = super.Q.J;
			super.S = super.Q.S;
			super.K = 0.0F;
			super.L = 0.0F;
			if (f2 * f2 + f3 * f3 > 16F && GameApp.Instance.Starfield != null)
				GameApp.Instance.Starfield.initialize();
		} else {
			I(super.J, super.S, oGameObject1, 0.0F, 0.0F, f, f1, true, false);
		}
		GameApp.Instance.WC = (int) (-super.J) + (GameApp.Instance).viewWidth / 2;
		GameApp.Instance.XC = (int) (-super.S) + (GameApp.Instance).viewHeight / 2;
	}

	final boolean A() {
		if (!super.P)
			return true;
		float f = super.J - super.R;
		float f1 = super.S - super.T;
		return f * f + f1 * f1 < 2.0F;
	}

	boolean F;
	int HNSM;
}
