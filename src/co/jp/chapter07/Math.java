package co.jp.chapter07;

public class Math{
	
	public static int max (int[] input) {
		int flag = input[0];
		for (int i = 1; i < input.length;i++) {
			if (input[i] > flag) {
				flag=input[i];
			}
		}
		return flag;
	}
	
	public static int min (int[] input) {
		int flag = input[0];
		for (int i = 1; i < input.length;i++) {
			if (input[i] < flag) {
				flag=input[i];
			}
		}
		return flag;
	}
	
	public static float avg (int[] input) {
		float flag = 0f;
		for (int i = 0; i < input.length;i++) {
			flag = flag +input[i];
		}
		float sum = input.length;
		flag = flag / sum;
		return flag;
	}
	
}
