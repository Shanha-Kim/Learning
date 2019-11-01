package day17;
import java.io.*;
/*
	char 단위 스트림
		==> 한번 입출력할 때 2바이트 단위로(char의 크기 2바이트) 입출력
		주의]
			기계어상태의 내용은 절대로 char단위 입출력 사용불가
			이 스트림은 텍스트문서에만 적용 
			
			2개의 byte가 1개의 char가 될때 순서가 역전된다.
				가    	ㄱ  	  ㅏ
					   0011      0101
					   
					   합쳐지면 거꾸로
					   01010011 이 된다.(이진수를 뒤에서부터 채우는 개념)
	1. FileWriter / FileReader
		==> 파일에 직접연결된 타게스트림(기본스트림)
			단위는 char 단위가 된다.
		
		내부적으로 데이터처리의 단위만 바뀌는 것이므로
		사용자는 별 차이점없이 사용한다.
	
	2. 관련 필터스트림
		1) BufferReader / BufferWriter
			==> 중간에 버퍼기능을 추가해서 스트림의 성능 향상을 위한 보조 스트림
			참고]
				가장 핵심적인 함수
				char단위 기본함수는 문자열을 읽을 수 있는 함수가 없다.
				readLine() ==> 한줄로 문자열을 그대로 읽는다.
				(\r\n을 만나면 읽는것을 멈춘다. 그리고 줄바꿈기호를 삭제한다.
				그래서 원 문의 형식을 유지하려면 \r\n을 강제로 추가해야 한다.)
		2) PrintWriter
			==> PrintStream은 바이트단위 스트림이었고
				그것과 비슷한 기능의 문자단위 보조스트리임이다.
				1. 버퍼의 기능을 가지고있다.
				2. 직접 파일에 연결할 수 있다.
				3. 사용자의 편의를 도모한다.
					(자바의 데이터타입을 그대로 사용한다.)
				4. 다른 byte[]의 스트림과도 연결할 수 있따.
			참고]
				스트림을 연결할 때 주의사항
					1. 반드시 같은 방향끼리만 연결할 수 있다.
						FileInputStream --> BufferedOutputStream : X
						FileInputStream --> BufferedInputStream : O
						
					2. 반드시 같은 크기끼리만 연결가능함
						FileInputStream --> BufferedReader : X
						byte 기반 			문자기반
				참고]
					InputStreamReader / OutputStreamWriter
					==> 크기가 다른 두개의 스트림을 연결할 때 사용하는 보조스트림의 일종
					예]
						FileInputStream -->  **InputStreamReader**  --> BufferedReader
						byte 기반 			 타입변환 보조 				문자기반
					*다만 타겟이 char이고 보조가 byte인 경우 연결되지 않는다.
					타겟이 바이트, 보조가 문자인경우만 연결된다.
			
			***
			객체의 직렬화
				==> 데이터는 자바의 기본형 이외에도 클래스 전체를 데이터로 
					상대방(외부장치)에 입출력 할 수 있다.
					이때 함수는 지외되고 변수의 내용만 입출력이 된다.
					이처럼 클래스가 다른 장치에 전달되는 상태를 직렬화라고 하는데..
					<== 직렬화라 하는 이유는
						클래스에 있는 변수의 내용이 
						순서대로 입출력 된다고 해서 붙여진이름...
		
			아무클래스나 입출력으로 사용할 수 있는것은 아니고 
			입출력에 사용할 수있는 클래스는 반드시 직렬화 가능한 클래스여야 한다.
			직렬화 가능한 클래스는 Serializable 인터페이스를 구현한 클래스이다.
					
			문제점]
				직렬화는 변수의 내용만 입출력되므로
				네트워크환경처럼 서로 떨어진 경우는 
				양쪽에 같은 클래스가 존재하야 한다.
				왜냐면
				 	클래스 구조는 전달이 되지않고
				 	변수 내용만 전달이 되기 때문에
				 	양쪽 모두 클래스 구조를 가지고 있어야 한다.
				이때 양쪽에 있는 클래스는
					클래스이름+패키지이름까지 
				동일해야 한다.
				
			사용하는 보조스트림은
				ObjectInputStream / ObjectOutputStream
				==> 주로 네트워크에서 많이 사용하므로 문자단위는 아니다.
			주의]
				1. ObjectOutputStream으로 넘겨진 데이터는 
				   반드시 ObjectInputStream으로 읽어야 처리가된다.
				2. 보내는 쪽에서 클래스의 내용이 변경이 되면 
				   받는쪽의 클래스 내용도 변경해서 받아야 처리된다.
		-------------------------------------------------------------------
		IO파트에서 학습해야 할것
			1. 필요한 데이터를 파일에 저장할 수 있다.
			2. 파일에 저장된 데이터를 읽어서 사용할 수 있따.
				
					
 */		
public class Test01 {

	public Test01() {
		//1. 타겟스트림을 준비하고
		FileWriter fw =null;
		try {
			//2. 타겟스트림 만들고
			fw = new FileWriter("src/day17/fwTest.txt");
			
//			//1)문자 하나만(2byte) 저장해보자.
//			char ch ='$';
//			fw.write(ch);
			
//			//2)문자열을 문자배열을 이용해 저장해보자
//			//a. 문자열을 만들고
//			String str = "jfla 좋아요, 아주 좋아요 ";
//			//b. 문자배열 만들고
//			char[] buff = str.toCharArray();
//			fw.write(buff);
			
			//3)여러글자를 문자열을 이용해서 저장해보자
			//a.문자열 만들고
			String str = "jfla 좋아요, 아주 좋아요 \r\n";
			str+="스타벅스도 좋아요 ";
			//b. 문자열을 저장하고
			fw.write(str);
			
			System.out.println("###빨래 끝 !");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new Test01();
	}

}
