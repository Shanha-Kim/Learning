package day11;

import java.util.Scanner;

/*
	����1]
		ChangeŬ�������� ���ڸ� �Է¹޾Ƽ�
		Test02�� no ���� �����ϰ� ����غ���.
		
		��, ChangeŬ������ Test02.no�� Test02���� 
		�ν��Ͻ��� ���� �Լ��� ȣ���ؼ� ��������.
 */
public class Test02 {
	
	int no = 10;
	public Test02() {
		Change ch = new Change(this);
		System.out.println("�Լ� ȣ�� �� no : " + no);
		ch.cNo();
		
		System.out.println("�Լ� ȣ�� �� no : " + no);
	}

	public static void main(String[] args) {
		new Test02();
	}
}
class Change{
	//Test02�� ��ü�� ����� ������ �ʿ�
	Test02 main;
	public Change(Test02 main) {
		this.main = main;
	}
	
	public void cNo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ no�� �� : ");
		int tmp = sc.nextInt();
		main.no = tmp;
	}
}
