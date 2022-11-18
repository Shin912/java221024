package Day20;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManagerMain_01 {

	public static void main(String[] args) {
		/* 도서 관리 프로그램을 작성하세요
		 * 도서 정보 : 
		 *  - 도서명, 저자(여러명, 엮은이, 옮긴이 다 포함 ) , 가격 , 출판사, 분류 , isbn
		 *  기능
		 *  - 도서 추가
		 *  - ISBN으로 정렬
		 *  - 도서 조회
		 *   - 도서명으로 조회
		 *   - 저자로 조회
		 *   - 출판사로 조회
		 *   - 분류로 조회
		 *   */
		//반복
		int menu = -1;
		Scanner scan = new Scanner(System.in);
		ArrayList<Book_01> list = new ArrayList<Book_01>();
		do {
			//메뉴 출력
			System.out.println("====== 메뉴 =====");
			System.out.println("1. 도서 추가");
			System.out.println("2. 도서 조회");
			System.out.println("3. 프로그램 종료");
			System.out.println("=================");
			System.out.print("메뉴 선택 : ");
			//메뉴 선택
			menu = scan.nextInt();
			System.out.println("==============");
			String title, author, publisher, genre, isbn;
			int price;
			//선택한 메뉴에 따른 기능 실행
			switch(menu) {
				//선택 메뉴가 1번이면 도서 추가
			case 1:
				//추가할 도서 정보를 입력
				scan.nextLine();//엔터 처리
				System.out.print("도서명 : ");
				title = scan.nextLine();
				System.out.print("저자 : ");
				author = scan.nextLine();
				System.out.print("가격 : ");
				price = scan.nextInt();
				scan.nextLine(); //엔터 처리
				System.out.print("출판사 : ");
				publisher = scan.nextLine();
				System.out.print("장르 : ");
				genre = scan.nextLine();
				System.out.print("ISBN : ");
				isbn = scan.next();
				
				//도서 목록에 새 도서를 추가
				//위에서 입력받은 도서 정보를 이용하여 도서 객체를 생성
				Book_01 book = new Book_01(title, author, publisher, genre, isbn, price);
				//생성된 도서 객체를 리스트에 추가
				//isbn 중복 체크해서 중복되면 건너띔
				//중복 : 리스트에 book객체가 포함되었다
				if(list.contains(book)) {
					System.out.println("이미 죽봉된 ISBN 입니다.");
					System.out.println("======================");
					continue;
				}
				//중복되지 않으면 추가
				list.add(book);
				System.out.println("도서 추가 완료...!!");
				System.out.println(list);
				break;
				//선택 메뉴가 2번이면 도서 조회
			case 2:
				/*	 - 도서명으로 조회
				 *   - 저자로 조회
				 *   - 출판사로 조회
				 *   - 분류로 조회
				 *   */
				//서브 메뉴 출력
				System.out.println("======'조회 메뉴'======");
				System.out.println("1. 도서명으로 조회");
				System.out.println("2. 저자로 조회");
				System.out.println("3. 출판사로 조회");
				System.out.println("4. 분류로 조회");
				System.out.println("5. 취소");
				System.out.println("====================");
				System.out.print("조회 메뉴 선택 : ");
				//서브 메뉴 선택
				int subMenu = scan.nextInt();
				System.out.println("============");
				//선택한 서브 메뉴 실행
				int count = 0;
				switch(subMenu) {
				//서브메뉴가 1이면 도서명으로 조회
				case 1:
					System.out.print("도서명 : ");
					scan.nextLine(); //공백 처리
					title = scan.nextLine();
					System.out.println("============");
					for(Book_01 tmp : list) {
						if(tmp.getTitle().contains(title.trim())) {
							System.out.println(tmp);
							System.out.println("============");
							count++;
						}
					}
					if(count == 0) {
						System.out.println("검색 결과가 없습니다.");
						System.out.println("============");
					}
					break;
				//서브메뉴가 2이면 저자로 조회
				case 2:
					System.out.print("저자 : ");
					scan.nextLine(); //공백 처리
					author = scan.nextLine();
					System.out.println("============");
					for(Book_01 tmp : list) {
						if(tmp.getAuthor().contains(author.trim())) {
							System.out.println(tmp);
							System.out.println("============");
							count++;
						}
					}
					if(count == 0) {
						System.out.println("검색 결과가 없습니다.");
						System.out.println("============");
					}
					break;
				//서브메뉴가 3이면 출판사로 조회
				case 3:
					System.out.print("출판사 : ");
					scan.nextLine(); //공백 처리
					publisher = scan.nextLine();
					System.out.println("============");
					for(Book_01 tmp : list) {
						if(tmp.getPublisher().contains(publisher.trim())) {
							System.out.println(tmp);
							System.out.println("============");
							count++;
						}
					}
					if(count == 0) {
						System.out.println("검색 결과가 없습니다.");
						System.out.println("============");
					}
					break;
				//서브메뉴가 4이면 분류로 조회
				case 4:
					System.out.print("분류 : ");
					scan.nextLine(); //공백 처리
					genre = scan.nextLine();
					System.out.println("============");
					for(Book_01 tmp : list) {
						if(tmp.getGenre().contains(genre.trim())) {
							System.out.println(tmp);
							System.out.println("============");
							count++;
						}
					}
					if(count == 0) {
						System.out.println("검색 결과가 없습니다.");
						System.out.println("============");
					}
					break;
				//서브메뉴가 5면 취소
				case 5:
					System.out.println("조회를 취소...");
					System.out.println("============");
					break;
				//잘못된 서브메뉴이면 잘못됐다고 출력
				default:
					System.out.println("잘못된 조회 메뉴 선택 !!");
					System.out.println("============");
				}
				break;
				//선택 메뉴가 3번이면 프로그램 종료 출력
			case 3:
				System.out.println("프로그램 종료..!");
				break;
				//선택 메뉴가 1,2,3이 아니면 잘못된 메뉴라고 출력
			default:
			}
		}while(menu != 3);
		scan.close();
	}

}
