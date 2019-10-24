package day09;

import java.util.*;

/*
	����3]
		�л��� ����, ����, ����, ����, �ڵ� ����
		�׸��� ����, ����� ������ ������ Ŭ������ �����
		10���� �л��迭�� ������ �����ϰ� �����ؼ� ����϶�
		
 */
public class Ex03 {

	public Ex03() {
		Student[] arr = new Student[10];
		for (int i=0; i<10; i++) {
			arr[i] = new Student();
		}
		for (int i=0; i<9; i++) {
			int max_p = arr[i].total;
			int idx=i;
			for (int j=i+1; j<10; j++) {
				if (arr[j].total>max_p) {
					idx=j;
					max_p=arr[j].total;
				}
			}
			if (idx!=i) {
				Student tmp = arr[i];
				arr[i]=arr[idx];
				arr[idx]=tmp;
			}
		}
		for(int i=0; i<10; i++) {
			System.out.printf("%2d�� �л��� ��������� "+arr[i].avg+" �Դϴ�.\n", i+1);
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("ã�� �л��� ����� �����ּ��� : ");
		
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