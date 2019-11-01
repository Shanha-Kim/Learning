package day17;
import java.io.*;
/*
	Test01에서 저장한 파일을 문자단위 스트림으로 읽어보자
	
 */
public class Test02 {

	public Test02() {
		//스트림 준비하고
		FileReader fr = null;
		//문자열 저장변수
		StringBuffer str =  new StringBuffer();
		
		try {
			fr = new FileReader("src/day17/Ex01.txt");
			
//			//한글자만 읽어보기
//			int ch = fr.read();
			
			
			char[] buff;
			while(true) {
				buff = new char[32];
				int len = fr.read(buff);
				if(len==-1) {
					break;
				}
				str.append(new String(buff));
			}
			System.out.println(str.toString());
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
			}catch(Exception e) {
				
			}
		}
	}
	
	public static void main(String[] args) {
		new Test02();
	}
}
