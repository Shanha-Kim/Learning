package day02;

import java.util.Scanner;

/*
 * Method �ۼ���
 * 	����]
 *  	[����������] [�Ӽ�] ��ȯ�� �Լ��̸�(�Ű���������Ʈ){
 *  		
 *  	}
 *  	*�Ű���������Ʈ : �Լ��� ������ �� �� �Է��ؾߵǴ� �����͵��� ���¿� �����̸�
 *  	*�Լ��� ���� : ����������, �Ӽ�, ��ȯ��Ÿ��, �̸�, �Ű���������Ʈ������ �̾߱��Ѵ�.
 *  
 *  ����]
 *  	; - ��ū�� ����Ű�� ��ȣ..
 *  	��ū - �ϳ��� ��ɴ���
 *  	������ �����ϴ� ���� {}�� ������ ��� {}�� ;�� ������ ����Ѵ�.
 *  
 */		
 		
public class Test06 {
	static int getsum(int n1, int n2) {
		return n1+n2;
	}
	public void printsum(int n1, int n2) {
		System.out.println(n1+n2);
	}
	public void inputprintsum() {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		System.out.println(n1+n2);
	}
	
	public static void main(String[] args) {
		System.out.println(getsum(10,1));
		new Test06().printsum(10,1);
		
	}
}
