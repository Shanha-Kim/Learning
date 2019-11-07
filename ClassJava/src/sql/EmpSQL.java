package sql;

public class EmpSQL {
	public static final int TOTAL_CNT = 1001;
	public static final int SEL_1500_UPPER = 1002;
	public static final int SEL_ENAME = 1003;
	public static final int SEL_DNO = 1004;
	
	//�ڵ带 �Է��ϸ� �ش��ϴ� �ڵ��� ���Ǹ���� ��ȯ���ִ� �Լ�
	public static String getSQL(int code) {
		StringBuffer buff = new StringBuffer();
		switch(code) {
		case TOTAL_CNT:
			buff.append("SELECT ");
			buff.append("	count(*) cnt ");
			buff.append("FROM ");
			buff.append("	emp");
			break;
		case SEL_1500_UPPER:
			buff.append("SELECT ");
			buff.append("	empno eno, ename, job, mgr, hiredate, sal, comm, deptno dno ");
			buff.append("FROM ");
			buff.append("	emp ");
			buff.append("WHERE ");
			buff.append("	sal >= 1500");
			break;
		case SEL_ENAME:
			buff.append("SELECT ");
			buff.append("	empno eno, ename, job, mgr, hiredate, sal, comm, deptno dno ");
			buff.append("FROM ");
			buff.append("	emp ");
			buff.append("WHERE ");
			buff.append("	ename = ?");
			break;
		case SEL_DNO:
			buff.append("SELECT ");
			buff.append("	empno eno, ename, job, mgr, hiredate, sal, comm, deptno dno ");
			buff.append("FROM ");
			buff.append("	emp ");
			buff.append("WHERE ");
			buff.append("	deptno = ?");
			break;
		}
		return buff.toString();
	}

}
