package Day03;

public class IfEx03 {

	public static void main(String[] args) {
		/* if(조건식1){
		 * 		실행문1;
		 * }else if(조건식2){
		 * 			실행문2;
		 * }else {
		 * 			실행문3;
		 * }
		 * 
		 * if : 1개이상 반드시 필요 , 조건문을 시작
		 * else if : 0개 이상
		 * else : 0개 또는 1개
		 * */
		//정수가 양수, 음수, 0인지 판별하는 코드를 작성
		
		int num = -234;
		
		if( num > 0) {
			System.out.println(num + "은 양수");
		}else if( num == 0) {
			System.out.println(num + "은 0가 같다.");
		}else {
			System.out.println(num + "은 음수");
		}
		
		

	}

}
