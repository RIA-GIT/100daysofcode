package com.kh.first;

import java.util.Scanner;

public class VariableCasting { // Ŭ���� ����
	
	public void method1() { // �ǽ�
		
		Scanner sc = new Scanner(System.in); // �Է� �޴� ��
		
		System.out.println("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine(); 		// �Է� ���� ���� ���� / ���ڿ�
		
		System.out.println("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();				
		
		sc.nextLine();
	
		System.out.println("������ �Է��ϼ���(��/��) : ");
		char gender = sc.nextLine().charAt(0);
		// 0��° �ε����� ���						
		
		System.out.println("Ű�� �Է��ϼ���(cm) : ");
		double height = sc.nextDouble();
		
		// ���
		System.out.println("Ű " + height + "�� " + age + 
						   "�� " + gender + "�� " + name +
						   "�� �ݰ����ϴ�.");
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù ��° ������ �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		
		System.out.println("�� ���� ������ �Է��ϼ��� : ");
		int num2 = sc.nextInt();
		
		System.out.println("���ϱ� ��� : " + (num1 + num2));
		System.out.println("���� ��� : " + (num1 - num2));
		System.out.println("���ϱ� ��� : " + (num1 * num2));
		System.out.println("������ ��� : " + (num1 / num2));
		
	}
	
	public void method3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� : ");
		double width = sc.nextDouble();		// �Ǽ��� �����
		
		System.out.println("���� : ");
		double height = sc.nextDouble();
		
		// ���
		System.out.println("���� : " + width * height);
		System.out.println("�ѷ� : " + (width * height) * 2);
		
	}
	
	public void method4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڿ��� �Է��ϼ��� : ");
		String str = sc.nextLine();
		
		// ���
		
		char ch1 = str.charAt(0);
		char ch2 = str.charAt(1);
		char ch3 = str.charAt(2);
		char ch4 = str.charAt(3);
		
		System.out.println("ù��° ���� : " + ch1);
		System.out.println("�ι�° ���� : " + ch2);
		System.out.println("����° ���� : " + ch3);
		System.out.println("�׹�° ���� : " + ch4);
		
	}
	
	// ------------------------------------ 
	
	public void method5() {
		Scanner sc = new Scanner(System.in);
		
		//���� ����...
		//System.out.println("���� : ");
		//String word = sc.nextLine();
		
		//int num = ''
		//System.out.println("num : " + num);
		
		System.out.print("���� : ");
		char ch = sc.nextLine().charAt(0);
		
		// ù��° ��� : ����ڿ��� �Է¹޾� ��ϵ� ���ڰ��� int�� ������ �Ű� ���� �� ����ϱ�
		/*
		 * int num = ch; // ch�� ��� ���ڰ� int�� ������ ���� ���� �� ������ ������ �����ڵ尪(����)�� ���
		 * System.out.println(ch + " unicode : " + num);
		 */
		
		// �ι��� ��� : ����ڿ��� �Է¹޾� ��ϵ� ���ڰ��� ������ int������ ��������ȯ�ؼ� �ٷ� ����ϱ�
		System.out.println(ch + " unicode " + (int)ch);
		
	}
	
	public void method6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		double kor = sc.nextDouble();
		
		System.out.print("���� : ");
		double eng = sc.nextDouble();
		
		System.out.print("���� : ");
		double math = sc.nextDouble();
		
		// ù��° ��� : ����ڰ� �Է��� ����, ����, ���� ���� ������ ����, ����� ���� �� ������ ���� �� ����ϱ�
				/*
				int sum = (int)(kor + eng + math); // kor+eng+math ������ ��� �ڷ����� ���������� double���� int���� ���� �� ���� ������ ��������ȯ�ؾߵ�
				int avg = sum / 3;
				
				System.out.println("���� : " + sum);
				System.out.println("��� : " + avg);
				*/
		
		// �ι�° ��� : ����ڰ� �Է��� ����, ����, ���� ���� ������ ����, ����� ���� ���� �ٷ� ����ϱ�
		System.out.println("���� : " + (int)(kor + eng + math));
		
		System.out.println("��� : " + (int)((kor + eng + math) / 3));
		// ���1. �� ���ϰ� �� �� ���������� �� ����� ������ int�� ��������ȯ
		System.out.println("��� : " + (int)(kor + eng + math) / 3);
		// ���2. �� ���Ѱ��� ������ int�� ��������ȯ�� �� 3���� ������ 
	
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
