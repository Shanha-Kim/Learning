package day06;

import java.util.Scanner;

public class Test03 {

	public Test03() {
		Scanner sc = new Scanner(System.in);
		System.out.println("계산식을 입력하세요");
		String str = sc.next();
		while (!str.equals("q")) {
			cal(str);
			System.out.println("계산식을 입력하세요");
			System.out.println("(계산기를 중지하고 싶으면 \"q\"를 입력하세요)");
			str = sc.next();
		}
	}
	public static void main(String[] args) {
		new Test03();
	}
	public void cal(String str) {

		int idx=0;
		String[] sign = {"+","-","*","/"};
		for (int i=0;i<4;i++) {
			if(str.indexOf(sign[i])!=-1) {
				idx=str.indexOf(sign[i]);
				break;
			}
		}
		
		int n1 = Integer.parseInt(str.substring(0,idx));
		int n2 = Integer.parseInt(str.substring(idx+1));
		double ans=0;
		if (str.charAt(idx)=='-') {
			ans=n1-n2;
		}
		if (str.charAt(idx)=='/') {
			ans=n1/n2;
		}
		if (str.charAt(idx)=='+') {
			ans=n1+n2;
		}
		if (str.charAt(idx)=='*') {
			ans=n1*n2;
		}
		System.out.println(ans);
	}
}
