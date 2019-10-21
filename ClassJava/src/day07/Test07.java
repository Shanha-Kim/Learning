package day07;

public class Test07 {
/*
	함수의 중첩(Overloading)
		==>	원칙적으로 클래스 내에서 함수의 이름은 같은 이름을 한번만 사용할 수 있다.
			
			때문에 코드를 읽을때도 불편하다. ==> 가독성에 문제가 생긴다.
			(함수 이름의 가독성이란, 함수의 이름만 봐도 그 함수가 어떤 기능을 수행하는지
			대략적으로 알 수 있도록 하는 것)
		
		==> 이 문제를 해결하기 위해 도입된 문법이 함수의 중첩이다.
		
		결론]
			함수의 중첩(overloading)은 
			클래스 내에서 같은 이름의 함수를 만드는 것
======================================================================
	생성자 함수 만드는 규칙
		1. 함수의 이름은 반드시 클래스 이름과 동일하게 작성한다.(대소문자 구분)
		2. 반환값은 절대로 가지면 안 된다. void라고 작성해도 안된다.
		3. 매개변수는 가질 수 있다.
 */
	public Test07() {
	}
	public Test07(float no) {
		System.out.println(no);
	}

	
	public Test07(int no, float no2) { System.out.println(no); }
	public Test07(float no, int no2) { System.out.println(no); }
	//필요성 차원에서는 의미없지만 가능은 하다.
	 
	public static void main(String[] args) {
		new Test07(3.14f);
		new Test07(314);
	}

}
