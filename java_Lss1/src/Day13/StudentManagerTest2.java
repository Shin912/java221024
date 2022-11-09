package Day13;

import java.util.Scanner;

public class StudentManagerTest2 {

	public static void main(String[] args) {
		/* 학생 성적 관리 프로그램을 작성하세요.
		 * - 작성하기 위해 필요한 작업들을 주석으로 정리해보세요.
		 * 1. 프로그램에 필요한 기능을 정리 
		 *  메뉴
		 *  1. 학생 정보 추가
		 *  2. 학생 성적 추가
		 *  3. 학생 정보 출력
		 *  4. 프로그램 종료
		 * 
		 * 2. 프로그램 실행 과정은 어떻게 할 건지?
		 *  기능
		 *  1. 학생정보 추가
		 *   - 학년, 반, 번호, 이름을 입력하여 학생 정보 추가
		 *   - 학년, 반, 번호가 같은 학생이 이미 있으면 추가하지 않음
		 *  2. 학생 성적 추가
		 *   - 학년, 반, 번호로 학생을 검색 한 후 있으면 성적을 추가
		 *   - 성적 추가시 과목명, 학기, 중간, 기말, 수행 평가를 입력하여 추가한다
		 *   - 이미 추가된 과목(학기랑 과목명이 같으면)이면 추가하지 않음
		 *  3. 학생 정보 출력
		 *  
		 * 3. 정보를 효율적으로 관리하기 위해 클래스를 만들것인가?
		 * 					 만든다면 어떤 클래스를 만들건지?
		 * 	- 학생클래스 HighStudent
		 * 	- 성적클래스 Score
		 * 
		 * 4. 프로그램 실행 과정을 주석으로 작성
		 * */
		
		Scanner scan = new Scanner(System.in);
		Student [] stds = new Student[30];
		int count = 0;
		int menu = -1;
		for ( ;menu != 4 ; ) {
			//메뉴출력
			printMenu();
			//메뉴선택
			menu = scan.nextInt();
			//메뉴에 맞는 기능 실행
			count = runMenu(menu, stds, count);
			
			
		}
		
	}

	private static int runMenu(int menu, Student[] stds, int count) {
		Scanner scan = new Scanner(System.in);
		switch(menu) {
		case 1:
		
			if(addStudent(stds, count)) {
				System.out.println("학생을 추가 했습니다.");
				count++;
			}else {
				System.out.println("학생을 추가하지 못했습니다.");
			}
			break;
			
		case 2:
			if(addScore(stds, count)) {
				System.out.println("성적을 등록했습니다.");
			}else {
				System.out.println("성적 등록에 실패했습니다.");
			}
			break;
			
		case 3:
			printStudentList(stds, count);
			break;
		case 4:
			System.out.println("프로그램 종료");
			break;
		default:
			System.out.println("잘못된 메뉴 선택입니다.");
		}
		return count;
	}

	private static void printStudentList(Student[] stds, int count) {
		for(int i=0; i<count; i++) {
			System.out.println(stds[i]);
			stds[i].printScore();
		}
		
	}

	private static boolean addScore(Student[] stds, int count) {
		System.out.println("성적 추가할 학생 정보를 입력: ");
		Student tmp = scanStudentBaseInfo();
		
		int index = indexOfStudent(stds, count, tmp);
		
		if(index == -1) {
			return false;
		}
		
		System.out.println("성적 정보를 입력");
		return stds[index].addScore(scanScore());
	}

	private static boolean addStudent(Student[] stds, int count) {
		Scanner scan = new Scanner(System.in);
		System.out.println("추가할 학생 정보를 입력");
		Student tmp = scanStudentBaseInfo();
		
		System.out.println("이름 : ");
		tmp.setName(scan.next());
		
		int index = indexOfStudent(stds, count, tmp);
		
		if(index == -1 && count < stds.length) {
			stds[count] = tmp;
			return true;
		}
		return false;
	}

	private static Score scanScore() {
		Scanner scan = new Scanner(System.in);
		System.out.print("과목: ");
		String title = scan.nextLine();
		System.out.print("학기:  ");
		int term = scan.nextInt();
		System.out.print("중간: ");
		int midScore = scan.nextInt();
		System.out.print("기말: ");
		int finnalScore = scan.nextInt();
		System.out.print("수행평가: ");
		int performance = scan.nextInt();
		return new Score(title, term, midScore, finnalScore, performance);
	}
	private static Student scanStudentBaseInfo() {
		Scanner scan = new Scanner(System.in);
		System.out.print("학년 : ");
		int grade = scan.nextInt();
		System.out.print("반 : ");
		int classNum = scan.nextInt();
		System.out.print("번호 : ");
		int num = scan.nextInt();
		return new Student(grade, classNum, num);
	}

	private static int indexOfStudent(Student[] stds, int count, Student tmp) {
		for(int i = 0; i<count; i++) {
			if(stds[i].equals(tmp)) {
				return i; 
			}
		}
		return -1;
	}

	private static void printMenu() {
		System.out.println("------메뉴-----");
		System.out.println("1. 학생 정보 추가");
		System.out.println("2. 학생 성적 추가");
		System.out.println("3. 학생 정보 출력");
		System.out.println("4. 프로그램 종료");
		System.out.print("메뉴 선택 :");
		
	}

}
