package day07;

import java.util.Arrays;

/*
�迭 Ȱ��
����4]
	1. �����迭
		10, 20, 30, 40, 50
		�� ������ �� �ִ� �迭�� ����� �� �迭�� ���� ����� �����ؼ�
	2. �� ������ ��������� ����� �迭�� 
		40, 50, 30, 10, 20
		���� �����ϼ���.
*/
public class Ex03 {

	public Ex03() {
		int[] arr1 = {10, 20, 30, 40, 50};
		int[] arr2 = new int[5]; 
		System.arraycopy(arr1, 0, arr2, 0, 5);
		arr2[0]+=30; arr2[1]+=30; arr2[3]-=30; arr2[4]-=30;
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}

	public static void main(String[] args) {
		new Ex03();
	}

}
