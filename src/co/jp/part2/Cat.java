package co.jp.part2;

public class Cat extends Pet implements Run {

	
	public Cat(String name, int age, Type type,int status,int feed) {
		super(name, age, type,status,feed);
		// TODO 自動生成されたコンストラクター・スタブ
	}
	@Override
	void eat() {
		// TODO 自動生成されたメソッド・スタブ
		if(this.feed==100) {
			System.out.println("お腹いっぱいある、食べたくない状態");
			return ;
		}
		System.out.println("[Cat]"+this.name+"ちゃん is eating");
		if(!(this.feed+40>100))
			this.feed=this.feed+40;
		else
			this.feed=100;
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void run() {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("[Cat]"+this.name+"ちゃん is running");
	}
	@Override
	public void active() {
		if(this.feed<50) {
			System.out.println("腹が空いた、遊びたくない状態");
			return ;
		}
		run();

		if(!(this.status+40>100))
			this.status=this.status+40;
		else
			this.status=100;
		this.status=this.status+40;
		
		this.feed=this.feed-30;
	}
}
