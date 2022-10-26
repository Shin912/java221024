package Day03;

import java.util.Scanner;

public class IfEx07 {

	public static void main(String[] args) {
		/* 두 정수와 문자를 입력받아 산술연산자이면 산술연산 결과를 
		 * 출력하는 코드를 작성하세요
		 * 예시)
		 * 두 정수와 문자를 입력하세요 (예: 1 + 2) : 1/2
		 * 1 / 2 = 0.5
		 * 예시)
		 * 두 정수와 문자를 입력하세요(예: 1 = 2) : 1 ? 2
		 * ?는 산술연산자가 아닙니다.
		 * */
		Scanner scan = new Scanner(System.in);
		int a,b;
		char ch;
		
		System.out.print("두 정수와 문자를 입력하세요 (예: 1 + 2) :");
		a = scan.nextInt();
		ch = scan.next().charAt(0);
		b = scan.nextInt();
		
		if(ch == '+') {
			System.out.println("" + a + ch + b + "=" + (a+b));
		}else if(ch =='-') {
			System.out.println("" + a + ch + b + "=" + (a-b));
		}else if(ch =='*') {
			System.out.println("" + a + ch + b + "=" + (a*b));
		}else if(ch =='/') {
			System.out.println("" + a + ch + b + "=" + ((double)a/b));
		}else if(ch =='%') {
			System.out.println("" + a + ch + b + "=" + (a%b));
		}else {
			System.out.println(ch + "는 산술연산자가 아닙니다");
		}
		
		scan.close();
	}

}
