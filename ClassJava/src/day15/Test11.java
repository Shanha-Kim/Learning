package day15;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/*
	���׸���, ������̼�
 */
public class Test11 {

	public Test11() {
		HashSet<String> set = new HashSet<String>();
		set.add("�Ѹ�");
		set.add("����");
		set.add("��ġ");
		set.add("������");
		set.add("��浿");
//		set.add(123); ==> ���׸����� ���� �ʴ�.
		Iterator<String> itor = set.iterator();
		while(itor.hasNext()) {
			String str=itor.next();
			System.out.println(str);
		}
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("�Ѹ�", 1);
		map.put("����", 4);
		map.put("�����", 5);
		map.put("��ġ", 3);
		map.put("��浿", 34);
		for (String p:map.keySet()) {
			System.out.println(p+"�� "+map.get(p)+"�� �Դϴ�.");
		}
		for (String p:map.keySet()) {
			System.out.println(p+"�� "+map.get(p)+"�� �Դϴ�.");
		}
	}

	public static void main(String[] args) {
		new Test11();
	}
}
