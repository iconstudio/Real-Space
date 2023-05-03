package realspace;

class GameObject
{
	protected GameApp gameApplet;
	protected boolean isEnabled;
	protected boolean isVisible;
	protected int activeMode;

	protected GameObjectPool ownsPool;
	protected int prefabID;

	protected SpriteGroup myAtlas;
	protected Sprite mySprite;

	protected int animationIndex;
	protected int frameIndex;
	protected boolean hasAnimation;
	
	protected int timeSinceEpoch;
	protected int warpCounter;
	
	public float myX;
	public float myY;
	public float hSpeed;
	public float vSpeed;
	public float hAccel;
	public float vAccel;
	public float myFriction;
	public float myRotation;

	protected float accelFactorOnStage;
	protected boolean wouldWarpApproximately;
	protected float hRandomSpeed;
	protected float vRandomSpeed;

	protected int borderLeft;
	protected int borderBottom;
	protected int borderRight;
	protected int borderTop;

	protected GameObject myFollower;
	protected GameObject myParent;
	protected float myDestX;
	protected float myDestY;

	protected GameObjectPool myChildren;
	protected int shipGrade;
	protected int acqScores;
	private boolean wouldRenderHealthbar;

	float M;
	boolean P;
	float i;
	boolean atan;
	float z;
	float c;
	int j;
	int a;
	boolean h;
	boolean hasChildren;
	int m;
	int n;
	int o;
	int sin;
	int p;
	int q;
	boolean r;
	int sqrt;
	int t;
	boolean II;
	String ZI;
	boolean CI;
	float BI;
	int DI;
	int JI;
	int EI;
	int HI;

	public GameObject(final GameApp applet)
	{
		gameApplet = applet;

		SetActiveState(ActiveMode.Disabled);
		myChildren = null;
		ownsPool = null;
	}

	protected final void Awake(final SpriteGroup atlas, final int i1, final int j1, final int k1, final int l1, final boolean flag)
	{
		Awake(atlas, i1, j1, k1, l1, flag, null, true);
	}

	protected final void Awake(final SpriteGroup atlas, final int i1, final int j1, final int k1, final int l1, final boolean flag, final GameObject mothership, final boolean attach_flag)
	{
		activeMode = ActiveMode.Activated;
		isEnabled = true;
		isVisible = false;
		timeSinceEpoch = 0;
		warpCounter = 0;
		wouldRenderHealthbar = false;

		myAtlas = atlas;
		mySprite = null;

		borderLeft = 0;
		borderRight = 0;
		borderBottom = 0;
		borderTop = 0;

		m = j1;
		o = k1;
		n = l1;
		sin = j1;
		q = k1;
		p = l1;
		r = flag;
		sqrt = 0;
		t = 0;
		animationIndex = 0;
		frameIndex = 0;
		hasAnimation = false;
		myParent = null;
		hRandomSpeed = 0.0F;
		vRandomSpeed = 0.0F;
		P = false;
		i = 0.0F;
		z = 0.0F;
		c = 0.0F;
		hSpeed = 0.0F;
		vSpeed = 0.0F;
		DI = 1;
		EI = 3;
		acqScores = 0;
		BI = 0.0F;
		JI = i1;
		shipGrade = 0;
		prefabID = 0;
		myRotation = 0.0F;
		atan = false;
		CI = false;
		II = false;
		ZI = "";
		HI = -1;
		h = attach_flag;

		if (myChildren != null)
		{
			myChildren.I();
		}

		myFollower = mothership;
		hasChildren = false;
		if (myFollower != null && attach_flag)
		{
			myFollower.hasChildren = true;
		}
	}

	void Draw(final Canvas canvas)
	{
		if (mySprite != null && isEnabled)
		{
			if (t > 0)
			{
				if (n <= 0)
				{
					canvas.Z((int) myX + gameApplet.viewRelativeX, (int) myY + gameApplet.viewRelativeY, (mySprite.D + 10) - sqrt * 3, (mySprite.F + 10) - sqrt * 3, gameApplet.MB.Pick(sqrt, t));
				}
				else
				{
					canvas.Z((int) myX + gameApplet.viewRelativeX, (int) myY + gameApplet.viewRelativeY, mySprite.D + 10, mySprite.F + 10, gameApplet.LB.Pick(sqrt, t));
				}

				sqrt++;
				if (t <= sqrt)
				{
					t = 0;
				}
			}

			canvas.Draw(mySprite, borderLeft + gameApplet.viewRelativeX, borderBottom + gameApplet.viewRelativeY, gameApplet);

			// false
			if (wouldRenderHealthbar)
			{
				final int i1 = (Math.round(myX) - 15) + gameApplet.viewRelativeX;
				final int j1 = Math.round(myY) + mySprite.F + 5 + gameApplet.viewRelativeY;
				final float f1 = (float) (o + n) / (float) (p + q);

				gameutil.DrawGaugebar(canvas, i1, j1, 30, 10, f1, Colours.Red, Colours.Green);
			}
		}

		if (myChildren != null)
		{
			myChildren.Draw(canvas);
		}
	}

	final void Warp()
	{
		if (timeSinceEpoch < 0)
		{
			timeSinceEpoch++;
		}
		else if (j == 0)
		{
			Update();
			isVisible = true;
		}
		else
		{
			if (--warpCounter <= 0)
			{
				Update();

				isVisible = true;
				warpCounter = j;
			}
		}

		if (myChildren != null)
		{
			myChildren.Warp();
		}
	}

	void Update()
	{
		switch (DI)
		{
			case 5: // '\005'
				S();
				timeSinceEpoch++;
				return;

			case 8: // '\b'
				UpdateWithFollower2();
				return;

			case 6: // '\006'
				UpdateWithFollower1();
				timeSinceEpoch++;
				return;

			case 3: // '\003'
				UpdateWithSpeed();
				timeSinceEpoch++;
				return;

			case 4: // '\004'
				UpdateWithFriction();
				timeSinceEpoch++;
				return;

			case 2: // '\002'
				CalcCollisionBox();
				if (hasAnimation)
					animationIndex++;
				timeSinceEpoch++;
				return;

			case 7: // '\007'
			default:
				CalcCollisionBox();
				break;
		}

		if (hasAnimation)
		{
			animationIndex++;
		}

		timeSinceEpoch++;
	}

	final void UpdateWithSpeed()
	{
		myX += hSpeed;
		myY += vSpeed;

		if (hasAnimation)
		{
			animationIndex++;
		}

		CalcCollisionBox();
	}

	final void UpdateWithFriction()
	{
		final float f1 = hSpeed * myFriction;
		final float f2 = vSpeed * myFriction;
		hSpeed = hSpeed - f1;
		vSpeed = vSpeed - f2;
		myX += hSpeed;
		myY += vSpeed;

		if (hasAnimation)
		{
			animationIndex++;
		}

		CalcCollisionBox();
	}

	final void S() 
	{
		hSpeed += hAccel;
		vSpeed += vAccel;
		myX += hSpeed;
		myY += vSpeed;

		if (hasAnimation)
		{
			animationIndex++;
		}

		CalcCollisionBox();
	}

	final void UpdateWithFollower1()
	{
		if (P)
		{
			if (myParent != null && myParent.IsActivated() && myParent.isVisible)
			{
				myDestX = myParent.myX;
				myDestY = myParent.myY;
			}

			if (P)
			{
				final float f1 = (myDestX + hRandomSpeed) - myX;
				final float f2 = (myDestY + vRandomSpeed) - myY;
				final float square_dist = (float) Math.sqrt(f1 * f1 + f2 * f2);
				final float square_speed = hSpeed * hSpeed + vSpeed * vSpeed;

				if (wouldWarpApproximately)
				{
					if (square_dist < 1.0F)
					{
						// Stops and warp now
						hAccel = 0.0F;
						vAccel = 0.0F;
						hSpeed = 0.0F;
						vSpeed = 0.0F;
					}
					else
					{
						// Slide
						hAccel = (f1 / square_dist) * accelFactorOnStage;
						vAccel = (f2 / square_dist) * accelFactorOnStage;

						if (square_dist < M)
						{
							hSpeed = hSpeed * (square_dist / M);
							vSpeed = vSpeed * (square_dist / M);
						}
					}
				}
				else if (square_dist < 1.0F && square_speed < 0.04F)
				{
					hSpeed = (float) Math.random() * 2.0F - 1.0F;
					vSpeed = (float) Math.random() * 2.0F - 1.0F;
					hAccel = 0.0F;
					vAccel = 0.0F;
				}
				else if (square_dist < 0.001F)
				{
					hAccel = 0.0F;
					vAccel = 0.0F;
				}
				else
				{
					hAccel = (f1 / square_dist) * accelFactorOnStage;
					vAccel = (f2 / square_dist) * accelFactorOnStage;
				}
			}
		}

		hSpeed = (hSpeed - hSpeed * myFriction) + hAccel;
		vSpeed = (vSpeed - vSpeed * myFriction) + vAccel;
		myX += hSpeed;
		myY += vSpeed;

		if (hasAnimation)
		{
			animationIndex++;
		}

		CalcCollisionBox();
	}

	final void UpdateWithFollower2()
	{
		if (P)
		{
			if (myParent != null && myParent.IsActivated() && myParent.isVisible)
			{
				myDestX = myParent.myX;
				myDestY = myParent.myY;
			}

			if (P)
			{
				final float gap_x = (myDestX + hRandomSpeed) - myX;
				final float gap_y = (myDestY + vRandomSpeed) - myY;
				if (gap_x == 0.0F)
				{
					if (0f <= gap_y)
						i = 1.570796F;
					else
						i = 4.712389F;
				}
				else
				{
					final float f3 = gap_y / gap_x;
					i = (float) Math.atan(f3);

					if (0f <= gap_x)
					{
						if (gap_y < 0.0F)
						{
							i = 6.283185F + i;
						}
					}
					else
					{
						i = 3.141593F + i;
					}
				}

				float f4 = i - myRotation;
				if (f4 < -3.141593F)
					f4 += 6.283185F;
				else if (f4 > 3.141593F)
					f4 -= 6.283185F;
					
				if (f4 < -z)
					myRotation -= z;
				else if (f4 > z)
					myRotation += z;
				else
					myRotation += f4;

				if (myRotation < 0.0F)
					myRotation += 6.283185F;
				else if (myRotation >= 6.283185F)
					myRotation -= 6.283185F;

				frameIndex = myAtlas.GetFrameByRotation(myRotation);
				hAccel = (float) Math.cos(myRotation) * accelFactorOnStage;
				vAccel = (float) Math.sin(myRotation) * accelFactorOnStage;
			}
		}

		mySprite = myAtlas.GetSprite(frameIndex, animationIndex);
		hSpeed = (hSpeed - hSpeed * myFriction) + hAccel;
		vSpeed = (vSpeed - vSpeed * myFriction) + vAccel;
		myX += hSpeed;
		myY += vSpeed;

		if (hasAnimation)
		{
			animationIndex++;
		}

		CalcCollisionBox();

		timeSinceEpoch++;
	}

	final void UpdateWithAttacks(final GameObject target)
	{
		if (target != null && target.IsActivated())
		{
			final float gap_x = target.myX - myX;
			final float gap_y = target.myY - myY;

			if (gap_x == 0.0F)
			{
				if (gap_y >= 0.0F)
					i = 1.570796F;
				else
					i = 4.712389F;
			}
			else
			{
				final float f4 = gap_y / gap_x;
				i = (float) Math.atan(f4);

				if (gap_x >= 0.0F)
				{
					if (gap_y < 0.0F)
						i = 6.283185F + i;
				}
				else 
				{
					i = 3.141593F + i;
				}
			}
		}

		float f2 = i - myRotation;
		if (f2 < -3.1415926535897931D)
			f2 += 6.283185F;
		else if (f2 > 3.1415926535897931D)
			f2 -= 6.283185F;
		if (f2 < -z)
			myRotation -= z;
		else if (f2 > z)
			myRotation += z;
		else
			myRotation = i;
		if (myRotation < 0.0F)
		{
			for (; myRotation < 0.0F; myRotation += 6.283185F)
				;
			return;
		}

		if (myRotation >= 6.283185F)
		{
			for (; myRotation >= 6.283185F; myRotation -= 6.283185F)
			{}
		}
	}

	final void CalcCollisionBox()
	{
		if (mySprite != null)
		{
			borderLeft = ((int) (myX + 0.5F) - mySprite.D) + mySprite.E;
			borderBottom = ((int) (myY + 0.5F) - mySprite.F) + mySprite.G;
			borderRight = borderLeft + mySprite.C;
			borderTop = borderBottom + mySprite.B;
		}
	}

	final void CleanupPhysics(final float x, final float y, final boolean flag)
	{
		myX = x;
		myY = y;
		hSpeed = 0.0F;
		vSpeed = 0.0F;

		hAccel = 0.0F;
		vAccel = 0.0F;
		P = false;

		hasAnimation = flag;
		DI = 2;
	}

	final void SetupPhysics1(final float f1, final float f2, final float f3, final float f4, final float f5, final float f6, final boolean flag)
	{
		myX = f1;
		myY = f2;
		hSpeed = f3;
		vSpeed = f4;
		hAccel = f5;
		vAccel = f6;
		P = false;

		hasAnimation = flag;
		DI = 5;
	}

	final void SetupPhysics2(final float f1, final float f2, final float f3, final float f4, final boolean flag) 
	{
		myX = f1;
		myY = f2;
		hSpeed = f3;
		vSpeed = f4;

		hAccel = 0.0F;
		vAccel = 0.0F;
		P = false;

		hasAnimation = flag;
		DI = 3;
	}

	final void SetupPhysics3(final float f1, final float f2, final float f3, final float f4, final float f5, final float f6, final boolean flag)
	{
		myX = f1;
		myY = f2;
		hSpeed = f3;
		vSpeed = f4;
		M = f5;
		accelFactorOnStage = f5 * 0.08F;
		myFriction = f6;
		hAccel = 0.0F;
		vAccel = 0.0F;
		hasAnimation = flag;
		DI = 4;
	}

	final void SetupPhysics4(final float f1, final float f2, final float f3, final float f4, final float f5, final boolean flag)
	{
		myX = f1;
		myY = f2;

		final float f6 = f3 - f1;
		final float f7 = f4 - f2;
		final float f8 = (float) Math.sqrt(f6 * f6 + f7 * f7);
		if (f8 != 0.0F) {
			hSpeed = (f6 / f8) * f5;
			vSpeed = (f7 / f8) * f5;
		} else {
			hSpeed = 1.0F;
			vSpeed = 0.0F;
		}

		P = false;
		hAccel = 0.0F;
		vAccel = 0.0F;

		hasAnimation = flag;
		DI = 3;
	}

	final void SetupPhysics5(final float f1, final float f2, final GameObject oGameObject1, float f3, float f4, final float f5, final float f6, final boolean flag, final boolean flag1)
	{
		myX = f1;
		myY = f2;
		if (oGameObject1 != null) {
			f3 = oGameObject1.myX;
			f4 = oGameObject1.myY;
		}

		hRandomSpeed = 0.0F;
		vRandomSpeed = 0.0F;

		P = true;
		wouldWarpApproximately = flag;

		myParent = oGameObject1;
		myDestX = f3;
		myDestY = f4;
		final float f7 = f3 - f1;
		final float f8 = f4 - f2;
		final float f9 = (float) Math.sqrt(f7 * f7 + f8 * f8);
		if (f9 == 0.0F) {
			hSpeed = 0.0F;
			vSpeed = f5;
		} else {
			hSpeed = (f7 / f9) * f5;
			vSpeed = (f8 / f9) * f5;
		}

		hAccel = hSpeed;
		vAccel = vSpeed;
		M = f5;
		accelFactorOnStage = f5 * f6;
		myFriction = f6;

		hasAnimation = flag1;
		DI = 6;
	}

	final void SetupPhysics6(final float f1, final float f2, final GameObject follower, float f3, float f4, final float f5, final float f6, final float f7, final boolean flag)
	{
		myX = f1;
		myY = f2;
		if (follower != null) {
			f3 = follower.myX;
			f4 = follower.myY;
		}
		hRandomSpeed = 0.0F;
		vRandomSpeed = 0.0F;

		myParent = follower;
		hSpeed = (float) Math.cos(myRotation) * f5;
		vSpeed = (float) Math.sin(myRotation) * f5;
		hAccel = hSpeed;
		vAccel = vSpeed;
		M = f5;
		accelFactorOnStage = f5 * f7;
		myFriction = f7;
		P = true;
		myDestX = f3;
		myDestY = f4;
		z = myAtlas.S * f6;
		c = f6;

		hAccel = (float) Math.cos(myRotation) * f5;
		vAccel = (float) Math.sin(myRotation) * f5;

		if (!atan)
		{
			atan = true;
			final float f8 = f3 - myX;
			final float f9 = f4 - myY;
			if (f8 == 0.0F) {
				if (f9 >= 0.0F)
					myRotation = 1.570796F;
				else
					myRotation = 4.712389F;
			} else {
				final float f10 = f9 / f8;
				myRotation = (float) Math.atan(f10);
				if (f8 >= 0.0F) {
					if (f9 < 0.0F)
						myRotation = 6.283185F + myRotation;
				} else {
					myRotation = 3.141593F + myRotation;
				}
			}
		}

		animationIndex = 0;
		frameIndex = myAtlas.GetFrameByRotation(myRotation);
		mySprite = myAtlas.GetSprite(frameIndex, animationIndex);
		hasAnimation = flag;
		DI = 8;
	}

	public void Attach(final boolean attach_flag, final GameObject target)
	{
		SetActiveState(ActiveMode.Disabled);
		if (EI == 2 && !attach_flag && acqScores > 0)
			gameApplet.Z(acqScores);

		if (myChildren != null)
		{
			myChildren.Attach(attach_flag, target, -1, -1, -1, -1);
		}

		if (II)
		{
			GameQuest gameobjectivelist1;
			if (EI == 2)
				gameobjectivelist1 = gameApplet.currentMission.C;
			else
				gameobjectivelist1 = gameApplet.currentMission.I;

			if (attach_flag)
				gameobjectivelist1.E++;
			else
				gameobjectivelist1.S++;

			if (gameobjectivelist1.F != -1)
			{
				int i1 = 0;
				int j1 = 0;

				if (gameobjectivelist1.J != -1)
				{
					j1 += gameobjectivelist1.S;
					i1 += gameobjectivelist1.J;
				}

				if (gameobjectivelist1.A != -1)
				{
					j1 += gameobjectivelist1.E;
					i1 += gameobjectivelist1.A;
				}

				if (j1 >= i1)
				{
					gameApplet.currentMission.B = ZI;
					gameApplet.currentMission.ExecuteTriggers(gameobjectivelist1.F);
				}
			}
		}
	}

	public boolean CheckCollision(final GameObject other)
	{
		if (borderLeft < other.borderRight && borderRight > other.borderLeft
		&& borderBottom < other.borderTop && borderTop > other.borderBottom 
		&& atan(other))
		{
			final int i1 = other.m + other.n;
			final int j1 = m + n;
			I(i1, other);
			other.I(j1, this);

			return true;
		}
		else
		{
			return false;
		}
	}

	final boolean atan(final GameObject part)
	{
		if (mySprite == null || part.mySprite == null)
		{
			return false;
		}

		final Sprite sprite1 = mySprite;
		final Sprite sprite2 = part.mySprite;
		final int i1 = sprite1.Z;
		final int j1 = sprite2.Z;
		rlepart rlepart1 = sprite1.I[0];
		rlepart rlepart2 = sprite2.I[0];
		int k1 = borderBottom + rlepart1.Z;
		int l1 = part.borderBottom + rlepart2.Z;
		int i2 = 0;

		for (int j2 = 0; i2 < i1 && j2 < j1;)
		{
			if (k1 == l1)
			{
				final int k2 = borderLeft + rlepart1.I;
				final int l2 = k2 + rlepart1.C;
				final int i3 = part.borderLeft + rlepart2.I;
				final int j3 = i3 + rlepart2.C;
				if (k2 < j3 && l2 > i3)
					return true;

				if (k2 < i3)
				{
					if (++i2 < i1)
					{
						rlepart1 = sprite1.I[i2];
						k1 = borderBottom + rlepart1.Z;
					}
				}
				else if (++j2 < j1)
				{
					rlepart2 = sprite2.I[j2];
					l1 = part.borderBottom + rlepart2.Z;
				}
			}
			else if (k1 < l1)
			{
				if (++i2 < i1)
				{
					rlepart1 = sprite1.I[i2];
					k1 = borderBottom + rlepart1.Z;
				}
			}
			else if (++j2 < j1)
			{
				rlepart2 = sprite2.I[j2];
				l1 = part.borderBottom + rlepart2.Z;
			}
		}

		return false;
	}

	public void I(int i1, final GameObject oGameObject1)
	{
		if (IsDisabled())
		{
			return;
		}

		int j1 = 0;
		int k1 = 0;
		if (n > 0)
			if (i1 > n)
			{
				j1 = n;
				if (!r)
					n = 0;
				i1 -= n;
			} else {
				j1 = i1;
				if (!r)
					n -= i1;
				i1 = 0;
			}
		if (o > 0)
			if (i1 > o) {
				k1 = o;
				if (!r)
					o = 0;
			} else {
				k1 = i1;
				if (!r)
					o -= i1;
			}
		if (o <= 0) {
			Attach(false, oGameObject1);
			return;
		}
		if (k1 > 0 || j1 > 0)
			I(oGameObject1, k1, j1);
	}

	public void I(final GameObject oGameObject1, final int i1, final int j1)
	{
		if (j1 > 0 && p > 0)
		{
			sqrt = 0;
			t = 5 + (j1 / p) * 8;
		}
	}

	public final void Z(final float f1, final float f2, final boolean flag)
	{
		if (flag) {
			m = (int) (sin * f1);
			n = (int) (p * f2);
			o = (int) (q * f1);
		} else {
			m += (int) (sin * f1);
			n += (int) (p * f2);
			o += (int) (q * f1);
			if (m > sin)
				m = sin;
			if (n > p)
				n = p;
			if (o > q)
				o = q;
		}
		I(((GameObject) (null)), 0, 0);
	}

	public final void SetActiveState(final int active_mode)
	{
		activeMode = active_mode;
	}

	public final int GetActiveState() 
	{
		return activeMode;
	}
	
	public final boolean IsActivated()
	{
		return activeMode == ActiveMode.Activated;
	}

	public final boolean IsDisabled()
	{
		return activeMode == ActiveMode.Disabled;
	}

	final boolean IsExplicitDisabled()
	{
		return activeMode != ActiveMode.Disabled;
	}

	public final Sprite GetSprite()
	{
		return mySprite;
	}

	public final void SetSprite(final Sprite sprite)
	{
		mySprite = sprite;
	}

	final void I(final String s1)
	{
		II = true;
		ZI = s1;
	}
}
