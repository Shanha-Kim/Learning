package day10;

public class Won implements Figure {
	// �����͸� ������ ������ �����ϰ�
	private int rad;
	private double area;
	
	public Won() {
		this(1);
	}
	
	public Won(int rad) {
		this.rad = rad;
		setArea();
	}

	@Override
	public void setArea() {
		this.area = rad * rad * Math.PI;
	}

	@Override
	public void toPrint() {
		System.out.printf("��  �� - ������ : %3d | ��  �� : %6.2f\n", rad, area);
	}

}
