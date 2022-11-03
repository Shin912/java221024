package Day09;

public class AbstractionEx01 {

	public static void main(String[] args) {
		Student std1 = new Student("홍길동",1,1,1);
		std1.print();
		std1.scoreEdit(50, 30, 45);
		std1.print();

	}

}
/* 학생 성적 관리 프로그램에서 필요한 학생 클래스를 만들어 보세요.
 * 학생은 학년, 반, 번호, 이름, 성적을 관리
 * 성적은 국어, 영어, 수학 성적만 관리. 각 과목은 100점 만점을 기준으로 관리
 * 학생 정보 출력 기능
 * 성적을 수정하는 기능
 * - 국어
 * - 영어
 * - 수학
 * - 국어, 영어, 수학
 * */
class Student{
	private String name;
	private int grade;
	private int gradeClass;
	private int num;
	private int korScore;
	private int engScore;
	private int mathScore;
	
	public Student () {
		grade = 1;
		gradeClass = 1;
		num = 1;
		name ="";
	}
	public void print(){
		System.out.println( grade + "학년 " + gradeClass + "반 " + num + "번 " +
	name + "\n국어: " + korScore + " 영어: " + engScore + " 수학: " + mathScore);
	}
	
	public void korScoreEdit( int korScore1 ) { 
		korScore = korScore1;
	}
	public void engScoreEdit( int engScore1 ) { 
		engScore = engScore1;
	}
	public void mathScoreEdit( int mathScore1 ) { 
		mathScore = mathScore1;
	}
	public void scoreEdit( int korScore1 , int engScore1, int mathScore1) {
		korScoreEdit(korScore1);
		engScoreEdit(engScore1);
		mathScoreEdit(mathScore1);
	}
	public Student(String name1, int grade1, int gradeClass1, int num1) {
		name = name1;
		grade = grade1;
		gradeClass = gradeClass1;
		num = num1;
	}
	
}

