package day13;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class Test08 {
/*
	�÷���(Collection)
		==> �������� �����͸� �ս��� ������ �� �ִ� Ŭ�������� ����
		�迭�� ������ �����ؼ� ����� ���� �͵�
		
	���� (list, set�� ���� Ŭ������ ���� , map�� �ٸ���)
		1. List
			- �Է� ������ ����(��� �ӵ��� ����)
			- �ߺ������� ���
			 
		2. Set	
			- �Է� ������ �������� ����(������ ��Ģ�� ������ �����Ѵ�, �ӵ��� ������)
			- �ߺ������Ͱ� �ԷµǸ� ���� �����͸� ������ �����Ѵ�.
			
		3. Map
			- ������ ������ Ű, ��� ������ �̷������.
			- �Է¼��� ���� x
			- Ű���� �ߺ��ɼ� ����.
		
	����]
		List �迭�� Set�迭�� ���� Ŭ������ ������(���� �ڷ��� ��ȯ ����)
		Map�迭�� ���� �ٸ� ���� Ŭ������ ������ �ִ�.
		
	===========================================================================
	list �迭
		1. Vector
			==> ���������� �迭 ���¸� ���� �����͸� �����ϴ� �÷����� �� ����
				���� - �Է� �ӵ��� �˻��ӵ��� ������.
				���� - �߰��� �����͸� �����ϰų�, �����ϴ� �ӵ��� ������.
				��� - �������� ��ȭ�� ���� ���α׷����� ���� ���
				�������]
					Vector()
						==> �⺻ ����� 10���� ���� �Ǿ��ִ�.
							�����Ͱ� �߰��� �Ǹ� ���������� *2�� �ȴ�.
					Vector(collection c)
						==> �ٸ� �÷��� �����͸� �Է��ϸ� �����͸� �����ؼ� ���͸� ������ش�.
					Vector(int initialCapacity)
						==> ���� �� ���� ����� ���ؼ� ���͸� �����.
							**�� ����� �����Ѵ�.**
					Vector(int initialCapacity, int capacityIncrement)
						==> ����� �����ҋ� *2�� �ƴ� �߰��Ǵ� ����� �����Ѵ�.
				����]
					�÷����� ����Ȯ����Ģ]
						���� ������*2
				�ֿ��Լ�]
				1. �Է��Լ�
					add(Object e)
					add(int index, Object e)
					addAll(Collection c) - �ǳ��� ���ٿ���
					addAll(int index, collection c)
					addElement(Object obj) - ���� �ǳ��� Object��(vector) ������ �߰�
					insertElementAt(Object obj, int index)
					elements()
				2. ����Լ�
					get(int index)
					elementAt(int index)
					firstElement()
					lastElement()
					elements()
				3. �����Լ�
					set(int index, Object element)
					
				
					
					
	
 */
	
	public Test08() {
		ArrayList arr = new ArrayList();
		Vector vec = new Vector();
		Vector vec2 = new Vector(5, 5);
		vec.add("�����");
		vec.add("�����");
		vec.add("�ڼ۸�");
		for(Object o : vec) {
			System.out.println((String)o);
		}
		//System.out.println(vec.get(0));
		System.out.println(vec.capacity());
		System.out.println(vec2.capacity());
		
		Enumeration en = vec.elements();
	}

	public static void main(String[] args) {
		new Test08();
	}

}
