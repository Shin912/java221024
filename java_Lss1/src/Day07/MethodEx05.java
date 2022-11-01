package Day07;

public class MethodEx05 {

	public static void main(String[] args) {
		// 1부터 10까지 합을 구하는 코드를 작성하세요. 단, 메소드를 이용할것
		int start = 1, end = 10;
		System.out.println(Sum(1,10));
		System.out.println(start + "부터" + end +"까지의 합 : "
		+ Sum(end, start));
	}
	/* 기능 : 1부터 10까지 합을 구하는 코드
	 * 매개변수 : 시작 숫자, 끝 숫자  => int start, int end
	 * 리턴타입 : 합 => int
	 * 메소드명 : Sum
	 * */
	public static int Sum(int start,int end) {
		if(start > end) { // 주소바꾸는 코드
			int tmp = start;
			start = end;
			end = tmp;
		}
		int sum = 0;
		for ( int i = start; i<=end; i++) {
			sum += i;
			}
		return sum;
	}
	
}
