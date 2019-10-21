package day07;
import java.util.Scanner;
/*
	반복문 활용
	문제2]
		5자리 숫자를 입력받아서
		이 숫자가 회문수 인지 아닌지 판별하시오
	참고]
		회문수는 대칭수와 동의어( 12321 )
 */
public class Ex02 {

	public Ex02() {
		Scanner sc = new Scanner(System.in);
		System.out.println("5자리 숫자를 입력하세요");
		String str = sc.next();
		for (int i=0; i<3; i++) {
			if (str.charAt(i)==str.charAt(4-i)) {
				if (i==2) {
					System.out.println(str+"은 회문수입니다.");
				}
			}else {
				System.out.println(str+"은 회문수가 아닙니다.");
				break;
			}
		}
	}

	public static void main(String[] args) {
		new Ex02();
	}

}
