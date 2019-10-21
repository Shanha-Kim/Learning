package day05;

import java.util.Arrays;

public class PreEx01 {
//다차원배열을 한번에 볼때는 deeptoString
//배열을 만들게 되면 heap 영역에 만들게 되는데 이때 heap타입이 같은 것들만 배열안에 넣을 수 있다.
	
	public PreEx01() {
		int[][] arr = new int[2][10];
		for (int i=0; i<100; i++) {			
			arr[1][(int)(Math.random()*10)]+=1;
		}
		for (int i=0; i<10; i++) {
			System.out.println((char)(arr[0][i]+65+i)+"는 "+arr[1][i]+"번 나왔습니다.");			
		}
	}
	public static void main(String[] args) {
		new PreEx01();
	}
}
