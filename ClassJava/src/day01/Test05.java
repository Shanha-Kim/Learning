package day01;

import java.util.Scanner;

public class Test05 {
	/*
	 * 콘솔환경에서 데이터 입력받기
	 * Scanner 클래스의 인스턴스를 만들어서 입력받는다.
	 * 참고]
	 * 	객체 만드는 방법
	 * 		클래스이름 변수이름 = new 클래스이름(); 
	 */

	public static void main(String[] args) {
		/*
		 * 상수만들기
		 * 	형식]
		 * 		final 데이터타입 상수이름(대문자) = 데이터;
		 * 파이값(3.14)를 저장할 수 있는 pi를 만드세요
		 */
		final float pi = 3.14f;
		//아래와같이 선언만 해버리면 따로 값 변경이 불가능함.
		//final float pi;
		//pi=3.14f;
		Scanner sc = new Scanner(System.in);
		//레퍼런스변수 + 인스턴스 ==>객체
		System.out.println("원의 반지름을 입력하세요 : ");
		int rad = sc.nextInt(); //
		float area = rad*rad*pi;
		float around = 2*rad*pi;
		System.out.println("반지름이"+rad+" 인 원의 넓이는 "+area+" 입니다.");
		System.out.println("반지름이"+rad+" 인 원의 둘레는 "+around+" 입니다.");
		System.out.println(sc.nextInt());
		System.out.println(sc);
	}

}
