package day15;

import java.io.FileOutputStream;
import java.util.Properties;

/*
	Test10의 시스템 정보를 파일로 저장해보세요.
 */
public class Ex01 {

	public Ex01() {
		Properties prop = System.getProperties();
		
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("src/day15/programInfo.txt");
			prop.store(fout, "여기는 주석 내용 부분");
			System.out.println("파일 저장 완료");
		}catch(Exception e) {
			System.out.println("Error : "+e);
		}
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
