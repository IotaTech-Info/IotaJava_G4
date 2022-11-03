package co.jp.chapter05;

public class JavaHomeWork05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		question01();
		question02();
		question03();
		question04();
		question05();
		question06();

		question08();
	}

	static void question01() {
		System.out.println("");
		System.out.println("設問１");
		int sum = 0;
		for (int i = 1; i < 101; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}

		System.out.println("1から100までの偶数の和は" + sum);
	}

	static void question02() {
		System.out.println("");
		System.out.println("設問２");
		int factorial = 1;
		for (int i = 1; i <= 5; i++) {
			factorial *= i;
		}
		System.out.println("5の階乗は" + factorial);

	}

	static void question03() {
		System.out.println("");
		System.out.println("設問３");
		int[] array = new int[] { 1, 2, 6, 7, 9, 6, 2, 1 };
		int max = array[0];
		int min = array[0];
		int sum = 0;
		int mean = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
			if (array[i] < min) {
				min = array[i];
			}
			sum += array[i];
		}
		mean = sum / array.length;
		System.out.println("最大値:" + max + "最小値:" + min);
		System.out.println("和は" + sum);
		System.out.println("平均値は" + mean);
	}

	static void question04() {
		System.out.println("");
		System.out.println("設問４");
		int[] array = new int[] { 1, 2, 6, 7, 9, 6, 2, 1 };

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					System.out.println("重複ある要素は" + array[i] + " ");
				}
			}
		}

	}

	static void question05() {
		System.out.println("");
		System.out.println("設問５");

		int[] array = new int[] { 1, 2, 6, 7, 9, 6, 2, 1 };

		for (int i = 0; i < array.length; i++) {

			if (array[i] == 7) {
				System.out.println("値「７」のインデックスは" + i + " ");

			}
		}
	}

	static void question06() {
		System.out.println("");
		System.out.println("設問６");

		int[][] array_1 = new int[][] { { 1, 2 }, { 3, 4 } };

		int[][] array_2 = new int[][] { { 5, 6 }, { 7, 8 } };

		int[][] mul = new int[2][2];

		for (int i = 0; i < array_1.length; i++) {
			for (int j = 0; j < array_1[i].length; j++) {
				mul[i][j] = array_1[i][j] * array_2[i][j];
			}
		}

		System.out.println("二次元配列の積は");
		for (int i = 0; i < array_1.length; i++) {
			for (int j = 0; j < array_1[i].length; j++) {
				System.out.print(mul[i][j] + "  ");
			}
			System.out.println("");
		}
	}

	static void question07(int[] array) {
		System.out.println("");
		System.out.println("設問７");
		int x = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					x = array[j];
					array[j] = array[i];
					array[i] = x;
				}
			}
		}
	}

	static void question08() {
		int[][] array = new int[10][10];
		array[0][0] = 1;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array[i].length - 1; j++) {
				array[i + 1][j] += array[i][j];
				array[i + 1][j + 1] += array[i][j];

			}
			System.out.println(" ");
			for (int a = 0; a < array.length; a++) {
				for (int b = 0; b < array[a].length; b++) {
					System.out.print(" " + array[a][b]);

				}
				System.out.println(" ");
			}
			System.out.println(" ");
		}
	}
}