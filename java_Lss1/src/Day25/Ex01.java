package Day25;

import java.util.Scanner;

public class Ex01 {

	
		/* 정수를 입력받아 입력받은 정수가 0이상이면 0부터 입력받은 수까지 합을 구하고,
		 * 입력 받은 정수가 0미만이면 0부터 입력받은 수까지 차를 구하는 코드를 작성하세요
		 * 예 :
		 * 정수 입력 : 3
		 * 0부터 3까지 누적합 : 6
		 * 정수 입력 : -3
		 * 0부터 -3까지 누적차 : 6
		 * */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = scan.nextInt();
		int sum = 0;
		int i = 0;
		if(num >= 0) {
			while( i <= num){
				sum +=num;
				i++;
			}
			System.out.print("0부터 " + num +"까지의 누적 합 = " + sum);
		}else if(num < 0) {
			while( i >= num) {
				sum -= num;
				i--;
			}
			System.out.print("0부터 " + num + "까지의 누적 차 = " + sum);
		}

	}

}
