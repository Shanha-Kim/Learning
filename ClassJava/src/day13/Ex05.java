package day13;

import java.util.Vector;

public class Ex05 {
	/*
	 * ���͸� ����� �� ���Ϳ� �Ҽ� 10���� �ְ� ����ϼ���.
	 */
	public Ex05() {
		Vector vec = new Vector();
		vec.add(2);
		int n = 3;
		Boolean flag = true;
		while (vec.size() < 10) {
			for (int i = 2; i < n; i++) {
				flag = true;
				if (n % i == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				vec.add(n);
			}
			n += 1;
		}
		System.out.println(vec);
	}

	public static void main(String[] args) {
		new Ex05();
	}

	

}
