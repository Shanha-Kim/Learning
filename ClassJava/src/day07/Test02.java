package day07;

import java.util.Arrays;

/*
	클래스 하나를 제작을 하면
	그 하나를 가지고 객체를 여러개 만들어서 사용할 수 있다.
	
	우리가 제작하는 클래스는 붕어빵으로 
	생각한다면 붕어빵 틀에 해당하고
	그 틀에서 찍어낸 붕어빵이 객체가 되는데 
	하나의 틀에서 여러개의 붕어빵을 만들 수 있으므로 
	객체도 하나의 클래스에서 여러개 만들 수 있다.
	
	결론]
		객체는 만들어지면 각 객체들이 별도로 작동한다.
	
	전역변수
		==> 선언된(만들어진) 불럭( {} )내의 모든 곳에서 사용될 수 있는 변수
				
				if(a<10){
					
				}
				
			이 조건문의 영역은 {} 내부를 의미하고 그 영역 안에서 만들어진 변수는 
			그 영역 내부의 모든 곳에서 사용이 가능하다.
			클래스를 생성할때
				public class Test{
					
				}
			와 같이 영역을 정해놓기 때문에
			그 영역 안(블럭 바로 아래에)에서 변수를 만든다면
			클래스 내의 모든 곳에서 사용할 수 있다.
	지역변수
		==> 해당 지역에서만 사용할 수 있는 변수(상대적이다)
		==> 일반적으로 지역변수냐, 전역변수냐를 구분하는 기준은 클래스가 된다.
	==============================================================================
	
	전역변수는 자동초기화 된다.
	전역변수는 클래스의 멤버로 선언이 되고
	클래스는 Heap영역에 인스턴스를 만들게 되는데
	heap영역에 만들어지는 변수들은 모두 자동초기화 된다.(기본데이터 타입만)
	
	전역변수가 탄생하는 순간
		==> 인스턴스가 만들어지는 순간(new 시키는 순간)
	소멸 시점
		==> 프로그램이 종료되는 순간
	===============================================================================
	
	객체의 배열
		==> 하나의 클래스로 객체를 여러개 만들 수 있으므로 
			배열로 만들어서 관리도 할 수 있다.
		
		만드는 방법]
			클래스 이름[] 변수이름;
			변수이름 = new 클래스이름[길이]
			
			변수이름[0] = new 클래스이름();
			변수이름[1] = new 클래스이름();
			...
			...
			변수이름[n] = new 클래스이름();
			
			
 */
public class Test02 {

	public Test02() {
		Object a = null;
		System.out.println(a);
	}

	public static void main(String[] args) {
		new Test02();
	}

}
