package day08;
/*
	���� 3 ]
		
		�Ǽ� Ÿ�� ���� ���̸� ������ �ִ� Ŭ���� Dohyung�� �����
		
		�� Ŭ������ ��ӹ޾Ƽ�
		�簢��, �ﰢ��, �� �� ������ ������ Ŭ������ �����
		�� Ŭ�������� ������ ����ϼ���.
		
		---------------------------------------------------------------------------
		
		�簢��, �ﰢ��, �� ���� ������ ������ �ִ� ��ü�� �迭�� ��Ƽ� �����ϰ�
		������ ����ϼ���.
 */
public class Ex03  {

	public Ex03() {
		Rec rec = new Rec(5,7);
		Tri tri = new Tri(8,4);
		Cir cir = new Cir(10);
		System.out.println("�ﰢ�� : "+ tri.area +" | �簢�� : "+rec.area+" | �� : "+cir.area);
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
