package co.jp.chapter07;

public class JavaHomeWork07 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// 質問１︓ class pet 中不存在setAge函数

		// 質問２︓
		int[] array = { 10, 1, 61, 16, 7 };

		int max = Math.max(array);
		int min = Math.min(array);
		int avg = Math.avg(array);

		System.out.println("最大值：" + max + " 最小值：" + min + " 平均值：" + avg);

		int[][] array2D_1 = { { 1, 2 }, { 2, 3 } };
		int[][] array2D_2 = { { 3, 4 }, { 4, 5 } };
		Matrix a = new Matrix(array2D_1);
		Matrix b = new Matrix(array2D_2);

		Matrix sum = a.add(b);
		for (int[] i : sum.getData()) {
			for (int j : i) {
				System.out.print(j);
			}
			System.out.println("");
		}
	}
}
