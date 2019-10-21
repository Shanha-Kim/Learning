package day06;
/*
	Flag기법
		- 우리가 프로그램을 실행하다보면 
		  두가지 이상의 경우가 발생하는 순간이 존재한다.
		  그 후에 어떤 경우가 발생했는지 알아보는 기법이다.
		
		예]
			for(;;){
				if(){
					(1)
					break;
				}
				(2)
			}
			(3)
		
			이런경우 (3) 부분이 실행이 될때 반복문이(2) 정상적인 횟수만큼 반복이 되었는지
			아니면 중간에 어떤 조건(1)에 의해서 반복되다 중단했는지 알아보는 기법
			
			
			힌트]
				한글자씩 꺼내서 charAt()
				뽑아낸 문자가 숫자인지 아니면 문자인지를 검사하는 과정을 
				글자 수 만큼 반복한다.
 */
public class Test02 {

	public Test02() {
	}
	public static void main(String[] args) {
		new Test02();
	}
	public void toTest() {
		String str = "123x456";
		
	}
}
