package day15;

import java.io.FileOutputStream;
import java.util.Properties;

/*
	Test10�� �ý��� ������ ���Ϸ� �����غ�����.
 */
public class Ex01 {

	public Ex01() {
		Properties prop = System.getProperties();
		
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("src/day15/programInfo.txt");
			prop.store(fout, "����� �ּ� ���� �κ�");
			System.out.println("���� ���� �Ϸ�");
		}catch(Exception e) {
			System.out.println("Error : "+e);
		}
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
