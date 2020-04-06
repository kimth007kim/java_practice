package blink;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

class FlickeringLabel extends JLabel implements Runnable{
	private long delay;
	public FlickeringLabel(String text,long delay) {
		super(text);
		this.delay=delay;
		setOpaque(true);
		Thread th = new Thread(this);
		th.start();
	}
	@Override
	public void run() {
		int n=0;
		while(true) {
			if(n==0) {
				setBackground(Color.yellow);
				n=1;
			}else {
				setBackground(Color.green);
				n=0;
			}
			try {
				Thread.sleep(delay);
			}catch (InterruptedException e) {
				return;
			}
		}
	}
	
}

public class Blink extends JFrame{
	public Blink() {
		setTitle("sd");
		Container p = getContentPane();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p.setLayout(new FlowLayout());

		FlickeringLabel fla = new FlickeringLabel("±ôºý", 500);
		JLabel la = new JLabel("¾È±ôºý");
		FlickeringLabel fla1 = new FlickeringLabel("¿©±âµµ ±ôºý", 300);
		
		p.add(fla);
		p.add(la);
		p.add(fla1);
		
		setSize(500,500);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Blink();
	}

}
