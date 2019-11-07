package day18;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//JDBC 사용을 위한 클래스를 준비한 패키지
public class Test01 {

	public Test01() {
		/*
		 	1.JDBC와 외부데이터베이스를 연결할 드라이버를
		 	  프로그램에서 가지고 와야 한다.
		 	  
		 	  외부 ㅋㄹ래스를 로딩하는 함수
		 	  	Class.foName()
		 	  드라이버마다 외부클래스이름이 조금씩 다르다
		 */
		Connection con = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null; //질의 결과를 담아 놓는 클래스
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//Ojdbc6 안에 있는 드라이버.
			//드라이버가 로딩이 되면 이 줄을 실행하고
			//데이터베이스에 접속할 수 있는 상태가 된다.
			System.out.println("드라이버 로딩 성공");
			/*
				2. 오라클에 접속 시도
				   각각의 데이터베이스마다 접속하는 방법(URL)이 조금씩 다르다.
				   오라클의 경우는 지금의 방법처럼 하면 될 것이고
				   다른 DBMS의 경우는 검색을 해서 찾으면 될 것이다.
				   
				   접속하는 명령어는 JDBC에게 한다.
				   	DriverManager.getConnection();
			 */
			//접속에 필요한 것들을 변수로 만든다.
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "scott";
			String password = "tiger";
			
			//만들어놓은 정보로 접속을 한다
			con = DriverManager.getConnection(url, user, password);
			//getConnection은 DriverManager 클래스의 스태틱 메소드이다.
			//Connection 인터페이스 타입으로 반환한다.
			System.out.println("***접속성공***");
			//-------------------------------------------------------------
			
			/*
				접속을 하면 접속자를 관리하는 세션을 JDBC에서 제공한다.
				이 세션을 관리하는 인터페이스가 바로 Connection 이다. 
				
				이제부터 동일한 방식으로 JDBC에게 명령을 내리면 
				JDBC가 알아서 해당 JDBC에세 명령을 전달을 하게 된다.
				
				1. Statement
					==> 질의명령이 완성이 된 경우 사용하는 클래스
				2. PreparedStatement
					==> 질의명령 이후에 데이터를 추가하거나 수정해서 완성해야 하는 경우
			 */
			// emp테이블의 사원수를 조회하는 질의명령을 보내고 결과를 확인
			String sql = "SELECT ename	FROM emp"; // cnt는 count(*)의 별칭이다.
			//파이썬에서 import 후 as *으로 이름 정하듯
			// Statement 생성
			stmt = con.createStatement();
			//질의명령을 실어서 보내고 결과를 받는다.(보내기와 받기는 동시에 이루어짐)
			rs=stmt.executeQuery(sql);
			//System.out.println(rs.g);
			while(rs.next()) {
				System.out.println(rs.getString(1));
			}
			
//			// BOF(begin of file, 컬럼이름), EOF 때문에 다음라인부터 db정보이다.
//			String cnt = rs.getString(1);//jdbc는 인덱스가 1부터 시작함
//			
////			int cnt = rs.getInt("count(*)");
//			System.out.println("총 사원수 : "+cnt);
//			
//			rs = null;
//			sql = "SELECT count(*) cnt FROM emp WHERE deptno = ?";
//			//?을 채워서 질의명령을 완성할 수 있다.
//			
//			pstmt = con.prepareStatement(sql);
//			pstmt.setInt(1,  20);//질의명령 완성
//			rs = pstmt.executeQuery();
//			
//			rs.next();
////			cnt=rs.getInt("cnt");
////			System.out.println("20번 부서의 사원 수 : " +cnt);
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
				System.out.println("종료 에러");
			}
		}
		System.out.println("프로그램 종료");
	}

	public static void main(String[] args) {
		new Test01();
	}

}
