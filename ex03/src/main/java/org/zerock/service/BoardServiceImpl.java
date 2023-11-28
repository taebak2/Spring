package org.zerock.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.zerock.domain.BoardVO;
import org.zerock.mapper.BoardMapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
public class BoardServiceImpl implements BoardService {
	
	private BoardMapper mapper;

	@Override
	public void register(BoardVO board) {
		log.info("게시물 등록 " + board);
		mapper.insertSelectKey(board);
		
	}

	@Override
	public BoardVO get(Long bno) {
		log.info("게시물 번호로 가져오기 " + bno);
		return mapper.read(bno);
	}

	@Override
	public boolean modify(BoardVO board) {
		log.info("수정하기 : " + board);
		return mapper.update(board)==1;	// 업데이트 작업이 성공적으로 이루어졌는지를 확인하는 조건 
										// 성공했으면 true 리턴
	}

	@Override
	public boolean remove(Long bno) {
		log.info("삭제하기 : " + bno);
		return mapper.delete(bno)==1;
	}

	@Override
	public List<BoardVO> getList() {
		log.info("게시물 전체목록 가져오기");
		return mapper.getList();
	}
	
	
}
