package Day04;

public class ForGCDEx01 {

	public static void main(String[] args) {
		/* 두 정수의 최대 공약수를 구하는 코드를 작성하세요.
		 * 약수 : 나누었을때 나머지가 0이 되게 하는 수
		 * 공약수 : 두 정수의 약수들 중에서 공통으로 있는 약수
		 * 최대공약수 : 두정수의 약수들 중에서 가장 큰 공약수
		 * 12 : 1 2 3 4 6 12
		 * 18 : 1 2 3 6 9 18
		 * 12와 18의 공약수 : 1 2 3 6
		 * 12와 18의 최대공약수 : 6
		 * */
		
		int i, num1 = 12, num2 = 18;
		int gcd = 0;
		System.out.print(num1 + "와 "+ num2 + "의 공약수는 : ");
		for( i = 1 ; i <= num1 ; i++ ) {
			if( num1 % i == 0 && num2 % i == 0) {
				gcd = i;
				System.out.print( gcd + " ");
			}
		}
		System.out.println();
		System.out.println(num1 + "와 " + num2 +"의 최대 공약수는 : " + gcd );
	}

}
