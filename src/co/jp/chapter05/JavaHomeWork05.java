package co.jp.chapter05;

public class JavaHomeWork05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// 新米8問

		// 質問１ 1から100までの偶数の和を求める（for + if）
		int sum = 0;
		for (int i = 1; i < 101; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);

		// 質問２ 5の階乗を求める（for)

		int mul = 1;
		for (int i_2 = 1; i_2 < 6; i_2++) {
			mul *= i_2;
		}
		System.out.println(mul);

		// 質問３ 配列 {1, 2, 6, 7, 9, 6, 2, 1} の最⼤値、最⼩値、和、平均値を求める。
		int array[] = new int[] { 1, 2, 6, 7, 9, 6, 2, 1 };
		int max = array[0];
		int min = array[0];
		float sum_3 = 0;
		float average = 0;
		for (int i_3 = 0; i_3 < array.length; i_3++) {
			sum_3 += array[i_3];
			if (max < array[i_3]) {
				max = array[i_3];
			}
			if (min > array[i_3]) {
				min = array[i_3];
			}
		}
		average = sum_3 / array.length;
		int sum_int = (int) sum_3;

		System.out.println("最大値は" + max);
		System.out.println("最小値は" + min);
		System.out.println("和は" + sum_int);
		System.out.println("平均値は" + average);

		// 質問４︓質問３の配列に重複ある要素を探す（要素の表⽰次数集計必要なし）。
		for (int i_4 = 0; i_4 < array.length; i_4++) {
			for (int j_4 = i_4 + 1; j_4 < array.length; j_4++) {
				if (array[i_4] == array[j_4]) {
					System.out.println(array[i_4] + "は重複ある要素");
				}
			}
		}

		// 質問５︓質問３の配列に値「７」のインデックスを求む。 
		int position = 0;
		for (int i_5 = 0; i_5 < array.length; i_5++) {
			if (array[i_5] == 7) {
				position = i_5;
			}
		}
		System.out.println("7のインデックスは" + position);

		// 質問６︓任意⾏列（２次元配列）の積を求める。 0.5分

		int[][] array6 = new int[][] { { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 } };

		int outermul6 = 1;
		int innermul6 = 1;

		for (int i_6 = 0; i_6 < array6.length; i_6++) {
			for (int j_6 = 0; j_6 < array6[i_6].length; j_6++) {
				innermul6 *= array6[i_6][j_6];
			}
			outermul6 *= innermul6;

			innermul6 = 1;
		}
		System.out.println("乘积为" + outermul6);

		// 質問７︓配列を昇順でソートする（java.util等メソッド利⽤禁⽌）。 

		int[] array7 = new int[] { 1, 16, 8, 9, 2 };
		int temp = 0;

		for (int i_7 = 0; i_7 < array7.length; i_7++) {
			for (int j_7 = i_7 + 1; j_7 < array7.length; j_7++) {
				if (array7[i_7] > array7[j_7]) {
					temp = array7[i_7];
					array7[i_7] = array7[j_7];
					array7[j_7] = temp;
				}
			}

		}
		for (int i_7 = 0; i_7 < array7.length; i_7++) {
			System.out.print(array[i_7] + " ");
		}

		System.out.println();

		// 質問８︓LV10のパスカルの三⾓形を出⼒してください。

		int level = 10;

		int[][] arr = new int[level][];
		for (int i_10 = 0; i_10 < level; i_10++) {
			arr[i_10] = new int[i_10 + 1];
		}

		for (int i = 0; i < level; i++) {
			arr[i][0] = 1;
			arr[i][i] = 1;
		}

		for (int i = 2; i < level; i++) {
			for (int j = 1; j < i; j++) {
				arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
			}
		}

		System.out.println("パスカル三角形");
		for (int i = 0; i < level; i++) {
			for (int k = level - i - 1; k > 0; k--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
