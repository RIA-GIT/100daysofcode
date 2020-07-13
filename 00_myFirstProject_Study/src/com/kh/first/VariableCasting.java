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
		char ch4 = str.charAt(3);
		
		System.out.println("첫번째 문자 : " + ch1);
		System.out.println("두번째 문자 : " + ch2);
		System.out.println("세번째 문자 : " + ch3);
		System.out.println("네번째 문자 : " + ch4);
		
	}
	
	// ------------------------------------ 
	
	public void method5() {
		Scanner sc = new Scanner(System.in);
		
		//내가 쓴거...
		//System.out.println("문자 : ");
		//String word = sc.nextLine();
		
		//int num = ''
		//System.out.println("num : " + num);
		
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		// 첫번째 방법 : 사용자에게 입력받아 기록된 문자값을 int형 변수에 옮겨 담은 후 출력하기
		/*
		 * int num = ch; // ch에 담긴 문자가 int형 변수에 담기는 순간 그 문자의 고유한 유니코드값(숫자)이 담김
		 * System.out.println(ch + " unicode : " + num);
		 */
		
		// 두번쨰 방법 : 사용자에게 입력받아 기록된 문자값을 강제로 int형으로 강제형변환해서 바로 출력하기
		System.out.println(ch + " unicode " + (int)ch);
		
	}
	
	public void method6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		double kor = sc.nextDouble();
		
		System.out.print("영어 : ");
		double eng = sc.nextDouble();
		
		System.out.print("수학 : ");
		double math = sc.nextDouble();
		
		// 첫번째 방법 : 사용자가 입력한 국어, 영어, 수학 값을 가지고 총점, 평균을 구해 각 변수에 담은 후 출력하기
				/*
				int sum = (int)(kor + eng + math); // kor+eng+math 연산한 결과 자료형은 최종적으로 double형임 int형에 담을 수 없기 때문에 강제형변환해야됨
				int avg = sum / 3;
				
				System.out.println("총점 : " + sum);
				System.out.println("평균 : " + avg);
				*/
		
		// 두번째 방법 : 사용자가 입력한 국어, 영어, 수학 값을 가지고 총점, 평균을 구한 값을 바로 출력하기
		System.out.println("총점 : " + (int)(kor + eng + math));
		
		System.out.println("평균 : " + (int)((kor + eng + math) / 3));
		// 경우1. 다 더하고 난 후 나눗셈까지 한 결과를 가지고 int로 강제형변환
		System.out.println("평균 : " + (int)(kor + eng + math) / 3);
		// 경우2. 다 더한값을 가지고 int로 강제형변환한 후 3으로 나누기 
	
	}
	
public void method7() {
		
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		
		double dNum = 2.5;
		
		char ch = 'A';
		
		System.out.println( iNum1 / iNum2 ); // 2
		System.out.println((int)dNum ); // 2
		
		System.out.println((double))iNum1); // 10.0
		System.out.println( iNum1 ); // 10.0
		
		System.out.println( iNum1 iNum2 ); // 2.5
		System.out.println( dNum ); // 2.5
		
		System.out.println( fNum ); // 3
		System.out.println( iNum1 fNum ); // 10 / (int)3.0 => 3 / 3 => 13
		
		System.out.println( iNum1 fNum );// 3.3333333
		System.out.println( iNum1 fNum ); // 3.333333333333335
		
		System.out.println( ch ); // 'A'
		System.out.println( ch ); // 65
		System.out.println( ch iNum1 ); // 75
		System.out.println( (ch iNum1) ); // 'K'
		
	}

} 
