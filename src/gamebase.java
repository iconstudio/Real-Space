package src;
// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.

// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   star_y

import java.applet.Applet;
import java.awt.*;
import java.io.IOException;
import java.io.PrintStream;
import java.net.*;
import java.util.Vector;

@SuppressWarnings("unused")
public abstract class gamebase extends Applet implements Runnable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3482431680115256438L;
	@SuppressWarnings("deprecation")
	public void init() {
		System.out.println("at init");
		close = new Object();
		print = "Game Paused";
		BB = "Untitled";
		HB = true;
		KB = true;
		SB = false;
		currentTimeMillis = 0;
		nC = 0;
		drawImage = -1;
		encode = -1;
		equals = 0;
		err = 0;
		oC = false;
		pC = true;
		qC = false;
		String s = getParameter("ACTOR_PAINT_MODE");
		if (s == null)
			s = "PAINT_SURFACE";
		if (s.equals("PAINT_ACTOR"))
			paint = 1;
		else if (s.equals("OSB_PAINT_SURFACE"))
			paint = 3;
		else
			paint = 2;
		System.out.println("Parameter ACTOR_PAINT_MODE=" + s);
		s = getParameter("JDK_VERSION");
		if (s == null)
			s = "1.0";
		if (s.equals("1.1"))
			isErrorID = 2;
		else
			isErrorID = 1;
		System.out.println("Parameter JDK_VERSION=" + s);
		s = getParameter("SIZE_SCALE");
		if (s == null)
			s = "1.0";
		view_scale = Float.valueOf(s).floatValue();
		System.out.println("Parameter SIZE_SCALE=" + s);
		JB = getParameter("MOREURL");
		if (JB == null)
			JB = "";
		DB = getParameter("WEB_TITLE");
		if (DB == null)
			DB = "ArcadeTown.com";
		FB = getParameter("WEB_URL");
		if (FB == null)
			FB = "http://www.arcadetown.com/index.asp";
		CB = new int[4];
		for (int i = 0; i < 4; i++)
			CB[i] = 32;

		Dimension dimension = new Dimension();
		dimension = size();
		view_width = dimension.width;
		view_height = dimension.height;
		screen_width = view_width;
		screen_height = view_height;
		I(0.0F, screen_width, 0.0F, screen_height);
		append();
		// flush = new Vector();
		vC = new oGameObjectlist((gameapp) this, 10);
		floatValue = new oGameObjectlist((gameapp) this, 1);
		wC = new oGameObjectlist((gameapp) this, 11);
		for (int j = 0; j < wC.I; j++) {
			gametext gametext1 = new gametext((gameapp) this);
			oGameObjectlist oGameObjectlist1 = wC;
			gametext gametext2 = gametext1;
			if (oGameObjectlist1.C < oGameObjectlist1.I) {
				oGameObjectlist1.Z[oGameObjectlist1.C] = gametext2;
				oGameObjectlist1.C++;
			}
		}

		removeImage = Color.yellow;
		requestFocus = Color.blue;
		size = Color.red;
		LB = new palette((gameapp) this, 4);
		palette palette1 = LB;
		Color color = Color.gray.brighter();
		int k = color.getRGB();
		if (palette1.Z < palette1.C) {
			palette1.I[palette1.Z] = k;
			palette1.Z++;
		}
		palette1 = LB;
		color = Color.gray;
		k = color.getRGB();
		if (palette1.Z < palette1.C) {
			palette1.I[palette1.Z] = k;
			palette1.Z++;
		}
		palette1 = LB;
		color = Color.gray.darker();
		k = color.getRGB();
		if (palette1.Z < palette1.C) {
			palette1.I[palette1.Z] = k;
			palette1.Z++;
		}
		palette1 = LB;
		color = Color.gray.darker().darker();
		k = color.getRGB();
		if (palette1.Z < palette1.C) {
			palette1.I[palette1.Z] = k;
			palette1.Z++;
		}
		MB = new palette((gameapp) this, 4);
		palette1 = MB;
		color = Color.gray;
		k = color.getRGB();
		if (palette1.Z < palette1.C) {
			palette1.I[palette1.Z] = k;
			palette1.Z++;
		}
		palette1 = MB;
		color = Color.gray.darker();
		k = color.getRGB();
		if (palette1.Z < palette1.C) {
			palette1.I[palette1.Z] = k;
			palette1.Z++;
		}
		palette1 = MB;
		color = Color.gray.brighter();
		k = color.getRGB();
		if (palette1.Z < palette1.C) {
			palette1.I[palette1.Z] = k;
			palette1.Z++;
		}
		palette1 = MB;
		color = Color.gray.darker().darker();
		k = color.getRGB();
		if (palette1.Z < palette1.C) {
			palette1.I[palette1.Z] = k;
			palette1.Z++;
		}
		NB = getParameter("PLAYERID");
		System.out.println("Parameter PLAYERID=" + NB);
		OB = getParameter("ISGUEST");
		System.out.println("Parameter ISGUEST=" + OB);
		start = getParameter("HISCORE_CGIURL");
		sleep = getParameter("HISCORE_HOST");
		if (start != null) {
			RB = true;
			java.awt.Container container;
			for (container = getParent(); !(container instanceof Frame); container = ((Component) container)
					.getParent())
				;
			QB = new hiscoredialog((gameapp) this, (Frame) container);
			TB = new hiscorelist(stop);
			UB = new hiscorelist(stop);
			System.out.println("high scores enabled");
			System.out.println("Parameter HISCORE_CGIURL=" + start);
			System.out.println("Parameter HISCORE_HOST=" + sleep);
		} else {
			RB = false;
			System.out.println("high scores disabled");
		}
		requestFocus();
	}

	public final void start() {
		if (addImage == null) {
			addImage = new Thread(this);
			addImage.start();
		}
	}

	@SuppressWarnings("deprecation")
	public final void stop() {
		System.out.println("at stop");
		KB = false;
		D();
		if (addImage != null && addImage.isAlive()) {
			addImage.stop();
			addImage = null;
		}
	}

	public final void destroy() {
		System.out.println("at destroy");
		C();
	}

	public final void run() {
		String s = String.valueOf(getCodeBase());
		String s1 = String.valueOf(getDocumentBase());
		if (s.toUpperCase().indexOf("BRIAN") < 0
				&& (s.toUpperCase().indexOf("FREEWEBGAMES.COM") < 0 || s1.toUpperCase().indexOf("FREEWEBGAMES.COM") < 0)
				&& s.toUpperCase().indexOf("ALTOP1100") < 0
				&& (s.toUpperCase().indexOf("ARCADETOWN.COM") < 0 || s1.toUpperCase().indexOf("ARCADETOWN.COM") < 0)) {
			DB = "ArcadeTown.com";
			FB = "http://www.arcadetown.com/index.asp";
		}
		if (!load_resource())
			return;
		I(true);
		int i = xC / 2;
		getDefaultToolkit = yC / 2;
		getDocumentBase = yC / 2;
		long l1 = System.currentTimeMillis();
		long l3 = (l1 + 500L) - 10L;
		long l4 = (l1 + 1000L) - 10L;
		long l5 = 0L;
		indexOf = 0L;
		getOutputStream = 0L;
		getParent = 0L;
		IB = 0L;
		getImage = 0L;
		getParameter = 0;
		Graphics g = getGraphics();
		do {
			do {
				long l = System.currentTimeMillis();
				if (l >= l4) {
					isAlive = l5;
					l4 = (l + 1000L) - 10L;
					l5 = 0L;
				}
				l5++;
				if (l >= l3) {
					indexOf = getParent;
					getOutputStream = getImage;
					getParent = 0L;
					getImage = 0L;
					long l2 = l;
					l3 = (l2 + 500L) - 10L;
					if (!oC)
						if (indexOf >= (long) (i + 1)) {
							if (indexOf >= (long) (i + 2)) {
								if (getDocumentBase > getDefaultToolkit)
									getDefaultToolkit += 2L;
								else
									getDocumentBase += 2L;
							} else if (getDocumentBase > getDefaultToolkit)
								getDefaultToolkit++;
							else
								getDocumentBase++;
							if (getDefaultToolkit > (long) yC)
								getDefaultToolkit = yC;
						} else if (indexOf <= (long) (xC - 1)) {
							if (indexOf <= (long) (i - 2)) {
								if (getDocumentBase < getDefaultToolkit)
									getDefaultToolkit -= 2L;
								else
									getDocumentBase -= 2L;
							} else if (getDocumentBase < getDefaultToolkit)
								getDefaultToolkit--;
							else
								getDocumentBase--;
							int j = 5;
							if (getDefaultToolkit < (long) j)
								getDefaultToolkit = j;
						}
				}
				if (getParameter <= 2) {
					if (!oC)
						I();
					getParameter++;
					paint(g);
				}
			} while (getDefaultToolkit <= 0L);
			try {
				if ((getParent & 1L) == 1L)
					Thread.sleep(getDefaultToolkit);
				else
					Thread.sleep(getDocumentBase);
			} catch (Exception _ex) {
			}
		} while (true);
	}

	public final void update(Graphics g) {
		paint(g);
	}

	public final void paint(Graphics g) {
		I(lC);
		lC.I();
		g.drawImage(lC.D, 0, 0, lC.I, lC.Z, null);
		Toolkit.getDefaultToolkit().sync();
		getImage++;
		getParameter--;
	}

	public void I(surface surface1) {
		if (!SB) {
			int i = view_width / 8;
			int j = view_height / 4;
			surface1.I(i - 4, j - 4, (view_width * 3) / 4 + 8, view_height / 2 + 8, Color.gray.getRGB());
			surface1.I(i, j, (view_width * 3) / 4, view_height / 2, Color.darkGray.brighter().getRGB());
			i += (int) (20F * view_scale);
			j += (int) (30F * view_scale);
			if (AB != null && hFontNormal != null) {
				surface1.I(DB, Color.red.getRGB(), hFontSmall, i - 1, j + 1);
				surface1.I(DB, Color.yellow.getRGB(), hFontSmall, i, j);
				gamefont gamefont3 = hFontSmall;
				j += gamefont3.C;
				surface1.I(BB, Color.red.getRGB(), hFontSmall, i - 1, j + 1);
				surface1.I(BB, Color.yellow.getRGB(), hFontSmall, i, j);
				gamefont3 = hFontSmall;
				j += gamefont3.C + (int) (25F * view_scale);
				surface1.I(AB, Color.blue.getRGB(), hFontSmall, i - 1, j + 1);
				surface1.I(AB, Color.white.getRGB(), hFontSmall, i, j);
				gamefont3 = hFontSmall;
				j += gamefont3.C + (int) (10F * view_scale);
			}
			if (GB > 0) {
				int k = (view_height / 4 + view_height / 2) - (int) (60F * view_scale);
				int l = (view_width * 3) / 4 - 60;
				gameutil.I(surface1, i, k, l, 30, (float) EB / (float) GB, Constant.c_dkyellow_int, Constant.c_lime_int);
			}
			return;
		}
		vC.I(surface1);
		floatValue.I(surface1);
		if (oC) {
			String s = print;
			gamefont gamefont1 = hFontNormal;
			int i1 = view_width / 2 - hFontNormal.I(print) / 2;
			gamefont gamefont4 = hFontNormal;
			int j1 = view_height / 2 - gamefont4.C / 2;
			surface1.I(s, -1, gamefont1, i1, j1);
		}
		if (getGraphics) {
			String s1 = " FPS:" + String.valueOf(isAlive) + " Sleep:" + String.valueOf(getDefaultToolkit) + ", "
					+ String.valueOf(getDocumentBase);
			gamefont gamefont2 = hFontSmall;
			surface1.I(s1, -1, gamefont2, 200, 50);
		}
	}

	public void I() {
		vC.Z();
		floatValue.Z();
		vC.C();
		floatValue.C();
		if (drawImage > 0)
			drawImage--;
		else if (drawImage == 0) {
			drawImage = -1;
			addImage();
		}
		getParent++;
		IB++;
	}

	final void addImage() {
	}

	final imagepixels I(String s) {
		System.out.println("loadImage " + s + " totalMemory=" + String.valueOf(Runtime.getRuntime().totalMemory())
				+ " freeMemory=" + String.valueOf(Runtime.getRuntime().freeMemory()));
		java.awt.Image image = getImage(getCodeBase(), s);
		MediaTracker mediatracker = new MediaTracker(this);
		mediatracker.addImage(image, currentTimeMillis);
		try {
			mediatracker.waitForAll();
			currentTimeMillis++;
		} catch (Exception _ex) {
			AB = "Error loading image " + s;
			System.out.println(AB);
			repaint();
			return null;
		}
		if (mediatracker.isErrorID(0) || image == null) {
			AB = "Error loading image " + s;
			System.out.println(AB);
			repaint();
			return null;
		} else {
			imagepixels imagepixels1 = new imagepixels(image, this);
			mediatracker.removeImage(image);
			image = null;
			mediatracker = null;
			System.gc();
			return imagepixels1;
		}
	}

	boolean load_resource() {
		return true;
	}

	public synchronized void I(boolean flag) {
		pC = flag;
		qC = false;
		drawImage = 0;
		rC = 0;
		tC = false;
		uC = "Score: " + String.valueOf(rC);
	}

	final void Z(int i) {
		if (!tC && !pC && qC) {
			rC += i;
			uC = "Score: " + String.valueOf(rC);
		}
	}

	public boolean keyDown(Event event, int i) {
		for (int j = 3; j > 0; j--)
			CB[j] = CB[j - 1];

		CB[0] = i;
		if (i == 36)
			getGraphics = !getGraphics;
		else if (i == 83 || i == 115) {
			String s;
			if (HB) {
				HB = false;
				s = "Sound Off";
			} else {
				HB = true;
				s = "Sound On";
			}
			floatValue.I();
			gametext gametext1 = (gametext) wC.I(floatValue);
			if (gametext1 != null) {
				gametext1.I(s, removeImage, hFontNormal, true, view_width / 2, view_height / 3, 0, 40, 0, true);
				Color color = size;
				gametext1.B = color;
			}
			B();
		} else if (i == 77 || i == 109) {
			String s1;
			if (KB) {
				KB = false;
				s1 = "Music Off";
			} else {
				KB = true;
				s1 = "Music On";
			}
			floatValue.I();
			gametext gametext2 = (gametext) wC.I(floatValue);
			if (gametext2 != null) {
				gametext2.I(s1, removeImage, hFontNormal, true, view_width / 2, view_height / 3, 0, 40, 0, true);
				Color color1 = size;
				gametext2.B = color1;
			}
			D();
		} else if (i == 80 || i == 112)
			if (oC)
				oC = false;
			else
				oC = true;
		return true;
	}

	void B() {
	}

	void D() {
	}

	void C() {
		eC = null;
		hFontSmall = null;
		hFontNormal = null;
	}

	@SuppressWarnings("deprecation")
	final void I(String s, String s1) {
		String s2 = "flag=29&game=" + URLEncoder.encode(app_name) + "&player=" + URLEncoder.encode(s) + "&guest=" + OB
				+ "&score=" + URLEncoder.encode(s1);
		String s3;
		if (start.toLowerCase().indexOf(".asp") != -1)
			s3 = start + "?" + s2;
		else
			s3 = start;
		try {
			Socket socket = new Socket(sleep, 80);
			PrintStream printstream = new PrintStream(socket.getOutputStream());
			printstream.print("POST " + start + " HTTP/1.1\r\n");
			printstream.print("Content-type: application/x-www-form-urlencoded\r\n");
			printstream.print("Content-length: " + s2.length() + "\r\n");
			printstream.print("Host: " + sleep + "\r\n");
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
		lC = new surface((gameapp) this, view_width, view_height);
		lC.I(0, 0, view_width, view_height, getBackground().getRGB());
		mC = new surface((gameapp) this, view_width, view_height);
		mC.I(0, 0, view_width, view_height, getBackground().getRGB());
	}

	final void I(float f, float f1, float f2, float f3) {
		bC = f;
		dC = f1;
		fC = f2;
		jC = f3;
		sC = f1 - f;
		aC = f3 - f2;
		YC = (int) f;
		iC = (int) f1;
		zC = (int) f2;
		cC = (int) f3;
	}

	public gamebase() {
		xC = 25;
		yC = 1000 / xC;
		getGraphics = false;
		stop = 50;
	}

	Thread addImage;
	Object close;
	int view_width;
	int view_height;
	float screen_width;
	float screen_height;
	int WC;
	int XC;
	int YC;
	int iC;
	int zC;
	int cC;
	float bC;
	float dC;
	float fC;
	float jC;
	float sC;
	float aC;
	gamefont eC;
	gamefont hFontSmall;
	gamefont hFontNormal;
	gamefont hFontLarge;
	surface lC;
	surface mC;
	int currentTimeMillis;
	int nC;
	int drawImage;
	int encode;
	int equals;
	int err;
	boolean oC;
	boolean pC;
	boolean qC;
	int rC;
	boolean tC;
	String uC;
	oGameObjectlist vC;
	oGameObjectlist wC;
	oGameObjectlist floatValue;
	// Vector flush;
	int xC;
	int yC;
	long getDefaultToolkit;
	long getDocumentBase;
	boolean getGraphics;
	long getImage;
	long getOutputStream;
	int getParameter;
	long getParent;
	long IB;
	long indexOf;
	long isAlive;
	float view_scale;
	int isErrorID;
	int paint;
	int CB[];
	String print;
	String BB;
	String DB;
	String FB;
	String JB;
	boolean SB;
	String AB;
	int EB;
	int GB;
	boolean HB;
	boolean KB;
	palette LB;
	palette MB;
	Color removeImage;
	Color requestFocus;
	Color size;
	String NB;
	String OB;
	String app_name;
	hiscoredialog QB;
	boolean RB;
	String sleep;
	String start;
	int stop;
	hiscorelist TB;
	hiscorelist UB;
}
