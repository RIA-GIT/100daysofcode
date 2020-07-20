package com.kh.first;

import java.util.Scanner;

public class B_KeyboardInput {
	
	// 사용자가 키보드로 입력한값을 가져오고자 할 때 사용할 클래스
	// java.util.Scanner 클래스에서 제공하는 메소드를 통해서 입력한 값 가져올 수 있음
	
	public void inputScanner1() {
		
		// 사용자의 인적사항을 입력받은 후 출력해보는 것!
		
		// 클래스 생성
		//java.util.Scanner sc = new java.util.Scanner(); -> 번거로움
		Scanner sc = new Scanner(System.in); //System.in -> 사용자가 제시한 값을 바이트 단위로 읽어들이겠다는 뜻!
		
		System.out.println("당신의 이름은 무엇입니까 : ");
		// 사용자가 입력한 값을 문자열로 받고자 할 때 사용되는 메소드 (sc.next(), sc.nextLine())
		String name = sc.nextLine(); 
		// 실행순서 > 1. String name(name이라는 박스가 만들어짐) 2. sc.next();(사용자가 입력한 값을 뽑아옴) 3. =(대입함) / 왼쪽 첫번째 오른쪽 두번째 대입연산자가 세번째로 마지막!
		// sc.next() : 공백 이전까지의 값만 가져옴 ex. 강 보람 > 강
		// sc.nextLine() : 엔터까지 다 가져옴 (한 줄 단위로 통째로 가져옴) ex. 강 보람 > 강 보람
		
		System.out.println("당신의 나이는 몇살입니까 : "); // : > 뒤의 값이 버퍼라는 공간에 들어감
		// 사용자가 입력한 값을 정수값으로 가져오고자 할때 (sc.nextInt())
		int age = sc.nextInt();
		// byte age = sc.nextByte(); > 이것두 가능
		
		System.out.println("당신의 키는 몇입니까 (cm단위로 소수점 첫째 자리까지 입력하시오) : ");
		// 사용자가 입력한 값을 실수값으로 가져오고자 할 때 (sc.nextDouble())
		double height = sc.nextDouble();
		
		// 홍길동님은 19세 이며, 162.3cm입니다. 이렇게 나오게끔 한다면...
		System.out.println(name + "님은 " + age + "세 이며, " + height + "cm입니다.");
		
	}
	
	public void inputScanner2() {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		/*
		 *	sc.nextLine() : 버퍼에서 '엔터'까지의 모든 값을 가져옴 (즉, 엔터가 비워진다)
		 *	       그 외의 메소드 : 버퍼에서 '엔터'이전까지의 값만 가져옴 (즉, 엔터가 비워지지않음)
		 */
		sc.nextLine(); // <이걸로 엔터를 비워준다!
		
		System.out.print("주소 : ");
		String address = sc.nextLine();
		
		System.out.print("키 : ");
		double height = sc.nextDouble();
		
		// xxx님은 xx살이며, 사는곳은 xxx이고, 키는 xxxcm 입니다.
		System.out.println(name + "님은 " + age + "살이며, 사는곳은 " + 
							address + "이고, 키는 " + height + "cm 입니다.");
		//printf 출력법
		System.out.printf("%s님은 %d살이며, 사는곳은 %s이고, 키는 %.2fcm입니다.", name, age, address, height);
		
		// 결론 : nextXXX (double, int 등등) 메소드 뒤에 nextLine()가 와야되는 경우
		//		버퍼에 남아있는 '엔터'를 비워주기 위해 사이에 sc.nextLine()를 호출해주자!
	}
	
	
	public void inputScanner3() {
		
		Scanner sc = new Scanner(System.in);
		
		// 문자열을 입력받을 때 => sc.nextLine();
		// 정수값을 입력받을 때 => sc.nextInt();
		// 실수값을 입력받을 때 => sc.Double();
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0); // 0번 인덱스 추출
		//					"M".charAt(0번 인덱스) --> 'M'
		
		System.out.print("나이 : "); // 20\n
		int age = sc.nextInt(); // int age = 20;
		
		// \n가 남아있는 상황
		sc. nextLine(); // \n을 비워주기!
		
		System.out.print("주소 : ");
		String address = sc.nextLine(); // String address= "(엔터때문에 공백남음)";
		
		System.out.println(name + "님의 개인정보");
		System.out.println("성별 : " + gender);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + address);
		
	}
	
	
}