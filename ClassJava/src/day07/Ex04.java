package day07;
/*
	�簢���� �ﰢ�� Ŭ������ �����
	
	�簢���� �ﰢ�� �� ������ �迭�� ���� ���� 
	���̸� ����ϼ���.
	
	*** �������Լ� ����ϴ� ��� �����ϴ� ����
*/
public class Ex04 {

	public Ex04() {
		tri_rec[] fig = new tri_rec[3];
		for (int i=0; i<3; i++) {
			fig[i] = new tri_rec(i+1);

			System.out.println((i+1)+"��° �������� "+(i+1) +", �ﰢ���� ���̴� "+fig[i].t_area+
					", �簢���� ���̴� "+fig[i].r_area);
		}
	}

	public static void main(String[] args) {
		new Ex04();
	}

}