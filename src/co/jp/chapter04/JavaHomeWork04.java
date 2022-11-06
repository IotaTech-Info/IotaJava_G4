package co.jp.chapter04;

public class JavaHomeWork04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//問題1：0，0，0，0
		
		//問題2：5，6
		
		//問題3：[0,0,0],[0,0,0]
		
		//問題4：
		System.out.println("問題4");
		int[][]arr2d = new int[4][2];
		for(int[] out : arr2d) {  //配列arr2dの要素を配列outに代入
			for(int inner : out){ //配列outの要素をint変数innerに代入
			System.out.println(inner); //変数innerを転換した要素をprint
			}
		}

		//問題5：
		System.out.println("問題5");
		int[]arr_5 = new int[] {1,3,5,7,100,0,1};
		int max = arr_5[0];
		int min = arr_5[0];
		
		for(int i = 0 ; i < arr_5.length; i++){
			if (arr_5[i] > max){
				max = arr_5[i];
			}
			if(arr_5[i] < min) {
				min = arr_5[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
		
		//問題6：
		System.out.println("問題6");
		int[]arr_6 = new int[4];
		int sum = 0;
		for(int i = 0 ; i < arr_6.length; i++){
			sum = sum + arr_6[i];
		}
		System.out.println(sum);
		
		//問題7：
		System.out.println("問題7");
		int[][]a = new int[][]{{1,2}, {5,6}};
		int[][]b = new int[][]{{3,4}, {7,8}};
		int[][]sum7 = new int[2][2];
		int[][]pro7 = new int[2][2];
		
		for(int i = 0 ; i < a.length ; i++) {
			for(int j = 0 ; j < b.length ; j++){
				sum7[i][j] += a[i][j] + b[i][j];
			}
		}
		for(int i = 0 ; i < a.length ; i++) {
			for(int j = 0 ; j < b.length ; j++){
				System.out.println(sum7[i][j]);
			}
		}
		
		
		for(int i = 0 ; i < a.length ; i++) {
			for(int j = 0 ; j < b.length ; j++){
				pro7[i][j] += a[i][j] * b[i][j];
			}
		}
		for(int i = 0 ; i < a.length ; i++) {
			for(int j = 0 ; j < b.length ; j++){
				System.out.println(pro7[i][j]);
			}
		}
		
		
	}
	
}