package day14;

import java.util.*;

public class Test06 {
/*
	�л��� �̸�, ����, ����, ����, ������ ������ Ŭ������ �����
	ArrayList �� 5���� �����͸� �Է��ؼ�
	������ ���� ������� �����ؼ� ����ϼ���.
 */
	
	// �л��� ������ ArrayList �����
	ArrayList list;
	public Test06() {
		setArrayList();
		System.out.println(list);
		
		// �������� �����ϱ�
		list.sort(new TotalSort());
		System.out.println("���� ������������ : " + list);
		
		for(int i = 0 ; i < list.size() ; i++ ) {
			System.out.println(((Stud01)list.get(i)).name + " - " + ((Stud01)list.get(i)).total);
		}
	}
	
	public static void main(String[] args) {
		new Test06();
	}
	
	// �л����� ������ ArrayList�� �ʱ�ȭ ���ִ� �Լ�
	public void setArrayList() {
		list = new ArrayList();
		ArrayList name = new ArrayList();
		name.add("ȫ�浿");
		name.add("�Ѹ�");
		name.add("�����");
		name.add("��ġ");
		name.add("����");
		
		for(int i = 0 ; i < name.size(); i++ ) {
			// �л� �����͸� �����
			Stud01 stud = new Stud01((String)name.get(i),
					(int)(Math.random()* 51 + 50),
					(int)(Math.random()* 51 + 50),
					(int)(Math.random()* 51 + 50)
					);
			// �л������͸� list�� �ְ�
			list.add(stud);
		}
	}
}

// ������ �������� �����ϴ� Ŭ������ ������
class TotalSort implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		int result = 0;
		
		// list���� Stud01 Ÿ���� �����Ͱ� 5�� �� �ְ�
		// ���� ������ �� �濡 �ִ� �������� ����� ������ �Ǿ� �����Ƿ�
		// ���� �ڽ��� Ÿ�Կ� �°� ���� ����ȯ�� ���ְ�
		Stud01 s1 = (Stud01) o1;
		Stud01 s2 = (Stud01) o2;
		
		// �� ��ü�� �����ؼ� ���(����)�� �̾Ƴ���
		int t1 = s1.total;
		int t2 = s2.total;
		
		// ���� ���� ���ؼ� ��ȯ���� �Ѱ��ָ� �ȴ�.
		
		if(t1 < t2) {
			result = 1;
		} else if(t1 > t2) {
			result = -1;
		}
		
		return result;
	}
}

class Stud01 {
	String name;
	int kor;
	int eng;
	int math;
	int total;
	
	public Stud01() {}
	public Stud01(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
	}
	
	public String toString() {
		return name + " : " + kor + " | " + eng + " | " + math + " | " + total + " |";
	}
}
