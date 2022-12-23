package db.day01;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProfessorMain {

	static Scanner scan = new Scanner(System.in);
	static ProfessorDB proDB;
	static ArrayList<Professor1> list = new ArrayList<Professor1>();
	
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost/university_te";
        String id = "root";
        String pw = "root";
        
        try {
			proDB = new ProfessorDB(url, id, pw);
		}catch (Exception e) {
			System.out.println("[DB연결 실패]");
			System.out.println("[프로그램 종료]");
			return;
		}
        
        int menu = -1;
        load();
        do {
        	printMenu();
        	menu = scan.nextInt();
        	scan.nextLine();
        	runMenu(menu);
        }while(menu != 3);

	}
	
	private static void load() {
		try {
			list = proDB.selectALLProfessor();
		} catch (SQLException e) {
			System.out.println("[로딩 실패]");
		}
		
	}

	private static void runMenu(int menu) {
		switch(menu) {
		case 1:
			insertProfessor();
			break;
		case 2:
			printProfessorList();
			break;
		case 3: 
			System.out.println("프로그램을 종료합니다.");
			break;
		default:
			System.out.println("잘못된 메뉴입니다.");
		}
	}
	
	private static void insertProfessor() {
		System.out.print("교수번호 : ");
		String pr_num = scan.nextLine();
		System.out.print("이름 : ");
		String pr_name = scan.nextLine();
		System.out.print("직위(정교수/부교수 등) : ");
		String pr_state = scan.nextLine();
		System.out.print("학부번호 : ");
		String pr_de_num = scan.nextLine();
		System.out.print("전화번호 : ");
		String pr_tel = scan.nextLine();
		try {
			proDB.insertProfessor(pr_num, pr_name, pr_state, pr_de_num, pr_tel);
			Professor1 pro = new Professor1(pr_num, pr_name, pr_state, pr_de_num, pr_tel);
			list.add(pro);
			Collections.sort(list,(o1,o2)->{
				return o1.getPr_num().compareTo(o2.getPr_num());
			});
		} catch (SQLException e) {
			System.out.println("학생 등록에 실패했습니다.");
		}
	}
		
	private static void printProfessorList() {
		if(list.size() == 0)
			System.out.println("저장된 학생 정보가 없습니다.");
		for(Professor1 pro : list) {
			System.out.println(pro);
		}
	}
	
	private static void printMenu() {
		System.out.println("메뉴");
		System.out.println("1. 교수 등록");
		System.out.println("2. 교수 조회");
		System.out.println("3. 프로그램 종료");
		System.out.print("메뉴 선택 : ");
	}
}
