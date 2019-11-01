package day17;
import java.io.*;
import extra.*;
/*
	 src/extra/Day17_07.java에서 만든 파일을 읽어보자
 */
public class Test07 {

	public Test07() {
		FileInputStream fi = null;
		ObjectInputStream oi = null;
		try {
			fi = new FileInputStream("src/day17/score.txt");
			oi = new ObjectInputStream(fi);
			Exam exam = (Exam) oi.readObject();
			System.out.println(exam.getTotal());
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fi.close();
				oi.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new Test07();
	}

}
