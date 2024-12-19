package study.Practice1219.Kitchen;

public class Refrigerator {
	int litre;
	String brand;
	int doorCnt;

	boolean isPowerOn;
	int temperature;
	/*- 어느 브랜드인지
	- 몇리터 짜리인지
	- 전원을 켤수 있다
	- 온도조절을할수있다(온도 up 또는 온도 down)
	- 문이 몇개인지*/

	// 온도
	int maxTemperature;
	int minTemperature;

	public void powerOn() {
		isPowerOn = true;
	}

	public void tempUp() { // 온도 올리기
		if (temperature + 1 <= maxTemperature) {
			this.temperature += 1;
		}

	}

	public int tempDown() { // 온도 내리기
		this.temperature -= 1;
		return temperature;
	}

	public void modifyTemp(int tempValue) { // 온도 조절
		this.temperature += tempValue;
	}

	public void modifyTemp(boolean isUp) { // 온도 조절
		if (isUp) {
			this.temperature += 1;
		} else {
			this.temperature -= 1;
		}

	}
}
