package day17;
import java.io.*;
import java.util.*;
/*
	Test05.txt ������ �о��
 */
public class Test06 {

	public Test06() {
		//��Ʈ���غ��ϰ�
		FileInputStream fin = null;
		ObjectInputStream oin = null;
		ArrayList<String> lst;
		//��Ʈ�� �����
		try {
			fin = new FileInputStream("src/day17/Test05.txt");
			oin = new ObjectInputStream(fin);
			//�����͸� �а�
			lst = (ArrayList<String>)oin.readObject();
			
			System.out.println(lst);
			
		}catch(Exception e) {
			
		}finally {
			try {
				fin.close();
				oin.close();
			}catch(Exception e) {
				
			}
		}
	}

	public static void main(String[] args) {
		new Test06();
	}

}
