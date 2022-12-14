package Day20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.function.Predicate;

public class BookManagerMain_02 {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int menu = -1;
		ArrayList<Book_01> list = new ArrayList<Book_01>();
		do {
			//메뉴 출력
			printMenu();
			//메뉴 선택
			menu = scan.nextInt();
			printBar();
			
			//선택한 메뉴에 따른 기능 실행
			runMenu(menu, list);
		}while(menu != 3);
		scan.close();
	}
	
	public static void printMenu() {
		System.out.println("====== 메뉴 =====");
		System.out.println("1. 도서 추가");
		System.out.println("2. 도서 조회");
		System.out.println("3. 프로그램 종료");
		printBar();
		System.out.print("메뉴 선택 : ");
	}
	
	public static void printBar() {
		System.out.println("=================");
	}
	
	public static void runMenu(int menu, ArrayList<Book_01> list) {
		switch(menu) {
			//선택 메뉴가 1번이면 도서 추가
		case 1:
			//추가할 도서 정보를 입력받아 도서 객체를 생성
			Book_01 book = createBook();
			
			if(!insertBook(list, book)) {
				System.out.println("이미 죽봉된 ISBN 입니다.");
			}else
				System.out.println("도서 추가 완료..!");
			printBar();
			break;
			
			//선택 메뉴가 2번이면 도서 조회
		case 2:
			//서브 메뉴 출력
			printSearchMenu();
			//서브 메뉴 선택
			int subMenu = scan.nextInt();
			printBar();
			//선택한 서브 메뉴 실행
			runPrintMenu(subMenu, list);
			break;
			
			//선택 메뉴가 3번이면 프로그램 종료 출력
		case 3:
			System.out.println("프로그램 종료..!");
			break;
			//선택 메뉴가 1,2,3이 아니면 잘못된 메뉴라고 출력
		default:
		}
	}
	public static Book_01 createBook() {
		scan.nextLine();//엔터 처리
		System.out.print("도서명 : ");
		String title = scan.nextLine();
		System.out.print("저자 : ");
		String author = scan.nextLine();
		System.out.print("가격 : ");
		int price = scan.nextInt();
		scan.nextLine(); //엔터 처리
		System.out.print("출판사 : ");
		String publisher = scan.nextLine();
		System.out.print("장르 : ");
		String genre = scan.nextLine();
		System.out.print("ISBN : ");
		String isbn = scan.next();
		
		//도서 목록에 새 도서를 추가
		//위에서 입력받은 도서 정보를 이용하여 도서 객체를 생성
		return new Book_01(title, author, publisher, genre, isbn, price);
	}
	public static boolean insertBook(ArrayList<Book_01> list, Book_01 book	) {
		if(list.contains(book)) {
			System.out.println("이미 죽봉된 ISBN 입니다.");
			return false;// 반복문은 continue 없으면 return
		}
		//중복되지 않으면 추가
		list.add(book);
		Collections.sort(list, (o1, o2)-> o1.getIsbn().compareTo(o2.getIsbn()));
		return true;
	}
	public static void printSearchMenu() {
		System.out.println("======'조회 메뉴'======");
		System.out.println("1. 도서명으로 조회");
		System.out.println("2. 저자로 조회");
		System.out.println("3. 출판사로 조회");
		System.out.println("4. 분류로 조회");
		System.out.println("5. 취소");
		printBar();
		System.out.print("조회 메뉴 선택 : ");
	}
	public static void runPrintMenu(int subMenu, ArrayList<Book_01> list) {
		String title, author, publisher, genre;
		int count = 0;
		switch(subMenu) {
		//서브메뉴가 1이면 도서명으로 조회
		case 1:
			System.out.print("도서명 : ");
			scan.nextLine(); //공백 처리
			title = scan.nextLine();
			printBar();
			printBookList(list, b->b.getTitle().contains(title.trim()));
			break;
		//서브메뉴가 2이면 저자로 조회
		case 2:
			System.out.print("저자 : ");
			scan.nextLine(); //공백 처리
			author = scan.nextLine();
			printBar();
			printBookList(list, b->b.getAuthor().contains(author.trim()));
			break;
		//서브메뉴가 3이면 출판사로 조회
		case 3:
			System.out.print("출판사 : ");
			scan.nextLine(); //공백 처리
			publisher = scan.nextLine();
			printBar();
			printBookList(list, b->b.getPublisher().contains(publisher.trim()));
			break;
		//서브메뉴가 4이면 분류로 조회
		case 4:
			System.out.print("분류 : ");
			scan.nextLine(); //공백 처리
			genre = scan.nextLine();
			printBar();
			printBookList(list, b->b.getGenre().contains(genre.trim()));
			break;
		//서브메뉴가 5면 취소
		case 5:
			System.out.println("조회를 취소...");
			printBar();
			break;
		//잘못된 서브메뉴이면 잘못됐다고 출력
		default:
			System.out.println("잘못된 조회 메뉴 선택 !!");
			printBar();
		}
	}
	public static void printBookList(ArrayList<Book_01> list, Predicate<Book_01> p) {
		int count = 0;
		for(Book_01 tmp : list) {
			if(p.test(tmp)) {
				System.out.println(tmp);
				printBar();
				count++;
			}
		}
		if(count == 0) {
			System.out.println("검색 결과가 없습니다.");
			printBar();
		}
	}
}
