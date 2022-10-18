package co.jp.chapter03;

public class JavaHomeWork03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
	
	//質問１
		int a = 56;
	        System.out.println("成績ランキング判断。入力値=" + a);
	// 以下コードを完成してください。
	        if(a >=90) {
	            System.out.println("A");
	        } else if(a < 90 && a >= 80 ) {
	            System.out.println("B");
	        } else if(a < 80 && a >= 70) {
	            System.out.println("C");
	        } else if(a < 70 && a >= 60) {
	            System.out.println("D");
	        } else {
	            System.out.println("E");
	        }

	    
	System.out.println("=============================");
	
	//質問２
    int b = 0;  //500円
    int c = 0;  //100円
    int d= 0;  //10円
    int e = 0;  //5円
    int f = 0; //1円

    int i = 3340;


    if( i >= 500 ){
            b=i/500;
            i %= 500;

        } if(i < 500 && i>=100){
            c = i / 100;
            i %= 100;

        }if(i>=10 &&  i < 100){
            d = i / 10;
            i %= 10;
        }if(i>=5 && i < 10  ){
            e = i % 5;
            i %=  5;
        } if(i>=1&& i < 5){
            i %= 1;

        }



    System.out.println("500円"+ b);
    System.out.println("100円"+ c);
    System.out.println("10円"+ d);
    System.out.println("5円"+ e);
    System.out.println("1円"+ f);
    
    
    
    
    System.out.println("=============================");
    //打印米字旗
    int l = 11;
	
	for(int m = 0;m < l;m++) {
		for(int j = 0;j<l;j++) {
			if(m==j||m+j == 10 ||m==5||j==5) {
				System.out.print(""+m+j+"  ");
			}else {
				System.out.print("   ");
			}
		}
		System.out.println();
    

}
	
	}
}



	