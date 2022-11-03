package co.jp.chapter04;

public class JavaHomeWork04 {

	public static void main(String[] args) {
		//問題１︓int[] array = new int[4]; 各要素の値を記載してください。
		//array[0]=0
		//array[1]=0
		//array[2]=0
		//array[3]=0
		
		//問題２︓int[] array = new int[] {5, 6}; 各要素の値を記載してください。
		//array[0]=5
		//array[1]=6
		
		//問題３︓int[][] array = new int[2][3]; 各要素の値を記載してください。
		//array[0][0]=0   array[0][1]=0   array[0][2]=0  
		//array[1][0]=0   array[1][1]=0   array[1][2]=0  
		
		//問題４︓以下２重Foreachを理解してください。
		/*
		 int[][] array2d = new int[4][2];
		 for (int[] out : array2d) {
 			for (int inner : out) {
 				System.out.println(inner);
 			}
		}
		 */
		/*
		  int[][] array2d = new int[4][2];
		 for (int i=0;i<array2d.length;i++) {
 			for (int j=0;j<array2d[i].length;j++) {
 				System.out.println(array2d[i][j]);
 			}
		}
		と同じ意味です。
		 */
		
		//問題５︓int[] array = new int[] {1, 3, 5, 7, 100, 0, 1}; 左の配列の最大値と最小値をSystem.out.println()。
		/*
		int[] array = new int[] {1, 3, 5, 7, 100, 0, 1};
		int max=0;
		int min=0;
		 for (int i=0;i<array.length;i++) {
 			if(array[i]>max)
 			{
 				max=array[i];
 			}
 			if(array[i]<min)
 			{
 				min=array[i];
 			}	
		}
		 System.out.println("max="+max+",min="+min);
		 
		 */
		//実行結果：max=100,min=0
		
		//問題６︓問題１の配列のSUMを求める。
		/*
		 ︓int[] array = new int[4];
		  int sum=0;
		  for(int x : array) {
			 sum+=x;	 
		  }
		  System.out.println(sum);
		 */
		//実行結果：0
		
		//問題７︓行列（２次元配列）の和と積を計算してください。
		/*int[][] array1 = new int[][]{
		 {1, 2},
		 {3, 4}
		};
		int[][] array2 = new int[][]{
		 {5, 6},
		 {7, 8}
		};
		int[][] resultSum= new int[2][2];
		int[][] resultMult= new int[2][2];
		for (int i=0;i<array1.length;i++) {
 			for (int j=0;j<array1[i].length;j++) {
 				resultSum[i][j]=array1[i][j]+array2[i][j];
 				resultMult[i][j]=array1[i][j]*array2[i][j];
 			}
		}

		 	*/
	}
}