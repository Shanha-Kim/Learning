package day06;
import java.util.*;
/*
	�����ϰ� ���ڸ� 0~100���� 10 �߻���Ű�� 
	�װ��� �迭�� ��Ƽ� �� ���ڿ� �ش��ϴ� �ƽ�Ű�ڵ尪�� ���ڰ� 
	���ĺ����� �ƴ����� ���ڿ� �Բ� ����ϼ���
 */
public class PreEx01 {

	public PreEx01() {
		int[] arr = new int[19];
		for (int i=0;i<19;i++) {
			if (i%2==0) {
				arr[i] = (int)(Math.random()*101);				
			}else {
				arr[i] = '#';
			}
			if(arr[i]>='A' && arr[i]<='Z') {
				System.out.println((char)arr[i]+" ��(��) �빮�� ���ĺ��� �������ϴ�.");
			}else if(arr[i]>='a') {
				System.out.println((char)arr[i]+" ��(��) �ҹ��� ���ĺ��� �������ϴ�.");
			}else {
				System.out.println((char)arr[i]+" ��(��) ���ĺ��� �ƴմϴ�.");
			}
		}
	}
	public static void main(String[] args) {
		new PreEx01();
	}
}
