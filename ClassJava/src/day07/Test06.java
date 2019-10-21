package day07;
import java.util.*;
public class Test06 {
/*
	String Ŭ����
		:�⺻ ������ Ÿ���� �ƴ����� ���󵵰� ���� Ŭ���� Ÿ���̴�. ������ Ÿ��
		
		���ڿ��� ����� ���]
			1. String str1 = "abcd";
			2. String str2 = new String("abcd");
			( �̋� str1�� str2�� �����ʴ�(��� �ִ� �ּҰ�))
	���� ����ϴ� �Լ�
		1. length()
		2. charAt(�ε���) : ���ڿ��� �ش���ġ�� ���ڸ� ��ȯ���ִ� �Լ�
		3. equals(���ڿ� || ���ڿ�����) : ���ڿ��� �����͸� �����ִ� �Լ� 
		4. 
			4.1 indexOf(���� || ���ڿ�)
				- �Է����ִ� ���ڿ� �Ǵ� ���ڰ� ó�� ��Ÿ���� ��ġ�� ��ȯ���ش�.
			4.2 indexOf(���� || ���ڿ�, ������ġ)
			4.3 lastIndexOf(���� �Ǵ� ���ڿ�)
				- ���ڿ� �� �ں��� ���� �Ǵ� ���ڿ��� ��Ÿ�� ��ġ�� ��ȯ
				
		5. ���ڿ��� �Ϻθ� �����ؼ� ��ȯ���ִ� �Լ�
			5.1 substring(������ġ) 
				- ������ġ�������� ������ �������ִ� �Լ�
			5.2 substring(������ġ, ������ġ)
				-������ġ�������� ������ġ ������ ���ڿ� ����, ��ȯ
		
 */
	public Test06() {
		String str1 = "asd";
		String str2 = new String("asd");
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals("asd"));
		System.out.println(str1.contentEquals(str2));
		System.out.println(str1.contentEquals("asd"));
		
		String str3 = "abcd bcd ebeb";
		System.out.println("                            "+str3);
		System.out.printf("%25s - %c\n", "str3.charAt(3)",str3.charAt(3));
		System.out.printf("%25s - %d\n", "str3.indexOf('b')",str3.indexOf('b'));
		System.out.printf("%25s - %d\n", "str3.indexOf('b',3)",str3.indexOf('b',3));
		System.out.printf("%25s - %d\n", "str3.indexOf(\"beb\")",str3.indexOf("beb"));
		System.out.printf("%25s - %d\n", "str3.lastIndexOf(\"bcd\")",str3.lastIndexOf("bcd"));
		System.out.printf("%25s - %s\n", "str3.substring(2)",str3.substring(2));
		System.out.printf("%25s - %s\n", "str3.substring(2,6)",str3.substring(2,6));
		
	}

	public static void main(String[] args) {
		new Test06();
	}

}
