package DB;
/*
	이 클래스는 데이터베이스 작접의 필요한 
	드라이버로딩, Connection, Statement, PreparedStatement를 만들어줄 클래스
	
	이 클래스를 인스턴스로 만드는 순간
	드라이버 로딩이 완료되는 클래스로 제작을 하자.
	
 */
import java.sql.*;

public class MyJDBC {
	public Statement stmt = null;
	public PreparedStatement pstmt = null;
	
	public MyJDBC() {
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("## 드라이버 로딩 성공 ##");
		}catch(Exception e) {
			System.out.println("## 드라이버 로딩 실패 ##");
		}
	}
	//Connection 얻어오는 함수
	public Connection getCON() {
		Connection con = null;
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String user = "scott";
		String pw = "tiger";
		try{
			con = DriverManager.getConnection(url, user, pw);
		}catch(Exception e) {
			System.out.println("### 커넥션 얻기 실패 ###");
		}
		return con;
	}
	
	//Statement 얻어내주는 함수
	public Statement getSTMT(Connection con) {
		Statement stmt = null;
		try {
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			/*
				ResultSet Type
					1. TYPE_FORWARD_ONLY : scroll이 불가능한 forward only 형
					2. TYPE_SCROLL_INSENSITIVE : scroll은 가능하나 변경된 사항은 적용안됨.
					3. TYPE_SCROLL_SENSITIVE : scroll도 가능하고, 변경된 사항도 적용됨
					
				Concurrency Type
					1. CONCUR_READ_ONLY : ResultSet Object 를 변경이 불가능
					2. CONCUR_UPDATEBLE : ResultSet Object 를 변경이 가능
			 */
		}catch(Exception e) {
			e.printStackTrace();
		}
		return stmt;
	}
	
	//PreparedStatement 얻어주는 함수
	public PreparedStatement getPSTMT(Connection con, String sql) {
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return pstmt;
	}
	//닫는함수 생성
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

