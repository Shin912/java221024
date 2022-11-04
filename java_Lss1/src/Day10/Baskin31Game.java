package Day10;

import java.util.Scanner;

public class Baskin31Game {

	public static void main(String[] args) {
		/* 숫자 1~31
		 * 컴퓨터 => 사용자 순서 ( 31부르면 패배 )
		 * 1~31 순서대로 작성 , 1~3 숫자 개수 
		 * Com => 1~3개의 숫자 랜덤으로 부름
		 * 사용자 => 1~3중 몇개의 숫자 부를지 입력
		 *   사용자가 입력한 개수 숫자 부름
		 * 
		 * 반복
		 * 
		 * 종료 => 기록 저장
		 * */
		
		int menu;
		Record [] records = new Record [5];
		
		//메뉴 출력
		printMenu(
			"---------------",
			"1. 31Game 실행",
			"2. 기록 확인",
			"3. 프로그램 종료",
			"---------------",
			"메뉴 선택: "
		);
		//메뉴 선택
		menu = insertInt();
		//선택한 메뉴에 맞는 기능 실행 : (선택한 메뉴, 기록정보)
		runMenu(menu, records);

	}

	private static void runMenu(int menu, Record[] records) {

		switch(menu) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			System.out.println("프로그램을 종료합니다.");
			break;
		default:
			System.out.println("잘못된 입력입니다.");
		}
		
	}
	
	private static int insertInt() {
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
	}
	
	private static void printMenu(String ...strs) {
		for(int i = 0; i<strs.length; i++) {
			System.out.print(strs[i] + (i != strs.length-1 ? "\n":""));
		}
		
	}
	
	
}
