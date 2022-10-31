package Day06;

import java.util.Scanner;

public class ArrayScoreEx01 {

	public static void main(String[] args) {
		/* 5명 학생의 국어, 영어, 수학 성적을 저장하기 위한 배열을 만들고,
		 * Scanner를 이용하여 입력받아, 국어 평균, 영어 평균, 수학 평균 을 
		 * 구하는 코드를 작성
		 * */
		
		Scanner scan = new Scanner(System.in);
		int stdCount = 5;
		int score = 0, i; 
		int kor[] = new int[stdCount];
		int eng[] = new int[stdCount];
		int math[] = new int[stdCount];
		int sum = 0;
		
		 //학생별 국어, 영어, 수학 성적을 입력
		 for ( i = 0; i<stdCount ; i++) {
			 System.out.print("학생" +(i+1) + " 국어, 영어, 수학 성적을 입력: ");
			 kor[i] = scan.nextInt();
			 eng[i] = scan.nextInt();
			 math[i] = scan.nextInt();
		 }
		 double korSum = 0, engSum = 0, mathSum = 0;
		 for(i = 0; i<stdCount; i++) {
			 korSum += kor[i];
			 engSum += eng[i];
			 mathSum += math[i];
		 }
		 System.out.println("국어 성적의 평균 : " + korSum / stdCount );
		 System.out.println("영어 성적의 평균 : " + engSum / stdCount );
		 System.out.println("수학 성적의 평균 : " + mathSum / stdCount );
		
		// 학생별 평균
		double stdAvg = 0;
		for(i = 0 ; i < stdCount; i++) {
			stdAvg = (kor[i]+eng[i]+math[i])/3;
			System.out.println( (i+1) + "학생의 평균은 = " + stdAvg);
		}
		
		/* 		for(i = 0, score =0; i<kor.length; i++) {
			System.out.print(i+1 + "번째 학생의 국어성적을 입력해주세요 : ");
			score = scan.nextInt();
			kor[i] = score;
		}
		for(i = 0; i < kor.length; i++) {
			sum += kor[i];
		}
		double koravg = (double)sum /kor.length;
		System.out.println();
		
		
		for(i = 0,score =0; i<eng.length; i++) {
			System.out.print(i+1 + "번째 학생의 영어성적을 입력해주세요 : ");
			score = scan.nextInt();
			eng[i] = score;
		}
		
		for(i = 0,sum=0; i < kor.length; i++) {
			sum += eng[i];
		}
		double engavg = (double)sum /eng.length;
		System.out.println();
		
		
		for(i = 0,score = 0; i<math.length; i++) {
			System.out.print(i+1 + "번째 학생의 수학성적을 입력해주세요 : ");
			score = scan.nextInt();
			math[i] = score;
		}
		for(i = 0, sum = 0; i < math.length; i++) {
			sum += math[i];
		}
		double mathavg = (double)sum /math.length;
		
		System.out.println();
		System.out.println("학생들의 국어 평균은 : " + koravg);
		System.out.println("학생들의 영어 평균은 : " + engavg);
		System.out.println("학생들의 수학 평균은 : " + mathavg);
		 * */
		scan.close();
	}

}
