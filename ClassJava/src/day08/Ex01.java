package day08;
/*
	�������Լ�, �������Լ�(main), static �Լ� 
	��ŷ�Լ� 
 */
import java.util.Scanner;

public class Ex01 {

	public Ex01() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���: ");
		int n = sc.nextInt(); // �Է¹��������� �ڵ� �б⸦ �����,
		double ans=1;
		for (int i=1;i<n+1;i++) {
			ans*=i;
		}
		System.out.println("�ݺ����� �̿��� n!�� : " + Math.round(ans) + " �Դϴ�.");
		System.out.println("����Լ��� �̿��� n!�� : "+Math.round(facto(n))+" �Դϴ�.");
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
