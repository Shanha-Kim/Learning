package day04;

import java.util.Arrays;

/*
	배열 정렬하기
		1~99 까지의 숫자를 랜덤하게 10개 만들어서 배열에 저장하고 
		크기가 작은 순으로 배열에 정렬하세요.
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
