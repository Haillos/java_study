package study.Test.Roulette;
import java.util.ArrayList; 
import java.util.List; 
import java.util.Random; 
import java.util.Scanner;
public class GameDevice {
	String id;
	String branch;
	int totalPt = 0;
	int successTime = 0;
	int failTime = 0;
	int leftTime = 0;
	int revenue = 0;
	
	
	GameDevice(String id, String branch) {
		this.id = id;
		this.branch= branch;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("충전 금액 입력 : ");
		int Charge = scanner.nextInt();
		
		revenue += Charge;
		leftTime += (int)(Charge % 500);
		
		while(leftTime < 1) {
			
		}
		
		if(leftTime == 0) {
			System.out.println("성공 횟수: "+successTime);
			System.out.println("실패 횟수: "+failTime);
			System.out.println("총 점수: "+totalPt);
		}
	}
	
	
	
	
}
