package day06;
import java.util.Arrays;
import java.util.Scanner;
/*
	�Ǻ���ġ����
 */
public class Ex03 {

	public Ex03() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ϴ� �Ǻ���ġ ������ ��ȣ�� �Է��ϼ��� : ");
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
