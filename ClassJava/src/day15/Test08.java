package day15;

import java.io.FileInputStream;
import java.util.Properties;

/*
sample.txt ������ �о ������ ������.
*/

public class Test08 {

	public Test08() {
		Properties prop = new Properties();
		// �ܺ� ���ϰ� ������ �����̴�.
		// �� �� �ڵ��� ���� �ȹ�� IO �� ������ �������� ���� ������ �����̴� �����ּ���...

		FileInputStream fin = null;

		try {
			fin = new FileInputStream("src/day15/result.txt");
			// ��δ� ������ �������� D:\share\git\... ���൵ �ǰ�
			// �츮�� ���� ��Ŭ������ ����ϰ� �ְ�
			// ��Ŭ������ ��θ� ���Ӱ� �����ؼ� ó���ϹǷ�
			// src ������ �����ϴ� ��θ� �����ָ� �ɰ��̴�.

			// ���� �� ������ ������ Properties �� �е��� �Ѵ�.
			prop.load(fin);
			// ���� ������ ������ �о����� Map���� ó���� �Ǿ� �ִ� ���´�.

		} catch (Exception e) {
			System.out.println("Error : " + e);
		}

		// �������ʹ� �Ϲ� Map �� ó�� ���·� ����ϸ� �ȴ�.

		String name = (String) prop.get("name");
		String addr = (String) prop.get("addr");

		System.out.println(name + " - " + addr);
	}

	public static void main(String[] args) {
		new Test08();
	}

}
