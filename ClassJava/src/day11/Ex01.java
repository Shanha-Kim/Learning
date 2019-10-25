package day11;

import java.util.Scanner;

/*
	����1]
		���ڿ� �迭�� ����µ�
		�迭�� ���̴� 0~10���� �����ϰ� �����
		�迭�� ���� ��ŭ ���� Ÿ���� ���ڿ��� �Է��ؼ� �־��ְ�
		�̰��� �հ� ����� ���ϴ� ���α׷��� �ۼ��ϼ���.
		
		�߻��� �� �ִ� ���ܸ� �����ؼ� ��� ó���ϼ���.
			1. �迭�� ����� ����ϴ� ���
			2. ���ڷ� ��ȯ�� �Ұ����� ���
			3. ����� ���ϴµ� 0���� ���������� ���
		
 */
public class Ex01 {

	public Ex01() {
		Scanner sc = new Scanner(System.in);
		int n = (int)(Math.random()*4);
		System.out.println("�迭�� ���̴�:"+n);
		int total=0;
		String[] arr = new String[n];
		for (int i=0; i<n+1; i++) {
			try {
				System.out.println("���� ������ �Է��ϼ���!");
				arr[i]=sc.next();
				total+=Integer.parseInt(arr[i]);				
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("�迭�� ���̸� �ʰ��Ͽ����ϴ�.");
			}catch(Exception e) {
				System.out.println("���ڷ� ��ȯ�� �Ұ����մϴ�.");
				break;
			}
		}
		try {
			System.out.println("������:"+total+",  �����:"+Math.round(total/n*10)/10.0);			
		}catch(Exception e) {
			System.out.println("�迭�� ���̰� 0 �Դϴ�.");			
			
		}
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
