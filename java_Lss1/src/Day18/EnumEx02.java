package Day18;

import java.util.Scanner;

public class EnumEx02 {

	public static void main(String[] args) {
		/* 오늘의 요일을 영어로 입력받아 한글로 출력하는 코드를 작성
		 * 예)
		 * 요일 : WEDNESDAY
		 * 수요일
		 * */
		Scanner scan = new Scanner(System.in);
		System.out.print("요일을 입력하세요 (영어로) : ");
		String day = scan.next();
		if(day.equals("MONDAY") ) {
			System.out.println("월요일");
		}else if(day.equals("THESDAY")) {
			System.out.println("화요일");
		}else if(day.equals("WEDNESDAY")) {
			System.out.println("수요일");
		}else if(day.equals("THURSDAY")) {
			System.out.println("목요일");
		}else if(day.equals("FRIEDAY")) {
			System.out.println("금요일");
		}else if(day.equals("SATURDAY")) {
			System.out.println("토요일");
		}else if(day.equals("SUNDAY")) {
			System.out.println("일요일");
		}
		try {
			Week week = Week.valueOf(day);
			switch(week) {
			case MONDAY: 	System.out.println("월요일"); break;
			case THESDAY: 	System.out.println("화요일"); break;
			case WEDNESDAY:	 System.out.println("수요일"); break;
			case THURSDAY: 	System.out.println("목요일"); break;
			case FRIEDAY: 	System.out.println("금요일"); break;
			case SATURDAY: 	System.out.println("토요일"); break;
			case SUNDAY:	 System.out.println("일요일"); break;
			}
		}catch(Exception e) {
			System.out.println("잘못 입력했습니다.");
		}
	}
	
}
enum Week{
	MONDAY, THESDAY, WEDNESDAY, THURSDAY, FRIEDAY, SATURDAY, SUNDAY
}