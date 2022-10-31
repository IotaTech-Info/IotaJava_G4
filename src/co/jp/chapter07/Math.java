package co.jp.chapter07;

public class Math {
	
	public static int MAX(int[] array) {
		int max = array[0] ;
		for (int item : array) {
			if(item > max) {
				max = item;
			}
		}
		return max;
	}
	
	public static int MIN(int[] array) {
		int min = array[0] ;
		for (int item : array) {
			if(item < min) {
				min = item;
			}
		}
		return min;
	}
	
	public static int Average(int[] array) {
		int sum = 0;
		for (int item : array) {
			sum += item;
		}
		return sum/array.length;
	}

}
