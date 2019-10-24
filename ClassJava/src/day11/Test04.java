package day11;

public class Test04 {
/*
	finally 블럭
		==> 예외 발생 여부와 관계없이 반드시 실행되어야 할 문장이 존재할경우 사용
			try, catch 에서 함수나, 프로그램이 종료되더라도 finally까지는 실행한다.
		참고]
			만약 finally블럭이 존재한다면 catch() 블럭은 생략할 수도 있다.
	============================================================================
	
	예외정보 출력하기
		
		1. 예외정보클래스 변수를 출력하면 된다.
			System.out.println(예외클래스변수);
			==>예외의 원인을 파악할 수 있다.
			==>Throwable 클래스의 toString()을 자동호출한다.
			
		2. e.printStackTrace()를 이용하는 방법
			==>예외의 정보 + 위치
		
		***
			예외처리는 예외의 정보를 알아내고 
			그 프로그램의 문제점의 위치를 알려줘서
			정상적으로 프로그램의 작동을 시킬 수 있는 방법을 찾을 수 있다. 
 */
	public Test04() {
		check();
	}

	public static void main(String[] args) {
		new Test04();
	}
	public void check() {
		try {
			System.out.println("내가 try");
			return;
		}catch(Exception e) {
			System.out.println("내가 catch");

		}/*finally {
			System.out.println("내가 finally");
		}*/
		System.out.println("나는 finally 바깥");
	}
}
