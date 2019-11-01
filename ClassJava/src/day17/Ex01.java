package day17;

import java.io.*;
/*
	 문제1]
	 	어제 프로그램으로 저장한 poem.txt파일을 바이트기반 스트림으로 읽어서
	 	문자기반 스트림으로 저장해보자
 */
public class Ex01 {

	public Ex01() {
		//타겟스트림을 준비
		FileInputStream fin = null;
		FileWriter fw =null;
		
		try {
			fin = new FileInputStream("src/day17/Ex01.txt");
			fw = new FileWriter("src/day17/test.txt");
			
			String str = "";
			while(true) {
				// 읽은 데이터 저장할 배열 준비
				byte[] buff = new byte[64];
				int len = fin.read(buff);
				if(len == -1) {
					// 이 경우는 읽은 데이터가 없는 경우이므로 반복문을 종료해준다.
					break;
				}
				// 배열에 담긴 내용을 아웃풋스트림에 보내서 저장한다.
				str += new String(buff, 0, len);
			}
			fw.write(str);
			System.out.println("저장완료");
			
		} catch (Exception e1) {
			e1.printStackTrace();
		}finally {
			try {
				fin.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
