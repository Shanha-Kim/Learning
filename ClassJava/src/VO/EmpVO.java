package VO;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
public class EmpVO {
	private int eno;
	private String ename;
	private String job;
	private int mgr;
	private Date hiredate; //jdbc�� ��¥�� �ð��� ������ ó���Ѵ�.
	private Time hireTime;
	private String sDate; //�Ի����� ���ڿ��� ó��
	private int sal;
	private int comm;
	private int dno;
	
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public Time getHireTime() {
		return hireTime;
	}
	public void setHireTime(Time hireTime) {
		this.hireTime = hireTime;
	}
	public String getsDate() {
		return sDate;
	}
	public void setsDate() {
		SimpleDateFormat form1 = new SimpleDateFormat("yyyy.MM.dd");
		SimpleDateFormat form2 = new SimpleDateFormat("HH:mm:ss");		
		this.sDate = form1.format(hiredate)+" "+form2.format(hireTime);
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getComm() {
		return comm;
	}
	public void setComm(int comm) {
		this.comm = comm;
	}
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	public String toString() {
		return "�����ȣ - " + eno +
				"\n����̸� - " + ename + 
				"\n������� - " + job +
				"\n����ȣ - " + mgr+
				"\n�� �� �� - " + sDate+
				"\n��    �� - " + sal+
				"\n�� �� �� - " + comm+
				"\n�μ���ȣ - " + dno+
				"\n--------------------------";
	}
}
