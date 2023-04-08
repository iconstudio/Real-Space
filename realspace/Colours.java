package realspace;

import java.awt.Color;

final class Colours 
{
	static final int White = Color.white.getRGB();
	static final int LightGray = Color.gray.brighter().getRGB();
	static final int Gray = Color.gray.getRGB();
	static final int DarkGray = Color.gray.darker().getRGB();
	static final int PaleRed = Color.red.brighter().getRGB();
	static final int Red = Color.red.getRGB();
	static final int Maroon = Color.red.darker().darker().getRGB();
	static final int Lime = Color.green.brighter().getRGB();
	static final int Green = Color.green.getRGB();
	static final int DarkGreen = Color.green.darker().getRGB();
	static final int LightBlue = Color.blue.brighter().brighter().getRGB();
	static final int Blue = Color.blue.getRGB();
	static final int Navy = Color.blue.darker().getRGB();
	static final int Lemon = Color.yellow.brighter().getRGB();
	static final int Yellow = Color.yellow.getRGB();
	static final int DarkYellow = Color.yellow.darker().darker().getRGB();
}
