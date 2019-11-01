package algorithm;

import java.lang.reflect.Array;
import java.util.Vector;

public class DecimalCheck {

	public DecimalCheck() {
		System.out.println(checkDecimal(10));
	}

	public static void main(String[] args) {
		new DecimalCheck();
	}
	
	public Vector checkDecimal(int n) {
		int[] arr = new int[n+1]; 
		//초기값:0~n까지 n+1개의 수에 모두 0(=true) 설정 
		//(인덱스를 숫자로 바로 이용하기 위해 0부터 생각) 
		int m=(int)Math.sqrt(n)+1;
		//소수판별시 제곱근까지만 확인해도 된다. 
		for (int i=2; i<m; i++) {
			if (arr[i]==0) {
				for (int j=i+i; j<n+1; j+=i) {
					arr[j]=1;
				}
			}
		}
		Vector vec = new Vector();
		for (int i=2; i<n+1; i++) {
			if(arr[i]==0) {
				vec.add(i);
			}
		}
	    return vec; 
	}
}
