package study.cls.cls02;

public class PhoneMain {
	public static void main(String[] args) {
		Phone p1 = new Phone("갤럭시");//  생성자를 직접 만든 순간 기본 생성자는 생성 해야 사용가능
		Phone p2 = new Phone("아이폰");
		Phone p3 = new Phone("갤럭시", 300, 4000);
		p2.printInfo();
	}
}
