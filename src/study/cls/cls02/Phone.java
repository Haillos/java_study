package study.cls.cls02;

public class Phone {
	
	//필드
	String model; //기본값 X , 무조건 필요 O
	int price;;	  //기본값 : 100
	int battery;  //기본값 : 3000
	//기본 생성자
	Phone() {
		
	}
	

	
	Phone(String model) {
		this(model, 100, 3000);
		this.model = model;
		this.price = price;
		this.battery = battery;
	}
	
	Phone(String model, int price) {
		this(model, price , 3000);
		this.model = model;
		this.price = price;
		this.battery = battery;
	}
	
	Phone(String model, int price, int battery) {
		this.model = model;
		this.price = price;
		this.battery = battery;
	}


}


