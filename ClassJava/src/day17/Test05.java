package day17;
import java.io.*;
import java.util.*;
/*
	ArrayList�� �����͸� �����ؼ�
	�뤊�� ���Ϸ� �����غ���.
	
 */
public class Test05 {
/*
	1. ��Ʈ���غ�
	2. 
 */
	public Test05() {
		FileOutputStream f_out = null;
		ObjectOutputStream o_out = null;
		ArrayList<String> lst = new ArrayList<String>();
		lst.add("�Ѹ�");
		lst.add("��ġ");
		lst.add("�����");
		lst.add("������");
		lst.add("��浿");
		lst.add("����");
		
		try {
			f_out = new FileOutputStream("src/day17/Test05.txt");
			o_out = new ObjectOutputStream(f_out);
			System.out.println("���� ���� �Ϸ�");
			o_out.writeObject(lst);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				o_out.close();
				f_out.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args) {
		new Test05();
	}

}
