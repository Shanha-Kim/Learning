package day12;
import java.util.*;
public class Test03 {
/*
	StringTokenizer
		==> �ϳ��� ���ڿ��� ���ϴ� ���ڸ� �߽����� �������ִ� ����� ���� Ŭ�����̴�.
			
			��]
				"a,b,c,d,e,f"
				==> a b c d e f �� , �������� ������ �� �ִ�.
				
			�������]
				1. StringTokenizer(String str)
					==> ���ڿ��� ������ �������� �����ִ� ���
				2. StringTokenizer(String str, String delim) 
					==> delim : ������
						���ڿ��� �����ڸ� �������� �����ִ� ���
				3. StringTokenizer(String str, String delim, boolean returnDelims)
					==> returnDelims : �����ڵ��� ���Կ���
						�����ڵ� ������ ���Ѽ� �Ұ��� ������ ó���� ���ִ� ���
						
			�ֿ��Լ�]
				
				countTokens()
					==> ������ ��� ���� ��ȯ
				hasMoreElements() | hasMoreTokens()
					==> �ӽ� ���ۿ� ������ �����ִ��� ���θ� �˷��ִ� �Լ�
				nextElement()	| nextToken()
					==> �����͸� ������ �Լ�
						nextElement()	- Object�� ��ȯ
						nextToken()		- String���� ��ȯ
			
 */
	public Test03() {
		String str = "010-1111-2222";
		//StringTokenizer�� '-'�� �������� �ڸ���
		StringTokenizer token = new StringTokenizer(str, "-");
		//���ڿ��� ������ ������ŭ �迭�� �����.
		String[] arr = new String[token.countTokens()];
		int i =0;
		while(token.hasMoreTokens()) {
			arr[i++] = token.nextToken();
		}
		System.out.println(Arrays.toString(arr));
	}
 
	public static void main(String[] args) {
		new Test03();
	}

}
