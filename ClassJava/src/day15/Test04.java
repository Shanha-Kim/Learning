package day15;

import java.util.*;

public class Test04 {

	public Test04() {
		HashMap map = new HashMap();
		map.put("둘리", 70);
		map.put("희동", 80);
		map.put("길동", 95);
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
