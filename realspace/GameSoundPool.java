package realspace;

import java.applet.AudioClip;

final class GameSoundPool
{
	public GameSoundPool(final GameApp applet, final int sfx_count)
	{
		gameApplet = applet;
		internalList = new AudioClip[sfx_count];
		audioLoops = new boolean[sfx_count];
		audioIsPlayings = new boolean[sfx_count];
		audioBeginTimings = new long[sfx_count];
		audioLateLoop = new boolean[sfx_count];
		audioFiles = new String[sfx_count];
		myCapacity = sfx_count;
		mySize = 0;

		nowPlaying = true;
	}

	final int Load(final String file_path, final boolean flag)
	{
		if (mySize < myCapacity)
		{
			audioFiles[mySize] = file_path;
			
			audioLoops[mySize] = false;
			audioIsPlayings[mySize] = false;
			audioBeginTimings[mySize] = 0L;
			audioLateLoop[mySize] = flag;

			mySize++;
			return mySize - 1;
		}
		else
		{
			return 0;
		}
	}

	final void ToggleLoop(final boolean play_flag)
	{
		nowPlaying = play_flag;
		if (play_flag)
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

	final void Play(final int sfx_index, final boolean play_flag, final boolean loop_flag)
	{
		if (sfx_index < mySize)
		{
			audioIsPlayings[sfx_index] = play_flag;
			audioLoops[sfx_index] = loop_flag;

			if (play_flag && nowPlaying)
			{
				final long current_time = System.currentTimeMillis();

				if (!audioLateLoop[sfx_index] || Math.abs(current_time - audioBeginTimings[sfx_index]) >= 200L)
				{
					if (loop_flag)
					{
						internalList[sfx_index].loop();
					}
					else
					{
						internalList[sfx_index].play();
					}

					audioBeginTimings[sfx_index] = current_time;
				}
			}
			else
			{
				internalList[sfx_index].stop();
			}
		}
	}

	final void PlayOnce(final int index)
	{
		System.out.println("load sound  getCodeBase=" + gameApplet.getCodeBase() + " url=" + audioFiles[index]);

		internalList[index] = gameApplet.getAudioClip(gameApplet.getCodeBase(), audioFiles[index]);
		internalList[index].play();
		internalList[index].stop();
	}

	GameApp gameApplet;

	AudioClip internalList[];
	boolean audioLoops[];
	boolean audioIsPlayings[];
	long audioBeginTimings[];
	boolean audioLateLoop[];
	String audioFiles[];
	int myCapacity;
	int mySize;
	boolean nowPlaying;
}
