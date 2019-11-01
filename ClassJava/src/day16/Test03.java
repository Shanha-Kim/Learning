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
		//list 함수 실행시 자동호출함수
		//file dir - 현재 파일의 정보를 알려줌
		//String name - 현재파일의 이름을 알려줌
		boolean bool =false;
		if (name.endsWith(".txt")) {
			bool = true;
		}
		return bool;
	}
}