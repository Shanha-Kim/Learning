package day15;

/*
	Properties 클래스
		==> map 역할을 하는 클래스
			일반 Map과의 차이점은 파일(외부장치)을 이용해서 직접 데이터를 읽어서 Map처럼
			저장할 수 있고
			Map에 저장된 데이터를 직접 파일(외부장치)로 출력해서 저장할 수 있다.
			
		문제점]
			파일의 내용을 읽을때 인코딩이 되지 않는다.
				=> 한글 안됨
			Properties파일에 저장된 데이터에 공백문자도 문자이므로
			키나 벨류에 입력될 경우 일치하는 데이터를 못찾을 수도 있다.
			각행 맨 마지막 문자가 공백이 아닌지 확인 필요
		참고]
			Properties 인코딩 방법
				1. cmd창을 연다
				2. path를 JAVA_HOME으로 잡아준다
				3. native2ascii 을 이용해 인코딩
				native2ascii 현재파일 변경파일
		
 */
public class Test07 {
	public Test07() {
	}

	public static void main(String[] args) {
		new Test07();
	}

}
