package day09;
/*
	Object Ŭ����
		:   �ڹٷ� ������� Ŭ������ �ֻ��� super Ŭ����
			���� �ڹٷ� ������� ��� Ŭ������ Object�� ����� ������ �ֲ� 
			Object�� �����ϴ� ��� ���(��� : ����, �Լ�)�� �ڵ������� ����� �� �ְ� �ȴ�.
			
		����]
			�ڹٷ� ���� ��� Ŭ������ �ݵ�� ���� Ŭ������ ������ �ֵ�.
			�츮�� ����� ��� Ŭ�����鵵 ���� Ŭ������ �����ϰ� 
			���� ������ ���� Ŭ������ �������� ������ (==>extends ���� ������)
			���������� Object Ŭ������ ��ӹ޾Ƽ� ���������.
		
		***
		�ڹٷ� ���� ��� Ŭ������ Object Ŭ������ ���� Ŭ�����̴�.
		==================================================================================
		
		***
		instanceof
			==> Ư�� Ŭ������ �ν��Ͻ��� ����� �ּҰ� �����������
				������
				
			����]
				�ּ� instanceof Ŭ�����̸�
			�ǹ�]
				������ Ŭ���� �Ҽ������� ����°�
				
 */
public class Test03 {

	public Test03() {
		Object[] o = {1, 3.14, "abcd", 'a', true};
		System.out.println("1 : "+ ("123" instanceof String));
		System.out.println("2 : "+ ((Integer)10 instanceof Integer));
		System.out.println("2 : "+ ((Integer)10 instanceof Integer));
		
		for(int i=0; i<5; i++) {
			if(o[i] instanceof String) {
				System.out.println("���ڿ� : " + o[i]);
			}else if (o[i] instanceof Integer) {
				System.out.println("���� : " + o[i]);
			}else if (o[i] instanceof Double) {
				System.out.println("�Ǽ� : " + o[i]);
			}else if (o[i] instanceof Boolean) {
				System.out.println("�Ҹ� : " + o[i]);
			}else if (o[i] instanceof Character) {
				System.out.println("���� : " + o[i]);
			}
		}
	}

	public static void main(String[] args) {
		new Test03();
	}

}
