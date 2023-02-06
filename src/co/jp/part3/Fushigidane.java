package co.jp.part3;

public class Fushigidane extends Pokemon implements Tsurunomuchi{

	public Fushigidane(String name, Trainer trainer ) {
		this.default_name="フシギダネ";
		this.name=name;
		this.species=1;
		this.type=new TYPE[] {TYPE.GRASS,TYPE.POISON};
		this.trainer_name = trainer.name;
	}
	
	@Override
	public void cry() {
		System.out.println(this.name+"「ダネダネ!」");
	}
	
	@Override
	public void use_Tsurunomuchi() {
		System.out.println(this.name+"はつるのムチを使ってみた!");
		System.out.println("ムチのように しなる 細長い つるで 相手を たたきつけて 攻撃する。");
	}
}
