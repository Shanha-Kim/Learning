package day12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test06 {
/*
	���Խ� �˻�
		==> �־��� ���ڿ��� Ư���� ��Ģ�� �µ��� ������� �ִ��� Ȯ���ϴ� �۾�
	
	����ϴ� Ŭ����
		java.util.regex.Matcher
			==> ���Խ� �˻翡 ����� ���Խ� ������ �����ϴ� ũ����
				���ڿ��� ���� ������ ���ϴ� Ŭ����
		java.util.regex.Matcher
			==> ���ڿ� ���� ������ ������ �� ���Ͽ� �´����� �˻��ϴ� Ŭ����
	
	����]
		���Խ� ����
			1. c[a-z]*
				==> ���ڸ� ����ϸ� �ݵ�� �� ��ġ�� �ش� ���ڰ� �;� �Ѵ�.
					[]�ȿ� ����ϸ� �� �� �ϳ��� �;� �Ѵ�.
					*�� �ٷ� �տ� ������ ���ڰ� 0�� �̻� �� �� �ִ�.
				==> ù���ڰ� c�� �����ϴ� �ҹ��� ���ڿ�
					"c"�� ���
					c ���Ŀ� �ҹ��ڰ� ������ ������� ��� �͵� �ȴ�.
			
 */
	public Test06() {
		String tel = "01-1234-5678";
		Pattern form = Pattern.compile("^0[0-9]{1,2}-\\d{3,4}-\\d{4}$");
		Matcher match = form.matcher(tel);
		String result = "���Ŀ� ���� �ʽ��ϴ�.";
		if(match.matches()) {
			result = "�ùٸ� ��ȭ��ȣ�Դϴ�.";
		} 
		System.out.println(tel+" �� " + result);
	}
 
	public static void main(String[] args) {
		new Test06();
	}

}
