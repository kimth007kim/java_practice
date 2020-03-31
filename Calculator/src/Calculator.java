import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame {

	public Calculator() {
		setTitle("계산기");
		Container p = getContentPane();
		// getContentPane:최근 버전에서는 사용하지 않아도 어느정도 보정이 되지만 안정성을 위해서 사용을 권한다.
		p.setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		String result="";

		JPanel jp = new JPanel();
		jp.setLayout(new GridLayout(4, 0, 10, 10));

		JTextField jf = new JTextField(result, 30);
		p.add(jf);
		p.add(jp);

		JButton[] buttons = new JButton[10];
		for (int i = 0; i < 10; i++) {
			buttons[i] = new JButton("" + i);
			buttons[i].addMouseListener(new MouseAdapter() {

				@Override
				public void mousePressed(MouseEvent e) {
					JButton b = (JButton)e.getSource();
					result+=result+b.getText();
					jf.setText(result);
				}
				
			});
			jp.add(buttons[i]);
		}
		JButton s1 = new JButton("+");
		jp.add(s1);
		JButton s2 = new JButton("-");
		jp.add(s2);
		JButton s3 = new JButton("*");
		jp.add(s3);
		JButton s4 = new JButton("/");
		jp.add(s4);
		JButton AC = new JButton("AC");
		jp.add(AC);
		JButton EN = new JButton("↵ ");
		jp.add(EN);
		


		setSize(500, 800);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Calculator();
	}

}
