package co.jp.part3;

public class Hitokage extends Pokemon implements Hinoko{

	public Hitokage(String name,Trainer trainer ) {
		this.name=name;
		this.default_name="ヒトカゲ";
		this.type=new TYPE[] {TYPE.FIRE,null};
		this.trainer_name = trainer.name;
	}
	
	@Override
	public void cry() {
		System.out.println(this.name+"「カゲ〜!」");
	}
	
	@Override
	public void use_Hinoko() {
		System.out.println(this.name+"はひのこを使ってみた!");
		System.out.println("小さな炎を発射して攻撃する。");
	}
}
