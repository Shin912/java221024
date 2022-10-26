package Day03;

public class ForEx05 {

	public static void main(String[] args) {
		/* 1부터 10까지의 합을 구하는 코드를 작성하세요
		 * 반복횟수 : 
		 * 규칙성 :
		 * */
		int i = 1;
		int sum = 0;
		for ( i = 1, sum = 0; i<=10; i++) {
			sum = sum + i; //sum += i;
			}
		System.out.println("1부터 10까지 합은 " + sum + "입니다.");
		}

}


