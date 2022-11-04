package co.jp.chapter04;

public class JavaHomeWork04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*
	 問題1:int[] array = new int[4]; 各要素の値を記載してください。 
	 [0, 0, 0, 0]
	問題2:int[] array = new int[] {5, 6}; 各要素の値を記載してください。
	  [5,6]
	問題3:int[][] array = new int[2][3]; 各要素の値を記載してください。
	0,0,0,
    0,0,0,
	問題4:以下2重Foreachを理解してください。 
	二次元配列を一行つづ数値を表示する
	問題5:int[] array = new int[] {1, 3, 5, 7, 100, 0, 1}; 左の配列の最大値と最小桁値を System.out.println()。
	
	int []array =new int[] {1,3,5,7,100,0,1};
		for(int i =0;i<array.length;i++) {
			for (int j=i;j<array.length;j++) {
				if(i!=j) {
					if(array[i]>array[j]) {
						int temp = array[j];
						array[j] = array[i];
						array[i] = temp;
				}
			}
	    }
			
	}
		System.out.println(Arrays.toString(array));
		System.out.println(array[0]);
		System.out.println(array[6]);
		
    問題6:問題1の配列のSUMを求める。 
        int sum =0;
		int[] array = new int [4];
		for (int i=0; i<array.length; i++) {
			sum +=array[i];
		}
		System.out.println(sum);
   
    問題7:行列(2次元配列)の和と積を計算してください。
        int[][] array2d_1 = new int[][] { { 1, 2 }, 
			  { 3, 4 } };
			  
        int[][] array2d_2 = new int[][] { { 5, 6 },
			  { 7, 8 } };
			
        int[][] array2d_sum=new int [2][2] ;
        int[][] array2d_product=new int [2][2];

        for(int i=0;i<array2d_1.length;i++) {
        for(int j=0;j<array2d_1.length;j++) {
        array2d_sum[i][j]=array2d_1[i][j]+array2d_2[i][j];
        array2d_product[i][j]=array2d_1[i][j]*array2d_2[i][j];
}
}

        System.out.println("２次元配列の和は");
        for(int [] out:array2d_sum) {
        for(int inner:out) {
        System.out.print(inner+" ");
}
        System.out.println();
}

        System.out.println("２次元配列の積は");
        for(int [] out:array2d_product) {
        for(int inner:out) {
        System.out.print(inner+" ");
}
        System.out.println();
}
    
    
	 
	 */

	}
}
