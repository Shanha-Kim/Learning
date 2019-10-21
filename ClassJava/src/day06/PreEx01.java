package day06;
import java.util.*;
/*
	랜덤하게 숫자를 0~100까지 10 발생시키고 
	그것을 배열에 담아서 각 숫자에 해당하는 아스키코드값의 문자가 
	알파벳인지 아닌지를 문자와 함께 출력하세요
 */
public class PreEx01 {

	public PreEx01() {
		int[] arr = new int[19];
		for (int i=0;i<19;i++) {
			if (i%2==0) {
				arr[i] = (int)(Math.random()*101);				
			}else {
				arr[i] = '#';
			}
			if(arr[i]>='A' && arr[i]<='Z') {
				System.out.println((char)arr[i]+" 은(는) 대문자 알파벳이 뽑혔습니다.");
			}else if(arr[i]>='a') {
				System.out.println((char)arr[i]+" 은(는) 소문자 알파벳이 뽑혔습니다.");
			}else {
				System.out.println((char)arr[i]+" 은(는) 알파벳이 아닙니다.");
			}
		}
	}
	public static void main(String[] args) {
		new PreEx01();
	}
}
