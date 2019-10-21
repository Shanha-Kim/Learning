package day06;
/*
	가변인수
 */
public class Test01 {

	public Test01() {
		System.out.println("A반 : "+getTotal(10,90,85,75));
		System.out.println("B반 : "+getTotal(100,90));
		
	}
	public static void main(String[] args) {
		new Test01();
	}
	public int getTotal(int ...s) {
		int total = 0;
		for (int i=0; i<s.length; i++) {
			total += s[i];
		}
		return total;
	}
}
