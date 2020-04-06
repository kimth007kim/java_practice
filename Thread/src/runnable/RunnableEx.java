package runnable;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerRunnable implements Runnable {
	private JLabel timerLabel;

	public TimerRunnable(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}

	@Override
	public void run() {
		int n = 0;
		while (true) {
			timerLabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}
		}
	}
}

public class RunnableEx extends JFrame {
	public RunnableEx() {
		setTitle("Hello");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container p = getContentPane();
		p.setLayout(new FlowLayout());
		
		JLabel timerLabel = new JLabel();
		TimerRunnable tr = new TimerRunnable(timerLabel);
		Thread th = new Thread(tr);
		p.add(timerLabel);
		setSize(500,500);
		setVisible(true);

		
		th.start();
	}

	public static void main(String[] args) {
		new RunnableEx();
	}

}
