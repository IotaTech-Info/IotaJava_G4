package co.jp.chapter07;

public class Math {
	public static int max(int[] input) {
		int max = 0;
		for(int i = 0; i < input.length; i++ ) {
			if (input[i] > max) {
				max = input[i];
			}
		}
		return max;
	}
	
	public static int min(int[] input) {
		int min = input[0];
		for(int i = 0; i < input.length; i++) {
			if(min > input[i]) {
				min = input[i];
			}
		}
		return min;
	}
	
	public static int ave(int[] input) {
		int ave;
		int sum = 0;
		for(int i = 0; i < input.length; i++) {
			sum = sum + input[i];
		}
		
		ave = sum / input.length;
		
		return ave;
	}
}
