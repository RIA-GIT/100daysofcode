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
		
		System.out.println("ù��° ���� : " + ch1);
		System.out.println("�ι�° ���� : " + ch2);
		System.out.println("����° ���� : " + ch3);
		
	}
	
}
