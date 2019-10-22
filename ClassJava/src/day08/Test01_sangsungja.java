package day08;
/*
	생성자 함수가 여러개 있다는 이야기는
	==> 그 클래스의 객체를 만들 수 있는 방법이 여러가지가 된다는 이야기이다.
	
	***자바는 생성자 함수가 없어도 new 시킬 수 있다.
	<== JVM이 기본 생성자 함수를 만들어 주기 때문에...
		단, 이 경우에는 생성자 함수가 하나라도 존재하면 절대로 안되는 경우
	
	생성자함수 사용방법]
		생성자 함수는 그 클래스를 어떻게 인스턴스로 만들지(new 시킬지) 알려주는 함수.
		즉, 생성자 함수가 요구하는 매개변수가 무엇인지를 보면 
		그 클래스의 인스턴스를 생성할 수 있는 방법이 나온다.
		
		클래스를 제작할 때는 이런 이유 때문에 
		그 클래스의 인스턴스를 만들 수 있는 다양한 방식을
		생성자 함수를 통해서 만들어 주는 것이 좋다.
		
	참고]
		this : 현재 실행행되는 객체 자기자신을 가리키는 예약어
		
		this()(super())
		==> 생성자 함수는 원칙적으로 개발자가 직업 호출 할 수 없다.
		
			그런데 현재 클래스의 생성자를 실행하는 도중에 다른 생성자를 강제로 호출하는 유일한 방법
			
			*****
			규칙
				1. 반드시 생성자 안에서만 사용해야 한다.
					==> 일반함수 안에서는 사용할 수 없다.
				2. 반드시 생성자 함수의 첫문장으로 사용해야 한다.
					==> 다른문장이 앞에 오면 에러가 발생한다.
 */
public class Test01_sangsungja {
	int no1;
	int no2;
	int no3;
	int no4;
	Test01_sangsungja t1 = new Test01_sangsungja();
	public Test01_sangsungja() {
		/*
		this.no1 = 10;
		this.no2 = 20;
		this.no3 = 30;
		this.no4 = 40;
		이렇게 사용해도 무방하나 객체지형적 방법이 아니다.
		*/
		//이럴 때 this()를 사용한다.
		//this.no1=1;
		this(10,20,30,40);
		// 다른형태로 정의 해놓은 생성자 함수를 호출할 수 있는 유일한 방법
		// 반드시 생성자함수의 첫 문장으로만 사용가능 
	}
	public Test01_sangsungja(int no1, int no2, int no3, int no4) {
		this.no1 = no1; // this를 통해 전역변수 no1과 매개변수 no1을 구분할 수 있다.
		this.no2 = no2; // 
		this.no3 = no3; // 
		this.no4 = no4; // 
		
	}
	public void abc() {
		//this(); 생성자 함수 내에서만 사용가능
	}

	public static void main(String[] args) {
		new Test01_sangsungja();
	}

}
