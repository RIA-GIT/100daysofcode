package com.kh.first;

public class AB_MP_VP_Day1 {
	
	public void methodA() {
		System.out.println("�޼ҵ� A ��¹�");
		methodB();
	}

	public void methodB() {
		System.out.println("�޼ҵ� B ��¹�");
		methodC();
	}

	public void methodC() {
		System.out.println("�޼ҵ� C ��¹�");
	}
	
	// Ŭ������ --> �빮�ڷ� ������ �������
	// ��Ű����, �޼ҵ��, ������ --> �ҹ��ڷ� ������ �������
	
	public void printValue() {
		
		System.out.println(123);	//	123
		System.out.println(1.23);	//	1.23
		
		System.out.println('a');	//	a
		System.out.println('��');	//	��
		
		System.out.println("�ȸ���");		// �ȸ���
		System.out.println("�ȳ��ϼ���");	// �ȳ��ϼ���
		
		System.out.println(123 + 456);	// 579
		System.out.println(1.23 - 0.11);// �ҿ����� �Ǽ��� �������� �����߻�
		
		System.out.println('a' + 1);	// 98 /���ڿ� ������ ���갡�� /a=97 
		
		System.out.println("����" + 'a');		// ����a
		System.out.println("�ȳ��ϼ���" + 123);// �ȳ��ϼ���123
		System.out.println("�ݰ����ϴ�" + 123);// �ݰ����ϴ�123
		
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
