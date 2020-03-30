package anonymous;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AnonymouseClassListener extends JFrame {
	public AnonymouseClassListener() {
		setTitle("Action 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		c.add(btn);
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton) e.getSource();
				if (b.getText().equals("Action")) {
					b.setText("액션");
				} else {
					b.setText("Action");
				}
	
			}
		});

		setSize(350, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new AnonymouseClassListener();
	}

}