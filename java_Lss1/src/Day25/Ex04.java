package Day25;

import java.util.Scanner;

public class Ex04 {
	
	/* 컴퓨터와 가위, 바위, 보를 하는 프로그램을 작성하세요.
	 * 예:
	 * 사용자 : 가위
	 * 컴퓨터 : 보
	 * 사용자가 이겼습니다. 더 하시겠습니까?(y/n) : y
	 * 사용자 : 가위
	 * 컴퓨터 : 주먹
	 * 컴퓨터가 이겼습니다. 더 하시겠습니까?(y/n) : y
	 * */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int min = 1, max = 3;
		
		for(;;) {
			System.out.print("사용자 : ");
			String user = scan.next();
			
			int r = (int)(Math.random()*(max-min+1)+min);
			switch(r) {
			case 1:
				System.out.println("컴퓨터 : 주먹");
				break;
			case 2:
				System.out.println("컴퓨터 : 보");
				break;
			case 3:
				System.out.println("컴퓨터 : 가위");
				break;
			default:
			}
			
			if(user.equals("주먹")) {
				if(r == 1) {
					System.out.println("비겼습니다. ");
				}else if( r == 2) {
					System.out.println("컴퓨터가 이겼습니다. ");
				}else if( r == 3) {
					System.out.println("사용자가 이겼습니다. ");
				}
			}
			
			if(user.equals("가위")) {
				if(r == 1) {
					System.out.println("컴퓨터가 이겼습니다. ");
				}else if( r == 2) {
					System.out.println("사용자가 이겼습니다. ");
				}else if( r == 3) {
					System.out.println("비겼습니다. ");
				}
			}
			
			if(user.equals("보")) {
				if(r == 1) {
					System.out.println("사용자가 이겼습니다. ");
				}else if( r == 2) {
					System.out.println("비겼습니다. ");
				}else if( r == 3) {
					System.out.println("컴퓨터가 이겼습니다. ");
				}
				
			}
			
			System.out.print("더 하시겠습니까? (y/n) : ");
			if(scan.next().charAt(0) =='n') {
				System.out.println("종료.");
				break;
			}
			System.out.println("=================");
			
		}
		

	}

}
