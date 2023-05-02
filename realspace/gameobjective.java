package realspace;

final class GameObjective
{
	GameObjective()
	{
		myCategory = -1;
	}

	final void I(float f, int i, int j, int k, int l)
	{
		myCategory = 1;
		F = f;
		S = i;
		A = j;
		E = k;
		G = l;
	}

	final void I(int i, int j, int k, int l, int i1)
	{
		myCategory = 4;
		J = i;
		S = j;
		A = k;
		E = l;
		G = i1;
	}

	final void I(float f, float f1, int i, int j)
	{
		myCategory = 5;
		Z = f;
		C = f1;
		B = i;
		D = j;
	}

	int myCategory;
	float Z;
	float C;
	int B;
	int D;
	float F;
	int J;
	int S;
	int A;
	int E;
	int G;
	int H;
	int K;
	int L;
}
