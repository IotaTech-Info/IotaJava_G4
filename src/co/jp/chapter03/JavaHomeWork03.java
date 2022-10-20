package co.jp.chapter03;

public class JavaHomeWork03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	
	//問１	
	//	int a = 56;
	//	System.out.println("成績ランキング判断。入力値＝" + a );
     //   if( a >= 90) {
    //	       System.out.println("A");
    //   } else if ( a >= 80) {
    //	       System.out.println("B");
    //    } else if ( a >= 70) {
    //       System.out.println("C");
    //   } else if ( a >= 60) {
    //	       System.out.println("D");
    //    } else {
    //	       System.out.println("E");
    //   }
	//}
	
	

//問２
        int w=3347;		
		int [] A = new int[] {500,100,10,5,1};
		int [] B = new int[5];
		int sum=0;
		if(w<1) {
			System.out.println("金額が間違っています");
		}else {
			for(int i=0;i<5;) {
				if(A[i]<=w) {
					B[i]++;
					w=w-A[i];
					if(w==0)
						break;
				}
				else {
					i++;
				}
			}
		}
		System.out.println("コイン金額:");
		for(int i=0; i<5;i++) {
			System.out.printf(A[i]+"  ");
		}
		System.out.println("  ");
		System.out.println("各コイン金額に対応する枚数：");
		for(int j=0;j<5;j++) {
			System.out.printf(B[j]+" ");
			
		}
		System.out.println(" ");
		for(int j=0;j<5;j++) {
			sum=sum+B[j];
		}
	  
		}

}
		
	
	
	
	
	
	