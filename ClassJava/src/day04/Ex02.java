package day04;

import java.util.Arrays;

/*
	����2]
		�빮�ڸ� �����ϰ� 10�� �߻����Ѽ� �迭�� �����ϰ� �ϳ��� ���ʷ� ����ϼ���
		��, �ߺ����ڴ� ����� �Ѵ�.
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
