package study.Practice.Prac15;

public class Rectangle {

	int width;
	int height;
	
	Rectangle(int width, int height) {
		this.height = height;
		this.width = width;
	}
	
	double getArea() {
		return width * height;
	}
}
