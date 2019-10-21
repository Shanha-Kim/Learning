package day08;
/*
	생성자함수, 진입점함수(main), static 함수 
	블러킹함수 
 */
import java.util.Scanner;

public class Ex01 {

	public Ex01() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요: ");
		int n = sc.nextInt(); // 입력받을때까지 코드 읽기를 멈춘다,
		double ans=1;
		for (int i=1;i<n+1;i++) {
			ans*=i;
		}
		System.out.println("반복문을 이용한 n!은 : " + Math.round(ans) + " 입니다.");
		System.out.println("재귀함수를 이용한 n!은 : "+Math.round(facto(n))+" 입니다.");
		System.out.println(facto(n));
	}
	public static void main(String[] args) {
		new Ex01();
	}
	double facto(double n) {
		if (n==1) {
			return 1;
		}
		return n*facto(n-1);
	}
}
