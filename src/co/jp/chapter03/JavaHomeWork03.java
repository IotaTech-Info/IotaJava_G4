package co.jp.chapter03;

public class JavaHomeWork03 {

	public static void main(String[] args) {
		// 質問１︓成績ランキング判断を作成する「90以上︓A, 80-90︓B, 70-80︓C, 60-70︓D, 60以下︓E」
		
		int a = 56;
		System.out.println("成績ランキング判断。入力値=" + a);
		// 以下コードを完成してください。
		if(a>=90) {
			System.out.println("A");
		} else if(a>=80 && a<90) {
			System.out.println("B");
		} else if(a>=70 && a<80) {
			System.out.println("C");
		} else if(a>=60 && a<70) {
			System.out.println("D");
		} else {
			System.out.println("E");
		}
		
		//質問２︓⽇本のコインを１円、５円、１０円、１００円、５００円があります。３３４０	円のコイン数をもとめください。
		
		int t=3340;
		int r=t;
		int[] coin_list = new int[] {500,100,10,5,1};
		int[] result=new int[5];
		int i=0;
		for (Integer coin:coin_list) {
			if (r!=0) {
				result[i]=r/coin;
				r=r%coin;
				i++;
			}
			else {
				break;
			}
		}
		
		int sum = 0; 
	    for (int c : result) {
	         sum = sum + c;
	    }
	    
		System.out.println("コインの(最小)枚数:"+sum);
		


	}
}