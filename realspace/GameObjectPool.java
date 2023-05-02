package realspace;

import java.util.Enumeration;

final class GameObjectPool
{
	GameObjectPool(GameApp applet, final int pool_size)
	{
		gameApplet = applet;

		internalList = new GameObject[pool_size];
		myCapacity = pool_size;
		mySize = 0;
	}

	final void Add(GameObject instance)
	{
		internalList[mySize++] = instance;
	}

	final synchronized void SafeAdd(GameObject instance)
	{
		if (mySize < myCapacity)
		{
			internalList[mySize++] = instance;
		}
	}

	final GameObject GiveLastInstanceTo(GameObjectPool other_pool)
	{
		if (mySize <= 0 || other_pool.myCapacity <= other_pool.mySize)
			return null;

		mySize--;

		GameObject last = internalList[mySize];
		last.isVisible = false;
		last.activeMode = 2;
		last.ownsPool = this;
		internalList[mySize] = null;

		if (other_pool.mySize < other_pool.myCapacity)
		{
			other_pool.Add(last);
		}

		return last;
	}

	final void RemoveOuters(GameObject instance)
	{
		instance.activeMode = 2;
		if (instance.g != null)
			instance.g = null;
		if (instance.myFollower != null)
			instance.myFollower = null;
		if (instance.myWeapons != null)
			instance.myWeapons.I();

		for (int i = 0; i < mySize; i++)
		{
			if (instance == internalList[i])
			{
				if (instance.ownsPool != null)
				{
					instance.ownsPool.SafeAdd(instance);

					instance.ownsPool = null;
				}

				mySize--;
				for (int j = i; j < mySize; j++)
				{
					internalList[j] = internalList[j + 1];
				}

				internalList[mySize] = null;
				return;
			}
		}
	}

	final void I() {
		while (mySize > 0) {
			mySize--;
			GameObject oGameObject1 = internalList[mySize];
			if (oGameObject1.myWeapons != null)
				oGameObject1.myWeapons.I();
			if (oGameObject1.ownsPool != null) {
				GameObjectPool oGameObjectlist1 = oGameObject1.ownsPool;
				if (oGameObjectlist1.mySize < oGameObjectlist1.myCapacity) {
					oGameObjectlist1.internalList[oGameObjectlist1.mySize] = oGameObject1;
					oGameObjectlist1.mySize++;
				}
				oGameObject1.ownsPool = null;
			}
			internalList[mySize] = null;
		}
	}

	final boolean I(final boolean flag, GameObject oGameObject1, int i, int j, int k, int l)
	{
		if (mySize <= 0)
		{
			return false;
		}

		for (int i1 = 0; i1 < mySize; i1++)
		{
			GameObject oGameObject2 = internalList[i1];
			
			if (oGameObject2.activeMode != 2 && (i == -1 || oGameObject2.JI == i) && (j == -1 || oGameObject2.shipGrade == j) && (k == -1 || oGameObject2.AI == k) && (l == -1 || oGameObject2.HI == l))
			{
				oGameObject2.Equip(flag, oGameObject1);
			}
		}

		return true;
	}

	final void Warp()
	{
		for (GameObject obj : internalList)
		{
			if (obj.activeMode == 1)
			{
				obj.Warp();
			}
		}
	}

	final void Draw(Canvas surface) 
	{
		for (int i = 0; i < mySize; i++)
		{
			GameObject instance = internalList[i];
			if (instance.activeMode == 1 && instance.isVisible)
			{
				instance.Draw(surface);
			}
		}
	}

	final boolean Z(GameObjectPool other_pool)
	{
		for (int i = 0; i < mySize; i++)
		{
			GameObject oGameObject1 = internalList[i];

			if (oGameObject1.activeMode == 1 && oGameObject1.isVisible && oGameObject1.h && oGameObject1.BI >= 0.0001F)
			{
				if (oGameObject1.l && oGameObject1.myWeapons.Z(other_pool))
					return true;

				for (int j = 0; j < other_pool.mySize; j++)
				{
					GameObject oGameObject2 = other_pool.internalList[j];

					if (oGameObject2.activeMode == 1 && oGameObject2.isVisible && oGameObject2.h && oGameObject2.BI >= 0.0001F)
					{
						if (oGameObject2.l && oGameObject2.myWeapons.CheckActivatedNow(oGameObject1))
							return true;

						if (oGameObject1.CheckCollision(oGameObject2))
							return true;
					}
				}
			}
		}

		return false;
	}

	final boolean CheckActivatedNow(final GameObject target)
	{
		for (int i = 0; i < mySize; i++)
		{
			GameObject obj = internalList[i];

			if (obj.activeMode == 1 && obj.isVisible && obj.h)
			{
				if (obj.l && obj.myWeapons.CheckActivatedNow(target))
					return true;

				if (target.activeMode == 1 && target.isVisible && target.h)
				{
					if (target.l && target.myWeapons.CheckActivatedNow(obj))
						return true;

					if (obj.CheckCollision(target))
						return true;
				}
			}
		}

		return false;
	}

	final GameObject OnMouseHover(final int mx, final int my)
	{
		for (GameObject obj : internalList)
		{
			if (obj.activeMode == 1
					&& obj.isEnabled
					&& mx < obj.borderRight && mx >= obj.borderLeft
					&& my < obj.borderTop && my >= obj.borderBottom)
			{
				return obj;
			}
		}
		return null;
	}

	final void I(float f, float f1, boolean flag, int i, int j, int k, int l) {
		int i1 = mySize;
		for (int j1 = 0; j1 < i1; j1++) {
			GameObject oGameObject1 = internalList[j1];
			if ((oGameObject1.activeMode == 1 || oGameObject1.activeMode == 3) && (i == -1 || oGameObject1.JI == i)
					&& (j == -1 || oGameObject1.shipGrade == j) && (k == -1 || oGameObject1.AI == k)
					&& (l == -1 || oGameObject1.HI == l))
				oGameObject1.Z(f, f1, flag);
		}

	}

	final GameObject I(int i, int j, int k, int l, int i1, float f) {
		int j1 = mySize;
		for (int k1 = 0; k1 < j1; k1++) {
			GameObject oGameObject1 = internalList[k1];
			if (i == -1 || oGameObject1.activeMode == i && (j == -1 || oGameObject1.JI == j)
					&& (k == -1 || oGameObject1.shipGrade == k) && (l == -1 || oGameObject1.AI == l)
					&& (i1 == -1 || oGameObject1.HI == i1) && (f <= -1F || oGameObject1.BI >= f))
				return oGameObject1;
		}

		return null;
	}

	final void C() {
		for (int i = 0; i < mySize;)
		{
			GameObject oGameObject1 = internalList[i];
			if (oGameObject1.activeMode == 2)
			{
				RemoveOuters(oGameObject1);
			}
			else
			{
				if (oGameObject1.myFollower != null && oGameObject1.myFollower.activeMode != 1) {
					oGameObject1.myFollower = null;
					oGameObject1.P = false;
					if (oGameObject1.hAccel * oGameObject1.hAccel + oGameObject1.vAccel * oGameObject1.vAccel <= 0.02F) {
						oGameObject1.hAccel = 0.0F;
						oGameObject1.vAccel = -0.2F;
					}
				}
				i++;
			}
		}

	}

	final void I(float f, int i, int j, int k, int l)
	{
		int i1 = mySize;
		for (int j1 = 0; j1 < i1; j1++) {
			GameObject oGameObject1 = internalList[j1];
			if (oGameObject1.activeMode == 1 && (i == -1 || oGameObject1.JI == i) && (j == -1 || oGameObject1.shipGrade == j)
					&& (k == -1 || oGameObject1.AI == k) && (l == -1 || oGameObject1.HI == l))
				oGameObject1.BI = f;
		}

	}

	public int GetSize()
	{
		return mySize;
	}

	GameApp gameApplet;
	GameObject internalList[];
	int myCapacity;
	int mySize;
}
