package day08;

public class Test03 {
/*
	��� ������ �ʱ�ȭ
		==> ��� ������ �ڵ� �ʱ�ȭ �ȴ�.
			(�� �⺻ ������ Ÿ�Կ� ���ؼ� �⺻���� ������ �ȴ�.)
	
	�ʱ�ȭ ���]
		1. ����� �ʱ�ȭ
		==> ���� ����� �ʱ�ȭ.
			������� �����
			
		2. �ʱ�ȭ ���� �̿��� �ʱ�ȭ(�ʱ�ȭ���� ���� �ִ°� �ƴϴ�.)
		==> �ν��Ͻ� ������ ���ؼ��� ������
			�ι����� �����

		3. static ���� �̿��� �ʱ�ȭ
		==> 2���� ����ϳ� ��� static������ ���ؼ��� ������ ���
			�ι�° ����Ǵ� ���
			
		4. ������ �Լ��� �̿��� �ʱ�ȭ
		==> �⺻Ÿ���� �ڵ��ʱ�ȭ, ������ Ÿ���� null
		
 */
	int no;
	{no=100;} //�������� �ʱ�ȭ
	static int num;
	static {num=999;}
	String str;
	public Test03() {
		new Test03("ȫ�浿"); //�̰� �����ǹ�? - heap������ ���ο� ��ü ����(str="ȫ�浿"��)
		Test03 a = new Test03("ȫ�浿");
		System.out.println("no : "+no+" | num : "+num+" | str : "+str); 
		//32�� ���ο��� test03�� ���� ���ǵ� str�� 
		System.out.println("no : "+no+" | num : "+num+" | str : "+a.str);
	}
	public Test03(String str) {
		this.str = str;
	}

	public static void main(String[] args) {
		new Test03();
		//System.out.println(no);
	}
	

}
