package day12;
import java.util.regex.*;
/*
	문제1]
		회원 아이디의 형식을 검사하려고 합니다.
		아이디는 영대소문자, 숫자가 모두 포함되어야 하고
		길이는 8글자 이상이어야한다.
		
		정규식 패턴을 만들고 검사해서 결과를 출력하세요.
 */
public class Ex01 {

	public Ex01() {
		String id = "aaD2ef123";
		Pattern form = Pattern.compile("(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[\\w\\d]{5,15}");
		Matcher match = form.matcher(id);
		String result = "형식에 맞지 않습니다.";
		if(match.matches()) {
			result = "올바른 id입니다.";
		}
		System.out.println("["+id+"] 는 " + result);
	}
 
	public static void main(String[] args) {
		new Ex01();
	}

}
