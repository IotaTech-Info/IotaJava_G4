package co.jp.chapter04;

public class JavaHomeWork04 {

	public static void main(String[] args) {
//		問題１︓int[] array = new int[4]; 各要素の値を記載してください。
	//	[0,0,0,0]
		
//		問題２︓int[] array = new int[] {5, 6}; 各要素の値を記載してください。
	//  array[0]=5, array[1]=6
		
//		問題３︓int[][] array = new int[2][3]; 各要素の値を記載してください。
	//  一共有6个要素，全部要素的值都是0
		
//		問題４︓以下２重Foreachを理解してください。
		int[][] array2d = new int[4][2];
		for (int[] out : array2d) {
			 for (int inner : out) {
				 System.out.println(inner);
			 }
		}
		
	//  定义了一个大小为4×2的二维数组，由于没有初始值，每个元素的值都为0。
	//  在第一层循环中，依次访问二维数组的第一个维度，此时每轮循环的out都为一个一维数组。
	//  在第二层循环中依次访问该一维数组的每个元素，并将其输出。
		
		
//		問題５︓int[] array = new int[] {1, 3, 5, 7, 100, 0, 1}; 左の配列の最⼤値と最⼩桁値を
//		System.out.println()。
		int[] array = new int[] {1, 3, 5, 7, 100, 0, 1};
		int max = -1,
			min = 999;
		for (int num : array) {
			if (num > max) {
				max = num;
			}
			if (num < min) {
				min = num;
			}
		}
		System.out.println("最⼤値:"+max);
		System.out.println("最⼩値:"+min);
//		問題６︓問題１の配列のSUMを求める。
		int sum = 0;
		for (int num : array) {
			sum += num;
		}
		System.out.println(sum);
//		問題７︓⾏列（２次元配列）の和と積を計算してください。
		int array2d_sum = 0,
			array2d_pro = 1;
		for (int[] out : array2d) {
			 for (int inner : out) {
				 array2d_sum += inner;
				 array2d_pro *= inner;
			 }
		}
		System.out.println("和:"+array2d_sum);
		System.out.println("積:"+array2d_pro);
	}
}