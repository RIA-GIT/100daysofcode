package com.kh.first;

import java.util.Scanner;

public class B_KeyboardInput {
	
	// ����ڰ� Ű����� �Է��Ѱ��� ���������� �� �� ����� Ŭ����
	// java.util.Scanner Ŭ�������� �����ϴ� �޼ҵ带 ���ؼ� �Է��� �� ������ �� ����
	
	public void inputScanner1() {
		
		// ������� ���������� �Է¹��� �� ����غ��� ��!
		
		// Ŭ���� ����
		//java.util.Scanner sc = new java.util.Scanner(); -> ���ŷο�
		Scanner sc = new Scanner(System.in); //System.in -> ����ڰ� ������ ���� ����Ʈ ������ �о���̰ڴٴ� ��!
		
		System.out.println("����� �̸��� �����Դϱ� : ");
		// ����ڰ� �Է��� ���� ���ڿ��� �ް��� �� �� ���Ǵ� �޼ҵ� (sc.next(), sc.nextLine())
		String name = sc.nextLine(); 
		// ������� > 1. String name(name�̶�� �ڽ��� �������) 2. sc.next();(����ڰ� �Է��� ���� �̾ƿ�) 3. =(������) / ���� ù��° ������ �ι�° ���Կ����ڰ� ����°�� ������!
		// sc.next() : ���� ���������� ���� ������ ex. �� ���� > ��
		// sc.nextLine() : ���ͱ��� �� ������ (�� �� ������ ��°�� ������) ex. �� ���� > �� ����
		
		System.out.println("����� ���̴� ����Դϱ� : "); // : > ���� ���� ���۶�� ������ ��
		// ����ڰ� �Է��� ���� ���������� ���������� �Ҷ� (sc.nextInt())
		int age = sc.nextInt();
		// byte age = sc.nextByte(); > �̰͵� ����
		
		System.out.println("����� Ű�� ���Դϱ� (cm������ �Ҽ��� ù° �ڸ����� �Է��Ͻÿ�) : ");
		// ����ڰ� �Է��� ���� �Ǽ������� ���������� �� �� (sc.nextDouble())
		double height = sc.nextDouble();
		
		// ȫ�浿���� 19�� �̸�, 162.3cm�Դϴ�. �̷��� �����Բ� �Ѵٸ�...
		System.out.println(name + "���� " + age + "�� �̸�, " + height + "cm�Դϴ�.");
		
	}
	
	public void inputScanner2() {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		
		/*
		 *	sc.nextLine() : ���ۿ��� '����'������ ��� ���� ������ (��, ���Ͱ� �������)
		 *	       �� ���� �޼ҵ� : ���ۿ��� '����'���������� ���� ������ (��, ���Ͱ� �����������)
		 */
		sc.nextLine(); // <�̰ɷ� ���͸� ����ش�!
		
		System.out.print("�ּ� : ");
		String address = sc.nextLine();
		
		System.out.print("Ű : ");
		double height = sc.nextDouble();
		
		// xxx���� xx���̸�, ��°��� xxx�̰�, Ű�� xxxcm �Դϴ�.
		System.out.println(name + "���� " + age + "���̸�, ��°��� " + 
							address + "�̰�, Ű�� " + height + "cm �Դϴ�.");
		//printf ��¹�
		System.out.printf("%s���� %d���̸�, ��°��� %s�̰�, Ű�� %.2fcm�Դϴ�.", name, age, address, height);
		
		// ��� : nextXXX (double, int ���) �޼ҵ� �ڿ� nextLine()�� �;ߵǴ� ���
		//		���ۿ� �����ִ� '����'�� ����ֱ� ���� ���̿� sc.nextLine()�� ȣ��������!
	}
	
	
	public void inputScanner3() {
		
		Scanner sc = new Scanner(System.in);
		
		// ���ڿ��� �Է¹��� �� => sc.nextLine();
		// �������� �Է¹��� �� => sc.nextInt();
		// �Ǽ����� �Է¹��� �� => sc.Double();
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("����(M/F) : ");
		char gender = sc.nextLine().charAt(0); // 0�� �ε��� ����
		//					"M".charAt(0�� �ε���) --> 'M'
		
		System.out.print("���� : "); // 20\n
		int age = sc.nextInt(); // int age = 20;
		
		// \n�� �����ִ� ��Ȳ
		sc. nextLine(); // \n�� ����ֱ�!
		
		System.out.print("�ּ� : ");
		String address = sc.nextLine(); // String address= "(���Ͷ����� ���鳲��)";
		
		System.out.println(name + "���� ��������");
		System.out.println("���� : " + gender);
		System.out.println("���� : " + age);
		System.out.println("�ּ� : " + address);
		
	}
	
	
}