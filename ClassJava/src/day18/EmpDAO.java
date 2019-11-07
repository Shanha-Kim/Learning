package day18;
/*
	 이 클래스는 데이터베이스 작업을 처리할 전담클래스
	 
 */

import java.util.*;
import java.text.*;
import java.sql.*;
import DB.*;
import sql.*;
import VO.*;

public class EmpDAO {
	MyJDBC db = null;
	Connection con = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public EmpDAO() {
		//이 클래스는 객체가 되는순간 데이터베이스 작업을 할 수 있는 상태가 되어야 한다.
		//우리가 DB패키지에 제작해놓은 MyJDBC를 인스턴스로 만들어 두어야 한다.
		db = new MyJDBC();
	}
	//사원수를 얻어오는 함수
	public int getTotalCnt() {
		//커넥션 연결
		con = db.getCON();
		//질의명령 가져옴
		String sql = EmpSQL.getSQL(EmpSQL.TOTAL_CNT);
		//Statement 얻어오고
		stmt = db.getSTMT(con);
		//질의명령 실어서 보내고 결과받고
		int cnt = 0;
		try{
			rs = stmt.executeQuery(sql);
			rs.next();
			cnt = rs.getInt("cnt");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			db.close(rs);
			db.close(stmt);
			db.close(con);
		}
		return cnt;
	}
	
	public EmpVO getEmpInfo() {
		con = db.getCON();
		String sql = EmpSQL.getSQL(EmpSQL.SEL_ENAME);
		pstmt = db.getPSTMT(con, sql);
		Scanner sc = new Scanner(System.in);
		EmpVO vo = null;
		try {
			vo = new EmpVO();
			System.out.println("조회를 원하는 사원의 이름을 입력하세요");
			pstmt.setString(1, sc.next());
			rs = pstmt.executeQuery();
			rs.next();
			vo.setEno(rs.getInt("eno"));
			vo.setEname(rs.getString("ename"));
			vo.setJob(rs.getString("job"));
			vo.setMgr(rs.getInt("mgr"));
			
			vo.setHiredate(rs.getDate("hiredate"));
			vo.setHireTime(rs.getTime("hiredate"));
			vo.setsDate();
			
			vo.setSal(rs.getInt("sal"));
			vo.setComm(rs.getInt("comm"));
			vo.setDno(rs.getInt("dno"));
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}
		return vo;
	}
	
	public ArrayList<EmpVO> get1500Upper() {
		//질의명령의 결과가 여러줄이므로
		//각 줄의 데이터를 VO 에 담아서 다시 리스트에 담아 넘겨준다.
		ArrayList<EmpVO> lst = new ArrayList<EmpVO>();
		con = db.getCON();
		
		String sql = EmpSQL.getSQL(EmpSQL.SEL_1500_UPPER);
		stmt = db.getSTMT(con);
		try {
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				EmpVO vo = new EmpVO();
				vo.setEno(rs.getInt("eno"));
				vo.setEname(rs.getString("ename"));
				vo.setJob(rs.getString("job"));
				vo.setMgr(rs.getInt("mgr"));
				
				vo.setHiredate(rs.getDate("hiredate"));
				vo.setHireTime(rs.getTime("hiredate"));
				vo.setsDate();
				
				vo.setSal(rs.getInt("sal"));
				vo.setComm(rs.getInt("comm"));
				vo.setDno(rs.getInt("dno"));
				lst.add(vo);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			db.close(rs);
			db.close(stmt);
			db.close(con);
		}
		return lst;
	}
	public ArrayList<EmpVO> getDno(int dno1){
		ArrayList<EmpVO> lst = new ArrayList<EmpVO>();
		con = db.getCON();
		String sql = EmpSQL.getSQL(EmpSQL.SEL_DNO);
		pstmt = db.getPSTMT(con, sql);
		try {
			pstmt.setInt(1, dno1);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				EmpVO vo = new EmpVO();
				vo.setEno(rs.getInt("eno"));
				vo.setEname(rs.getString("ename"));
				vo.setJob(rs.getString("job"));
				vo.setMgr(rs.getInt("mgr"));
				
				vo.setHiredate(rs.getDate("hiredate"));
				vo.setHireTime(rs.getTime("hiredate"));
				vo.setsDate();
				
				vo.setSal(rs.getInt("sal"));
				vo.setComm(rs.getInt("comm"));
				vo.setDno(rs.getInt("dno"));
				lst.add(vo);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}
		return lst;
	}

}
