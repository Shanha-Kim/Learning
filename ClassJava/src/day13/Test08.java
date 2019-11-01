package day13;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class Test08 {
/*
	컬렉션(Collection)
		==> 많은양의 데이터를 손쉽게 보관할 수 있는 클래스들의 집합
		배열의 단점을 보완해서 만들어 놓은 것들
		
	종류 (list, set은 상위 클래스가 같고 , map은 다르다)
		1. List
			- 입력 순서를 보장(대신 속도가 느림)
			- 중복데이터 허용
			 
		2. Set	
			- 입력 순서를 저장하지 않음(나름의 규칙을 가지고 정렬한다, 속도가 빠르다)
			- 중복데이터가 입력되면 먼저 데이터를 삭제후 저장한다.
			
		3. Map
			- 데이터 저장은 키, 밸류 쌍으로 이루어진다.
			- 입력순서 보장 x
			- 키값은 중복될수 없다.
		
	참고]
		List 계열과 Set계열은 상위 클래스가 같지만(서로 자료형 변환 가능)
		Map계열은 전혀 다른 상위 클래스를 가지고 있다.
		
	===========================================================================
	list 계열
		1. Vector
			==> 내부적으로 배열 형태를 만들어서 데이터를 보관하는 컬렉션의 한 종류
				장점 - 입력 속도와 검색속도가 빠르다.
				단점 - 중간에 데이터를 삽입하거나, 삭제하는 속도가 느리다.
				결론 - 데이터의 변화가 적은 프로그램에서 많이 사용
				생성방법]
					Vector()
						==> 기본 사이즈가 10으로 설정 되어있다.
							데이터가 추가가 되면 원래사이즈 *2가 된다.
					Vector(collection c)
						==> 다른 컬렉션 데이터를 입력하면 대이터를 복사해서 벡터를 만들어준다.
					Vector(int initialCapacity)
						==> 만들 때 직접 사이즈를 정해서 벡터를 만든다.
							**이 방법을 권장한다.**
					Vector(int initialCapacity, int capacityIncrement)
						==> 사이즈가 증가할떄 *2가 아닌 추가되는 사이즈를 지정한다.
				참고]
					컬렉션의 공간확보규칙]
						현재 사이즈*2
				주요함수]
				1. 입력함수
					add(Object e)
					add(int index, Object e)
					addAll(Collection c) - 맨끝에 덧붙여짐
					addAll(int index, collection c)
					addElement(Object obj) - 벡터 맨끝에 Object로(vector) 데이터 추가
					insertElementAt(Object obj, int index)
					elements()
				2. 출력함수
					get(int index)
					elementAt(int index)
					firstElement()
					lastElement()
					elements()
				3. 수정함수
					set(int index, Object element)
					
				
					
					
	
 */
	
	public Test08() {
		ArrayList arr = new ArrayList();
		Vector vec = new Vector();
		Vector vec2 = new Vector(5, 5);
		vec.add("김민재");
		vec.add("김민주");
		vec.add("박송림");
		for(Object o : vec) {
			System.out.println((String)o);
		}
		//System.out.println(vec.get(0));
		System.out.println(vec.capacity());
		System.out.println(vec2.capacity());
		
		Enumeration en = vec.elements();
	}

	public static void main(String[] args) {
		new Test08();
	}

}
