package day14;

import java.util.*;
/*
	객체를 정렬하는 방법
		1. Comparator를 이용하는 방법
			==> 정렬기준이 없는 객체를 정렬할때
		2. Comparable을 이용
			==> 객체 자신과 다른 객체 비교
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
		name.add("홍길동");
		name.add("둘리");
		name.add("도우너");
		name.add("또치");
		name.add("희동이");
		
		for(int i = 0 ; i < name.size(); i++ ) {
			// 학생 데이터를 만들고
			Stud02 stud = new Stud02(
					(String)name.get(i),
					(int)(Math.random()* 51 + 50),
					(int)(Math.random()* 51 + 50),
					(int)(Math.random()* 51 + 50)
					);
			// 학생데이터를 list에 넣고
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
