package day09;
/*
	Dohyung클래스를 상속받아서 
	사각형 삼각형 원 클래스를 작성하고
	배열에 데이터 10개를 저장하는데 (도형타입으로)
	랜덤하게 0,1,2를 발생시켜서
	0-원
	1-삼각
	2-사각
	을 만들고 저장하라.
	각 데이터의 정보를 출력해주는 기능을 가진 toPrint()를 재정의하고 실행하세요 
 */
public class Ex01 {
	Dohyung[] arr = new Dohyung[10];
	public Ex01() {
		int rn;
		for (int i=0; i<10; i++) {
			rn = (int)(Math.random()*3);
			if (rn==0) {
				arr[i] = new Cir((int)(Math.random()*10+1));
			}else if (rn==1) {
				arr[i] = new Tri((int)(Math.random()*10+1), (int)(Math.random()*10+1));
			}else if (rn==2) {
				arr[i] = new Rec((int)(Math.random()*10+1), (int)(Math.random()*10+1));
			}
			arr[i].toPrint();
			//함수는 오버라이딩 적용
			//변수는 조상의 변수를 우선호출 
		}
	}

	public static void main(String[] args) {
		new Ex01();
	}
 
}
class Dohyung {
	int w; //width
	int h; //height
	int r; //radius
	double area;
	public void setArea() {
		this.area = 0;
	}
	public void toPrint() {
		System.out.println("여기는 Dohyung!");
	}
	
}
class Tri extends Dohyung {
	public Tri(int w, int h) {
		this.w=w;
		this.h=h;
		this.area=w*h*0.5;
	}
	public void toPrint() {
		System.out.println("이 삼각형의 밑변은  : "+w+", 높이는: "+h+", 넓이는: "+area+" 입니다.");
	}
}
class Rec extends Dohyung {
	public Rec(int w, int h) {
		this.w=w;
		this.h=h;
		this.area=w*h;
	}
	public void toPrint() {
		System.out.println("이 사각형의 가로는  : "+w+", 세로는: "+h+", 넓이는: "+area+" 입니다.");
	}
}
class Cir extends Dohyung {
	public Cir(int r) {
		this.r=r;
		this.area=r*r*3.14;
	}
	public void toPrint() {
		System.out.println("이 워어언의 반지름은: "+r+", 넓이는: "+area+" 입니다.");
	}
}