package day05;

import java.util.Arrays;

public class PreEx01 {
//�������迭�� �ѹ��� ������ deeptoString
//�迭�� ����� �Ǹ� heap ������ ����� �Ǵµ� �̶� heapŸ���� ���� �͵鸸 �迭�ȿ� ���� �� �ִ�.
	
	public PreEx01() {
		int[][] arr = new int[2][10];
		for (int i=0; i<100; i++) {			
			arr[1][(int)(Math.random()*10)]+=1;
		}
		for (int i=0; i<10; i++) {
			System.out.println((char)(arr[0][i]+65+i)+"�� "+arr[1][i]+"�� ���Խ��ϴ�.");			
		}
	}
	public static void main(String[] args) {
		new PreEx01();
	}
}
