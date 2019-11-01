package day14;
import java.util.*;
/*
Set �迭
	�Է��� ������� �����ϰ� ���� ������ ����.
	(������ ��Ģ�� ���� ���������� ������ �ؼ� �����ϱ� ������...)
	
	�ߺ��Ǵ� �����ʹ� �ѹ��� ������ �Ѵ�.
	(���� �����Ͱ� �Է��� �Ǹ� �������� �Է��� �����͸� �����ϰ� ���ο� �����ͷ� ��ü�Ѵ�.)
	
	1. HashSet
		==> HashCode �� �̿��ؼ� �����ؼ� �����ϴ� ���
			�츮�� �˰��ִ� ������ �̷������ �ʴ´�.
			
			���� ���� ]
				HashSet(int initialCapacity, float loadFactor)
					loadFactor : 	�ؽ��ڵ尪�� ����� ��Ģ�� ����� ��� ���� 
									����ڰ� �����ϸ鼭 �ؽ����̺��� ���� ����Ѵ�.
									
		
		**
		����]
			Set �迭���� �����͸� �������� �Լ��� ���� �������� �ʴ´�.
			==> ��??
				�����ڰ� �����Ͱ� ����� �ּҸ� �� �� ���� ������...
				���� Ư�� ��ġ�� �����͸� ���� �� �ִ� ����� ����.
				
				���� Iterator�� ��ȯ�ؼ� ������� ������ ����ؾ� �Ѵ�.
*/
public class Test03 {

	public Test03() {
		Set s = new HashSet();
		s.add("bread");
		s.add("ddd");
		s.add("awdw");
		s.add("bff");
		s.add(30);
		System.out.println(s);
		
		//1. arraylist�� ������
		ArrayList al = new ArrayList(s);
		for (int i=0;i<5;i++) {
			System.out.print(al.get(i)+" | ");
		}
		System.out.println();
		//2. iterator�� ������
		Iterator itor = s.iterator();
		while(itor.hasNext()) {
			System.out.print(itor.next()+" | ");
		}
	}
	public static void main(String[] args) {
		new Test03();
	}
}
