package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClients {

	public static void main(String[] args) throws Exception {
		for (int i = 0; i < 100; i++) {
			Socket socket = new Socket("localhost",9300);
			System.out.println("클라이언트가 접속함.>>"+(i+1));
		//input스트림을 통해 가지고 와서 임시기억장치에 넣어두자.
		//스트림 (1byte) --- 스트림리더(브릿지 클래스)---> 임시기억장치 (2byte)
		BufferedReader buffer=  new BufferedReader(new InputStreamReader(socket.getInputStream()));
//		InputStream stream= socket.getInputStream();
//		InputStreamReader input = new InputStreamReader(stream);
//		BufferedReader buffer2 = new BufferedReader(input);
		
		
		
		String data = buffer.readLine();//한줄씩 가지고 올 수 있음.(2바이트)
		
		System.out.println("서버에서 받아온 데이터는"+data);
		}
	}

}
