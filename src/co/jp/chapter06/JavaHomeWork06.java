package co.jp.chapter06;

public class JavaHomeWork06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//質問１．以下関数の修飾子、返却型、関数名、引数（引数の型・名称）を回答してください。
		//public static void main(String[] args);
		//修飾子:publicとstatic
		//返却型:void
		//関数名:main
		//引数の型:String[] 名称:args
		
		//質問２．配列の和、MAX値、MIN値を求める処理を関数化してください、main関数に呼び出してください。
		/*
		 //main関数
			public static void main(String[] args) {
		int[] array=new int[]{1,2,3,4,5};

			System.out.println(sum(array));
			System.out.println(max(array));
			System.out.println(min(array));
			
	}
	// 配列の和
	public static int sum(int[] datas) {
		int result=0;
		for(int data:datas){
		result+=data;
		}
		return result;
		 }
		// 配列のMax値
		public static int max(int[] datas) {
		int result=datas[0];
		for(int data:datas){
		if(data>result){result=data;}
		}
		return result;
		 }
		// 配列のMin値
		public static int min(int[] datas) {
		int result=datas[0];
		for(int data:datas){
		if(data<result){result=data;}
		}
		return result;
		 }
		*/

		//質問３．以下メソッドの実施結果を教えてください。
		//null
		
		//質問４︓以下メソッドの実施結果を教えてください。
		//value2

		//質問５︓以下メソッドの実施結果を教えてください。
		//true
		
		//質問６-０︓配列は直接に印刷できません。下記メソッドを利用して、配列をprintします。以下メソッドを呼び出してください。

		/*
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
		 }
	 	public static void main(String args[]) {
		 	String[] array = {"apple","banana","pineapple"};
		 	printArray(array);
		 }
		 */
		
		//実行結果：[apple, banana, pineapple]
		
		//質問６-１︓以下静的なメソッドを定義してください。
		/*
		 public static int[] megerArray(int[] left,int[] right) {
		 int k = 0, i = 0, j = 0;
	        int[] merge = new int[left.length + right.length];
	 
	        while (i < left.length )
	        {
	        	merge[k++] = left[i++];
	          
	        }

	        while (j < right.length) {
	        	merge[k++] = right[j++];
	        }
	 
	        return merge;
	    }
	 
	    public static void main (String[] args)
	    {
	        int[] X = { 1,3,5,7};
	        int[] Y = { 2,4,6,8};
	 
	        int[] merge =megerArray(X, Y);
	 
	        System.out.println("X: " + Arrays.toString(X));
	        System.out.println("Y: " + Arrays.toString(Y));
	        System.out.println("merge: " + Arrays.toString(merge));
	    }
		 */
		//実行結果：
		/*
		 X: [1, 3, 5, 7]
		 Y: [2, 4, 6, 8]
		 merge: [1, 3, 5, 7, 2, 4, 6, 8]
		 */

		//質問６-２︓以下静的なメソッドを定義してください。
		/*
		public static int[] subArray(int[] array,int startIndex,int length) {
		 int k = 0, i =startIndex;
	     int[] sub = new int[length];
	 
	     while (k <length){
	     	sub[k++] = array[i++];
	        }
	        return sub;
	    }
	 
	    public static void main (String[] args)
	    {
	        int[] X = {1,2,3,4,5,6};
	        int[]result =subArray(X,1,4);
	        System.out.println("X: " + Arrays.toString(X));
	        System.out.println("sub: " + Arrays.toString(result));
	    }
	 
		 */
		//実行結果：
		/*
		 X: [1, 2, 3, 4, 5, 6]
		 sub: [2, 3, 4, 5]
		 */
		
		//質問７︓以下静的なメソッドを定義してください。
		/*
		  public static char[] trim(char[] input) {
		 int i =0,j=input.length-1;
		 char[] output=null;
	        while (input[i]==' ')
	        {
	        	i++; 
	        }
	      
	        while (input[j]==' ')
	        {
	        	j--;
	          
	        }
	        output=subArray(input,i,j-i+1);
 
	        return output;
	    }
	 	public static char[] subArray(char[] array,int startIndex,int length) {
		 int k = 0, i =startIndex;
	     char[] sub = new char[length];
	     while (k <length){
	     	sub[k++] = array[i++];
	        }
	        return sub;
	    }
	    public static void main (String[] args)
	    {
	    	char[] input = new char[] {' ', ' ', 'A', 'b', ' ', ' ', 'C', ' '};
	 
	        char[] output =trim(input);
	 
	        System.out.println("X: " + Arrays.toString(input));
	        System.out.println("output: " + Arrays.toString(output));
	    }
		 */
		//実行結果：
		//X: [ ,  , A, b,  ,  , C,  ]
		//output: [A, b,  ,  , C]

		
		//質問８︓バブルソート⽤メソッドを作成してください。
		/*
		 	 public static int[] bubbleSort(int[] input) {
		 for (int i = input.length; i >=2; i--) {
			 for (int j = 1; j < input.length; j++) {
	            if (input[j-1] > input[j]) {
	                //交換
	                int n = input[j];
	                input[j] = input[j-1];
	                input[j-1] =n;
	                }
	            }
		 }
	        return input;
	    }
	
	    public static void main (String[] args)
	    {
	    	int input[] = {2,2,6,3,7,9,1,8,8,7};
	        int[] output =bubbleSort(input);
	        System.out.println("output: " + Arrays.toString(output));
	    }
		 */
		//実行結果：output: [1, 2, 2, 3, 6, 7, 7, 8, 8, 9]
		
		//質問９︓メソッドの呼び出す練習。
		//質問６-１を用い、２つ配列をマージします。
		//質問８を用い、ステップ１のマージした配列をソートする。
		//注意︓コードを１行にしてください。
		//bubbleSort(megerArray(array1,array2));

		

	}
}
