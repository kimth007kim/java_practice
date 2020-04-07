package turn_off;

import javax.swing.JFrame;

public class ThreadInterruptEx extends JFrame {
	public ThreadInterruptEx() {
		setTitle("Interrupted");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new ThreadInterruptEx();
	}

}
