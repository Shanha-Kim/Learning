package day13;

import java.text.MessageFormat;

public class Test06 {
/*
	MessageFormat
		==> Ư�� ���ڿ��� Ư�� ��ġ�� ���븸 ����Ǵ� ���
			���ڿ� ��ü�� ������ �ʰ� 
			����Ǵ� ���븸 �������Ѽ� �ϳ��� ���ڿ��� ������ Ŭ����
			
			������� 
			StringBuffer�� �̿��ϴ� ����Ŭ ���Ǹ�ɰ��� ���
			 
 */
	public Test06() {
		MessageFormat form = new MessageFormat("Name : {0}, Tel : {1}, Age : {2}");
		/*
			������ ������ �״�� �ۼ��ϰ� ����Ǵ� �κи� �ε����� �ٿ��� �߰�ȣ �ȿ� �ִ´�.
			�ε������� �ԷµǴ� ������� �����Ͱ� ä������
		 */
		String result;
		String[] ans = new String[2];
		Object[][] obj = {{"ȫ�浿", "010-7777-7777", 24}, {"��û��", "010-9999-9999", 20}};
		for(Object[] o : obj) {
			result = form.format(o);
			System.out.println(result);
		}
		System.out.println("");
		System.out.println();
	}

	public static void main(String[] args) {
		new Test06();
	}

}
