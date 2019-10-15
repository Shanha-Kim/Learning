package day02;
/*
 * 
 */
public class Test14 {
	public Test14() {
		
	}
	void case1() {
		for (int i=1; i<6;i++) {
			for (int j=1;j<6;j++) {
				if (j<i) {
					System.out.print("*");
				}else if(i==j){
					System.out.println("*");
					break;
				}
				
			}
		}
	}
	void case2() {
		for (int i=1; i<6;i++) {
			for (int j=1;j<6;j++) {
				if (j<=5-i) {
					System.out.print(" ");
				}else if(j==5){
					System.out.println("*");
				}else {
					System.out.print("*");
				}
				
			}
		}
	}
	void case3() {
		for (int i=1; i<6;i++) {
			for (int j=1;j<10;j++) {
				if (j<=5-i) {
					System.out.print(" ");
				}else if(j==4+i){
					System.out.println("*");
					break;
				}else {
					System.out.print("*");
				}
			}
		}
		for (int i=1; i<5;i++) {
			for (int j=1;j<10;j++) {
				if (j<=i) {
					System.out.print(" ");
				}else if(j==9-i){
					System.out.println("*");
					break;
				}else {
					System.out.print("*");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new Test14().case3();
	}
}
