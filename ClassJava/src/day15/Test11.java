package day15;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/*
	제네릭스, 어노테이션
 */
public class Test11 {

	public Test11() {
		HashSet<String> set = new HashSet<String>();
		set.add("둘리");
		set.add("희동이");
		set.add("또치");
		set.add("마이콜");
		set.add("고길동");
//		set.add(123); ==> 제네릭스에 맞지 않다.
		Iterator<String> itor = set.iterator();
		while(itor.hasNext()) {
			String str=itor.next();
			System.out.println(str);
		}
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("둘리", 1);
		map.put("희동이", 4);
		map.put("도우너", 5);
		map.put("또치", 3);
		map.put("고길동", 34);
		for (String p:map.keySet()) {
			System.out.println(p+"는 "+map.get(p)+"살 입니다.");
		}
		for (String p:map.keySet()) {
			System.out.println(p+"는 "+map.get(p)+"살 입니다.");
		}
	}

	public static void main(String[] args) {
		new Test11();
	}
}
