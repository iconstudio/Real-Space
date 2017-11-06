package realspace;
// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.

// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   star_y

final class gameobjective {

	gameobjective() {
		I = -1;
	}

	final void I(float f, int i, int j, int k, int l) {
		I = 1;
		F = f;
		S = i;
		A = j;
		E = k;
		G = l;
	}

	final void I(int i, int j, int k, int l, int i1) {
		I = 4;
		J = i;
		S = j;
		A = k;
		E = l;
		G = i1;
	}

	final void I(float f, float f1, int i, int j) {
		I = 5;
		Z = f;
		C = f1;
		B = i;
		D = j;
	}

	int I;
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
