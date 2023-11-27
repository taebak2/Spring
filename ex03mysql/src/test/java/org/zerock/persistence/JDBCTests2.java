package org.zerock.persistence;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class JDBCTests2 {

	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testConnection() {
		String url ="jdbc:mysql://localhost:3306/member?useUnicode=true&characterEncoding=utf8&useSSL=false";
		String id = "manager";
		String pw = "1234";
		
		try (
			Connection con = DriverManager.getConnection(url, id, pw)) {
			log.info(con);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

}
