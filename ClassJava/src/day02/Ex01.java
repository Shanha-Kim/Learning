package day02;

import java.util.Scanner;

/*
 * 문제1]
 * 	54320원 우리나라 화폐별로 몇장이 필요한지 계산
 */
public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력하세요: ");
		int gold = sc.nextInt();
		System.out.printf("입력하신 금액은 \n" +
							"오만원짜리 : "+gold/50000+"장\n"+ 
							"만원짜리 : "+gold/10000%5+"장\n"+
							"오천원짜리 : "+gold/5000%2+"장\n"+
							"천원짜리 : "+gold/1000%5+"장\n"+
							"오백원짜리 : "+gold/500%2+"장\n"+
							"백원짜리 : "+gold/100%5+"개\n"+
							"오십원짜리 : "+gold/50%2+"개\n"+
							"십원짜리 : "+gold/10%5+"개\n"+
							"일원짜리 : "+gold/1%10+"개\n"
				);
	}

}
