package realspace;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.MediaTracker;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.io.IOException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.net.SocketException;
import java.net.URLEncoder;

public abstract class AppletImplements extends Applet implements Runnable 
{
	private static final long serialVersionUID = 3482431680115256438L;

	Thread appletRoutine;
	String appletName;
	String labelTitle;
	String labelLoading;
	String labelPause;
	String labelURL;
	String labelURLSuffix;
	String labelSimpleURL;

	final Color defaultLabelColour = Color.yellow;

	boolean isPaused;
	int inputKeys[] = { 32, 32, 32, 32 };
	String lastInputString = "";
	boolean isGuest;
	String serializedIsGuest;
	HighscoreDialogue highscoreDialgueHandle;
	boolean isHiscoreEnabled;
	String highscoreHost;
	String highscoreCGIProvider;
	int sizeOfHighScore;
	HighscoreStorage TB;
	HighscoreStorage UB;

	boolean isAssetsLoaded;
	protected int loadProgress;
	protected final int loadMaxProgress = 112;
	protected boolean toggleAudio;

	float viewScale;
	int viewWidth;
	int viewHeight;
	float screen_width;
	float screen_height;
	
	float worldBorderLeft;
	float worldBorderRight;
	float worldBorderTop;
	float worldBorderBottom;
	float worldDimension[];

	int viewRelativeX;
	int viewRelativeY;
	int YC;
	int iC;
	int zC;
	int cC;
	Font fontTiny;
	Font fontSmall;
	Font fontNormal;
	Font fontLarge;
	Canvas applicationCanvas;
	Canvas mC;
	int spritesNumber;

	int encode;
	int equals;
	int err;
	boolean isAudioMuted;
	boolean qC;
	int rC;
	boolean tC;
	String uC;
	GameObjectPool gameUIObjects;
	GameObjectPool wC;
	GameObjectPool floatValue;
	// Vector flush;
	int xC;
	int yC;
	long getDefaultToolkit;
	long getDocumentBase;
	boolean showDebugInfos;
	long getImage;
	long getOutputStream;
	int getParameter;
	long getParent;
	long IB;
	long indexOf;
	long isAlive;
	boolean isMusicOn;
	Palette LB;
	Palette MB;
	String NB;

	public AppletImplements() 
	{
		xC = 25;
		yC = 1000 / xC;

		sizeOfHighScore = 50;
		showDebugInfos = false;
	}

	@Override
	public void init() 
	{
		System.out.println("Game Is Initializing...");

		labelPause = "Game Paused";
		labelTitle = "Untitled";
		isAssetsLoaded = false;
		isPaused = false;

		toggleAudio = true;
		isMusicOn = true;
		spritesNumber = 0;

		encode = -1;
		equals = 0;
		err = 0;
		isAudioMuted = true;
		qC = false;

		String applet_parameter;

		// PAINT_ACTOR, OSB_PAINT_SURFACE, PAINT_SURFACE, OTHER Supported
		applet_parameter = getParameter("ACTOR_PAINT_MODE");
		if (applet_parameter == null) 
		{
			applet_parameter = "ACTOR_PAINT_MODE";
		}
		System.out.println("Parameter ACTOR_PAINT_MODE=" + applet_parameter);

		// JDK 1.0, 1.1 Supported
		applet_parameter = getParameter("JDK_VERSION");
		if (applet_parameter == null) 
		{
			applet_parameter = "1.0";
		}
		System.out.println("Parameter JDK_VERSION=" + applet_parameter);

		applet_parameter = getParameter("SIZE_SCALE");
		if (applet_parameter == null) 
		{
			applet_parameter = "1.0";
			viewScale = 1f;
		} 
		else
		{
			viewScale = Float.valueOf(applet_parameter).floatValue();
		}
		System.out.println("Parameter SIZE_SCALE=" + applet_parameter);

		labelURLSuffix = getParameter("MOREURL");
		if (labelURLSuffix == null)
		{
			labelURLSuffix = "";
		}

		labelSimpleURL = getParameter("WEB_TITLE");
		if (labelSimpleURL == null)
		{
			labelSimpleURL = "ArcadeTown.com";
		}

		labelURL = getParameter("WEB_URL");
		if (labelURL == null)
		{
			labelURL = "http://www.arcadetown.com/index.asp";
		}

		Dimension dimension = new Dimension();
		dimension = getSize();

		viewWidth = dimension.width;
		viewHeight = dimension.height;
		screen_width = viewWidth;
		screen_height = viewHeight;

		InitializeWorldDimensions(0.0F, screen_width, 0.0F, screen_height);
		append();

		// flush = new Vector();
		gameUIObjects = new GameObjectPool((GameApp) this, 10);
		floatValue = new GameObjectPool((GameApp) this, 1);
		wC = new GameObjectPool((GameApp) this, 11);

		// Allocate 11 labels
		for (int j = 0; j < wC.myCapacity; j++) 
		{
			GameLabel gametext1 = new GameLabel((GameApp) this);

			wC.SafeAdd(gametext1);
		}

		LB = new Palette(4);
		Palette palette1 = LB;
		Color color = Color.gray.brighter();
		int k = color.getRGB();

		if (palette1.GetSize() < palette1.GetCapacity())
		{
			palette1.AddColor(k);
		}
		palette1 = LB;

		color = Color.gray;
		k = color.getRGB();
		if (palette1.GetSize() < palette1.GetCapacity())
		{
			palette1.AddColor(k);
		}
		palette1 = LB;

		color = Color.gray.darker();
		k = color.getRGB();
		if (palette1.GetSize() < palette1.GetCapacity())
		{
			palette1.AddColor(k);
		}
		palette1 = LB;
		color = Color.gray.darker().darker();
		k = color.getRGB();
		if (palette1.GetSize() < palette1.GetCapacity())
		{
			palette1.AddColor(k);
		}
		MB = new Palette(4);
		palette1 = MB;
		color = Color.gray;
		k = color.getRGB();
		if (palette1.GetSize() < palette1.GetCapacity())
		{
			palette1.AddColor(k);
		}
		palette1 = MB;
		color = Color.gray.darker();
		k = color.getRGB();
		if (palette1.GetSize() < palette1.GetCapacity())
		{
			palette1.AddColor(k);
		}
		palette1 = MB;
		color = Color.gray.brighter();
		k = color.getRGB();
		if (palette1.GetSize() < palette1.GetCapacity())
		{
			palette1.AddColor(k);
		}
		palette1 = MB;
		color = Color.gray.darker().darker();
		k = color.getRGB();
		if (palette1.GetSize() < palette1.GetCapacity())
		{
			palette1.AddColor(k);
		}

		// Integer
		NB = getParameter("PLAYERID");
		System.out.println("Parameter PLAYERID=" + NB);

		// '0' or '1'
		serializedIsGuest = getParameter("ISGUEST");
		if (serializedIsGuest == null)

		System.out.println("Parameter ISGUEST=" + serializedIsGuest);

		highscoreCGIProvider = getParameter("HISCORE_CGIURL");
		highscoreHost = getParameter("HISCORE_HOST");

		if (highscoreCGIProvider != null) {
			isHiscoreEnabled = true;

			Container container = getParent();
			do
			{
				container = container.getParent();
			}
			while (!(container instanceof Frame));

			highscoreDialgueHandle = new HighscoreDialogue((GameApp) this, (Frame) container);

			TB = new HighscoreStorage(sizeOfHighScore);
			UB = new HighscoreStorage(sizeOfHighScore);

			System.out.println("- high scores enabled");
			System.out.println("Parameter HISCORE_CGIURL=" + highscoreCGIProvider);
			System.out.println("Parameter HISCORE_HOST=" + highscoreHost);
		} else {
			isHiscoreEnabled = false;
			System.out.println("high scores disabled");
		}
		requestFocus();
	}

	@Override
	public final void start() 
	{
		if (appletRoutine == null) 
		{
			appletRoutine = new Thread(this);
			appletRoutine.start();
		}
	}

	@Override
	@SuppressWarnings("deprecation")
	public final void stop() 
	{
		System.out.println("at stop");
		isMusicOn = false;

		if (appletRoutine != null && appletRoutine.isAlive()) 
		{
			appletRoutine.stop();
			appletRoutine = null;
		}
	}

	@Override
	public final void destroy() 
	{
		System.out.println("[Applet] Cleanup");
		Cleanup();
	}

	@Override
	public final void run() {
		String s = String.valueOf(getCodeBase());
		String s1 = String.valueOf(getDocumentBase());
		if (s.toUpperCase().indexOf("BRIAN") < 0
				&& (s.toUpperCase().indexOf("FREEWEBGAMES.COM") < 0 || s1.toUpperCase().indexOf("FREEWEBGAMES.COM") < 0)
				&& s.toUpperCase().indexOf("ALTOP1100") < 0
				&& (s.toUpperCase().indexOf("ARCADETOWN.COM") < 0 || s1.toUpperCase().indexOf("ARCADETOWN.COM") < 0)) 
		{
			labelSimpleURL = "ArcadeTown.com";
			labelURL = "http://www.arcadetown.com/index.asp";
		}

		if (!LoadAssets()) 
		{
			return;
		}

		InitializeSettings(true);
		int i = xC / 2;
		getDefaultToolkit = yC / 2;
		getDocumentBase = yC / 2;

		final long time_epoch = System.currentTimeMillis();
		long l3 = (time_epoch + 500L) - 10L;
		long l4 = (time_epoch + 1000L) - 10L;
		long l5 = 0L;

		indexOf = 0L;
		getOutputStream = 0L;
		getParent = 0L;
		IB = 0L;
		getImage = 0L;
		getParameter = 0;

		Graphics gdc = getGraphics();
		do 
		{
			do 
			{
				long current_time = System.currentTimeMillis();
				if (current_time >= l4) 
				{
					isAlive = l5;
					l4 = (current_time + 1000L) - 10L;
					l5 = 0L;
				}

				l5++;
				if (current_time >= l3) 
				{
					indexOf = getParent;
					getOutputStream = getImage;
					getParent = 0L;
					getImage = 0L;
					long l2 = current_time;
					l3 = (l2 + 500L) - 10L;
					if (!isPaused)
					{
						if (indexOf >= i + 1)
						{
							if (indexOf >= i + 2)
							{
								if (getDocumentBase > getDefaultToolkit)
									getDefaultToolkit += 2L;
								else
									getDocumentBase += 2L;
							}
							else if (getDocumentBase > getDefaultToolkit)
							{
								getDefaultToolkit++;
							}
							else
							{
								getDocumentBase++;
							}

							if (getDefaultToolkit > yC)
							{
								getDefaultToolkit = yC;
							}
						}
						else if (indexOf <= xC - 1)
						{
							if (indexOf <= i - 2)
							{
								if (getDocumentBase < getDefaultToolkit)
									getDefaultToolkit -= 2L;
								else
									getDocumentBase -= 2L;
							}
							else if (getDocumentBase < getDefaultToolkit)
								getDefaultToolkit--;
							else
								getDocumentBase--;

							int j = 5;
							if (getDefaultToolkit < j)
							{
								getDefaultToolkit = j;
							}
						}
					}
				}
				if (getParameter <= 2)
				{
					if (!isPaused)
						I();

					getParameter++;
					paint(gdc);
				}
			} while (getDefaultToolkit <= 0L);

			try
			{
				if ((getParent & 1L) == 1L)
					Thread.sleep(getDefaultToolkit);
				else
					Thread.sleep(getDocumentBase);
			}
			catch (Exception _ex)
			{
			}
		} while (true);
	}

	@Override
	public final void update(Graphics g) 
	{
		paint(g);
	}

	@Override
	public final void paint(Graphics g) 
	{
		RenderScene(applicationCanvas);
		applicationCanvas.I();
		
		g.drawImage(applicationCanvas.gameFrameBuffer, 0, 0, applicationCanvas.hSize, applicationCanvas.vSize, null);
		Toolkit.getDefaultToolkit().sync();
		getImage++;
		getParameter--;
	}

	public void RenderScene(Canvas surface) 
	{
		if (!isAssetsLoaded) 
		{
			int dx = viewWidth / 8;
			int dy = viewHeight / 4;

			surface.I(dx - 4, dy - 4, (viewWidth * 3) / 4 + 8, viewHeight / 2 + 8, Color.gray.getRGB());
			surface.I(dx, dy, (viewWidth * 3) / 4, viewHeight / 2, Color.darkGray.brighter().getRGB());

			dx += (int) (20F * viewScale);
			dy += (int) (30F * viewScale);

			if (labelLoading != null && fontNormal != null)
			{
				surface.DrawLabel(labelSimpleURL, Color.red.getRGB(), fontSmall, dx - 1, dy + 1);
				surface.DrawLabel(labelSimpleURL, Color.yellow.getRGB(), fontSmall, dx, dy);

				Font gamefont3 = fontSmall;
				dy += gamefont3.myHeight;

				surface.DrawLabel(labelTitle, Color.red.getRGB(), fontSmall, dx - 1, dy + 1);
				surface.DrawLabel(labelTitle, Color.yellow.getRGB(), fontSmall, dx, dy);

				gamefont3 = fontSmall;
				dy += gamefont3.myHeight + (int) (25F * viewScale);
				surface.DrawLabel(labelLoading, Color.blue.getRGB(), fontSmall, dx - 1, dy + 1);
				surface.DrawLabel(labelLoading, Color.white.getRGB(), fontSmall, dx, dy);
				gamefont3 = fontSmall;

				dy += gamefont3.myHeight + (int) (10F * viewScale);
			}

			// Drawing a loading bar
			if (0 < loadProgress)
			{
				final int gx = (viewHeight / 4 + viewHeight / 2) - (int) (60F * viewScale);
				final int gy = (viewWidth * 3) / 4 - 60;

				final float current_progress = (float) loadProgress / (float) loadMaxProgress;

				gameutil.DrawGaugebar(surface, dx, gx, gy, 30, current_progress, Colours.DarkYellow, Colours.Lime);
			}
			return;
		}

		gameUIObjects.Draw(surface);
		floatValue.Draw(surface);

		if (isPaused) {
			final int dx = viewWidth / 2 - fontNormal.I(labelPause) / 2;
			final int dy = viewHeight / 2 - fontNormal.myHeight / 2;

			surface.DrawLabel(labelPause, -1, fontNormal, dx, dy);
		}

		if (showDebugInfos) {
			String s1 = " FPS:" + String.valueOf(isAlive) + " Sleep:" + String.valueOf(getDefaultToolkit) + ", "
					+ String.valueOf(getDocumentBase);
			Font gamefont2 = fontSmall;

			surface.DrawLabel(s1, -1, gamefont2, 200, 50);
		}
	}

	public void I()
	{
		gameUIObjects.Warp();
		floatValue.Warp();
		gameUIObjects.C();
		floatValue.C();
		
		getParent++;
		IB++;
	}

	final Bitmap LoadSprite(String img_path) 
	{
		System.out.println("loadImage " + img_path + " totalMemory=" + String.valueOf(Runtime.getRuntime().totalMemory())
				+ " freeMemory=" + String.valueOf(Runtime.getRuntime().freeMemory()));
		
		java.awt.Image image = getImage(getCodeBase(), img_path);
		MediaTracker mediatracker = new MediaTracker(this);
		mediatracker.addImage(image, spritesNumber);
		
		try 
		{
			mediatracker.waitForAll();
			spritesNumber++;
		} 
		catch (Exception _ex) 
		{
			labelLoading = "Error loading image " + img_path;
			repaint();

			System.out.println(labelLoading);
			return null;
		}

		if (mediatracker.isErrorID(0) || image == null) 
		{
			labelLoading = "Error loading image " + img_path;
			repaint();

			System.out.println(labelLoading);
			return null;
		} 
		else 
		{
			Bitmap bitmap = new Bitmap(image, this);
			mediatracker.removeImage(image);
			image = null;
			mediatracker = null;
			System.gc();

			return bitmap;
		}
	}

	public abstract boolean LoadAssets();

	public synchronized void InitializeSettings(boolean flag) 
	{
		isAudioMuted = flag;
		qC = false;
		rC = 0;
		tC = false;
		uC = "Score: " + String.valueOf(rC);
	}

	final void Z(int i) 
	{
		if (!tC && !isAudioMuted && qC) 
		{
			rC += i;
			uC = "Score: " + String.valueOf(rC);
		}
	}

	@Override
	public boolean keyDown(Event event, int keycode) 
	{
		for (int j = 3; j > 0; j--)
		{
			inputKeys[j] = inputKeys[j - 1];
		}
		inputKeys[0] = keycode;

		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < 4; i++) {
			builder.append(inputKeys[i]);
		}
		lastInputString = builder.toString().trim().toLowerCase();
		
		char key = Character.toLowerCase((char) keycode);
		if (key == '$')
		{
			showDebugInfos = !showDebugInfos;
		} 
		else if (key == 'S') 
		{
			String label;
			if (toggleAudio) 
			{
				// Sound On
				toggleAudio = false;
				label = "Sound On";
			} 
			else 
			{
				// Sound Off
				toggleAudio = true;
				label = "Sound Off";
			}
			floatValue.I();

			GameLabel text = (GameLabel) wC.GiveLastInstanceTo(floatValue);
			if (text != null) 
			{
				text.Draw(label, defaultLabelColour, fontNormal, true, viewWidth / 2, viewHeight / 3, 0, 40, 0, true);

				text.B = Color.red;
			}

		} 
		else if (key == 'M') 
		{
			String label;
			if (isMusicOn) 
			{
				isMusicOn = false;
				label = "Music Off";
			} 
			else 
			{
				isMusicOn = true;
				label = "Music On";
			}

			floatValue.I();
			GameLabel gametext2 = (GameLabel) wC.GiveLastInstanceTo(floatValue);

			if (gametext2 != null)
			{
				gametext2.Draw(label, defaultLabelColour, fontNormal, true, viewWidth / 2, viewHeight / 3, 0, 40, 0, true);

				gametext2.B = Color.red;
			}

		}
		else if (key == 'P')
		{
			isPaused = !isPaused;
		}

		return true;
	}

	void B() {
	}

	void D() {
	}

	void Cleanup() {
		fontTiny = null;
		fontSmall = null;
		fontNormal = null;
	}

	final void I(String s, String s1) {
		String s2;
		try {
			final String target_encoding = "UTF-8";

			s2 = "flag=29&game=" + URLEncoder.encode(appletName,
					target_encoding) + "&player="
					+ URLEncoder.encode(s,
							target_encoding)
					+ "&guest=" + isGuest + "&score=" + URLEncoder.encode(s1, target_encoding);
		} catch (UnsupportedEncodingException e) {
			return;
		}

		try {
			Socket socket = new Socket(highscoreHost, 80);
			PrintStream printstream = new PrintStream(socket.getOutputStream());

			printstream.print("POST " + highscoreCGIProvider + " HTTP/1.1\r\n");
			printstream.print("Content-type: application/x-www-form-urlencoded\r\n");
			printstream.print("Content-length: " + s2.length() + "\r\n");
			printstream.print("Host: " + highscoreHost + "\r\n");
			printstream.print("\r\n");
			printstream.print(s2);
			printstream.flush();
			printstream.close();

			socket.close();
			return;
		} catch (SocketException socketexception) {
			System.err.println("SocketException" + socketexception);
			return;
		} catch (IOException ioexception) {
			System.err.println("IOException" + ioexception);
		}
	}

	final void append() {
		applicationCanvas = new Canvas((GameApp) this, viewWidth, viewHeight);
		applicationCanvas.I(0, 0, viewWidth, viewHeight, getBackground().getRGB());
		mC = new Canvas((GameApp) this, viewWidth, viewHeight);
		mC.I(0, 0, viewWidth, viewHeight, getBackground().getRGB());
	}

	final void InitializeWorldDimensions(final float world_left, final float world_right, final float world_top, final float world_bottom)
	{
		worldBorderLeft = world_left;
		worldBorderRight = world_right;
		worldBorderTop = world_top;
		worldBorderBottom = world_bottom;

		worldDimension[0] = world_right - world_left;
		worldDimension[1] = world_bottom - world_top;

		YC = (int) world_left;
		iC = (int) world_right;
		zC = (int) world_top;
		cC = (int) world_bottom;
	}

	public final boolean IsGuest() {
		return isGuest;
	}
}
