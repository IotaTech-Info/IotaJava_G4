package co.jp.chapter03;

public class JavaHomeWork03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//質問１: 成績ランキング判断を作成する「90以上:A, 80-90:B, 70-80:C, 60-70:D, 60以下:E」
		int a=56;
		System.out.println("成績ランキング判断。入力値=" + a);
		// 以下コードを完成してください。
		if (a >= 90) {
		  System.out.println("A"); 
		} else if (a >= 80 && a < 90) {
		  System.out.println("B"); 
		} else if(a >= 70 && a < 80) {
		  System.out.println("C"); 
		} else if(a >= 60 && a < 70) {
		  System.out.println("D"); 
		} else {
		 System.out.println("E"); 
		}

	    //質問２：日本のコインを1円、5円、10円、100円、500円があります。3340円のコイン数をもとめください。
		int cash=3340;
		int [] coin_list = {500,100,10,5,1};
		int sum = 0;
		for (int coin : coin_list) {
			int coins_num = cash / coin;
			cash = cash % coin;
			sum = sum + coins_num;
			System.out.println(coin+"円は"+coins_num+"枚を使った。");
		}
		System.out.println("全部"+sum+"枚を使った。");		
	}	
}