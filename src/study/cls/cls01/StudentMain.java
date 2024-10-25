package study.cls.cls01;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		
		int n =10;
		int[] arr = new int[3];
		
		Student stu1 = null;
		stu1 = new Student();
		
		Student stu2 = new Student();
		
		Scanner scanner = new Scanner(System.in);
	//    변수    클래스이름     새로운 스캐너 인스턴스 객체
		
		
		stu1.name = "이름일";
		stu2.name = "이름이";
		
		System.out.println(stu1.name);
		System.out.println(stu2.name);
		
		stu1.grade = 3;
		stu2.grade = 5;
		
	}
}
