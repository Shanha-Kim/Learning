package day17;
import java.io.*;
/*
	Test01���� ������ ������ ���ڴ��� ��Ʈ������ �о��
	
 */
public class Test02 {

	public Test02() {
		//��Ʈ�� �غ��ϰ�
		FileReader fr = null;
		//���ڿ� ���庯��
		StringBuffer str =  new StringBuffer();
		
		try {
			fr = new FileReader("src/day17/Ex01.txt");
			
//			//�ѱ��ڸ� �о��
//			int ch = fr.read();
			
			
			char[] buff;
			while(true) {
				buff = new char[32];
				int len = fr.read(buff);
				if(len==-1) {
					break;
				}
				str.append(new String(buff));
			}
			System.out.println(str.toString());
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
			}catch(Exception e) {
				
			}
		}
	}
	
	public static void main(String[] args) {
		new Test02();
	}
}
