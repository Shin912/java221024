package Day03;

import java.util.Scanner;

public class SwitchEx02 {

	public static void main(String[] args) {
		/* 두 정수와 산술 연산자를 입력 받아 산술 연산 결과를
		 * 하는 코드를 swtch문으로 작성 
		 * - break가 없으면 다음 case의 실행문으로 이동 (다음 case의 값과 달라도 이동)
		 * - 여러 경우를 같이 처리하고 싶으면
		 * case 값1, 값3, 값4 :
		 * */
		int a,b;
		char ch;
		Scanner scan = new Scanner(System.in);
		System.out.print("두 정수와 산술 연산자를 입력해주세요 ( 1 + 2 ) :");
		a = scan.nextInt();
		ch = scan.next().charAt(0);
		b = scan.nextInt();
		
		
		switch( ch ) {
		case '+':
			System.out.println("" + a + ch + b + "=" + (a+b));			
			break;
		case '-':
			System.out.println("" + a + ch + b + "=" + (a-b));
			break;
		case '*':
			System.out.println("" + a + ch + b + "=" + (a*b));
			break;
		case '/':
			System.out.println("" + a + ch + b + "=" + ((double)a/b));
			break;
		case '%':
			System.out.println("" + a + ch + b + "=" + (a%b));
			break;
		default:
			System.out.println(ch + "는 잘 못된 입력입니다.");
		}
		
		scan.close();
	}

}
