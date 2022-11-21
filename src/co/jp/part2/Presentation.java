package co.jp.part2;

import java.util.Scanner;

public class Presentation {
	
	

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("----- PokemonCampへようこそ -----\n先ずはトレーナーの情報登録");
		
//		Trainer[] trainers=new Trainer[4];
//		int trainer_num=0;
		Trainer trainer=null;
	
		for(;;) {
			if(trainer==null) {
				trainer=Trainer_Register();
			}
			else{
				break;
			}
		}
//		trainer_num++;
		
		Scanner sc1 = new Scanner(System.in);
		
		for (;;) {
			System.out.print("----- ご利用したい機能を選択してください： -----\n");
			System.out.println("----- 0: ポケモン登録 -----");
			System.out.println("----- 1: ポケモン登録解除 -----");
			System.out.println("----- 2: チーム -----");
			System.out.println("----- 3: ポケモンと遊ぶ -----");
			
			
			String input = sc1.nextLine();
			
			if ("exit".equals(input)) {
				System.out.println("----- ご利用ありがとうございました。 -----");
				break;
			}

			int choice=-1;
			// INPUT エラーチェック
			try{
				choice=Integer.valueOf(input);
			}
			catch(Exception e){
				System.out.println("INPUT形式不正のため、入力し直してください");
			}
			
			if (choice!=-1) {
				// input 情報を収集できた時点
				switch (choice) {
				case 0:
					if (trainer.pokemon_num!=6) {
						Pokemon_Register(trainer);
						trainer.pokemon_num++;
					}else {
						System.out.println("チーム満員したため、登録できません");
					}
					break;
				case 1:
					Pokemon_Unregister(trainer);
					break;
				case 2:
					show_team(trainer);
					break;
				case 3:
					play_with_pokemon(trainer);
					break;
				default:
					System.out.println("選択範囲外のため、入力し直してください");
					break;
				}
			}
//			sc1.close();
//			System.out.println("入力した文字は=" + input);
		}
		
	}
	
	public static void Pokemon_Register(Trainer trainer) {
		
		String name = "";
		String species = "";
		Pokemon new_pokemon=null;
		
		Scanner sc1 = new Scanner(System.in);
		
		for (;;) {
			System.out.println("----- ポケモン登録 開始 -----");
			// TODO 機能のループ

			String input = sc1.nextLine();

			if ("exit".equals(input)) {
				System.out.println("----- ポケモン登録 終了 -----");
				break;
			}

			// 形式   NAME:satoshi  ⇒ SPECIES:Fushigidane
			String[] input_array = input.split(":");

			// INPUT エラーチェック
			if (input_array.length < 2) {
				System.out.println("INPUT形式不正のため、異常終了");
				
			}
			
			System.out.println("入力した文字は=" + input);
			
			if ("NAME".equals(input_array[0])) {
				for(Pokemon pkm : trainer.team) {
					if(pkm!=null && pkm.name!=input_array[1]) {
						name = input_array[1];
					}
					else {
						System.out.println("この名前はもう使われているため、新しく名前を入力してください。\n");
					}
				}
				
			}


			if ("SPECIES".equals(input_array[0])) {
				species = input_array[1];
			}

			if (!"".equals(name)  && !"".equals(species)) {
				// input 情報を収集できた時点
				switch (species) {
				case "Fushigidane":
					new_pokemon=new Fushigidane(name,trainer);
					break;
				case "Hitokage":
					new_pokemon=new Hitokage(name,trainer);
					break;
				case "Zenigame":
					new_pokemon=new Zenigame(name,trainer);
					break;
				default:
					System.out.println("SPECIES範囲外のため、異常終了");
					break;
				}
				for(Pokemon pkm : trainer.team) {
					if(pkm==null) {
						pkm=new_pokemon;
					}
				}
				System.out.println("----- ポケモン登録 完成 -----");
			
			}

//			
//			
		}
		sc1.close();
	}

	public static Trainer Trainer_Register() {
		
		String name = "";
		int id = 0;
		Trainer new_trainer=null;
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("----- トレーナー登録 開始 -----\nトレーナーの情報を入力してください。");
		
		for (;;) {
			
			// TODO 機能のループ

			String input = sc1.nextLine();

			if ("exit".equals(input)) {
				System.out.println("----- トレーナー登録 終了 -----");
				break;
			}

			// 形式   NAME:金柑  ⇒ AGE:18 ⇒ TYPE:DOG
			String[] input_array = input.split(":");

			// INPUT エラーチェック
			try {
				if (input_array.length < 2) {
//					System.out.println("INPUT形式不正のため、入力し直してください");
					throw new Exception();
				}

				if ("NAME".equals(input_array[0])) {
					name = input_array[1];
				}
				
				if ("ID".equals(input_array[0])) {
					id = Integer.valueOf(input_array[1]);
				}
			}
			catch(Exception e) {
				System.out.println("INPUT形式不正のため、入力し直してください");
				
			}
			
			System.out.println("入力した文字は=" + input);
			
			if (!"".equals(name) && id != 0 ) {
				// input 情報を収集できた時点
				new_trainer=new Trainer(name,id);
				System.out.println("----- トレーナー登録 完成 -----");
				
				break;
			}		
			
		}
		sc1.close();
		return new_trainer;
	}

	public static void show_team(Trainer trainer) {

		System.out.println("Pokemon Team: " );
		for (int i=0;i<6;i++) {
			if(trainer.team[i]==null) {
				System.out.print(i+". "+trainer.team[i].name+" ");
			}
			else {
				System.out.print(i+". NULL ");
			}
		}
		
	}

	public static void Pokemon_Unregister(Trainer trainer) {
		
		String name;
		Scanner sc1 = new Scanner(System.in);
		
		for(;;) {
			System.out.println("----- ポケモン登録解除 開始 -----");
			// TODO 機能のループ

			String input = sc1.nextLine();

			if ("exit".equals(input)) {
				System.out.println("----- ポケモン登録解除 終了 -----");
				break;
			}
			
			for(Pokemon pkm : trainer.team) {
				if(pkm!=null && pkm.name.equals(input)) {
					pkm=null;
					System.out.println("----- ポケモン登録解除 完成 -----");
					break;
				}
				else {
					System.out.println("指定されたポケモンが見つかりません。名前を入力し直しててください");
				}
			}
		}
	}

	public static void play_with_pokemon(Trainer trainer) {
		
		Scanner sc1 = new Scanner(System.in);
		int choice=-1;
		Pokemon chosen_pkm=null;
		
		for (;;) {
			
			
			System.out.print("----- ポケモンとどんな遊びにするの？ -----\n");
			System.out.println("----- 0: ポケモンを触る -----");
			System.out.println("----- 1: ポケモンにきのみをあげる -----");
			System.out.println("----- 2: ポケモンに得意技を使わせる -----");
			System.out.println("----- 3: ポケモンにサングラスを掛けさせる -----");
			
			String input = sc1.nextLine();
			
			if ("exit".equals(input)) {
				System.out.println("----- ポケモンと遊ぶ　終了 -----");
				break;
			}

			// 形式   fushigidane:0 
			String[] input_array = input.split(":");

			// INPUT エラーチェック
			if (input_array.length < 2) {
				System.out.println("INPUT形式不正のため、異常終了");
				
			}
			
			System.out.println("入力した文字は=" + input);
			
			for(Pokemon pkm : trainer.team) {
				if(pkm!=null && pkm.name == input_array[0]) {
					chosen_pkm=pkm;
				}
				else {
					System.out.println("この名前を持っているポケモン見つかりませんため、名前を入力し直しててください。\n");
				}
			}
				
			
			
			// INPUT エラーチェック
			try{
				choice=Integer.valueOf(input_array[1]);
			}
			catch(Exception e){
				System.out.println("INPUT形式不正のため、入力し直してください");
			}
			
			
			
			if (chosen_pkm!=null && choice!=-1) {
				// input 情報を収集できた時点
				switch (choice) {
				case 0:
					trainer.touch(chosen_pkm);
					break;
				case 1:
					trainer.feed_berry(chosen_pkm);
					break;
				case 2:
					trainer.order(chosen_pkm);
					break;
				case 3:
					if (chosen_pkm instanceof Zenigame) {
						((Zenigame) chosen_pkm).wear_sunglasses();
					}
					else {
						System.out.println(chosen_pkm.name+"はゼニガメではないため、命令は受けられません。");
					}
					break;
				default:
					System.out.println("選択範囲外のため、入力し直してください");
					break;
				}
			}
		}
	}
}
