package day03;
import java.util.*;
/*
 	����]
 		�� ������ �ζǸ� ����� �迭�� ���� ����ϰ� ����ϼ���
 		����� �迭�� ������ Ȯ���ϴ� �Լ��� ����ؼ� ó���ϼ���
 */
public class CreateLotto {
	int[] myLotto = new int[6];
	public CreateLotto() {
		for(int i=0; i<6; i++) {
			int n=(int)(Math.random()*45)+1;
			if (Arrays.asList(myLotto).contains(n)) {}
			else {
				myLotto[i]=n;
			}
		}
		System.out.println(Arrays.toString(myLotto));
		
	}
	public static void main(String[] args) {
		new CreateLotto();
	}
}
