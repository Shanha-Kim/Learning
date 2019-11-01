package day17;
import java.io.*;

/*
	문자기반 보조스트림을 사용해서
	Test03.txt 파일을 읽고, 저장해보자
	Test04.txt
	
 */
public class Test04 {
/*
	1. 스트림준비
	2. 스티림만들기
	3. 파일 읽기
	4. 읽은내용 저장하고
	
 */
	public Test04() {
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		StringBuffer buff = new StringBuffer();
		/*
			처리과정
			Test03.txt --> FileReader --> BufferedReader --> char[]
			char[] --> bufferedWriter --> FileWriter
			 
		 */
		try {
			fr = new FileReader("src/day17/Test03.txt");
			br = new BufferedReader(fr);
			
			fw = new FileWriter("src/day17/Text04.txt");
			bw = new BufferedWriter(fw);
			
			for(;;) {
				String str = br.readLine();
				if(str == null) break;
				buff.append(str);
				buff.append("\r\n");
			}
			bw.write(buff.toString());
			System.out.println("저장완료");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				//종료 순서 주의
				fr.close();
				br.close();
				bw.close();
				fw.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new Test04();
	}

}
