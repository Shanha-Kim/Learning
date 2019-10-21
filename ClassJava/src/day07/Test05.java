package day07;

public class Test05 {
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
	  	문자열의 길이를 정해줄 수 있다.
	  	%10s => 문자열을 10자리에 맞춰서 출력
	  	%5d => 10진수를 5자리에 맞춰 출력
	 */
	public Test05() {
		double pi = Math.PI;
		System.out.printf("%s : %5.2f\n","파이값",pi);
		System.out.printf("%5s : %7.2f","파이값",pi); //우로정렬
	}
	public static void main(String[] args) {
		new Test05();
	}
}
