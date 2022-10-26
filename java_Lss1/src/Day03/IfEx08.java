package Day03;

import java.util.Scanner;

public class IfEx08 {

	public static void main(String[] args) {
		/* 정수를 정수로 입력받아 입력받은 성적에 맞는 학점을 출력하는 코드를 작성
		 * A : 90 ~ 100
		 * B : 80 ~ 89
		 * C : 70 ~ 79
		 * D : 60 ~ 69
		 * F : 0 ~ 59
		 * 그외 : 잘못된 성적
		 * */
		Scanner scan = new Scanner(System.in);
		System.out.print("성적을 입력해주세요 : ");
		int score = scan.nextInt();
		
		if(score <= 100 && score >= 90) {
			System.out.println("학생의 학점은 : " + score + " A");
		}else if(score <= 89 && score >= 80 ) {
			System.out.println("학생의 학점은 : " + score + " B");
		}else if(score <= 79 && score >= 70 ) {
			System.out.println("학생의 학점은 : " + score + " C");
		}else if(score <= 69 && score >= 60 ) {
			System.out.println("학생의 학점은 : " + score + " D");
		}else if(score <= 59 && score >= 0 ) {
			System.out.println("학생의 학점은 : " + score + " F");
		}else {
			System.out.println(score + "점은 잘 못된 성적입니다.");
		}
		
		// || : OR연산자
		if(score > 100 || score < 0) {
			System.out.println(score + "점은 잘 못된 성적입니다.");
		}else if(score >= 90 ) {
			System.out.println("학생의 학점은 : " + score + " A");
		}else if(score >= 80 ) {
			System.out.println("학생의 학점은 : " + score + " B");
		}else if(score >= 70 ) {
			System.out.println("학생의 학점은 : " + score + " C");
		}else if(score >= 60 ) {
			System.out.println("학생의 학점은 : " + score + " D");
		}else {
			System.out.println("학생의 학점은 : " + score + " F");
		}

		scan.close();


	}

}
