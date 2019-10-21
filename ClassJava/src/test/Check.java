package test;

public class Check {
	
	public Check() {
		Test b = new Test();
		System.out.println(b.b);
		System.out.println(Test.a);
	}
	public static void main(String[] args) {
		new Check();
	}
}
