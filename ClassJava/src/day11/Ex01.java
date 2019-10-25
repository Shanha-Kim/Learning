package day11;

import java.util.Scanner;

/*
	문제1]
		문자열 배열을 만드는데
		배열의 길이는 0~10까지 랜덤하게 만들고
		배열의 길이 만큼 숫자 타입의 문자열을 입력해서 넣어주고
		이것의 합과 평균을 구하는 프로그램을 작성하세요.
		
		발생할 수 있는 예외를 가정해서 모두 처리하세요.
			1. 배열을 벗어나서 사용하는 경우
			2. 숫자로 변환이 불가능한 경우
			3. 평균을 구하는데 0으로 나누어지는 경우
		
 */
public class Ex01 {

	public Ex01() {
		Scanner sc = new Scanner(System.in);
		int n = (int)(Math.random()*4);
		System.out.println("배열의 길이는:"+n);
		int total=0;
		String[] arr = new String[n];
		for (int i=0; i<n+1; i++) {
			try {
				System.out.println("양의 정수를 입력하세요!");
				arr[i]=sc.next();
				total+=Integer.parseInt(arr[i]);				
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("배열의 길이를 초과하였습니다.");
			}catch(Exception e) {
				System.out.println("숫자로 변환이 불가능합니다.");
				break;
			}
		}
		try {
			System.out.println("총합은:"+total+",  평균은:"+Math.round(total/n*10)/10.0);			
		}catch(Exception e) {
			System.out.println("배열의 길이가 0 입니다.");			
			
		}
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
