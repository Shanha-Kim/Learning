package day05;
import java.util.*;
/*
	5명의 학생의 점수를 관리할 배열을 만드는데 
	배열에는 정수형으로 데이터를 저장할 것이다.
	그런데 각 학생들의 정보는 학생번호,점수(국, 영, 수, 과 , 사)의 점수를
	랜덤하게 만들어서 입력하고 총점을 구해서 입력할 예정이다.
	학생의 이름은 문자열 배열을 별도로 만들어서 저장할 예정이다.
	배열을 만들고 출력하세요
		출력 예]
			홍길동 : 50 | 70 | 80 | 90 | 40 | 총점 
 */
public class Ex01 {

	public Ex01() {
		//내부 배열의 길이 = 점수(5가지), 총점(평균)
		double[][] stuP = new double[5][6];
		String[] stuN = {"김민주","김민재","박송림","고희윤","김산하"};
		double[] rank = new double[5];
		for (int i=0; i<5; i++) {
			int total=0;
			for (int j=0; j<5; j++) {
				int po = (int)(Math.random()*101);
				stuP[i][j] = po;
				total+=po;
			}
			stuP[i][5]=total/5f;
			System.out.print(stuN[i]+" : ");
			for (int j=0; j<5;j++) {
				System.out.print(Math.round(stuP[i][j])+" | ");
			}
			System.out.println(Math.round(stuP[i][5]*10)/10.0);
			rank[i] = stuP[i][5];
		}
		
		Arrays.sort(rank);
		for (int i=4; i>-1; i--) {
			int id;
			for (int j=0; j<5;j++) {
				if (rank[i]==stuP[j][5]) {
					id=j;
					System.out.println(stuN[id]+"은(는) "+(5-i)+"등");
					break;
				}
			}
		}
	}
	public static void main(String[] args) {
		new Ex01();
	}
}
