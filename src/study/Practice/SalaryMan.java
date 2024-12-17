package study.Practice;

public class SalaryMan {

	int salary = 1000000;

	SalaryMan() {
		salary = 1000000;
	}

	SalaryMan(int salary) {
		this.salary = salary;
	}

	
	int getAnnualGross(){
		return (salary * 12) + (salary * 5);
	}
}
