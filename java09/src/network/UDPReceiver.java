package network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPReceiver {

	public static void main(String[] args) throws Exception {
		//UDP 받는 부분부터 먼저 실행을 시켜야 함.
		//UDP용 소켓을 만들자.
		DatagramSocket socket = new DatagramSocket(7100);
		//받을 때 byte배열로 받는다.
	    byte[] data = new byte[256];
		//미리 받아서 집어넣을 byte배열을 만들어 놓아야 한다.
		
		//받을 패킷을 만들어두자.
	    DatagramPacket packet = new DatagramPacket(data,data.length);
		System.out.println("UDP 받을 준비중...");
	    //패킷을 받자.
	    socket.receive(packet);
		
		//받은 데이터를 스트링으로 변환해서 프린트 해보자.
	    System.out.println(new String(data));
	    socket.close();
	}

}
