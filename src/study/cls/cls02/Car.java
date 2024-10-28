package study.cls.cls02;

public class Car {
		
	String model;
	String color;
	int price;
	
	//생성자
	Car(){
		System.out.println("Car 생성자 호출됨.");
		color = "노랑";
	}
	
	Car(String _model){
		System.out.println("매개변수 생성자 호출");
		model = _model;
	}
	/*
	 Car(String color){
		System.out.println("매개변수 생성자 호출");
		color = "노랑"
	 */ // 타입으로 인식하기 때문에 타입의 개수나 순서에 따라 오류가 발생할 수 있다.
	
	// 매개변수는 타입만 인식
	Car(String m, String c){
		this.model = m;
		this.color = c;
		}
	

		// 순서 차이
	Car(String color, int price) {
		this.color = color;
	}
		
	
	//Car(String color, int price) {
		//this.color = color;
	

	}