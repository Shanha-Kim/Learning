package day11;

public class Test06 {
/*
	강제 예외 발생하기
		형식]
			throw new 예외클래스 이름();
 */
	public Test06() {
		try {
			System.out.println("try 시작");
			throw new Exception(); //무조건 catch문 실행
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Test06();
	}

}
