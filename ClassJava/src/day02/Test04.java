package day02;

import java.util.Scanner;

public class Test04 {
	/*
	 * ����]
	 * 	���� 3���� �Է¹޾Ƽ� ������ �ϰ� �� �� ���� ū ���� ����ϼ���.
	 * 	3�� ���� �����ڸ� Ȱ���ϼ���.
	 */
	public static void main(String[] args) {
		System.out.println("���δٸ� �� ���ڸ� �Է��ϼ���: ");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int ans = (n1<n2) ? n2 : n1 ;
		ans = (ans<n3)?n3:ans;
		System.out.println(ans);
		//if�� ���
		int ans2=n1;
		if (ans2<n2) {
			ans2=n2;
		}
		if (ans2<n3) {
			ans2=n3;
		}
		System.out.println(ans2);
		//if else if ��� 
		int ans3=n1;
		if (ans3<n2) {
			ans3=n2;
		}else if(ans3<n3){
			ans3=n3;
		}
		System.out.println(ans3);
	}
}
