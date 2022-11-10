package co.jp.chapter07;

public class Math {
	
	
	public static int max(int[] input) {
		
		int max = input[0];
        for(int i = 1;i<input.length;i++){
            if(input[i]>max){
                max = input[i];
            }
        }
        return max;
        		
	}
	
	public static int min(int[] input) {
	
		int min = input[0];
        for(int i = 1;i<input.length;i++){
            if(input[i]<min){
                min = input[i];
            }
        }
        return min;
				
	}
	
	public static int mean(int[] input) {
		
		int q = 0;
		for(int i = 1;i<input.length;i++){
		   q = q +input[i];		
		}		
		
		
		return q/input.length;
		
	}
	

}
