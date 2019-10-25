package day12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class rextest {

	public rextest() {
		String id = "asd1";
		Pattern form = Pattern.compile("^(?=.*1)\\w+");
		Matcher match = form.matcher(id);
		String result = "형식에 맞지 않습니다.";
		if(match.matches()) {
			result = "올바른 id입니다.";
		}
		System.out.println("["+id+"] 는 " + result);	}

	public static void main(String[] args) {
		new rextest();
	}

}
