package Day05;

public class WhileSumEx01 {

	public static void main(String[] args) {
		/* 1부터 10사이의 홀수의 합을 구하는 코드를 while문으로 작성
		 * */
		
		int i = 0;
		int sum = 0;
		while( ++i <= 10) {
			if(i % 2 == 1) {
				sum += i;
			}
			
		}
		System.out.println("1 ~ 10까지의 홀수의 합은 : " + sum);
	}

}
