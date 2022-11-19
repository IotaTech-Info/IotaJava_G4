package co.jp.chapter08;

public class Bird extends Animal{
		
	public Bird(String name, int age, int legs, String niao) {
		super(name, age, legs);
		this.niao = niao;
	}

	public String niao;

}
