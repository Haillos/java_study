package study.Practice;

import java.util.Scanner;

public class Monitor {
	String maker;
	int inch;
	int price;
	String color;
	int resolX;
	int resolY;
	
	Scanner scanner = new Scanner(System.in);
	
	public Monitor(String maker, int inch, int price) {
		this.maker = maker;
		this.inch = inch;
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}


	public void setResolXY(int resolX,int resolY) {
		this.resolX = resolX;
		this.resolY = resolY;
	}

	
	public void powerOn() {
		System.out.println("전원이 켜졌습니다");
	}

	public int priceUp(int tempPrice) {
		this.price = this.price + tempPrice;
		
		return this.price;
	}
	
	public void printInfo() {
		System.out.printf("제조사:%s %d인치 모니터 가격:%d원 색상:%s 해상도:%d * %d \n",
				maker, inch, price, color, resolX, resolY);
	}
}
