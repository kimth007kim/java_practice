package turn_off;

import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerRunnable implements Runnable {
	JLabel jla;
	public TimerRunnable() {
		this.jla=jla;
	}
	@Override
	public void run() {
		int n=0;
		while(true) {
			jla.setText(Integer.toString(n));
		}
	}

}

public class ThreadInterruptEx extends JFrame {
	public ThreadInterruptEx() {
		setTitle("Interrupted");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setVisible(true);

	}

	public static void main(String[] args) {
		new ThreadInterruptEx();
	}

}
