package co.jp.chapter03;

public class JavaChapter03 {

	public static void main(String[] args) {
				/*質問1:成績ランキング判断を作成する
				 「90以上:A, 80-90:B, 70-80:C, 60-70: D, 60以下:E」*/
		 int a = 56;
			System.out.println("成績ランキング判断。入力値=" + a);
			 if(a >= 90) {
				 System.out.println("A");
			 }else if(a >= 80) {
				 System.out.println("B");
			 }else if(a >= 70) {
				 System.out.println("C");
			 }else if(a >= 60) {
				 System.out.println("D");
			 }else {
				 System.out.println("E");
			 }
			 
		// 質問2:日本のコインを1円、5円、10円、100円、500円があります。
			 //3340 円のコイン数をもとめてください。
		    int[]array= {500,100,10,5,1};
		    int amount = 3340;
		    int count = 0;
		    for(int i = 0;i < array.length;i++) {
		    	count = amount/array[i];
		    	amount %= array[i];
		    System.out.println(array[i]+"円のコインは"+count+"枚です。");

		    }
			 
		}	 
		 
	}
