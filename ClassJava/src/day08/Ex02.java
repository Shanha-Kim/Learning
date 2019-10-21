package day08;
/*
	가로와 세로값을 가지는 사격형 클래스를 만든다.
	넓이는 함수로 관리한다.
	인스턴스를 만들때 데이터가 없으면 가로와 세로를 10으로 초기화 해주도록 한다.
	클래스를 정의하세요.
 */
public class Ex02 {

	public Ex02() {
		Rect rec1=new Rect();
		Rect rec2=new Rect(15,8);
		System.out.println(rec1.area);
		System.out.println(rec2.area);
	}

	public static void main(String[] args) {
		new Ex02();
	}
	
}
