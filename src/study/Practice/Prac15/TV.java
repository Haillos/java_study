package study.Practice.Prac15;

public class TV {
	
	String company;
	int year;
	int inch;
	
	 TV(String company, int year, int inch){
		this.company = company;
		this.year = year;
		this.inch = inch;
	}
	
	void show() {
		System.out.printf("%s제품 %d년형 %d인치 TV", company, year, inch);
	}

}
