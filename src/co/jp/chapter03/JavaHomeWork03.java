package co.jp.chapter03;

public class JavaHomeWork03 {

	public static void main(String[] args) {

	//質問１︓成績ランキング判断を作成する「90以上︓A, 80-90︓B, 70-80︓C, 60-70︓	D, 60以下︓E」
		
		
			// TODO 自動生成されたメソッド・スタブ
			int a = 56;
			System.out.println("成績ランキング判断。入力値=" + a);
			// 以下コードを完成してください。
			if(a >= 90)                 { System.out.println("A");} 
			else if(80 < a && a < 90)   { System.out.println("B");} 
		  	else if(70 < a && a <= 80)  { System.out.println("C");} 
			else if(60 <= a && a < 70)  { System.out.println("D");} 
			else                        { System.out.println("E");}

		
		
	//質問２︓⽇本のコインを１円、５円、１０円、１００円、５００円があります。３３４０	円のコイン数をもとめください。	
		
		
			int m = 3340;
			int c500 = 0 ,c100 = 0,c10 = 0,c5 = 0;//c1 = 0;
			if(m % 500 > 0) {c500 = m % 500; }System.out.println("500円 "+ m/500 + " 枚が必要です"); 
		
			
			if(c500 % 100 > 0) {c100 = c500 % 100; }System.out.println("100円 " + c500/100+" 枚が必要です");
			
			
			if(c100 % 10 > 0) {c10 = c100 % 10; }System.out.println("100円 "+ c100/10 +" 枚が必要です"); 
			
			
			if(c10 % 5 > 0) {c5 = c10 % 5;} System.out.println("50円 " + c10/5 + " 枚が必要です"); 
			
			
			if(c5 % 1 > 0) {c5 = c5 % 1;} System.out.println("1円 "+ c5/1 +" 枚が必要です");
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
	// 
		//	课堂联系菱形
		
	/*	System.out.println("loop start");
		int l = 13;
		for (int i = 0; i <=l; i++) {
			for (int j = 0; j <=l; j++) {
				if (i+j==(l/2) || j-i== (l/2)+1 || i-j==(l/2)+1 || i+j==(l/2)+l //||
						/*i+j==(l/4)  || j-i== (l/4)+1&& j>(l/2) /*|| i-j==(l/4)+1 || i+j==(l/4)+l*///){
/*					System.out.print("" + i + j + "");
				} else {
					System.out.print("  ");
				}
			}
		System.out.println();   */
//		}

	}
}