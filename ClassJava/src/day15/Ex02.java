package day15;
import java.util.*;
/*
	����2 ] 
		�л� 5���� �����͸� ������ ArrayList�����
		�л������͸� Map���� ���� 
		��ȣ, ����, ����, ����, ����
		�Է��ϰ� ����ϼ���
	����3 ] 
		�� ������ Map��� �л� Ŭ������ ���� ó���ϼ���.
 */
public class Ex02 {
	ArrayList<Integer> arr;
	HashMap<Integer, ArrayList> map;
	
	public Ex02() {
		map = new HashMap<Integer, ArrayList>();
		for (int i=1; i<6; i++) {
			map.put(i, setStu());			
		}
		System.out.println(map);
	}

	public static void main(String[] args) {
		new Ex02();
	}
	public ArrayList setStu(){
		arr = new ArrayList<Integer>();
		arr.add((int)(Math.random()*5+1));
		arr.add((int)(Math.random()*101));
		arr.add((int)(Math.random()*101));
		arr.add((int)(Math.random()*101));
		arr.add(arr.get(1)+arr.get(2)+arr.get(3));
		return arr;
	}
}
class MapStu{
	private int no1;
	private int no2;
	private int no3;
	private int no4;
	
	public int getNo1() {
		return no1;
	}
	public void setNo1(int no1) {
		this.no1 = no1;
	}
	public int getNo2() {
		return no2;
	}
	public void setNo2(int no2) {
		this.no2 = no2;
	}
	public int getNo3() {
		return no3;
	}
	public void setNo3(int no3) {
		this.no3 = no3;
	}
	public int getNo4() {
		return no4;
	}
	public void setNo4(int no4) {
		this.no4 = no4;
	}
}
