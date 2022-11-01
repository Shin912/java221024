package Day07;

public class MethodArrayEx03 {

	public static void main(String[] args) {
		//배열에 정수 num가 있는지 없는지 확인하는 메소드
		int [] arr = {1, 3, 5, 7, 9};
		int num = 3;
		if(contains(arr,num)) {
			System.out.println(num + "는 배열에 있습니다.");
		}else {
			System.out.println(num + "는 배열에 없습니다.");
		}
	}
	/* 기능 : 정수 num가 배열에 있는지 없는지 확인하는 메소드
	 * 매개변수 : 정수, 배열 => int[] arr, int num
	 * 리턴타입 :	있는지 없는지 => boolean
	 * 메소드명 : contains
	 * */
	public static boolean contains(int []arr, int num) {
		for(int tmp : arr) {
			if(num == tmp){
				return true;
			}
		}
		return false;
	}
}
