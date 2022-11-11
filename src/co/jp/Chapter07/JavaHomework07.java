package co.jp.Chapter07;

public class JavaHomework07 {
	public static void main(String args[]) {
		
		/*質問１
		Pet1 cat = new Pet1();
		cat.setAge(1234);
		
		メゾットsetAgeはPetクラスに設定されていません。
		*/	
			
		/*質問２
public class math {	
	 
		 public static int average(int[] array){
		 	int sum = 0;
		 	for(int i = 0; i < array_length; i++){
		 		sum += array[i];
		 	}
		 	int average = sum / array.length;
		 	return average;
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
		 
		 public static void main(String[] args){
		 	
		 	int array = {1,2,3,4,5};
		 	int arrayMax = max(array);
		 	int arrayMin = min(array);
		 	int arrayAverage = average(array);
		 }
}
		 */
		
		
		/*質問３
		 public class Matrix {
 			
 			private final int[][] data;

 			public Matrix(int[][] data) {
 				this.data = data;
 			}
 			
 		public Matrix add(Matrix b) {
 			
 			int[][] array = new int[this.data.length][this.data[0].length];
				
				for (int i = 0; i < this.data.length; i++) {
					
					for (int j = 0; j < this.data[0].length; j++) {
					
						array[i][j] = this.data[i][j] + b.data[i][j];
						
			}
		
		}
		return new Matrix(ret);	//
		 */
		
	}	
}
