package day04;

import java.util.Arrays;

/*
	문제2]
		대문자를 랜덤하게 10개 발생시켜서 배열에 저장하고 하나씩 차례로 출력하세요
		단, 중복문자는 없어야 한다.
 */
public class Ex02 {

	public Ex02() {
		int[] chArr = new int[10];
		for (int i=0; i<10; i++) {
			int n = (int)(Math.random()*26);
			if(Arrays.asList(chArr).contains(n)) {	
			}else {chArr[i]=n;}
		}
		for (int no:chArr) {
			System.out.print((char)(no+65)+" ");
		}
	}

	public static void main(String[] args) {
		new Ex02();
	}

}
