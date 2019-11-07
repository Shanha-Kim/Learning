package day16;

import java.io.*;

/*
	1. ���� ��Ű���� Test.txt��� ������ �ϳ� 
		������ �Է��ؼ� �����ϴ� ���α׷��� ����� ����.
 */

public class Test06 {

	public Test06() {
		// ���� ������ ��Ʈ���� �غ��Ѵ�.
		FileOutputStream fout = null;
		
		try {
			// ��Ʈ�� �����
			fout = new FileOutputStream("src/day16/Test.txt");
			// ������ �������� �ʾƵ� �ڵ����� ����� ����.
			
			/*
			// 1. �ѱ��ڸ� ������ ����.
			fout.write('A');
			*/
			
			// ���� ���ڸ� �Է��� ����.
			
			String str = "Bootstrap 4 is the newest version of Bootstrap, "+
						"which is the most popular HTML, CSS, " + 
						"and JavaScript framework for developing responsive, mobile-first websites.\n" + 
						"\nBootstrap 4 is completely free to download and use!";
			
			int idx = str.indexOf("which");
			int idx2 = str.indexOf("\n");
			
			str = str.substring(idx, idx2);
			// �迭�� �غ��ϰ�
			byte[] buff = str.getBytes();
			
			
			// �迭�� ��Ʈ���� ������ �����Ѵ�.
			fout.write(buff);
			
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			// �ܺ���ġ�� ����� ���� �ش� �ܺ���ġ�� ����� ������
			// �ݵ�� �ݾ��ִ� ���� ��Ģ�̴�.
			try {
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new Test06();
	}

}