package Day27;

import java.util.ArrayList;
import java.util.Scanner;


public class BoardMain {
	
	/* 게시글 관리 프로그램
	 *  - 회원가입
	 *   - 처음 가입한 회원이 관리자, 그외 회원인 일반 회원
	 *  - 로그인
	 *  - 게시글 등록/수정/삭제 => 회원만 가능
	 *  - 카테고리 관리(공지, 자유)
	 *  - 카테고리 추가/수정/삭제(관리자만 가능)
	 * */

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		ArrayList<UserList> userList = new ArrayList<UserList>();
		ArrayList<Board> boardList = new ArrayList<Board>();
		int menu = -1;
		
		do {
			printMenu();
			menu = scan.nextInt();
			switch(menu) {
			case 1: // 공지 게시판
				break;
			case 2: // 자유 게시판
				break;
			case 3: // 로그인
				if(login(userList)) {
					
				}else {
					System.out.println("id 또는 pw 가 다릅니다.");
				}
				break;
			case 4: // 회원 가입
				if(addUser(userList)) {
					System.out.println("회원가입 완료.!");
				}else {
					System.out.println("회원가입 실패!!!");
				}
				break;
			case 5:
				System.out.println("프로그램 종료....");
				break;
			default:
				System.out.println("잘못된 메뉴 입력..!");
			}
			
		}while(menu != 5);
		
		

	}



	private static void boardMenu() {
		System.out.println("===== 게시글 =====");
		System.out.println("1. 게시글 등록/수정/삭제 ");
		System.out.println("2. 카테고리 관리 (공지/자유)");
		System.out.println("3. 카테고리 추가/수정/삭제(관리자만 가능) ");
		System.out.println("4. 로그아웃");
		System.out.println("====================");
		System.out.print("메뉴 선택 : ");
		
	}



	private static boolean login(ArrayList<UserList> userList) {
		scan.nextLine();
		System.out.print("아이디 입력 : ");
		String id = scan.nextLine();
		System.out.print("비밀번호 입력 : ");
		String pw = scan.nextLine();
		
		UserList user = new UserList(id,pw);
		int index = userList.indexOf(user);
		if(index == -1){
			return false;
		}
		
		user = userList.get(index);
		if(!user.getPw().equals(user.getPw())) {
			return false;
		}
		
		return true;
	}



	private static boolean addUser(ArrayList<UserList> userList) {
		scan.nextLine();
		System.out.print("가입할 아이디 입력 : ");
		String id = scan.nextLine();
		System.out.print("비밀번호 입력 :");
		String pw = scan.nextLine();
		
		UserList user = new UserList(id,pw);
		if(userList.contains(id)) {
			return false;
		}
		
		return userList.add(user);
	}

	private static void printMenu() {
		
		System.out.println("===== 게시글 접속 =====");
		System.out.println("1. 공지게시판 ");
		System.out.println("2. 자유게시판 ");
		System.out.println("3. 로그인 ");
		System.out.println("4. 회원가입 ");
		System.out.println("5. 프로그램 종료 ");
		System.out.println("====================");
		System.out.print("메뉴 선택 : ");
		
	}

}
