package day12;
import java.util.regex.*;
/*
	����1]
		ȸ�� ���̵��� ������ �˻��Ϸ��� �մϴ�.
		���̵�� ����ҹ���, ���ڰ� ��� ���ԵǾ�� �ϰ�
		���̴� 8���� �̻��̾���Ѵ�.
		
		���Խ� ������ ����� �˻��ؼ� ����� ����ϼ���.
 */
public class Ex01 {

	public Ex01() {
		String id = "aaD2ef123";
		Pattern form = Pattern.compile("(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[\\w\\d]{5,15}");
		Matcher match = form.matcher(id);
		String result = "���Ŀ� ���� �ʽ��ϴ�.";
		if(match.matches()) {
			result = "�ùٸ� id�Դϴ�.";
		}
		System.out.println("["+id+"] �� " + result);
	}
 
	public static void main(String[] args) {
		new Ex01();
	}

}
