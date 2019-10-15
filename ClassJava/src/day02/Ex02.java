package day02;

import java.util.Scanner;

/*
 * 문제2]
 * 	1년은 365.2426일 이다.
 * 	이것은 몇일 몇시간 몇분 몇초인지 계산하세요.
 */
public class Ex02 {
	public static void main(String[] args) {
		
		double day = 0.2426;
		double hour = Math.floor(day*24);
		double min = Math.floor((day*24)%1*60);
		double sec = Math.floor((day*24*60)%1*60);
		System.out.printf("1년은 365일 하고도 \n "
				+ "%f시간\n"
				+ "%f분\n"
				+ "%f초 입니다.",hour, min, sec);
	}
}