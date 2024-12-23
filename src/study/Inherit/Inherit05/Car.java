package study.Inherit.Inherit05;

import java.util.ArrayList;
import java.util.List;

import study.Inherit.Inherit04.v3.Cleaner;
import study.Inherit.Inherit04.v3.DustCleaner;

public class Car  {
	// 필드
	public static final int FRONT_LEFT_TIRE = 0; // 연습문제 5번
	public static final int FRONT_RIGHT_TIRE = 1;
	public static final int BACK_LEFT_TIRE = 2;
	public static final int BACK_RIGHT_TIRE = 3;
	
	Tire frontLeftTire = new NexenTire("앞왼쪽", 6);
	Tire frontRightTire = new KumhoTire("앞오른쪽", 2);
	Tire backLeftTire = new HankookTire("뒤왼쪽", 3);
	Tire backRightTire = new KumhoTire("뒤오른쪽", 4);
	
	Tire[] tireArr; // 연습문제 4번 방법 1
	List<Tire> tireList;  // 연습문제 4번 방법 2
	// 생성자 연습문제 3번
public Car (Tire frontLeftTire, Tire frontRightTire, Tire backLeftTire, Tire backRightTire) 
	{
	tireArr = new Tire[4];	// 연습문제 4번 방법 1
	
	tireArr[FRONT_LEFT_TIRE] = frontLeftTire;
	tireArr[FRONT_RIGHT_TIRE] = frontRightTire;
	tireArr[BACK_LEFT_TIRE] = backLeftTire;
	tireArr[BACK_RIGHT_TIRE] = backRightTire;
	
	tireList = new ArrayList<Tire>();	// 연습문제 4번 방법 2
	
	tireList.add(frontLeftTire);
	tireList.add(frontRightTire);
	tireList.add(backLeftTire);
	tireList.add(backRightTire);
	
	this.frontLeftTire = frontLeftTire;
	this.frontRightTire = frontRightTire;
	this.backLeftTire = backLeftTire;
	this.backRightTire = backRightTire;
	}

	// 메소드
	int run() {
		System.out.println("[자동차가 달립니다.]");
		if (tireArr[FRONT_LEFT_TIRE].roll() == false) { // 연습문제 4번 방법 1
	//	if (tireList.get(0).roll() == false { 
			stop();
			return FRONT_LEFT_TIRE;
		}
		;
		if (tireArr[FRONT_RIGHT_TIRE].roll() == false) {
			stop();
			return FRONT_RIGHT_TIRE;
		}
		;
		if (tireArr[BACK_LEFT_TIRE].roll() == false) {
			stop();
			return BACK_LEFT_TIRE;
		}
		;
		if (tireArr[BACK_RIGHT_TIRE].roll() == false) {
			stop();
			return BACK_RIGHT_TIRE;
		}
		;
		return 10; // 정상
	}

	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
}
