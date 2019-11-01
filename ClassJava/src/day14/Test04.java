package day14;

/*
TreeSet
   ==> ���������� Tree Sort��� �˰����� �̿��ؼ� �����͸� �����ϴ� ����� ������ �ִ�.
   
   Ư¡]
      �츮�� ����ϴ� ���Ĺ���� �ƴϴ�.
           
   �������]
    
       TreeSet(Comparator comparator)
     ==>���� ����� �����ؼ� TreeSet�� �����.
      
      TreeSet(SortedSet<e> s)
      ==> TreeSet�� �̿��ؼ� �ٽ� TreeSet�� �����.
      
      �����Լ�]
         subSet()
            == > �ϳ��� Set�� ��� ���� �� Ư���κи� ��� ���ο� Set�� ����� �Լ�
            
         headSet(E toElement)
            ==> ó������ ������ �κб��� ��� ���ο� Set�� �����
            
         tallSet(E fromElement)
            ==> ������ �κк��� ���������� ��� ���ο� Set�� �����.
*/
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/*
	
 */
public class Test04 {

	public Test04() {
		
		HashSet s = new HashSet();
		Random rnd = new Random();
		while (true) {
			// �ߺ��� �����Ͱ� �߻��ϸ� �ٽ� �߻����Ѿ� �ϹǷ�
			// ��� �ݺ��ؾ� �� �� �� �� ����.
			int num = rnd.nextInt((10)) + 1;
			s.add(num);
			if (s.size() == 8) {
				break;
			}
		}
		System.out.println(s);
		// 1. arraylist�� ������
		ArrayList al = new ArrayList(s);
		for (int i = 0; i < al.size(); i++) {
			System.out.print(al.get(i) + " | ");
		}
		System.out.println();
		al.sort(new MySort());
		System.out.println(al);
		// 2. iterator�� ������
		Iterator itor = s.iterator();
		while (itor.hasNext()) {
			System.out.print(itor.next() + " | ");
		}
	}

	public static void main(String[] args) {
		new Test04();
	}
}
class MySort implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		int result = (int) o1 - (int) o2;
		return -result;
	}
}
