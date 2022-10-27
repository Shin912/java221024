package Day04;

public class NestingForStarEx02 {

	public static void main(String[] args) {
		/* *
		 * **
		 * ***
		 * ****
		 * *****
		 * */
		
		int i, j;
		
		for( i = 1; i <= 5; i++) {
			for( j = 1 ; j <= i; j++) {
				System.out.print("*");
				}
			System.out.println();
		}
		
		/*      *
		 *     **
		 *    ***
		 *   ****
		 *  *****   
		 * */
		
		for( i = 1; i <= 5; i++) {
			for( j = 1 ; j <= 5-i ; j++) {
				System.out.print(" ");
			}
			for( j = 1 ; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*     *
		 *    ***
		 *   *****
		 *  *******
		 *  
		 * */
		
		for( i = 1 ; i <= 5; i++) {
			//공백
			for(j = 1 ; j <= 5-i; j++) {
				System.out.print(" ");
			}
			//* row개
			for(j = 1 ; j <= i; j++) {
				System.out.print("*");
			}
			//* row-1개
			for(j = 1 ; j <= i-1; j++) {
				System.out.print("*");
			}
			//엔터
			System.out.println(" ");
		}
		
	}

}
