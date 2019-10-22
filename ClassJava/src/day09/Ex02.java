package day09;

import java.util.Arrays;

/*
	사각형 두개를 만들고(왼쪽 아래 모서리좌표, 가로, 세로로 구성된)
	두 사각형이 겹치는 넓이를 구하시오
 */
public class Ex02 {
	int a;
	public Ex02() {
		// 배열 = {x좌표, y좌표, 가로, 세로}
		
	    int[] rec1 = new int[4]; 
	    int[] rec2 = new int[4]; 
	    for(int i=0; i<4; i++) {
	    	rec1[i]=(int)(Math.random()*50); 
	    	rec2[i]=(int)(Math.random()*50); 
	    }
	    //int[] temp1 = {0,0,20,30};
	    //int[] temp2 = {10,10,20,30};
		System.out.println("사각형이 겹치는 넓이는 "+Cal(rec1, rec2)+" 입니다.");
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
