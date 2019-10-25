package day12;
/*
	StringBuffer
		==> String 클래스와 동일하게 문자열을 관하는 클래스
		
			String클래스는 데이터변경 불가,
			(내용이 바뀐다는건 
			StringBuffer클래스는 데이터 변경 가능
			
			문자열 수정을 마쳤다면 결국 String 타입으로 변환해서 사용해야한다.
				StringBuffer.toString();
			
			StringBuffer sb = new StringBuffer();
			sb.append(문자열)
			sb.append(문자열)
			sb.append(문자열)
			sb.append(문자열)
			
			String str = sb.toString();
	=================================================================
	참고]
		StringBuilder
			==> 이 클래스 역시 StringBuffer와 동일한 역할을 하는 클래스이다.
				주로 Thread 처리를 할 때 동기화에 안정적으로 처리가 가능
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
