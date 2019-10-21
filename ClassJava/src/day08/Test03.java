package day08;

public class Test03 {
/*
	멤버 변수의 초기화
		==> 멤버 변수는 자동 초기화 된다.
			(단 기본 데이터 타입에 한해서 기본값이 셋팅이 된다.)
	
	초기화 방법]
		1. 명시적 초기화
		==> 변수 선언시 초기화.
			가장먼저 적용됨
			
		2. 초기화 블럭을 이용한 초기화(초기화블럭이 따로 있는건 아니다.)
		==> 인스턴스 변수에 대해서만 가능함
			두번쨰로 적용됨

		3. static 블럭을 이용한 초기화
		==> 2번과 비슷하나 대신 static변수에 한해서만 가능한 방법
			두번째 실행되는 방법
			
		4. 생성자 함수를 이용한 초기화
		==> 기본타입은 자동초기화, 참조형 타입은 null
		
 */
	int no;
	{no=100;} //블럭내에서 초기화
	static int num;
	static {num=999;}
	String str;
	public Test03() {
		new Test03("홍길동"); //이건 무슨의미? - heap영역에 새로운 객체 생성(str="홍길동"인)
		Test03 a = new Test03("홍길동");
		System.out.println("no : "+no+" | num : "+num+" | str : "+str); 
		//32번 라인에서 test03에 의해 정의된 str은 
		System.out.println("no : "+no+" | num : "+num+" | str : "+a.str);
	}
	public Test03(String str) {
		this.str = str;
	}

	public static void main(String[] args) {
		new Test03();
		//System.out.println(no);
	}
	

}
