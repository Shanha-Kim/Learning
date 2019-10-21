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
		Dohyung rec = new Rec(5,7); //�䷸�� �ϸ� overriding�� ������ �� �ֵ�.
		Dohyung tri = new Tri(8,4);
		Dohyung cir = new Cir(10);
		System.out.println("�ﰢ�� : "+ tri.area +" | �簢�� : "+rec.area+" | �� : "+cir.area);
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
				System.out.println((i+1)+" �� ������ "+arr[i].getClass()+" �̰� ���̴� "+arr[i].area+" �Դϴ�.");
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
