package day08;
/*
	���]
		�̹� ������� Ŭ������ �����
		�״�� �����޾Ƽ�(������, �Լ��� ����� �״�� ����޾Ƽ�)
		���ο� Ŭ������ ����� ���
		
		�� ������ ��Ÿ���� �� ����
		==> ����Ʈ������ ���� �ӵ��� ������ �ϱ� ���ؼ� ....
		
		��, ����� ��ü���� ����� �ٽ��̰� �ſ� �߿��� ������ �Ѵ�.
		��ü ���� ���ϴ� ��ǰ������ (Ŭ����������) ���α׷��� ������ 
		�� ��ǰ�� �����ؼ� ���ϴ� ����� ���� ��
		
		??
			��� ��ǰ�� ���ߴµ� �� ����� ������� ������ �� ������ �ʴ�.
			�׷� ó������ ��ǰ�� �ٽ� ������ �ұ�?
		??
		==> �ذ��� : ���
		
		����� ������ ���ϴ� ��ǰ�� ���� ������ ��ǰ�� ������ ��
			1. ���� ����� �� ���̰�
			2. �ִ� ����� �ٲ� ������ �ٲٰ�...
			
		����� �ϴ� ����] 
		
			[����������][�Ӽ�] class Ŭ�����̸� extends ��ӹ��� Ŭ�����̸� {
				���� Ŭ������ ���� ��� ����� �� �ȿ� ��� ����Ǿ� �ִ�.
			}
		
		����] 
			�ڹٿ����� ���� ���� ��Ӹ� �����ϴ�.
			��, ����� ���� Ŭ������ �Ѱ��� �����ϴ�.
			
		�������]
			����� ���� Ŭ���� - super class, ���� Ŭ����, �θ�Ŭ����
			����� ���� Ŭ���� - sub class, ����Ŭ����, �ڽ�Ŭ����
			***
			is a - ��� ���迡 �ִ� Ŭ������ �θ��� ���
				
				class Father{}
				class Son extends Father{}
				
				==> Sun is a Father
				==> Father f = new Son(); 
				==> Object o = new String();, new Math();.....
				(Object�� ���� ����, ���� Ŭ���� �̱⋚����)
			
				
			has a - � Ŭ���� �ȿ� �ٸ� Ŭ������ ����� ������ �ִ� ����
				
				class Father{}
				class Sun {
					Father f = new Father();
				}
				==> Sun has a Father
		========================================================================
		***
		�Լ��� �������̵�(Overriding : �Լ��� ������)
			==> ��Ӱ��迡 �ִ� ����Ŭ��������
				���� Ŭ������ ���� �Լ��� ����� �����ϴ� ����
			
			��Ģ]
				0. ������������ ����� �޾ƾ� �Ѵ�.
				1. ���� Ŭ������ ���� �Լ��� ������ �����ؾ� �Ѵ�.
					�Լ��� ���� : ��ȯ�� + �Լ��̸� + �Ű���������Ʈ
				2. ���������ڴ� ���ų� ���� �������� ...
				3. ����ó���� ���ų� ���� ��������...
 */
public class Test04 {

	public Test04() {
		Grand hal = new Grand();
		Father apa = new Father();
		Son adle = new Son();
		System.out.println("hal tlnee:"+hal.tlnee);
		System.out.println("apa tlnee:"+apa.tlnee);
		System.out.println("adle tlnee:"+adle.tlnee);
		
		Grand g = new Father();
		System.out.println("g tlnee : "+g.tlnee);
		System.out.println("g money : "+((Father)g).money); //Grand�� ����� money�� ����.
		//Father f = new Grand();  //Grand�� �ν��Ͻ����� Father�� ����� �����ϴ�.
		//Father f = (Father)new Grand(); 
		//���� ����ȯ�� ���� ����� �߰��� �� �ִ�.(�� ��Ӱ����϶���)
		Grand g2 = new Son();
		System.out.println("g2 tlnee : "+g2.tlnee);
		System.out.println("g2 age : "+g2.age); //***g2�� ����Ÿ���� grand �̹Ƿ� 
		g2.abc(); //***�Լ��� ���� �� �������� overriding�� �Լ��� �����ش�.
	}

	public static void main(String[] args) {
		new Test04();
	}
	class Grand{
		int age = 80;
		boolean tlnee = true;
		public void abc() {
			System.out.println("����� Grand!");
		}
	}
	class Father extends Grand {
		int age = 50;
		int money = 1000;
		String talmo = "Nooooo!!!";
		public void abc() {
			System.out.println("����� Father!");
		}
				
	}
	class Son extends Father {
		int age = 20;
		public void abc() {
			System.out.println("����� Sun!");
		}
	}
}
