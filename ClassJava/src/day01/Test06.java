package day01;
import java.util.*;
//이미 누군가 만들어놓은 클래스의 기능을 사용하고 싶은 경우
//해당  클래스를 가져오는 명령
//형식] import 패키지경로.클래스이름; 또는 import 패키지경로.*;

/*
 * 문제]
 * 		가로와 세로의 길이(정수)를 입력받아서 사각형의 넓이를 계산해서 출력해주는 프로그램을 작성하세요.
 * 		방법]
 * 			
 */
public class Test06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("가로를 입력하세요 : ");
		int width = sc.nextInt();
		System.out.println("세로를 입력하세요 : ");
		int height = sc.nextInt();
		System.out.println("입력한 가로와 세로를 가지는 사각형의 넓이는 : "+ width*height+"입니다.");
		
	}
}
