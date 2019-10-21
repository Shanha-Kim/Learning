package day05;
import java.util.*;
/*
	5���� �л��� ������ ������ �迭�� ����µ� 
	�迭���� ���������� �����͸� ������ ���̴�.
	�׷��� �� �л����� ������ �л���ȣ,����(��, ��, ��, �� , ��)�� ������
	�����ϰ� ���� �Է��ϰ� ������ ���ؼ� �Է��� �����̴�.
	�л��� �̸��� ���ڿ� �迭�� ������ ���� ������ �����̴�.
	�迭�� ����� ����ϼ���
		��� ��]
			ȫ�浿 : 50 | 70 | 80 | 90 | 40 | ���� 
 */
public class Ex01 {

	public Ex01() {
		//���� �迭�� ���� = ����(5����), ����(���)
		double[][] stuP = new double[5][6];
		String[] stuN = {"�����","�����","�ڼ۸�","������","�����"};
		double[] rank = new double[5];
		for (int i=0; i<5; i++) {
			int total=0;
			for (int j=0; j<5; j++) {
				int po = (int)(Math.random()*101);
				stuP[i][j] = po;
				total+=po;
			}
			stuP[i][5]=total/5f;
			System.out.print(stuN[i]+" : ");
			for (int j=0; j<5;j++) {
				System.out.print(Math.round(stuP[i][j])+" | ");
			}
			System.out.println(Math.round(stuP[i][5]*10)/10.0);
			rank[i] = stuP[i][5];
		}
		
		Arrays.sort(rank);
		for (int i=4; i>-1; i--) {
			int id;
			for (int j=0; j<5;j++) {
				if (rank[i]==stuP[j][5]) {
					id=j;
					System.out.println(stuN[id]+"��(��) "+(5-i)+"��");
					break;
				}
			}
		}
	}
	public static void main(String[] args) {
		new Ex01();
	}
}
