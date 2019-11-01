package day17;

import java.io.*;
/*
	 ����1]
	 	���� ���α׷����� ������ poem.txt������ ����Ʈ��� ��Ʈ������ �о
	 	���ڱ�� ��Ʈ������ �����غ���
 */
public class Ex01 {

	public Ex01() {
		//Ÿ�ٽ�Ʈ���� �غ�
		FileInputStream fin = null;
		FileWriter fw =null;
		
		try {
			fin = new FileInputStream("src/day17/Ex01.txt");
			fw = new FileWriter("src/day17/test.txt");
			
			String str = "";
			while(true) {
				// ���� ������ ������ �迭 �غ�
				byte[] buff = new byte[64];
				int len = fin.read(buff);
				if(len == -1) {
					// �� ���� ���� �����Ͱ� ���� ����̹Ƿ� �ݺ����� �������ش�.
					break;
				}
				// �迭�� ��� ������ �ƿ�ǲ��Ʈ���� ������ �����Ѵ�.
				str += new String(buff, 0, len);
			}
			fw.write(str);
			System.out.println("����Ϸ�");
			
		} catch (Exception e1) {
			e1.printStackTrace();
		}finally {
			try {
				fin.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
