package day07;

public class tri_rec {
	
	int line;
	double t_area;
	double r_area;
	
	public tri_rec(int l) {
		this.line = l;
		this.t_area = t_Area(line);
		this.r_area = r_Area(line);
	}


	public double t_Area(int l) {
		return l*l*0.5;
	}
	public double r_Area(int l) {
		return l*l;
	}
}
