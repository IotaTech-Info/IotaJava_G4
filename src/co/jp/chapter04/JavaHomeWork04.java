package co.jp.chapter04;

public class JavaHomeWork04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// 問題 1︓ {0,0,0,0} array[0] = 0; array[1] = 0; array[2] = 0; array[3] = 0;

		// 問題 2︓ {5,6} array[0] = 5; array[1] = 6;

		// 問題 3︓ {{0,0,0},{0,0,0}}
		// array[0][0] = 0; array[0][1] = 0; array[0][2] = 0;
		// array[1][0] = 0; array[1][1] = 0; array[1][2] = 0;

		// 問題 4︓ array2dのすべての要素を表示する

		question05();
		question06();
		question07();
	}

	static void question05() {
		int[] array = new int[] { 1, 3, 5, 7, 100, 0, 1 };
		int max = array[0];
		int min = array[0];
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
			if (array[i] < min) {
				min = array[i];
			}
			sum += array[i];
		}

		System.out.println("最大値:" + max + "最小値:" + min);
		System.out.println("配列の和は" + sum);

	}

	static void question06() {
		int[] array = new int[4];
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		System.out.println("配列の和は" + sum);

	}

	static void question07() {
		int[][] array_1 = new int[][] { { 1, 2 }, { 3, 4 } };

		int[][] array_2 = new int[][] { { 5, 6 }, { 7, 8 } };

		int[][] sum = new int[2][2];
		int[][] mul = new int[2][2];

		for (int i = 0; i < array_1.length; i++) {
			for (int j = 0; j < array_1[i].length; j++) {
				sum[i][j] = array_1[i][j] + array_2[i][j];
				mul[i][j] = array_1[i][j] * array_2[i][j];
			}
		}

		System.out.println("二次元配列の和は");
		for (int i = 0; i < array_1.length; i++) {
			for (int j = 0; j < array_1[i].length; j++) {
				System.out.print(sum[i][j] + "  ");
			}
			System.out.println("");
		}

		System.out.println("二次元配列の積は");
		for (int i = 0; i < array_1.length; i++) {
			for (int j = 0; j < array_1[i].length; j++) {
				System.out.print(mul[i][j] + "  ");
			}
			System.out.println("");
		}
	}

}