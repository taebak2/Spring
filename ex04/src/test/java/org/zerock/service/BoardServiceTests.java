package org.zerock.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardServiceTests {
	
	@Setter(onMethod_ = {@Autowired})
	private BoardService service;
	
	@Test
	public void testExist() {
		log.info(service);
		assertNotNull(service);
		
	}
	
	@Test
	public  void testRegister() {
		BoardVO board = new BoardVO();
		board.setTitle("서비스 이용 - 새로 작성하는 글");
		board.setContent("서비스 이용 - 새로 작성하는 내용");
		board.setWriter("서비스 이용 뉴비");
		
		service.register(board);
		log.info("생성된 게시물의 번호 : " + board.getBno());
		
	}
	
	@Test
	public void testGetList() {
		service.getList().forEach(board -> log.info(board));
		
	}
	
	@Test
	public void testGet() {
		log.info(service.get(1L));
	}
	@Test
	public void testUpdate() {
		BoardVO board = service.get(1L);
		if(board==null) {
			return;
		}
		board.setTitle("수정된 제목 테스트 버전");
		log.info("수정 결과 : "+service.modify(board));
	}
	
	@Test 
	public void testDelete() {
		log.info("게시물 지우기 결과 : " + service.remove(1L));
	}
}
