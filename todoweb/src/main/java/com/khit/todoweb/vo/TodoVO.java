package com.khit.todoweb.vo;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor //�⺻ ������ ����
@Data //Getter , Setter , ToString ���� but ������x
@AllArgsConstructor // �Ķ���Ͱ� �ִ� ������  ����
public class TodoVO {
	//�ʵ�
	private Long tno;
	private String title;
	private String writer;
	private Timestamp createdDate;}
