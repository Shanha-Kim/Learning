package day07;
import java.util.Scanner;
/*
	�ݺ��� Ȱ��
	����2]
		5�ڸ� ���ڸ� �Է¹޾Ƽ�
		�� ���ڰ� ȸ���� ���� �ƴ��� �Ǻ��Ͻÿ�
	����]
		ȸ������ ��Ī���� ���Ǿ�( 12321 )
 */
public class Ex02 {

	public Ex02() {
		Scanner sc = new Scanner(System.in);
		System.out.println("5�ڸ� ���ڸ� �Է��ϼ���");
		String str = sc.next();
		for (int i=0; i<3; i++) {
			if (str.charAt(i)==str.charAt(4-i)) {
				if (i==2) {
					System.out.println(str+"�� ȸ�����Դϴ�.");
				}
			}else {
				System.out.println(str+"�� ȸ������ �ƴմϴ�.");
				break;
			}
		}
	}

	public static void main(String[] args) {
		new Ex02();
	}

}
