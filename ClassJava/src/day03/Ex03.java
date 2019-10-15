package day03;
import java.util.*;

public class Ex03 {

	public Ex03() {
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요: ");
		int num = sc.nextInt();
		int quo = num/100;
		if (num%100>=50) {	
			System.out.println((quo+1)*100-num+"을(를) 더하면 "+(quo+1)*100+" 이 됩니다.");
		}else {
			System.out.println(num%100+"을(를) 빼면"+quo*100+" 이 됩니다.");
		}
		
	}
}
