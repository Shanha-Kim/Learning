package day14;

/*
TreeSet
   ==> 내부적으로 Tree Sort라는 알고리즘을 이용해서 데이터를 보관하는 기능을 가지고 있다.
   
   특징]
      우리가 상상하는 정렬방식이 아니다.
           
   생성방법]
    
       TreeSet(Comparator comparator)
     ==>정렬 방식을 변경해서 TreeSet을 만든다.
      
      TreeSet(SortedSet<e> s)
      ==> TreeSet을 이용해서 다시 TreeSet을 만든다.
      
      참고함수]
         subSet()
            == > 하나의 Set에 담긴 내용 중 특정부분만 골라서 새로운 Set을 만드는 함수
            
         headSet(E toElement)
            ==> 처음부터 지정한 부분까지 골라서 새로운 Set을 만든다
            
         tallSet(E fromElement)
            ==> 지정한 부분부터 마지막까지 골라서 새로운 Set을 만든다.
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
			// 중복된 데이터가 발생하면 다시 발생시켜야 하므로
			// 몇번 반복해야 될 지 알 수 없다.
			int num = rnd.nextInt((10)) + 1;
			s.add(num);
			if (s.size() == 8) {
				break;
			}
		}
		System.out.println(s);
		// 1. arraylist로 꺼내기
		ArrayList al = new ArrayList(s);
		for (int i = 0; i < al.size(); i++) {
			System.out.print(al.get(i) + " | ");
		}
		System.out.println();
		al.sort(new MySort());
		System.out.println(al);
		// 2. iterator로 꺼내기
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
