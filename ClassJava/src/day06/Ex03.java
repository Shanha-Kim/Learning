package day06;
import java.util.Arrays;
import java.util.Scanner;
/*
	피보나치수열
 */
public class Ex03 {

	public Ex03() {
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 피보나치 수열의 번호를 입력하세요 : ");
		int n = sc.nextInt();
		System.out.println(Arrays.toString(fivo(n)));
		
	}
	public static void main(String[] args) {
		new Ex03();
	}
	public int[] fivo(int n) {
		int[] arr = new int[n];
		int idx = 0;
		int a = 0;
		int b = 1;
		while (n!=0) {
			arr[idx]=a;
			idx+=1;
			int c=a+b;
			a=b;
			b=c;
			n-=1;
		}
		return arr;
	}
}
