package com.kh.first;

import java.util.Scanner;

public class VariableCasting { // 클래스 시작
	
	public void method1() { // 실습
		
		Scanner sc = new Scanner(System.in); // 입력 받는 것
		
		System.out.println("이름을 입력하세요 : ");
		String name = sc.nextLine(); 		// 입력 받은 값을 저장 / 문자열
		
		System.out.println("나이를 입력하세요 : ");
		int age = sc.nextInt();				
		
		sc.nextLine();
	
		System.out.println("성별을 입력하세요(남/여) : ");
		char gender = sc.nextLine().charAt(0);
		// 0번째 인덱스를 출력						
		
		System.out.println("키를 입력하세요(cm) : ");
		double height = sc.nextDouble();
		
		// 결과
		System.out.println("키 " + height + "인 " + age + 
						   "살 " + gender + "자 " + name +
						   "님 반갑습니다.");
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		System.out.println("두 번쨰 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		System.out.println("더하기 결과 : " + (num1 + num2));
		System.out.println("빼기 결과 : " + (num1 - num2));
		System.out.println("곱하기 결과 : " + (num1 * num2));
		System.out.println("나누기 결과 : " + (num1 / num2));
		
	}
	
	public void method3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가로 : ");
		double width = sc.nextDouble();		// 실수값 담아줌
		
		System.out.println("세로 : ");
		double height = sc.nextDouble();
		
		// 결과
		System.out.println("면적 : " + width * height);
		System.out.println("둘레 : " + (width * height) * 2);
		
	}
	
	public void method4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		
		// 결과
		
		char ch1 = str.charAt(0);
		char ch2 = str.charAt(1);
		char ch3 = str.charAt(2);
		
		System.out.println("첫번째 문자 : " + ch1);
		System.out.println("두번째 문자 : " + ch2);
		System.out.println("세번째 문자 : " + ch3);
		
	}
	
}
