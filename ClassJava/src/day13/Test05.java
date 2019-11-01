package day13;

import java.text.ChoiceFormat;

public class Test05 {

	public Test05() {
		String pattern = "0#F|60#D|70#C|80#B|90#A";
		//60#D ==> 60 <= 면 D로 처리하세요.
		ChoiceFormat form = new ChoiceFormat(pattern);
		int score = 60;
		String grade = form.format(score);
		System.out.println(score + " 점의 학점은 " + grade +" 입니다.");
	}

	public static void main(String[] args) {
		new Test05();
	}

}
