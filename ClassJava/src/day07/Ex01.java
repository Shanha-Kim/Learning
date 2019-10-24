package day07;
/*
	조건문 활용
	문제1]
		1000~3000년 사이의 년도를 랜덤하게 발생시켜서 
		발생된 년도가 윤년인지 평년인지를 판별
		
		참고]
			4로 나누어 떨어지고
			100으로는 나누어지지 않고
			400으로는 나누어지는 년도
 */
public class Ex01 {

	public Ex01() {
		int y;
		while (true) {
			y = (int)(Math.random()*2001)+1000;

			if (y%400==0) {
				System.out.println(y+"년은 "+"윤년입니다.");
				break;
			}else if(y%100!=0 && y%4==0) {
				System.out.println(y+"년은 "+"윤년입니다.");
				break;
			}else {
				System.out.println(y+"년은 "+"평년입니다.");	
			}
		}
		
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
