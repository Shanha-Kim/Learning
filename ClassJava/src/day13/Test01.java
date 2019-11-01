package day13;
import java.util.regex.*;
public class Test01 {

	public Test01() {
		String str="Abddfde";
		Pattern reg = Pattern.compile("[a-zA-Z]+?(?=e)e");
		Pattern reg2 = Pattern.compile("(?=e).*");
		//match find는 true로 일치되었을 경우 그 검색한것 다음부터 적용된다
		//중복적용 어려움
		Matcher match = reg.matcher(str);
		Matcher match2 = reg2.matcher(str);
		
		System.out.println(match.matches());
		//System.out.println(match.group());
		System.out.println(match.find());
		/*
		 * System.out.println(match2.matches()); System.out.println(match2.find());
		 * System.out.println(match2.group());
		 */
	}

	public static void main(String[] args) {
		new Test01();
	}

}
