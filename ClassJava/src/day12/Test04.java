package day12;

import java.util.Objects;

public class Test04 {
/*
	Objects
		==>	�� Ŭ������ 100% static �Լ��θ� ������ Ŭ����
			��ü�� �ٷ궧 ������ ��� ��ƿ��Ƽ���� �Լ��� ������ Ŭ����
			
			��]
				isNull(Object obj)
				==>	��ü�� ������ �ִ����� Ȯ���ϴ� �Լ�
 */
	public Test04() {
		int[] num1 = null ;
		int[] num2 = new int[0];
		System.out.println("int[] num1 = null : " + Objects.isNull(num1));
		System.out.println("int[] num2 = new int[0] : " + Objects.isNull(num2));
	}

	public static void main(String[] args) {
		new Test04();
	}

}
