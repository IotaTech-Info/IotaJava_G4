package co.jp.chapter06;

public class JavaHomeWork06 {

	public static void main(String[] args) {
		/**
		 * 質問１* 
		 * 修飾⼦ public 
		 * 返却型 なし(void) 
		 * 関数名 main 
		 * 引数 String[] args
		 **/

		// 質問２
		int[] datas = new int[] { 1, 7, 8, 4, 15, 8, 3 };
		System.out.println("最大値は" + max(datas));
		System.out.println("最小値は" + min(datas));

		/**
		 * 質問３ null
		 */

		/**
		 * 質問4 value2
		 */

		/**
		 * 質問5 false
		 */

		// 質問6-0
		Object ob[] = new Object[] { 1, 2.5, 'a', "aha~" };
		printArray(ob);
		// 質問6-1
		int[] left = new int[] {1, 2, 3, 4};
		int[] right = new int[] {5, 6, 7, 8};
		printIntArray(megerArray(left,right));
		
		// 質問6-2
		int[] array = new int[] {1, 2, 3, 4};
		int start=1;
		int length=2;
		printIntArray(subArray(array,start,length));
		
		//質問7
		char[] input = new char[] {' ', ' ', 'A', 'b', ' ', ' ', 'C', ' '};
		printCharArray(trim(input));
		
		//質問8&9
		left=new int[] {2,7,8,3};
		right=new int[] {1,5,4,6};
		printIntArray(bubbleSort(megerArray(left,right)));
	}

	public static void printIntArray(int[] array) {
		System.out.print("[");
		for(int num:array) {
			System.out.print(num+" ");
		}
		System.out.println("]");
	}
	
	public static void printCharArray(char[] array) {
		System.out.print("[");
		for(char member:array) {
			System.out.print(member+" ");
		}
		System.out.println("]");
	}
	public static int max(int[] datas) {
		int result = datas[0];
		for (int i = 1; i < datas.length; i++) {
			if (datas[i] > result)
				result = datas[i];
		}
		return result;
	}

	public static int min(int[] datas) {
		int result = datas[0];
		for (int i = 1; i < datas.length; i++) {
			if (datas[i] < result)
				result = datas[i];
		}
		return result;
	}

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
			prefix = ", ";
		}
		sb.append("]");
		System.out.println(sb.toString());
	}
	//質問6-1
	public static int[] megerArray(int[] left,int[] right) {
		int len=left.length+right.length;
		int[] result=new int[len];
		for(int i=0;i<left.length;i++) {
			result[i]=left[i];
		}
		for(int i=0;i<right.length;i++) {
			result[i+left.length]=right[i];
		}
		
		return result;
		
	}
	//質問６-２
	public static int[] subArray(int[] array,int startIndex,int length) {
		int[] result=new int[length];
		for(int i=0;i<length;i++) {
			result[i]=array[startIndex+i];
		}
		return result;
	}
	//質問７と形が違うから、作り直す
	public static char[] subChar(char[] array,int startIndex,int length) {
		char[] result=new char[length];
		for(int i=0;i<length;i++) {
			result[i]=array[startIndex+i];
		}
		return result;
	}
	//質問7
	public static char[] trim(char[] input) {
		char[] output=null;
		int startindex = 0;
		int endindex = 0;
		for(int i=0;i<input.length;i++) {
			if(input[i]!=' ') {
				startindex=i;
				break;
			}
		}
		for(int i=input.length-1;i!=0;i--) {
			if(input[i]!=' ') {
				endindex=i;
				break;
			}
		}
		int length=endindex-startindex+1;
		output=subChar(input,startindex,length);
		return output;
 
	}
	//質問8
	public static int[] bubbleSort(int[] array) {
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]>array[j]) {
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		return array;
	}
}
