package Day10;

import java.util.Scanner;

public class UpDownGameManager {

	public static void main(String[] args) {
		/* Updown게임을 구현하세요.
		 * 1. 플레이
		 * 2. 기록확인
		 * 3. 종료
		 * */
		
		int menu;
		Record [] records = new Record [5];
		do {
			//메뉴 출력
			printMenu(
				"----------------",
				"1. 업다운 게임 실행",
				"2. 기록 확인",
				"3. 프로그램 종료",
				"---------------",
				"메뉴 선택: "
			);
		//메뉴 선택
			menu = insertInt();
			//선택한 메뉴에 맞는 기능 실행 : 선택한 메뉴, 기록정보
			runMenu(menu, records);
			
			
		}while(menu != 3);
	}
	
	private static void runMenu(int menu, Record[] records) {
		int num = random(1,100);
		int user;
		int tryCount = 0;
		switch(menu) {
		case 1: //업다운 게임
			//랜덤 숫자 생성
			System.out.println(num);
			do {
				//사용사 숫자 입력
				System.out.println("정수 입력:  ");
				user = insertInt(); 
				//판별
				printUpDownResult(num, user);
				tryCount++;
			}while( num != user);

			// 결과를 등록
			
			writeRecord(records, tryCount);
			break;
			//기록확인
		case 2:
			printRecords1(records);
			break;
		case 3:
			System.out.println("프로그램을 종료합니다.");
			break;
		default:
			System.out.println("잘못된 입력입니다.");
		}
		
	}
	

	private static void printRecords1(Record[] records) {
		for(int i = 0; i<records.length; i++) {
			if(records[i] != null) {
				System.out.print(i+1 + "위 ");
				records[i].print();
			}else {
				System.out.println();
			}
		}
		
	}

	
	public static void writeRecord(Record[] records, int tryCount) {
		int index = 0;
		for(int i = 0; i<records.length; i++) {
			//1등부터 비교하여 나보다 기록이 좋으면 내 순위가 밀림
			if(records[i] !=null && tryCount >= records[i].getCount()) {
				index++;
			}
			//기록이 없는 처음 순위를 내 기록으로 하기 위해 i를 index에 저장
			else if(records[i] == null){
				index = i;
				break;
			}
			//비교 순위보다 내가 기록이 좋으면 반복문 종료
			else { 
				index = i;
				break;
			}
		}
		if(index == 5) {
			return;
		}
		System.out.print("이름 입력(예: AAA) : ")	;
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		records[index] = new Record(tryCount, name);
	}

	public static void printUpDownResult(int r, int user) {
		if(r == user) {
			System.out.println("정답입니다. ");
			}else if(r < user) {
				System.out.println("Down");
			}else if(r > user) {
				System.out.println("Up");
			}
	}
	public static int random(int min, int max) {
		return (int)(Math.random()*(max - min + 1)+min);
	}
	
	private static int insertInt() {
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
	}
	
	private static void printMenu(String ...strs) {
		// static 메소드에는 static메소드를 써야한다
		// 아니면 기본 생성자를 선언해야 가능
		for( int i = 0; i<strs.length; i++) {
			/* 조건연산자를 이용하면 한줄로 가능
			System.out.print(strs[i]);
			if(i != strs.length-1) {
				System.out.println();
			} */
			System.out.print(strs[i] + (i!= strs.length-1?"\n":""));
		}
		
	}
}
