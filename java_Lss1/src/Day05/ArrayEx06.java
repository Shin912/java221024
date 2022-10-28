package Day05;

import java.util.Scanner;

public class ArrayEx06 {

	public static void main(String[] args) {
		/* 정수 4개짜리 배열을 생성한 후, 4자리 숫자를 입력 받아 
		 * 배열에 저장하는 코드를 작성
		 * 1234
		 * 0번지 : 1
		 * 1번지 : 2
		 * 2번지 : 3
		 * 3번지 : 4
		 * 
		 * */
		//4자리 정수를 입력
		
		/* 반복횟수 : 4번
		 * num에서 1의 자리 추출                 1234에서 4를 추출
		 *  => % 10
		 * 추출된 1의 자리를 배열에 저장			arr[3] = 4
		 * num에서 1의 자리를 제거하여 num에 저장	1234에서 123을 num에 저장
		 * => / 10
		 * 반복문 종료 후 : 배열에 있는 값을 출력
		 * */
		Scanner scan = new Scanner(System.in);
		int size = 4;
		int i, num;
		System.out.print(size + "자리 정수를 입력해주세요 : ");
		num = scan.nextInt();
		
		int num2 = num;
		int arr[] = new int[size];
		
		for(i = size-1 ; i >= 0 ; i-- ) {
			arr[i] = num % 10;
			num = num / 10; // num / = 10;
		}
		for(int tmp:arr) {
			System.out.print(tmp + " ");
		}
		System.out.println();
		
		i = size - 1;
		while(num2 > 0) {
			arr[i--] = num2 % 10;
			num2 = num2 / 10; // num / = 10;
		}
		for(int tmp:arr) {
			System.out.print(tmp + " ");
		}
	}

}
