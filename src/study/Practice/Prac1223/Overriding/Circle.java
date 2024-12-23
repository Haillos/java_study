package study.Practice.Prac1223.Overriding;

public class Circle extends Shape {
	int radius; // 반지름

	public double area() {
		return ((double)radius * radius * Math.PI);
	}
	/* 3. 원의 넓이를 구하도록 area()를 재정의하세요. */
}