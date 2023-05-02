package realspace;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import sun.audio.AudioStream;

class MusicPiece
{
	MusicPiece(GameApp applet, String music_provider_url)
	{
		URL url;
		try
		{
			url = new URL(applet.getCodeBase(), music_provider_url);
		}
		catch (MalformedURLException e)
		{
			System.out.println("bad url");
			return;
		}

		try 
		{
			AudioStream audiostream = new AudioStream(url.openStream());
			audioBufferLength = audiostream.getLength();
			interalAudioBuffer = new byte[audioBufferLength];

			audiostream.read(interalAudioBuffer, 0, audioBufferLength);
			audiostream.close();
			return;
		}
		catch (IOException e)
		{
			System.out.println("Failed to load sound file from " + music_provider_url);
		}
	}

	byte interalAudioBuffer[];
	int audioBufferLength;
}
