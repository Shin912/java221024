package Day06;

import java.util.Scanner;

public class ArrayUpDownEx01 {

	public static void main(String[] args) {
		/* up down 게임을 무조건 3번 반복해서 맞춘 3번의 횟수를 
		 * 배열에 저장하여 출력하는 코드를 작성하세요.
		 * */
		
		Scanner scan = new Scanner(System.in);
		int min = 1, max = 10;
		int coin = 3;
		int record[] = new int[coin];
		
		while(coin-- > 0) {
			int r = (int)(Math.random()*(max - min + 1)+min);
			System.out.println(r);
			System.out.println(min + " ~ " + max + "사이의 랜덤한 수를 맞추세요. :");
			int num;
			int tryCount = 0;
			do {
				tryCount++;
				System.out.print("숫자 입력: ");
				num = scan.nextInt();
				if(r == num) {
					System.out.println("정답입니다. ");
					record[record.length - coin - 1] = tryCount;
					}else if(r < num) {
						System.out.println("Down");
					}else if(r > num) {
						System.out.println("Up");
					}			
				
			}while( r!=num );
		}
		for(int i = 0 ;  i<record.length; i++) {
			System.out.println((i+1) +"번째 게임 횟수 : " + record[i]);
		}
		/*
		for ( i = 0 ; i < coin ; i++ ) {
			int r = (int)(Math.random()*(max - min + 1)+min);
			int num = min -1;
			for( int count = 0 ; r != num ; ) {
				System.out.print("1 ~ 10중 숫자 하나를 입력하세요 : ");
				num = scan.nextInt();
				if(r == num) {
					count++;
					record[i] += count;
					System.out.println("정답입니다. ");
					}else if(r < num) {
						System.out.println("Down");
						count++;
					}else if(r > num) {
						System.out.println("Up");
						count++;
					}			
				}
			System.out.print(record[i] + " ");	
		}
		*/

	}

}
