package day12;
import java.util.*;
public class Test09 {
/*
	get(int field)
		==> �ʿ��� ������ �˷��ִ� �Լ�
			�� �Լ��� int field�� �˰��� �ϴ� ������ �˷��ָ�
			�� ���� ���ؼ� �˷��ִ� �Լ��̴�.
			����]
				field : Ŭ���Ѱ� ������ �ִ� ��������� field���� �Ѵ�.
			���� field ���� Calendar ��������� ������ �Ѵ�.
 */
	public Test09() {
		//Calender cal = new Calender(); �߻�Ŭ�������� new �Ұ���
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.DATE);
	}

	public static void main(String[] args) {
		new Test09();
	}

}
