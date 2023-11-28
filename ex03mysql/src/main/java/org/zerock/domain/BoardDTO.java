package org.zerock.domain;


import lombok.Data;

@Data
public class BoardDTO {
	private int num;
	private int visitcount;
	private String title;
	private String content;
	private String id;
	private String postdate;
}
