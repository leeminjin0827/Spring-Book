package com.study.springboot.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Member {
	
	@Value("홍길동")
	// @Value : 빈이 생성될때 변수의 기본값을 지정하는 어노테이션
	private String name;
	@Value("도사")
	private String nickname;
	@Autowired
	// @Autowired : 스프링 컨테이너가 관리하는 빈을 자동으로 주입 / 빈이 생성될 때 변수가 참조할 객체를 자동으로 찾음
	@Qualifier("printerA")
	// @Qualifier : 유사한 객체가 여러개 일 경우 빈의 이름을 정확하게 지정
	
	private Printer printer;
	
	public Member() {}
	
	public Member( String name , String nickname , Printer printer ) {
		
		this.name = name;
		this.nickname = nickname;
		this.printer = printer;
		
	} // f end
	
	public void setName(String name) {
		this.name = name;
	} // f end
	
	public void setNickname( String nickname ) {
		this.nickname = nickname;
	} // f end
	
	public void setPrinter( Printer printer ) {
		this.printer = printer;
	} // f end
	
	public void print() {
		printer.print( "Hello " + name + " : " + nickname );
	} // f end
	
} // c end
