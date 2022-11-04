package co.jp.chapter05;

public class JavaHomeWork05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//新米8問
		  //設問1:1から100までの偶数の和を求める(for + if)
		  int sum = 0;
		  for (int i=0; i<101; i++) {
		   if (i%2==0) {
		    sum= sum+i;
		   }
		  }
		  System.out.println("1から100までの偶数の和:"+ sum);
		  
		  //設問2:5の階乗を求める(for)。
		  int a = 1;
		  for(int i=5; i>0; i--) {
		   a=a * i;
		  }
		  System.out.println("5の階乗:"+ a);
		  
		  
		  //質問3:配列 {1, 2, 6, 7, 9, 6, 2, 1} の最大値、最小値、和、平均値を求める。
		  int[] array = new int[] {1, 2, 6, 7, 9, 6, 2, 1};
		  int max = array[0];
		  int min = array[0];
		  int sum_1 =0;
		  int avr =0;
		  for(int i = 0; i< array.length; i++) {
		    if (array[i] > max) {
		      max = array[i];
		    }
		    
		    if (array[i] < min) {
		     min = array[i];
		    }
		    sum_1+= array[i]; 
		  }
		  avr= sum_1/ array.length;
		  System.out.println("最大値:"+ max);
		  System.out.println("最小値:"+ min);
		  System.out.println("和:"+ sum_1);
		  System.out.println("平均値:"+ avr);
		  
		  
		  //質問4:質問3の配列に重複ある要素を探す(要素の表示次数集計必要なし)。
		  System.out.print("重複ある要素は:");
		  int array_1[] = new int[] { 1, 2, 6, 7, 9, 6, 2, 1 };
		  for (int i = 0; i < array_1.length; i++) {
		  for (int j = i + 1; j < array_1.length; j++) {
		    if (array_1[i] == array_1[j]) {
		     System.out.print(array_1[i] + ",");
		    }
		       }
		  } 
		  
		  //質問5:質問3の配列に値「7」のインデックスを求む。
		  int arr[]= new int[]{ 1, 2, 6, 7, 9, 6, 2, 1 };
		  for (int i=0; i < arr.length; i++) {
		   if (arr[i]==7) {
		    System.out.println("値「7」のインデックス:"+ i);
		   }
		  }
	}
}
