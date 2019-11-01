package day14;

import java.util.*;
/*
	��ü�� �����ϴ� ���
		1. Comparator�� �̿��ϴ� ���
			==> ���ı����� ���� ��ü�� �����Ҷ�
		2. Comparable�� �̿�
			==> ��ü �ڽŰ� �ٸ� ��ü ��
 */
public class Test07 {
	ArrayList list;
	public Test07() {
		setList();
		Collections.sort(list);
		System.out.println(list);
	}
	public void setList() {
		list = new ArrayList();
		ArrayList name = new ArrayList();
		name.add("ȫ�浿");
		name.add("�Ѹ�");
		name.add("�����");
		name.add("��ġ");
		name.add("����");
		
		for(int i = 0 ; i < name.size(); i++ ) {
			// �л� �����͸� �����
			Stud02 stud = new Stud02(
					(String)name.get(i),
					(int)(Math.random()* 51 + 50),
					(int)(Math.random()* 51 + 50),
					(int)(Math.random()* 51 + 50)
					);
			// �л������͸� list�� �ְ�
			list.add(stud);
		}
		
	}
	public static void main(String[] args) {
		new Test07();
	}
}
class Stud02 implements Comparable{
	String name;
	int kor;
	int eng;
	int math;
	int total;
	public Stud02() {}
	public Stud02(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+math+eng;
	}
	public String toString() {
		return name + " : " + kor + " | " + eng + " | " + math + " | " + total + " | \n";
	}
	@Override
	public int compareTo(Object o) {
		Stud02 stud = (Stud02) o;
		if(this.total < stud.total) {
			return 1;
		}else {
			return -1;
		}
	}
}
