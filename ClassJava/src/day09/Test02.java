package day09;
/*
	super
		:   this가 실행중인 자신의 주소를 기억하는 예약된 변수이듯이
			super 역시 예약된 변수 중 하나
			자신의 상위 클래스의 주소가 기억된 변수
			
		***
			변수는 조상을 따르고!
			함수는 최신 수정을 따르고!
		***
			사용목적]
				반드시 소속을 밝혀야 하는 경우에 사용한다.
 */ 
public class Test02 {
	Son temp = new Son();
	
	public static void main(String[] args) {
		//아래 두 실행문의 순서 차이
		System.out.println("main");
		new Test02().temp.call();
	}
	{temp.call();}
	
	
	
}
class Grand{
	int age = 80;
	public void abc() {
		System.out.println("여기는 Grand!");
	}
}
class Father extends Grand {
	int age = 50;
	public void abc() {
		System.out.println("여기는 Father!");
	}
	public void call() {
		abc();
		super.abc();	
		System.out.println(age);
		System.out.println(super.age);
	}
	
	//{abc();}  //클래스내부에 함수의 실행은 블럭 안에서!, Father 객체 생성시 자동실행(main처럼)
}
class Son extends Father {
	 
	//{call();}
}
