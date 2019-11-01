package day17;
import java.io.*;
/*
	printWriter 로 데이터를 파일에 저장해보자
 */
public class Test09 {
/*
	데이터준비
	스트림준비
	스트림만듦
	
	
 */
	public Test09() {
		String str = "둘리, 도우너, 고길동, 또치, 희동이";
		PrintWriter pw = null;
		try {
			pw = new PrintWriter("src/day17/test09.txt"); //장치 입력
			pw.print(str);
			System.out.println("저장완료");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				pw.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new Test09();
	}

}
