package co.jp.part3;

import java.util.HashMap;
import java.util.Map;

public class Trainer {
	String name;
		int id;
		Map<String,Pokemon> team = new HashMap<>();
		int pokemon_num;

		public Trainer(String name, int id) {
			this.name=name;
			this.id=id;
			this.pokemon_num=0;
		}
		
		public void touch(Pokemon pkm) {
			System.out.println(pkm.name+"が嬉しいです。");
			pkm.cry();
		}
		
		public void feed_berry(Pokemon pkm) {
			System.out.println(pkm.name+"がきのみを食べました。");
			System.out.println(pkm.name+"が嬉しいです。");
			pkm.cry();
		}
		
		public void order(Pokemon pkm) {
			
			if (pkm instanceof Fushigidane) {
				System.out.println(pkm.name+"は命令を受けました。");
				((Fushigidane) pkm).use_Tsurunomuchi();
			}
			if (pkm instanceof Hitokage) {
				System.out.println(pkm.name+"は命令を受けました。");
				((Hitokage) pkm).use_Hinoko();
			}
			if (pkm instanceof Zenigame) {
				System.out.println(pkm.name+"は命令を受けました。");
				((Zenigame) pkm).use_Mizudeppou();
			}
		}
}
