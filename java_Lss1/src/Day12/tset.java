package Day12;

import java.util.Scanner;

public class tset {

	public static void main(String[] args) {
		// 1. 예제가 주어졌을 때 예제를 이해한다.
		
		// 2. 예제를 풀기 위해 사용해야하는 문법을 파악할 수 있다
		
		// 3. 예제를 해결하기 위해 단계를 구분할 수 있다.(주석)
		
		// 4. 예제를 풀기 위해 필요한 변수, 배열, 객체등을 선정할 수 있다.
		
		// 5. 부분적으로 (3번에서 작성한 단계별) 코딩을 통해 해결 할 수 있다.
		
		// 6. 원하는 코딩을 작성할 수 있다.
		
		// 7. 작성한 코딩을 효율적으로 정리할 수 있다.
		
	}
	//접근제한자 예약어 리턴타입 메소드명(매개변수);
	//추상 클래스를 상속 받은 일반 클래스는 부모의 추상 메소드를 반드시 오버라이딩해야 함
	//추상 클래스를 상속 받은 추상 클래스는 부모의 추상 메소드를 반드시 오버라이딩해야 하는건 아님
	int num;
	static int num2;
	
}
interface Calculator{
	int sum(int num1, int num2);
	int sub(int num1, int num2);
	int mul(int num1, int num2);
	double div(int num1,int num2);
	int mod(int num1, int num2);
	
	
}