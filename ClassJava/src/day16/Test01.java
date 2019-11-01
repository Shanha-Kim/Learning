package day16;

import java.io.*;

/*
	Stream(스트림)
		==> 자바는 외부장치와 데이터를 주고받는 방법을 하나의 방법으로 통일시켜놓았다.
			그것이 Stream이다.
			빨대로 생각하는게 이해하기 좋다.
			즉 스트림을 주고받을 외부장치에 꽂기만 하면 나는 빨대를 빨기만 하면 된다.
		참고]
			스트림은 단방향이다.
			하나의 스트림은 한방향 데이터전송만 가능하다.
			
		종류 : 방향성
			1. 프로그램으로 데이터 들어오는 방향
				==> InputStream, Writer
			2. 프로그램에서 데이터가 나가는 방향
				==> OutputStream, Writer
		
		종류 : 데이터의 양
			1. byte(1byte) 단위
				InputStream, OutputStream
				==> 속도가 조금 느리다.
					(기계어 처리가 가능하다)
					
			2. char(2byte)
				Reader, Writer
				==> 속도가 좀더 빠르다.
					(오직 문자열 처리만 가능하다.)
			참고]
				byte가 char로 합쳐지는 순간
				운영체제에 따라서 비트순서가 바뀔 수 있다.
		
		종류 : 상대방의 종류
			1. 타겟스트림(기본스트림)
				==> 외부장치에 직접 연결되는 스트림
				
			2. 필터스트림
				==> 스트림의 성능 향상, 개발의 편의를 위해서 스트림에 연결되는 스트림
			참고]
				기본스트림(타겟스트림)은 반드시 존재해야 하고
				필요에 따라서 보조스트림을 연결해서 사용해야한다.
		------------------------------------------------------------------------------------
		1. InputStream의 기본 함수
			int read()
				==> 오직 한 문자만(1byte)읽어들이는 함수
					반환값 읽은 문자
			
			int read(byte[] b)
				==> 여러 바이트를 읽어들이는 함수
					읽은 결과는 byte[] b가 기억하고
					반환값 읽은 데이터의 갯수(바이트 수)
			
		2. FileInputStream
			==> 파일에 연결되는 입력용 스트림
			
			생성방법]
				FileInputStream(String filename)
				==> 스트림에 연결할 파일의 이름을 이용해서 스트림으 ㄹ연결한다.
		
		3. FileOutputStream
			==> 파일로 연결된 보내는 방향의 스트림
			이 클래스를 이용해서 OutputStream의 기본함수를 배운다.
		 	
			기본함수
				void write(int b)
					==> 한글자만 내보내는 함수
				void write(byte[] b)
					==> 여러글라즐 내보는 함수
				void write(byte[], int off, int len)
					==> 여러글자 중에서 지정한 부분만 내보내는 함수
						int off 내보내기 시작위치
						int len 내보내기 데이터 갯수
		-------------------------------------------------------------
		File 
		==> 이것은 스트림은 아니다.(데이터를 입력, 출력하느 기능은 없다)
			외부장치 중에서 가장 많이 사용하는 외부장치이다.
			* 파일의 정보를 처리하기 위해 만들어진 클래스
		생성방법]
			File(String pathName)
				==> 파일의 경로와 이름을 지정해서 만드는 방법
				참고]
					프로그래밍에서는 폴더도 파일로 간주한다.
				예] 
					File f = new File("D:\\")
					
			File(String parent, String child)
				==> 파일의 경로와 이름을 따로 지정해서 만드는 방법
		
		참고함수]
			1. 정보를 얻어내는 함수
				getName()
				getParent()
				exists()
				length()
				...
			2. 외부작업을 위해서 필요한 함수들...
				==> 데이터 입출력 이외의 파일 ㅇ전체에 대해서 필요한 작업을 할 수 있는 함수들...
				
 */
public class Test01 {

	public Test01() {
		//폴더 하나 생성
		File file = new File("D:\\FileTest");
		boolean bool = file.mkdir();
		System.out.println(bool ? "FileTest폴더 생성이 완료되었습니다." : "폴더생성 실패");
		
		//계층 폴더 생성
		File file2 = new File("D:\\FileTest\\test01\\test02\\test03");
		bool = file2.mkdirs();
		System.out.println(bool ? "FileTest 등등 폴더 생성이 완료되었습니다." : "폴더생성 실패");
		
		//폴더 삭제
		bool = file2.delete();
		System.out.println(bool ? "폴더삭제가 완료되었습니다." : "폴더삭제 실패");
		
		bool = file2.mkdir();
		System.out.println(bool ? "폴더생성이 완료되었습니다." : "폴더생성 실패");
		
		
//		bool = file.delete();
//		System.out.println(bool ? "폴더삭제가 완료되었습니다." : "폴더삭제 실패");
	}

	public static void main(String[] args) {
		new Test01();
	}
}
