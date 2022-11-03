package Day09;

public class HighStudent {
	private String name;
	private int grade;
	private int gradeClass;
	private int num;
	private int korScore;
	private int engScore;
	private int mathScore;

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
	public HighStudent() {
		this(1, 1, 1, "");
	}

	public HighStudent(int grade1, int gradeClass1, int num1, String name1) {
		name = name1;
		grade = grade1;
		gradeClass = gradeClass1;
		num = num1;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}



