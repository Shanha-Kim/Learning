package day16;

import java.io.*;

/*
	Test04.java ������ �а� ����� ����. 
 */

public class Test05 {

	public Test05() {
		// ���Ͽ� ������ ��Ʈ���� �غ��Ѵ�.
		FileInputStream fin = null;
		
		try {
			fin = new FileInputStream("src/day16/Test04.java");
			/*
			// 1. �ѱ��ڸ� �о��.
			int ch = fin.read();
			System.out.println((char) ch);
			*/
			
			/*
			// 2. ���� ���ڸ� ����
			// ���� �����͸� ������ �迭�� �����
			byte[] buff = new byte[1024];
			// ��Ʈ���� ����� �����͸� ������ �迭�� ���
			int len = fin.read(buff);
			
			// byte[] �� ���ڿ��� ��ȯ�ϰ�
			String str = new String(buff);
			System.out.println(str);
			*/
			
			// ���� ��ü�� ������ �д´�.
			// ����ڸ� �о ������ �𸣱� ������...
			String str = "";
			while(true) {
				// ���� ���� �����͸� ������ �迭�� �����
				byte[] buff = new byte[1024];
				
				// �迭�� �о ä���.
				int len = fin.read(buff);
				System.out.println("�о�� ������ �� : " + len);
				if(len == -1) {
					// ���̻� �о�� �����Ͱ� �����Ƿ� �����Ų��.
					break;
				}
				str += new String(buff, 0, len);
			}
			
			System.out.println(str);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Test05();
	}

}
