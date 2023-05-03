package realspace;

final class GameObjectPool
{
	GameObjectPool(final GameApp applet, final int pool_size)
	{
		gameApplet = applet;

		internalList = new GameObject[pool_size];
		myCapacity = pool_size;
		mySize = 0;
	}

	final void Add(final GameObject instance)
	{
		internalList[mySize++] = instance;
	}

	final synchronized void SafeAdd(final GameObject instance)
	{
		if (mySize < myCapacity)
		{
			internalList[mySize++] = instance;
		}
	}

	final GameObject GiveLastInstanceTo(final GameObjectPool other_pool)
	{
		if (mySize <= 0 || other_pool.myCapacity <= other_pool.mySize)
			return null;

		mySize--;

		final GameObject last = internalList[mySize];
		last.isVisible = false;
		last.SetActiveState(ActiveMode.Disabled);
		last.ownsPool = this;
		internalList[mySize] = null;

		if (other_pool.mySize < other_pool.myCapacity)
		{
			other_pool.Add(last);
		}

		return last;
	}

	final void RemoveOuters(final GameObject instance)
	{
		instance.SetActiveState(ActiveMode.Disabled);
		instance.myFollower = null;
		instance.myParent = null;

		if (instance.myChildren != null)
		{
			instance.myChildren.I();
		}

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

	final void I()
	{
		while (0 < mySize)
		{
			final GameObject obj = internalList[--mySize];
			
			if (obj.myChildren != null)
			{
				obj.myChildren.I();
			}

			if (obj.ownsPool != null)
			{
				obj.ownsPool.Add(obj);

				obj.ownsPool = null;
			}
			
			internalList[mySize] = null;
		}
	}

	final boolean Attach(final boolean attach_flag, final GameObject target, final int i, final int ship_grade, final int prefab_id, final int l)
	{
		if (mySize <= 0)
		{
			return false;
		}

		for (GameObject obj : internalList)
		{
			// !IsExplicitDisabled()
			if (obj.IsActivated()
					&& (i == -1 || obj.JI == i)
					&& (ship_grade == -1 || obj.shipGrade == ship_grade)
					&& (prefab_id == -1 || obj.prefabID == prefab_id)
					&& (l == -1 || obj.HI == l))
			{
				obj.Attach(attach_flag, target);
			}
		}

		return true;
	}

	final void Warp()
	{
		for (final GameObject obj : internalList)
		{
			if (obj.IsActivated())
			{
				obj.Warp();
			}
		}
	}

	final void Draw(final Canvas surface) 
	{
		for (int i = 0; i < mySize; i++)
		{
			final GameObject instance = internalList[i];
			if (instance.IsActivated() && instance.isVisible)
			{
				instance.Draw(surface);
			}
		}
	}

	final boolean CheckCollision(final GameObjectPool other_pool)
	{
		for (final GameObject obj : internalList)
		{
			if (obj.IsActivated() && obj.isVisible
			&& obj.h && obj.BI >= 0.0001F)
			{
				if (obj.hasChildren && obj.myChildren.CheckCollision(other_pool))
				{
					return true;
				}

				for (final GameObject other_obj : other_pool.internalList)
				{
					if (other_obj.IsActivated() && other_obj.isVisible
					&& other_obj.h && other_obj.BI >= 0.0001F)
					{
						if (other_obj.hasChildren && other_obj.myChildren.CheckActivatedNow(obj))
						{
							return true;
						}

						if (obj.CheckCollision(other_obj))
						{
							return true;
						}
					}
				}
			}
		}

		return false;
	}

	final boolean CheckActivatedNow(final GameObject target)
	{
		for (GameObject obj : internalList)
		{
			if (obj.IsActivated() && obj.isVisible && obj.h)
			{
				if (obj.hasChildren && obj.myChildren.CheckActivatedNow(target))
				{
					return true;
				}

				if (target.IsActivated() && target.isVisible && target.h)
				{
					if (target.hasChildren && target.myChildren.CheckActivatedNow(obj))
					{
						return true;
					}

					if (obj.CheckCollision(target))
					{
						return true;
					}
				}
			}
		}

		return false;
	}

	final GameObject OnMouseHover(final int mx, final int my)
	{
		for (final GameObject obj : internalList)
		{
			if (obj.IsActivated()
					&& obj.isEnabled
					&& mx < obj.borderRight && mx >= obj.borderLeft
					&& my < obj.borderTop && my >= obj.borderBottom)
			{
				return obj;
			}
		}

		return null;
	}

	final void I(final float f, final float f1, final boolean flag, final int i, final int ship_grade, final int prefab_id, final int l)
	{
		for (final GameObject obj : internalList)
		{
			//if ((obj.IsActivated() || obj.GetActiveState() == ActiveMode.DisableExtent)
			if ((!obj.IsDisabled()
			&& (i == -1 || obj.JI == i)
			&& (ship_grade == -1 || obj.shipGrade == ship_grade)
			&& (prefab_id == -1 || obj.prefabID == prefab_id)
			&& (l == -1 || obj.HI == l)))
			{
				obj.Z(f, f1, flag);
			}
		}
	}

	final GameObject I(final int active_mode, final int j, final int ship_grade, final int prefab_id, final int i1, final float f)
	{
		for (final GameObject obj : internalList)
		{
			if (active_mode == -1 || obj.GetActiveState() == active_mode
			&& (j == -1 || obj.JI == j)
			&& (ship_grade == -1 || obj.shipGrade == ship_grade)
			&& (prefab_id == -1 || obj.prefabID == prefab_id)
			&& (i1 == -1 || obj.HI == i1)
			&& (f <= -1F || obj.BI >= f))
			{
				return obj;
			}
		}

		return null;
	}

	final void C()
	{
		for (final GameObject obj : internalList)
		{
			if (obj.IsDisabled())
			{
				RemoveOuters(obj);
			}
			else
			{
				if (obj.myParent != null && obj.myParent.IsDisabled())
				{
					obj.myParent = null;
					obj.P = false;

					if (obj.hAccel * obj.hAccel + obj.vAccel * obj.vAccel <= 0.02F)
					{
						obj.hAccel = 0.0F;
						obj.vAccel = -0.2F;
					}
				}
			}
		}
	}

	final void I(final float f, final int i, final int ship_grade, final int prefab_id, final int l)
	{
		for (final GameObject obj : internalList)
		{
			if (obj.IsActivated()
			&& (i == -1 || obj.JI == i)
			&& (ship_grade == -1 || obj.shipGrade == ship_grade)
			&& (prefab_id == -1 || obj.prefabID == prefab_id)
			&& (l == -1 || obj.HI == l))
			{
				obj.BI = f;
			}
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
