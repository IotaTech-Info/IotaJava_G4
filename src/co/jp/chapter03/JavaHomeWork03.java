package co.jp.chapter03;

public class JavaHomeWork03 {

	public static void main(String[] args) {
		// 質問１
		/*
		int a=56;
		System.out.println("成績ランキング判断。入力値＝"+a);
		
		if(a>=90) {
			System.out.println("A");
		}else if(a>=80) {
			System.out.println("B");
		}else if(a>=70) {
			System.out.println("C");
		}else if(a>=60) {
			System.out.println("D");
		}else {
			System.out.println("E");
		}
		*/
		//実行結果：
		/*
		成績ランキング判断。入力値＝56
		E
		*/
		
		//質問2
		/*
		public static void main(String[] args) {
			int[] coin={500,100,10,5,1};//コインの種類
			int money=3340;//金額
			int count=0;//枚数
			for(int i=0; i<coin.length;i++){
				count = money / coin[i];
				money %= coin[i];
				System.out.println(coin[i]+"円のコイン"+count+"枚");
				}
		*/
		//実行結果：
		/*
		 500円のコイン6枚
		 100円のコイン3枚
		 10円のコイン4枚
		 5円のコイン0枚
		 1円のコイン0枚
		 */

	}
}