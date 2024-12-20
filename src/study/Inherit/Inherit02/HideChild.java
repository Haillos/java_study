package study.Inherit.Inherit02;

import study.Inherit.Inherit01.Parent;

public class HideChild extends Parent {

	public HideChild(int money) {
		super(money);
	}
	
	public void printInfo() {
		System.out.println(money); 
	}
}
