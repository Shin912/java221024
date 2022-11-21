package Day20;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneListMain {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		/* 전화번호를 관리하는 프로그램을 작성
		 * 1. 전화번호 추가 (성, 이름, 직장 , 전화번호들)
		 * 2. 전화번호 수정 
		 * 		- 이름으로 검색(성+이름)
		 *  	- 검색된 사람들 중에서 선택
		 * 		- 성, 이름을 수정할건지,
		 *  	 기존 등록된 전화번호를 수전할건지,
		 *  	 새 전화번호를 등록할건지를 선택하여 동작
		 * 3. 전화번호 삭제
		 * 		- 이름으로 검색(성+이름)
		 *  	- 검색된 사람들 중에서 선택
		 *  	- 선택된 사람의 연락처를 삭제
		 * 4. 전화번호 조회
		 * 	- 이름으로 검색
		 * 	- 검색된 사람들 중에서 선택
		 * 	- 선택된 사람의 연락처를 출력
		 * 5. 프로그램 종료.
		 * */
		
		ArrayList<PhoneBook> list = new ArrayList<PhoneBook>();
		
		int menu = -1;
		
		do {
			ArrayList<PhoneNumber> number = new ArrayList<PhoneNumber>();
			System.out.println("===== '메뉴' =====");
			System.out.println("1. 전화번호 추가");
			System.out.println("2. 전화번호 수정");
			System.out.println("3. 전화번호 삭제");
			System.out.println("4. 전화번호 조회");
			System.out.println("5. 프로그램 종료.");
			System.out.println("===================");
			System.out.print("메뉴 선택 : ");
			
			menu = scan.nextInt();
			
			String name, rectal, phoneNum;
			
			switch(menu) {
			case 1:
				System.out.print("이름 입력: ");
				name = scan.next();
				scan.nextLine();
				
				for( ; ; ) {
					System.out.print("직장 입력: ");
					rectal = scan.nextLine();
					System.out.print("전화번호 입력: "); // => PhoneNumber
					phoneNum = scan.nextLine();
					
					PhoneNumber phoneNumber = new PhoneNumber(rectal, phoneNum);
					number.add(phoneNumber);
					//전화번호를 더 입력할건지 확인
					System.out.print("전화번호를 더 입력하시겠습니까? (y/n) : ");
					if(scan.next().charAt(0) == 'n') {
						break;
					}
					scan.nextLine();
				}
				//전화번호부에 추가 => PhoneBook 개체를 생성
				PhoneBook phoneBook = new PhoneBook(name , number);
				list.add(phoneBook);
				System.out.println(list);
				break;
			case 2:
				//이름이 포함된 전화번호부를 검색하여 출력(번호와 함께)
				System.out.print("이름 : ");
				scan.nextLine(); //공백 처리
				name = scan.nextLine();
				System.out.println("============");
				for(PhoneBook tmp : list) {
					if(tmp.getName().contains(name)) {
						System.out.println(tmp);
						System.out.println("============");
					}
				}
				
				//수정할 전화번호부를 선택
				
				 // 서브 메뉴 출력
				//서브메뉴 선택
				
				//서브메뉴 실행
				// 1. 이름, 직장수정
					//이름, 직장 입력
				
					// 이름, 직장 수정
				
				// 2. 기존 전화번호 수정
					// 기존 전화번호들을 출력
				
					// 수정할 전화번호를 선택
				
					// 이름, 번호를 입력
				
					// 선택한 이름, 번호를 수정
				// 3. 새 전화번호 추가
					// 이름 번호를 입력
				
					// 새 전화번호를 추가
				
				break;
			case 3:
				System.out.println("전화번호 삭제");
				//이름을 입력
				
				//이름이 포함된 전화번호부를 검색하여 출력(번호와 함께)
				
				//삭제할 전화본호부를 선택
				
				//전화번호를 삭제
				break;
			case 4:
				//이름을 입력
				
				//이름이 포함된 전화번호부를 검색하여 출력(번호와 함께)
				
				//조회할 전화본호부를 선택
				
				//전화번호 조회
				System.out.println("전화번호 조회");
				break;
			case 5:
				System.out.println("프로그램 종료...");
				break;
			default:
				System.out.println("잘못된 메뉴 선택....");
			}
			
		}while(menu != 5);
	}

}
