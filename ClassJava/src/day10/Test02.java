package day10;


import extra.*;

public class Test02 {
/*
	final 속성
		
		1. final class
			==> 이 클래스는 더이상 상속을 해줄 수 없는 클래스임을 밝히는 속성
				기능을 추가 또는 변경을 할 수 없는다는 이야기고
				만들어져 있는 기능을 그대로 그냥 사용하세요...
				
				
		2. final Method
			==> 이 함수는 더 이상 함수의 재정의(Overriding)가 불가능한 함수
				따라서 이 함수는 엄청나게 중요한 함수이므로
				함부로 기능을 재정의(바꾸지)하지 말고 현재 기능 그대로 사용하세요.
				
		3. final 변수
			==> 이 변수는 값을 수정할 수 없는 변수
				선언과 동시에 데이터가 초기화가 되야 된다.
				
========================================================================
	
	은닉화 / 캡슐화
		==> 프로그램에 있어서 가장 중요한 요소는 데이터 이다.
			데이터는 변수가 담당하고
			따라서 변수가 프로그램에서의 핵심적인 요소가 된다.
			
			그러므로 무결성 데이터를 유지할 수 있는 것이 가장 핵심적인 개념이 된다.
				무결성 - 결함이 없는 성질...
				
		**
		은닉화란
			: 프로그램에 있어서 가장 중요한 요소인 변수를 함부로 변경하지 못하도록 
				(결점이 있는 데이터가 입력되는 것을 방지하도록...
				결점 생기는 것을 방지하도록..)
				방지하는 기법을 은닉화라 한다.
				
			방법]
				1. 중요한 데이터가 저장되는 변수는 접근지정자를 
						private	으로 지정하고
				2. 해당 변수에 데이터를 입력을 하거나 읽어오는 기능은
					함수로 처리를 한다. 
					함수의 접근 지정자는 public 으로 지정한다.
				
 */
	
	public final int ABC = 123;
	// 선언과 동시에 초기화가 이루어 져야 한다. 데이터를 수정할 수 없기 때문에...
	Score s = new Score();
	
	public Test02() {
		s.setKor(50);
		s.setEng(70);
		s.setMath(100);
		s.setSci(100);
		s.setProg(100);
		s.setTotal();
		s.setAvg();
	}

	public static void main(String[] args) {
		new Test02();
	}

}

/*
class Str extends String {
	
}
*/
