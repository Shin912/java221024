package db.day01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import lombok.Data;


public class DBTest1_ex1 {

	static Statement stmt = null;
	static ResultSet rs = null;
	static PreparedStatement pstmt = null;
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		Connection con = null;
		 /* mysql : DBMS
       * localhost : 내부 로컬 주소-> 프로그램이 실행되는 서버와 DB가 같은 PC에 있는 경우
       * university : 데이터베이스명 
       */
		String url = "jdbc:mysql://localhost/university_te";
		String id = "root";
		String pw = "root";
		ArrayList<Student1> list = null;
		con = connect(url, id, pw);
		int menu = -1;
		do{
			print();
			menu = scan.nextInt();
			runMenu(menu, con, list);
			
		}while(menu != 3);
		
		connectClose(con);
	}

	public static void runMenu(int menu ,Connection con, ArrayList<Student1> list ) {
		switch(menu) {
		case 1:
			try {
				scan.nextLine();
				System.out.print("학번 입력: ");
				String num = scan.nextLine();
				System.out.print("이름 입력: ");
				String name = scan.nextLine();
				System.out.print("학기 입력(숫자만): ");
				int semester = scan.nextInt();
				scan.nextLine();
				System.out.print("상태 입력 (재학,휴학 등): ");
				String state = scan.nextLine();
				System.out.print("교수번호 입력: ");
				String st_pr_num = scan.nextLine();
				insertStudent(con, num, name, semester, state,st_pr_num);
			}catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		case 2:
			try {
				list = selectALLStudent(con);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		case 3: 
			System.out.println("프로그램 종료");
			break;
		default:
			System.out.println("잘못된 메뉴선택");
		}
	}
	public static void print() {
		System.out.println("1. 학생 정보 추가");
		System.out.println("2. 학생 정보 조회");
		System.out.println("3. 종료");
		System.out.print("메뉴 선택: ");
	}
	
	public static Connection connect(String url, String id, String pw) {
		Connection con = null;
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, id, pw);
			System.out.println("[연결 성공]");
		}
		catch(ClassNotFoundException e){
		    System.out.println("[드라이버 로딩 실패]");
		}
		catch(SQLException e){
		    System.out.println("[에러: " + e +"]");
		}
		return con;
	}
	
	public static void connectClose(Connection con) {
		try{
           if( con != null && !con.isClosed()){
               con.close();
               System.out.println("[연결 해제]");
           }
       }
       catch( SQLException e){
           e.printStackTrace();
       }
	}
	
	public static ArrayList<Student1> selectALLStudent(Connection con) throws SQLException {
		String sql = "select st_num, st_name, st_semester, st_state, st_pr_num from student";
		rs = stmt.executeQuery(sql);
		ArrayList<Student1> list = new ArrayList<Student1>();
		while(rs.next()) {
			String st_num = rs.getString(1);
			String st_name = rs.getString(2);
			int se_semester = rs.getInt(3);
			String st_state = rs.getString(4);
			String st_pr_num = rs.getString(5);
			
			Student1 std = new Student1(st_num, st_name, se_semester, st_state, st_pr_num);
			list.add(std);
		}
		return list;
	}

	public static void insertStudent(Connection con, String st_num, 
		String st_name, int st_semester, 
		String st_state, String st_pr_num)throws SQLException {
		
		String sql = ("insert into student(st_num, st_name, st_semester, "+
			"st_state, st_pr_num) values(?, ?, ?, ?, ?)");
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, st_num);
		pstmt.setString(2, st_name);
		pstmt.setInt(3, st_semester);
		pstmt.setString(4, st_state);
		pstmt.setString(5, st_pr_num);
		
		int count = pstmt.executeUpdate();
		if(count == 0) {
			System.out.println("[추가 실패]");
		}else {
			System.out.println("[추가 성공]");
		}
	}


}
/*
@Data
class Student1{
	private String st_num;
	private String st_name;
	private int st_semester;
	private String st_state;
	private String st_pr_num;
	
	public Student1(String st_num, String st_name, int st_semester, String st_state, String st_pr_num) {
		this.st_num = st_num;
		this.st_name = st_name;
		this.st_semester = st_semester;
		this.st_state = st_state;
		this.st_pr_num = st_pr_num;
	}
	
	
}
*/