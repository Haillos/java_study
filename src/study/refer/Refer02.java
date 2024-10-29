package study.refer
Week.java;
public class Refer02 {
	public static void main(String[] args) {

		
		String day = "MONDAY";
		
		String day2 = "TUESDAY";
		
		String day3 = "FRIDAY";
		
		String today = "WEDNESDAY";
		
		today = "FRODAY";
		
		//if(today == day3) {
		if(today.equals(day3)) {
			System.out.println("퇴근준비");
		}
		
		Week day11 = Week.TUE;
		Week day22 = Week.FRI;
		
		if(day22== Week.FRI) {
			System.out.println("금요일 퇴근준비");
		}
		
		String menu = "짜장면";
		int menu2 = 3;
		
		Menu menu3 = Menu.JMP;
	}
}

