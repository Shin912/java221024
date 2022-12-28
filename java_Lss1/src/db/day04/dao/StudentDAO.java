package db.day04.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import db.day04.vo.CourseVO;
import db.day04.vo.StudentVO;

public interface StudentDAO {

	ArrayList<StudentVO> selectAllStudent();

	void insertStudent(@Param("std")StudentVO std);

	void insertCourse(CourseVO co);

	
}
