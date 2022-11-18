package co.jp.chapter09;

public abstract class car {


	String name;

	int carnum;

	String type;

	public static int COUNT = 0;



	public car(String name, int carnum, String type) {
		super();
		this.name = name;
		this.carnum = carnum;
		this.type = type;
		COUNT++;
	}


}
