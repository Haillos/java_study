package study.Practice;

public class MonitorMain {
	public static void main(String[] args) {

	

	 Monitor m1 = new Monitor("삼성", 27, 150000);
	 m1.setColor("검은색");
	 
	 Monitor m2 = new Monitor("LG", 32, 330000);
	 
	 m1.setResolXY(1080, 780);
	 m2.setColor("흰색");
	 m2.setResolXY(4096, 2048);
	 
	 m1.printInfo();
	 m2.printInfo();
	 
	 int returnPrice = m2.priceUp(70000);
	 System.out.println("인상된 금액 :" + returnPrice);

	 m1.printInfo();
	 m2.printInfo();
	 
	 
	 
		

}}
