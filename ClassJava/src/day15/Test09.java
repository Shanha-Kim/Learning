package day15;
import java.io.*;
import java.util.*;
/*
	Properties�� Map�����͸� ���� �����ϰ�
	������ ���Ͽ������غ���/
 */
public class Test09 {

	public Test09() {
		Properties prop = new Properties();
		prop.put("����", "iphone11");
		prop.put("����", "����");
		prop.put("����", "V70");
		prop.put("�Ｚ", "������11");
		
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("src/day15/phone.txt");
			prop.store(fout, "����� �ּ� ���� �κ�");
			System.out.println("���� ���� �Ϸ�");
		}catch(Exception e) {
			System.out.println("Error : "+e);
		}
		System.out.println(prop.keySet());
		String corp = (String)prop.get("����");
		String model = (String)prop.get("����");
		System.out.println(corp+" - "+model);
	}
	public static void main(String[] args) {
		new Test09();
	}
}
