package day11;

public class Test04 {
/*
	finally ��
		==> ���� �߻� ���ο� ������� �ݵ�� ����Ǿ�� �� ������ �����Ұ�� ���
			try, catch ���� �Լ���, ���α׷��� ����Ǵ��� finally������ �����Ѵ�.
		����]
			���� finally���� �����Ѵٸ� catch() ���� ������ ���� �ִ�.
	============================================================================
	
	�������� ����ϱ�
		
		1. ��������Ŭ���� ������ ����ϸ� �ȴ�.
			System.out.println(����Ŭ��������);
			==>������ ������ �ľ��� �� �ִ�.
			==>Throwable Ŭ������ toString()�� �ڵ�ȣ���Ѵ�.
			
		2. e.printStackTrace()�� �̿��ϴ� ���
			==>������ ���� + ��ġ
		
		***
			����ó���� ������ ������ �˾Ƴ��� 
			�� ���α׷��� �������� ��ġ�� �˷��༭
			���������� ���α׷��� �۵��� ��ų �� �ִ� ����� ã�� �� �ִ�. 
 */
	public Test04() {
		check();
	}

	public static void main(String[] args) {
		new Test04();
	}
	public void check() {
		try {
			System.out.println("���� try");
			return;
		}catch(Exception e) {
			System.out.println("���� catch");

		}/*finally {
			System.out.println("���� finally");
		}*/
		System.out.println("���� finally �ٱ�");
	}
}
