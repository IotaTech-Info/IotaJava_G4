package co.jp.chapter03;

public class JavaHomeWork03 {

	public static void main(String[] args) {
		// 質問１︓成績ランキング判断を作成する「90以上︓A, 80-90︓B, 70-80︓C, 60-70︓
		// D, 60以下︓E」
		
		 int a = 56;
		 
		 if (a >= 90) {
			 System.out.println("成績ランキング判断:"+"A");
			 }
		 else if (a>=80&a<90) {
			 System.out.println("成績ランキング判断:"+"B");
				}
		 else if (a >= 70 & a < 80) {
			 System.out.println("成績ランキング判断:"+"C");
			
		}
		 else if (a >= 60 & a < 70) {
			 System.out.println("成績ランキング判断:"+"D");
		 }
		 else if (a < 60) {
			 System.out.println("成績ランキング判断:"+"E");
		 }
		 
		 
		 // 質問２︓⽇本のコインを１円、５円、１０円、１００円、５００円があります。
		 // ３３４０円のコイン数をもとめください。
		 
		 int x = 3340 ;
		 int c500,c100,c10,c5,c1;
		 
		    c500 = x / 500;
		    x = x % 500;
		    c100 = x / 100;
		    x = x % 100;
		    c10 = x / 10;
		    x = x % 10;
		    c5 = x / 5;
		    c1 = x % 5;
		    
		    System.out.println(" 500円玉:"+ c500);
		    System.out.println(" 100円玉:"+ c100);
		    System.out.println(" 10円玉:"+ c10);
		    System.out.println(" 5円玉:"+ c5);
		    System.out.println(" 1円玉:"+ c1);
		
		 
		
		 
	
	}
}