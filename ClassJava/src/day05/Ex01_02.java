package day05;

public class Ex01_02 {

	public Ex01_02() {
		String[] name= {"±ËπŒ¡÷","±ËπŒ¿Á","π⁄º€∏≤","∞Ì»Ò¿±","±ËªÍ«œ"};
		Object[][] stu = new Object[5][7];
		for (int i=0; i<5; i++) {
			stu[i][0]=name[i];
			int total=0;
			for (int j=1;j<6;j++) {
				int n=(int)(Math.random()*101);
				stu[i][j]=n;
				total+=n;
			}
			stu[i][6]=Math.round(total/5*10)/10.0;
		}
		Object[] temp;
		for (int i=0; i<4; i++) {
			double max=(double)stu[i][6];
			int idx=i;
			for (int j=i+1; j<5;j++) {
				if (max<(double)stu[j][6]) {
					max=(double)stu[j][6];
					idx=j;
				}
			}
			if (idx!=i) {
				temp=stu[i];
				stu[i]=stu[idx];
				stu[idx]=temp;
			}
		}
		for (int i=0; i<5; i++) {
			System.out.print((i+1)+"µÓ, "+stu[i][0]+" : ");
			for(int j=1; j<6; j++) {
				System.out.print(stu[i][j]+" | ");				
			}
			System.out.println(stu[i][6]);
		}
	}

	public static void main(String[] args) {
		new Ex01_02();
	}

}
