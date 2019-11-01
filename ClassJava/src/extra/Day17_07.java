package extra;

import java.io.*;

/*
	ObjectOutputStream ���� day17 ��Ű���� score.txt ������ ������.
	����� Ŭ������ �� ��Ű�� �ȿ� ���� ó���غ���.
*/
public class Day17_07 {

	public Day17_07() {
		Exam e1 = new Exam();
		e1.setName("�Ѹ�");
		e1.setKor(75);
		e1.setEng(55);
		e1.setMath(90);
		e1.setTotal();
		FileOutputStream fo = null;
		ObjectOutputStream oo = null;
		
		try {
			fo = new FileOutputStream("src/day17/score.txt");
			oo = new ObjectOutputStream(fo);
			//������ �����ϰ� 
			oo.writeObject(e1);
			System.out.println("���� ���� ����");
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
