package Assignment;

import java.util.Scanner;

import Day10.Record;

public class Baskin31Manager {

	public static void main(String[] args) {
		// 31 게임
		
		//메뉴 출력
		int menu;
		int cWin = 0 , uWin = 0;
		do { 
			// 메뉴 출력
			printMenu(
				"-----------",
				"메뉴",
				"1. 31 게임 플레이",
				"2. 기록확인",
				"3. 종료",
				"-----------",
				"메뉴 선택 : "
			);
			//메뉴선택
			menu = insertInt();
			
			//메뉴에 맞는 기능 실행 ( 
			runMenu(menu, cWin, uWin);
			
		}while(menu != 3);

	}
	
	private static void runMenu(int menu, int comWin, int userWin) {
		switch(menu) {
		// 1. 31게임 실행
		case 1:
			int comCount = 0, userCount = 0;
			int num = 0;
			do {
				int r = random(1,3);
				int user;

				System.out.print("com : " );
				for(int i = 0 ; i<r; i++) {
					++num;
					System.out.print(num + " ");
				}	
				
				System.out.println();
				System.out.print("1~3중 숫자 입력 : ");
				
				while(true) {
					user = insertInt();
					if(num == 30) {
						System.out.println("user 패배");
						comCount++;
						break;
					}else if(user <= 3 && user >= 1) {
						break;
					}else {
						System.out.print("1~3중 숫자 입력 : ");
					}
				}
				System.out.print("user : ");
				for(int i = 0; i<user; i++) {
					++num; 
					System.out.print(num +" ");
				}
				System.out.println();
				
				if(num == 29) {
					++num;
					System.out.println("com : 30");
					System.out.println("user 패배");
					comCount++;
				}else if(num == 30) {
					++num;
					System.out.println("user 승리");
					userCount++;
				}
				comWin += comCount;
				userWin += userCount;
			}while(num != 31);
			break;
			//2. 기록 확인 (com 승 : , user 승 : )
		case 2:
			printResult(comWin, userWin);
			break;
			//3. 종료
		case 3: 
			System.out.println("프로그램을 종료합니다.");
			break;
		default:
			System.out.println("잘 못된 입력입니다.");
		}
	}
	
	private static void printResult(int comWin, int userWin) {
		
		System.out.println("com 승 : " + comWin + ", user 승 : " + userWin);
	}

	private static void printMenu(String ...strs) {
			
			for( int i = 0; i<strs.length; i++) {
				
				System.out.print(strs[i] + (i!= strs.length-1?"\n":""));
			}
			
	}
	
	private static int insertInt() {
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
	}
	
	public static int random(int min, int max) {
		return (int)(Math.random()*(max - min + 1)+min);
	}
	
}
