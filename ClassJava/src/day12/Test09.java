package day12;
import java.util.*;
public class Test09 {
/*
	get(int field)
		==> 필요한 정보를 알려주는 함수
			이 함수는 int field에 알고자 하는 내용을 알려주면
			그 값에 대해서 알려주는 함수이다.
			참고]
				field : 클래ㅡ가 가지고 있는 멤버변수를 field드라고 한다.
			따라서 field 에는 Calendar 멤버변수를 가져야 한다.
 */
	public Test09() {
		//Calender cal = new Calender(); 추상클래스여서 new 불가능
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.DATE);
	}

	public static void main(String[] args) {
		new Test09();
	}

}
