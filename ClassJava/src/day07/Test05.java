package day07;

public class Test05 {
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
	  	���ڿ��� ���̸� ������ �� �ִ�.
	  	%10s => ���ڿ��� 10�ڸ��� ���缭 ���
	  	%5d => 10������ 5�ڸ��� ���� ���
	 */
	public Test05() {
		double pi = Math.PI;
		System.out.printf("%s : %5.2f\n","���̰�",pi);
		System.out.printf("%5s : %7.2f","���̰�",pi); //�������
	}
	public static void main(String[] args) {
		new Test05();
	}
}
