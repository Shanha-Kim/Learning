package day02;

public class Test13 {
	public Test13() {
		int[] num = {1,2,3,4,5};
		int[] arr = new int[5];
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		for (int x:arr) {
			System.out.print(x+" ");
		}
	}
	public static void main(String[] args) {
		new Test13();
	}
}
