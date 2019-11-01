package day15;

import java.util.*;


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
            	==> �ϳ��� Set�� ��� ���� �� Ư���κи� ��� ���ο� Set�� ����� �Լ�
            
         	headSet(E toElement)
            	==> ó������ ������ �κб��� ��� ���ο� Set�� �����
            
         	tallSet(E fromElement)
            	==> ������ �κк��� ���������� ��� ���ο� Set�� �����.
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
