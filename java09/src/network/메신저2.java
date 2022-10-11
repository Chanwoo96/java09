package network;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class 메신저2 extends JFrame{
	DatagramSocket socket;
	JTextArea list;	//채팅 내용 리스트
	JTextField input;//채팅 내용 입력
	
	public 메신저2() throws Exception {
	socket = new DatagramSocket(5555);
	setTitle("메신저1");
	setSize(500, 500);
	list = new JTextArea();
	input = new JTextField();
	
	add(list,BorderLayout.CENTER);
	add(input,BorderLayout.SOUTH);
	
	Font font = new Font("궁서",Font.BOLD,30);
	list.setFont(font);
	input.setFont(font);
	//배경색
	list.setBackground(Color.pink);
	input.setBackground(Color.orange);
	//글자색
	list.setForeground(Color.blue);
	input.setForeground(Color.red);
	//list 수정불가
	list.setEditable(false);
	
	
	//input 입력 효과
	                         //new 익명클래스(){}
	input.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			list.append("나>> "+input.getText()+"\n");
			
try {
	//			/소켓을 만들어서 packet을 보냄
	// UDP socket 필요
	DatagramSocket socket = new DatagramSocket();
	//packet은 ip, portm data를 실어줘야함.
	//ip는 해당 부품으로 만들어주어야 함.
	InetAddress ip = InetAddress.getByName("127.0.0.1");
	// packet의 데이터는 byte 배열로 만들어서 보내야한다.
	String str = input.getText();
	byte[] data = str.getBytes();
	//UDP packet 필요
	DatagramPacket packet = new DatagramPacket(data, data.length, ip, 7777);
	socket.send(packet);
	socket.close();
	input.setText("");
} catch (Exception e2) {
}
		}
	});
	
	
	
	setVisible(true);
	}
	
	
	public void process() throws Exception {
		while(true) {
//			DatagramSocket socket = new DatagramSocket(7100);
			//받을 때 byte배열로 받는다.
		    byte[] data = new byte[256];
			//미리 받아서 집어넣을 byte배열을 만들어 놓아야 한다.
			
			//받을 패킷을 만들어두자.
		    DatagramPacket packet = new DatagramPacket(data,data.length);
			System.out.println("UDP 받을 준비중...");
		    //패킷을 받자.
		    
			socket.receive(packet);
			
			//받은 데이터를 스트링으로 변환해서 프린트 해보자.
		  list.append("너>>"+new String(data)+"\n");
//		    socket.close();
		}
	}
	public static void main(String[] args) throws Exception {
		메신저2 name = new 메신저2();
		name.process();
	}

}
