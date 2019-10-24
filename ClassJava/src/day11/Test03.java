package day11;
import java.util.*;


public class Test03 {
/*
	예외처리
		:
 */
	public Test03() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요! : ");
		int no=0 ;
		try{
			System.out.println("***코드 실행 전");
			no = sc.nextInt();
			
			System.out.println("***코드 실행 후");
			//throw new Exception();
		} catch(NumberFormatException e) {
			System.out.println("숫자형식이 아닙니다.");
		} catch(Exception e){
			e.printStackTrace(); //오류 출력(방법은 여러가지)
			System.out.println("예외 발생!");
			//throw e;			
		}
		
		System.out.println("입력된 정수 : " + no);
		System.out.println("##### END #######");
	}
	
	public static void main(String[] args) {
		new Test03();
	}
}
