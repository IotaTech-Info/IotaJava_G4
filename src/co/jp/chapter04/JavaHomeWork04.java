package co.jp.chapter04;

public class JavaHomeWork04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//JavaHomeWork04　配列
		
		//質問4.1：int[] array = new int[4];各要素の値を記載してください。
		//回答：array[0] = 0; array[1] = 0; array[2] = 0; array[3] = 0
		
		//質問4.2：int[] array = new int[]{5, 6};各要素の値を記載してください。
		//回答：array[0] = 5; array[1] = 6
		
		//質問4.3：int[] array = new int[2][3];各要素の値を記載してください。
		//回答：array[0][0] = 0; array[0][1] = 0; array[0][2] = 0;
		//	   array[1][0] = 0; array[1][1] = 0; array[1][2] = 0
		
		//質問4.4：以下2重Foreachを理解してください。
		int[][] array2d = new int[4][2];
		for(int[] out : array2d) {
			for(int inner : out) {
				System.out.println(inner);
			}
		}
		//回答：Foreachを利用し、2次元配列(行数：4、列数：2)の全部の要素を出入します。
		
		//質問4.5：int[] array = new int[] {1,3,5,7,100,0,1};左の配列の最大値と最小値をSystem.out.println()。
		//回答：
		int[] array_1 = new int[] {1,3,5,7,100,0,1};
		for(int i = 0; i < array_1.length; i++) {
			for(int j = i + 1; j < array_1.length; j++) {
				if(array_1[i] > array_1[j]) {
					int temp = array_1[i];
					array_1[i] = array_1[j];
					array_1[j] = temp;
				}
			}
		}
		System.out.println("配列の最小値は：");
		System.out.println(array_1[0]);
		
		System.out.println("配列の最大値は：");
		System.out.println(array_1[6]);
		
		//質問4.6：問題１の配列のSUMを求める。
		int[] array_2 = new int[] {1,2,3,4};  // 配列int[4]各元素の值を与える
		int SUM = 0;
		for(int i = 0 ;i < array_2.length; i++) {
			SUM += array_2[i];
		}
		System.out.println("配列の和は：");
		System.out.println(SUM);
		
		//質問4.7：行列(2次元配列)の和と積を計算してください。
		
		int[][] array2d_1 = new int[][] {
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};
		
		int[][] array2d_2 = new int[][] {
			{-1,0,1},
			{0,1,0},
			{1,0,-1}
		};
		
		int[][] array2d_sum = new int[3][3];
		int[][] array2d_multi = new int[3][3];
		
		for(int i = 0; i < array2d_1.length; i++) {
			for(int j = 0; j < array2d_1[i].length; j++) {
				array2d_sum[i][j] = array2d_1[i][j] + array2d_2[i][j];			
			}
		}
		
		for(int i = 0; i < array2d_1.length; i++) {
			for(int j = 0; j < array2d_1[i].length; j++) {
				array2d_multi[i][j] = array2d_1[i][j] * array2d_2[i][j];			
			}
		}
		
		System.out.println("行列の和は：");
		for(int i = 0; i < array2d_sum.length; i++) {
			for(int j = 0; j < array2d_sum[i].length; j++) {
				System.out.print(array2d_sum[i][j] + ",");			
			}
			System.out.println();
		}
		
		System.out.println("行列の積は：");
		for(int i = 0; i < array2d_multi.length; i++) {
			for(int j = 0; j < array2d_multi[i].length; j++) {
				System.out.print(array2d_multi[i][j] + ",");			
			}
			System.out.println();
		}
	}
} 