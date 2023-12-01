package org.zerock.mapper;

import java.util.List;

import org.zerock.domain.BoardVO;

public interface BoardMapper {

	// 게시물 전체 목록 표시
	public List<BoardVO> getList();
	
	// 새로운 게시물 삽입(기본키 상관X)
	public void insert(BoardVO board);
	
	// 새로운 게시물 삽입(기본키 상관O)
	public void insertSelectKey(BoardVO board);
	
	// 게시물 검색
	public BoardVO read(Long bno);
	
	// 게시물 삭제
	public int delete(Long bno);
	
	// 게시물 수정
	public int update(BoardVO board);
	
}
