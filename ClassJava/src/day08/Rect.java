package day08;
/*
	���ο� ���ΰ��� ������ ����� Ŭ������ �����.
	���̴� �Լ��� �����Ѵ�.
	�ν��Ͻ��� ���鶧 �����Ͱ� ������ ���ο� ���θ� 10���� �ʱ�ȭ ���ֵ��� �Ѵ�.
	Ŭ������ �����ϼ���.
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
