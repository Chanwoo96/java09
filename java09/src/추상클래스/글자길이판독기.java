package 추상클래스;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class 글자길이판독기 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(51, 68, 57, 15);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(51, 134, 57, 15);
		f.getContentPane().add(lblNewLabel_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(51, 174, 391, 185);
		f.getContentPane().add(textArea);
		
		JButton b1 = new JButton("click");
		b1.setBounds(51, 395, 97, 23);
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("padcolor");
		b2.setBounds(201, 395, 97, 23);
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("textcolor");
		b3.setBounds(345, 395, 97, 23);
		f.getContentPane().add(b3);
		
		
		f.setVisible(true);
	}
}
