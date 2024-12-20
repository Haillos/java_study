package study.Inherit.Inherit03;

public class BluetoothMike extends Mike {
	boolean isConnet;
	
	public int volumeUp(String s) {
		System.out.println("String 매개변수 있는 볼륨 업");
		return 0;
	}
	
	public void volumeUp() {
		super.volumeUp();// 부모 클래스 함수 호출 super
		System.out.println("BluetoothMike 볼륨 업 재정의");
	}
	
}
