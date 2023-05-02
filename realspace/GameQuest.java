package realspace;

import java.awt.Rectangle;

final class GameQuest
{
	GameQuest(GameApp applet, int i, final int objectives_count)
	{
		gameApplet = applet;

		myObjectives = new GameObjective[objectives_count];
		objectivesCount = objectives_count;
		for (int k = 0; k < objectives_count; k++)
		{
			myObjectives[k] = new GameObjective();
		}

		height = i;
		if (i == 2)
			max = 1;
		else
			max = 2;

		D = new GameObjectPool(applet, 5);
		U = new int[20];
		V = new int[20];
		W = new float[20];
		P = new Rectangle[10];
		for (int l = 0; l < 10; l++)
		{
			P[l] = new Rectangle();
		}

		I();
	}

	final void I()
	{
		Z = 0;
		C = 0;
		D.I();
		F = -1;
		J = -1;
		S = 0;
		A = -1;
		E = 0;
		wasResetStarfield = false;
		H = true;
		random = -1;
		K = 1.0F;
		L = -1;
		M = 0;
		T = 0;
		R = 0;
		Q = 0;
	}

	final void Z() {
		if (M > 0) {
			L--;
			if (L == 0) {
				HNSM(Math.max(1, (int) Math.round(O - Math.random())));
				L = (int) (Math.random() * N) + M;
			}
		}
		if (random >= 0) {
			random--;
			if (random <= 0) {
				int i = 0;
				if (height == 2) {
					GameObjectPool oGameObjectlist1 = gameApplet.wZ;
					int l = oGameObjectlist1.mySize;
					for (int j = 0; j < l && (width == -1 || i < width); j++) {
						GameObjectPool oGameObjectlist2 = gameApplet.wZ;
						oSpaceship oSpaceship1 = (oSpaceship) (j < 0 || j >= oGameObjectlist2.mySize ? null
								: oGameObjectlist2.internalList[j]);
						if (((GameObject) (oSpaceship1)).activeMode == 1 && oSpaceship1.QI != round && oSpaceship1.QI != 1) {
							i++;
							oSpaceship1.QI = round;
						}
					}

				} else {
					GameObjectPool oGameObjectlist3 = gameApplet.vZ;
					int i1 = oGameObjectlist3.mySize;
					for (int k = 0; k < i1 && (width == -1 || i < width); k++) {
						GameObjectPool oGameObjectlist4 = gameApplet.vZ;
						oSpaceship oSpaceship2 = (oSpaceship) (k < 0 || k >= oGameObjectlist4.mySize ? null
								: oGameObjectlist4.internalList[k]);
						if (((GameObject) (oSpaceship2)).activeMode == 1 && oSpaceship2.QI != round && oSpaceship2.QI != 1) {
							i++;
							oSpaceship2.QI = round;
						}
					}

				}
				if (i == 0)
					random = -1;
				else
					random = x + (int) (Math.random() * y);
			}
		}

		for (boolean processing_objectives = true; processing_objectives && C < Z;) 
		{
			GameObjective quest_objective = myObjectives[C];
			processing_objectives = false;

			switch (quest_objective.myCategory)
			{
			case 1: // '\001'
				if (height == 2)
				{
					gameApplet.vZ.I(quest_objective.F, quest_objective.S, quest_objective.A, quest_objective.E, quest_objective.G);
					gameApplet.EC.I(quest_objective.F, quest_objective.S, quest_objective.A, quest_objective.E, quest_objective.G);
				}
				else
				{
					gameApplet.wZ.I(quest_objective.F, quest_objective.S, quest_objective.A, quest_objective.E, quest_objective.G);
					gameApplet.GC.I(quest_objective.F, quest_objective.S, quest_objective.A, quest_objective.E, quest_objective.G);
				}

				if (quest_objective.G == 101)
					gameApplet.dZ.I(quest_objective.F, -1, -1, -1, -1);
				processing_objectives = true;
				break;

			case 4: // '\004'
				if (height == 2)
				{
					if (gameApplet.vZ.I(quest_objective.J, quest_objective.S, quest_objective.A, quest_objective.E,
							quest_objective.G, 0.0001F) == null
							&& gameApplet.EC.I(quest_objective.J, quest_objective.S, quest_objective.A, quest_objective.E,
									quest_objective.G, 0.0001F) == null)
						processing_objectives = true;
				}
				else if (gameApplet.wZ.I(quest_objective.J, quest_objective.S, quest_objective.A, quest_objective.E,
						quest_objective.G, 0.0001F) == null
						&& gameApplet.GC.I(quest_objective.J, quest_objective.S, quest_objective.A, quest_objective.E,
								quest_objective.G, 0.0001F) == null)
				{
					processing_objectives = true;
				}
				break;

			case 2: // '\002'
				processing_objectives = true;
				break;

			case 3: // '\003'
				quest_objective.K++;
				if (quest_objective.K >= quest_objective.H)
					processing_objectives = true;
				break;

			case 5: // '\005'
				oWaypoint oWaypoint1 = (oWaypoint) gameApplet.SC.GiveLastInstanceTo(D);

				if (oWaypoint1 != null)
				{
					oWaypoint1.I(quest_objective.B, quest_objective.D);
					oWaypoint1.isVisible = true;
					oWaypoint1.CleanupPhysics(quest_objective.Z, quest_objective.C, false);
				}

				processing_objectives = true;
				break;

			case 6: // '\006'
				gameApplet.currentMission.I(quest_objective.L);
				return;
			}

			if (processing_objectives)
			{
				C++;
			}
		}
	}

	final void I(float f, int i, int j, int k, int l)
	{
		if (Z < objectivesCount) 
		{
			myObjectives[Z].I(f, i, j, k, l);
			Z++;
		}
	}

	final void I(int i, int j, int k, int l, int i1)
	{
		if (Z < objectivesCount)
		{
			myObjectives[Z].I(i, j, k, l, i1);
			Z++;
		}
	}

	final void I(float f, float f1, int i, int j)
	{
		if (Z < objectivesCount)
		{
			myObjectives[Z].I(f, f1, i, j);
			Z++;
		}
	}

	final void I(int i, int j, int k, int l)
	{
		random = 2;
		round = i;
		width = j;
		x = k;
		y = l;
	}

	final void Z(int i, int j, int k, int l) {
		if (Q < 10) {
			P[Q].x = i;
			P[Q].y = j;
			P[Q].width = k;
			P[Q].height = l;
			Q++;
		}
	}

	final void I(int i, int j, float f) {
		if (R < 20) {
			T += i;
			U[R] = i;
			V[R] = j;
			W[R] = f;
			R++;
		}
	}

	final void I(int i, int j, int k) {
		L = 1;
		M = i;
		N = j;
		O = k;
	}

	final void HNSM(int i) {
		int j = (int) (Math.random() * T);
		for (int l = 0; l < R; l++) {
			if (j <= U[l]) {
				float f;
				float f1;
				if (Q == 0) {
					int i1 = (int) (Math.random() * 4D);
					switch (i1) {
					case 0: // '\0'
						f = gameApplet.YC;
						f1 = gameApplet.zC + (int) (Math.random() * gameApplet.worldDimension[1]);
						break;

					case 1: // '\001'
						f = gameApplet.iC;
						f1 = gameApplet.zC + (int) (Math.random() * gameApplet.worldDimension[1]);
						break;

					case 2: // '\002'
						f = gameApplet.YC + (int) (Math.random() * gameApplet.worldDimension[0]);
						f1 = gameApplet.cC;
						break;

					default:
						f = gameApplet.YC + (int) (Math.random() * gameApplet.worldDimension[0]);
						f1 = gameApplet.zC;
						break;
					}
				} else {
					int j1 = (int) (Math.random() * Q * 0.99998998641967773D);
					Rectangle rectangle = P[j1];
					f = (float) (rectangle.x + Math.random() * rectangle.width);
					f1 = (float) (rectangle.y + Math.random() * rectangle.height);
				}
				oSpaceship oSpaceship1;
				if (height == 2)
					oSpaceship1 = (oSpaceship) gameApplet.xZ.GiveLastInstanceTo(gameApplet.wZ);
				else
					oSpaceship1 = (oSpaceship) gameApplet.xZ.GiveLastInstanceTo(gameApplet.vZ);
				if (oSpaceship1 == null)
					return;
				oSpaceship1.I(V[l], height, gameApplet.currentMission.I(1.0F, 0.05F) * gameApplet.viewScale);
				oSpaceship1.QI = 3;
				if (wasResetStarfield) {
					oSpaceship1.II = true;
					oSpaceship1.ZI = "";
				}
				oSpaceship1.CI = H;
				if (K >= 0.0F)
					oSpaceship1.BI = K;
				oSpaceship1.SetupPhysics6(f, f1, null, f + 1.0F, f1 + 1.0F, W[l] * gameApplet.viewScale, 1.0F, 0.15F,
						true);
				oSpaceship1.E();
				Explosion explosion1 = (Explosion) gameApplet.rZ.GiveLastInstanceTo(gameApplet.qZ);
				if (explosion1 != null)
					explosion1.I(gameApplet.sprite_group_ship, 1, (int) f, (int) f1, 0.0F, 0.0F, 1, 2, 0, false);
				oSpaceship1.timeSinceEpoch = -20;
				float f2 = ((GameObject) (oSpaceship1)).myDestX;
				float f3 = ((GameObject) (oSpaceship1)).myDestY;
				for (int k1 = 1; k1 < i; k1++) {
					oSpaceship oSpaceship2;
					if (height == 2)
						oSpaceship2 = (oSpaceship) gameApplet.xZ.GiveLastInstanceTo(gameApplet.wZ);
					else
						oSpaceship2 = (oSpaceship) gameApplet.xZ.GiveLastInstanceTo(gameApplet.vZ);
					if (oSpaceship2 != null) {
						oSpaceship2.I(V[l], height, gameApplet.currentMission.I(1.0F, 0.2F) * gameApplet.viewScale);
						oSpaceship2.QI = 3;
						if (wasResetStarfield) {
							oSpaceship2.II = true;
							oSpaceship2.ZI = "";
						}
						oSpaceship2.CI = H;
						if (K >= 0.0F)
							oSpaceship2.BI = K;
						oSpaceship2.SetupPhysics6(f, f1, null, f2, f3, W[l] * gameApplet.viewScale, 1.0F, 0.15F, true);
						int k = oSpaceship2.timeSinceEpoch = -k1 * 20;
						Explosion explosion2 = (Explosion) gameApplet.rZ.GiveLastInstanceTo(gameApplet.qZ);
						if (explosion2 != null) {
							explosion2.I(gameApplet.sprite_group_ship, 1, (int) f, (int) f1, 0.0F, 0.0F, 1, 2, 0, false);
							explosion2.timeSinceEpoch = -k;
						}
						oSpaceship2.timeSinceEpoch = k - 20;
					}
				}

				return;
			}
			j -= U[l];
		}

	}

	GameApp gameApplet;
	GameObjective myObjectives[];
	int Z;
	int C;
	int objectivesCount;
	int height;
	int max;
	GameObjectPool D;
	int F;
	int J;
	int S;
	int A;
	int E;
	boolean wasResetStarfield;
	boolean H;
	float K;
	int random;
	int round;
	int width;
	int x;
	int y;
	int L;
	int M;
	int N;
	int O;
	Rectangle P[];
	int Q;
	int R;
	int T;
	int U[];
	int V[];
	float W[];
}
