package day08;

public class Test02 {
/*
	static 속성
		==> static 영역에 생겨지는 함수나 변수를 말한다.
		
		static 영역의 특징
			1. 프로그램이 실행되기 위해서 JVM이 로딩되는 순간 저절로 만들어지는 영역
			   따라서 사용자가 요청하지 않아도 자동으로 생기는 영역
			***
			2. 한번 생긴 변수나 함수는 두번 생기지 않는다.
		
		static 변수
			==> static 영역에 만들어지는 변수(속성에 static이 붙은 변수)
				참고]
					변수 선언 형식]
						[접근지정자] [속성]  타입  변수이름;
						public       static  int   no;
			특징]
				1. 여러 객체(object)가 공동으로 사용하는 변수
					==> 한 클래스로 객체를 100개 만들어도 
					    한 이름의 static변수는 하나만 존재한다.
					    한 객체에서 데이터를 바꾸면 나머지 객체에서도 바뀐 데이터를 사용해야 한다.
				2. new 시키지 않아도 사용할 수 있는 변수이다.
					==> 이미 메모리에 올려져 있기 때문에
						
						사용법]
							클래스.변수이름;
							(static 변수의 소속은 각 클래스이다)
		static 함수
			==> 변수와 마찬가지로 static 영역에 생기는 함수
				객체가 없어도 사용할 수 있다.
				
					사용법]
						클래스.함수이름();
					
			***
			this를 사용할 수 없는 함수(this의 소속인 객체가 따로 없기 때문에)
			***
			static 함수 안에서는 static 멤버 + 인스턴스의 사용할 수 있다.
			일반 함수 안에서는 일반멤버와 static멤버도 사용할 수 있다.
 */
	public Test02() {
	}
	private int no1;
	public static void main(String[] args) {
		
/*
		int num1 = this.PI;
		(static 함수는 this를 사용할 수 없다.)
		abc();
		//메모리에 올려진 애들만 블러올 수 있다.
		==> new Test02().abc();
		
 */
	}
	public void abc() {
		
	}

}
