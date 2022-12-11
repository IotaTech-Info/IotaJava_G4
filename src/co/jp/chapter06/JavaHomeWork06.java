package co.jp.chapter06;

public class JavaHomeWork06 {
		
		//問題1:
		//修飾子：public & static
		//返却型：void
		//関数名：main
		//引数名：args  引数の型：String[]
		
		/**問題2:
		public static int max(int[] datas) {
			int max = datas[0];
			for(int i = 0 ; i < datas.length; i++){
				if (datas[i] > max){
					max = datas[i];
				}
			}
			return max;		
		}
		
		public static int min(int[] datas) {
			int min = datas[0];
			for(int i = 0 ; i < datas.length; i++){
				if (datas[i] < min){
					min = datas[i];
				}
			}
			return min;		
		}
		
		public static int sum(int[] datas) {
			int sum = 0;
			for(int i = 0 ; i < datas.length; i++){
				sum = sum + datas[i];
			}
			return sum;					
		}
		
		public static void main(String[] args) {
			int[] datas = new int[] {3,5,4,9,1,7};
			System.out.println(max(datas));
			System.out.println(min(datas));
			System.out.println(sum(datas));
		
		}   ***/
		
		//問題3:null
		
		//問題4:value2

		//問題5:true
		
		//問題6-0
		public static void printArray(Object[] objs) {
			if (objs == null) {
				System.out.println("null");
				return;
			}
			String prefix = "";
			StringBuilder sb = new StringBuilder();
			sb.append("[");
			for (Object obj : objs) {
				sb.append(prefix);
				sb.append(String.valueOf(obj));
				prefix = ",";
			}
			sb.append("]");
			System.out.println(sb.toString());
		}
		
		/***   呼び出し
		 public static void main(String[] args) {
		 
			 Object[] data= new Object[] {1,2,3};
			 printArray(data);
			 
		 }
		 ***/
	
	
		//問題6-1
		
		public static int[] megerArray(int[]left, int[]right){
			int[] meger = new int[left.length + right.length];
			int a = 0;
			for (int i = 0; i < left.length; i++) {
				meger[a] = left[i];
				a++;
			}
			for (int j = 0; j < right.length; j++) {
				meger[a] = right[j];
				a++;
			}
			return meger;
		}
		
		
		//問題6-2
		public static int[] subArray(int[] array, int startIndex, int length){ 
			int[] sub = new int[length];
			for(int i = startIndex; i < length; i++) {
				sub[i - startIndex] = array[i];
			}
			return sub;
		}
		
		//問題7
		public static char[] trim(char[] input){
			int count = 0;
			for(int i = 0; i < input.length; i++) {				
				if("".equals(input[i])) {
					count++;					
				}
			}
			char[] output = new char[input.length - count];
			
			for(int j = 0; j < input.length; j++) {				
				if("".equals(input[j])) {
					output[j] =	input[j+1];
				}
				else {
					output[j] =	input[j];
				}
			}
			
			return output;	
		}
			
		
		//問題8
		public static int[] bubbleSort(int[] arr){
			
			for(int i = 0; i < arr.length -1; i++) {
				for(int j= 0; j < arr.length -1-i; j++) {
					if(arr[j] > arr[j+1]){
						int a = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = a;
					}
				}
			}
			return arr;
		}
		
		//問題9
		public static void main(String[] args) {
			//9-1
			int[] left = new int[] {4,6,7,1};
			int[] right = new int[] {2,3,8,9};
			int[] meger = megerArray(left, right);
			
			for(int i : meger){
				System.out.print(i + ",");
			}
			System.out.println();
			//9-2
			int[] newarr = bubbleSort(meger);
			for(int i : newarr){
				System.out.print(i + ",");
			}
		}
		
		
		
}
