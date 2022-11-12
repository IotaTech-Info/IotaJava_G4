package co.jp.chapter07;

public class Math {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int datas_Q2[]= {0,1,2,3};
		System.out.println(max(datas_Q2));
		System.out.println(min(datas_Q2));
		System.out.println(average(datas_Q2));
	}
	
	public static int max(int[] input) {
		
 		int max=input[0];
		for (int i:input) {
 			if (input[i]>max) {
 				max=input[i];
 			}
 		}
		return max;
	}
	
	public static int min(int[] input) {
 		int min=input[0];
		for (int i:input) {
 			if (input[i]<min) {
 				min=input[i];
 			}
 		}
		return min;
	}
	
	public static float average(int[] input) {
 		int sum=0;
		for (int i:input) {			
 			sum+=input[i];
 		}
		float average=sum/input.length;
		return average;
	}

}
