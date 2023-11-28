package org.zerock.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardDTO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class MysqlBoardMapperTests {
	@Setter(onMethod_ = @Autowired)
	private MysqlBoardMapper mapper;

	@Test
	public void testGetList() {
		mapper.getList().forEach(board -> log.info(board));
	}

	@Test
	public void testInsert() {
		BoardDTO board = new BoardDTO();
		board.setNum(6);
		board.setTitle("새로 작성하는 글");
		board.setContent("새로 작성하는 내용");
		board.setId("뉴비");
		board.setId("뉴비");
		board.setId("뉴비");

		mapper.insert(board);
		log.info(board);

	}

	@Test
	public void testRead() {
		BoardDTO board = mapper.read(1);
		log.info(board);

	}
	
	@Test
	public void testDelete(){
		log.info("delete count : " + mapper.delete(3));
		
	}
	
	@Test
	public void testUpdate() {
		BoardDTO board = new BoardDTO();
		board.setNum(6);
		board.setId("홍길동");
		board.setTitle("수정된 제목");
		board.setContent("수정된 내용");
		
		int count=mapper.update(board);
		log.info("update count : " + count);
		
	}
}
