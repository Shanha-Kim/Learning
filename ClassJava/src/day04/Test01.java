package day04;

import java.util.Arrays;

/*
	����]
		1. ���� ����
			�ּҸ� ����
			
		2. ���� ����
			�����͸� ����
			
	��üŸ�� �迭�� Ư��]
		
 */
public class Test01 {

	public Test01() {
		int[] num1 = {1,2,3,4,5};
		int[] num2 = new int[num1.length];
		System.arraycopy(num1,  0,  num2,  0,  num1.length);
		num1[0] = 10;
		System.out.println(Arrays.toString(num1));
		System.out.println(Arrays.toString(num2));
		
		Object[] obj = new Object[10];
		obj[0]="abcd";
		obj[1]=1;
		obj[2]=3.14f;
		obj[3]=true;
		obj[4]='A';
		float test1 = (int)obj[1]+(float)obj[2];
		/*
		 	object Ÿ������ ���� ������ ���� ����ȯ�� �ʿ��ϴ�.
		 	���� ������ int => integer => object Ÿ������ ��ȯ�Ǿ� �迭�� ����.
		 	�ᱹ �������� Ÿ���� �����͸� �־ object Ÿ�� �ϳ��� �����ȴ�.	
		 */
		System.out.println(test1);
	}

	public static void main(String[] args) {
		new Test01();
	}

}
