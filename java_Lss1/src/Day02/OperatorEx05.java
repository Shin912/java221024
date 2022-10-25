package Day02;

import java.util.Scanner;

public class OperatorEx05 {

	public static void main(String[] args) {
		/*홍길동 학생의 국어, 영어, 수학 점수를 콘솔에 입력받고,
		 * 홍길동 학생의 평균 성적을 콘솔에 출력하는 코드를 작성하세요
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("홍길동 학생의 국어점수를 입력하세요 : ");
		int korean = scan.nextInt();
		
		System.out.print("홍길동 학생의 영어점수를 입력하세요 : ");
		int english = scan.nextInt();
		
		System.out.print("홍길동 학생의 수학점수를 입력하세요 : ");
		int math = scan.nextInt();
		
		int totalscore = (korean + english + math);
		System.out.println("홍길동 학생의 총점수는 : " + totalscore + "입니다");
		
		double avg;
		avg = (double)totalscore / 3.0;
		System.out.println("홍길동 학생의 평균 점수는 : " + avg + "입니다");
		
				
		//통과 입니까? true/false
		//평균이 60점이상이면 ture, 아니면 false
		boolean isPass = avg >= 60;
		boolean isFail = avg < 60;
		System.out.println("통과입니까? " + isPass);
		System.out.println("탈락입니까? " + isFail);
		
		scan.close();
	}

}
