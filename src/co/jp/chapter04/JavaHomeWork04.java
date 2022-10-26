package co.jp.chapter04;

public class JavaHomeWork04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		問題1:int[] array = new int[4]; 各要素の値を記載してください。
		System.out.println("回答1:{0,0,0,0}");
		
//		問題2:int[] array = new int[] {5, 6}; 各要素の値を記載してください。
		System.out.println("回答2:{5,6}");
		
//		問題3:int[][] array = new int[2][3]; 各要素の値を記載してください。 
		System.out.println("回答3:{{0,0,0},{0,0,0}}");
		
//		問題4:以下2重Foreachを理解してください。
//		int[][] array2d = new int[4][2];
//		for (int[] out : array2d) {
//			for (int inner : out) {
//				System.out.println(inner);
//			}
//		}
		System.out.println("回答4:4行2列の行列「array2d」を行の順番に各列の要素を出力する");
		
//		問題5:int[] array = new int[] {1, 3, 5, 7, 100, 0, 1}; 左の配列の最大値と最小値を System.out.println()。
		int[] array5 = new int[] {1, 3, 5, 7, 100, 0, 1};
		int max = 0;
		int min = 0;
		for (int i = 0; i < array5.length; i++) {
		    int v = array5[i];
		    if (v > max) {
		        max = v;
		    }
		    if (v < min) {
		        min = v;
		    }
		}
		System.out.println("回答5:配列の最大値は"+max+", 最大値の最小値は"+min);

//		問題6:問題1の配列のSUMを求める。 
		int[] array1 = new int[4];
		int sum = 0;
		for (int i = 0; i < array1.length; i++) {
			sum = sum + array1[i];
		}
		System.out.println("回答6:配列のSUMは"+sum);
		
//		問題7:行列(2次元配列)の和と積を計算してください。
		int[][] array2d = new int[4][2];
		int wa = 0;
		int seki = 1;	
		for (int i = 0; i < array2d.length; i++) {
			for (int j = 0; j < array2d[0].length; j++) {
				wa = wa + array2d[i][j];
				seki = seki * array2d[i][j];
				}
			}
		System.out.println("回答7:2次元配列の和は:"+wa+",積は:"+seki);
	}
}