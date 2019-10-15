package day03;
import java.util.*;
/*
 * 문제2]
 * 	한페이지에 7개의 글을 보여줄 수 있는 게시판이 있다. 스캐너로 임의의 숫자를 입력받아서
 * 	이 게시판에 몇개의 페이지가 필요한지 계산해서 출력되게 하세요
 */
public class Ex02 {

	public Ex02() {
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("게시판의 글 개수를 입력하세요: ");
		int num = sc.nextInt();
		int ans=0;
		ans+=num/7;
		if (num%7>0) {
			ans+=1;
		}
		System.out.println("필요한 게시판 페이지 수는 "+ans+"개 입니다." );
	}

}
