package co.jp.chapter05;

public class JavaHomeWork05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		設問1
		int a = 0;
		for(int i = 1; i <=100; i++) {
			if(i % 2 == 0) {
				a += i;
			}
		}
		System.out.println(a);
		
//		設問2
		int b = 1;
		for(int i = 1; i <=5; i++) {
			b *= i;
		}
		System.out.println(b);
		
//		設問3
		int array[] = {1, 2, 6, 7, 9, 6, 2, 1};
		int max = 0, min, sum = 0;
		float ave;
		for(int i = 0; i < array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("max : " + max);
		
		min = array[0];
		for(int i = 0; i < array.length; i++) {
			if(min > array[i]) {
				min = array[i];
			}
		}
		System.out.println("min : " + min);
		
		for(int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		System.out.println("sum : " + sum);
		
		ave = sum / (float)array.length;
		System.out.println("ave : " + ave);
		
//		設問4
		System.out.print("重複ある要素は");
		for(int i = 0; i < array.length; i++) {
			for(int j = i+1; j < array.length; j++) {
				if(array[i] == array[j]) {
					System.out.print(", " + array[i]);
				}
			}
		}
		
		System.out.println("");
//		設問5
		for(int i = 0; i < array.length; i++) {
			if(array[i] == 7) {
				System.out.println("index : " + (i + 1));
			}
		}
		
//		設問6
		int[] array_61 = new int[] {1, 2, 3, 4};
		int[] array_62 = new int[] {5, 6, 7, 8};
		int[] product = new int[4]; 
		
		for(int i = 0; i < array_61.length; i++) {
			product[i] = array_61[i] * array_62[i];
		}
		
		for(int j = 0; j < product.length; j++) {
			System.out.print(product[j] + ", ");
		}
		
		System.out.println("");
//		設問7
		int[] array_7 = new int[] {5, 64, 12, 24, 55, 3, 10};
		for(int i = 0; i < array_7.length; i++) {
			for(int j = i; j < array_7.length; j++) {
				if (j != i) {
					if (array_7[i] >= array_7[j]) {
						int temp = array_7[j];
						array_7[j] = array_7[i];
						array_7[i] = temp;
					}
				}
			}
			System.out.print(array_7[i] + " ");
		}

		System.out.println("");
//		設問8
		int[][] pascal = new int[10][10];
		for(int i = 0; i < pascal.length; i++) {
			for(int j = 0; j <= i; j++) {
				if(j == 0) {
					pascal[i][j] = 1;
				}else if(j == i){
					pascal[i][j] = 1;
				}else {
					pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
				}
				System.out.print(" " + pascal[i][j]);
			}
			System.out.println("");
		}
		
	}
}
