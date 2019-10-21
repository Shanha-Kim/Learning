package day08;
/*
	문제 3 ]
		
		실수 타입 변수 넓이를 가지고 있는 클래스 Dohyung을 만들고
		
		그 클래스를 상속받아서
		사각형, 삼각형, 원 의 정보를 가지는 클래스를 만들고
		그 클래스들의 정보를 출력하세요.
		
		---------------------------------------------------------------------------
		
		사각형, 삼각형, 원 들의 정보를 가지고 있는 객체를 배열에 담아서 저장하고
		내용을 출력하세요.
 */
public class Ex03  {

	public Ex03() {
		Rec rec = new Rec(5,7);
		Tri tri = new Tri(8,4);
		Cir cir = new Cir(10);
		System.out.println("삼각형 : "+ tri.area +" | 사각형 : "+rec.area+" | 원 : "+cir.area);
		Dohyung[] arr = new Dohyung[6];
	}

	public static void main(String[] args) {
		new Ex03();
	}
	
	class Rec extends Dohyung{
		int w;
		int h;
		double area ;
		public Rec(int w, int h) {
			this.w=w;
			this.h=h;
			this.area = w*h*0.5;
		}
	}
	class Tri extends Dohyung{
		int w;
		int h;
		double area;
		public Tri(int w, int h) {
			this.w=w;
			this.h=h;
			this.area = w*h;
		}
	}
	class Cir extends Dohyung{
		int r;
		double round = 3.14*2*r;
		double area ;
		public Cir(int r) {
			this.r=r;
			this.area = 3.14*r*r;
		}
	}

}
