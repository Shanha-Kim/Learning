package day13;

import java.text.MessageFormat;

public class Test07 {
/*
	"SELECT 
		name, tel, age
	From 
		friend
	Where
		name = 'ȫ�浿'
	"
			
 */
	public Test07() {
		StringBuffer buff = new StringBuffer();
		buff.append("SELECT");
		buff.append("	name, tel, age");
		buff.append(" From");
		buff.append("	member");
		buff.append(" WHERE");
		buff.append("	name={0}");
		MessageFormat form = new MessageFormat(buff.toString());
		Object[] obj = {"'ȫ�浿'"};
		System.out.println(form.format(obj));
	}

	public static void main(String[] args) {
		new Test07();
	}

}
