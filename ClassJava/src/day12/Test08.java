package day12;
import java.util.Date;
public class Test08 {
/*
	Date Ŭ����
		==> ��¥�� �ð��� �����ϴ� Ŭ����
			������ �Լ�
				Date()
					==> �ý����� ����ð��� ��ü�� ������ش�.
				Date(int year, int month, int date)
					==> �Ű������� �Էµ� ���� ��ü�� ����� ���
				Date(String s)
					==> ���ڿ��� �Էµ� ���� ��ü�� ����� ���...
	����]
		Deprecated
			==> �� �ܾ ���� ����� 
				�ڹٿ��� ���� �������� �𸣴� ����̹Ƿ� �������
		�ڹٿ����� Calender Ŭ������ ������ �����̴�.
		�ڹ��ʿ����� Calender Ŭ������ ����� �����Ѵ�.
 */
	public Test08() {
		Date date = new Date();
		System.out.println(date.getYear()+"�� "+(date.getMonth()+1)+"�� "+date.getDate()+"�� ");
		//getmonth�� 0������ ����
	}

	public static void main(String[] args) {
		new Test08();
	}

}
