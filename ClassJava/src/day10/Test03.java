package day10;

public class Test03 {
/*
	������
		��Ӱ��迡 �ִ� Ŭ������ ��
		���� Ŭ������ ������ ����Ŭ�������� �ν��Ͻ��� ���� �� �ִ� �� �� ��Ģ
		
		��Ӱ��迡���� ����ȯ
			: ����ȯ�� �� �� �ִ� ���� ������ ��Ӱ��迡 ���� ��...
			
			1. �ڵ� ����ȯ
				: ���� Ŭ������ �ν��Ͻ��� ����Ŭ������ ������ �Է��� ��
				
			2. ���� ����ȭ
				: ���� Ŭ������ ������ ����Ŭ������ ������ �Է��� ��
					
					��Ģ�����δ� �Ұ����ϸ�
					������ ����ȯ�� ������ �ϴ�.
				
 */
	public Test03() {
		Grand g1 = new Father();
		Grand g2 = new Son();
		Father f1 = new Son();
		
//		g2.abc(); - x ==> Grand�� ����� abc() �� ���� �Ǿ� ���� �ʱ� ������...
		
//		Father f2 = (Father)new Grand();
		Father f2 = (Father)g1;
	}

	public static void main(String[] args) {
		new Test03();
	}

}


class Grand {
	int no = 10;
}

class Father extends Grand {
	public void abc() {
		System.out.println("Father");
	}
}

class Son extends Father {
	public void abc() {
		System.out.println("Son");
	}
}
