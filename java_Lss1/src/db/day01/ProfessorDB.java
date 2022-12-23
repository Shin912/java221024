package db.day01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import lombok.Data;

public class ProfessorDB {
	private Connection con;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public ProfessorDB(String url, String id, String pw) throws SQLException, Exception{
		connect(url, id, pw);
		stmt = con.createStatement();
	}
	
	private Connection connect(String url, String id, String pw) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(url, id, pw);
		System.out.println("[DB 연결 성공]");
		
		return con;
	}
	
	public ArrayList<Professor1> selectALLProfessor() throws SQLException {
		String sql = "select pr_num, pr_name, pr_state, pr_de_num, pr_tel from Professor";
		rs = stmt.executeQuery(sql);
		ArrayList<Professor1> list = new ArrayList<Professor1>();
		while(rs.next()) {
			String pr_num = rs.getString(1);
			String pr_name = rs.getString(2);
			String pr_state = rs.getString(3);
			String pr_de_num = rs.getString(4);
			String pr_tel = rs.getString(5);
			
			Professor1 pro = new Professor1(pr_num, pr_name, pr_state, pr_de_num, pr_tel);
			list.add(pro);
		}
		return list;
	}
	
	public void insertProfessor(String pr_num, String pr_name,
			String pr_state, String pr_de_num, String pr_tel)throws SQLException {
			
			String sql = ("insert into professor(pr_num, pr_name, pr_state, "+
				"pr_de_num, pr_tel) values(?, ?, ?, ?, ?)");
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, pr_num);
			pstmt.setString(2, pr_name);
			pstmt.setString(3, pr_state);
			pstmt.setString(4, pr_de_num);
			pstmt.setString(5, pr_tel);
			
			int count = pstmt.executeUpdate();
			if(count == 0) {
				System.out.println("[추가 실패]");
			}else {
				System.out.println("[추가 성공]");
			}
		}
}

@Data
class Professor1{
	private String pr_num;
	private	String pr_name;
	private String pr_state;
	private String pr_de_num;
	private String pr_tel;
	
	public Professor1(String pr_num, String pr_name, String pr_state, String pr_de_num, String pr_tel) {
		this.pr_num = pr_num;
		this.pr_name = pr_name;
		this.pr_state = pr_state;
		this.pr_de_num = pr_de_num;
		this.pr_tel = pr_tel;
	}
	
}