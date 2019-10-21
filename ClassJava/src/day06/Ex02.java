package day06;

import java.util.Scanner;

public class Ex02{

	public Ex02() {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 숫자를 입력하세요 :");
		int m = sc.nextInt();
		int n = sc.nextInt();
		System.out.println(n*m/gcd(m,n));
	}
	public static void main(String[] args) {
		new Ex02();
	}
	public int gcd(int m, int n) {
		while(n!=0) {
			int t = m%n;
			m = n;
			n = t;
		}
		return m;
	}
}
