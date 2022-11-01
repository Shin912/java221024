package Day07;

public class MethodEx03 {

	public static void main(String[] args) {
		/* 주어진 정수 num가 소수인지 아닌지 판별하는 코드를 작성하세요
		 * 단, 메소드를 이용할 것
		 * */
		printPrimeNumber(73);
		System.out.println(isPrimeNumber(11));
	}
	
	/* 기능 : 주어진 정수가 소수인지 아닌지 출력하는 코드를 작성
	 * 매개변수 : 정수 => int num
	 * 리턴타입 : 출력 => 없음 => void
	 * 메소드명 : printPrimeNumber
	 * */
	public static void printPrimeNumber(int num) {
		int i;
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
	
	/* 기능 : 주어진 정수가 소수인지 아닌지 알려주는 코드를 작성
	 * 매개변수 : 정수 => int num
	 * 리턴타입 : 소수인지 아닌지  => boolean
	 * 메소드명 : isPrimeNumber
	 * */
	public static boolean isPrimeNumber(int num) {
		for( int i = 2 ; i < num ; i++ ) {
			//1과 num를 제외한 약수
			if( num % i == 0 ) {
				return false;
			}
		}
		return num <= 1 ? false : true;
	}
}
