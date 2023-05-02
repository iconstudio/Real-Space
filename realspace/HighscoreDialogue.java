package realspace;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Event;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class HighscoreDialogue extends Dialog
{
	private static final long serialVersionUID = 6942179738292203675L;

	public HighscoreDialogue(GameApp applet, Frame frame)
	{
		super(frame, "Enter your name", true);
		gameApplet = applet;

		setLayout(new FlowLayout());
		setBackground(Color.white);
		setFont(new Font("Helvetica", 0, 12));

		annotationLabel = new Label("Please enter your name to record your score", 1);
		add(annotationLabel);

		nameTextField = new TextField(20);
		add(nameTextField);

		Button okButton = new Button("OK");
		add(okButton);

		Button noButton = new Button("No Thanks");
		add(noButton);

		annotationLabel = new Label("Qualifying scores will show on the high score list", 1);
		add(annotationLabel);

		setSize(350, 160);
		setLocation(250, 200);
		setResizable(false);
	}

	public final void MakePopup()
	{
		skippedHighscore = false;
		setEnabled(true);
		setVisible(true);

		nameTextField.requestFocus();
	}

	@Override
	public final String getName()
	{
		String s = nameTextField.getText().replace('&', '_').replace('|', '_').replace('\t', '_');

		if (s.length() > 30)
			s = s.substring(0, 30);

		return s;
	}

	@Override
	public final boolean action(Event event, Object obj)
	{
		if ((String) obj == "OK") {
			skippedHighscore = false;

			setEnabled(false);
			setVisible(false);
			return true;
		}
		else if ((String) obj == "No Thanks")
		{
			skippedHighscore = true;

			setEnabled(false);
			setVisible(false);
			return true;
		}
		else
		{
			return false;
		}
	}

	public final boolean IsSkippedHighscore()
	{
		return skippedHighscore;
	}

	GameApp gameApplet;
	TextField nameTextField;
	Label annotationLabel;
	boolean skippedHighscore;
}
