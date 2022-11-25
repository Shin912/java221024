package Day25;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02 {

		/* 정수를 5번 입력하여 배열/리스트에 저장하는 코드를 작성
		 * 정수가 홀수이면 그대로 저장, 정수가 짝수이면 -를 붙여서 저장
		 * */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int [] arr = new int[5];
		for(int i = 0; i < arr.length; i++) {
			System.out.print("정수 입력 : ");
			int num = scan.nextInt();
			if(num % 2 == 0) {
				arr[i] = -num;
			}else {
				arr[i] = num;
			}
		}
		for( int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i< 5; i++) {
			System.out.print("정수 입력 : ");
			int num = scan.nextInt();
			if(num % 2 == 0 ) {
				list.add(-num);
			}else {
				list.add(num);
			}
		}
		for(int num : list) {
			System.out.print(num +" ");
		}
	}

}
