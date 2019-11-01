package day15;

import java.io.FileInputStream;
import java.util.Properties;

public class Test08 {
/*
	
 */
	public Test08() {
		Properties prop = new Properties();
		
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("src/day15/sample1.txt");
			//경로는 절대경로도 가능하다
			prop.load(fin);
		} catch(Exception e) {
			System.out.println("Error : "+e);
		}
		String name = (String)prop.get("name");
		String addr = (String)prop.get("addr");
		System.out.println(name+" - "+addr);
	}
	public static void main(String[] args) {
		new Test08();
	}
}
