package day03;
import java.util.*;
/*
 * ����2]
 * 	���������� 7���� ���� ������ �� �ִ� �Խ����� �ִ�. ��ĳ�ʷ� ������ ���ڸ� �Է¹޾Ƽ�
 * 	�� �Խ��ǿ� ��� �������� �ʿ����� ����ؼ� ��µǰ� �ϼ���
 */
public class Ex02 {

	public Ex02() {
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�Խ����� �� ������ �Է��ϼ���: ");
		int num = sc.nextInt();
		int ans=0;
		ans+=num/7;
		if (num%7>0) {
			ans+=1;
		}
		System.out.println("�ʿ��� �Խ��� ������ ���� "+ans+"�� �Դϴ�." );
	}

}
