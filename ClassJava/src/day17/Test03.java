package day17;
import java.io.*;
/*
	문자단위스트림을 사용해서
	Ex01.txt 파일을 Test03.txt 로 복사해보자 
 */
public class Test03 {

	public Test03() {
		//스트림준비
		FileReader fr = null;
		FileWriter fw = null;
		StringBuffer str = new StringBuffer();
		try {
			fr = new FileReader("src/day17/Ex01.txt");
			fw = new FileWriter("src/day17/Test03.txt");
			char[] buff;
			for(;;) {
				buff = new char[32];
				int len = fr.read(buff);
				if(len==-1) break;
				str.append(new String(buff));
			}
			fw.write(str.toString());
			System.out.println("저장완료");
			System.out.println("------내용------");
			System.out.println(str.toString());
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
				fw.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new Test03();
	}

}
