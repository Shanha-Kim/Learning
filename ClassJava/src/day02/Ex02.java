package day02;

import java.util.Scanner;

/*
 * ����2]
 * 	1���� 365.2426�� �̴�.
 * 	�̰��� ���� ��ð� ��� �������� ����ϼ���.
 */
public class Ex02 {
	public static void main(String[] args) {
		
		double day = 0.2426;
		double hour = Math.floor(day*24);
		double min = Math.floor((day*24)%1*60);
		double sec = Math.floor((day*24*60)%1*60);
		System.out.printf("1���� 365�� �ϰ� \n "
				+ "%f�ð�\n"
				+ "%f��\n"
				+ "%f�� �Դϴ�.",hour, min, sec);
	}
}