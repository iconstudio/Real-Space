package realspace;

import sun.audio.AudioData;
import sun.audio.AudioPlayer;
import sun.audio.ContinuousAudioDataStream;

class MusicSequence
{
	MusicSequence(final int sequence_length)
	{
		myChords = new MusicPiece[sequence_length];
		myCapacity = sequence_length;
		mySize = 0;

		isPlaying = false;
		internalStream = null;
	}

	final void Add(MusicPiece piece)
	{
		if (mySize < myCapacity)
		{
			myChords[mySize++] = piece;
		}
	}

	final void Initialize()
	{
		int estimated_size = 0;
		for (int i = 0; i < mySize; i++)
		{
			estimated_size += myChords[i].audioBufferLength;
		}

		byte full_music_buffer[] = new byte[estimated_size];

		int buffer_dest = 0;
		for (int l = 0; l < mySize; l++)
		{
			MusicPiece piece = myChords[l];
			System.arraycopy(piece.interalAudioBuffer, 0, full_music_buffer, buffer_dest, piece.audioBufferLength);
			buffer_dest += piece.audioBufferLength;
		}

		try
		{
			AudioData audiodata = new AudioData(full_music_buffer);
			internalStream = new ContinuousAudioDataStream(audiodata);
		}
		catch (Exception e)
		{
			System.out.println("ERROR: exception occured when trying to prepare music");
			internalStream = null;
		}

		// delete
		for (int j = 0; j < mySize; j++)
		{
			myChords[j] = null;
		}

		mySize = 0;
	}

	final void SetPlay(boolean play)
	{
		if (internalStream != null)
		{
			if (play)
			{
				if (!isPlaying)
				{
					AudioPlayer.player.start(internalStream);
					isPlaying = true;
					return;
				}
			}
			else 
			{
				AudioPlayer.player.stop(internalStream);
				isPlaying = false;
			}
		}
	}

	ContinuousAudioDataStream internalStream;
	MusicPiece myChords[];
	int myCapacity;
	int mySize;
	boolean isPlaying;
}
