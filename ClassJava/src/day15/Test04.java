package day15;

import java.util.*;

public class Test04 {

	public Test04() {
		HashMap map = new HashMap();
		map.put("�Ѹ�", 70);
		map.put("��", 80);
		map.put("�浿", 95);
		System.out.println(map);
		
		Collection lst = map.values();
		for (Object o:lst) {
			System.out.println(o);
		}
	}

	public static void main(String[] args) {
		new Test04();
	}

}
