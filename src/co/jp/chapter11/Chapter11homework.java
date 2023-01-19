package co.jp.chapter11;

import java.util.ArrayList;
import java.util.List;

public class Chapter11homework {

	
//		質問１︓駅クラス（Station）、路線クラス（Line）を作成して。路線をインスタンス化し
//		てオブジェクト「⼭⼿線」を作成してください。「⼭⼿線」に各駅情報を追加してくださ
//		い。
		
		public static void main(String[] args) {
			
			List<String> Yamanote = new ArrayList<>();
			 Yamanote.add("Shinagawa");
			 Yamanote.add("Ōsaki");
			 Yamanote.add("Gotanda");
			 Yamanote.add("Meguro");
			 Yamanote.add("Ebisu");
			 Yamanote.add("Shibuya");
			 Yamanote.add("Harajuku");
			 Yamanote.add("Yoyogi");
			 Yamanote.add("Shinjuku");
			 Yamanote.add("Shin-Ōkubo");
			 Yamanote.add("Shinbashi");
			 //他の駅が省略
			 
			 
			
//			質問２︓質問１に作成した⼭⼿線の駅を foreach ⽂を繰り返して、新橋駅は路線内である
//			かを判断する。
			 
			 for (String Station : Yamanote) {
				if (Station == "Shinbashi"){
				System.out.println("Shinbashi は山手線にある。");
				}
				 
			 	}
			 
			 
			
//			質問３︓10両編成している通勤電⾞、各⾞の定員は5⼈です。31⼈の乗⾞の状況をプログ
//			ラミングしてください。（for⽂で旅客作成しても構わない）
						
			 
			
			
			
			}
		

	

}
