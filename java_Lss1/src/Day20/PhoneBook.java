package Day20;

import java.util.ArrayList;

import lombok.Data;

@Data
public class PhoneBook {
		private String name, rectal;
		private ArrayList<PhoneNumber> phoneNumber;
		
		public PhoneBook (String name, ArrayList<PhoneNumber> phoneNumber) {
			this.name = name;
			this.phoneNumber = phoneNumber;
		}

		@Override
		public String toString() {
			return "이름 : " + name +  phoneNumber;
		}
		
}
