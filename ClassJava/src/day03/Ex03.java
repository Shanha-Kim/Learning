package day03;
import java.util.*;

public class Ex03 {

	public Ex03() {
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���: ");
		int num = sc.nextInt();
		int quo = num/100;
		if (num%100>=50) {	
			System.out.println((quo+1)*100-num+"��(��) ���ϸ� "+(quo+1)*100+" �� �˴ϴ�.");
		}else {
			System.out.println(num%100+"��(��) ����"+quo*100+" �� �˴ϴ�.");
		}
		
	}
}
