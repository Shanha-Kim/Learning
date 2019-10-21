package day07;

public class Test03 {

	public Test03() {
		Circle[] won = new Circle[5];
		for (int i = 0; i < 5; i++) {
			won[i] = new Circle();
			won[i].r = i+1; //반지름입력
			won[i].ro = won[i].getRo(won[i].r);
			won[i].ar = won[i].getAr(won[i].r);
			
		}
		for (int i=0;i<5;i++) {
			System.out.println(
					(i+1)+"번째 원의 반지름: "+won[i].r+
					" 둘레: "+won[i].ro+
					" 넓이: "+won[i].ar);
		}
	}

	public static void main(String[] args) {
		new Test03();
	}
}
