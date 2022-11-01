package co.jp.chapter05;

public class JavaHomeWork05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//質問１
	        int sum=0;

			for(int i=1;i<=100;i++){
			if(i%2==0){
			sum+=i;
			}
			}

			System.out.println("1から100までの偶数の和は"+sum);
			
		//質問２　5の階乗を求める(for)。
			int f = 1;
			for(int i=1; i<=5; i++){
			f = f * i;
			}
			System.out.println(f);
		//質問３︓配列 {1, 2, 6, 7, 9, 6, 2, 1} の最⼤値、最⼩値、和、平均値を求める。
			int[]array=new int[] {1,2,6,7,9,6,2,1};
			int max = array[0];
			int min = array[0];
			for(int i =1; i<array.length;i++) {
				if(array[i] > max) {
					max = array[i];
				}
				if(array[i] < min){
					min = array[i];
				}			
				 }
			int sum1 = 0;
			
			for(int i = 0; i<array.length;i++) {
				 sum1 = sum1+array[i];
			}
			 @SuppressWarnings("unused")
			double ave = sum1 / array.length;
			System.out.println("最大値は"+max);
			System.out.println("最小値は"+min);
		    System.out.println("配列の和は"+sum1);
		    System.out.println("平均値は"+ave);
		
		  //質問４　質問３の配列に重複ある要素を探す（要素の表⽰次数集計必要なし）。
		    int[]array1=new int[] {1,2,6,7,9,6,2,1};
		    int duplicate = 0;
		    for (int i = 0; i < array1.length; i++) {
		        for (int k = 0; k < array1.length; k++) {
		            if (k != i && array1[k] == array1[i]) {
		                duplicate++;
		            }
		        }
		    }
		    if(duplicate >= 1) {
		        System.out.println("重複しています");
		    }else{
		        System.out.println("重複していません");
		    }
		    
		  //質問５　質問３の配列に値「７」のインデックスを求む。
		  //質問６　任意⾏列（２次元配列）の積を求める。
		  //質問７　︓配列を昇順でソートする（java.util等メソッド利⽤禁⽌）。
		  //質問８　LV10のパスカルの三⾓形を出⼒してください。

		  //残りの質問は難しく、できませんでした。
	}
}
			
			
			
	
	
			
			
			
			

			
	

