package Day19;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexPhoneNumberEx01 {

	public static void main(String[] args) {
		/* 전화번호 정규 표현식을 작성하여 입력받은 번호가 전화번호가 맞는지 출력하는 코드
		 * 010-1234-1234
		 * 010-[0-9]{4}-[0-9]{4}
		 * 010-/d{4}-/d{4}
		 * 010(-/d{4}){2}
		 * */
		String phoneRegex =  "^010(-/d{4}){2}$";
		Scanner scan = new Scanner(System.in);
		System.out.print("전화번호 입력 : ");
		String str = scan.next();
		if(Pattern.matches(phoneRegex, str)) {
			System.out.println(str + "은 전화번호 형식입니다.");
		}else {
			System.out.println(str + "은 전화번호 형식이 아닙니다.");
		}

	}

}
