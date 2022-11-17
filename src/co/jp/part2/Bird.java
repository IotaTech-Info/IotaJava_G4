package co.jp.part2;

public class Bird extends Pet implements Fly {

	public Bird(String name, int age, Type type,int status,int feed) {
		super(name, age, type,status,feed);
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
	@Override
	public void fly() {

		System.out.println("[Bird]"+this.name+"ちゃん is flying");
	}

	@Override
	void eat() {
		// TODO 自動生成されたメソッド・スタブ
		if(this.feed==100) {
			System.out.println("お腹いっぱいある、食べたくない状態");
			return ;
		}
		System.out.println("[Bird]"+this.name+"ちゃん is eating");
		this.feed=100;
	}

	@Override
	public void active() {
		if(this.feed<50) {
			System.out.println("腹が空いた、遊びたくない状態");
			return ;
		}
		fly();
		this.status=this.status+40;
		this.feed=this.feed-50;
	}
}
