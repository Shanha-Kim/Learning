package day16;

import java.io.File;
import java.io.FilenameFilter;

public class Test03 {

	public Test03() {
		File file = new File("src/day15");
		
//		String[] arr =file.list();
//		for(String fname : arr) {
//			System.out.println(fname);
//		}		
		String[] arr = file.list(new MyFilter());
		for(String fname : arr) {
			System.out.println(fname);
		}	
	}

	public static void main(String[] args) {
		new Test03();
	}

}
class MyFilter implements FilenameFilter {
	@Override
	public boolean accept(File dir, String name) {
		//list �Լ� ����� �ڵ�ȣ���Լ�
		//file dir - ���� ������ ������ �˷���
		//String name - ���������� �̸��� �˷���
		boolean bool =false;
		if (name.endsWith(".txt")) {
			bool = true;
		}
		return bool;
	}
}