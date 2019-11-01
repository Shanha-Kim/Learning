package day15;

import java.util.*;


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
            	==> 하나의 Set에 담긴 내용 중 특정부분만 골라서 새로운 Set을 만드는 함수
            
         	headSet(E toElement)
            	==> 처음부터 지정한 부분까지 골라서 새로운 Set을 만든다
            
         	tallSet(E fromElement)
            	==> 지정한 부분부터 마지막까지 골라서 새로운 Set을 만든다.
*/
public class Test01 {
	TreeSet tree;
	public Test01() {
		//setNum();
		setName();
		System.out.println(tree);
		
	}
	public void setNum() {
		tree = new TreeSet();
		while(tree.size()<10) {
			int no=(int)(Math.random()*20+1);
			tree.add(no);
		}
	}
	public void setName() {
		ArrayList list = new ArrayList();
		list.add("adb");
		list.add("dfa");
		list.add("sdf");
		list.add("sbs");
		list.add("dff");
		list.add("gsd");
		list.add("sda");
		list.add("ssd");
		list.add("aac");
		list.add("abv");
		tree = new TreeSet();
		while(tree.size()<10) {
			tree.add(list.get((int)(Math.random()*10)));
		}
	}
	public static void main(String[] args) {
		new Test01();
	}
}
