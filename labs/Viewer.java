package events;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Viewer {
	
	public static void createGUI() {
		JFrame frame = new JFrame("Viewer");
		// Uncomment for Lab part 2
		//frame.setLayout(new java.awt.BorderLayout());
		//MyCanvas canvas = new MyCanvas();
		//frame.add(canvas, BorderLayout.CENTER);
		//ControlPanel control = new ControlPanel(canvas, frame);
		//frame.add(control, BorderLayout.SOUTH);

		frame.add(new MyCounterClass());
		frame.setSize(600, 400);
		frame.pack(); // 1) compute preferred size
		frame.setLocationRelativeTo(null); // 2) center on screen
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		// uncomment for Lab part 2
		//frame.requestFocusInWindow(); // 3) allow frame-level listener see the keys
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> createGUI());
	}

}
