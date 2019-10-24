package extra;

/*
	�� Ŭ����ó�� 
	�����͸� �����ϰ� 
	�� ����� �����͸� �������� �������� ���� Ŭ������
		
		VO(Value Object) Ŭ����
		DTO(Data Transfer Object) Ŭ����
 */
public class Score {
	private int kor;
	private int eng;
	private int math;
	private int sci;
	private int prog;
	private int total;
	private double avg;
	
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSci() {
		return sci;
	}
	public void setSci(int sci) {
		this.sci = sci;
	}
	public int getProg() {
		return prog;
	}
	public void setProg(int prog) {
		this.prog = prog;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal() {
		this.total = kor + eng + math + sci + prog;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg() {
		this.avg = total / 5.;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	/*
	// ������ �����͸� �Է��ϴ� ����� ���� �Լ�
	public void setKor(int kor) {
		this.kor = kor;
	}
	// ������ �����͸� �о���� ����� ���� �Լ�
	public int getKor() {
		return this.kor;
	}
	*/
	
}
