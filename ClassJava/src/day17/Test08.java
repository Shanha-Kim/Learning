package day17;
import java.io.*;
/*
	
 */
public class Test08 {
/*
	바이트기반 스트림 준비(받기용)
	문자기반 스트림 준비(내보내기용)
	둘을 연결해줄 스트림 준비
 */
	public Test08() {
		FileInputStream fi = null;
		BufferedReader br = null;
		InputStreamReader ir = null;
		
		try {
			fi = new FileInputStream("src/day17/Ex01.txt");
			ir = new InputStreamReader(fi);
			br = new BufferedReader(ir);
			for(;;) {
				String line = br.readLine();
				if(line==null) break;
				System.out.println(line);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				fi.close();
				ir.close();
				br.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new Test08();
	}

}
