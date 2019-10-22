package day09;
/*
	DohyungŬ������ ��ӹ޾Ƽ� 
	�簢�� �ﰢ�� �� Ŭ������ �ۼ��ϰ�
	�迭�� ������ 10���� �����ϴµ� (����Ÿ������)
	�����ϰ� 0,1,2�� �߻����Ѽ�
	0-��
	1-�ﰢ
	2-�簢
	�� ����� �����϶�.
	�� �������� ������ ������ִ� ����� ���� toPrint()�� �������ϰ� �����ϼ��� 
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
			//�Լ��� �������̵� ����
			//������ ������ ������ �켱ȣ�� 
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
		System.out.println("����� Dohyung!");
	}
	
}
class Tri extends Dohyung {
	public Tri(int w, int h) {
		this.w=w;
		this.h=h;
		this.area=w*h*0.5;
	}
	public void toPrint() {
		System.out.println("�� �ﰢ���� �غ���  : "+w+", ���̴�: "+h+", ���̴�: "+area+" �Դϴ�.");
	}
}
class Rec extends Dohyung {
	public Rec(int w, int h) {
		this.w=w;
		this.h=h;
		this.area=w*h;
	}
	public void toPrint() {
		System.out.println("�� �簢���� ���δ�  : "+w+", ���δ�: "+h+", ���̴�: "+area+" �Դϴ�.");
	}
}
class Cir extends Dohyung {
	public Cir(int r) {
		this.r=r;
		this.area=r*r*3.14;
	}
	public void toPrint() {
		System.out.println("�� ������� ��������: "+r+", ���̴�: "+area+" �Դϴ�.");
	}
}