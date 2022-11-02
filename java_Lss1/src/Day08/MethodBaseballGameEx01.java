package Day08;

import java.util.Scanner;

public class MethodBaseballGameEx01 {

	public static void main(String[] args) {
		/* 1~9사이의 중복되지 않은 3개의 숫자가 랜덤으로 생성이 되고,
		 * 생성된 숫자를 맞추는 게임
		 * 규칙
		 * - 숫자가 같은 자리에 있으면 Strike
		 * - 숫자가 있지만 다른자리에 있으면 Ball
		 * - 일치하는 숫자가 하나도 없으면 Out
		 * 예시(랜덤 숫자 : 5 9 8)
		 * 입력 : 1 2 3
		 * Out
		 * 입력 : 4 5 6
		 * Ball
		 * */
		
		//1. 랜덤으로 3개의 숫자 
			// => createRandomArray
		//2. 사용자가 숫자 선택
			//
		//3. 판별 
			// => 스트라이크를 판별하는 기능을 구현
			// => countLotto를 이용하여 일치하는 갯수 - 스트라이크 갯수 => 볼의 갯수
		
		// 2~3을 반복 (3S가 될때까지)

	}
	
	public static int getStrike(int []base, int []user) {
		if(base == null || user == null) {
			return 0;
		}
		int sameCount = baseStrike(base,user);
		
		switch(sameCount){
		case 1:
			return 1;
		case 2:
			return 2;
		case 3:
			return 3;
			default:
				return 0;
		}
	}
	
	public static int baseStrike(int []base, int []user) {
		int count = 0;
		for(int i = 0; i<base.length; i++) {
			for(int j = 0; j <user.length; j++) {
				if(base[i]==user[j]) {
					count++;
				}
			}
		}
		return count;
	}
	
	public static int countBase(int []base, int []user) {

		int sameCount = 0;
		for( int tmp : base) {
			if(contains(user, tmp)) {
				sameCount++;
			}
			
		} 
		sameCount = sameCount - baseStrike(base,user);
		return sameCount;
	}
	
	public static int[] createRandomArray(int min, int max, int size) {
		if(max - min + 1 <= size) {
			return null;
		}
		int arr[] = new int[size];
		// => i는 0부터 i가 배열의 크기보다 작을때 까지
		for(int i = 0 ; i<arr.length ; ) {
			//랜덤한 수를 r에 저장
			int r = random(min, max);
			//배열에 r이 없으면 배열 i번지에 r을 저장한 후, i를 1증가
			if(!contains(arr,r)) {
				arr[i] = r;
				i++;
			}
		}
		return arr;
	}
	
	public static void printArray(int arr[]) {
		if(arr == null) {
			return;
		}
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static int random(int min, int max) {
		if( min > max) {
			int tmp = min;
			min = max;
			max = tmp;
		}
		return (int)(Math.random()*(max - min + 1)+min);
	}
	
	public static boolean contains(int []arr, int num) {
		if(arr == null || arr.length == 0) {
			return false;
		}
		for(int tmp : arr) {
			if(num == tmp){
				return true;
			}
		}
		return false;
	}
}
