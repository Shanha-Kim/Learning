package day17;
import java.io.*;

/*
	���ڱ�� ������Ʈ���� ����ؼ�
	Test03.txt ������ �а�, �����غ���
	Test04.txt
	
 */
public class Test04 {
/*
	1. ��Ʈ���غ�
	2. ��Ƽ�������
	3. ���� �б�
	4. �������� �����ϰ�
	
 */
	public Test04() {
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		StringBuffer buff = new StringBuffer();
		/*
			ó������
			Test03.txt --> FileReader --> BufferedReader --> char[]
			char[] --> bufferedWriter --> FileWriter
			 
		 */
		try {
			fr = new FileReader("src/day17/Test03.txt");
			br = new BufferedReader(fr);
			
			fw = new FileWriter("src/day17/Text04.txt");
			bw = new BufferedWriter(fw);
			
			for(;;) {
				String str = br.readLine();
				if(str == null) break;
				buff.append(str);
				buff.append("\r\n");
			}
			bw.write(buff.toString());
			System.out.println("����Ϸ�");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				//���� ���� ����
				fr.close();
				br.close();
				bw.close();
				fw.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new Test04();
	}

}
