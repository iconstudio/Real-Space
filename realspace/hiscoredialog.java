package realspace;
// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.

// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   star_y
import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Event;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class hiscoredialog extends Dialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6942179738292203675L;

	@SuppressWarnings("deprecation")
	public hiscoredialog(gameapp gameapp, Frame frame) {
		super(frame, "Enter your name", true);
		hide = gameapp;
		setLayout(new FlowLayout());
		setBackground(Color.white);
		setFont(new Font("Helvetica", 0, 12));
		add = new Label("Please enter your name to record your score", 1);
		add(add);
		HNSM = new TextField(20);
		add(HNSM);
		Button button = new Button("OK");
		add(button);
		Button button1 = new Button("No Thanks");
		add(button1);
		add = new Label("Qualifying scores will show on the high score list", 1);
		add(add);
		resize(350, 160);
		setResizable(false);
		move(250, 200);
	}

	@SuppressWarnings("deprecation")
	public final void I() {
		getText = false;
		show();
		HNSM.requestFocus();
	}

	@Override
	public final String getName() {
		String s = HNSM.getText().replace('&', '_').replace('|', '_').replace('\t', '_');
		if (s.length() > 30)
			s = s.substring(0, 30);
		return s;
	}

	public final boolean Z() {
		return getText;
	}

	@Override
	@SuppressWarnings("deprecation")
	public final boolean action(Event event, Object obj) {
		if ((String) obj == "OK") {
			getText = false;
			hide();
			return true;
		}
		if ((String) obj == "No Thanks") {
			getText = true;
			hide();
			return true;
		} else {
			return false;
		}
	}

	TextField HNSM;
	Label add;
	boolean getText;
	gameapp hide;
}
