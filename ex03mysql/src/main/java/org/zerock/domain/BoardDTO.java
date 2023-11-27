package org.zerock.domain;

import lombok.Data;

@Data
public class BoardDTO {
	private int bNum;
	private String title;
	private String content;
	private String writer;
}
