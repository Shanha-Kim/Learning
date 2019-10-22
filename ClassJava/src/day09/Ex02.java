package day09;

import java.util.Arrays;

/*
	�簢�� �ΰ��� �����(���� �Ʒ� �𼭸���ǥ, ����, ���η� ������)
	�� �簢���� ��ġ�� ���̸� ���Ͻÿ�
 */
public class Ex02 {
	int a;
	public Ex02() {
		// �迭 = {x��ǥ, y��ǥ, ����, ����}
		
	    int[] rec1 = new int[4]; 
	    int[] rec2 = new int[4]; 
	    for(int i=0; i<4; i++) {
	    	rec1[i]=(int)(Math.random()*50); 
	    	rec2[i]=(int)(Math.random()*50); 
	    }
	    //int[] temp1 = {0,0,20,30};
	    //int[] temp2 = {10,10,20,30};
		System.out.println("�簢���� ��ġ�� ���̴� "+Cal(rec1, rec2)+" �Դϴ�.");
	}

	public static void main(String[] args) {
		new Ex02();
	}
	public int Cal(int[] rec1, int[] rec2) {
		int[][] map = new int[100][100];
		int area=0;
		for (int i=rec1[0]; i<rec1[0]+rec1[2]; i++) {
			for (int j=rec1[1]; j<rec1[3]; j++) {
				map[i][j]+=1;
			}
		}
		for (int i=rec2[0]; i<rec2[0]+rec2[2]; i++) {
			for (int j=rec2[1]; j<rec2[3]; j++) {
				map[i][j]+=1;
				if (map[i][j]==2) {
					area+=1;
				}
			}
		}
		return area;
	}
}
