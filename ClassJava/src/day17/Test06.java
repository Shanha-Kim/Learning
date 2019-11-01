package day17;
import java.io.*;
import java.util.*;
/*
	Test05.txt 파일을 읽어보자
 */
public class Test06 {

	public Test06() {
		//스트림준비하고
		FileInputStream fin = null;
		ObjectInputStream oin = null;
		ArrayList<String> lst;
		//스트림 만들고
		try {
			fin = new FileInputStream("src/day17/Test05.txt");
			oin = new ObjectInputStream(fin);
			//데이터를 읽고
			lst = (ArrayList<String>)oin.readObject();
			
			System.out.println(lst);
			
		}catch(Exception e) {
			
		}finally {
			try {
				fin.close();
				oin.close();
			}catch(Exception e) {
				
			}
		}
	}

	public static void main(String[] args) {
		new Test06();
	}

}
