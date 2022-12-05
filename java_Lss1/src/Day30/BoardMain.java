package Day30;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardMain {
		/* 기능
		 *  - 게시글 등록
		 *  - 게시글 수정
		 *  - 게시글 삭제
		 *  - 게시글 목록
		 *  - 게시글 확인
		 *  	-댓글 등록
		 *  	-댓글 확인
		 *  	- 이전
		 *  - 프로그램 종료*/
	public static Scanner scan = new Scanner(System.in);
	public static List<Board> boardList = new ArrayList<Board>();
	public static List<Coment> comentList = new ArrayList<Coment>(); 
	
	public static void main(String[] args) {
		
		
		//메뉴를 출력하고, 입력한 메뉴가 프로그램 종료가 아니면 반복하는 코드를 작성
		int menu = -1;
		do {
			printMenu();
			menu = scan.nextInt();
			runMenu(menu);
		}while(menu != 6);
	}
	/** 메뉴를 출력하는 메소드
	 * */
	public static void printMenu() {

		System.out.println("===================");
		System.out.println("1. 게시글 등록");
		System.out.println("2. 게시글 수정");
		System.out.println("3. 게시글 삭제");
		System.out.println("4. 게시글 목록");
		System.out.println("5. 게시글 확인");
		System.out.println("6. 프로그램 종료");
		System.out.println("===================");
		System.out.print("메뉴 선택 : ");
	}
	
	/** runMenu
	 * 메뉴가 주어지면 주어진 메뉴에 맞는 기능을 출력하는 메소드
	 * @param menu 
	 * */
	public static void runMenu(int menu) {
		switch(menu) {
		case 1:
			insertBoard();
			break;
		case 2:
			updateBoardList();
			break;
		case 3:
			deleteBoardList();
			break;
		case 4:
			printBoardList();
			break;
		case 5:
			printBoard();
			break;
		case 6:
			System.out.println("프로그램 종료");
			break;
		default:
			System.out.println("잘못된 메뉴 입력");
		}
	}

	/**insertBoard
	 * 게시글 정보를 입력받아 게시글을 출력하는 메소드
	 * 메소드 구현에 필요한 필드를 추가해도 됨
	 * */
	public static void insertBoard() {
		
		int boardNum = inputBoardNum();
		
		Board board = inputBoard(boardNum);
		
		boardList.add(board);
	}
	
	/**inputBoardNum : Scanner를 통해 번호를 입력받아 알려주는 메소드
	 * @return 입력받은 게시글 번호 
	 * */
	public static int inputBoardNum() {
		System.out.print("게시글 번호 입력: ");
		int boardNum = scan.nextInt();
		scan.nextLine();
		return boardNum;
	}
	
	/**inputBoard : 게시글 번호가 주어지면 제목, 내용, 작성자 입력하여
	 * 				게시글 객체를 반환하는 메소드
	 * @param num 게시글 번호
	 * @return 게시글 객체
	 * */
	public static Board inputBoard(int boardNum) {
		System.out.print("제목 : ");
		String title = scan.nextLine();
		System.out.print("작성자 : ");
		String writer = scan.nextLine();
		System.out.print("내용 : ");
		String contents = scan.nextLine();
		//객체 생성
		return new Board(boardNum, title, contents, writer);
	}
	/**updateBoard : 게시글 리스트에 주어진 게시글을 수정하는 메소드로 수정하면
	 * 				true를 실패하면 false를 반환 
	 * @param boardList 게시글 리스트
	 * @param board 수정할 게시글
	 * @return 수정 성공 true, 실패 false
	 * */
	public static boolean updateBoard(List<Board> boardList,Board board) {
		if(boardList.size() == 0)
			//게시글이 없으면 리턴
			return false;
		int index = boardList.indexOf(board);
		if(index == -1) {
			System.out.println("등록되지 않거나 삭제된 게시글입니다.");
			return false;
		}
		boardList.set(index, board);
		
		return true;
	}
	/**updateBoardList : 게시글 정보를 입력받아 수정하는 메소드
	 * 
	 * */
	public static void updateBoardList() {
		int num = inputBoardNum();
		Board board = inputBoard(num);
		
		if(updateBoard(boardList, board)) {
			System.out.println("게시글을 수정했습니다.");
		}else {
			System.out.println("게시글을 수정하지 못했습니다.");
		}
		System.out.println(boardList);
	}
	
	/**deleteBoard : 게시글 리스트에 주어진 게시글을 삭제하는 메소드
	 * @param boardList 게시글 리스트
	 * @param num 삭제할 게시글 번호
	 * @return 삭제 성공 true, 실패 false
	 * */
	public static boolean deleteBoard(List<Board> boardList, int boardNum) {
		Board board = new Board(boardNum);
		return boardList.remove(board);
	}
	
	/**deleteBoardList : 게시글 번호를 입력 받아 삭제하는 메소드
	 * */
	public static void deleteBoardList() {
		int num = inputBoardNum();
		if(deleteBoard(boardList, num)) {
			System.out.println("게시글 삭제");
		}else {
			System.out.println("게시글 삭제 실패.");
		}
	}
	
	/**printBoardList : 게시글 전체를 출력하는 메소드 
	 * */
	public static void printBoardList() {
		boardList.forEach(b->System.out.println(b));
		/*if(boardList.size() == 0) {
			printStr("등록된 게시글이 없습니다.");
			return;
		}
		for(Board tmp : boardList) {
			System.out.println(tmp);
		}*/
	}
	/**printSubmenu : 게시글 확인에서 필요한 서브 메뉴를 출력
	 * */
	public static void printSubmenu() {
		System.out.println("1. 댓글 등록");
		System.out.println("2. 댓글 확인");
		System.out.println("3. 이전");
		System.out.println("===============");
		System.out.print("메뉴 선택 : ");
	}
	/** runPrintSubmenu : 선택한 서브 메뉴를 실행하는 메소드,
	 * 					우선은 서브 메뉴를 선택하면 선택한 서브메뉴를
	 * 					콘솔에 출력하는 기능으로 일단 구현
	 *@param submenu 선택한 서브 메뉴
	 *@param boardNum 선택한 게시글 번호
	 * */
	public static void runPrintSubmenu(int subMenu, int boardNum) {
		switch(subMenu) {
		case 1:
			insertComentList(boardNum);
			break;
		case 2:
			insertComentList(boardNum);
			break;
		case 3:
			System.out.println("3. 이전");
			break;
		default:
			System.out.println("잘못된 메뉴 입력");
		}
	}
	
	/**printBoard : 게시글 번호를 입력받아 입력받은 게시글을 출력하고
	 * 				서브메뉴를 출력하고, 서브메뉴를 선택하면 
	 * 				선택한 서브메뉴 실행하는 메소드
	 * */
	public static void printBoard() {
		int num = inputBoardNum();
		Board board = new Board(num); // 게시글 번호 찾기
		System.out.println(board);
		int index = boardList.indexOf(board);
		if(index == -1) {
			System.out.println("등록되지 않았거나 삭제된 게시글입니다.");
			return;
		}
		board = boardList.get(index);
		board.print();
		
		int subMenu = -1;
		while(subMenu != 3) {
			printSubmenu();
			subMenu = scan.nextInt();
			scan.nextLine();
			
			runPrintSubmenu(subMenu, num);
		}
	}
	
	/**insertComent
	 * @param comentList 댓글 리스트
	 * @param coment 댓글
	 * @return 댓글 추가 여부 
	 * */
	public static boolean insertComent(List<Coment> comentList, Coment coment) {
		int index = comentList.indexOf(coment);
		if(index != -1) {
			System.out.println("이미 등록된 댓글 번호입니다.");
			return false;
		}
		comentList.add(coment);
		return true;
	}
	
	/**insertCommentList : 댓글 정보를 입력 받아 댓글을 추가하는 메소드 
	 * @param boardNum 선택한 게시글 번호
	 * */
	public static void insertComentList(int boardNum) {
		int num = inputBoardNum();
		System.out.print("작성자 : ");
		String writer = scan.nextLine();
		System.out.print("내용 : ");
		String contents = scan.nextLine();
		
		Coment coment = new Coment(num,contents, writer, boardNum);
		if(insertComent(comentList, coment)) {
			System.out.println("댓글 등록이 완료됐습니다.");
		}else {
			System.out.println("이미 등록된 번호입니다.");
		}
	}
	
	/**printComentList : 선택한 게시글에 있는 댓글들을 확인하는 메소드
	 * @param boardNum 게시글 번호
	 * */
	public static void printcomentList(int boardNum) {
		if(comentList.size() == 0) {
			System.out.println("등록된 댓글이 없습니다.");
			return;
		}
		int count = 0;
		comentList.forEach(c->{
			if(c.getBoardNum() == boardNum) {
				System.out.println(c);
				//count++;
			}
		});
	}
}
