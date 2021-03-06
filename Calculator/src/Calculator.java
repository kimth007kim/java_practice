import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame {
	JTextField jf = new JTextField(30);
	StringBuilder result = new StringBuilder();
	ScriptEngineManager mgr =new ScriptEngineManager();
	ScriptEngine engine =mgr.getEngineByName("JavaScript");
	StringBuilder dab= new StringBuilder();

	public Calculator() {
		setTitle("계산기");
		Container p = getContentPane();
		// getContentPane:최근 버전에서는 사용하지 않아도 어느정도 보정이 되지만 안정성을 위해서 사용을 권한다.
		p.setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		result.append("");
		JPanel jp = new JPanel();
		jp.setLayout(new GridLayout(0, 4, 10, 10));

		p.add(jf);
		p.add(jp);

		JButton[] buttons = new JButton[10];
		for (int i = 0; i < 10; i++) {
			buttons[i] = new JButton("" + i);
			buttons[i].addMouseListener(new MouseAdapter() {

				@Override
				public void mousePressed(MouseEvent e) {
					JButton b = (JButton) e.getSource();
					result.append(b.getText());
					jf.setText(result.toString());

				}

			});
			jp.add(buttons[i]);
		}

		JButton s1 = new JButton("+");
		s1.setSize(125,125);
		s1.addMouseListener(new MouseAdd());
		jp.add(s1);
		
		
		JButton s2 = new JButton("-");
		s2.addMouseListener(new MouseAdd());
		jp.add(s2);
		JButton s3 = new JButton("*");
		s3.addMouseListener(new MouseAdd());
		jp.add(s3);
		JButton s4 = new JButton("/");
		s4.addMouseListener(new MouseAdd());
		jp.add(s4);
		JButton s5 = new JButton("=");
		s5.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				String t =result.toString();
				try {
					Object p= engine.eval(t);
					jf.setText(p.toString());
					result.delete(0, result.length());
				
										
				} catch (ScriptException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		
		});
		jp.add(s5);
		
		JButton del = new JButton("<-");
		del.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				if(result.length()>0) {
//					jf.setBackground(Color.black);
					result.delete(result.length()-1,result.length());
					jf.setText(result.toString());
				}
			}
			
		});
		jp.add(del);
		JButton AC = new JButton("AC");
		AC.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				if(result.length()>0) {
					result.delete(0,result.length());
					jf.setText(result.toString());
				}
			}
			
		});
		jp.add(AC);

		setSize(500, 800);
		setVisible(true);
	}

		public class MouseAdd extends MouseAdapter {

			@Override
			public void mousePressed(MouseEvent e) {
				JButton b = (JButton) e.getSource();
				result.append(b.getText());
				jf.setText(result.toString());

		}
	}

	public static void main(String[] args) throws Exception {
		new Calculator();
	}

}
