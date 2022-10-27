package Day04;

public class ForPrimeNumberEx01 {

	public static void main(String[] args) {
		/* 정수 num가 소수인지 아닌지 판별하는 코드를 작성하세요.
		 * 소수는 약수가 1과 자기 자신뿐인 수
		 * 1은 소수가 아님
		 * */
		
		int num = 5 , i;
		int count = 0;
		
		for( i = 1 ; i <= num ; i++ ) {
			if( num % i == 0 ) {
				count += 1;
			}
		}
		
		if( count == 2) {
			System.out.println(num + "은 소수입니다.");
		}else {
			System.out.println(num + "은 소수가 아닙니다.");
		}
	}

}
