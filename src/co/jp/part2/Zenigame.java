package co.jp.part2;

public class Zenigame extends Pokemon implements Mizudeppou {

	
	public Zenigame(String name,Trainer trainer ) {
		this.default_name="ゼニガメ";
		this.name=name;
		this.type=new TYPE[] {TYPE.WATER,null};
		this.trainer_name = trainer.name;
		
	}
	
	@Override
	public void cry() {
		System.out.println(this.name+"「ゼニゼニ!」");
	}
	
	public void wear_sunglasses() {
		System.out.println(this.name+"「ゼニゼニ!」");
		System.out.println(this.name+"はサングラスを掛けて、ゼニガメ消防団の仲間たちを呼んできました");
	} 
	
	@Override
	public void use_Mizudeppou() {
		System.out.println(this.name+"はみずでっぽうを使ってみた!");
		System.out.println("水を 勢いよく 相手に 発射して 攻撃する。");
	}
}
