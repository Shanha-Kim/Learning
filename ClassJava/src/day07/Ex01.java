package day07;
/*
	���ǹ� Ȱ��
	����1]
		1000~3000�� ������ �⵵�� �����ϰ� �߻����Ѽ� 
		�߻��� �⵵�� �������� ��������� �Ǻ�
		
		����]
			4�� ������ ��������
			100���δ� ���������� �ʰ�
			400���δ� ���������� �⵵
 */
public class Ex01 {

	public Ex01() {
		int y;
		while (true) {
			y = (int)(Math.random()*2001)+1000;

			if (y%400==0) {
				System.out.println(y+"���� "+"�����Դϴ�.");
				break;
			}else if(y%100!=0 && y%4==0) {
				System.out.println(y+"���� "+"�����Դϴ�.");
				break;
			}else {
				System.out.println(y+"���� "+"����Դϴ�.");	
			}
		}
		
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
