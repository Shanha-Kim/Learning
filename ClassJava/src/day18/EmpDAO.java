package day18;
/*
	 �� Ŭ������ �����ͺ��̽� �۾��� ó���� ����Ŭ����
	 
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
		//�� Ŭ������ ��ü�� �Ǵ¼��� �����ͺ��̽� �۾��� �� �� �ִ� ���°� �Ǿ�� �Ѵ�.
		//�츮�� DB��Ű���� �����س��� MyJDBC�� �ν��Ͻ��� ����� �ξ�� �Ѵ�.
		db = new MyJDBC();
	}
	//������� ������ �Լ�
	public int getTotalCnt() {
		//Ŀ�ؼ� ����
		con = db.getCON();
		//���Ǹ�� ������
		String sql = EmpSQL.getSQL(EmpSQL.TOTAL_CNT);
		//Statement ������
		stmt = db.getSTMT(con);
		//���Ǹ�� �Ǿ ������ ����ް�
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
			System.out.println("��ȸ�� ���ϴ� ����� �̸��� �Է��ϼ���");
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
		//���Ǹ���� ����� �������̹Ƿ�
		//�� ���� �����͸� VO �� ��Ƽ� �ٽ� ����Ʈ�� ��� �Ѱ��ش�.
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
