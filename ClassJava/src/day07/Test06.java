package day07;
import java.util.*;
public class Test06 {
/*
	String 클래스
		:기본 데이터 타입은 아니지만 사용빈도가 높은 클래스 타입이다. 참조형 타입
		
		문자열을 만드는 방법]
			1. String str1 = "abcd";
			2. String str2 = new String("abcd");
			( 이떄 str1과 str2는 같지않다(담고 있는 주소가))
	자주 사용하는 함수
		1. length()
		2. charAt(인덱스) : 문자열중 해당위치의 문자르 반환해주는 함수
		3. equals(문자열 || 문자열변수) : 문자열의 데이터를 비교해주는 함수 
		4. 
			4.1 indexOf(문자 || 문자열)
				- 입력해주는 문자열 또는 문자가 처음 나타나는 위치를 반환해준다.
			4.2 indexOf(문자 || 문자열, 시작위치)
			4.3 lastIndexOf(문자 또는 문자열)
				- 문자열 맨 뒤부터 문자 또는 문자열이 나타난 위치를 반환
				
		5. 문자열의 일부만 추출해서 반환해주는 함수
			5.1 substring(시작위치) 
				- 시작위치에서부터 끝까지 추출해주는 함수
			5.2 substring(시작위치, 종료위치)
				-시작위치에서부터 종료위치 전까지 문자열 추출, 반환
		
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
