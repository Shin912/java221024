package Day02;

import java.util.Scanner;

public class OperatorEx08 {

	public static void main(String[] args) {
		/* 정수를 입력받아 입력받은 정수가 홀수인지 짝수인지 출력하는 코드를 작성
		 * 예시
		 * 정수를 입력하세요 : 5
		 * 5는 홀수입니다.
		 * */
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = scan.nextInt();
		// boolean isEven = (num % 2 == 0);
		String result = num % 2 == 0 ? "짝수" : "홀수";
		System.out.println(num + "은(는) " + result + "이다. ");
		
		scan.close();
	}

}
