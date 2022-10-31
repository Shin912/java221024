package Day06;

public class ArrayRandomEx02 {

	public static void main(String[] args) {
		/* 랜덤으로 1~9사이의 숫자를 중복되지 않게 3개 생성하여 배열 저장하는 코드 작성
		 * */
		int min = 1, max = 9; //랜덤 수 범위
		int size = 3;
		int arr[] = new int[size]; //랜덤 수를 저장할 배열
		int count = 0; //저장된 랜덤 수의 갯수
		
		
		//배열에 저장된 중복되지 않는 수가 3개 될때까지 반복해야함
		while( count < 3 ) {
			int r = (int)(Math.random()*(max - min + 1)+min);
			boolean isDuplicated = false;
			
			for(int i = 0; i< count; i++) {
				if(arr[i] == r) {
					isDuplicated = true;
				}
			}
			
			if(isDuplicated) {
				continue;
			}else {
				arr[count] = r; //arr[count++] = r;
				count ++;
			}
		}
		for (int tmp:arr) {
			System.out.print(tmp + " ");
		}
		
		
		/*
		for(int i =0 ; i < arr.length ; i++) {
			//랜덤 한 수 생성
			int num = (int)(Math.random()*(max - min + 1)+min);
			//배열에 저장된 수 중에서 랜덤한 수와 일치하는 숫자 확인
			저장된 숫자개수만큼 반복=> i는 0번지부터 저장된 갯수보다 작을때 까지
				//배열에 저장된 숫자개수 만큼 확인
				//i번지에 있는 숫자와 랜덤수가 같으면 isDuplicated를 true
			있으면 다시 처음으로
			isDuplicated가 true이면
			없으면 배열에 저장하고, 저장된 갯수 1증가
			isDuplicated가 false
			if ( num == arr[i]) {
				}
			System.out.print( arr[i] + " " );
		}*/
	}

}
