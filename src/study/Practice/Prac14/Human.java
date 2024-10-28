package study.Practice.Prac14;

public class Human {

	String name;
	String gender;
	int age;
	double height;
	double weight;
	String job;
	String bloodType;
	String status;
	boolean sleep;

	Human(String name, String gender, int age, 
			double height, double weight, String job, 
			String bloodType, String status, boolean sleep) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.job = job;
		this.bloodType = bloodType;
		this.status = status;
		this.sleep = sleep;
	}


	void printInfo() {
		System.out.printf("이름:%s 성별:%s 나이:%d 키:%.1f 몸무게:%.1f 직업:%s 혈액형:%s 건강상태:%s 수면중여부 : %s" , name, gender, age, height, weight, job, bloodType, status, sleep);
	}
	
	}
