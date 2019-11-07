package day16;
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
public class StreamTest {

	public StreamTest() {
		Fin_Ir_Br();
	}

	public static void main(String[] args) {
		new StreamTest();
	}
	//
	public void Fout() {
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("src/day16/fout1.txt");
			String str = "Bootstrap 4 is the newest version of Bootstrap";
			byte[] buff = str.getBytes();
			fout.write(buff);
			System.out.println("--����Ϸ�--");
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fout.close();				
			}catch (Exception e) {
			}
		}
	}
	public void Fin() {
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("src/day16/fout1.txt");
			while(true) {
				// ���� ������ ������ �迭 �غ�
				byte[] buff = new byte[1024];
				int len = fin.read(buff);
				if(len == -1) {
					// �� ���� ���� �����Ͱ� ���� ����̹Ƿ� �ݺ����� �������ش�.
					break;
				}
				System.out.println(Arrays.toString(buff));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fin.close();
			}catch (Exception e) {
			}
		}
	}
	public void Fin_Ir_Br() {
		FileInputStream fin = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		try {
			fin = new FileInputStream("src/day16/poem.txt");
			ir = new InputStreamReader(fin);
			br = new BufferedReader(ir);
			
			while(true) {
				// ���� ������ ������ �迭 �غ�
				String str = br.readLine();
				if(str==null) break;
				System.out.println(str);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fin.close();
			}catch (Exception e) {
			}
		}
	}
	public void Fw() {
		FileWriter fw = null;
		FileWriter fw2 = null;
		try {
			fw = new FileWriter("src/day16/fw1.txt");
			fw2 = new FileWriter("src/day16/fw2.txt");
			char ch = '��';
			fw.write(ch);
			String str = "�ȳ��ϼ��� fw�Դϴ�.";
			fw2.write(str);
			System.out.println("--����Ϸ�--");
		}catch (Exception e) {
		}finally {
			try {
				fw.close();
				fw2.close();
			}catch (Exception e) {
			}
		}
	}
	public void Fr() {
		FileReader fr = null;
		StringBuffer str = null;
		char[] buff = null;
		try {
			fr = new FileReader("src/day16/poem.txt");
			str = new StringBuffer();
			while(true) {
				buff = new char[32];
				if(fr.read(buff) == -1) {
					break;
				}
				str.append(new String(buff));
			}
			System.out.println(str.toString());
			System.out.println("======���� char[] ����======");
			
		}catch (Exception e) {
		}finally {
			try {
				fr.close();
			}catch (Exception e) {
			}
		}
		
	}
	public void Fr_Br_Bw_Fw() {
		FileReader fr = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		FileWriter fw = null;
		StringBuffer buff = null;
		try {
			fr = new FileReader("src/day16/poem.txt");
			br = new BufferedReader(fr);
			fw = new FileWriter("src/day16/poem2.txt");
			bw = new BufferedWriter(fw);
			buff = new StringBuffer();
			//new ������ ������ ������ ���� ����
			while(true) {
				String str = br.readLine();
				if(str == null) break;
				buff.append(str);
				buff.append("\r\n");
			}
			
			bw.write(buff.toString());
			System.out.println("*****�ۼ��Ϸ�******");
			
		}catch (Exception e) {
		}finally {
			try {
				fr.close();
				br.close();
				bw.close();
				fw.close();
			} catch (Exception e2) {
			}
		}
		
	}
	public void Ps() {
		PrintStream ps = null;
		// ���� ���Ͽ� ����� ��Ʈ���� ����� ������Ʈ��...
		
		try {
			// ��Ʈ���� �����
			ps = new PrintStream("src/day16/poem.txt");
			
			ps.println("*** ���� ***");
			ps.println("\t\t\t������");
			ps.println();
			ps.println("�״� ������ �ϴ��� �츣��");
			ps.println("���� �β����� ���⸦,");
			ps.println("�ٻ��� �̴� �ٶ�����");
			ps.println("���� ���ο��ߴ�.");
			ps.println("���� �뷡�ϴ� ��������");
			ps.println("��� �׾�°��� ����ؾ���");
			ps.println("�׸��� ������ �־��� ����");
			ps.println("�ɾ�߰ڴ�.");
			ps.println();
			ps.println("���ù㿡�� ���� �ٶ��� ��ġ���.");
			
			ps.flush();
			// ���������� BufferStream�� ����� ������ �����Ƿ�
			// �ݵ�� �������Ⱑ ������ ���۸� ����� �Ѵ�.
			System.out.println("***** ���� �Ϸ� *****");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch(Exception e) {}
		}
	}
	
}
