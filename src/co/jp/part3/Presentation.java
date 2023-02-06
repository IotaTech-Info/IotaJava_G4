package co.jp.part3;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Map;
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
				write_in_log("Trainer registered.,"+trainer.name+","+trainer.id);
			}
			else{
				break;
			}
		}
//		trainer_num++;
		
		
		for (;;) {
			
			System.out.print("\n----- ご利用したい機能を選択してください： -----\n");
			System.out.println("----- 0: ポケモン登録 -----");
			System.out.println("----- 1: ポケモン登録解除 -----");
			System.out.println("----- 2: チームメンバーを見る -----");
			System.out.println("----- 3: ポケモンと遊ぶ -----");
			
			Scanner sc1 = new Scanner(System.in);
			String input = sc1.nextLine();
			
			if ("exit".equals(input)) {
				System.out.println("----- ご利用ありがとうございました。 -----");
				write_in_log("Trainer exited.,"+trainer.name+","+trainer.id);
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
					if (trainer.pokemon_num!=0) {
						Pokemon_Unregister(trainer);
						trainer.pokemon_num--;
					}else {
						System.out.println("ポケモン1匹も登録されていないため、解除できません");
					}
					
					break;
				case 2:
					Show_Team(trainer);
					break;
				case 3:
					Play_with_Pokemon(trainer);
					break;
				default:
					System.out.println("選択範囲外のため、入力し直してください");
					choice=-1;
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
		Scanner sc1 = new Scanner(System.in);
		System.out.println("----- ポケモン登録 開始 -----");
		
		for (;;) {
			
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
				if (trainer.team.containsKey(input_array[1])){
					System.out.println("この名前はもう使われているため、新しく名前を入力してください。\n");
				}
				else{
					name = input_array[1];
				}
				
			}


			if ("SPECIES".equals(input_array[0])) {
				species = input_array[1];
			}

			if (!"".equals(name)  && !"".equals(species)) {
				// input 情報を収集できた時点
				Pokemon new_pokemon=null;
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
					species="";
					break;
				}
				if(new_pokemon!=null) {
					trainer.team.put(name, new_pokemon);
					System.out.println("----- ポケモン登録 完成 -----");
					write_in_log("Pokemon registered.,"+name+","+species);
					name="";
					species="";
				}
			}
		}
//		sc1.close();
	}

	public static Trainer Trainer_Register() {
		Trainer new_trainer=null;
		String name = "";
		int id = 0;
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("----- トレーナー登録 開始 -----\nトレーナーの情報を入力してください。");
		
		for (;;) {
			
			// TODO 機能のループ

			String input = sc1.nextLine();

			if ("exit".equals(input)) {
				System.out.println("----- トレーナー登録 終了 -----");
				break;
			}

			// 形式   NAME:金柑  ⇒ ID:18 
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
				id=0;
				name="";
				break;
			}		
			
		}
//		sc1.close();
		return new_trainer;
	}

	public static void Show_Team(Trainer trainer) {

		System.out.print("チームメンバー: / " );
		for(Map.Entry<String, Pokemon> entry : trainer.team.entrySet()) {
			System.out.print(entry.getKey()+" / ");
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
			
			if (trainer.team.containsKey(input)) {
				int species_info=trainer.team.get(input).species;
				String p_species[]= {"Fushigidane","Hitokage","Zenigame"};
				write_in_log("Pokemon unregistered.,"+input+","+p_species[species_info]);
				trainer.team.remove(input);
				System.out.println("----- ポケモン登録解除 完成 -----");
				name="";
			}
			else {
				System.out.println("指定されたポケモンが見つかりません。名前を入力し直しててください");
			}
			
		}
	}

	public static void Play_with_Pokemon(Trainer trainer) {
		
		Scanner sc1 = new Scanner(System.in);
		int choice=-1;
		Pokemon chosen_pkm=null;
		
		for (;;) {
			
			
			System.out.print("----- ポケモンとどんな遊びにするの？ -----\n");
			System.out.println("----- 0: ポケモンを触る -----");
			System.out.println("----- 1: ポケモンにきのみをあげる -----");
			System.out.println("----- 2: ポケモンに得意技を使わせる -----");
			System.out.println("----- 3: ポケモンにサングラスを掛けさせる -----");
			System.out.println("ポケモンの名前とコマンドナンバーを入力してください。");
			String input = sc1.nextLine();
			
			if ("exit".equals(input)) {
				System.out.println("----- ポケモンと遊ぶ　終了 -----");
				break;
			}

			// 形式   fushigidane:0 
			String[] input_array = input.split(":");
			System.out.println("入力した文字は=" + input);
			// INPUT エラーチェック
			if (input_array.length < 2) {
				System.out.println("INPUT形式不正のため、異常終了");
				
			}
			else {
//					
				if( trainer.team.containsKey(input_array[0])) {
						chosen_pkm=trainer.team.get(input_array[0]);
//						System.out.println("見つかった");
				}
				else {
					System.out.println("この名前を持っているポケモン見つかりませんため、名前を入力し直しててください。\n");
				}
				
				try{
					choice=Integer.valueOf(input_array[1]);
				}
				catch(Exception e){
					System.out.println("INPUT形式不正のため、入力し直してください");
				}
			}
			
			
			if (chosen_pkm!=null && choice!=-1) {
				// input 情報を収集できた時点
				switch (choice) {
				case 0:
					trainer.touch(chosen_pkm);
					choice=-1;
					chosen_pkm=null;
					break;
				case 1:
					trainer.feed_berry(chosen_pkm);
					choice=-1;
					chosen_pkm=null;
					break;
				case 2:
					trainer.order(chosen_pkm);
					choice=-1;
					chosen_pkm=null;
					break;
				case 3:
					if (chosen_pkm instanceof Zenigame) {
						((Zenigame) chosen_pkm).wear_sunglasses();
					}
					else {
						System.out.println(chosen_pkm.name+"はゼニガメではないため、命令は受けられません。");
					}
					choice=-1;
					chosen_pkm=null;
					break;
				default:
					System.out.println("選択範囲外のため、入力し直してください");
					choice=-1;
					break;
				}
			}
		}
	}
	
	public static void write_in_log(String log) {
		
		Calendar cal =Calendar.getInstance();
        //SimpleDateFormatで書式を指定
        SimpleDateFormat sdf_date = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdf_timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //Calendarの日付をSimpleDateFormatで指定した書式で文字列に変換
        String today=sdf_date.format(cal.getTime());
        try {
        	 Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("./src/co/jp/part3/log_"+today+".txt",true),"UTF-8"));
        	 
        	 out.append(System.lineSeparator()+sdf_timestamp.format(cal.getTime())+","+log);
        	 out.close();
        	 System.out.println("logに記録されました。");
        } catch (IOException e) {
        	 e.printStackTrace();
        }

        	
        
	}
}
