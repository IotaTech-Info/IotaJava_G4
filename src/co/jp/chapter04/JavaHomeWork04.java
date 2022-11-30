package co.jp.chapter04;

public class JavaHomeWork04 {

	public static void main(String[] args) {
		
		//問題１︓int[] array = new int[4]; 各要素の値を記載してください。
		//回答：{0,0,0,0}
		
		//問題２︓int[] array = new int[] {5, 6}; 各要素の値を記載してください。
		//回答：{5,6}
		
		//問題３︓int[][] array = new int[2][3]; 各要素の値を記載してください。
		//回答：{0,0,0,
		//       0,0,0}
		
		//問題４︓以下２重Foreachを理解してください。
		int[][] array2d = new int[4][2];
		for (int[] out : array2d) {
			for (int inner : out) {
				System.out.println(inner);
			}
		}
		//回答：4行2列の2次元配列の要素を行ずつ見せる
		
		//問題５︓int[] array = new int[] {1, 3, 5, 7, 100, 0, 1}; 左の配列の最⼤値と最⼩値をSystem.out.println()。
		//回答：
		int[] array_Q5 = new int[] {1, 3, 5, 7, 100, 0, 1};
		int max = 0;
		int min = 0;
		for (int i : array_Q5) {
			if (max>=i) {
				max=i;
			}
			if(min<=i) {
				min=i;
			}
		}
		System.out.println("最大値："+max);
		System.out.println("最小値："+min);
		
		//問題６︓問題１の配列のSUMを求める。
		//回答：
		int[] array_Q1 = new int[4];
		int sum =0;
		for (int i :array_Q1) {
			sum+=i;
		}
		System.out.println("問題１の配列のSUMは"+sum);
		
		
		

	}
	//問題７︓⾏列（２次元配列）の和と積を計算してください。
		//回答：
	public static int addUp_2d_array(int[][] array_Q7) {
		
		int sum_array_Q7=0;
		
		for (int i=0;i<array_Q7.length;i++) {
			for (int j=0;j<array_Q7[i].length;j++) {
				sum_array_Q7+=array_Q7[i][j];
				
			}
		}
		return sum_array_Q7;
	}
	
	public static int multiply_2d_array(int [][] array_Q7) {
		int product_array_Q7=1;
		for (int i=0;i<array_Q7.length;i++) {
			for (int j=0;j<array_Q7[i].length;j++) {
				
				product_array_Q7+=array_Q7[i][j];
			}
		}
		return product_array_Q7;
	}
}