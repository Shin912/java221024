package kr.kh.test.service;

import java.util.ArrayList;

import kr.kh.test.vo.BoardTypeVO;

public interface AdminService {

	ArrayList<BoardTypeVO> getBoardType();

	boolean insertBoardType(BoardTypeVO bt);

	boolean updateBoardType(BoardTypeVO bt);

	boolean deleteBoardType(int bt_num);

}
