package co.jp.chapter03;

public class JavaHomeWork03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		  //質問1:成績ランキング判断を作成する「90以上:A, 80-90:B, 70-80:C, 60-70: D, 60以下:E」
		  //回答:
		  int a = 56;
		  System.out.println("成績ランキング判断。入力値="+a);
		  
		  if (a>=90) {
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
		   
		   
		  //質問2:日本のコインを1円、5円、10円、100円、500円があります。3340 円のコイン数をもとめください。
		  //回答:
		  int b = 3341;
		  int coins = 0;
		  
		  while(b>=0) {
		   if (b > 500) {
		    coins = b /500;
		    b = b % 500;
		  
		   }else if(b > 100) {
		    coins =coins + b /100;
		    b = b % 100;
		  
		   }else if (b > 10) {
		    coins =coins + b /10;
		    b = b % 10;
		  
		   }else if (b > 5) {
		    coins =coins + b /5;
		    b = b % 5;
		  
		   }else {
		    coins =coins +b/1;
		    System.out.println("コイン数" +coins+"枚");
		    b = b % 1;
		    break;
		   }
		  
		  }

	}
}