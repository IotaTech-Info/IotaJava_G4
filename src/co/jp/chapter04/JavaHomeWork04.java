package co.jp.chapter04;

public class JavaHomeWork04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*
		問題1
		int[] array = new int[4];
		for(int x : array) {
			System.out.println(x);
		}
		答
		array[0] = 0;array[1] = 0; array[2] = 0; array[3] = 0;
		*/
		
		
		/*
		問題2
		int[] array = new int[] {5,6};
		for(int x : array) {
			System.out.println(x);
		}
		答:array[0] = 5; array[1] = 6; 
		 */
		
		/*
		問題3
		答：{{0,0,0},{0,0,0}}
		*/
		
		/*
		問題4
		int[][] array2d = new int[4][2];
		for(int[] out : array2d) {
			for(int inner : out) {
				System.out.println(inner);
			}
		}
		array2d配列でのすべての要素を出力する。
		*/
	
		//問題5
		/*int[] array = new int[] {1,3,5,7,100,0,1};
		int max = max(array);
		System.out.println("最大值:" + max);
		int min = min(array);
		System.out.println("最小值:" + min);
			
	}
	public static int max(int[] num) {
		int max = num[0];
		int len = num.length;
		for(int i = 1; i < len; i++) {
			if(num[i] > max) {
				num[i] = num[i] + max;
				max = num[i] - max;
				num[i] = num[i] - max;
			}
		}
		return max;
	}
	
	public static int min(int[] num) {
		int min = num[0];
		int len = num.length;
		for(int i = 1; i < len; i++) {
			if(num[i] < min) {
				num[i] = num[i] + min;
				min = num[i] - min;
				num[i] = num[i] - min;
			}
		}
		return min;
		答:最大值100，最小值0
		*/
		
		//問題6
		/*
		int[] array = new int[4];
		int sum = 0;
		int len = array.length;
		
		for(int i = 0;i < len ;i++) {
			sum+=array[i];
		}
		System.out.println(sum);
		*/
		
		//問題7
		int[][] array1 = {{10,10},{10,10},{10,10}};
		int[][] array2 = {{1,2},{3,4},{5,6}};
		
		int len = array1.length;
		int[][] sum = {{0,0},{0,0},{0,0}};
		int[][] product = {{0,0},{0,0},{0,0}};
		
		for(int i = 0;i < len;i++) {
			int len2 = array1[i].length;
			for(int j = 0;j < len2;j++) {
				sum[i][j] = array1[i][j] + array2[i][j];
				product[i][j] = array1[i][j] * array2[i][j];
				
				System.out.println("2次元配列の和：\n"+sum[i][j]);
				System.out.println("2次元配列の積：\n"+product[i][j]);
			}
		}
		
	}
}