package study.Practice.quiz7;


public class MonitorMain {

	public static void main(String[] args) {
		
		Monitor mo1 = new Monitor(65, "삼성", "더프레임");
	
		Monitor mo2 = new Monitor(85, "LG", "올레드");

		Monitor mo3 = new Monitor();
		mo1.printInfo();
		mo2.printInfo();
		mo3.printInfo();
	}
}
