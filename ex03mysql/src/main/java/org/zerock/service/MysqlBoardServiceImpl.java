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
public class MysqlBoardServiceImpl implements MysqlBoardService{

	private MysqlBoardMapper mapper;

	@Override
	public void register(BoardDTO board) {
		log.info("게시물 등록" + board);
		mapper.insert(board);
	}

	@Override
	public BoardDTO get(int bNum) {
		log.info("get......" + bNum);
		return mapper.read(bNum);
		
	}

	@Override
	public boolean modify(BoardDTO board) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(int bNum) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<BoardDTO> getList() {
		log.info("게시물 전체목록 가져오기");
		return mapper.getList();
	}
	
}
