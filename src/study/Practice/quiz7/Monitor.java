package study.Practice.quiz7;

public class Monitor {

	int inch; // 인치
	String maker; // 제조사
	String model; // 모델

	Monitor(){};
	
	
	Monitor(int inch, String maker, String model) {
		this.inch = inch;
		this.maker = maker;
		this.model = model;
	}

	void printInfo() {
		System.out.printf("제조사 : %s 모델명: %s 인치: %d인치\n", maker, model, inch);
	}
	
	void printInfo(int inch, String maker, String model) {
		System.out.printf("제조사 : %s 모델명: %s 인치: %d인치\n", maker, model, inch);
	}
	
}
