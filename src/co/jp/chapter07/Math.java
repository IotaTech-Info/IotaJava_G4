package co.jp.chapter07;

public class Math {
	public static int max(int[] input) {
		int max = input[0];
		for (int i = 0; i < input.length; i++) {
			if (input[i] > max) {
				max = input[i];
			}

		}

		return max;
	}

	public static int min(int[] input) {
		int min = input[0];
		for (int i = 0; i < input.length; i++) {
			if (input[i] < min) {
				min = input[i];
			}

		}

		return min;
	}

	public static int avg(int[] input) {
		int sum = input[0];
		for (int i = 0; i < input.length; i++) {

			sum += input[i];

		}

		return sum / input.length;
	}

}
