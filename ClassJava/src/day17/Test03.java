package day17;
import java.io.*;
/*
	���ڴ�����Ʈ���� ����ؼ�
	Ex01.txt ������ Test03.txt �� �����غ��� 
 */
public class Test03 {

	public Test03() {
		//��Ʈ���غ�
		FileReader fr = null;
		FileWriter fw = null;
		StringBuffer str = new StringBuffer();
		try {
			fr = new FileReader("src/day17/Ex01.txt");
			fw = new FileWriter("src/day17/Test03.txt");
			char[] buff;
			for(;;) {
				buff = new char[32];
				int len = fr.read(buff);
				if(len==-1) break;
				str.append(new String(buff));
			}
			fw.write(str.toString());
			System.out.println("����Ϸ�");
			System.out.println("------����------");
			System.out.println(str.toString());
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
				fw.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new Test03();
	}

}
