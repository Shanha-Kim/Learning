package day12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class rextest {

	public rextest() {
		String id = "asd1";
		Pattern form = Pattern.compile("^(?=.*1)\\w+");
		Matcher match = form.matcher(id);
		String result = "���Ŀ� ���� �ʽ��ϴ�.";
		if(match.matches()) {
			result = "�ùٸ� id�Դϴ�.";
		}
		System.out.println("["+id+"] �� " + result);	}

	public static void main(String[] args) {
		new rextest();
	}

}
