package day01.ex01;
/**
 * @author KSH
 * @since 2019.10.10
 * @version 1.0
 * @see
 * 	�� Ŭ������ static �Լ��� ������ �����ϴ� Ŭ�����̴�. 
 */

public class Test01 {
	static int num = 10;
	int num2 = 200;
	public static void main(String[] args) {
		System.out.println("num : " + num);
		System.out.println("num2 : " + new Test01().num2);
	}
}
