package Day16;

import lombok.Data;

@Data
public class UserList1 {
	private String id;
	private String pw;
	private String name;
	private int age;
	private String userAccount;
	
	public UserList1(String id, String pw, String name, String userAccount, int age) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
		this.userAccount = userAccount;
	}

	@Override
	public String toString() {
		return "id : " + id + " pw : " + pw + " 이름 : " + name + 
				 " 주민번호 : " + userAccount + " 나이 : " + age ;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserList1 other = (UserList1) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	public UserList1(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}

	public void update(String pw, String name, String userAccount, int age) {
		this.pw = pw;
		this.name = name;
		this.age = age;
		this.userAccount = userAccount;
		
	}



	
}
