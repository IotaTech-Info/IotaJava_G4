package co.jp.chapter04;

public class JavaHomeWork04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

//		設問 1
//		0, 0, 0, 0
////		
////		設問 2
//		5, 6 
////		設問 3
//		0, 0, 0
//		0, 0, 0
////		設問 4
//		配列の中身を出力する
//		設問 5
		int[] array_5 = new int[] {1, 3, 5, 7, 100, 0, 1};
			for(int i = 0; i < array_5.length; i++) {
				for(int j = i; j < array_5.length; j++) {
					if (j != i) {
						if (array_5[i] >= array_5[j]) {
							int temp = array_5[j];
							array_5[j] = array_5[i];
							array_5[i] = temp;
						}
					}
				}
			}
			System.out.println("max : " + array_5[array_5.length-1]);
			System.out.println("min : " + array_5[0]);
			System.out.println("最小桁数 : " + Integer.toString(array_5[0]).length());

//		設問 6
			int[] array_1 = new int[4];
			int sum1 = 0;
			for(int i = 0; i < array_1.length; i++) {
				sum1 = sum1 + array_1[i];
			}
			System.out.println(sum1);
//		設問 7
			int[] array_71 = new int[] {1, 2, 3, 4};
			int[] array_72 = new int[] {5, 6, 7, 8};
			int[] sum = new int[4]; 
			
			for(int i = 0; i < array_71.length; i++) {
				sum[i] = array_71[i] + array_72[i];
			}
			
			for(int j = 0; j < sum.length; j++) {
				System.out.print(sum[j] + ", ");
			}
			

//		int[][] array = new int[2][3];
//		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j < array[i].length; j++) {
//				System.out.print(array[i][j]);
//			}
//			System.out.println("");
//		}
		
//		int[][] array2d = new int[4][2];
//
//		for (int[] out : array2d) {
//			for(int inner :out) {
//				System.out.print(inner);
//			}
//			System.out.println("");
//		}
	}
}
