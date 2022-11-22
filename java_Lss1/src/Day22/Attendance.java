package Day22;

import java.util.ArrayList;

import lombok.Data;

@Data
public class Attendance {
	ArrayList<Student> std = new ArrayList<Student>();
	ArrayList<Log> logs = new ArrayList<Log>();
}
