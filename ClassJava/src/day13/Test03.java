package day13;
import java.text.*;
import java.util.Calendar;
import java.util.Date;
public class Test03 {
	/*
	SimpleDateFormat
		==> ��¥ �����͸� ����ȭ ���Ѽ� ����� �ִ� Ŭ����
			
			��������� ������ DecimalFormat �� ����.
			
			������]
				
				SimpleDateFormat(String pattern)
				
			����Լ�]
				format(Date date)
				
			
			���� ����� ���]
				����			����						����
				------------------------------------------------------
				G		- 		���� ( BC | AD )			AD
				y		-		�⵵						2019
				M		-		��(1 ~ 12 | 1�� ~ 12��)		10 �Ǵ� 10�� �Ǵ� OCT
				w		-		���� ���° ��(1 ~ 53 )		47
				W		-		���� ���° ��(1 ~ 5 )		5
				D		-		���� ���° ��( 1 ~ 366 )	255
				d		- 		���� ���° ��( 1 ~ 31 )	28
				F		-		���� ���° ����(1 ~ 5 )	5
				E		-		����						��
				a		-		����  / ����( AM, PM )		AM
				H		-		�ð�( 0 ~ 23 )				11
				k		-		�ð�(0 ~ 24 )				11
				K		-		�ð�(0 ~ 11 )				11
				h		-		�ð�( 1 ~ 12 )				???
				m		-		��( 0 ~ 59 )				45
				s		-		��( 0 ~ 59 )				32
				S		-		��( õ���� 1�� : 0 ~ 999 )	788
				z		-		Time zone (General Time Zone) 	GMT+11:45
				Z		-		Time zone ( RFC 822 time zone)	+1145
				'		-		escape����(Ư�����ڸ� ǥ���ϴµ� ���)	
 */
	public Test03() {
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		
		SimpleDateFormat form = new SimpleDateFormat("[ G ] yyyy�� MM�� dd�� - MM���� W�� - yyyy ���� w ��");
		SimpleDateFormat form2 = new SimpleDateFormat("yyyy���� DD ��° �� - hh �� mm�� ss�� - SS ��");
		
		System.out.println(form.format(date));
		System.out.println(form2.format(date));
		
	}
	public static void main(String[] args) {
		new Test03();
	}
}
