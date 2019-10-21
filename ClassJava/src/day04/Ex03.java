package day04;

import java.util.Arrays;

/*
	선택정렬 구현
 */
public class Ex03 {

	public Ex03() {
		int[] arr = new int[10];
		for (int i=0; i<10; i++) {
			int n = (int)(Math.random()*10);
			if (Arrays.asList(arr).contains(n)) {} // 이건 정수의 경우에 해당 안됨.
			else {arr[i] = n;}
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		new Ex03();
	}
}
