package day03;
/*
 	����4]
 		�Ѷ���� ���̴� 1947m�̴� 
 		�λ���� �ܱ����� 
 		�ѻ���� ���󿡼� 2.3m/s �� �������� = 0.46m/0.2s
 		�ѻ���� �ؿ��� 1.75m/s �� �ö󰣴�. = 0.35m/0.2s
 		�λ���� �ع� ��m���� ���ʿ� �������� ����ϼ���
 		�� �̹����� �ݺ������� �ذ��ϼ���
 */
public class Ex04 {

	public Ex04() {
		double dis = 0;
		double sec = 0;
		while (dis<1947) {
			sec+=1;
			dis = (4.05)*sec;
		}
		System.out.println("�ɸ� �ð���:"+sec+"  ���� ���̴�: "+sec*1.75);
	}
	public static void main(String[] args) {
		new Ex04();
	}
}
