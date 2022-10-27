package co.jp.chapter03;

public class JavaHomeWork03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		
		//質問１︓成績ランキング判断を作成する「90以上︓A, 80-90︓B, 70-80︓C, 60-70︓D, 60以下︓E」
		//
		//
		int a = 56;
		
		System.out.println("成績ランキング判断。入力値=" + a);
		
		if (a >= 90) {
			
			System.out.println("A");
			
		}else if (a >= 80) {
			
			System.out.println("B");
			
		}else if (a >= 70) {
			
			System.out.println("C");
			
		}else if (a >= 60) {
			
			System.out.println("D");
			
		}else {
			
			System.out.println("E");
			
		}
		
		
	
		
		//質問２:日本のコインを１円、５円、１０円、１００円、５００円があります。３３４０円のコイン数をもとめください。
		
		
		
		
		//授業での練習：×形
		
		int l = 10;
		
		for(int i = 0; i < l; i++) {
			for (int j = 0; j < l; j++) {
				
				
				if (i == j || i + j == l-1) {
					System.out.print("" + i + j +" ");
				 }else {
					System.out.print("  ");
				}
					
				}
			System.out.println();
			}
		
		
		//授業での練習：米形
		
	    int p = 11;
		
		for(int i = 0; i < p; i++) {
			for (int j = 0; j < p; j++) {
				
				
				if (i == j || i + j == p-1 || i == (p - 1)/2 || j == (p - 1)/2 ) {
					System.out.print("" + i + j +"  ");
				 }else {
					System.out.print("   ");
				}
					
				}
			System.out.println();
			}
			
		
		
		

		//授業での練習：菱形
		
		
		
		
		
		
		
		

	}
}