package day02;

import java.util.Scanner;

public class Test04 {
	/*
	 * 문제]
	 * 	숫자 3개를 입력받아서 저장을 하고 그 중 가장 큰 수만 출력하세요.
	 * 	3항 조건 연산자를 활용하세요.
	 */
	public static void main(String[] args) {
		System.out.println("서로다른 세 숫자를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int ans = (n1<n2) ? n2 : n1 ;
		ans = (ans<n3)?n3:ans;
		System.out.println(ans);
		//if만 사용
		int ans2=n1;
		if (ans2<n2) {
			ans2=n2;
		}
		if (ans2<n3) {
			ans2=n3;
		}
		System.out.println(ans2);
		//if else if 사용 
		int ans3=n1;
		if (ans3<n2) {
			ans3=n2;
		}else if(ans3<n3){
			ans3=n3;
		}
		System.out.println(ans3);
	}
}
