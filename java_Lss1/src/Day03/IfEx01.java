package Day03;

public class IfEx01 {

	public static void main(String[] args) {
		/* 조건문 : ~하면 ...한다
		 *        ~ : 조건식
		 *        ... : 실행문
		 *        if(조건식){
		 *        실행문;
		 *        }
		 * */
		//정수 num가 0보다 크면 양수라고 출력하는 코드를 작성
			
		int num = 0;
		
		if( num > 0 ) {
			System.out.println( num + "은 양수다.");
		}					
		//정수 num가 0과 같으면 0이라고 출력
		if(num == 0) {
			System.out.println(num + "은 0과 같다.");
		}
		//정수 num가 0보다 작으면 음수라고 출력
		if(num < 0) {
			System.out.println(num + "은 음수다.");
		}
		

	}

}
