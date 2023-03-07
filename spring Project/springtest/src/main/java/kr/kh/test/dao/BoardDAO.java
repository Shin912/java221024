package kr.kh.test.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import kr.kh.test.vo.BoardTypeVO;
import kr.kh.test.vo.BoardVO;
import kr.kh.test.vo.MemberVO;

public interface BoardDAO {

	ArrayList<BoardTypeVO> selectAllBoardType(@Param("authority")int authority);

	BoardTypeVO selectBoardTypeByName(@Param("bt_name")String bt_name);

	int insertBoardType(@Param("bt")BoardTypeVO bt);

	boolean updateBoardType(@Param("bt")BoardTypeVO bt);

	boolean deleteBoardType(@Param("bt_num")int bt_num);

	ArrayList<BoardTypeVO> selectBoardTypeByName(@Param("me")MemberVO user);

	void insertBoard(@Param("bo")BoardVO board);

}
