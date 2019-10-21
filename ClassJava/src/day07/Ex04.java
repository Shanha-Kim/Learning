package day07;
/*
	사각형과 삼각형 클래스를 만들고
	
	사각형과 삼각형 을 관리할 배열을 각각 만들어서 
	넓이를 출력하세요.
	
	*** 생성자함수 사용하는 방법 연습하는 문제
*/
public class Ex04 {

	public Ex04() {
		tri_rec[] fig = new tri_rec[3];
		for (int i=0; i<3; i++) {
			fig[i] = new tri_rec(i+1);

			System.out.println((i+1)+"번째 반지름은 "+(i+1) +", 삼각형의 넓이는 "+fig[i].t_area+
					", 사각형의 넓이는 "+fig[i].r_area);
		}
	}

	public static void main(String[] args) {
		new Ex04();
	}

}