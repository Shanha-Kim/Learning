package day04;
import java.util.*;
/*
 * �������� ���� �Է¹޾Ƽ� ����� ����� ����ϴ� ���α׷�
 * ��]
 * 	"11+2" = 13
 * 	"2*5" = 10
 */
public class Ex01 {

	public Ex01() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� ��Ģ������ �Է��ϼ���");
		String str = sc.next();
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
	public static void main(String[] args) {
		new Ex01();
	}
}
