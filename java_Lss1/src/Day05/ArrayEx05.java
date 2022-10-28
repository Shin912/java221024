package Day05;

public class ArrayEx05 {

	public static void main(String[] args) {
		/* 5개짜리 배열을 생성하여 2부터 5개의 소수를 배열에 저장하고 출력
		 * 반복횟수 : 무조건 실행 / num가 2부터 1씩 증가
		 * 규칙성 : 1. num가 소수이면 배열 i번지에 num를 저장
		 * 			2. i를 1증가
		 * 			3. i가 배열의 크기와 같으면 반복문 종료
		 * */
		
		int arr[] = new int[5];
		int count = 0; //num의 약수 개수를 저장하는 수
		int num; // 소수인지 판별하려는 수
		int i; //약수를 찾기 위해 1부터 num까지 증가시키려는 수
		int index = 0; //소수를 저장할 배열의 번지
		
		for(num = 2; ; num++) {
			//num가 소수인지 판별하는 코드
			for( i = 1 ; i <= num ; i++ ) {
				if( num % i == 0 ) {
					count++;
				}
			}
			if( count == 2) {
				arr[index] = num;
				index++;
			}
			if(index == arr.length) {
				break;
			}
		}
		for(int tmp : arr) {
			System.out.print(tmp + " ");
		}
		/*
		while ( true ) {
			
			if( num % i == 0) {
				count += 1;
			}
			i++;
			
			if(count == 2) {
				arr[i] += num;
			}
			
			if(i == arr.length) {
				break;
			}
		}
		System.out.println(arr[i]);
		*/

	}

}
