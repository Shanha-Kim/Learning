package day12;
import java.util.regex.*;
/*
	����2]
		���Ƿ� �Է¹��� �̸����� ������ �˻��ϼ���.
 */
public class Ex02 {

	public Ex02() {
		String email = "shk8532@naver.co.m..m";
		Pattern form = Pattern.compile("^[\\d\\w]+@\\w+\\.\\w+\\.?\\w+$");
		Matcher match = form.matcher(email);
		String result = "���Ŀ� ���� �ʽ��ϴ�.";
		if(match.matches()) {
			result = "�ùٸ� email�Դϴ�.";
		}
		System.out.println("["+email+"] �� " + result);
	}
 
	public static void main(String[] args) {
		new Ex02();
	}

}
