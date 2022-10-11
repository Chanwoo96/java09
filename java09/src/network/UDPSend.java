package network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPSend {

	public static void main(String[] args) throws Exception {
		// UDP socket 필요
		DatagramSocket socket = new DatagramSocket();
		
		//packet은 ip, portm data를 실어줘야함.
		//ip는 해당 부품으로 만들어주어야 함.
		InetAddress ip= InetAddress.getByName("127.0.0.1");
		// packet의 데이터는 byte 배열로 만들어서 보내야한다.
		String str= "i am a ai programmer";
		byte[] data= str.getBytes();
		
		//UDP packet 필요
		DatagramPacket packet = new DatagramPacket(data,data.length,ip,7100);
		
		
		socket.send(packet);
		socket.close();
	}

}
