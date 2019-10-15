package day03;
import java.util.Scanner;
/*
 * 대소문자 변환
 * 대문자면 =>소문자로
 * 소문자면 =>대문자로
 * 
 */
public class Ex01 {
	public Ex01() {
		
	}
	public static void main(String[] args) {
		new Ex01();
		System.out.println("문자를 하나 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char ch = str.charAt(0);
		if (Character.isUpperCase(ch)==true) {
			System.out.println(str.toLowerCase());
		}else {
			System.out.println(str.toUpperCase());
		}
	}
}
