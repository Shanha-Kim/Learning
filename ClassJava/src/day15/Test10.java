package day15;

import java.util.Properties;
import java.util.Set;

/*
	���α׷��� ���õ� ������ �ڵ����� �̾Ƽ� �����غ���
	
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
