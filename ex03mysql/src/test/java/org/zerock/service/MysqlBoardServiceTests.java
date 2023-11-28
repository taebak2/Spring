package org.zerock.service;

import static org.junit.Assert.assertNotNull;

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
public class MysqlBoardServiceTests {
	
	@Setter(onMethod_ = {@Autowired})
	private MysqlBoardService service;
	
	@Test
	public void testExist() {
		log.info(service);
		assertNotNull(service);
		
	}
	
	@Test
	public  void testRegister() {
		BoardDTO board = new BoardDTO();
		board.setNum(8);
		board.setTitle("서비스 이용 - 새로 작성하는 글");
		board.setContent("서비스 이용 - 새로 작성하는 내용");
		board.setId("서비스 이용 뉴비");
		
		service.register(board);
		log.info("생성된 게시물의 번호 : " + board.getNum());
		
	}
	
	@Test
	public void testGetList() {
		service.getList().forEach(board -> log.info(board));
		
	}
	
	@Test
	public void testGet() {
		log.info(service.get(1));
	}
	
}
