package day03;
import java.util.Scanner;
/*
 * ��ҹ��� ��ȯ
 * �빮�ڸ� =>�ҹ��ڷ�
 * �ҹ��ڸ� =>�빮�ڷ�
 * 
 */
public class Ex01 {
	public Ex01() {
		
	}
	public static void main(String[] args) {
		new Ex01();
		System.out.println("���ڸ� �ϳ� �Է��ϼ���: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char ch = str.charAt(0);
		if (Character.isUpperCase(ch)==true) {
			System.out.println(str.toLowerCase());
		}else {
			System.out.println(str.toUpperCase());
		}
	}
}
