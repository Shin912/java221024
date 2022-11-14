package Day16;

import java.util.ArrayList;
import java.util.Scanner;

import Day16.UserList1;

public class UserManagerMain {

	public static void main(String[] args) {
		/* 회원 정보를 관리하는 프로그램을 작성
		 * - 회원 정보는 아이디, 비번, 이름, 나이, 주민번호로 구성
		 * - 기능1 : 회원 추가
		 * - 기능2 : 회원 검색
		 * - 기능3 : 회원 정보 수정
		 * - 기능4 : 회원 삭제
		 * */
		Scanner scan = new Scanner(System.in);
		ArrayList<UserList1> userList = new ArrayList<UserList1>();
		int menu = -1;
		
		do {
			printMenu();
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				if(addUser(userList)) {
					printStr("입력한 회원정보를 추가했습니다.");
				}else {
					printStr("입력한 아이디가 이미 존재합니다.");
				}
				break;
			case 2:
				UserList1 searchTmp = searchUser(userList);
				if(searchTmp == null) {
					printStr("아이디 또는 비밀번호가 잘못됐습니다.");
				}else {
					System.out.println(searchTmp);
				}
				break;
			case 3:
				//수정할 회원 아이디와 비번을 입력하여 일치하는 회원정보를 가져옴
				UserList1 updateTmp = searchUser(userList);
				if(!updateUser(userList, updateTmp)) {
					printStr("아이디 또는 비밀번호가 잘못됐습니다.");
				}else {
					printStr("회원 정보 수정이 완료됐습니다.");
				}
				break;
			case 4:
				//삭제할 회원 아이디와 비번을 입력하여 일치하는 회원정보를 가져옴
				UserList1 deleteTmp = searchUser(userList);
				//일치하는 회원정보가 있으면 삭제
				if(userList.remove(deleteTmp)) {
					printStr("삭제 완료..!");
				}else {
					printStr("아이디 또는 비밀번호가 잘못됐습니다.");
				}
				break;
			case 5:
				break;
			default:
				System.out.println("잘못된 메뉴선택 입니다.");
			}
		}while(menu != 5);
	}

	
		

	public static boolean addUser(ArrayList<UserList1> userList) {
		Scanner scan = new Scanner(System.in);
		// 회원 정보 입력
		//아이디, 비번, 이름 , 주민번호, 나이 순으로
		
		System.out.print("id 입력 : ");
		String id = scan.next();
		System.out.print("pw 입력 : ");
		String pw = scan.next();
		System.out.print("이름 입력 : ");
		String name = scan.next();
		System.out.print("주민번호 입력 : ");
		String userAccount = scan.next();
		System.out.print("나이 입력 : ");
		int age = scan.nextInt();
		//입력한 정보를 이용한 객체를 생성(회원 리스트에 비교 및 추가)
		UserList1 user = new UserList1(id, pw, name, userAccount, age);
		
		//회원 리스트에 이미 가입된 아이디면 안내문구 출력 후 종료
		if(userList.contains(user)) {
			return false;
		}
		//아니면 회원 리스트에 user 객체 추가
		userList.add(user);
		return true;
	}
	
	public static void printStr(String str) {
		System.out.println("-----------------");
		System.out.println(str);
		System.out.println("-----------------");
	}
	
	public static UserList1 searchUser(ArrayList<UserList1> userList) {
		Scanner scan = new Scanner(System.in);
		//아이디 입력
		System.out.println("검색할 회원 정보를 입력하세요.");
		System.out.print("아이디 : ");
		String id = scan.next();
		//비번 입력
		System.out.print("비번 : ");
		String pw = scan.next();
		//아이디, 비번을 이용하여 객체를 만듬
		UserList1 user = new UserList1(id, pw);
		//회원 리스트에서 아이디가 같은 회원 정보를 가져옴
		int index = userList.indexOf(user);
		if(index == -1) {
			return null;
		}
		UserList1 tmp = userList.get(index);
		
		//가져온 회원 정보의 비번과 입력한 비번을 비교하여 다르면 종료
		if(!tmp.getPw().equals(user.getPw())) {
			return null;
		}
		//같으면 회원정보를 보여줌
		return tmp;
	}

	public static boolean updateUser(ArrayList<UserList1> userList, UserList1 updateTmp) {
		Scanner scan = new Scanner(System.in);
		//일치하지 않으면 건너뜀
		if(updateTmp == null) {
			printStr("아이디 또는 비밀번호가 잘못됐습니다.");
			return false;
		}
		//일치하는 회원 정보가 있으면 비번, 이름, 주민번호, 나이를 입력받음
		System.out.println("수정할 회원 정보 입력 ");
		System.out.print("pw 입력 : ");
		String pw = scan.next();
		System.out.print("이름 입력 : ");
		String name = scan.next();
		System.out.print("주민번호 입력 : ");
		String userAccount = scan.next();
		System.out.print("나이 입력 : ");
		int age = scan.nextInt();
		
		//입력받은 회원 정보를 이요하여 utpdateTmp를 수정
		updateTmp.update(pw, name, userAccount, age);
		
		return true;
	}
	
	private static void printMenu() {
		System.out.println("-----메뉴----");
		System.out.println("1. 회원 추가");
		System.out.println("2. 회원 검색");
		System.out.println("3. 회원 정보 수정");
		System.out.println("4. 회원 삭제");
		System.out.println("5. 종료");
		System.out.print("메뉴 입력 : ");
		
	}

}
