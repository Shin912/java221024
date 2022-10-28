package Day05;

import java.util.Scanner;

public class ForUpDownEx01 {

	public static void main(String[] args) {
		/* 랜덤한 수를 생성하여 해당 수를 맞추는 코드를 작성하세요
		 * 예시 : (생성한 랜덤한 수 70)
		 * 1~100사이의 랜덤한 수를 맞추세요.
		 * 숫자를 입력하세요 : 50
		 * Up
		 * 숫자를 입력하세요 : 75
		 * Down
		 * */
		Scanner scan = new Scanner(System.in);
		int min = 1, max = 100, i = min - 1;
		
		int r = (int)(Math.random()*(max - min + 1)+min);
		System.out.println(r);
		for(  ; r != i  ; ) {
			System.out.print("1 ~ 100중 숫자 하나를 입력하세요 : ");
			i = scan.nextInt();
			if(r == i) {
				System.out.println("정답입니다. ");
				//조건식이 없을때 break; 
			}else if(r < i) {
				System.out.println("Down");
			}else if(r > i) {
				System.out.println("Up");
			}			
		}
		
		scan.close();
	}

}
