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
// @RunWith : JUnit 테스트 실행 시 Spring의 테스트 지원을 활성화 
// SpringJUnit4ClassRunner는 JUnit 테스트에서 Spring 애플리케이션 컨텍스트와의 통합을 도와줌
// @ContextConfiguration : 테스트를 실행하기 전에 Spring 애플리케이션 컨텍스트를 로드하는 데 사용
// root-context.xml 파일의 위치를 지정하여 해당 위치의 설정 파일을 사용하여 애플리케이션 컨텍스트를 설정
// @Log4j : Lombok 라이브러리에서 제공하는 기능으로, 자동으로 log 변수를 생성, 로깅 할 수 있도록 도움 

public class BoardServiceTests {
	@Setter(onMethod_ = { @Autowired })
	private BoardService service;

	@Test
	// BoardService의 존재 여부를 확인하는 테스트
	// log.info(service)를 통해 service 객체를 로깅하고
	// assertNotNull(service)를 사용하여 service 객체가 null이 아님을 검증
	// Spring과 JUnit을 통합하여 BoardService 클래스의 존재 여부를 테스트하는 예제
	public void testExist() {
		log.info(service);
		assertNotNull(service);
	}

	@Test
	public void testRegister() {
		BoardVO board = new BoardVO();
		board.setTitle("서비스 이용 - 새로 작성하는 글");
		board.setContent("서비스 이용 - 새로 작성하는 내용");
		board.setWriter("서비스 이용 뉴비");

		service.register(board);
		log.info("생성된 게시물의 번호 : " + board.getBno());
	}

	@Test
	// 각각의 게시물(Board)을 로그에 출력
	public void testGetList() {
		service.getList().forEach(board -> log.info(board));
	}
	
	public void testGet() {
		log.info(service.get(1L));
		
	}
	public BoardServiceTests() {
		// TODO Auto-generated constructor stub
	}
}
