package co.jp.part2;

public class Bird extends Pet implements Fly {

	public Bird(String name, int age, Type type,int status,int feed,String date,int index) {
		super(name, age, type,status,feed,date,index);
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
	@Override
	public void fly() {

		System.out.println("[Bird]"+this.name+"ちゃん is flying");
	}

	@Override
	void eat() {
		// TODO 自動生成されたメソッド・スタブ
		if(this.feedingStatus==100) {
			System.out.println("お腹いっぱいある、食べたくない状態");
			return ;
		}
		System.out.println("[Cat]"+this.name+"ちゃん is eating");
		if(!(this.feedingStatus+40>100))
			this.feedingStatus=this.feedingStatus+40;
		else
			this.feedingStatus=100;
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void active() {
		if(this.feedingStatus<50) {
			System.out.println("腹が空いた、遊びたくない状態");
			return ;
		}
		fly();

		if(!(this.moodStatus+40>100))
			this.moodStatus=this.moodStatus+40;
		else
			this.moodStatus=100;
		this.moodStatus=this.moodStatus+40;
		
		this.feedingStatus=this.feedingStatus-30;
	}
}
