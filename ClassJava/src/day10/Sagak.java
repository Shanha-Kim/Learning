package day10;

public class Sagak implements Figure {
	// ���� ����
	private int width;
	private int height;
	private double area;
	
	public Sagak() {
		
	}
	
	// ���ο� ���θ� �Է��ϸ� �簢���� ������ִ� ������ �Լ�
	public Sagak(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}

	@Override
	public void setArea() {
		this.area = width * height;
	}

	@Override
	public void toPrint() {
		System.out.printf("�簢�� - ��  �� : %3d | ��  �� : %3d | ��  �� : %6.2f\n", width, height, area);
	}

}
