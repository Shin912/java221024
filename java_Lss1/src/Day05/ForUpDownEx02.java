package Day05;

import java.util.Scanner;

public class ForUpDownEx02 {

	public static void main(String[] args) {
		/* 랜덤한 정수를 맞추는 Up Down 게임
		 * 예시 ) 
		 * 1~100사이의 랜덤한 수를 맞추세요.
		 * 숫자를 입력하세요 : 50
		 * Up
		 * 숫자를 입력하세요 : 75
		 * Down
		 * 숫자를 입력하세요 : 54
		 * 정답입니다.
		 * 더 하시겠습니까?(y/n) : y
		 * 
		 * */
		
		Scanner scan = new Scanner(System.in);
		int min = 1, max = 100;
		int num , r;
		
		
		for ( ; ; ) {
			r = (int)(Math.random()*(max - min + 1)+min);
			num = min -1;
			for( ; r != num ; ) {
				System.out.print("1 ~ 100중 숫자 하나를 입력하세요 : ");
				num = scan.nextInt();
				if(r == num) {
					System.out.println("정답입니다. ");
					//조건식이 없을때 break; 
					}else if(r < num) {
						System.out.println("Down");
					}else if(r > num) {
						System.out.println("Up");
				}
			}
			System.out.print("더 하시겠습니까? (y/n) : ");
			if( scan.next().charAt(0) == 'n' ) {
				break;
			}	

		}
		System.out.println("프로그램을 종료합니다.");
		scan.close();
	}

}
