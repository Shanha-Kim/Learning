package day11;
import java.util.*;
public class Test07 {
/*
	문제1]
		문자열 배열에 "123","456"
 */
	public Test07() {
		Scanner sc = new Scanner(System.in);
		System.out.println("한자리 정수를 입력하세요: ");
		int n=0;
		try {
			n = sc.nextInt();
			if (n>=10 || n<1) {
				throw new Exception();
			}
			System.out.println(n+" 을 입력하셨습니다.");
		}catch(Exception e) {
			System.out.println("한자리 정수만 입력하세요!");
		}
	}

	public static void main(String[] args) {
		new Test07();
	}

}
