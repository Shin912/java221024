package Day05;

import java.util.Scanner;

public class WhileCharEx01 {

	public static void main(String[] args) {
		// 문자를 입력받아 q이면 종료하고, 아니면 반복하는 코드를 작성하세요.
		
		Scanner scan = new Scanner(System.in);
		char ch = 0 ;
		// break를 이용하여 무한루프를 빠져나오는 예제
		// ch의 초기값을 잘 설정하여 while문 조건식을 이용한 예제
		
		while( true ) {
			System.out.print("문자 하나를 입력하세요 (종료 : q): ");
			ch = scan.next().charAt(0);
			if( ch == 'q') {
				System.out.print("종료합니다.");
				break;
			}
			
		}
		
		ch = 'a';
		while( ch == 'q') {
			System.out.println("문자 하나를 입력하세요 (종료 : q): ");
			ch = scan.next().charAt(0);
		}
		scan.close();
	}

}
