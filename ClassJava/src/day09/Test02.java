package day09;
/*
	super
		:   this�� �������� �ڽ��� �ּҸ� ����ϴ� ����� �����̵���
			super ���� ����� ���� �� �ϳ�
			�ڽ��� ���� Ŭ������ �ּҰ� ���� ����
			
		***
			������ ������ ������!
			�Լ��� �ֽ� ������ ������!
		***
			������]
				�ݵ�� �Ҽ��� ������ �ϴ� ��쿡 ����Ѵ�.
 */ 
public class Test02 {
	Son temp = new Son();
	
	public static void main(String[] args) {
		//�Ʒ� �� ���๮�� ���� ����
		System.out.println("main");
		new Test02().temp.call();
	}
	{temp.call();}
	
	
	
}
class Grand{
	int age = 80;
	public void abc() {
		System.out.println("����� Grand!");
	}
}
class Father extends Grand {
	int age = 50;
	public void abc() {
		System.out.println("����� Father!");
	}
	public void call() {
		abc();
		super.abc();	
		System.out.println(age);
		System.out.println(super.age);
	}
	
	//{abc();}  //Ŭ�������ο� �Լ��� ������ �� �ȿ���!, Father ��ü ������ �ڵ�����(mainó��)
}
class Son extends Father {
	 
	//{call();}
}
