package co.jp.chapter06;
public class JavaHomeWork06 {
	  public static void main(String[] args) {
		  //質問１．以下関数の修飾⼦、返却型、関数名、引数（引数の型・名称）を回答してください。
		  
//		  public static void main(String[] args);
//
//		  public:mainメソッドのアクセス修飾子
//		  publicは「プログラムの公開範囲」を意味していおり、public修飾子を付けたメソッドは、メソッドの定義元のクラスの外部、外側のコードからアクセスできるようになります。
//
//		  static:static修飾子
//		  static修飾子を付けたメソッドは、クラスをインスタンス化することなくアクセスできるようになります。 staticが付いたメソッドのことを「 static(静的)メソッド」と呼びます。
//
//		  void:戻り値
//		  メソッドの戻り値は" void "であること。
//		  voidはメソッドが呼び出された結果、メソッドの呼び出し元に値を返さない場合に設定する戻り値の型です。
//
//		  main:メソッド名
//		  メソッド名であり、JVMが参照する識別子です。
//
//
//		  String[] args:引数
//		  メソッドの引数には" String型の配列 "、または" String型の固定されていない任意の個数となっている引数(可変長引数) "であること。
//		  実行時に指定する引数を mainメソッド内で使用するためです。 " args "はプログラムが実行されるときに渡される情報を意味しています。
//		  argsは、引数を意味する英単語 arguments(引数)を省略したものであり、引数名に一般的によく使われますが、別の引数名でも構いません。

		  //質問２．配列の和、MAX値、MIN値を求める処理を関数化してください、main関数に呼 び出してください。
//		  例：配列のMax値を求めるメソッド 
//		  public static int max(int[] datas) { 
//		  // ...処理を記載 
//		  }
		    System.out.println("質問２");
			int[] array = new int[] { 1, 2, 3, 4 };
			System.out.println("配列の和は" + sum(array));
			System.out.println("配列の最大値は" + max(array));
			System.out.println("配列の最小値は" + min(array));
	        
	        
	      //質問6-1
			System.out.println("質問6-1");
			int[] left = new int[] { 1, 2, 3, 4 };
			int[] right = new int[] { 5, 6, 7, 8 };
			int[]result = megerArray(left,right);
			for(int i = 0 ; i < result.length ; i++) {
				System.out.print(result[i]);
			}
			System.out.println();
			
		  //質問6-2
			System.out.println("質問6-2");
			 int[]array_a = new int[] {1, 2, 3, 4}; 
			 int[]result_a = subArray(array_a,1,2);
			 for(int i = 0 ; i < result_a.length ; i++) {
					System.out.print(result_a[i]);
				}
			 
			 
		 //質問７
			 System.out.println("質問7");
			 char[] input = new char[] {' ', ' ', 'A', 'b', ' ', ' ', 'C', ' '}; // 入力引数 
			
			 char[] output = trim(input);
			 
			 for(int i = 1 ; i < output.length -2 ; i ++) {
				 output[i] =  input[i+1];
			 }
			 
			 for(int i = 0 ; i < output.length-2 ; i ++) {
					System.out.print(output[i]+ ",");
				}
			 
			 System.out.println("");
		//質問８
			 System.out.println("質問8");
			 int[] abc = new int[] {2, 1, 4, 3, 5, 7, 6, 8};
			 int[] result_b = bubbleSort(abc);
			 for (int i = 0; i < result_b.length; i++) {
					System.out.print(result_b[i]);
				}
			 
			
			
	       

	    }

	    //配列の和
		public static int sum(int[] datas) {
			int a = 0;
			for (int i = 0; i < datas.length; i++) {
				a += datas[i];
			}
			return a;
	    }

	    //配列のMAX値
	    public static int max(int[]datas){
	        int b = datas[0];
	        for(int i = 0 ; i <datas.length ; i++){
	            if (datas[i]>b){
	                b = datas[i];
	            }
	        }
	        return b;
	    }

	    //配列のMIN値
	    public static int min(int[]datas){
	        int c = datas[0];
	        for(int i = 0 ; i <datas.length ; i++){
	            if(datas[i]<c){
	                c = datas[i];
	            }
	        }
	        return c;
	    }

	    
//	    質問３．以下メソッドの実施結果を教えてください。
//	    public class Kicker { 
//	   private static void sayHello(String y) { 
//	   y = "Hello world";
//	    } 
//	   public static void main(String args[]) { 
//	   String x = null; 
//	   sayHello(x); 
//	   System.out.println(x); 
//	   }
//	    }
	    

	    
//	    質問４︓以下メソッドの実施結果を教えてください。
//	    public class Kicker { 
//	    	private static void fillArray(String[] array) { 
//	    	array[0] = "value2"; 
//	    	} 
//	    	public static void main(String args[]) {
//	    	 String[] array = new String[]{"value1"}; 
//	    	fillArray(array); 
//	    	System.out.println(array[0]); 
//	    	}
//	    	 }
//
//	    	結果：value2
	    
	    
//	    質問５︓以下メソッドの実施結果を教えてください。
//	    public class Kicker { 
//	    private static void fillArray(String[] array) {
//	     array = new String[]{"1", "2"}; 
//	    }
//	     public static void main(String args[]) { 
//	    String[] array = null; 
//	    fillArray(array);
//	     System.out.println(array == null); 
//	    }
//	     }
//
//	    //結果：true
	    
//	    質問６-０︓配列は直接に印刷できません。下記メソッドを利⽤して、配列をprintします。以下メソッドを呼び出してください。
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
	    
//	    質問６-１︓以下静的なメソッドを定義してください。
//	    1. メソッド名: megerArray 
//	    2. 引数１︓intの配列 left 
//	    3. 引数２︓intの配列 right 
//	    4. 戻り値︓intの配列    
//	    5. 処理内容︓引数left と 引数right をマージして、新しい配列を作成して返却する。
	   
	 // メソッドを実施後 int[] result = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
	    public static int[] megerArray(int[]left,int[]right) {
	    	int [] newArr = new int [left.length + right.length];
	    	int a = 0;
	    	for (int i = 0; i < left.length; i++) {
				newArr[a] = left[i];
				a++;
			}
			for (int i = 0; i < right.length; i++) {
				newArr[a] = right[i];
				a++;
			}
			return newArr;
	    }
	    
	   // 質問６-２︓以下静的なメソッドを定義してください。
//	    1. メソッド名: subArray 
//	    2. 引数１︓intの配列 array 
//	    3. 引数２︓開始のstartIndex 
//	    4. 引数３︓⻑さlength 
//	    5. 戻り値︓intの配列 
//	    6. 処理内容︓startIndexからstartIndex + lengthまでサブ配列を取得する
	    public static int[] subArray(int[]array,int startIndex,int length) {
	    	int[] a = new int[length];
			for (int i = 0; i < length; i++) {
				a[i] = array[startIndex + i];
			}
			return a;
	    }
	    
	    
//	    質問７︓以下静的なメソッドを定義してください。 
//	    1. メソッド名︓trim 
//	    2. 引数１︓charの配列 
//	    3. 戻り値︓charの配列 
//	    4. 処理内容︓引数１のcharの配列先頭と末尾の空⽩⽂字列を削除してください。
	    public static char[] trim(char[]array) {
	    	char[]newArr = new char[array.length];
	    	
	    
	    	if(array[0] == ' ') {
	    		newArr[0] = array[1];
	    	}
	    	
	    	if(array[array.length-1] == ' ') {
	    		newArr[array.length-1] = array[array.length-2];
	    	}
	          
	    	
	    	return newArr;    	
	    }
	    
//	   質問８︓バブルソート⽤メソッドを作成してください。
//	   1. メソッド名︓bubbleSort 
//	   2. 引数１︓intの配列 
//	   3. 戻り値︓ソート済みの配列 
//	   4. 処理内容︓bubbleSortアルゴリズムを⽤い、⼊⼒した引数の配列をソートしてください。
	    public static int[]bubbleSort(int[]array){
	    	for (int i = 0; i < array.length - 1; i++) {
	            for (int j = array.length - 1; j > i; j--) {
	                if (array[j - 1] > array[j]) {
	                    int tmp = array[j - 1];
	                    array[j - 1] = array[j];
	                    array[j] = tmp;
	                }
	             }
	    }
	    	return array;
	    	
	    }
	    
}
     

	    
	    

	   
