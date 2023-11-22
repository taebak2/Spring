package org.zerock.controller;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class MysqlTest {

	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testConnection() {
		String driver = "jdbc:mysql://localhost:3306/member";
		String id = "manager";
		String pw = "1234";

		try (Connection con = DriverManager.getConnection(driver, id, pw)) {
			log.info(con);

		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
}
