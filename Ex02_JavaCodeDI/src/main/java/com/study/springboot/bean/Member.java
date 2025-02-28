package com.study.springboot.bean;

public class Member {
	
	private String name;
	private String nickname;
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
