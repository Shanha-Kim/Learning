package day08;
/*
	상속]
		이미 만들어진 클래스의 기능을
		그대로 물려받아서(변수와, 함수의 기능을 그대로 복사받아서)
		새로운 클래스를 만드는 방법
		
		이 개념이 나타나게 된 이유
		==> 소프트웨어의 개발 속도를 빠르게 하기 위해서 ....
		
		즉, 상속은 객체지향 언어의 핵심이고 매우 중요한 역할을 한다.
		객체 지향 원하는 부품단위로 (클래스단위로) 프로그램을 만든후 
		그 부품을 조립해서 원하는 결과를 얻어내는 것
		
		??
			어디서 부품을 구했는데 그 기능이 사용자의 마음에 꼭 맞지는 않다.
			그럼 처음부터 부품을 다시 만들어야 할까?
		??
		==> 해결방법 : 상속
		
		상속은 본인이 원하는 부품과 가장 유사한 부품을 복사한 후
			1. 없는 기능은 덧 붙이고
			2. 있는 기능중 바꿀 내용은 바꾸고...
			
		상속을 하는 형식] 
		
			[접근지정자][속성] class 클래스이름 extends 상속받을 클래스이름 {
				예전 클래스가 가진 모든 멤버는 이 안에 모두 복사되어 있다.
			}
		
		참고] 
			자바에서는 오직 단일 상속만 가능하다.
			즉, 상속을 받을 클래스는 한개만 가능하다.
			
		용어정리]
			상속을 해준 클래스 - super class, 상위 클래스, 부모클래스
			상속을 받은 클래스 - sub class, 하위클래스, 자식클래스
			***
			is a - 상속 관계에 있는 클래스를 부르는 용어
				
				class Father{}
				class Son extends Father{}
				
				==> Sun is a Father
				==> Father f = new Son(); 
				==> Object o = new String();, new Math();.....
				(Object가 가장 상위, 조상 클래스 이기떄문에)
			
				
			has a - 어떤 클래스 안에 다른 클래스를 멤버로 가지고 있는 상태
				
				class Father{}
				class Sun {
					Father f = new Father();
				}
				==> Sun has a Father
		========================================================================
		***
		함수의 오버라이딩(Overriding : 함수의 재정의)
			==> 상속관계에 있는 하위클래스에서
				상위 클래스가 가진 함수의 기능을 수정하는 행위
			
			규칙]
				0. 전제조건으로 상속을 받아야 한다.
				1. 상위 클래스가 가진 함수의 원형과 동일해야 한다.
					함수의 원형 : 반환값 + 함수이름 + 매개변수리스트
				2. 접근지정자는 같거나 넓은 방향으로 ...
				3. 예외처리는 같거나 좁은 방향으로...
 */
public class Test04 {

	public Test04() {
		Grand hal = new Grand();
		Father apa = new Father();
		Son adle = new Son();
		System.out.println("hal tlnee:"+hal.tlnee);
		System.out.println("apa tlnee:"+apa.tlnee);
		System.out.println("adle tlnee:"+adle.tlnee);
		
		Grand g = new Father();
		System.out.println("g tlnee : "+g.tlnee);
		System.out.println("g money : "+((Father)g).money); //Grand의 멤버에 money는 없다.
		//Father f = new Grand();  //Grand의 인스턴스에는 Father의 멤버가 부족하다.
		//Father f = (Father)new Grand(); 
		//강제 형변환을 통해 멤버를 추가할 수 있다.(단 상속관계일때만)
		Grand g2 = new Son();
		System.out.println("g2 tlnee : "+g2.tlnee);
		System.out.println("g2 age : "+g2.age); //***g2의 생성타입이 grand 이므로 
		g2.abc(); //***함수의 경우는 맨 마지막에 overriding한 함수를 보여준다.
	}

	public static void main(String[] args) {
		new Test04();
	}
	class Grand{
		int age = 80;
		boolean tlnee = true;
		public void abc() {
			System.out.println("여기는 Grand!");
		}
	}
	class Father extends Grand {
		int age = 50;
		int money = 1000;
		String talmo = "Nooooo!!!";
		public void abc() {
			System.out.println("여기는 Father!");
		}
				
	}
	class Son extends Father {
		int age = 20;
		public void abc() {
			System.out.println("여기는 Sun!");
		}
	}
}
