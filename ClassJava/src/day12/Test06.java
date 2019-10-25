package day12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test06 {
/*
	정규식 검사
		==> 주어진 문자열이 특정한 규칙에 맞도록 만들어져 있는지 확인하는 작업
	
	사용하는 클래스
		java.util.regex.Matcher
			==> 정규식 검사에 사용할 정규식 문법을 지정하는 크래스
				문자열의 구성 패턴을 정하는 클래스
		java.util.regex.Matcher
			==> 문자열 구성 패턴을 가지고 그 패턴에 맞는지를 검사하는 클래스
	
	참고]
		정규식 문법
			1. c[a-z]*
				==> 문자를 기록하면 반드시 그 위치에 해당 문자가 와야 한다.
					[]안에 기록하면 그 중 하나가 와야 한다.
					*는 바로 앞에 지정한 글자가 0개 이상 올 수 있다.
				==> 첫글자가 c로 시작하는 소문자 문자열
					"c"도 허용
					c 이후에 소문자가 갯수에 사관없이 몇개가 와도 된다.
			
 */
	public Test06() {
		String tel = "01-1234-5678";
		Pattern form = Pattern.compile("^0[0-9]{1,2}-\\d{3,4}-\\d{4}$");
		Matcher match = form.matcher(tel);
		String result = "형식에 맞지 않습니다.";
		if(match.matches()) {
			result = "올바른 전화번호입니다.";
		} 
		System.out.println(tel+" 은 " + result);
	}
 
	public static void main(String[] args) {
		new Test06();
	}

}
