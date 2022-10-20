package co.jp.chapter03;

public class JavaHomeWork03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		
		//質問1
		int a = 56;
		System.out.println("成績ランキング判断。入力値＝" + a);
		
		if(90 <= a && a<100) {
			System.out.println("A");
			
		}else if(80 <= a && a < 90) {
			System.out.println("B");
			
		}else if(70 <= a &&a < 80) {
			System.out.println("C");
			
		}else if(60 <= a && a < 70) {
			System.out.println("D");
		
		}else{
			System.out.println("E");
		}


		//質問2
		
		int i = 3340;//金額
		int j;//枚数
		int list[] = {500, 100, 10, 5, 1};//コイン種類
		
		
		for(int k =0; k < 5; k++) { //5種類循環計算、list[0]の500から
			j = i / list[k];
			i %=  list[k];
			
			System.out.println(j);
			
		}
		
	}
}