package day07;
/*
	
 */
public class Test04 {
	//Ŭ�����̸� ���� = new Ŭ�����̸�(����);
	public Test04() {
		Circle2[] won = new Circle2[3];
		
		for (int i=0; i<3; i++) {
			won[i] = new Circle2(i+1);
			
			System.out.println(won[i].ro);
		}
		
	}

	public static void main(String[] args) {
		new Test04();
	}

}
