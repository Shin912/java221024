package Day04;

public class ForDivisorEx01 {
	
	public static void main(String[] args) {
		/* 정수 num의 약수를 출력하는 코드를 작성
		 * 약수 : 나누었을 때 나머지가 0이 되게 하는 수
		 * 6의 약수 : 1 2 3 6
		 * */
		
		int num = 6;
		int i;
		
		System.out.print(num + "의 약수 : ");
		for ( i = 1 ; i <= num ; i++ ) {
			if( num % i == 0) {
			
				System.out.print( i + " " );
			}
		
		}
		
		
	}

}
