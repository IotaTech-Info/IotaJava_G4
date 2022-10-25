package co.jp.chapter05;

public class JavaHomeWork05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//JavaHomeWork05 新米8問
		
		//質問5.1：1から100までの偶数の和を求める(for + if)。
		int sum = 0;
		for(int i = 0; i < 101; i++) {
			if(i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("1から100までの偶数の和は：" + sum);

		
		//質問5.2：5の階乗を求める(for)。
		int x = 1;

		for (int i = 1; i <= 5; i++) {
			x = x * i;
		}
		System.out.println("5の階乗は：" + x);
		
		//質問5.3：配列 {1, 2, 6, 7, 9, 6, 2, 1} の最大値、最小値、和、平均値を求める。
		int[] array = new int[]{1,2,6,7,9,6,2,1};
		int sum_1 = 0;
		
		for(int i = 0; i < array.length; i++) {
			for(int j = i + 1; j < array.length; j++) {
				if(array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < array.length; i++) {
			sum_1 += array[i];		
		}		
		System.out.println("配列の最小値は：" + array[0]);
		System.out.println("配列の最大値は：" + array[array.length - 1]);
		System.out.println("配列の和は：" + sum_1);
		System.out.println("配列の平均値は：" + (float)sum_1 / array.length);
		
		//質問5.4：質問5.3の配列に重複ある要素を探す（要素の表示次数集計必要なし）。
		int[] array_1 = new int[]{1,2,6,7,9,6,2,1};
		int count = 0;
		
		System.out.print("配列に重複ある要素は：");

		for (int i = 0; i < array_1.length; i++) {
			for (int j = i + 1; j < array_1.length; j++) {
				if (array_1[i] == array_1[j]) {
					count++;
				}
			}
			if(count == 1) {
				System.out.print(array_1[i] + " ");
			}
			count = 0;
		}
		
		System.out.println();
		
		//質問5.5：質問5.3の配列に値「７」のインデックスを求む。
		int[] array_2 = new int[]{1,2,6,7,9,6,2,1};
		
		System.out.print("配列に値「７」のインデックスは：");
		for(int i = 0; i < array_2.length; i++) {
			if(array_2[i] == 7) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		
		//質問5.6：任意行列（２次元配列）の積を求める。
		int[][] array2d_1 = new int[][] {
			{1,2,3},
			{4,5,7},
			{7,8,9}
		};
		
		int[][] array2d_2 = new int[][] {
			{0,1,0},
			{1,0,-1},
			{0,-1,0}
		};
		
		int[][] array2d_multi = new int[3][3];
		
		for(int i = 0; i < array2d_1.length; i++) {
			for(int j = 0; j < array2d_1[i].length; j++) {
				array2d_multi[i][j] = array2d_1[i][j] * array2d_2[i][j];			
			}
		}
		
		System.out.println("行列の積は：");
		for(int i = 0; i < array2d_multi.length; i++) {
			for(int j = 0; j < array2d_multi[i].length; j++) {
				System.out.print(array2d_multi[i][j] + ",");			
			}
			System.out.println();
		}
		
		//質問5.7：配列を昇順でソートする（java.util等メソッド利用禁止）。
		int[] array_3 = new int[]{1,4,3,6,99,56,23,7,54,101};
		
		for (int i = 0; i < array_3.length; i++) {
			for (int j = i + 1; j < array_3.length; j++) {
				if (array_3[i] > array_3[j]) {
					int temp = array_3[i];
					array_3[i] = array_3[j];
					array_3[j] = temp;
				}
			}
		}
		
		System.out.print("配列の昇順は：");
		for (int i = 0; i < array_3.length; i++) {
			System.out.print(array_3[i] + " ");
		}
		
		System.out.println();
		
		//質問5.8：LV10のパスカルの三角形を出入してください。
		int[][] Yanghui_10 = new int[10][];
		
		for (int i = 0; i < Yanghui_10.length; i++) {
			Yanghui_10[i] = new int[i + 1];
			Yanghui_10[i][0] = 1;
			Yanghui_10[i][i] = 1;

			if (i > 1) {
				for (int j = 1; j < Yanghui_10[i].length - 1; j++) {
					Yanghui_10[i][j] = Yanghui_10[i - 1][j - 1] + Yanghui_10[i - 1][j];
				}
			}
		}
		
		System.out.println("LV10のパスカルの三角形:");
		
		for(int i = 0; i < Yanghui_10.length; i++) {
			for(int j = 0; j < Yanghui_10.length - 1 - i; j++) {
				System.out.print("  ");
			}
			for(int k = 0; k < Yanghui_10[i].length; k++) {
				System.out.print(Yanghui_10[i][k] + "   ");
			}
			System.out.println();
		}
	}
}
