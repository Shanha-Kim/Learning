package day04;

import java.util.Arrays;

/*
	�迭 �����ϱ�
		1~99 ������ ���ڸ� �����ϰ� 10�� ���� �迭�� �����ϰ� 
		ũ�Ⱑ ���� ������ �迭�� �����ϼ���.
 */
public class Test02 {

	public Test02() {
		int[] num = getIntArr();
		System.out.println(Arrays.toString(num));
	}
	public static void main(String[] args) {
		new Test02();
	}
	@SuppressWarnings("unlikely-arg-type")
	public int[] getIntArr() {
		int[] num = new int[10];
		for (int i=0; i<10; i++) {
			int n = (int)(Math.random()*99+1);
			if (Arrays.asList(num).contains(n)) {}		
			else {num[i]=n;}
		}
		return num;
	}
	
}
