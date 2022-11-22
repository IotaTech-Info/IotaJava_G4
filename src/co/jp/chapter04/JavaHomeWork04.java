package co.jp.chapter04;

import java.util.Arrays;

public class JavaHomeWork04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		
        //問題１
        //解答：[0,0,0,0]
	
		
		//問題２
		//解答：[5,6]
		
        //問題３	
		//	解答：0,0,0
	    ///	     0,0,0
		
//		問題４
		
//		問題５：int[] array = new int[] {1, 3, 5, 7, 100, 0, 1}; 左の配列の最⼤値と最⼩桁値を System.out.println()。 

        int[] array = new int[] {1, 3, 5, 7, 100, 0, 1};
        int max =array[0];
        int min =array[0];
        for(int i = 0;i < array.length;i++){
            if(array[i]>=max){
                max = array[i];
            }
        }

        for(int i = 0;i < array.length;i++){
            if(array[i]<= min){
                min = array[i];
            }
        }
        System.out.println("最大値は："+ max);
        System.out.println("最小値は"+ min);

    


        System.out.println("問題6");
       
//問題６：問題１の配列のSUMを求める。 


        int[] array_a = new int[4];
        int sum = 0;
        for(int i=0;i<array_a[i];i++){
            sum +=array_a[i];
        }
        System.out.println("SUMは：" + sum);
    

        System.out.println("問題7");
      
//問題７：⾏列（２次元配列）の和と積を計算してください。
 
       int[][]array_1 = new int[][]{{3,4},{5,6}};
       int[][]array_2 = new int[][]{{7,8},{9,10}};

       int[][]sum_1 = new int[2][2];
       int[][]sum_2= new int[2][2];

       for(int i = 0 ; i < array_1.length ; i++){
           for(int j = 0 ; j < array_1[i].length ; j++){
               sum_1[i][j] = array_1[i][j] + array_2[i][j];
               sum_2[i][j] = array_1[i][j] * array_2[i][j];
           }
       }


        System.out.println("配列の和は");
        for(int m = 0; m < sum_1.length; m++) {
            System.out.println(Arrays.toString(sum_1[m]));
        }
        System.out.println("配列の積は");
        for(int m = 0; m < sum_2.length; m++) {
            System.out.println(Arrays.toString(sum_2[m]));
        }
       





    }

						       





						    
	}
