package exmple.db.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentVO {

	private String st_num;
	private String st_name;
	private int st_semester;
	private String st_state;
	private String st_pr_num;
	
	@Override
	public String toString() {
		return "\n학번 : " + st_num + " | 이름 : " + st_name + " | 학기 : " + st_semester 
				+ " | 상태 : " + st_state + " | 지도교수번호 : " + st_pr_num ;
	}
	
	
}
