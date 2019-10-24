package day11;
import java.util.*;
public class Test07 {
/*
	예제]
		한글자의 문자를 입력 받아서
		그 문자가 0~9까지면 받은 문자를 출력하고
		다른 문자거나 두글자 이상인 경우 예외처리를 하세요
		(강제로 예외를 발생)
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
