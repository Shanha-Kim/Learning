package day03;
import java.util.*;
/*
 	예제]
 		한 게임의 로또를 기억할 배열을 만들어서 기억하고 출력하세요
 		출력은 배열의 내용을 확인하는 함수를 사용해서 처리하세요
 */
public class CreateLotto {
	int[] myLotto = new int[6];
	public CreateLotto() {
		for(int i=0; i<6; i++) {
			int n=(int)(Math.random()*45)+1;
			if (Arrays.asList(myLotto).contains(n)) {}
			else {
				myLotto[i]=n;
			}
		}
		System.out.println(Arrays.toString(myLotto));
		
	}
	public static void main(String[] args) {
		new CreateLotto();
	}
}
