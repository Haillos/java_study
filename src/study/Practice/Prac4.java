package study.Practice;
import java.util.Scanner ;
public class Prac4 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("삼각형의 밑변의 값을 입력하세요 : ");
		int width = scanner.nextInt();
		System.out.print("삼각형의 높이의 값을 입력하세요 : ");
		int height = scanner.nextInt();
		double result = (double)(width * height) / 2;
		System.out.println(result); // 1
		
		
		
		System.out.print("사다리꼴의 윗변의 값을 입력하세요 : ");
		int topWidth = scanner.nextInt();
		System.out.print("사다리꼴의 밑변의 값을 입력하세요 : ");
		int botWidth = scanner.nextInt();
		System.out.print("사다리꼴의 높이의 값을 입력하세요 : ");
		int height2 = scanner.nextInt();
		double result2 = (double)(topWidth + botWidth) * height2 / 2;
		System.out.println(result2); // 2
		
		
		
		int student = 24;
		int snack = 100;	
		int stos = snack / student;
		int left = snack % student;
	
		System.out.println("한 명당 받게되는 과자의 수 : " + stos + " 남은 과자의 수 : " + left ); // 3
		
		
		
		System.out.print("세 자리의 정수를 입력하세요 : ");
		int number = scanner.nextInt();
		int first = number % 10;
		int second = number % 100/10;
		int third = number % 1000/100;
		System.out.println("백의자리 : " + third);
		System.out.println("십의자리 : " + second);
		System.out.println("일의자리 : " + first); // 4
		
		int x = 10;
		int y = 20;
		System.out.println("x= " + x + "y= " + y );
		int z = x;
		x = y;
		y = z;
		System.out.println("x= " + x + "y= " + y ); // 5
		
		
		
		
		
		
		
		
		
	}
	
}
