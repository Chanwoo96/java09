package 추상클래스;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.TextArea;

public class 버튼사용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setSize(300, 300);
		f.setLayout(new FlowLayout());
		Font font = new Font("궁서",Font.BOLD,50);
		JButton b1 = new JButton("나를 눌러요");
	
		JButton b2 = new JButton("나를 눌러요");
		
		TextArea ta = new TextArea();
		f.add(ta);
		버튼1처리클래스 버튼처리 = new 버튼1처리클래스();
		버튼2처리클래스 버튼처리2 = new 버튼2처리클래스();
		f.getContentPane().setLayout(null);
		f.getContentPane().add(b1);
		f.getContentPane().add(b2);
		b1.setFont(font);
		b2.setFont(font);
		b1.addActionListener(버튼처리);
		b2.addActionListener(버튼처리2);
	
		f.setVisible(true);
	}

}
