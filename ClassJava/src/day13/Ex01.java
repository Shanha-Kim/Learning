package day13;

import java.util.Vector;

public class Ex01 {
/*
	�л���
		�̸�, ����, �ڵ�, ����, ���
	�� ������ Vector�� �����
	5���� �����͸� �Է��ؼ� 
	����ϼ���
	������������ ���ĵ� �ϼ���.
 */
	public Ex01() {
		Vector stu = new Vector();
		Vector s1 = new Vector();
		Vector s2 = new Vector();
		Vector s3 = new Vector();
		
		
		s1.add("��");s1.add(55);s1.add(85);
		s1.add((int)s1.get(1)+(int)s1.get(2));s1.add((int)(s1.get(3))/2.0);
		s2.add("��");s2.add(75);s2.add(95);
		s2.add((int)s2.get(1)+(int)s2.get(2));s2.add((int)(s2.get(3))/2.0);
		s3.add("��");s3.add(65);s3.add(35);
		s3.add((int)s3.get(1)+(int)s3.get(2));s3.add((int)(s3.get(3))/2.0);
		stu.add(s1); stu.add(s2); stu.add(s3);
		for (int i=0; i<2;i++) {
			for(int j=i+1; i<3; i++) {
				if ((int)(((Vector) stu.get(i)).get(3)) < (int)(((Vector) stu.get(j)).get(3))) {
					Object temp = stu.get(i);
					stu.set(i, stu.get(j));
					stu.set(j, temp);
				}
			}
		}
		for (Object o:stu) {
			System.out.println(o);
		}
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
