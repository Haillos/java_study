package study.Inherit.Inherit05;

public class CarExample {
	public static void main(String[] args) {
		Tire t1 = new KumhoTire("앞왼쪽", 15);
		Tire t2 = new KumhoTire("앞오른쪽", 15);
		Tire t3 = new KumhoTire("뒤왼쪽", 15);
		Tire t4 = new KumhoTire("뒤오른쪽", 15);
		Car car = new Car(t1, t2, t3, t4);
		
		for(int i=1; i<=10; i++) {
			int problemLocation = car.run();
			switch(problemLocation) {
				case Car.FRONT_LEFT_TIRE:
					System.out.println("앞왼쪽 HankookTire로 교체");
					car.tireArr[Car.FRONT_LEFT_TIRE] = new HankookTire("앞왼쪽", 15); // 4번 연습문제 방법 1
					break;
				case Car.FRONT_RIGHT_TIRE:
					System.out.println("앞오른쪽 KumhoTire로 교체");
					car.tireArr[Car.FRONT_RIGHT_TIRE] = new KumhoTire("앞오른쪽", 13);	
					break;
				case Car.BACK_LEFT_TIRE:
					System.out.println("뒤왼쪽 HankookTire로 교체");
					car.tireArr[Car.BACK_LEFT_TIRE] = new HankookTire("뒤왼쪽", 14);	
					break;
				case Car.BACK_RIGHT_TIRE:
					System.out.println("뒤오른쪽 NexenTire로 교체");
					car.tireArr[Car.BACK_RIGHT_TIRE] = new NexenTire("뒤오른쪽", 25);		
					break;
			}
			System.out.println("----------------------------------------");
		}
	}
}
