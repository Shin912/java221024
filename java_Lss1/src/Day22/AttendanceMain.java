package Day22;

import java.util.ArrayList;
import java.util.Scanner;


public class AttendanceMain {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		/* 출석부 관리 프로그램
		 * 1. 학생 등록
		 * 		- 이름과 생년월일
		 * 3. 학생 수정
		 * 		- 이름과 생년월일로 검색해서 이름과 생년월일 수정
		 * 3. 학생 삭제
		 * - 이름과 생년월일로 검색해서 삭제
		 * 4. 학생 출결 확인
		 * 	- 이름과 생년월일로 검색해서 해당 학생의 모든 출결을 확인
		 * 	- 2022-11-22 : O
		 * 5. 출석 확인 
		 * 		-날짜 입력 : 2022-11-22
		 * 		-(출석 : O, 지각 : / , 조퇴 : \, 결석 : X
		 * 	홍길동 출석현황 : X
		 * 	고길동 출석현황 : O
		 * 	임꺽정 출석현황 : /
		 * 6. 출석 수정
		 * 		- 날짜 입력
		 * 		- 수정할 학생의 이름과 생년월일 입력
		 * 7. 출석 삭제
		 * 	- 날짜 입력하여 해당 날짜 출석 삭제
		 * 8. 날짜별 출석 확인
		 * 	- 날짜 입력하여 해당 날짜의 모든 학생의 출석 여부를 확인
		 * 9.프로그램 종료
		 * */
		
		ArrayList<Student> list = new ArrayList<Student>();
		int menu = -1;
		
		do {
			printMenu();
			
			menu = scan.nextInt();
			
			runMenu(menu, list);
			
		}while(menu != 3);
	}

	private static void runMenu(int menu, ArrayList<Student> list) {
		int subMenu = -1;
		switch(menu) {
		case 1:
			printStudentMenu();
			subMenu = scan.nextInt();
			runStudentMenu(subMenu,list);
			break;
		case 2:
			printAttendannceMenu();
			subMenu = scan.nextInt();
			break;
		case 3:
			System.out.println("프로그램 종료..!");
			break;
		default:
			System.out.println("잘못된 메뉴 선택입니다.");
		}
		
	}

	private static void runStudentMenu(int subMenu, ArrayList<Student> list) {
		
		switch(subMenu) {
		case 1:
			addStrudent(list);
			System.out.println(list);
			break;
		case 2:
			System.out.println("2. 학생 정보 수정");
			System.out.print("이름 입력 : ");
			String name = scan.next();
			scan.nextLine();
			System.out.print("생년월일 입력 (예시 : 940912) : ");
			String breth = scan.nextLine();
			
			Student std = new Student(name, breth);
			int index = list.indexOf(std);
			if(index == -1 ) {
				return;
			}
			
			break;
		case 3:
			System.out.println("3. 학생 정보 삭제");
			break;
		case 4:
			System.out.println("4. 학생 출결 확인");
			break;
		default:
			System.out.println("잘못된 메뉴 선택..");
		}
		
	}
	
	private static void addStrudent(ArrayList<Student> list) {
		String name, breth;
		System.out.println("1. 학생 등록");
		System.out.print("이름 입력 : ");
		name = scan.next();
		scan.nextLine();
		System.out.print("생년월일 입력 (예시 : 940912) : ");
		breth = scan.nextLine();
		
		Student std = new Student(name, breth);
		list.add(std);
	}

	

	private static void printAttendannceMenu() {
		System.out.println("======= 출 석 메 뉴 ======");
		System.out.println("1. 출석 확인");
		System.out.println("2. 출석 수정");
		System.out.println("3. 출석 삭제");
		System.out.println("===================");
		System.out.print("메뉴 선택 : ");
		
	}

	private static void printStudentMenu() {
		System.out.println("======= 학 생 메 뉴 ======");
		System.out.println("1. 학생 등록");
		System.out.println("2. 학생 수정");
		System.out.println("3. 학생 삭제");
		System.out.println("4. 학생 출결 확인");
		System.out.println("===================");
		System.out.print("메뉴 선택 : ");
		
	}

	private static void printMenu() {
		System.out.println("======= 메 뉴 ======");
		System.out.println("1. 학생 메뉴");
		System.out.println("2. 출석 메뉴");
		System.out.println("3. 프로그램 종료");
		System.out.println("===================");
		System.out.print("메뉴 선택 : ");
	}
}
