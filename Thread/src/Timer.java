import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

class tThread extends Thread {
	private JLabel timerLabel;

	public tThread(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}

	@Override
	public void run() {
		int n = 0;
		while(true) {
			timerLabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
				return;
			}
		}
	}
}

public class Timer extends JFrame {
	public Timer() {
		setTitle("Hello");
		setSize(500,500);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel= new JLabel();
		timerLabel.setFont(new Font("Gothic",Font.ITALIC,80));
		c.add(timerLabel);
		tThread th = new tThread(timerLabel);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		th.start();
	}

	public static void main(String[] args) {
		new Timer();
	}

}
