package 추상클래스;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class 버튼사용1 implements ActionListener{
	static JButton b1,b2;
	
	static JTextArea ta;
 	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.setLayout(new FlowLayout());
		b1 = new JButton("나를 눌러요");
		b2 = new JButton("나도 눌러요");
		
//		b1.addActionListener(new 버튼1처리클래스());
//		b2.addActionListener(new 버튼2처리클래스());
		버튼사용1 act3 = new 버튼사용1();
		f.add(b1);
		f.add(b2);
		b1.addActionListener(act3);
		b2.addActionListener(act3);
		Font font = new Font("궁서",Font.BOLD,50);
		b1.setFont(font);
		b2.setFont(font);
		
		ta = new JTextArea(6,10);
		ta.setFont(font);
		f.add(ta);
		
		
		
		
		
		
		
		
		
		
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==b1) {
			ta.append("b1 클릭함"+"\n");
		} else {
			ta.append("b2 클릭함"+"\n");

		}
	}

}
