package co.jp.chapter07;

public class Math {
	
	public static int max(int[] input) {
		int result = input[0];
		for (int i = 1; i < input.length; i++) {
			if (input[i] > result)
				result = input[i];
		}
		return result;
		
	}
	
	public static int min(int[] input) {
		int result = input[0];
		for (int i = 1; i < input.length; i++) {
			if (input[i] < result)
				result = input[i];
		}
		return result;
	}
	
	public static int avg(int[] input) {
		int result =0;
		for(int num:input) {
			result+=num;
		}
		if(input.length==0) return 0;
		return result/input.length;
	}

}
