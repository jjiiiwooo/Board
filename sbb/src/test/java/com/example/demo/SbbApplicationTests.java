package com.example.demo;

import com.example.demo.question.QuestionService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SbbApplicationTests {
	
	@Autowired
	private QuestionService questionService;
	
	@Test
	void testJpa() {
		for(int i=0; i<=300; i++) {
			String subject = String.format("테스트 데이터입니다.:[%03d]",i);
			String content = "내용 없음";
			this.questionService.create(subject,content,null);
		}
	}
}
