package day11;
import java.util.*;
public class Test07 {
/*
	����1]
		���ڿ� �迭�� "123","456"
 */
	public Test07() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� ������ �Է��ϼ���: ");
		int n=0;
		try {
			n = sc.nextInt();
			if (n>=10 || n<1) {
				throw new Exception();
			}
			System.out.println(n+" �� �Է��ϼ̽��ϴ�.");
		}catch(Exception e) {
			System.out.println("���ڸ� ������ �Է��ϼ���!");
		}
	}

	public static void main(String[] args) {
		new Test07();
	}

}
