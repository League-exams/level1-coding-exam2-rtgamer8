import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Level1CodingExam2 implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton llama = new JButton();
	JButton cat = new JButton();
	JButton cow = new JButton();
	JButton duck = new JButton();
	JButton dog = new JButton();

	public static void main(String[] args) {

		Level1CodingExam2 Code = new Level1CodingExam2();

		Code.run();

	}

	public void playNoise(String soundFile) {
		try {
			AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
			sound.play();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void run() {

		frame.add(panel);
		panel.add(cat);
		panel.add(cow);
		panel.add(duck);
		panel.add(dog);
		panel.add(llama);
		frame.setVisible(true);
		frame.pack();

		llama.setLabel("llama");
		cat.setLabel("cat");
		cow.setLabel("cow");
		duck.setLabel("duck");
		dog.setLabel("dog");

		llama.addActionListener(this);
		cat.addActionListener(this);
		cow.addActionListener(this);
		duck.addActionListener(this);
		dog.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource() == llama) {
			playNoise("llama.wav");
		}

		if (e.getSource() == cat) {
			playNoise("meow.wav");
		}

		if (e.getSource() == cow) {
			playNoise("moo.wav");
		}

		if (e.getSource() == duck) {
			playNoise("quack.wav");
		}

		if (e.getSource() == dog) {
			playNoise("woof.wav");
		}

	}

}
