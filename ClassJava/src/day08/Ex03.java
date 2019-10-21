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
		Dohyung rec = new Rec(5,7); //요렇게 하면 overriding을 연습할 수 있따.
		Dohyung tri = new Tri(8,4);
		Dohyung cir = new Cir(10);
		System.out.println("삼각형 : "+ tri.area +" | 사각형 : "+rec.area+" | 원 : "+cir.area);
		//============================================================//
		Dohyung[] arr = new Dohyung[6];
		for (int i=0; i<2; i++) {
			rec = new Rec(i+5,i+3);
			tri = new Tri(i+8,i+2);
			cir = new Cir(i+9);
			arr[i] = tri;
			arr[i+2] = rec;
			arr[i+4] = cir;
		}
		for (int i=0; i<6; i++) {
				System.out.println((i+1)+" 번 도형은 "+arr[i].getClass()+" 이고 넓이는 "+arr[i].area+" 입니다.");
		}
	}

	public static void main(String[] args) {
		new Ex03();
	}
	
	class Rec extends Dohyung{
		public Rec(int w, int h) {
			this.w=w;
			this.h=h;
			area = getA();
		}
		public double getA() {
			return w*h*0.5;
		}
		
	}
	class Tri extends Dohyung{
		public Tri(int w, int h) {
			this.w=w;
			this.h=h;
			area = getA();
		}
		public double getA() {
			return w*h;
		}
	}
	class Cir extends Dohyung{
		public Cir(int r) {
			this.r=r;
			area = getA();
			round = 3.14*2*r;
		}
		public double getA() {
			return r*r*3.14;
		}
	}

}
