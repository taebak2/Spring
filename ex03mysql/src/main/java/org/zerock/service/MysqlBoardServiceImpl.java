package org.zerock.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.zerock.domain.BoardDTO;
import org.zerock.mapper.MysqlBoardMapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
public class MysqlBoardServiceImpl implements MysqlBoardService {
	
	private MysqlBoardMapper mapper;

	@Override
	public void register(BoardDTO board) {
		log.info("게시물 등록 " + board);
		mapper.insert(board);
		
	}

	@Override
	public BoardDTO get(int num) {
		log.info("게시물 번호로 가져오기 " + num);
		return mapper.read(num);
	}

	@Override
	public boolean modify(BoardDTO board) {	// 219페이지부터 교재 참고해서 해라 mysql
		return false;
	}

	@Override
	public boolean remove(int num) {
		return false;
	}

	@Override
	public List<BoardDTO> getList() {
		log.info("게시물 전체목록 가져오기");
		return mapper.getList();
	}
	
	
}
