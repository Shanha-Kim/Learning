package day02;

import java.util.Scanner;

/*
 * ����1]
 * 	54320�� �츮���� ȭ�󺰷� ������ �ʿ����� ���
 */
public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ݾ��� �Է��ϼ���: ");
		int gold = sc.nextInt();
		System.out.printf("�Է��Ͻ� �ݾ��� \n" +
							"������¥�� : "+gold/50000+"��\n"+ 
							"����¥�� : "+gold/10000%5+"��\n"+
							"��õ��¥�� : "+gold/5000%2+"��\n"+
							"õ��¥�� : "+gold/1000%5+"��\n"+
							"�����¥�� : "+gold/500%2+"��\n"+
							"���¥�� : "+gold/100%5+"��\n"+
							"���ʿ�¥�� : "+gold/50%2+"��\n"+
							"�ʿ�¥�� : "+gold/10%5+"��\n"+
							"�Ͽ�¥�� : "+gold/1%10+"��\n"
				);
	}

}
