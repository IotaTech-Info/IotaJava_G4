package co.jp.chapter09;

public class Frog extends Animal implements Swim,Run{
	
	@Override
	void speak() {
		System.out.println("hello");
	}
	
	@Override
	public void run() {
		
	}
	
	@Override
	public void swim() {
		
	}

}

