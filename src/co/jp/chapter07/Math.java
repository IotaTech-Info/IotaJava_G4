package co.jp.chapter07;


public class Math {
	public static int max(int[] array) {
		int max_num ;
		try {
			max_num = array[0];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("array不能为空");
			return 0;
		}
		for (int i : array) {
			if (i > max_num) {
				max_num = i;
			}
		}
		return max_num;
	}
	
	public static int min(int[] array) {
		int min_num ;
		try {
			min_num = array[0];
			System.out.println("array不能为空");
		} catch (ArrayIndexOutOfBoundsException e) {
			return 0;
		}
		for (int num : array) {
			if (num < min_num) {
				min_num = num;
			}
		}
		return min_num;
	}
	
	public static double mean(int[] array) {
		if (array.length == 0) {
			return 0;
		}
		int sum = 0;
		for (int num : array) {
			sum += num;
		}
		return (double) sum / array.length;
	}
	
	public static void main(String[] args) {
		int[] array = new int[] {1,2,3,4,5};
		int max_num = max(array);
		int min_num = min(array);
		double mean_num = mean(array);
		
		System.out.println("max : " + max_num + ", min : " + min_num + ", mean : " + mean_num);
	}
}
