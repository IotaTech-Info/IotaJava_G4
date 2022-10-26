package co.jp.chapter05;

public class JavaHomeWork05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		設問1:1から100までの偶数の和を求める(for + if)。
//int sum = 0;
//for (int i = 1; i <= 100; i++) {
//	if (i % 2 == 0) {
//		sum = sum + i;
//	}
//}
//System.out.println(sum);
		
//		設問2:5の階乗を求める(for)。
//int mul = 1;
//for (int i = 5; i >= 1; i--) {
//	mul = mul * i;
//}
//System.out.println(mul);
		
//		質問3:配列 {1, 2, 6, 7, 9, 6, 2, 1} の最大値、最小値、和、平均値を求める。
//int array[] = new int[] { 1, 2, 6, 7, 9, 6, 2, 1 };
//int max = array[0];
//int min = array[0];
//int sum = 0;
//for (int i = 0; i < array.length; i++) {
//	sum = sum + array[i];
//	if (array[i] > max) {
//		max = array[i];
//	}
//	if (array[i] < min) {
//		min = array[i];
//	}
//}
//double value = Double.valueOf(sum) / array.length;
//System.out.println("最大値=" + max + ",最小値=" + min + ",和=" + sum + ",平均値=" + value);
		
//		質問4:質問3の配列に重複ある要素を探す(要素の表示次数集計必要なし)。
//System.out.print("重複ある要素は");
//int array[] = new int[] { 1, 2, 6, 7, 9, 6, 2, 1 };
//for (int i = 0; i < array.length; i++) {
//	for (int j = i + 1; j < array.length; j++) {
//		if (array[i] == array[j]) {
//			System.out.print(array[i] + " ");
//		}
//	}
//}
		
//		質問5:質問3の配列に値「7」のインデックスを求む。
//int array[] = new int[] { 1, 2, 6, 7, 9, 6, 2, 1 };
//for (int i = 0; i < array.length; i++) {
//	if (array[i] == 7) {
//		System.out.println("値7のインデックスは" + i);
//	}
//}
		
//		質問6:任意行列(2次元配列)の積を求める。
//int[][] array1 = new int[][] { { 2, 3 }, { 4, 5 } };
//int[][] array2 = new int[][] { { 6, 7 }, { 8, 9 } };
//int[][] mul = new int[][] { { 0, 0 }, { 0, 0 } };
//for (int i = 0; i < array1.length; i++) {
//	for (int j = 0; j < array1[i].length; j++) {
//		mul[i][j] = array1[i][j] * array2[i][j];
//	}
//}
//System.out.println("積は:");
//for (int i = 0; i < array1.length; i++) {
//	for (int j = 0; j < array1[i].length; j++) {
//		System.out.print(mul[i][j] + " ");
//	}
//	System.out.println();
//}
		
//		質問7:配列を昇順でソートする(java.util等メソッド利用禁止)。
//		int array[] = new int[] { 1, 2, 6, 7, 9, 4, 5, 0 };
//		for(int i=0;i<array.length;i++) {
//			for (int j = i+1; j<array.length; j++) {
//				if(array[i] > array[j]) {
//					int temp = array[i];
//					array[i] = array[j];
//					array[j] = temp;
//				}
//			}
//		}
//		
//		for(int i = 0; i < array.length; i++) {
//			System.out.print(array[i] + " ");
//		}
		
//		質問8:LV10のパスカルの三角形を出力してください。
//		int n = 10;
//        for (int line = 1; line <= n; line++) {
//            for (int j = 0; j <= n - line; j++) {
//                System.out.print("  ");
//            }
//            int C = 1;
//            for (int i = 1; i <= line; i++) {
//            	if (C < 10) {
//            		System.out.print(C + "   ");
//            	} else if (C >= 10 && C <100) {
//            		System.out.print(C + "  ");
//            	} else {
//            		System.out.print(C + " ");
//            	}
//                C = C * (line - i) / i;
//            }
//            System.out.println();
//        }

	}
}
