package day18;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//JDBC ����� ���� Ŭ������ �غ��� ��Ű��
public class Test01 {

	public Test01() {
		/*
		 	1.JDBC�� �ܺε����ͺ��̽��� ������ ����̹���
		 	  ���α׷����� ������ �;� �Ѵ�.
		 	  
		 	  �ܺ� ���������� �ε��ϴ� �Լ�
		 	  	Class.foName()
		 	  ����̹����� �ܺ�Ŭ�����̸��� ���ݾ� �ٸ���
		 */
		Connection con = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null; //���� ����� ��� ���� Ŭ����
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//Ojdbc6 �ȿ� �ִ� ����̹�.
			//����̹��� �ε��� �Ǹ� �� ���� �����ϰ�
			//�����ͺ��̽��� ������ �� �ִ� ���°� �ȴ�.
			System.out.println("����̹� �ε� ����");
			/*
				2. ����Ŭ�� ���� �õ�
				   ������ �����ͺ��̽����� �����ϴ� ���(URL)�� ���ݾ� �ٸ���.
				   ����Ŭ�� ���� ������ ���ó�� �ϸ� �� ���̰�
				   �ٸ� DBMS�� ���� �˻��� �ؼ� ã���� �� ���̴�.
				   
				   �����ϴ� ��ɾ�� JDBC���� �Ѵ�.
				   	DriverManager.getConnection();
			 */
			//���ӿ� �ʿ��� �͵��� ������ �����.
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "scott";
			String password = "tiger";
			
			//�������� ������ ������ �Ѵ�
			con = DriverManager.getConnection(url, user, password);
			//getConnection�� DriverManager Ŭ������ ����ƽ �޼ҵ��̴�.
			//Connection �������̽� Ÿ������ ��ȯ�Ѵ�.
			System.out.println("***���Ӽ���***");
			//-------------------------------------------------------------
			
			/*
				������ �ϸ� �����ڸ� �����ϴ� ������ JDBC���� �����Ѵ�.
				�� ������ �����ϴ� �������̽��� �ٷ� Connection �̴�. 
				
				�������� ������ ������� JDBC���� ����� ������ 
				JDBC�� �˾Ƽ� �ش� JDBC���� ����� ������ �ϰ� �ȴ�.
				
				1. Statement
					==> ���Ǹ���� �ϼ��� �� ��� ����ϴ� Ŭ����
				2. PreparedStatement
					==> ���Ǹ�� ���Ŀ� �����͸� �߰��ϰų� �����ؼ� �ϼ��ؾ� �ϴ� ���
			 */
			// emp���̺��� ������� ��ȸ�ϴ� ���Ǹ���� ������ ����� Ȯ��
			String sql = "SELECT ename	FROM emp"; // cnt�� count(*)�� ��Ī�̴�.
			//���̽㿡�� import �� as *���� �̸� ���ϵ�
			// Statement ����
			stmt = con.createStatement();
			//���Ǹ���� �Ǿ ������ ����� �޴´�.(������� �ޱ�� ���ÿ� �̷����)
			rs=stmt.executeQuery(sql);
			//System.out.println(rs.g);
			while(rs.next()) {
				System.out.println(rs.getString(1));
			}
			
//			// BOF(begin of file, �÷��̸�), EOF ������ �������κ��� db�����̴�.
//			String cnt = rs.getString(1);//jdbc�� �ε����� 1���� ������
//			
////			int cnt = rs.getInt("count(*)");
//			System.out.println("�� ����� : "+cnt);
//			
//			rs = null;
//			sql = "SELECT count(*) cnt FROM emp WHERE deptno = ?";
//			//?�� ä���� ���Ǹ���� �ϼ��� �� �ִ�.
//			
//			pstmt = con.prepareStatement(sql);
//			pstmt.setInt(1,  20);//���Ǹ�� �ϼ�
//			rs = pstmt.executeQuery();
//			
//			rs.next();
////			cnt=rs.getInt("cnt");
////			System.out.println("20�� �μ��� ��� �� : " +cnt);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			}catch(Exception e) {
				System.out.println("���� ����");
			}
		}
		System.out.println("���α׷� ����");
	}

	public static void main(String[] args) {
		new Test01();
	}

}
