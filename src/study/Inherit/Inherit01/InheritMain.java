package study.Inherit.Inherit01;

public class InheritMain {

	public static void main(String[] args) {
		Parent p1 = new Parent(5000);
		p1.money = 5000;
		p1.say();
		
		Child c1 = new Child();
		c1.grade = 3;
		c1.play();
		
		System.out.println(c1.money);
		c1.say();
		
		Child c2 = new Child(5, "중앙초", 3000);
		
	}
}
