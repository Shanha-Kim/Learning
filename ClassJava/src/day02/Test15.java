package day02;

public class Test15 {
	static int[] arr = new int[26];
	public Test15() {
		for (int i=1;i<26;i++) {
			arr[i]=i;
		}
	}
	
	void case1() {
		int i=0;
		while(i<25) {
			i+=1;
			if (i==5) {
				System.out.println(" "+i);
			}else if (i%5==0) {
				System.out.println(i);
			}else{
				if (i<10) {
					System.out.print(" "+i+" ");
				}else {
					System.out.print(i+" ");
				}
			}
		}
	}
	void case2() {
		int i=0;
		while(i<25) {
			i+=1;
			if (i%5==0) {
				System.out.println(20+i%5);
			}else if(i<5) {
				System.out.print(i*5-4+" ");
			}else if(i<10) {
				System.out.print((i%5)*5-3+" ");
			}else if(i<15) {
				System.out.print((i%5)*5-2+" ");
			}else if(i<20) {
				System.out.print((i%5)*5-1+" ");
			}else if(i<25) {
				System.out.print((i%5)*5+" ");
			}
		}
	}
	void case3() {
		int i=0;
		int num=1;
		while(i<5) {
			i+=1;
			int j=1;
			while(j<=i) {
				if (num<10) {
					System.out.print(" "+num+" ");
				}else {
					System.out.print(num+" ");
				}
				
				num+=1;
				j+=1;
			}
			System.out.print("\n");
		}
	}
	public static void main(String[] args) {
		new Test15().case3();
	}
}
