package realspace;
// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.

// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   star_y

import java.awt.Color;

final class explosion extends oGameObject {

	explosion(gameapp gameapp1) {
		super(gameapp1);
		lightGray = new float[40];
		max = new float[40];
		min = new float[40];
		random = new float[40];
	}

	final void I(sprite_group sprite_group1, int i, float f, float f1, float f2, float f3, int j, int k, int l,
			boolean flag) {
		super.initialize(sprite_group1, 3, l, 0, 0, true);
		I(f, f1, f2 * 0.66F, f3 * 0.66F, true);
		F = null;
		super.ship_grade = i;
		HNSM = k;
		super.j = j;
		hashCode = false;
		D = 0;
		Z = 0;
		I = 0;
		HNSM = 1;
		if (i == 2 || i == 3) {
			Z = 10 + l / 5;
			D = Math.min(D + 15 + (int) (l * 0.20000000000000001D), 40);
			if (super.owner.QC == 2)
				D = D / 2;
			else if (super.owner.QC == 3)
				D = 0;
			for (int i1 = 0; i1 < D; i1++) {
				min[i1] = (float) ((Math.random() - 0.5D) * (l * 0.050000000000000003D + 8D));
				random[i1] = (float) ((Math.random() - 0.5D) * (l * 0.050000000000000003D + 8D));
				lightGray[i1] = f + min[i1] * 5F;
				max[i1] = f1 + random[i1] * 5F;
			}

			C = (float) (l * 0.20000000000000001D + 10D);
			B = C;
			if (flag) {
				int j1 = super.m / 2;
				HNSM(j1, super.owner.vZ);
				HNSM(j1, super.owner.wZ);
				HNSM(j1, super.owner.yZ);
				super.m = 0;
			}
		}
		if (i == 3 || i == 1) {
			hashCode = true;
			HNSM = k;
			if (HNSM <= 0)
				HNSM = 1;
			I = super.x.I[super.d] * HNSM;
		}
		super.a = Math.max(I, Z);
	}

	@Override
	final void I() {
		super.s++;
		if (super.s >= super.a) {
			equip(true, null);
			return;
		}
		if (super.s < Z) {
			for (int i = 0; i < D; i++) {
				lightGray[i] += min[i] + super.K;
				max[i] += random[i] + super.L;
			}

		}
		if (hashCode && super.s < I)
			super.y = super.x.I(super.d, super.s / HNSM);
		C();
	}

	@Override
	final void I(surface surface1) {
		if (super.w) {
			if (hashCode && super.s < I)
				super.I(surface1);
			if (super.s < Z && D > 0) {
				int i;
				if (F != null)
					i = F.I(super.s, super.a);
				else
					i = Color.lightGray.hashCode();
				for (int j = 0; j < D; j++)
					surface1.I((int) lightGray[j] + ((gamebase) (super.owner)).WC,
							(int) max[j] + ((gamebase) (super.owner)).XC, 3, 3, i);

			}
		}
	}

	@Override
	final void I(int i, oGameObject oGameObject1) {
		if (super.m > 0) {
			if (i > super.m) {
				super.m = 0;
				return;
			}
			super.m -= i;
		}
	}

	final void HNSM(int i, oGameObjectlist oGameObjectlist1) {
		int j1 = i * i;
		if (i <= 0)
			return;
		for (int k1 = 0; k1 < oGameObjectlist1.C; k1++) {
			oGameObject oGameObject1 = oGameObjectlist1.Z[k1];
			if (oGameObject1.e == 1 && oGameObject1.v && oGameObject1.h && oGameObject1.BI >= 0.0001F) {
				if (oGameObject1.l)
					HNSM(i, oGameObject1.k);
				int j = (int) (super.J - oGameObject1.J);
				int k = (int) (super.S - oGameObject1.S);
				int l = j * j + k * k;
				if (l < j1) {
					int i1 = ((super.m + super.n) * (i - l)) / i;
					if (i1 > 0)
						oGameObject1.I(i1, this);
				}
			}
		}

	}

	int HNSM;
	int I;
	int Z;
	boolean hashCode;
	float lightGray[];
	float max[];
	float min[];
	float random[];
	float C;
	float B;
	int D;
	palette F;
}
