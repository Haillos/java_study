package study.Practice1219.Kitchen;

public class GasRange {
	int burnerCnt;
	String brand;
	int price;
	boolean turnOn;
	int fireLevel;

	public void fireOn() {
		fireLevel = 1;
	}
	
	public void fireOff() {
		fireLevel = 0;
	}
	
	//setFireLevel(9);
	public void setFireLevel(int fireLevel) {
		this.fireLevel =fireLevel;
	}
	
	
	/*- 화구가 몇인지
	- 어디 브랜드인지
	- 가격이 얼마인지
	- 불을 켠다
	- 불을 끈다
	- 불세기르 조절한다.*/

}
