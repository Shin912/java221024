package Day05;

public class RandomEx01 {

	public static void main(String[] args) {
		// min ~ max 사이값을 가지는랜덤한 정수를 생성하는 예제
		int min = 1, max = 9;
		/* math.random : 0이상 1미만의 랜덤한 실수를 생성, 0.xx
		 * 0 <= r < 1, (max - min + 1)을 곱함
		 * 0 <= r * (max - min + 1) < max - min + 1, min을 더함
		 * min <= r * (max - min + 1) < min < max + 1
		 * */
		// max 와 min 사이에 랜덤한 정수를 생성하는 코드
		int r = (int)(Math.random()*(max - min + 1)+min);
		System.out.println("랜덤한 수 : " + r );
	}

}
