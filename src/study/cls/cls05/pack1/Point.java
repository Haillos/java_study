package study.cls.cls05.pack1;

public class Point {

	int math;
	int eng;
	int com;
	

	public void setMath(int math) {
		this.math = math;
	}
	
	public int getMath() {
		return math;
	}
	
	public void setCom(int com) {
		if(com>100) {
			this.com = 100;
		} else if(com < 0) {
			this.com = 0;
		} else {
			this.com = com;
		}
	}
	
	public int getCom() {
		return this.com;
	}
	
	public Point getPoint() {
		return new Point();
	}
}
