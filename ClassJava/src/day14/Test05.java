package day14;

import java.util.*;

public class Test05 {

	public Test05() {
		ArrayList list = new ArrayList();
		list.add("�ڼ۸�");
		list.add("������");
		list.add("�����");
		list.add("Ȳ����");
		list.add("�ֿ켺");
		
		System.out.println(list);
		/*
		Collections.sort(list);
		System.out.println("���� �� : " + list);
		*/
		
		list.sort(new MySort02());
		System.out.println(list);
		
		
		
	}

	public static void main(String[] args) {
		new Test05();
	}
	
}

class MySort02 implements Comparator {
	
	@Override
	public int compare(Object o1, Object o2) {
		/*
		 	�� < ��
		 	�� < ����
		 */
		
		int result = 0 ;
		String str1 = (String) o1;
		String str2 = (String) o2;
		
		for(int i = 0 ; i < str1.length(); i++ ) {
			char ch1 = str1.charAt(i);
			char ch2 = str2.charAt(i);
			
			/*
			 	��������
			 */
			/*
			if(ch1 < ch2) {
				return 1;
			} else if(ch1 > ch2){
				return -1;
			}
			*/
			
			
			
			/*
			 	��������
			 */
			if(ch1 < ch2) {
				return -1;
			} else if(ch1 > ch2){
				return 1;
			}
		}
		
		
		return result;
	}
}