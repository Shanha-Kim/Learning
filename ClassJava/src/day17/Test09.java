package day17;
import java.io.*;
/*
	printWriter �� �����͸� ���Ͽ� �����غ���
 */
public class Test09 {
/*
	�������غ�
	��Ʈ���غ�
	��Ʈ������
	
	
 */
	public Test09() {
		String str = "�Ѹ�, �����, ��浿, ��ġ, ����";
		PrintWriter pw = null;
		try {
			pw = new PrintWriter("src/day17/test09.txt"); //��ġ �Է�
			pw.print(str);
			System.out.println("����Ϸ�");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				pw.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new Test09();
	}

}
