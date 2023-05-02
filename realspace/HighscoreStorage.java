package realspace;

import java.awt.Color;

class HighscoreStorage
{
	public HighscoreStorage(final int size)
	{
		F = new String[size];
		HNSM = new String[size];
		append = new String[size];

		myCapacity = size;
		mySize = 0;
	}

	public final void I(GameApp applet, String s, Color color, Color color1, Font gamefont, int i, int j, float f, float f1, int k) {
		String s1 = s;

		for (int l = 0; l < mySize; l++)
		{
			s1 = s1 + "|" + F[l] + "   " + append[l];
		}

		GameLabel gametext1 = (GameLabel) applet.wC.GiveLastInstanceTo(applet.gameUIObjects);
		if (gametext1 != null) {
			gametext1.Draw(s1, color, gamefont, true, i, j, 500, k, 0, true);
			
			gametext1.I(i, j, f * ((AppletImplements) (applet)).viewScale,
					f1 * ((AppletImplements) (applet)).viewScale);
			
			if (color1 != null)
			{
				gametext1.B = color1;
			}
		}
	}

	String F[];
	String HNSM[];
	String append[];
	int myCapacity;
	int mySize;
}
