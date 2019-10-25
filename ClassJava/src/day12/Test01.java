package day12;
import java.util.*;
/*
	Object Ŭ����
		:   �ڹ��� �ֻ��� Ŭ����
			��� Ŭ������ Object�� ��ӹ޾Ƽ� ���������.
			���� ��� Ŭ������ Object�� ������ �ִ� ����� ��� ������ �ִ�.
			��� �������̵� �ϴ���
	clone()
		==> �ڱ� �ڽ��� �����ϴ� �Լ�
			�� �Լ��� ���������ڰ� protected�̹Ƿ� 
			�ڱ��ڽ��� ���ο����� ����� ����������
			�ٸ� Ŭ�������� �� ��ü�� ������ ��쿡�� ��� ���Ѵ�.
			���� ���������ڸ� public ���� �ٲ㼭 �������̵� ����� �Ѵ�.
	
	hashCode()
		==> �ڹٴ� �ּҸ� �������� �ʱ� ���ؼ� 
			�ؽ����̺��� �̿��ؼ� �ּҸ� �����Ѵ�.
			
 */
public class Test01 {

	public Test01() {
		Test_01 t1 = new Test_01();
		
//		Test_01 tt = t1.clone(); // ==> clone() ���������ڴ� protected �̴�...
		Test_01 tt = null;
		
		try {
			tt = (Test_01) t1.clone();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new Test01();
	}
}

class Test_01{
	int no = 10;
	
	public Object clone() throws CloneNotSupportedException {
		
		return this;
	}
}