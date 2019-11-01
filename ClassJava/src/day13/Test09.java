package day13;

import java.util.Vector;

public class Test09 {

	public Test09() {
		Vector vec = new Vector();
		vec.add(new SName());
		vec.add(new SName());
		vec.add(new NName());
		vec.add(new NName());
		vec.add(new SName());
		vec.add(new NName());
		int no=0;
		NameInfo n;
		for(Object o:vec) {
			n = (NameInfo)o;
			if(no++ %2 ==0) {
				n.getName("¹Ú¼Û¸²");
			}else {
				n.getName("°íÈñÀ±");
			}
		}
	}
	public static void main(String[] args) {
		new Test09();
	}
}
