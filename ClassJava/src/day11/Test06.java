package day11;

public class Test06 {
/*
	���� ���� �߻��ϱ�
		����]
			throw new ����Ŭ���� �̸�();
 */
	public Test06() {
		try {
			System.out.println("try ����");
			throw new Exception(); //������ catch�� ����
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Test06();
	}

}
