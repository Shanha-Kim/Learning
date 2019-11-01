package day17;
import java.io.*;
import java.util.*;
/*
	ArrayList에 데이터를 저장해서
	통쨰로 파일로 저장해보자.
	
 */
public class Test05 {
/*
	1. 스트림준비
	2. 
 */
	public Test05() {
		FileOutputStream f_out = null;
		ObjectOutputStream o_out = null;
		ArrayList<String> lst = new ArrayList<String>();
		lst.add("둘리");
		lst.add("또치");
		lst.add("도우너");
		lst.add("마이콜");
		lst.add("고길동");
		lst.add("희동이");
		
		try {
			f_out = new FileOutputStream("src/day17/Test05.txt");
			o_out = new ObjectOutputStream(f_out);
			System.out.println("파일 생성 완료");
			o_out.writeObject(lst);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				o_out.close();
				f_out.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args) {
		new Test05();
	}

}
