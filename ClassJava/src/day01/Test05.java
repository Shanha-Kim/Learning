package day01;

import java.util.Scanner;

public class Test05 {
	/*
	 * �ܼ�ȯ�濡�� ������ �Է¹ޱ�
	 * Scanner Ŭ������ �ν��Ͻ��� ���� �Է¹޴´�.
	 * ����]
	 * 	��ü ����� ���
	 * 		Ŭ�����̸� �����̸� = new Ŭ�����̸�(); 
	 */

	public static void main(String[] args) {
		/*
		 * ��������
		 * 	����]
		 * 		final ������Ÿ�� ����̸�(�빮��) = ������;
		 * ���̰�(3.14)�� ������ �� �ִ� pi�� ���弼��
		 */
		final float pi = 3.14f;
		//�Ʒ��Ͱ��� ���� �ع����� ���� �� ������ �Ұ�����.
		//final float pi;
		//pi=3.14f;
		Scanner sc = new Scanner(System.in);
		//���۷������� + �ν��Ͻ� ==>��ü
		System.out.println("���� �������� �Է��ϼ��� : ");
		int rad = sc.nextInt(); //
		float area = rad*rad*pi;
		float around = 2*rad*pi;
		System.out.println("��������"+rad+" �� ���� ���̴� "+area+" �Դϴ�.");
		System.out.println("��������"+rad+" �� ���� �ѷ��� "+around+" �Դϴ�.");
		System.out.println(sc.nextInt());
		System.out.println(sc);
	}

}
