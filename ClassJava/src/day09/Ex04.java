package day09;
import java.util.Scanner;

/*
	문제4]
		핸드폰에 전화번호를 저장할 프로그램을 만들 예정이다.
		친구 클래스를 작성하고
		친구를 추가해서 
		이를 검색하면 정보를 알려주는 프로그램을 작성하세요.
 */
public class Ex04 {

	public Ex04() {
		Friend[] arr = new Friend[10];
		System.out.println("친구 목록입니다.");
		for(int i=0; i<10; i++) {
			arr[i] = new Friend();
			System.out.println(arr[i].name);
		}
		Scanner sc = new Scanner(System.in);

		System.out.println("\n찾고싶은 친구를 써 주세요");
		String n = sc.nextLine();
		for(int i=0; i<10; i++) {
			if ((arr[i].name).equals(n)) {
				System.out.println("이 친구의 번호는 "+arr[i].phone+" 입니다." );
			}
		}

	}

	public static void main(String[] args) {
		new Ex04();
	}
}
class Friend{
	String name="David ";
	String phone="82)";
	public Friend() {
		for (int i=0; i<8; i++) {
			name += (char)(int)(Math.random()*25+65);
			phone += (char)(int)(Math.random()*9+48);
		}
	}
}
