package DB;
/*
	�� Ŭ������ �����ͺ��̽� ������ �ʿ��� 
	����̹��ε�, Connection, Statement, PreparedStatement�� ������� Ŭ����
	
	�� Ŭ������ �ν��Ͻ��� ����� ����
	����̹� �ε��� �Ϸ�Ǵ� Ŭ������ ������ ����.
	
 */
import java.sql.*;

public class MyJDBC {
	public Statement stmt = null;
	public PreparedStatement pstmt = null;
	
	public MyJDBC() {
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("## ����̹� �ε� ���� ##");
		}catch(Exception e) {
			System.out.println("## ����̹� �ε� ���� ##");
		}
	}
	//Connection ������ �Լ�
	public Connection getCON() {
		Connection con = null;
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String user = "scott";
		String pw = "tiger";
		try{
			con = DriverManager.getConnection(url, user, pw);
		}catch(Exception e) {
			System.out.println("### Ŀ�ؼ� ��� ���� ###");
		}
		return con;
	}
	
	//Statement ���ִ� �Լ�
	public Statement getSTMT(Connection con) {
		Statement stmt = null;
		try {
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			/*
				ResultSet Type
					1. TYPE_FORWARD_ONLY : scroll�� �Ұ����� forward only ��
					2. TYPE_SCROLL_INSENSITIVE : scroll�� �����ϳ� ����� ������ ����ȵ�.
					3. TYPE_SCROLL_SENSITIVE : scroll�� �����ϰ�, ����� ���׵� �����
					
				Concurrency Type
					1. CONCUR_READ_ONLY : ResultSet Object �� ������ �Ұ���
					2. CONCUR_UPDATEBLE : ResultSet Object �� ������ ����
			 */
		}catch(Exception e) {
			e.printStackTrace();
		}
		return stmt;
	}
	
	//PreparedStatement ����ִ� �Լ�
	public PreparedStatement getPSTMT(Connection con, String sql) {
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return pstmt;
	}
	//�ݴ��Լ� ����
	public void close(Object o) {
		try {
			if(o instanceof Connection) {
				((Connection)o).close();
			}else if(o instanceof Statement) {
				((Statement)o).close();
			}else if(o instanceof PreparedStatement) {
				((PreparedStatement)o).close();
			}else if(o instanceof ResultSet) {
				((ResultSet)o).close();
			}
		}catch(Exception e) {
			
		}
	}
	
}

