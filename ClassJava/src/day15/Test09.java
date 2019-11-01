package day15;
import java.io.*;
import java.util.*;
/*
	Properties로 Map데이터를 만들어서 저장하고
	내용을 파일에저장해보자/
 */
public class Test09 {

	public Test09() {
		Properties prop = new Properties();
		prop.put("애플", "iphone11");
		prop.put("구글", "팬택");
		prop.put("엘지", "V70");
		prop.put("삼성", "갤럭시11");
		
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("src/day15/phone.txt");
			prop.store(fout, "여기는 주석 내용 부분");
			System.out.println("파일 저장 완료");
		}catch(Exception e) {
			System.out.println("Error : "+e);
		}
		System.out.println(prop.keySet());
		String corp = (String)prop.get("엘지");
		String model = (String)prop.get("구글");
		System.out.println(corp+" - "+model);
	}
	public static void main(String[] args) {
		new Test09();
	}
}
