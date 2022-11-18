package Day20;

import lombok.Data;

@Data
public class PhoneNumber {
	private String rectal,phoneNum;
	
	public PhoneNumber (String rectal, String phoneNum) {
		this.rectal = rectal;
		this.phoneNum = phoneNum;
	}

	@Override
	public String toString() {
		return " \n직장 : " + rectal + ", 전화번호 : " + phoneNum + "\n";
	}
	
}
