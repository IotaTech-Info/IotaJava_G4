package co.jp.chapter05;

public class JavaHomeWork05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		System.out.println("問題1");
		int sum = 0;
		for(int i = 0 ; i < 101 ; i++) {
			if(i%2 == 0){
			sum = sum + i;
			}
		}
		System.out.println(sum);
		
		System.out.println("問題2");
		int a =1;
		for(int i = 1 ; i < 6 ; i++) {
			a = a * i;
		}
		System.out.println(a);
		
		System.out.println("問題3");
		int[]arr_3 = new int[] {1,2,6,7,9,6,2,1};
		int max = arr_3[0];
		int min = arr_3[0];
		int sum_3 = 0;
		
		for(int i = 0 ; i < arr_3.length; i++){
			if (arr_3[i] > max){
				max = arr_3[i];
			}
			if(arr_3[i] < min) {
				min = arr_3[i];
			}
			sum_3 = sum_3 + arr_3[i];
		}
		double sum_31 = sum_3;
		double ave = sum_31/arr_3.length;
		
		System.out.println(max);
		System.out.println(min);
		System.out.println(sum_3);
		System.out.println(ave);
		
		System.out.println("問題4");
		int count = 0;
		for(int i = 0 ; i < arr_3.length; i++){
			for(int j = i+1 ; j < arr_3.length; j++) {
				if(arr_3[i] == arr_3[j]) {
					count++;
				}
			}
			if(count == 1) {
				System.out.println(arr_3[i]);
				count = 0;
			}
		}
		
		System.out.println("問題5");
		for(int i = 0 ; i < arr_3.length; i++){
			if(arr_3[i] == 7) {
				System.out.println(i);
			}
		}
		
		System.out.println("問題6");
		int[][]x = new int[][]{{1,2}, {5,6}};
		int[][]y = new int[][]{{3,4}, {7,8}};
		int[][]pro7 = new int[2][2];
		
		for(int i = 0 ; i < x.length ; i++) {
			for(int j = 0 ; j < y.length ; j++){
				pro7[i][j] += x[i][j] * y[i][j];
			}
		}
		for(int i = 0 ; i < x.length ; i++) {
			for(int j = 0 ; j < y.length ; j++){
				System.out.println(pro7[i][j]);
			}
		}
		
		
		System.out.println("問題7");
		for(int i = 0 ; i < arr_3.length-1; i++){
			for(int j = 0 ; j< arr_3.length-1; j++){
				if(arr_3[j] > arr_3[j+1]) {
					int k = arr_3[j];
					arr_3[j] = arr_3[j+1];
					arr_3[j+1] = k;
				}
			}
		}
		for(int i = 0 ; i < arr_3.length; i++){
			System.out.println(arr_3[i]);
		}
		
		System.out.println("問題8");
		int[][]pascal = new int[11][11];
		for(int i = 0 ; i < 10; i++){
			pascal[i][0] = 1;
			pascal[i][i] = 1;
		}
		for(int i = 1 ; i < 10; i++){
			for(int j = 1 ; j < i; j++){
				pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
			}
		}
		for(int i =0; i < 10; i++) {
			for(int j = 0 ; j < 10-i; j++) {
				System.out.print(" ");
			
			}
		
			for(int l =0; l < 10; l++) {
				if(pascal[i][l] != 0) {
					System.out.print(pascal[i][l] + " ");
				}
			}
			System.out.println();
		}
	}
}
