package co.jp.chapter06;

public class JavaHomeWork06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
				// TODO 自動生成されたメソッド・スタブ
//				質問1.以下関数の修飾子、返却型、関数名、引数(引数の型・名称)を回答してください。
//				public static void main(String[] args);
//				修飾子:public static、返却型:void、関数名:main、引数:String[] args(引数の型String[]・名称args)	

//				質問2.配列の和、MAX値、MIN値を求める処理を関数化してください、main関数に呼
//				び出してください。
//				例：配列のMax値を求めメソッド
//				public static int max(int[] datas) {
//					int maxvalue = datas[0];
//					for (int i = 0; i < datas.length; i++) {
//						if (datas[i] > maxvalue) {
//							maxvalue = datas[i];
//						}
//					}
//					return maxvalue;
//				}
//				public static int min(int[] datas) {
//					int minvalue = datas[0];
//					for (int i = 0; i < datas.length; i++) {
//						if (datas[i] <minvalue) {
//							minvalue = datas[i];
//						}
//					}
//					return minvalue;
//				}
//				public static void main(String args[]) {
//					int[] a = { 1, 2, 3, 4 };
//					System.out.println(max(a));
//					System.out.println(min(a));
//				}

//				質問3.以下メソッドの実施結果を教えてください。
//				public class Kicker{
//				   private static void sayHello(String y){
//				       y="Hello world";
//				   }
//				   public static void main(String args[]){
//				       String x=null;
//				       sayHello(x);
//				       System.out.println(x);
//				   }
//			    }
//				実施結果はnullです。
				
//				質問4:以下メソッドの実施結果を教えてください。
//				public class Kicker{
//				   private static void fillArray(String[] array){
//				       array[0]="value2";
//				   }
//				   public static void main(String args[]){
//				       String[] array=new String[]{"value1"};
//				       fillArray(array);
//				       System.out.println(array[0]);
//				   }
//			    }
//				質問5:以下メソッドの実施結果を教えてください。
//				public class Kicker{
//				   private static void fillArray(String[] array){
//				       array =new String[]{"1","2"};
//				   }
//				   public static void main(String args[]){
//				       String[] array=null;
//				       fillArray(array);
//				       System.out.println(array==null);
//				   }
//			    }
//				実施結果はtrueです。
				
//				質問6-0:配列は直接に印刷できません。下記メソッドを利用して、配列をprintします。以下メソッドを呼び出してください。
//				public class Kicker{
//				public static void main(String[] args) {
//					Object[] a = {1, 2, 3, 4};
//					printArray(a);
//					Object[] b = {"a", "b", "c"};
//					printArray(b);
//					Object[] c = {true, false, true, false};
//					printArray(c);
//				}
//				   private static void printArray(Object[] objs){
//				       if(objs==null){
//				           System.out.println("null");
//				           return;
//				       }
//				       String prefix ="";
//				       StringBuilder sb = new StringBuilder();
//				       sb.append("[");
//				       for(Obiect obj : objs){
//				          sb.append(prefix);
//				          sb.append(String.valueOf(obj));
//				          prefix = ",";
//			           }
//				       sb.append("]");
//				       System.out.println(sb.toString());
//				}
				
//				質問6-1:以下静的なメソッドを定義してください。
//				1. メソッド名: megerArray 
//				2. 引数1:intの配列 left 
//				3. 引数2:intの配列 right 
//				4. 戻り値:intの配列
//				5. 処理内容:引数left と 引数right をマージして、新しい配列を作成して返却する。
//			private static int[] mergeArray(int[] left, int[] right) {
//				int[] ret = new int[left.length + right.length];
		//
//				for (int i = 0; i < left.length; i++) {
//					ret[i] = left[i];
//				}
		//
//				for (int i = 0; i < right.length; i++) {
//					ret[left.length + i] = right[i];
//				}
//				return ret;
//			}
				
//				質問６-２︓以下静的なメソッドを定義してください。
//				1. メソッド名: subArray
//				2. 引数１︓intの配列 array
//				3. 引数２︓開始のstartIndex
//				4. 引数３︓⻑さlength
//				5. 戻り値︓intの配列
//				6. 処理内容︓startIndexからstartIndex + lengthまでサブ配列を取得する
//				private static int[] subArray(int[] array, int startIndex, int length) {	
//					if (length > 0 && startIndex + length <= array.length) {
//						int[] newArray = new int[length];
//						for (int i = 0; i < length; i++) {
//							newArray[i] = array[i + startIndex];
//						}
//						return newArray;
//					} else {
//						int[] newArray = {};
//						return newArray;	
//					}
//				}
				
//				質問７︓以下静的なメソッドを定義してください。
//				1. メソッド名︓trim
//				2. 引数１︓charの配列
//				3. 戻り値︓charの配列
//				4. 処理内容︓引数１のcharの配列先頭と末尾の空⽩⽂字列を削除してください。
//				private static char[] subArray(char[] array, int startIndex, int length) {
//					if (length > 0 && startIndex + length <= array.length) {
//						char[] newArray = new char[length];
//						for (int i = 0; i < length; i++) {
//							newArray[i] = array[i + startIndex];
//						}
//						return newArray;
//					} else {
//						char[] newArray = {};
//						return newArray;
//					}
//				}
		//
//				private static char[] trim(char[] array) {
//					int startIndex = 0;
//					int length = 0;
//					for (int i = 0; i < array.length; i++) {
//						if (array[i] != ' ') {
//							startIndex = i;
//							break;
//						}
//					}
		//
//					for (int i = array.length - 1; i >= 0; i--) {
//						if (array[i] != ' ') {
//							length = i - startIndex + 1;
//							break;
//						}
//					}
		//
//					return subArray(array, startIndex, length);
//				}
				
				

			}
		

		
		

	}

