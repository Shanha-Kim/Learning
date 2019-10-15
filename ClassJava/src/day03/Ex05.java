package day03;
import java.util.Arrays;
import java.util.Scanner;
/*
	'A' ~ 'J' 까지 임의의 문자를 랜덤하게 100개 발생시킨 후 각 문자가 몇번씩 발생했는지 출력하세요
	
 */
public class Ex05 {
	int[] arrCount = new int[10];
	
	public Ex05() {
		//idx=0 =>'A'
		for (int i=0;i<100;i++) {
			arrCount[(int)(Math.random()*10)]+=1;
		}
		//System.out.println(Arrays.toString(arrCount));

		for (char i='A';i<75;i++) {
			System.out.println(i+"는 "+arrCount[i-65]+"번");
		}
	}

	public static void main(String[] args) {
		new Ex05();
	}
}
