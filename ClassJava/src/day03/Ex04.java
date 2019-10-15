package day03;
/*
 	문제4]
 		한라산의 높이는 1947m이다 
 		두사람의 외국인이 
 		한사람은 정상에서 2.3m/s 로 내려오고 = 0.46m/0.2s
 		한사람은 밑에서 1.75m/s 로 올라간다. = 0.35m/0.2s
 		두사람은 해발 몇m에서 몇초에 만나는지 출력하세요
 		단 이문제는 반복문으로 해결하세요
 */
public class Ex04 {

	public Ex04() {
		double dis = 0;
		double sec = 0;
		while (dis<1947) {
			sec+=1;
			dis = (4.05)*sec;
		}
		System.out.println("걸린 시간은:"+sec+"  만난 높이는: "+sec*1.75);
	}
	public static void main(String[] args) {
		new Ex04();
	}
}
