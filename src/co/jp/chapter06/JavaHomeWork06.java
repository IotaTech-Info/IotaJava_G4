package co.jp.chapter06;
import java.util.Arrays;


public class JavaHomeWork06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//質問1.以下関数の修飾子、返却型、関数名、引数(引数の型・名称)を回答してくださ い。
		// public static void main(String[] args);
		//修飾子: public static
		//返却型: void
		//関数名:　main
		//引数(引数型：String、名称:args)

		//質問2.配列の和、MAX値、MIN値を求める処理を関数化してください、main関数に呼 び出してください。
		int[] array = new int[] {1, 2, 6, 7, 9, 6, 2, 1};
		System.out.println("max is " + getMaxAge(array));
		System.out.println("min is " + getMinAge(array));
		
		//質問3.以下メソッドの実施結果を教えてください。
		//null
		String x = null;
		sayHello(x);
		System.out.println(x);
		
		//質問4:以下メソッドの実施結果を教えてください。
		//value2
//		String[] array1 = new String[] {"value1"};
//		fillArray(array1);
//		System.out.println(array1[0]);
		
		//質問5:以下メソッドの実施結果を教えてください。
		//true
		String[] array2 = null;
		fillArray(array2);
		System.out.println(array2 == null);
		
		//質問6-0 配列は直接に印刷できません。下記メソッドを利用して、配列をprintしま す。以下メソッドを呼び出してください。
		printArray(array);
		
		//質問9:メソッドの呼び出す練習。
		//質問6-1を用い、2つ配列をマージします。
		//質問8を用い、ステップ1のマージした配列をソートする。
		int[] array1 = new int[] {1, 2, 6, 7,};
		int[] array3 = new int[] {9, 6, 2, 1};
		bubbleSort(megerArray(array1, array3));
		
	}
	
	//質問6-1:以下静的なメソッドを定義してください。
	public static int[] megerArray(int[] a, int[] b) {
		 int[] result = new int[a.length + b.length];
	        for (int i = 0; i < result.length; i++) {
	            if (i < a.length) {
	                result[i] = a[i];
	            } else {
	                result[i] = b[i - a.length];
	            }
	        }
	        return result;
	}
	
	//質問6-2:以下静的なメソッドを定義してください。
	public static String[] subArray(String[] a, int startIndex, int length) {
		 String[] result  = Arrays.copyOfRange(a, startIndex, length);
	     return result;
	}
	
	//質問7:以下静的なメソッドを定義してください。
	public static String[] trim(String[] a) {
		int q = 0;
		int p = 0;
		for (int i1 = 0; i1 < a.length; i1++) {
			if (a[i1] == " ") {
				q = i1;
				break;
            }
		}
		
		for (int i2 = a.length - 1; i2 == 0; i2--) {
			if (a[i2] == " ") {
				p = i2;
				break;
            }
		}
		
		return subArray(a, q, p);
	}
	
	//質問8:バブルソート用メソッドを作成してください
	static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
	}	
	
	public static void printArray(int[] array) {

		if(array == null) {
			System.out.println("null");
			return;
		}
		String prefix = "";
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(Object obj : array) {
			sb.append(prefix);
			sb.append(String.valueOf(obj));
			prefix = ", ";
		}
		sb.append("]");
		System.out.println(sb.toString());
		
	}	

	
	
	private static void fillArray(String[] array) {
		array = new String[] {"1", "2"};
	}
	
//	private static void fillArray(String[] array) {
//		array[0] = "value2";
//	}
	
	private static void sayHello(String y) {
		y = "Hello world";
	}
	
	public static int getMinAge(int [] ages) {
        int min = ages[0];
        for(int i = 1;i<ages.length;i++){
            if(ages[i]<min){
                min = ages[i];
            }
        }
        return min;
    }
	
	public static int getMaxAge(int [] ages) {
        int max = ages[0];
        for(int i = 1;i<ages.length;i++){
            if(ages[i]>max){
                max = ages[i];
            }
        }
        return max;
    }
	
}