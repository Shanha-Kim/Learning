package day16;
import java.io.*;
import java.util.*;
/*
	Ű���带 �̿��ؼ� ���ڸ� �Է¹޾ƺ���
 */
public class Test04 {
/*
	����]
		Ű���� ���� �ܺ� ��ġ�̴�.
		���� ����ϴ� �ܺ� ��ġ�̱� ������
		�̹� ��Ʈ���� �غ��� ������ �����Ѵ�.
		==>
			System.in
 */
	public Test04() {
//		System.out.println("�ѱ��ڸ� �Է��ϼ���.");
//		int ch = 0;
//		try {
//			/*
//			 	�Էµ� ���ڴ� �̹� System.in�� ������ �Ǿ��ְ�
//			 	Ÿ���� InputStream �̴�. ���� �о ���常 �ϸ� �ȴ�.
//			 */
//			ch = System.in.read();
//			//����Ѵ�.
//			System.out.println("����� �Է��� ���� : "+ (char)ch);
//			System.out.println("����� �Է��� �ڵ尪 : "+ ch);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
		byte[] buff = new byte[256];
		Arrays.fill(buff,(byte)'$');
		String str = new String(buff);
		str= str.replace("\n","$");
		System.out.println(str);
		System.out.println(str.length());
		System.out.println(Arrays.toString(buff));
		
	}

	public static void main(String[] args) {
		new Test04();
	}

}
