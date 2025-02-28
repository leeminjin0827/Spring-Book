package di;

import java.util.Date;

class Member{
	String name;
	String nickname;
	public Member() {}
	// private Member() {} // private으로 바꾸면 강한 결합 에는 에러가 생긴다.
} // c end

public class UnderstandDI {

	public static void main(String[] args) {
		// 날짜를 구하기 위해서는 Date 클래스에 의존해야 한다.
		Date date = new Date();
		System.out.println(date);
	} // f end
	
	public static void getDate(Date d) {
		Date date = d;
		System.out.println(date);
	} // f end
	
	public static void memberUse1() {
		// 강합 결합 : 직접 생성
		Member m1 = new Member();
	} // f end
	
	public static void memberUse2( Member m ) {
		// 약한 결합 : 생성된 것을 주입 받음 - 의존 주입 (Dependency Injection)
		Member m2 = m;
	} // f end
	
} // c end
