package day09;
/*
	Object 클래스
		:   자바로 만들어진 클래스의 최상위 super 클래스
			따라서 자바로 만들어진 모든 클래스는 Object의 멤버를 가지고 있꼬 
			Object가 제공하는 모든 기능(멤버 : 변수, 함수)을 자동적으로 사용할 수 있게 된다.
			
		참고]
			자바로 만든 모든 클래스는 반드시 상위 클래스를 가지고 있따.
			우리가 만드는 모든 클래스들도 상위 클래스가 존재하고 
			망약 강제로 상위 클래슬르 지정하지 않으면 (==>extends 하지 않으면)
			묵시적으로 Object 클래스를 상속받아서 만들어진다.
		
		***
		자바로 만든 모든 클래스는 Object 클래스의 하위 클래스이다.
		==================================================================================
		
		***
		instanceof
			==> 특정 클래스의 인스턴스를 만들면 주소가 만들어지느데
				ㅂㅈㄷ
				
			형식]
				주소 instanceof 클래스이름
			의미]
				지정한 클래스 소속인지를 물어보는것
				
 */
public class Test03 {

	public Test03() {
		Object[] o = {1, 3.14, "abcd", 'a', true};
		System.out.println("1 : "+ ("123" instanceof String));
		System.out.println("2 : "+ ((Integer)10 instanceof Integer));
		System.out.println("2 : "+ ((Integer)10 instanceof Integer));
		
		for(int i=0; i<5; i++) {
			if(o[i] instanceof String) {
				System.out.println("문자열 : " + o[i]);
			}else if (o[i] instanceof Integer) {
				System.out.println("정수 : " + o[i]);
			}else if (o[i] instanceof Double) {
				System.out.println("실수 : " + o[i]);
			}else if (o[i] instanceof Boolean) {
				System.out.println("불린 : " + o[i]);
			}else if (o[i] instanceof Character) {
				System.out.println("문자 : " + o[i]);
			}
		}
	}

	public static void main(String[] args) {
		new Test03();
	}

}
