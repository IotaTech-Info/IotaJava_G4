package co.jp.chapter07;

public class JavaHomeWork07 {
	
	//質問1：
	//class Pet で age 未定義
	
	
	//質問2：
	
	public class Math{
		public static int max(int[] input) {
			int max = input[0];
			for(int i = 0; i < input.length; i++) {
				if (input[i] > max){
					max = input[i];
				}
			}
			return max;
		}
		
		public static int min(int[] input) {
			int min = input[0];
			for(int i = 0; i < input.length; i++) {
				if (input[i] < min){
					min = input[i];
				}
			}
			return min;
		}
		
		public static int ave(int[] input) {
			int sum = 0;
			for(int i = 0; i < input.length; i++) {
				sum = sum + input[i];	
			}
			int ave = sum/input.length;
			return ave;
		}
	}
	
	public static void main(String[] args) {
		
		int[]list = new int[] {1,2,6,5,7,8,10,1};
		
		int max = Math.max(list);
		int min = Math.min(list);
		int ave = Math.ave(list);
		
		System.out.println(max);
		System.out.println(min);
		System.out.println(ave);
		
	}

}
