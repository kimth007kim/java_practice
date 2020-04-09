package turn_off;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerRunnable implements Runnable {
	JLabel jla;
	public TimerRunnable(JLabel jla) {
		this.jla=jla;
	}
	@Override
	public void run() {
		int n=0;
		while(true) {
			jla.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				return;
			}
		}
	}

}

public class ThreadInterruptEx extends JFrame {
	private Thread th;
	public ThreadInterruptEx() {
		setTitle("Interrupted");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container p =getContentPane();
		p.setLayout(new FlowLayout());
		
		JLabel jla = new JLabel();
		TimerRunnable runnable = new TimerRunnable(jla);
		th = new Thread(runnable);
		p.add(jla);
		setSize(500, 500);
		setVisible(true);

	}

	public static void main(String[] args) {
		new ThreadInterruptEx();
	}

}
