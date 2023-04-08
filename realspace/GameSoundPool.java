package realspace;

import java.applet.AudioClip;

final class GameSoundPool
{
	GameSoundPool(GameApp gameapp, int i)
	{
		HNSM = gameapp;
		internalList = new AudioClip[i];
		audioLoops = new boolean[i];
		audioIsPlayings = new boolean[i];
		audioBeginTimings = new long[i];
		audioLateLoop = new boolean[i];
		out = new String[i];
		getAudioClip = i;
		mySize = 0;
		isPlaying = true;
	}

	final int sound_add(String file_path, boolean flag)
	{
		if (mySize < getAudioClip)
		{
			out[mySize] = file_path;
			
			audioLoops[mySize] = false;
			audioIsPlayings[mySize] = false;
			audioBeginTimings[mySize] = 0L;

			audioLateLoop[mySize] = flag;
			mySize++;
			HNSM.nC++;
			return mySize - 1;
		}
		else
		{
			return 0;
		}
	}

	final void I(final boolean plays)
	{
		isPlaying = plays;
		if (plays)
		{
			for (int i = 0; i < mySize; i++)
			{
				if (audioIsPlayings[i] && audioLoops[i])
				{
					internalList[i].loop();
				}
			}

			return;
		}

		for (int j = 0; j < mySize; j++)
		{
			internalList[j].stop();
		}
	}

	final void I(final int index, final boolean playing, final boolean looping)
	{
		if (index < mySize)
		{
			audioIsPlayings[index] = playing;
			audioLoops[index] = looping;

			if (playing && isPlaying)
			{
				final long current_time = System.currentTimeMillis();

				if (!audioLateLoop[index] || Math.abs(current_time - audioBeginTimings[index]) >= 200L)
				{
					if (looping)
					{
						internalList[index].loop();
					}
					else
					{
						internalList[index].play();
					}

					audioBeginTimings[index] = current_time;
				}
			}
			else
			{
				internalList[index].stop();
			}
		}
	}

	final void PlayOnceAt(final int index)
	{
		System.out.println("load sound  getCodeBase=" + HNSM.getCodeBase() + " url=" + out[index]);

		internalList[index] = HNSM.getAudioClip(HNSM.getCodeBase(), out[index]);
		internalList[index].play();
		internalList[index].stop();
	}

	GameApp HNSM;
	AudioClip internalList[];
	int mySize;

	boolean audioLoops[];
	boolean audioIsPlayings[];
	long audioBeginTimings[];
	boolean audioLateLoop[];

	int getAudioClip;
	String out[];
	boolean isPlaying;
}
