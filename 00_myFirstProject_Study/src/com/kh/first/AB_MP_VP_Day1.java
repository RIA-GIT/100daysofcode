package com.kh.first;

public class AB_MP_VP_Day1 {
	
	public void methodA() {
		System.out.println("메소드 A 출력문");
		methodB();
	}

	public void methodB() {
		System.out.println("메소드 B 출력문");
		methodC();
	}

	public void methodC() {
		System.out.println("메소드 C 출력문");
	}
	
	// 클래스명 --> 대문자로 시작이 권장사항
	// 패키지명, 메소드명, 변수명 --> 소문자로 시작이 권장사항
	
	public void printValue() {
		
		System.out.println(123);	//	123
		System.out.println(1.23);	//	1.23
		
		System.out.println('a');	//	a
		System.out.println('강');	//	강
		
		System.out.println("안리아");		// 안리아
		System.out.println("안녕하세요");	// 안녕하세요
		
		System.out.println(123 + 456);	// 579
		System.out.println(1.23 - 0.11);// 불완전한 실수값 연산으로 오차발생
		
		System.out.println('a' + 1);	// 98 /문자와 숫자의 연산가능 /a=97 
		
		System.out.println("하이" + 'a');		// 하이a
		System.out.println("안녕하세요" + 123);// 안녕하세요123
		System.out.println("반갑습니다" + 123);// 반갑습니다123
		
	}
	
	public void sumStringNumber() {
		
		System.out.println(9 + 9);		// 18
		System.out.println(9 + "9");	// 99
		System.out.println("9" + "9");	// 99
		
		System.out.println("--");
		
		System.out.println(9 + 9 + "9");	// 189
		System.out.println(9 + "9" + 9);	// 999
		System.out.println("9" + 9 + 9);	// 999
		System.out.println("9" + (9 + 9));	// 918
		
	}
	
}
