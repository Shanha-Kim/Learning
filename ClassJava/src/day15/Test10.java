package day15;

import java.util.Properties;
import java.util.Set;

/*
	프로그램에 관련된 정보를 자동으로 뽑아서 구경해보자
	
 */
public class Test10 {

	public Test10() {
		Properties prop = System.getProperties();
		Set set = prop.keySet();
		System.out.println(set);
	}
	public static void main(String[] args) {
		new Test10();
	}
}
