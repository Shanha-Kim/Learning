package day18;
import java.util.*;
import VO.*;
/*
	��Ŭ������ emp���̺��� ������ ��ȸ�� �����ؼ� ó����û�� �޴� Ŭ����
	main Ŭ���� 
	
	����
		1. ��ü ����� ��ȸ
		2. ��� �̸����� ���������ȸ
		3. �μ���ȣ�� �Է¹޾� �μ����� ������ ��ȸ
		���ʽ�
		4. �޿��� 1500�̻��� ����� ������ ��ȸ
		
 */
public class Test02 {

	public Test02() {
		EmpDAO dao = new EmpDAO();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("�� ����� ��ȸ : 1"
					+ "\n�̸����� ������� ��ȸ : 2"
					+ "\n�޿��� 1500�̻��� ������� ��ȸ : 3"
					+ "\n�� �μ��� ������� ��ȸ : 4"
					+ "\n���� : 9");
			int no = sc.nextInt();
			if(no==9)break;
			switch(no) {
			case 1:
				int cnt = dao.getTotalCnt();
				System.out.println("�� ��� ���� : "+cnt);
				System.out.println("");
				break;
			case 2:
				EmpVO vo1 = dao.getEmpInfo();
				System.out.println(vo1);
				System.out.println("");
				break;
			case 3:
				ArrayList<EmpVO> lst3 = dao.get1500Upper();
				for (EmpVO vo3 : lst3) {
					System.out.println(vo3);
				}
				System.out.println("");
				break;
			case 4:
				System.out.println("��ȸ�� ���ϴ� �μ��� ��ȣ�� �Է��ϼ���");
				int dno = sc.nextInt();
				ArrayList<EmpVO> lst4 = dao.getDno(dno);
				for (EmpVO vo4 : lst4) {
					System.out.println(vo4);
				}
				System.out.println("");
				break;
			}
		}
	}

	public static void main(String[] args) {
		new Test02();
	}
}
