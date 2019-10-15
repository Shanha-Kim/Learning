package day02;

import java.util.Scanner;

/*
 * Method 작성법
 * 	형식]
 *  	[접근지정자] [속성] 반환값 함수이름(매개변수리스트){
 *  		
 *  	}
 *  	*매개변수리스트 : 함수를 실행할 때 꼭 입력해야되는 데이터들의 형태와 변수이름
 *  	*함수의 원형 : 접근지정자, 속성, 반환값타입, 이름, 매개변수리스트까지를 이야기한다.
 *  
 *  참고]
 *  	; - 토큰을 가리키는 기호..
 *  	토큰 - 하나의 명령단위
 *  	하지만 생략하는 경우는 {}로 끝나는 경우 {}가 ;의 역할을 대신한다.
 *  
 */		
 		
public class Test06 {
	static int getsum(int n1, int n2) {
		return n1+n2;
	}
	public void printsum(int n1, int n2) {
		System.out.println(n1+n2);
	}
	public void inputprintsum() {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		System.out.println(n1+n2);
	}
	
	public static void main(String[] args) {
		System.out.println(getsum(10,1));
		new Test06().printsum(10,1);
		
	}
}
