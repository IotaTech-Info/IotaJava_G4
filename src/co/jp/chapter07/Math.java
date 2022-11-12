package co.jp.chapter07;

public class Math {
	public int max(int[] input) {
		int max = input[0];
		for(int i = 1; i < input.length; i++) {
			if(max < input[i]) {
				max = input[i];
			}
		}
		return max;
	}
	public int min(int[] input) {
		int min = input[0];
		for(int i = 1; i < input.length; i++) {
			if(min > input[i]) {
				min = input[i];
			}
		}
		return min;
	}
	public float average(int[] input) {
		float a = 0f;
		for(int i = 0; i < input.length; i++) {
			a += input[i];
		}
		float l = input.length;
		a = a / l;
		return a;
	}

}
