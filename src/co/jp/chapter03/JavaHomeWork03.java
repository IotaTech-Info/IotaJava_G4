package co.jp.chapter03;

public class JavaHomeWork03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		System.out.println("質問１︓成績ランキング判断を作成する「90以上︓A, 80-90︓B, 70-80︓C, 60-70︓D, 60以下︓E");
		int a = 56;
		System.out.println("成績ランキング判断。入力値=" + a);
		// 以下コードを完成してください。
		if(a > 90) {
		 System.out.println("A");
		} else if(a>80 && a<90) {
		 System.out.println("B");
		} else if(a>70 && a<80) {
		 System.out.println("C");
		} else if(a>60 && a<70) {
		 System.out.println("D");
		} else {
		 System.out.println("E");
		}
		
		System.out.println("");

		System.out.println("質問2︓日本のコインを１円、５円、１０円、１００円、５００円があります。３３４０円のコイン数をもとめください。");
		int coin = 3340;
		int coins[]= {500,100,10,5,1};
		int count = 0;
		System.out.println(coin +"円のコイン数をもとめください。");
		for(int i = 0 ; i < coins.length ; i++)
		{
			count = coin / coins[i];
			System.out.println(coins[i] + "円のコイン数は" + count + "枚");
			coin =  coin % coins[i];
		}
			
		
		
		
		
	}
}