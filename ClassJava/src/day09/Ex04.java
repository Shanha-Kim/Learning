package day09;
import java.util.Scanner;

/*
	����4]
		�ڵ����� ��ȭ��ȣ�� ������ ���α׷��� ���� �����̴�.
		ģ�� Ŭ������ �ۼ��ϰ�
		ģ���� �߰��ؼ� 
		�̸� �˻��ϸ� ������ �˷��ִ� ���α׷��� �ۼ��ϼ���.
 */
public class Ex04 {

	public Ex04() {
		Friend[] arr = new Friend[10];
		System.out.println("ģ�� ����Դϴ�.");
		for(int i=0; i<10; i++) {
			arr[i] = new Friend();
			System.out.println(arr[i].name);
		}
		Scanner sc = new Scanner(System.in);

		System.out.println("\nã����� ģ���� �� �ּ���");
		String n = sc.nextLine();
		for(int i=0; i<10; i++) {
			if ((arr[i].name).equals(n)) {
				System.out.println("�� ģ���� ��ȣ�� "+arr[i].phone+" �Դϴ�." );
			}
		}

	}

	public static void main(String[] args) {
		new Ex04();
	}
}
class Friend{
	String name="David ";
	String phone="82)";
	public Friend() {
		for (int i=0; i<8; i++) {
			name += (char)(int)(Math.random()*25+65);
			phone += (char)(int)(Math.random()*9+48);
		}
	}
}
