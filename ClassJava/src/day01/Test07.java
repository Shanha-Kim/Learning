package day01;
import java.util.*;
/*
 * ����]
 * 		�׺��� ����(����)�� �Է¹޾Ƽ� �ﰢ���� ���̸� ���ϴ� ���α׷��� �ۼ��϶�
 */
public class Test07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�غ��� �Է��ϼ��� : ");
		int width = sc.nextInt();
		System.out.println("���̸� �Է��ϼ��� : ");
		int height = sc.nextInt(); 
		double area = width*height/2.0;
		System.out.println("������� ���̴�: "+area);
		//���꿡 ���Եȼ��߿� �ϳ��� �Ǽ����¸� ����� �Ǽ��̴�.
		
		/*
		  ��¹��]
		  	1.println()
		  	2.print()
		  	3.printf():���İ� �����͸� �Է��ؼ� ����ϴ� ���
		  		printf("���Ĺ��ڿ�", ������1, ������2,....);
		  		���Ŀ� ���Ǵ� ��ȣ
		  			%c:����
		  			%s:���ڿ�
		  
		  			%d:����(������)
		  			%f:�Ǽ�
		  			%o:8����
		  			%x:16����
		  			%e:�Ǽ��� 10�� �������·� ���
		  
		  			%b:����(true, false)
		 */
		System.out.printf("�غ�:%5d, ����:%5d �� �ﰢ���� ���̴� %.2f �Դϴ�."
				,width, height, area);
	}
}
