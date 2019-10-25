package day12;
import java.util.regex.*;
/*
	문제2]
		임의로 입력받은 이메일의 형식을 검사하세요.
 */
public class Ex02 {

	public Ex02() {
		String email = "shk8532@naver.co.m..m";
		Pattern form = Pattern.compile("^[\\d\\w]+@\\w+\\.\\w+\\.?\\w+$");
		Matcher match = form.matcher(email);
		String result = "형식에 맞지 않습니다.";
		if(match.matches()) {
			result = "올바른 email입니다.";
		}
		System.out.println("["+email+"] 는 " + result);
	}
 
	public static void main(String[] args) {
		new Ex02();
	}

}
