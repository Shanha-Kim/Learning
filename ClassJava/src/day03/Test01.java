package day03;

import java.util.Arrays;

/*
 * 랜덤 숫자 발생기
 * 		Math.random()//0<=x<1의  x 반환
 * 
 * 
 * 배열 : 같은 형태의 데이터를 여러개 모아서 한꺼번에 관라하는 시스템
 * 	주의사항]
 * 		만들때 반드시 타입과 길이를 정해야 한다.
 * 		한번 만들어진 배열은 길이를 수정하지 못한다.
 * 	형식]
 * 		데이터타입[] 변수이름 = {data1, data2, ....} 
 * 		데이터타입[] 변수이름 = new 데이터타입[길이]
 * 		데이터타입[] 변수이름 = new 데이터타입[]{data1, data2, ....}
 * 	참고]
 * 		배열의 내용을 확인하는 함수
 * 		Arrays.toString(배열주소);
 */
public class Test01 {

	public Test01() {
		System.out.println(Math.random());
		/***************************************************************************/
		
		int num[] = new int[] {1,2,3,4,5};
		for (int n : num) {
			System.out.println(n);
		}
		System.out.println(Arrays.toString(num));
		/**************************************************************************/
		
		String str1 = "abcd";
		String str2 = new String("abcd");
		String str3 = new String("abcd");
		System.out.println(str1 == str2);
		System.out.println(str3 == str2);
		System.out.println("------------------------------------------------------");
		System.out.println(str1.equals(str2));
		System.out.println(str3.equals(str2));
		//toString()함수는 호출할 때 보고싶은 배열의 주소를 입력
		//자바에서는 메모리의 주소를 직접 접근할 수 없고
		//그 주소를 변수가 기억하도록 하고 있다.
		//따라서 배열의 주소를 기억하고 있는 변수를 입력주면 
	}
	public static void main(String[] args) {
		new Test01();
	}
}
