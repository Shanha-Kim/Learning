package day12;
/*
	StringBuffer
		==> String Ŭ������ �����ϰ� ���ڿ��� ���ϴ� Ŭ����
		
			StringŬ������ �����ͺ��� �Ұ�,
			(������ �ٲ�ٴ°� 
			StringBufferŬ������ ������ ���� ����
			
			���ڿ� ������ ���ƴٸ� �ᱹ String Ÿ������ ��ȯ�ؼ� ����ؾ��Ѵ�.
				StringBuffer.toString();
			
			StringBuffer sb = new StringBuffer();
			sb.append(���ڿ�)
			sb.append(���ڿ�)
			sb.append(���ڿ�)
			sb.append(���ڿ�)
			
			String str = sb.toString();
	=================================================================
	����]
		StringBuilder
			==> �� Ŭ���� ���� StringBuffer�� ������ ������ �ϴ� Ŭ�����̴�.
				�ַ� Thread ó���� �� �� ����ȭ�� ���������� ó���� ����
 */
public class Test02 {
	public static final int SEL_ID = 1001;

	public Test02() {
		String sql = getSQL(Test02.SEL_ID);
		sql = sql.replace("###", "'jfla'");
		System.out.println(sql);
	} 
	public static void main(String[] args) {
		new Test02();
	}
	public String getSQL(int code) {
		String sql = "";
		StringBuffer buff = new StringBuffer();
		
		switch(code) {
		case 1001:
			buff.append("SELECT ");
			buff.append("	mno, mid, mpw, mname, maddr, mtel ");
			buff.append("FROM ");
			buff.append("	member ");
			buff.append("WHERE ");
			buff.append("	mid = ### ");
			break;
		case 1002:
			//buff.append(b);
			break;
		case 1003:
			//buff.append(b);
			break;
		}
		return buff.toString();
	}
}
