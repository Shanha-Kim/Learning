package day18;
import java.util.*;
import VO.*;
/*
	이클래스는 emp테이블의 내용의 조회를 구분해서 처리요청을 받는 클래스
	main 클래스 
	
	내용
		1. 전체 사원수 조회
		2. 사원 이름으로 사원정보조회
		3. 부서번호를 입력받아 부서원의 정보를 조회
		보너스
		4. 급여가 1500이상인 사원의 정보를 조회
		
 */
public class Test02 {

	public Test02() {
		EmpDAO dao = new EmpDAO();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("총 사원수 조회 : 1"
					+ "\n이름으로 사원정보 조회 : 2"
					+ "\n급여가 1500이상인 사원정보 조회 : 3"
					+ "\n각 부서의 사원정보 조회 : 4"
					+ "\n종료 : 9");
			int no = sc.nextInt();
			if(no==9)break;
			switch(no) {
			case 1:
				int cnt = dao.getTotalCnt();
				System.out.println("총 사원 수는 : "+cnt);
				System.out.println("");
				break;
			case 2:
				EmpVO vo1 = dao.getEmpInfo();
				System.out.println(vo1);
				System.out.println("");
				break;
			case 3:
				ArrayList<EmpVO> lst3 = dao.get1500Upper();
				for (EmpVO vo3 : lst3) {
					System.out.println(vo3);
				}
				System.out.println("");
				break;
			case 4:
				System.out.println("조회를 원하는 부서의 번호를 입력하세요");
				int dno = sc.nextInt();
				ArrayList<EmpVO> lst4 = dao.getDno(dno);
				for (EmpVO vo4 : lst4) {
					System.out.println(vo4);
				}
				System.out.println("");
				break;
			}
		}
	}

	public static void main(String[] args) {
		new Test02();
	}
}
