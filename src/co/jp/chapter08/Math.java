package co.jp.chapter08;

public class Math {
	public static int max(int[] input) {
		int max=input[0];
		for (int i = 0; i < input.length; i++) {
			if (max<input[i]) {
				max=input[i];
			}
		}
		return max;
	}
	public static int min(int[] input) {
		int min=input[0];
		for (int i = 0; i < input.length; i++) {
			if (min>input[i]) {
				min=input[i];
			}
		}
		return min;
	}
	public static int mean(int[] input) {
		int mean=0;
		int sum=0;
		for (int i = 0; i < input.length; i++) {
			sum+=input[i];
		}
		mean=sum/input.length;
		return mean;
	}
}
