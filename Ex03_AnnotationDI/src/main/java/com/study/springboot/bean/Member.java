package com.study.springboot.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Member {
	@Value("홍길동")
	private String name;
	@Value("도사")
	private String nickname;
	@Autowired
	@Qualifier("printerA")
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
