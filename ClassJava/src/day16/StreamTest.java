package day16;
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
public class StreamTest {

	public StreamTest() {
		Fin_Ir_Br();
	}

	public static void main(String[] args) {
		new StreamTest();
	}
	//
	public void Fout() {
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("src/day16/fout1.txt");
			String str = "Bootstrap 4 is the newest version of Bootstrap";
			byte[] buff = str.getBytes();
			fout.write(buff);
			System.out.println("--저장완료--");
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fout.close();				
			}catch (Exception e) {
			}
		}
	}
	public void Fin() {
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("src/day16/fout1.txt");
			while(true) {
				// 읽은 데이터 저장할 배열 준비
				byte[] buff = new byte[1024];
				int len = fin.read(buff);
				if(len == -1) {
					// 이 경우는 읽은 데이터가 없는 경우이므로 반복문을 종료해준다.
					break;
				}
				System.out.println(Arrays.toString(buff));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fin.close();
			}catch (Exception e) {
			}
		}
	}
	public void Fin_Ir_Br() {
		FileInputStream fin = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		try {
			fin = new FileInputStream("src/day16/poem.txt");
			ir = new InputStreamReader(fin);
			br = new BufferedReader(ir);
			
			while(true) {
				// 읽은 데이터 저장할 배열 준비
				String str = br.readLine();
				if(str==null) break;
				System.out.println(str);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fin.close();
			}catch (Exception e) {
			}
		}
	}
	public void Fw() {
		FileWriter fw = null;
		FileWriter fw2 = null;
		try {
			fw = new FileWriter("src/day16/fw1.txt");
			fw2 = new FileWriter("src/day16/fw2.txt");
			char ch = '끝';
			fw.write(ch);
			String str = "안녕하세요 fw입니다.";
			fw2.write(str);
			System.out.println("--저장완료--");
		}catch (Exception e) {
		}finally {
			try {
				fw.close();
				fw2.close();
			}catch (Exception e) {
			}
		}
	}
	public void Fr() {
		FileReader fr = null;
		StringBuffer str = null;
		char[] buff = null;
		try {
			fr = new FileReader("src/day16/poem.txt");
			str = new StringBuffer();
			while(true) {
				buff = new char[32];
				if(fr.read(buff) == -1) {
					break;
				}
				str.append(new String(buff));
			}
			System.out.println(str.toString());
			System.out.println("======위는 char[] 형태======");
			
		}catch (Exception e) {
		}finally {
			try {
				fr.close();
			}catch (Exception e) {
			}
		}
		
	}
	public void Fr_Br_Bw_Fw() {
		FileReader fr = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		FileWriter fw = null;
		StringBuffer buff = null;
		try {
			fr = new FileReader("src/day16/poem.txt");
			br = new BufferedReader(fr);
			fw = new FileWriter("src/day16/poem2.txt");
			bw = new BufferedWriter(fw);
			buff = new StringBuffer();
			//new 순서와 로직상 사용순서 차이 주의
			while(true) {
				String str = br.readLine();
				if(str == null) break;
				buff.append(str);
				buff.append("\r\n");
			}
			
			bw.write(buff.toString());
			System.out.println("*****작성완료******");
			
		}catch (Exception e) {
		}finally {
			try {
				fr.close();
				br.close();
				bw.close();
				fw.close();
			} catch (Exception e2) {
			}
		}
		
	}
	public void Ps() {
		PrintStream ps = null;
		// 직접 파일에 연결된 스트림을 만드는 보조스트림...
		
		try {
			// 스트림을 만들고
			ps = new PrintStream("src/day16/poem.txt");
			
			ps.println("*** 서시 ***");
			ps.println("\t\t\t윤동주");
			ps.println();
			ps.println("죽는 날까지 하늘을 우르러");
			ps.println("한점 부끄럼이 없기를,");
			ps.println("잎새에 이는 바람에도");
			ps.println("나는 괴로워했다.");
			ps.println("별을 노래하는 마음으로");
			ps.println("모든 죽어가는것을 사랑해야지");
			ps.println("그리고 나한테 주어진 길을");
			ps.println("걸어가야겠다.");
			ps.println();
			ps.println("오늘밤에도 별이 바람에 스치운다.");
			
			ps.flush();
			// 내부적으로 BufferStream의 기능을 가지고 있으므로
			// 반드시 내보내기가 끝나면 버퍼를 비워야 한다.
			System.out.println("***** 저장 완료 *****");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch(Exception e) {}
		}
	}
	
}
