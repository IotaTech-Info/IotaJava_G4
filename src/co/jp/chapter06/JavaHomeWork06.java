package co.jp.chapter06;

public class JavaHomeWork06 {
	
	public static void main(String[] args) {

		// TODO 自動生成されたメソッド・スタブ


//		質問1
		
//		public static void main(String[] args);
//		修飾子: public static
//		返却型: void
//		関数名: main
//		引数: String[] args(引数の型: String[]・名称: args)	

		
		
//		質問2
//		び出してください。
		
//		public static int max(int[] datas) {
//			int maxvalue = datas[0];
//			for (int i = 0; i < datas.length; i++) {
//				if (datas[i] > maxvalue) {
//				maxvalue = datas[i];
//				}
//			}
//			return max;
//		}
//		public static int min(int[] datas) {
//			int min = datas[0];
//			for (int i = 0; i < datas.length; i++) {
//				if (datas[i] <minvalue) {
//					minvalue = datas[i];
//				}
//			}
//			return minvalue;
//		}
//		public static void main(String args[]) {
//			int[] a = { 10, 985, 211, 468 };
//			System.out.println(max(a));
//			System.out.println(min(a));
//		}

		
		
		
//		質問3

//		null

		
//		質問4
//		public class Kicker{
//		   private static void fillArray(String[] array){
//		       array[0]="value2";
//		   }
//		   public static void main(String args[]){
//		       String[] array=new String[]{"value1"};
//		       fillArray(array);
//		       System.out.println(array[0]);
//		   }
//	    }
		
//		value 2
		
		
//		質問5
//		public class Kicker{
//		   private static void fillArray(String[] array){
//		       array =new String[]{"1","2"};
//		   }
//		   public static void main(String args[]){
//		       String[] array=null;
//		       fillArray(array);
//		       System.out.println(array==null);
//		   }
//	    }

//		true
		


//		質問6-0
//		public class JavaHomeWork06 {
//		public static void main(String[] args) {
//			Object[] a = {1, 2, 3};
//			printArray(a);
//		}
		
//		   private static void printArray(Object[] objs){
//		       if(objs==null){
//		           System.out.println("null");
//		           return;
//		       }
//		       String prefix ="";
//		       StringBuilder sb = new StringBuilder();
//		       sb.append("[");
//		       for(Obiect obj : objs){
//		          sb.append(prefix);
//		          sb.append(String.valueOf(obj));
//		          prefix = ",";
//	           }
//		       sb.append("]");
//		       System.out.println(sb.toString());
//		}
		
//		質問6-1		
//	private static int[] mergeArray(int[] left, int[] right) {
//		int[] meg = new int[left.length + right.length];
//
//		for (int i = 0; i < left.length; i++) {
//			meg[i] = left[i];
//		}
//
//		for (int i = 0; i < right.length; i++) {
//			meg[left.length + i] = right[i];
//		}
//		return meg;
//	}

		
		
		
//		質問6-2
		
//		private static int[] subArray(int[] array, int startIndex, int length) {	
//				int[] newArray = new int[length];
//				for (int i = 0; i < length; i++) {
//					newArray[i] = array[i + startIndex];
//				}
//				return newArray;
//		}
		
		
		
//		質問7

//		private static char[] trim(char[] array) {
//			int startIndex = 0;
//			int length = 0;
//			for (int i = 0; i < array.length; i++) {
//				if (array[i] == ' ') {
//					startIndex = i+1;
//					break;
//				}
//			}
//
//			for (int i = array.length - 1; i >= 0; i--) {
//				if (array[i] != ' ') {
//					length = i - startIndex + 1;
//					break;
//				}
//			}
//
//			return char[];
//		}
		
//		質問8
//		1. メソッド名︓bubbleSort
//		2. 引数１︓intの配列
//		3. 戻り値︓ソート済みの配列
//		4. 処理内容︓bubbleSortアルゴリズムを⽤い、⼊⼒した引数の配列をソートしてください。
//		private static int[] bubbleSort(int[] array) {
//			for (int i = 0; i < array.length; i++) {
//				for (int j = i + 1; j < array.length; j++) {
//					if (array[i] > array[j]) {
//						int temp = array[i];
//						array[i] = array[j];
//						array[j] = temp;
//					}
//				}
//			}
//			return array;
//		}
		
//		質問9
//		1.
//		public static void main(String[] args) {
//			int[] merged = mergeArray(new int[]{1,3,4,2}, new int[]{8,7,5,6});
//	    }
		
//		2. 
//		public static void main(String[] args) {
//	    	int[] sorted = bubbleSort(mergeArray(new int[]{1,3,4,2}, new int[]{8,7,5,6});
//	    }
				


	}
}
	


