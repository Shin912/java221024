package Day03;

import java.util.Scanner;

public class SwitchEx04 {

	public static void main(String[] args) {
		/* 월을 입력받아 해당하는 월의 마지막 일을 출력하는 코드를 작성
		 * 31 : 1 3 5 7 8 10 12
		 * 30 : 4 6 9 11
		 * 28 : 2
		 * */
		Scanner scan = new Scanner(System.in);
		System.out.print("확인하고 싶은 달을 입력하세요 : ");
		int month = scan.nextInt();
		
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println(month + "월의 마지막 일은 31일 입니다.");
			break;
		case 4, 6, 9, 11:
			System.out.println(month + "월의 마지막 일은 30일 입니다.");
			break;
		case 2:
			System.out.println(month + "월의 마지막 일은 28일 입니다.");
			break;
		default:
			System.out.println(month + "월은 없는 달입니다.");
		}
		
		
		scan.close();
	}

}
