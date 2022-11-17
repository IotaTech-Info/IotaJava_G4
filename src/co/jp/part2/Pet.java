package co.jp.part2;

public abstract class Pet {

	String name;

	int age;

	Type type;
	
	int feed;
	
	int status;
	
	public static int COUNT = 0;

	abstract void eat();

	public Pet(String name, int age, Type type,int status,int feed) {
		super();
		this.name = name;
		this.age = age;
		this.type = type;
		this.status=status;
		this.feed=feed;
		COUNT++;
	}
	public abstract void active();
	
	public String getStatus () {
		if(this.status>=100) {
			this.status=100;
			System.out.println("心情: 喜び(Good)");
			return "喜び(Good)";
		}else if(this.status>80) {
			System.out.println("心情: 外に見ている(Normal)");
			return "外に見ている";
		}else if(this.status>50) {
			System.out.println("心情: いらいらしている(Bad)");
			return "いらいらしている";
		}else{
			System.out.println("心情: 何もしてない(Default)");
			return "何もしてない";
		}
	}
	public String getFeed () {
		if(this.feed>=100) {
			this.feed=100;
			System.out.println("腹: 飽きている");
			return "飽きている";
		}else if(this.feed>80) {
			System.out.println("腹: 腹八分目");
			return "腹八分目";
		}else if(this.feed>50) {
			System.out.println("腹: ほとんど空腹");
			return "ほとんど空腹";
		}else{
			System.out.println("腹: お腹空いている");
			return "お腹空いている";
		}
	}
}
