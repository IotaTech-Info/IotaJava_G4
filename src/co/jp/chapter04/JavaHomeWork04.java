package co.jp.chapter04;

public class JavaHomeWork04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//問題1:int[] array = new int[4]; 各要素の値を記載してください
		//0, 0, 0, 0
		
		//問題2:int[] array = new int[] {5, 6}; 各要素の値を記載してください。
		//5, 6
		
		//問題3:int[][] array = new int[2][3]; 各要素の値を記載してください。
		//全部の値は　0　です

		//問題4:以下2重Foreachを理解してください。		
		//int [][] array2d =new int[4][2];
		//for (int[] out : array2d) {
		//	System.out.println(out + "out");
		//	for (int inner : out) {
		//		System.out.println(inner);

		//	}
		//}
		//First, create a 2D-array. Then, "out" are the rows of array2d, inner are the columns of array2d. 
		// it will execute 2 inner loops after each outer loop.

		//問題5:int[] array = new int[] {1, 3, 5, 7, 100, 0, 1}; 左の配列の最大値と最小桁値を System.out.println()
		int[] array = new int[] {1, 3, 5, 7, 100, 0, 1};
		System.out.println(getMaxAge(array));
		System.out.println(getMinAge(array));
		
		//問題6:問題1の配列のSUMを求める
		//0
		
		//問題7:行列(2次元配列)の和と積を計算してください。
		//sum
		int [][]a = {{1,2,4,5},{6,7,8,9},{10,11,12,13},{14,15,16,17}};
		int sum =0; 
		for(int i = 0; i < a.length; i++){ 
			for(int j = 0; j < a[i].length ;j++){
				sum = sum+ a[i][j]; 
			}
		}
		System.out.println(sum); 
		
		// mult
        int[][] arr = new int[a.length][a[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                for (int k = 0; k < a.length; k++) {
                    arr[i][j] += a[i][k] * a[k][j];
                }
            }
        }	

	}
	
	public static int getMinAge(int [] ages) {
        int min = ages[0];
        for(int i = 1;i<ages.length;i++){
            if(ages[i]<min){
                min = ages[i];
            }
        }
        return min;
    }
	
	public static int getMaxAge(int [] ages) {
        int max = ages[0];
        for(int i = 1;i<ages.length;i++){
            if(ages[i]>max){
                max = ages[i];
            }
        }
        return max;
    }
	
}