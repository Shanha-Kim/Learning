package day11;

import java.util.Scanner;

public class Test05 {
/*
	���������ϱ�
		==> �Լ� �ȿ��� �۾��� �ϴٰ�
			���ܰ� �߻��ϸ� �� �Լ��� ���̻� ������ �ʿ䰡 ��������.
			�׷��� �Լ��� ���ܸ� ������ �� �ֵ���(�ٸ������� ���ѱ� �� �ֵ���)
			�ص� ��찡 �ִ�.
			
		����]
			[����������][�Ӽ�] ��ȯ�� �Լ��̸�(�Ű���������Ʈ) throws ����Ŭ����1,
		�ǹ�]
			������ ���ܰ� �߻��ϸ� �� �Լ��� ���̻� �����ص� �ǹ̰� �����Ƿ� ������ 
			
		***
			���ܰ� ���̵� �Լ���
			�� �Լ��� ȣ���� ������ �ݵ�� ����ó���� ����� �Ѵ�.
			
		����]
			�Լ��� ���ܸ� �����ϴ� �Լ���
			����ó���� ���� �ʾƵ� �Ǵ� ��찡 �ִ�.
			
			�����ϴ� ���ܰ� RuntimeException �� ���� ������ ��쿡��
			����ó���� �ص� �׸� ���ص� �׸��̴�.
			(�ַ� java.lang �Ҽ� Ŭ������ �ִ� �Լ����� �̷���찡 ���� ����)
			
 */
	public Test05() {
		int no=0;
		System.out.println("1. ����ó�� ��");
		try {
			int num =100; //���������̴�.
			System.out.println("2. try ����");
			no = getNum();
			System.out.println("3. �Լ� ���� ��");
		}catch(Exception e) {
			System.out.println("���� �߻�");
			e.printStackTrace();
		}
		System.out.println("##### no: "+no);
	}

	public static void main(String[] args) {
		new Test05();
	}
	public int getNum() throws Exception{ 
		//�� �Լ��� ����� ���� �ݵ�� ����ó���� ����ϼ���! ��� �ȳ�
		//try�� ���� ������ �����߻�
		int no=0;
		System.out.println("�Լ� ������...");
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ��� :");
		no = sc.nextInt();
		System.out.println("�۾���...");
		return no;
				
	}

}
