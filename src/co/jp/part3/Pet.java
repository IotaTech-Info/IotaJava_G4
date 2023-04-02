package co.jp.part2;

public abstract class Pet {
    public String name;
    public Type type;
    public int age;
	int feedingStatus;
	int moodStatus;
	String date;
	int index;
	
	public static int COUNT = 0;

	abstract void eat();

	public Pet(String name, int age, Type type,int status,int feed,String date,int index) {
		super();
		this.name = name;
		this.age = age;
		this.type = type;
		this.moodStatus=status;
		this.feedingStatus=feed;
		this.date=date;
		this.index=index;
		COUNT++;
	}
	public abstract void active();
	
	public int getStatus () {
		return this.moodStatus;
	}
	public int getFeed () {
		return this.feedingStatus;
	}
	public int getMood () {
		return this.moodStatus;
	}
	public void view() {
		System.out.println(this.type.getType() + "の" + this.name +"ちゃん");
		System.out.print(",年齢:" + this.age + "歳です");
	}

    //質問６-１︓以下静的なメソッドを定義してください。
    //1. メソッド名: megerArray
    //2. 引数１︓intの配列 left
    //3. 引数２︓intの配列 right
    //4. 戻り値︓intの配列
    //5. 処理内容︓引数left と 引数right をマージして、新しい配列を作成して返却する。
	

}
