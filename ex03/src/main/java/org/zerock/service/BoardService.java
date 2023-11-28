package org.zerock.service;

import java.util.List;

import org.zerock.domain.BoardVO;

public interface BoardService {
	public void register(BoardVO board);   // 게시물 등록
	public BoardVO get(Long bno);   // 게시물 번호로 게시물 내용 가져오기
	public boolean modify(BoardVO board);  // 게시물 수정
	public boolean remove(Long bno); // 게시물 번호로 게시물 삭제
	public List<BoardVO> getList();  // 게시물 전체목록 가져오기
}
