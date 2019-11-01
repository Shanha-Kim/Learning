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
		//�ʱⰪ:0~n���� n+1���� ���� ��� 0(=true) ���� 
		//(�ε����� ���ڷ� �ٷ� �̿��ϱ� ���� 0���� ����) 
		int m=(int)Math.sqrt(n)+1;
		//�Ҽ��Ǻ��� �����ٱ����� Ȯ���ص� �ȴ�. 
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
