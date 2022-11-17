package Day19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class BookManagerMain {
	
	private static Scanner scan = new Scanner(System.in);

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
		 * */
		ArrayList<Book> list = new ArrayList<Book>();
		int menu = -1;
		
		do {
			printMenu();
			
			menu = scan.nextInt();
			
			runMenu(list, menu);
		}while(menu != 4);
	}


	public static void runMenu(ArrayList<Book> list, int menu) {
		
		switch(menu) {
		case 1:
			insertBook(list);
			break;
			
		case 2:
			System.out.println("ISBN으로 정렬");
			
			break;
		case 3:
			ArrayList<Integer> index = new ArrayList<Integer>();
			System.out.println("1.도서명으로 조회");
			System.out.println("2.저자 조회");
			System.out.println("3.출판사 조회");
			System.out.println("4.분류 조회");
			System.out.print("메뉴 선택: ");
			int subMenu = scan.nextInt();
			switch(subMenu) {
			case 1:
				//도서명으로 조회
				System.out.print("찾는 책 이름 입력 : ");
				String bookName = scan.next();
				for(int i =0; i<list.size(); i ++) {
					if(list.get(i).getBookName().equals(bookName))index.add(i);
					System.out.println(index.get(i));
				}
				break;
			case 2:
				//저자로 조회
				System.out.print("찾는 저자 입력 : ");
				break;
			case 3:
				//출판사로 조회
				System.out.print("찾는 출판사 입력 : ");
				break;
			case 4:
				//분류로 조회
				System.out.print("찾는 분류 입력 : ");
				break;
			default:
				System.out.println("메뉴 잘못 입력!");
			}
			break;
		case 4:
			System.out.println("프로그램 종료..!");
			break;
		default:
			System.out.println("잘못된 메뉴 선택");
		}
		
	}


	private static void insertBook(ArrayList<Book> list) {
		System.out.println("도서 추가");
		System.out.print("책이름 : ");
		scan.nextLine();
		String bookName = scan.nextLine();
		System.out.print("책분류(소설/잡지 등) : ");
		String type = scan.next();
		System.out.print("출판사 : ");
		String publisher = scan.next();
		scan.nextLine();
		System.out.print("책저자 : ");
		String author = scan.nextLine();
		System.out.print("ISBN : ");
		int isbn = scan.nextInt();
		System.out.print("가격 : ");
		int  money = scan.nextInt();
		
		Book book = new Book(bookName, type, publisher, author, isbn, money);
		
		list.add(book);
		
	}


	public static void printMenu() {
		System.out.println("====== 메뉴 =====");
		System.out.println("1. 도서 추가");
		System.out.println("2. ISBN 정렬 보기");
		System.out.println("3. 도서 조회");
		System.out.println("4. 프로그램 종료");
		System.out.println("=================");
		System.out.print("메뉴 선택 : ");
	}
	
}
