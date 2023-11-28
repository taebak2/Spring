package org.zerock.service;

import java.util.List;

import org.zerock.domain.BoardDTO;

public interface MysqlBoardService {
	public void register(BoardDTO board);   // 게시물 등록
	public BoardDTO get(int num);   // 게시물 번호로 게시물 내용 가져오기
	public boolean modify(BoardDTO board);  // 게시물 수정
	public boolean remove(int num); // 게시물 번호로 게시물 삭제
	public List<BoardDTO> getList();  // 게시물 전체목록 가져오기
}
