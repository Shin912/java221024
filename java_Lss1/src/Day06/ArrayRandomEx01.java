package Day06;

import java.util.Scanner;

public class ArrayRandomEx01 {

	public static void main(String[] args) {
		//랜덤으로 1~9사이의 숫자를 3개 생성하여 배열에 저장하는 코드를 작성 
		int min = 1, max = 9;		
		int arr[] = new int[3];
		
		for(int i =0 ; i<arr.length ; i++) {
			int num = (int)(Math.random()*(max - min + 1)+min);
			arr[i] = num;
			System.out.print( arr[i] + " " );
		}
		
		System.out.println();
		// 정수를 입력받아 랜덤한 수에 있는지 없는지 확인해서 알려주는 코드를 작성
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 하나를 입력해주세요: ");
		int num = scan.nextInt();
		boolean isDuplicated = false; //중복이 안됨으로 초기화
		
		for(int i=0 ; i < arr.length ; i++ ) {
			if( num == arr[i]) {
				isDuplicated = true;
				break;
			}
		}
		if(isDuplicated) {
			System.out.println(num+"가 있습니다.");
		}else {
			System.out.println(num+"가 없습니다.");
		}
		
		scan.close();
	}

}
