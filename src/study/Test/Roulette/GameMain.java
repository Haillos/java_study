package study.Test.Roulette;

import java.util.List; 
import java.util.Random; 
import java.util.Scanner;
import java.util.ArrayList;

public class GameMain {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		Random random = new Random();
		
		GameDevice gd1 = new GameDevice("124123", "천안");
		
		ArrayList<String> slots = new ArrayList<>(); 
		slots.add("1 Point");
		slots.add("2 Points");
		slots.add("3 Points");
		slots.add("4 Points");
		slots.add("Miss");
		slots.add("Miss");
		
		String result = slots.get(random.nextInt(slots.size()));
		System.out.println(result + "!");
		
	
		
	}
	
	
	
}
