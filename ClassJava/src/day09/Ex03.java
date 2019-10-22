package day09;

import java.util.Arrays;

/*
	문제3]
		학생의 국어, 영어, 수학, 과학, 코딩 과목
		그리고 총점, 평균의 점수를 관리할 클래스를 만들고
		10개의 학생배열의 점수를 랜덤하게 저장해서 출력하라
		
 */
public class Ex03 {

	public Ex03() {
		Student[] arr = new Student[10];
		for (int i=0; i<10; i++) {
			arr[i] = new Student();
			System.out.printf("%2d번 학생의 평균점수는 "+arr[i].avg+" 입니다.\n", i+1);
		}
	}

	public static void main(String[] args) {
		new Ex03();
	}

}
class Student{
	int han,eng,mat,sci,cod,total;
	double avg;
	public Student() {
		han = (int)(Math.random()*101);
		eng = (int)(Math.random()*101);
		mat = (int)(Math.random()*101);
		sci = (int)(Math.random()*101);
		cod = (int)(Math.random()*101);
		total=han+eng+mat+sci+cod;
		avg = total/5.0;
	}
}