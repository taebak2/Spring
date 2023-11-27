package org.zerock.mapper;

import java.util.List;

import org.zerock.domain.BoardDTO;

public interface MysqlBoardMapper {
	// 게시물 전체 목록 표시
	public List<BoardDTO> getList();

	// 새로운 게시물 삽입(기본키 상관X)
	public void insert(BoardDTO board);

	// 게시물 검색
	public BoardDTO read(int bNum);

	// 게시물 삭제
	public int delete(int bNum);

	// 게시물 수정
	public int update(BoardDTO board);
}
