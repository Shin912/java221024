package Day15;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ListEx01 {

	public static void main(String[] args) {
		/* 리스트를 이용하여 다음 기능을 갖는 오늘의 할일 프로그램을 작성
		 * 메뉴
		 * 1. 할일 추가
		 * 2. 할일 확인
		 * 3. 할일 삭제
		 * 4. 종료
		 * 메뉴 선택 : 1
		 * -----------------
		 * 할일 입력 : 오후 수업 참여
		 * -----------------
		 * 메뉴
		 * 1. 할일 추가
		 * 2. 할일 확인
		 * 3. 할일 삭제
		 * 4. 종료
		 * 메뉴 선택 : 2
		 * ----------------
		 * 할일 확인
		 * 1. 오후 수업 참여
		 * 2. 저녁 식사
		 * -----------------
		 * 메뉴
		 * 1. 할일 추가
		 * 2. 할일 확인
		 * 3. 할일 삭제
		 * 4. 종료
		 * 메뉴 선택 : 3
		 * 1. 오후 수업 참여
		 * 2. 저녁 식사
		 * 삭제할 할일 번호 선택 : 1
		 * 1번 할일이 삭제되었습니다.
		 * */
		
		Scanner scan = new Scanner(System.in);
		ArrayList<String> todoList = new ArrayList<String>();
		int menu = -1;
		
		do {
			printMenu();
			try {
				menu = scan.nextInt();
				
				runMenu(menu, todoList);
			}catch(InputMismatchException e) {
				System.out.println("-------------");
				System.out.println("예외 발생 : 정수를 입력하세요.");
				System.out.println("-------------");
				scan.nextLine();
			}
			catch(Exception e) {
				System.out.println("--------------");
				System.out.println(e.getMessage());
				System.out.println("--------------");
			}
		}while( menu != 4);
	}
	
	public static void runMenu(int menu, ArrayList<String> list) throws Exception {
		Scanner scan = new Scanner(System.in);
		switch (menu) {
		case 1:
			System.out.print("오늘 할일을 추가하세요 : ");
			addList(list);
			break;
		case 2:
			printTodoList(list);
			break;
		case 3:
			printTodoList(list);
			System.out.print("삭제할 할일 번호를 입력 : ");
			int num = scan.nextInt();
			//잘못된 번호 입력한 경우
			if(num <0 || num >= list.size()) {
				throw new Exception("예외 발생 : 삭제할 번호를 잘못 입력했습니다.");
			}
			list.remove(num-1);
			break;
		case 4: 
			System.out.println("시스템을 종료합니다.");
			break;
		default:
			throw new Exception("잘못된 메뉴입니다.");
		}
	}
	
	private static void addList(ArrayList<String> list) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		list.add(str); // 리스트에 할 일 저장
	}

	private static void printTodoList(ArrayList<String> list) {
		if(list == null || list.size() == 0) {
			System.out.println("저장된 할 일이 없습니다.");
		}
		for(String tmp : list) {
			System.out.println(list.indexOf(tmp)+1 + ". " + tmp);
		}
	}

	public static void printMenu() {
		System.out.println("------메뉴-----");
		System.out.println("1. 할 일 추가");
		System.out.println("2. 할 일 확인");
		System.out.println("3. 할 일 삭제");
		System.out.println("4. 종료");
		System.out.print("메뉴 선택 :");
	}

}
