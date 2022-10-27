package co.jp.chapter07;

public class JavaHomeWork07 {

	static int num;

	public static void main(String[] args) {

//		質問1
//		main関数にsetAgeを呼び出したが、Pet classにはsetAgeが定義されていない。

//		質問2
		int[] arr = { 2, 5, 7, 3, 9, 4, 8, 1 };

		int max = Math.max(arr);
		int min = Math.min(arr);
		int ave = Math.ave(arr);

		System.out.println("Max : " + max);
		System.out.println("Min : " + min);
		System.out.println("Ave : " + ave);
	}
	
	
	int[][] a = {{1,2},{3,4}};
	Matrix m = new Matrix(a);


	int[][] b = {{2,3},{4,5}};
	Matrix n = new Matrix(b);
	Matrix c = Matrix.add(n);

}
