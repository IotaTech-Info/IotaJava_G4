package co.jp.chapter07;

public class Math_m {
		public static int max(int[] input) {
			int max=input[0];
			for (int i = 1; i < input.length; i++) {
				if (max<input[i]) {
					max=input[i];
				}
			}
			return max;
		}
		public static int min(int[] input) {
			int min=input[0];
			for (int i = 1; i < input.length; i++) {
				if (min>input[i]) {
					min=input[i];
				}
			}
			return min;
		}
}
