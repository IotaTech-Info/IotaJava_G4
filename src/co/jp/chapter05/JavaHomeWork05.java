package co.jp.chapter05;

public class JavaHomeWork05 {

	public static void main(String[] args) {
/*
 * 
 * 設問1:1から100までの偶数の和を求める(for + if)。 
 * 設問2:5の階乗を求める(for)。
 * 質問3:配列 {1, 2, 6, 7, 9, 6, 2, 1} の最大値、最小値、和、平均値を求める。 
 * 質問4:質問3の配列に重複ある要素を探す(要素の表示次数集計必要なし)。 
 * 質問5:質問3の配列に値「7」のインデックスを求む。 
 * 質問6:任意行列(2次元配列)の積を求める。 
 * 質問7:配列を昇順でソートする(java.util等メソッド利用禁止)。 
 * 質問8:LV10のパスカルの三角形を出力してください。
 */
		
		//設問1:1から100までの偶数の和を求める(for + if)。 
		int sum=0;
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				sum=sum+i;
			}	
		}
		System.out.println("設問1:1から100までの偶数の和を求める:"+sum);
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		//設問2:5の階乗を求める(for)。
		sum=1;
		for(int i=1;i<=5;i++) {
			sum=sum*i;
		}
		System.out.println("設問2:5の階乗を求める:"+sum);
		System.out.println();
		System.out.println();
		System.out.println();
		
		// 質問3:配列 {1, 2, 6, 7, 9, 6, 2, 1} の最大値、最小値、和、平均値を求める。 
		int[] array = new int[] {1, 2, 6, 7, 9, 6, 2, 1};
		int max=-2147483648,min=2147483647;
		sum=0;
		for (int x :array) {
			if(min>x)min=x;
			if(max<x)max=x;
			sum=sum+x;
		}
		System.out.println("質問3:配列 {1, 2, 6, 7, 9, 6, 2, 1} の最大値、最小値、和、平均値を求める。 ");
		System.out.print("最大値:"+max);
		System.out.print(" 最小値:"+min);
		System.out.print(" 和:"+sum);
		System.out.print(" 平均値:"+(sum*1.0/array.length));
		System.out.println();
		System.out.println();
		System.out.println();
		
		//質問4:質問3の配列に重複ある要素を探す(要素の表示次数集計必要なし)。 
		System.out.println("質問4:質問3の配列に重複ある要素:");
		for(int i=0;i<array.length-1;i++) {
			for(int j=i+1;j<array.length-1;j++) {
				if(array[i]==array[j]) {
					System.out.print(array[i]+" ");
				}
			}
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		//質問5:質問3の配列に値「7」のインデックスを求む。 
		int index = 0;
		for(int i=0;i<array.length-1;i++) {
			if(array[i]==7) {
				index=i;break;
			}
		}
		System.out.println("質問5:質問3の配列に値「7」のインデックス:"+index);
		System.out.println();
		System.out.println();
		System.out.println();
		
		//質問6:任意行列(2次元配列)の積を求める。 
		int[][] array2 = new int[][] {
			{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}
		};
		int multi=1;
		for(int[] out:array2) {
			for(int inner: out){
				multi=multi*inner;
			}
		}
		System.out.println("質問6:任意行列(2次元配列)の積:"+multi);
		System.out.println();
		System.out.println();
		System.out.println();
		
		//質問7:配列を昇順でソートする(java.util等メソッド利用禁止)。 
		int temp;
		int[] array3=new int[] {1, 2, 6, 7, 9, 6, 2, 1};
		for(int i=0;i<array3.length-1;i++) {
			for(int j=0;j<array3.length-1-i;j++) {
				if(array3[j]>array3[j+1]) {
					temp=array3[j];
					array3[j]=array3[j+1];
					array3[j+1]=temp;
				}
			}
		}
		System.out.println("質問7:配列を昇順でソートする:");
		for(int i:array3) {
			System.out.print(i+"  ");
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		// 質問8:LV10のパスカルの三角形を出力してください。
		
		

		System.out.println();
		System.out.println("質問8:LV10のパスカルの三角形を出力してください。");
		int height=10;
		int [][] triangular=new int[height+1][height+1] ;

		triangular[0][0]=1;
		for(int i=1;i<=height;i++) {
			triangular[i][0]=1;
			triangular[i][i]=1;
			triangular[i][1]=i;
			triangular[i][i-1]=i;	
		}
		for(int i=4;i<=height;i++) {
			for(int j = 2;j<i+1;j++) {
				triangular[i][j]=triangular[i-1][j]+triangular[i-1][j-1];
			}
		}
		
		
	      for (int[] row : triangular)
	      {
	         for (int i : row) {
	        	 if(i==0)continue;
	            System.out.printf("%4d", i);
	         }
	         System.out.println();
	      }
			System.out.println();
			
		
		
		/*
		 * 
		 * 
   1
   1   1
   1   2   1
   1   3   3   1
   1   4   6   4   1
   1   5  10  10   5   1
   1   6  15  20  15   6   1
   1   7  21  35  35  21   7   1
   1   8  28  56  70  56  28   8   1
   1   9  36  84 126 126  84  36   9   1
   1  10  45 120 210 252 210 120  45  10   1
		 */
		
	}
}
