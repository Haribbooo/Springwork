package com.khit.todoweb.dto;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor //기본 생성자 주입
@Data //Getter , Setter , ToString 포함 but 생성자x
@AllArgsConstructor // 파라미터가 있는 생성자  주입
public class TodoDTO {
	//필드
	private Long tno;
	private String title;
	private String writer;
	private Timestamp createdDate;
}
