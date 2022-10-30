package co.jp.chapter05;

public class JavaHomeWork05 {

	private static final int i = 0;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
    //問題１
	// sum = 0;
    
    //for(int i = 1; i<101; i++) {
    //	if(i%2==0) {
    //		sum += i;
    //	}
    //}
    //System.out.println("1から100までの偶数の和は"+ sum)	;	
    
    //問題２
    //int x =5;
    //for (int i=1;i<=5;i++) {
    	//System.out.println("5*"+i+"="+x*i);
    //}
    //問題３
    //int[] arr = new int[]{1,2,6,7,9,6,2,1};
    //int max = arr[0];
    //int min = arr[0];
    //int sum_1 = arr[0];
    //for (int i = 1;i< arr.length;i++) {
    	//if(arr[i] > max) {
    		//max = arr[i];
    	//}
    	//if(arr[0]<min) {
    		//min = arr[i];
    //	}
    	//sum +=arr[i];
   // }
    //System.out.println("最大値は"+max);
    //System.out.println("最小値は"+min);
    //System.out.println("和は"+sum);
    //System.out.println("平均値は"+(double)sum/arr.length);
    //}
	
	
	//問題４
	//int[]arr_1 =new int[] {1,2,6,7,9,6,2,1};
	//int q=0;{
	//for(int i=0;i< arr_1.length;i++) {
		//for(int j=i+1;j<arr_1.length;j++) {
			//if(arr_1[i]==arr_1[j]) {
				//q++;
			//}
		//}
		//if(q==1);
		//System.out.println("重複要素は"+arr_1[i]);
		//q=0;	
	//}
	//}
	
	
	//questiono5
	//int[]arr_2 =new int[] {1,2,6,7,9,6,2,1};{
		//int index = -1;
	//for (int i = 0;i<8;i++) {
	//	if(arr_2[i]==7) {
	//		index = i;
	//System.out.println("7のインデックスは"+index);
		//}
	//}
 
  //}
	
    //question6
	//任意⾏列（２次元配列）の積を求める。
	//int[][]arr_3 =new int[5][5];
	
	//for(int i=0;i<arr_3.length;i++);{
		//for (int j=0;j<arr_3.length;j++);{
			//System.out.println(arr_3[i][j]);
		//}
	//}
	//question7
	//int[]arr_4 =new int[] {1,2,3,4,5,6,7,8,9,0};
	//for(int i= 0;i<arr_4.length;i++) {
	//	for (int j=i;j<arr_4.length;j++) {
	//		if (i!=j) {
	//			if(arr_4[i]<arr_4[j]) {
	//				int temp = arr_4[j];
	//				arr_4[j]=arr_4[i];
	//				arr_4[i]=temp;
					
	//			}
	//		}
	//	}
	//}
	//System.out.println(arrays.toString(arr_4));
		
	//question8	
		int [][]A=new int [10][10];
		for(int i=0;i<10;i++);{
		A[i][0] = 1;
		A[i][i] =1;}
		for (int i=2;i<10;i++) {
			for(int j=1;j<i;j++) {
				A[i][j]=A[i-1][j-1]+A[i-1][j];
			}
		}
	   for(int i =0;i<10;i++) {
		   for(int k = 0;k<2*(10-i)-1;k++) {
			   System.out.print("");
		   }
		   for(int j=0;j<=i;j++) {
			   System.out.print(A[i][j]+"");
		   }
		   System.out.println();
	   }
	
	   int [][] a = new int[11][11];

	   for (int i = 0 ; i < 10 ; i++) {

	   a[i][0] = 1;

	   a[i][i] = 1;

	   }

	   for (int i = 1 ; i < 10 ; i ++) {

	   for (int j = 1; j < i ; j++) {

	   a[i][j] = a[i-1][j-1] + a[i-1][j];

	   }

	   }

	   for (int i = 0; i < 10 ; i++) {

	   for (int j = 0; j < 10-i;j++) {

	   System.out.print(" ");

	   }

	   for (int k = 0; k < 10;k++) {

	   if (a[i][k] != 0) {

	   System.out.print(a[i][k]+" ");

	   }

	   }

	   System.out.println();

	   }

	   }

	   
	   
	 
 
}
	
	
