package day10;

public class Circle extends Dohyung {
	private int rad; // ������ ������ ����
	
	public Circle() {
		this(1);
	}
	
	// �������� �ԷµǸ� ���� ������ִ� ������ �Լ�
	public Circle(int rad) {
		this.rad = rad;
		setArea();
	}

	@Override
	public void setArea() {
		this.area = rad * rad * Math.PI;
	}
	
	/*
		�߻��Լ��� �����ε��ص� �������.
	public double setArea(int rad) {
		return 1.;
	}
	*/

	@Override
	public void toPrint() {
		System.out.printf("��  �� - ������ : %3d | ��  �� : %6.2f\n", rad, area);
	}
}
