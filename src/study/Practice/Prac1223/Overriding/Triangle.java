package study.Practice.Prac1223.Overriding;

public class Triangle extends Shape {
	int base; // 밑변
	int height; // 높이

	public double area() {
		return ((base * (double)height) / 2);
	}
	/* 2. 삼각형 넓이를 구하도록 area()를 재정의하세요. */
}
