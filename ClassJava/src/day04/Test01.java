package day04;

import java.util.Arrays;

/*
	복사]
		1. 얕은 복사
			주소만 복사
			
		2. 깊은 복사
			데이터를 복사
			
	객체타입 배열의 특성]
		
 */
public class Test01 {

	public Test01() {
		int[] num1 = {1,2,3,4,5};
		int[] num2 = new int[num1.length];
		System.arraycopy(num1,  0,  num2,  0,  num1.length);
		num1[0] = 10;
		System.out.println(Arrays.toString(num1));
		System.out.println(Arrays.toString(num2));
		
		Object[] obj = new Object[10];
		obj[0]="abcd";
		obj[1]=1;
		obj[2]=3.14f;
		obj[3]=true;
		obj[4]='A';
		float test1 = (int)obj[1]+(float)obj[2];
		/*
		 	object 타입으로 들어가기 때문에 강제 형변환이 필요하다.
		 	세부 동작은 int => integer => object 타입으로 변환되어 배열에 들어간다.
		 	결국 여러가지 타입의 데이터를 넣어도 object 타입 하나로 관리된다.	
		 */
		System.out.println(test1);
	}

	public static void main(String[] args) {
		new Test01();
	}

}
