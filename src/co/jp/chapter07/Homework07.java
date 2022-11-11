package co.jp.chapter07;

public class Homework07 {
	//質問１︓以下コードのコンパイルエラー理由を教えてください。

//	// Pet.java 
//	public class Pet { 
//	public String name; 
//
//	public void setName(String value) {
//	 this.name = value; 
//	}
//	 } 
//	// Kicker.java
//	 public class Kicker {
//	 public static void main(String...args) {
//	 Pet cat = new Pet(); 
//	cat.setAge(1234); 
//	}
//	 }
	
	
//	理由；Pet classの中のsetAgeというメソッドが定義されていないのに
//	Main関数がsetAgeを呼び出した。

	


//	質問２︓Mathクラスを作成してください。以下メソッドを定義します。
//
//	1. 配列のMAXを求める静的メソッドを定義。（引数は int 配列）
//	 2. 配列のMINを求める静的メソッドを定義。（引数は int 配列） 
//	3. 配列の平均値を求める静的メソッドを定義。（引数は int 配列） 
//	4. mainメソッドで上記それぞれメソッドを呼び出してください。

	    public static void main(String[] args) {
	        int[] array = new int[] { 1, 2, 3, 4 };
	       
	        System.out.println("配列の最大値は" + max(array));
	        System.out.println("配列の最小値は" + min(array));
	        System.out.println("配列の平均値は" + ave(array));
	        
	    }


//配列のMAX値
public static int max(int[]datas){
    int b = datas[0];
    for(int i = 0 ; i <datas.length ; i++){
        if (datas[i]>b){
            b = datas[i];
        }
    }
    return b;
}

//配列のMIN値
public static int min(int[]datas){
    int c = datas[0];
    for(int i = 0 ; i <datas.length ; i++){
        if(datas[i]<c){
            c = datas[i];
        }
    }
    return c;
}

public static int ave(int[]datas) {
	  int a = 0;
      for(int i = 0 ; i <datas.length ; i++){
          a += datas[i];
      }
       int d = a/datas.length;
       return d;
}



}
