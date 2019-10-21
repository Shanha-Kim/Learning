package day08;
/*
	가로와 세로값을 가지는 사격형 클래스를 만든다.
	넓이는 함수로 관리한다.
	인스턴스를 만들때 데이터가 없으면 가로와 세로를 10으로 초기화 해주도록 한다.
	클래스를 정의하세요.
*/
public class Rect {
	int width=10;
	int height=10;
	double area=100;
	public Rect() {
	}
	public Rect(int w, int h) {
		this.width=w;
		this.height=h;
		this.area=area(w,h);
	}

	double area(int w, int h) {
		return w*h;
	}
}
