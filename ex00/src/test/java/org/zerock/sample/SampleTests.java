package org.zerock.sample;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class) // : 이 어노테이션은 JUnit 테스트 클래스가 Spring 프레임워크와 함께 실행되도록 지정
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml") // Spring 설정 파일(root-context.xml)을 로드하여 Spring 애플리케이션 컨텍스트를 설정
@Log4j // 로깅을 위한 Log4j를 사용할 것
public class SampleTests {
	@Setter(onMethod_ = { @Autowired }) // Autowired : 의존성 주입
	private Restaurant restaurant;

	@Test
	public void testExist() {
		assertNotNull(restaurant); // restaurant 객체가 null이 아닌지 확인

		log.info(restaurant); // restaurant 객체를 로깅하여 출력
		log.info("- - - - - - - - - - - - - - - - - -");
		log.info(restaurant.getChef()); // chef 속성을 로깅
		
		// Spring 애플리케이션에서 restaurant 객체와 해당 객체의 chef 속성이 올바르게 초기화되고 
		// 의존성 주입이 제대로 작동하는지 확인하는 단순한 테스트를 수행
	}

}
