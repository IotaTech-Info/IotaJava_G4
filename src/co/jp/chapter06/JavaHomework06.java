package co.jp.chapter06;

public class JavaHomework06 {
	public static void main(String[] args){
		
		/*質問１
		 
		 public(修飾子),static(引数),void(返却値),main(関数名),(String[] args)(引数の型、名称);
		 */
		
		
		/*質問２
		 
		 public static int add(int[] array){
		 	int sum = 0;
		 	for(int i = 0; i < array_length; i++){
		 		sum += array[i];
		 	}
		 	return add;
		 }
		 
		 public static int max(int[] array){
		 	int max = array[0];
		 	for(int i = 0; i < array_length; i++){
		 		if(max < array[i]){
		 			max = array[i] + max;
		 			array[i] = max - array[i];
		 			max = max - array[i];
		 		}
		 	}
		 	return max;
		 }
		 
		 public static int min(int[] array){
		 	int min = array[0];
		 	for(int i = 0; i < array_length; i++){
		 		if(min > array[i]){
		 			min = array[i] + min;
		 			array[i] = min - array[i];
		 			min = min - array[i];
		 		}
		 	}
		 	return min;
		 }
		 */
		
		/*質問３
		 
		 null
		 */
		
		/*質問４
		 
		 value2
		 */
		
		/*質問５
		 
		 true
		 */
		
		/*質問６-０
		String[] array = {"Hello World!"};
		printArray(array);
		
	}	
	public static void printArray(Object[] objs) {
		if(objs == null) {
		System.out.println("null");
		return;
		}
		String prefix = "";
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(Object obj : objs) {
			sb.append(prefix);
			sb.append(String.valueOf(obj));
			prefix = ", ";
			}
		sb.append("]");
		System.out.println(sb.toString());
		*/
		
		/*質問６-１
	 public static void main(String args[]) {
		int[] left = new int[] {1,2,3,4};
		int[] right = new int[] {5,6,7,8};
		
		int[] result = mergeArray(left,right);
		
		System.out.println(Arrays.toString(result));	
		
	}
	
	public static int[] mergeArray(int[] left,int[] right) {
		
		int[] array = new int[left.length + right.length];
		
		System.arraycopy(left,0,array,0,left.length);
		System.arraycopy(right,0,array,left.length,right.length);
			
		return array;
	}	
		 */
		
		/*質問６-２
		 public static void main(String args[]) {
		int[] array = new int[] {1,2,3,4};
		
		int[] result = subArray(array,1,2);
		
		System.out.println(Arrays.toString(result));	
		
	}
	
	public static int[] subArray(int[] array,int startIndex  ,int length) {
		
		int[] result = new int[length];
		
		for(int i = startIndex; i <= length; i++) {
			result[i - startIndex] = array[i];
		}
		
		return result;
	}	
		 */
		
		/*質問７
		 public static void main(String args[]) {
		char[] input = new char[] {' ', ' ', 'A', 'b', ' ', ' ', 'C', ' '};
		
		char[] output = trim(input);
		
		System.out.println(Arrays.toString(output));	
		
	}
	
	public static char[] trim(char[] input) {
		
		int start = 0;
		int end = input.length - 1;
		
		for(int i = 0; i < input.length ; i++) {
			if(input[i] != ' ') { 
			start = i;
			break;
			}
		}
			
		for(int i = input.length-1; i >= 0 ; i--) {
			if(input[i] != ' ') {
			end = i ;
			break;
			}
		}
		
		
		char[] result = subArray(input, start, end);
		return result;
	}
	
	public static char[] subArray(char[] array,int startIndex  ,int length) {
		
		char[] result = new char[length];
		
		for(int i = startIndex; i <= length; i++) {
			result[i - startIndex] = array[i];
		}
		
		return result;
	}
		 */
		
		
		/*質問８
		int[] array = {1,34,23,56,37,89,35};
		bubblesort(array);
		
		System.out.println(Arrays.toString(array));
		
	}
	
	public static int[] bubblesort(int[] array) {
		
		int len = array.length;
		int num = 0;
		
		for(int i = 0; i < len - 1; i++) {
			for(int j = 0; j < len - i - 1; j++) {
				if(array[j] > array[j + 1]) {
					num = array[j] + array[j + 1];
					array[j] = num - array[j];
					array[j + 1] = num - array[j];
				}
			}
		}
		return array;
		
		*/
		
		/*質問９
		int[] left = new int[] {1,2,3,4};
		int[] right = new int[] {5,6,7,8};
		
		int[] result = bubblesort(mergeArray(left,right));
		
		System.out.println(Arrays.toString(result));
		 */
	} 

}
