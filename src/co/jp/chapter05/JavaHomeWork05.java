package co.jp.chapter05;

public class JavaHomeWork05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//設問1:1から100までの偶数の和を求める(for + if)
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
	        if (i%2==0) {
	            sum+=i;
	        }
	     }
	        System.out.println(sum);
	     
	    //設問2: 5の階乗を求める(for)。
	    int i, fact = 1;
	    int number = 5;
	        for (i = 1; i <= number; i++) {
	            fact = fact * i;
	        }
	        System.out.println("Factorial of " + number + " is: " + fact);
	  
        //質問3:配列 {1, 2, 6, 7, 9, 6, 2, 1} の最大値、最小値、和、平均値を求める。
	    int[] array = new int[] {1, 2, 6, 7, 9, 6, 2, 1};
		System.out.println("max is " + getMaxAge(array));
		System.out.println("min is " + getMinAge(array));
		int sum1 =0; 
		for(int i1 = 0; i1 < array.length; i1++){ 
				sum1 = sum1+ array[i1]; 
		}
		System.out.println("sum is " + sum1); 
		System.out.println("avg is " + sum1/array.length); 
		
		//質問4:質問3の配列に重複ある要素を探す(要素の表示次数集計必要なし)。
		findDupicateInArray(array); 
		
		
		//質問5:質問3の配列に値「7」のインデックスを求む。
		int num = 7;
        int index = -1;
		for (int i1 = 0; i1 < array.length; i1++) {
            if (num == array[i1]){
                index = i1;
                break;
            }
        }
        System.out.println("index is "+index);
   
        //質問6:任意行列(2次元配列)の積を求める。 
		int [][]a = {{1,2,4,5},{6,7,8,9},{10,11,12,13},{14,15,16,17}};
		int [][]b = {{1,5,4,5},{6,1,8,9},{10,11,52,13},{14,15,16,17}};

        int[][] arr = new int[a.length][b[0].length];

        for (int i1 = 0; i1 < a.length; i1++) {
            for (int j = 0; j < a[0].length; j++) {
                for (int k = 0; k < b.length; k++) {
                    arr[i1][j] += a[i1][k] * b[k][j];
                }
            }
        }
        
        //質問7:配列を昇順でソートする(java.util等メソッド利用禁止)。
        int[] arr1 = {54,26,93,17,77,31,44,55,20};
        //以升序为例
        //外层循环：控制比较的轮数
        for(int i1 = 0;i1 < arr1.length - 1;i1++) {
            //内层循环：控制每一轮比较的次数和参与比较的下标
            for(int j = 0;j < arr1.length - 1 - i1;j++) {
                if(arr1[j] > arr1[j + 1]) {
                    //交换位置
                    int temp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp;
                }
            }
        }
        for(int num1:arr1) {
            System.out.print(num1 + "\t");
        }
        System.out.println();
        
        
        //質問8:LV10のパスカルの三角形を出力してください
        int [][] a1 = new int[11][11];
        for (int i1 = 0 ; i1 < 10 ; i1++) {
        	a1[i1][0] = 1;
        	a1[i1][i1] = 1;
        }
         
        for (int i1 = 1 ; i1 < 10 ; i1 ++) {
        	for (int j = 1; j < i1 ; j++) {
            a1[i1][j] = a1[i1-1][j-1] + a1[i1-1][j];
        	}
        }
        for (int i1 = 0; i1 < 10 ; i1++) {
        	for (int j = 0; j < 10-i1;j++) {
        		System.out.print(" ");
        	}
        	for (int k = 0; k < 10;k++) {
        		if (a1[i1][k] != 0) {
        			System.out.print(a1[i1][k]+" ");
        		}  
          }
         
          System.out.println();
        }   
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
	
	 public static void findDupicateInArray(int[] a) {
	        int count=0;
	        for(int j=0;j<a.length;j++) {
	            for(int k =j+1;k<a.length;k++) {
	                if(a[j]==a[k]) {
	                    count++;
	                }
	            }
	            if(count==1)
	               System.out.println( "Dupicate : " +  a[j] );
	            count = 0;
	        }
	 }
}
