package extra;

import java.io.*;

/*
	ObjectOutputStream 으로 day17 패키지에 score.txt 파일을 만들어보자.
	사용할 클래스는 이 패키지 안에 만들어서 처리해보자.
*/
public class Day17_07 {

	public Day17_07() {
		Exam e1 = new Exam();
		e1.setName("둘리");
		e1.setKor(75);
		e1.setEng(55);
		e1.setMath(90);
		e1.setTotal();
		FileOutputStream fo = null;
		ObjectOutputStream oo = null;
		
		try {
			fo = new FileOutputStream("src/day17/score.txt");
			oo = new ObjectOutputStream(fo);
			//데이터 저장하고 
			oo.writeObject(e1);
			System.out.println("파일 저장 성공");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				oo.close();
				fo.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new Day17_07();
	}

}
