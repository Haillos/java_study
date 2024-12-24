package study.Inter.Inter02;

public class Intermain {
	public static void main(String[] args) {

		Person p = new Person();

		p.callPhone = new IPhone();

		p.call("12313213");

		p.callPhone = new GalaxyPhone();

		p.call("12313213");

		p.callPhone = new LGPhone();

		p.call("12313213");

	}
}
