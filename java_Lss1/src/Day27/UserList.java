package Day27;

import lombok.Data;

@Data
public class UserList {
	private String id, pw;
	
	public UserList ( String id, String pw ){
		this.id = id;
		this.pw = pw;
	}

	@Override
	public String toString() {
		return "id : " + id +"\npw : " + pw;
	}
	

	
}
