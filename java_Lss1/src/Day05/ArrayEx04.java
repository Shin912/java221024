package Day05;

import java.util.Scanner;

public class ArrayEx04 {

	public static void main(String[] args) {
		/* 학생 5명의 국어 성적(정수)을 입력받고 출력하는 코드를 작성하세요.
		 * */
		Scanner scan = new Scanner(System.in);
		int score;
		int arr[] = new int[5];
		for(int i = 0; i < arr.length ; i++) {
			System.out.print(i+1 + "번째 학생의 성적을 입력해주세요 : ");
			score = scan.nextInt();
			arr[i] = score;
			System.out.println( i+1 + "번째 학생의 성적 : " + arr[i]);

		}
		/* 학생 성적의 평균을 구하는 코드를 작성하세요.
		 * */
		int sum = 0;
		for(int i = 0; i < arr.length ; i++) {
			sum += arr[i];
		}
		double avg = (double)sum / arr.length;
		System.out.println("학생들의 평균은 : " + avg);
		System.out.println();
		
		sum = 0; // 향상된 for문 이용
		for( int tmp : arr) {
			sum += tmp;
		}
		System.out.println("학생들의 평균은 : " + avg);
		
		scan.close();
	}

}
