package day07;

import java.util.Arrays;

/*
배열 활용
문제4]
	1. 정수배열
		10, 20, 30, 40, 50
		을 저장할 수 있는 배열을 만들고 이 배열을 깊은 복사로 복사해서
	2. 위 문제를 깊은복사로 복사된 배열을 
		40, 50, 30, 10, 20
		으로 수정하세요.
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
