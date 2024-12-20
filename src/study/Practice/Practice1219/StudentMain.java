package study.Practice.Practice1219;

public class StudentMain {
	public static void main(String[] args) {

		Student student1 = new Student();
//		student1.dept = "science";
//		student1.stdNum = 201711032;
		
//		System.out.println(student1.dept +" "+ student1.stdNum);
		
		
		student1.setDept("science");
		student1.setStdNum(201711032);
		
		System.out.println(student1.getDept()+ " " +student1.getStdNum());
	}
}
