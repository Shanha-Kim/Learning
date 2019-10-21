package day01;
import java.util.*;
/*
 * 문제]
 * 		및변과 높이(정수)를 입력받아서 삼각형의 넓이를 구하는 프로그램을 작성하라
 */
public class Test07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("밑변을 입력하세요 : ");
		int width = sc.nextInt();
		System.out.println("높이를 입력하세요 : ");
		int height = sc.nextInt(); 
		double area = width*height/2.0;
		System.out.println("삼격형의 넓이는: "+area);
		//연산에 포함된셋중에 하나만 실수형태면 결과는 실수이다.
		
		/*
		  출력방법]
		  	1.println()
		  	2.print()
		  	3.printf():형식과 데이터를 입력해서 출력하는 방법
		  		printf("형식문자열", 데이터1, 데이터2,....);
		  		형식에 사용되는 기호
		  			%c:문자
		  			%s:문자열
		  
		  			%d:정수(십진수)
		  			%f:실수
		  			%o:8진수
		  			%x:16진수
		  			%e:실수를 10의 지수형태로 출력
		  
		  			%b:논리값(true, false)
		 */
		System.out.printf("밑변:%5d, 높이:%5d 인 삼각형의 넓이는 %.2f 입니다."
				,width, height, area);
	}
}
