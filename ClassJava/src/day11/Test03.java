package day11;
import java.util.*;


public class Test03 {
/*
	����ó��
		:
 */
	public Test03() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���! : ");
		int no=0 ;
		try{
			System.out.println("***�ڵ� ���� ��");
			no = sc.nextInt();
			
			System.out.println("***�ڵ� ���� ��");
			//throw new Exception();
		} catch(NumberFormatException e) {
			System.out.println("���������� �ƴմϴ�.");
		} catch(Exception e){
			e.printStackTrace(); //���� ���(����� ��������)
			System.out.println("���� �߻�!");
			//throw e;			
		}
		
		System.out.println("�Էµ� ���� : " + no);
		System.out.println("##### END #######");
	}
	
	public static void main(String[] args) {
		new Test03();
	}
}
