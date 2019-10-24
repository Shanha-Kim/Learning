package day11;

import java.util.Scanner;

/*
	예제1]
		Change클래스에서 숫자를 입력받아서
		Test02의 no 값을 변형하고 출력해보자.
		
		단, Change클래에서 Test02.no는 Test02에서 
		인스턴스를 만들어서 함수를 호출해서 변경하자.
 */
public class Test02 {
	
	int no = 10;
	public Test02() {
		Change ch = new Change(this);
		System.out.println("함수 호출 전 no : " + no);
		ch.cNo();
		
		System.out.println("함수 호출 후 no : " + no);
	}

	public static void main(String[] args) {
		new Test02();
	}
}
class Change{
	//Test02의 객체를 기억할 변수가 필요
	Test02 main;
	public Change(Test02 main) {
		this.main = main;
	}
	
	public void cNo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("변경할 no의 값 : ");
		int tmp = sc.nextInt();
		main.no = tmp;
	}
}
