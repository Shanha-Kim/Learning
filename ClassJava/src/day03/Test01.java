package day03;

import java.util.Arrays;

/*
 * ���� ���� �߻���
 * 		Math.random()//0<=x<1��  x ��ȯ
 * 
 * 
 * �迭 : ���� ������ �����͸� ������ ��Ƽ� �Ѳ����� �����ϴ� �ý���
 * 	���ǻ���]
 * 		���鶧 �ݵ�� Ÿ�԰� ���̸� ���ؾ� �Ѵ�.
 * 		�ѹ� ������� �迭�� ���̸� �������� ���Ѵ�.
 * 	����]
 * 		������Ÿ��[] �����̸� = {data1, data2, ....} 
 * 		������Ÿ��[] �����̸� = new ������Ÿ��[����]
 * 		������Ÿ��[] �����̸� = new ������Ÿ��[]{data1, data2, ....}
 * 	����]
 * 		�迭�� ������ Ȯ���ϴ� �Լ�
 * 		Arrays.toString(�迭�ּ�);
 */
public class Test01 {

	public Test01() {
		System.out.println(Math.random());
		/***************************************************************************/
		
		int num[] = new int[] {1,2,3,4,5};
		for (int n : num) {
			System.out.println(n);
		}
		System.out.println(Arrays.toString(num));
		/**************************************************************************/
		
		String str1 = "abcd";
		String str2 = new String("abcd");
		String str3 = new String("abcd");
		System.out.println(str1 == str2);
		System.out.println(str3 == str2);
		System.out.println("------------------------------------------------------");
		System.out.println(str1.equals(str2));
		System.out.println(str3.equals(str2));
		//toString()�Լ��� ȣ���� �� ������� �迭�� �ּҸ� �Է�
		//�ڹٿ����� �޸��� �ּҸ� ���� ������ �� ����
		//�� �ּҸ� ������ ����ϵ��� �ϰ� �ִ�.
		//���� �迭�� �ּҸ� ����ϰ� �ִ� ������ �Է��ָ� 
	}
	public static void main(String[] args) {
		new Test01();
	}
}
