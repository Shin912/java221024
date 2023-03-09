package kr.kh.test.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kr.kh.test.utils.UploadFileUtils;
import kr.kh.test.vo.FileVO;
import kr.kh.test.dao.BoardDAO;
import kr.kh.test.pagination.Criteria;
import kr.kh.test.vo.BoardTypeVO;
import kr.kh.test.vo.BoardVO;
import kr.kh.test.vo.MemberVO;

@Service
public class BoardServiceImp implements BoardService{
	@Autowired
	BoardDAO boardDao;
	
	String uploadPath = "D:\\uploadfiles";

	@Override
	public ArrayList<BoardTypeVO> getBoardTypeList(MemberVO user) {
		if(user == null || user.getMe_authority() == 0)
			return null;
		return boardDao.selectBoardTypeList(user.getMe_authority());
	}
	
	public void uploadFiles(MultipartFile[] files, int bo_num) {
		if(files == null || files.length == 0)
			return;
		for(MultipartFile file : files) {
			if(file == null || file.getOriginalFilename().length() == 0)
				continue;
			try {
				String path = UploadFileUtils.uploadFile(uploadPath, 
						file.getOriginalFilename(), //파일명
						file.getBytes()); //실제 파일 데이터
				FileVO fileVo = new FileVO(file.getOriginalFilename(), path, bo_num);
				boardDao.insertFile(fileVo);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public boolean insertBoard(BoardVO board, MemberVO user, MultipartFile[] files) {
		if(user == null || user.getMe_authority() == 0)
			return false;
		if(board == null || 
			board.getBo_title().trim().length() == 0 ||
			board.getBo_content().trim().length() == 0 ||
			board.getBo_bt_num() == 0)
			return false;
		
		board.setBo_me_id(user.getMe_id());
		
		int isOk = boardDao.insertBoard(board);
		
		if(isOk == 0)
			return false;
		uploadFiles(files, board.getBo_num());
		return true;
	}

	@Override
	public ArrayList<BoardVO> getBoardList(Criteria cri) {
		cri = cri == null ? new Criteria() : cri;
		return boardDao.selectBoardList(cri);
	}

	@Override
	public int getTotalCountBoard(Criteria cri) {
		cri = cri == null ? new Criteria() : cri;
		return boardDao.selectTotalCountBoard(cri);
	}

	@Override
	public BoardVO getBoardAndUpdateView(int bo_num) {
		
		int res;
		res = boardDao.updateViews(bo_num);
		if(res == 0)
			return null;
		
		return boardDao.selectBoard(bo_num);
	}


}