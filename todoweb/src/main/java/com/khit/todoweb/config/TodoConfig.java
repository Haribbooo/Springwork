package com.khit.todoweb.config;
//설정 파

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//설정 파일로 만들어주는 이노테이션
@Configuration
public class TodoConfig {
	
	//ModelMapper를 빈으로 등록함
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
