package com.kh.first;

public class A_Variable {
		
	
		public void printVariable() { // printVariable �޼ҵ� ����
			
			System.out.println("===���� ��� ��===");
			System.out.println(100 + 10);
			System.out.println((100 + 10) * 10);
			System.out.println(((100 + 10) * 10) - 10);
			// ������� �� ��µ����� ���� �ǹ����� �� �� ����
			
			// 1. ������? => ��� ���� �޸𸮿� ����ϱ� ���� ����(�ڽ��͵� ���� ����_)
			
			int point = 200;
			int bonus = 10;
			int personCount = 10;
			int fees = 10;
			
			System.out.println("===���� ��� ��===");
			System.out.println(point + bonus);
			System.out.println((point + bonus) * personCount);
			System.out.println(((point + bonus) * personCount) - fees);
		}
			
			/*
			 *  2. ������ ����ϴ� ����
			 *  -  ������ �켱������ ���� �ǹ̸� �ο��ϱ� ���� �������� ��� (�������� ������)
			 *  -  �ѹ��� ���� �����صΰ� ��� ����� �������� ���
			 *  -  ���������� ���� �ϱ� ���� ����
			 */
			
			public void declareVariable() { // declareVariable �޼ҵ� ����
				
				/*
				 * * ���� ���� (������ �޸� ������ Ȯ���س��� ����) == �ڽ� ����ڴ�!
				 * 
				 * [ǥ����] �ڷ��� ������;
				 * 
				 * �ڷ��� : � ���� ��������, � ũ���� ���� ���������� ���� ����0(�ڽ�)�� ũ�� �� ����� ���ϴ� �κ�
				 * ������ : ����(�ڽ�)�� �̸��� ���ϴ� �κ� (�ǹ̺ο�)
				 * 
				 * * ������ ��
				 * - ���� ���� �ݵ�� ù ���ڰ� �ҹ��ڿ����Ѵ�.
				 * - ���� �ܾ�� ���յ� ��� ��Ÿǥ��� ��Ű�� (testVariable)
				 * - ���� �������� ������ ���������� ���� �Ұ�
				 * - �ش� ����({}) �� ������ �ش� �����ȿ����� ���� �� �� �ִ�. (��������)
				 */
				
				// --- �ڷ����� ���� ���� ---
				
				// ����
				boolean isTrue;		// 1byte
				
				// 2.������
				// 2_1. ������ (4����)
				byte bNum;			// 1byte
				short sNum;			// 2byte
				int	iNum;			// 4byte --> �������߿� ���� ��ǥ���� �ڷ��� (�⺻��)
				long lNum;			// 8byte
				
				// 2_2. �Ǽ��� (2����)
				float fNum;			// 4byte
				double dNum;		// 8dyte --> �Ǽ��� �߿� ���� ��ǥ���� �ڷ���(�⺻��)
				
				// 3. ����(�ѱ���)��
				char ch;			// 2byte
				
				// ---------- ���� ���� �⺻ �ڷ��� (8��) ---------
				
				// 4. ���ڿ� (�����ڷ���)
				String str;
				
				/*
				 * * ������ �� ����(���)
				 * 
				 * [ǥ����] ������ = ������ϴ� ��;
				 */
				
				isTrue = true;		// ���� �������� true/false ���� ���尡��
				
				bNum = 1;
				sNum = 2;
				iNum = 4;
				lNum = 8L;			// long�� �������� ���ڰ� �ڿ� l �Ǵ� L�� ���̴°� �������
				
				fNum = 4.0f;		// �ݵ�� f�� �ٿ��� ��
				dNum = 8.0;
				
				ch = 'A';
				ch = '��'; 			// ch = '������'(x)
				
				str = "ABC"; 		//���ڿ��� "" �ȿ�
				str = "A";
				
				// * ������ ���� �� ������ ���
				System.out.println("isTrue�� �� : " + isTrue);
				System.out.println("bNum�� �� : " + bNum);
				System.out.println("sNum�� �� : " + sNum);
				System.out.println("iNum�� �� : " + iNum);
				System.out.println("lNum�� �� : " + lNum);
				System.out.println("fNum�� �� : " + dNum);
				System.out.println("ch�� �� : " + ch);
				System.out.println("str�� �� : " + str);
				
		
		} // declareVariable �޼ҵ� ��
			
			
			public void initVariable() {
				
				// * ���� ����� ���ÿ� �ʱ�ȭ
				// [ǥ����] �ڷ��� ������ = ��;
				
				// 1. ����
				boolean isTrue = false;	// 1byte ������ ������
				
				// 2_1. ������
				byte bNum = 1;			// 1byte ������ ������
				short sNum = 2;			// 2byte ������ ������
				int iNum = 4;			// 4byte ������ ������	--> ���� ��ǥ��, �⺻��
				long lNum = 8L;			// 8byte ������ ������
				
				// 2_2. �Ǽ���
				float fNum = 4.0f;		// 4byte ������ ������
				double dNum = 8.0;		// 8byte ������ ������ 	--> ���� ��ǥ��, �⺻��
				
				// 3. ������
				char ch = '��';			// 2byte ������ ������	--> ���ڿ� ���ڰ��� �������...
				
				// ----- �⺻�ڷ���(8��) -----
				
				// ----- �����ڷ��� -----
				String str = "�ȳ��ϼ���";
				
				System.out.println("isTrue�� ��" + isTrue);
				System.out.println("bNum�� �� : " + bNum);
				System.out.println("sNum�� �� : " + sNum);
				System.out.println("iNum�� �� : " + iNum);
				System.out.println("lNum�� �� : " + lNum);
				System.out.println("fNum�� �� : " + fNum);
				System.out.println("dNum�� �� : " + dNum);
				System.out.println("ch�� �� : " + ch);
				System.out.println("str�� �� : " + str);
				
				// 4. ���� ��� ��Ģ
				
				int number;
				// 1) �������� �ߺ��Ǿ�� �ȵ�(�ٸ� �ڷ����̿��� �ȵ� ex. int, double)
				//	     ��, ��ҹ��ڴ� ������
				//    ex. double number; / int number;(�ߺ�)
				int numBer;
				
				// 2) ����� (�̹� �ڹٿ��� ���ǰ� �ִ� Ű����)�� ����� �Ұ��� �ϴ�!
				//int public;
				//int void;
				//int abstract;
				
				// 3) ������ ���� ��� ����(��, ���ڷ� �����ϴ� �� �ȵ�/��������)
				int age1;
				//int 1age;
				
				// 4) _ �Ǵ� $ Ư�� ���� ��� ����(�� ���� Ư������ ��� �Ұ�)
				int number_1;
				int number$1;
				//int number#1;
				
				// * ��Ÿǥ��� ��Ű�°� �������
				String username; // ���� ���ϴ���
				String userName; // ���� �ϴ���!!
				
				// * �ѱ��� ������� �ʴ°� �������
				String �̸�; 		 // ������ �ƴ����� ����x
				 
			}
	} 
