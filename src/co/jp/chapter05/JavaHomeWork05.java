package co.jp.chapter05;

public class JavaHomeWork05 {

	public static void main(String[] args) {
		//設問１︓1から100までの偶数の和を求める(for + if)。
		/*
		 int sum = 0;
	     for(int i = 1; i < 101; i++) {
			if(i % 2 == 0) { // 偶数判断
				sum = sum + i; // 偶数の和を求める
			}
		}
		 System.out.println(sum);
		 */
		//実行結果：2550
		
		
		//設問２︓5の階乗を求める(for)。
		/*
		 int result = 1;
	     for(int i = 1; i < 6; i++) {
			
				result = result* i; 
			
		}
		 System.out.println(result);
		 */
		//実行結果：120
		
		//質問３︓配列 {1, 2, 6, 7, 9, 6, 2, 1} の最大値、最小値、和、平均値を求める。
		/*
		int[] array = new int[] {1, 2, 6, 7, 9, 6, 2, 1};
		int max=0;
		int min=0;
		int sum=0;
		int avg=0;
		
		 for (int i=0;i<array.length;i++) {
		    sum+=array[i];
 			if(array[i]>max)
 			{
 				max=array[i];
 			}
 			if(array[i]<min)
 			{
 				min=array[i];
 			}
		}
		avg=sum/array.length;
		System.out.println("max="+max+",min="+min+",sum="+sum+",avg="+avg);
		 */
		//実行結果：max=9,min=0,sum=34,avg=4
		
		//質問４︓質問３の配列に重複ある要素を探す（要素の表示次数集計必要なし）。
		/*
		int[] array = new int[] {1, 2, 6, 7, 9, 6, 2, 1};

		 for (int i=0;i<array.length-1;i++) {
		     for (int j=i+1;j<array.length;j++) {
				if(array[i]==array[j]){
					System.out.println(array[i]+"が重複している。");
				}
			}
		}
		 */
		//実行結果：
		/*
		 1が重複している。
		 2が重複している。
		 6が重複している。
		 */
		
		//質問５︓質問３の配列に値「７」のインデックスを求む。
		/*
		int[] array = new int[] {1, 2, 6, 7, 9, 6, 2, 1};

		 for (int i=0;i<array.length-1;i++) {
		    if(array[i]==7){
				System.out.println(i);
			}	
		}
		 */
		//実行結果：3
		
		//質問６︓任意行列（２次元配列）の積を求める。
		/*int[][] array1 = new int[][]{
		 {1, 2},
		 {3, 4}
		};
		int[][] array2 = new int[][]{
		 {5, 6},
		 {7, 8}
		};
		int[][] resultMult= new int[2][2];
		for (int i=0;i<array1.length;i++) {
			for (int j=0;j<array1[i].length;j++) {
				resultMult[i][j]=array1[i][j]*array2[i][j];
				System.out.print(resultMult[i][j]+" ");
			}
			System.out.println("");
		}
		 	*/
		//実行結果：
		//5 12 
		//21 32 

		//質問７︓配列を昇順でソートする（java.util等メソッド利用禁止）。
		/*
		int[] array = new int[] {1, 2, 6, 7, 9, 6, 2, 1};
		int swap=0;
		 for (int i=0;i<array.length-1;i++) {
		     for (int j=i+1;j<array.length;j++) {
				if(array[i]>array[j]){
					swap=array[i];
					array[i]=array[j];
					array[j]=swap;
				}
			}
		}
		for (int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		 */
		//実行結果：1 1 2 2 6 6 7 9 
		
		//質問８︓LV10のパスカルの三角形を出力してください。
		/*
		 int level=10;
         int[][]arr=new int[level][level];
         for(int i=0;i<level;i++){
             for(int j=0;j<=i;j++){
                 if(j==0||j==i){
                   arr[i][j]=1;
                 }else{
                  arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
                 }
             }
         }
   
         for(int i=0;i<level;i++){
           for(int j=0;j<level-i;j++){
             System.out.print(" ");
           }
            for(int k=0;k<=i;k++){
             System.out.print(arr[i][k]+" ");
             }
             System.out.println();
        }
		 */
		//実行結果：
		/*
		  1 
         1 1 
        1 2 1 
       1 3 3 1 
      1 4 6 4 1 
     1 5 10 10 5 1 
    1 6 15 20 15 6 1 
   1 7 21 35 35 21 7 1 
  1 8 28 56 70 56 28 8 1 
 1 9 36 84 126 126 84 36 9 1 
		 */
	}
}
