package kr.kh.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import kr.kh.test.service.BoardService;

@RestController
public class CommentController {

	@Autowired
	BoardService boardService;
	
}