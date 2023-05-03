package realspace;

import java.awt.Color;

final class oPowerup extends GameObject
{
	public oPowerup(final GameApp applet)
	{
		super(applet);
	}

	final void Awake(final int item_type)
	{
		SpriteGroup atlas = null;
		switch (item_type)
		{
			case 1: // '\001'
				atlas = GameApp.Instance.iI;
				break;

			case 2: // '\002'
				atlas = GameApp.Instance.zI;
				break;

			case 3: // '\003'
				atlas = GameApp.Instance.cI;
				break;

			case 4: // '\004'
				atlas = GameApp.Instance.bI;
				break;

			case 5: // '\005'
				atlas = GameApp.Instance.dI;
				break;
		}

		Awake(atlas, 11, 0, 0, 0, true);
		acqScores = 500;

		myType = item_type;
	}

	@Override
	final void Update()
	{
		timeSinceEpoch++;
		if (500 <= timeSinceEpoch)
		{
			Attach(true, null);
			return;
		}

		mySprite = myAtlas.GetSprite(frameIndex, timeSinceEpoch >> 2);
		UpdateWithSpeed();

		if (super.myX < GameApp.Instance.viewBorderLeft)
		{
			super.myX = GameApp.Instance.viewBorderLeft;
			super.hSpeed = Math.abs(super.hSpeed);
			CalcCollisionBox();
		}
		else if (super.myX > GameApp.Instance.viewBorderRight)
		{
			super.myX = GameApp.Instance.viewBorderRight;
			super.hSpeed = -Math.abs(super.hSpeed);
			CalcCollisionBox();
		}

		if (super.myY < GameApp.Instance.viewBorderTop) {
			super.myY = GameApp.Instance.viewBorderTop;
			super.vSpeed = Math.abs(super.vSpeed);
			CalcCollisionBox();
		}
		else if (super.myY > GameApp.Instance.viewBorderBottom)
		{
			super.myY = GameApp.Instance.viewBorderBottom;
			super.vSpeed = -Math.abs(super.vSpeed);
			CalcCollisionBox();
		}
	}

	@Override
	public final void Attach(final boolean equip_flag, final GameObject self) {
		if (!equip_flag && self != null)
		{
			String message = "";

			switch (myType)
			{
				case 1: // '\001'
					final GameObjectPool oGameObjectlist1 = GameApp.Instance.dZ;
					oGameObjectlist1.I(0.35F, 0.35F, false, -1, -1, -1, -1);
					message = "Sheild Boost";
					break;

				case 2: // '\002'
					GameApp.Instance.kZ += 20;
					GameApp.Instance.kZ = Math.min(GameApp.Instance.kZ, 200);
					message = "Beam Weapon";
					break;

				case 3: // '\003'
					GameApp.Instance.lZ += 20;
					GameApp.Instance.lZ = Math.min(GameApp.Instance.lZ, 200);
					message = "Bolt Weapon";
					break;

				case 4: // '\004'
					GameApp.Instance.mZ += 20;
					GameApp.Instance.mZ = Math.min(GameApp.Instance.mZ, 200);
					message = "Rockets";
					break;

				case 5: // '\005'
					GameApp.Instance.eZ = 1;
					GameApp.Instance.gZ = 500;
					message = "Double Fire";
					break;
			}

			GameApp.Instance.everySFXs.Play(GameApp.Instance.bZ, true, false);

			final GameLabel label = (GameLabel) GameApp.Instance.wC.GiveLastInstanceTo(GameApp.Instance.gameUIObjects);

			if (label != null)
			{
				label.Draw(message, Color.white, GameApp.Instance.fontTiny, false, (int) super.myX, (int) super.myY, 0, 45, 0, true);

				label.ApplyColours(GameApp.Instance.GZ, null);
			}
		}

		super.Attach(equip_flag, self);
	}

	int myType;
}
