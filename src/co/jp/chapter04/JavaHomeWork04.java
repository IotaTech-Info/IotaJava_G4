package co.jp.chapter04;

public class JavaHomeWork04 {

	public static void main(String[] args) {
		/**
		 * 1. array{0,0,0,0}
		 * 
		 * 2.array{5,6}
		 * 
		 * 3.array{ {0,0,0}, {0,0,0} }
		 * 
		 * 4.二次元配列array2dの要素をforeachで出力する。
		 * 
		 */

		// Q5.Q6
		int[] array = new int[] { 1, 3, 5, 7, 100, 0, 1 };
		int max = array[0], min = array[0];
		int sum = 0;
		for (int i : array) {
			if (i > max)
				max = i;
			if (i < min)
				min = i;
			sum += i;
		}
		System.out.println("最大値は" + max + "、最小値は" + min);
		System.out.println("配列のsumは" + sum);

		// Q7
		int[][] array2d_1 = new int[][] { { 1, 2 }, 
										  { 3, 4 } };
										  
		int[][] array2d_2 = new int[][] { { 5, 7 },
										  { 6, 8 } };
										
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
	}
}