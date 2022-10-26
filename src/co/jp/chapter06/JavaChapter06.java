package co.jp.chapter06;

public class JavaChapter06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//question1: 修飾⼦:public static 返却型:void 関数名:main 引数（引数の型・名称）:(String[] args
		//question2:
		int[] datas = new int[] {1,2,3,6,1,100};
		int[] datas2 = new int[] {1,2,3,6,1,100};
		int maxnum = max(datas);
		
		//question3:null
		//question4:value2
		//question5:true
		//quesion6:
		Object[] datass = new Object[] {1,2,3,4,5,7};
		printArray(datass);
		//question9-1:
		int []merge = megerArray(datas, datas2);
		//question9-2:
		bubbleSort(datas);
	}
	public static int max(int[] datas) { //quesion2
		int maxNum = datas[0];
		for (int num : datas) {
			if (num > maxNum) max_Num = num;
		}
		return maxNum;
	}
	public static void printArray(Object[] objs) { //quesion6
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
		}
	public static int[] megerArray(int[] left, int[] right) { //question6-1
		int leftToRight = left.length + right.length;
		int[] merge = new int[ leftToRight];
		int i = left.length;
		for(int n = 0; n < i; n++) {
			merge[n] = left[n];
		}
		for(int n = i; n < leftToRight ; n++) {
			merge[n] = right[ n - i];
		}
		return merge;
	}
	
	public static int[] subArray(int[] array, int startIndex, int length) { //question6-2
		int[] result = new int[length];
		for(int i = startIndex; i < startIndex + length; i++) {
			result[ i - startIndex] = array[i];
		}
		return result;
	}
	
	public static char[] subArray(char[] array, int startIndex, int length) { //question7
		char[] result = new char[length];
		for(int i = startIndex; i < startIndex + length; i++) {
			result[ i - startIndex] = array[i];
		}
		return result;
	}
	
	public static char[] trim(char[] array) { //question7
		int start = 0;
		int end = array.length - 1;
		for(int i = 0; i < array.length ; i++) {
			if(array[i] == ' ') continue;
			start = i;
		}
		for(int i = array.length-1; i >= 0 ; i--) {
			if(array[i] == ' ') continue;
			end = i;
		}
		int length = end - start;
		char[] result = subArray(array, start, length);
		return result;
	}
	
	public static void bubbleSort(int []array) { //question8
		for(int i = 0 ; i < array.length - 1; i++) {
			for(int j = i + 1 ; j < array.length ; j++) {
				if ( array[i] > array[j]) {
					int a = array[j];
					array[j] = array[i];
					array[i] = a;
				}
			}
	}
}
}