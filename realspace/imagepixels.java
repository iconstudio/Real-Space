package realspace;
// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.

// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   star_y

import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.PixelGrabber;

public final class imagepixels {

	public imagepixels(Image image, AppletImplements gamebase) {
		I = image.getWidth(gamebase);
		HNSM = image.getHeight(gamebase);
		Z = new int[I * HNSM];
		PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, I, HNSM, Z, 0, I);
		try {
			pixelgrabber.grabPixels();
		} catch (InterruptedException _ex) {
			System.out.println("grabPixels to get image pixels failed");
		}
		pixelgrabber = null;
	}

	final void I(int i, int j, int k, int l, imagepixels imagepixels1, int i1, int j1) {
		for (int k2 = 0; k2 < j; k2++) {
			int k1 = k + (l + k2) * I;
			int l1 = i1 + (j1 + k2) * imagepixels1.I;
			for (int l2 = 0; l2 < i; l2++) {
				int i2 = imagepixels1.Z[l1];
				int j2 = (((i2 & 0xff0000) >> 16) + ((i2 & 0xff00) >> 8) + (i2 & 0xff)) / 3;
				if (j2 > 0 && (j2 += 32) >= 248)
					j2 = 255;
				Z[k1] = (Z[k1] & 0xffffff) + (j2 << 24);
				k1++;
				l1++;
			}

		}

	}

	final Rectangle I(int i, int j, int k) {
		int l = Z[0];
		int j2 = 0x186a0;
		int k2 = 0;
		int l2 = 0x186a0;
		int i3 = 0;
		boolean flag1 = false;
		for (int j3 = 0; j3 < I && !flag1; j3++) {
			boolean flag = false;
			int i1 = j3 + i;
			int k1 = j * I + i1;
			for (int k3 = 0; k3 < k;) {
				int j1 = k3 + j;
				int l1 = Z[k1];
				int i2 = l1 & 0xff000000;
				if (Z[k1] != l && i2 != 0) {
					flag = true;
					if (i1 > k2)
						k2 = i1;
					if (i1 < j2)
						j2 = i1;
					if (j1 > i3)
						i3 = j1;
					if (j1 < l2)
						l2 = j1;
				}
				k3++;
				k1 += I;
			}

			if (!flag && j2 != 0x186a0)
				flag1 = true;
		}

		return new Rectangle(j2, l2, (k2 - j2) + 1, (i3 - l2) + 1);
	}

	final void I(int i, int j, int k, int l, int i1, int j1) {
		int l2 = Z[0];
		for (int i3 = 0; i3 < HNSM; i3++) {
			int k2 = i3 * I;
			for (int j3 = 0; j3 < I;) {
				int j2 = Z[k2];
				int k1 = (j2 & 0xff0000) >> 16;
				int l1 = (j2 & 0xff00) >> 8;
				int i2 = j2 & 0xff;
				if (k1 >= i && k1 <= j && l1 >= k && l1 <= l && i2 >= i1 && i2 <= j1)
					Z[k2] = l2;
				j3++;
				k2++;
			}

		}

	}

	int I;
	int HNSM;
	int Z[];
}
