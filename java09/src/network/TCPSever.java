package network;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPSever {
	//throws Exception : 해당 메서드를 호출한 곳으로 예외처리를 떠넘김
	//try=catch과 동일 
	public static void main(String[] args) throws Exception {
		//승인용 서버 소켓 필요
		//서버 소켓이 클라이언트의 요청을 계속 기다리다가
		//승인이 떨어지면 양쪽에 데이터 전달용 소켓이 생성
		//그 다음에 데이터를 주고 받을 수 있음.
		//ip는 컴퓨터 따라감 port는 내가 정할 수 있음
		ServerSocket server = new ServerSocket(9300);
		System.out.println("서버 소켓 시작됨");
		System.out.println("클라이언트의 요청을 기다리는 중.");
		int count=0;
		while (true) {
			//요청이 오면 승인을 함. 양쪽에 소켓이 연결됨.
			Socket socket= server.accept();
			count++;
			System.out.println("클라이언트"+count+ "명 접속");
		PrintWriter out = new PrintWriter(socket.getOutputStream());
		out.print("i am java programer.");
		out.close();
		socket.close();
		}
		
		
	}

}
