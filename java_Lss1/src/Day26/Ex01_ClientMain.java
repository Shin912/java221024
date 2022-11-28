package Day26;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;



public class Ex01_ClientMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Socket socket = null;
		
		try {
			socket = new Socket();
			socket.connect(new InetSocketAddress(5001));
			System.out.println("[연결 완료]");
			
			//Output 스트림 연결
			OutputStream os = socket.getOutputStream();
			//보내려는 문자열을 byte 배열로 변환
			String str = scan.nextLine();
			byte [] bytes = str.getBytes("UTF-8");
			//전송
			os.write(bytes);
			os.flush();
			
			//서버에서 문자열을 입력받아
			
			InputStream is = socket.getInputStream();
			byte []bytes2 = new byte[1024];
			int readCount = is.read(bytes2);
			String str2 = new String(bytes2, 0 ,readCount, "UTF-8");
			//콘솔에 출력
			System.out.println(str2);
			is.close();
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
