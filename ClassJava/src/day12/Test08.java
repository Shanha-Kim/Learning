package day12;
import java.util.Date;
public class Test08 {
/*
	Date 클래스
		==> 날짜와 시간을 관리하는 클래스
			생성자 함수
				Date()
					==> 시스템의 현재시간을 객체로 만들어준다.
				Date(int year, int month, int date)
					==> 매개변수로 입력된 값을 객체로 만드는 기능
				Date(String s)
					==> 문자열로 입력된 값을 객체로 만드는 기능...
	참고]
		Deprecated
			==> 이 단어가 붙은 멤버는 
				자바에서 언제 없어질지 모르는 멤버이므로 사용주의
		자바에서는 Calender 클래스가 버전업 버전이다.
		자바쪽에서는 Calender 클래스의 사용을 권장한다.
 */
	public Test08() {
		Date date = new Date();
		System.out.println(date.getYear()+"년 "+(date.getMonth()+1)+"월 "+date.getDate()+"일 ");
		//getmonth는 0월부터 시작
	}

	public static void main(String[] args) {
		new Test08();
	}

}
