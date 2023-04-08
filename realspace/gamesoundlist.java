package realspace;
// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.

// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   star_y

import java.applet.AudioClip;

final class gamesoundlist {

	gamesoundlist(GameApp gameapp, int i) {
		HNSM = gameapp;
		abs = new AudioClip[i];
		append = new boolean[i];
		currentTimeMillis = new boolean[i];
		getCodeBase = new long[i];
		loop = new boolean[i];
		out = new String[i];
		getAudioClip = i;
		number = 0;
		play = true;
	}

	final int sound_add(String s, boolean flag) {
		if (number < getAudioClip) {
			out[number] = s;
			append[number] = false;
			currentTimeMillis[number] = false;
			getCodeBase[number] = 0L;
			loop[number] = flag;
			number++;
			HNSM.nC++;
			return number - 1;
		} else {
			return 0;
		}
	}

	final void I(boolean flag) {
		play = flag;
		if (flag) {
			for (int i = 0; i < number; i++)
				if (currentTimeMillis[i] && append[i])
					abs[i].loop();

			return;
		}
		for (int j = 0; j < number; j++)
			abs[j].stop();

	}

	final void I(int index, boolean flag, boolean flag1) {
		if (index < number) {
			currentTimeMillis[index] = flag;
			append[index] = flag1;
			if (flag && play) {
				long l = System.currentTimeMillis();
				if (!loop[index] || Math.abs(l - getCodeBase[index]) >= 200L) {
					if (flag1)
						abs[index].loop();
					else
						abs[index].play();
					getCodeBase[index] = l;
				}
				return;
			}
			if (!flag || !play)
				abs[index].stop();
		}
	}

	final void I(int index) {
		System.out.println("load sound  getCodeBase=" + HNSM.getCodeBase() + " url=" + out[index]);
		abs[index] = HNSM.getAudioClip(HNSM.getCodeBase(), out[index]);
		abs[index].play();
		abs[index].stop();
	}

	GameApp HNSM;
	AudioClip abs[];
	boolean append[];
	boolean currentTimeMillis[];
	int number;
	int getAudioClip;
	long getCodeBase[];
	boolean loop[];
	String out[];
	boolean play;
}
