package day03;
import java.util.Arrays;
import java.util.Scanner;
/*
	'A' ~ 'J' ���� ������ ���ڸ� �����ϰ� 100�� �߻���Ų �� �� ���ڰ� ����� �߻��ߴ��� ����ϼ���
	
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
			System.out.println(i+"�� "+arrCount[i-65]+"��");
		}
	}

	public static void main(String[] args) {
		new Ex05();
	}
}
