package day06;
import java.util.Scanner;
/*
	문제1]
		최대공약수
		두 수를 랜덤하게 발생시켜서
		두 수의 최대 공약수를 구해서 출력하세요
		
 */
public class Ex01 {

	public Ex01() {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 숫자를 입력하세요 :");
		int m = sc.nextInt();
		int n = sc.nextInt();
		System.out.println(gcd(m,n));
	}

	public static void main(String[] args) {
		new Ex01();
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
