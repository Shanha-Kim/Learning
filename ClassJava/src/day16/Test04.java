package day16;
import java.io.*;
import java.util.*;
/*
	키보드를 이용해서 문자를 입력받아보자
 */
public class Test04 {
/*
	참고]
		키보드 역시 외부 장치이다.
		자주 사용하는 외부 장치이기 때문에
		이미 스트림을 준비한 변수가 존재한다.
		==>
			System.in
 */
	public Test04() {
//		System.out.println("한글자를 입력하세요.");
//		int ch = 0;
//		try {
//			/*
//			 	입력된 문자는 이미 System.in에 저장이 되어있고
//			 	타입은 InputStream 이다. 따라서 읽어서 저장만 하면 된다.
//			 */
//			ch = System.in.read();
//			//출력한다.
//			System.out.println("당신이 입력한 문자 : "+ (char)ch);
//			System.out.println("당신이 입력한 코드값 : "+ ch);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
		byte[] buff = new byte[256];
		Arrays.fill(buff,(byte)'$');
		String str = new String(buff);
		str= str.replace("\n","$");
		System.out.println(str);
		System.out.println(str.length());
		System.out.println(Arrays.toString(buff));
		
	}

	public static void main(String[] args) {
		new Test04();
	}

}
