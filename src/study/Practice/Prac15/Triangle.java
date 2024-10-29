package study.Practice.Prac15;

public class Triangle {
	
	int width;
	int height;
	
	void setSize(int width, int height) {
		this.width = width;
		this.height = height;
	} 
	
	double getArea() {
		return (double)(width * height) / 2;
	}
}
