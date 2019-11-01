package day13;

import java.text.MessageFormat;

public class Test06 {
/*
	MessageFormat
		==> 특정 문자열에 특정 위치에 내용만 변경되는 경우
			문자열 전체를 만들지 않고 
			변경되는 내용만 변형시켜서 하나의 문자열을 만들어내는 클래스
			
			예를들어 
			StringBuffer로 이용하는 오라클 질의명령같은 경우
			 
 */
	public Test06() {
		MessageFormat form = new MessageFormat("Name : {0}, Tel : {1}, Age : {2}");
		/*
			동일한 내용은 그대로 작성하고 변경되는 부분만 인덱스를 붙여서 중괄호 안에 넣는다.
			인덱스에는 입력되는 순서대로 데이터가 채워진다
		 */
		String result;
		String[] ans = new String[2];
		Object[][] obj = {{"홍길동", "010-7777-7777", 24}, {"심청이", "010-9999-9999", 20}};
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
