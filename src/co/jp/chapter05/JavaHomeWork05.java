package co.jp.chapter05;
import java.util.Arrays;
public class JavaHomeWork05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		System.out.println("質問１");
		
		//設問１︓1から100までの偶数の和を求める(for + if)。

		
		        int a = 0;
		        for (int i = 1; i <= 100; i++) {
		           if(i % 2 == 0) {
		               a += i;
		           }
		        }
		        System.out.println("1から100までの偶数の和は" + a);
		
		 System.out.println(" ");
		 System.out.println("質問2");
		 
		//設問２︓5の階乗を求める(for)。

		
		 
		      int b = 1;
		       for(int i = 5 ;  i > 0 ; i--){
		           b *= i;
		       }
		        System.out.println("5の階乗の結果は：" + b);
		
		 System.out.println(" "); 
		 System.out.println("質問3");
		
		//質問３︓配列 {1, 2, 6, 7, 9, 6, 2, 1} の最⼤値、最⼩値、和、平均値を求める。




		
		  
		      int [] array_1= new int[] {1,2,6,7,9,6,2,1};
		      int max = array_1[0];
		      int min = array_1[0];
		      int sum = 0;




		      for(int i = 0 ; i < array_1.length ; i++){
		         if(array_1[i]>max){
		             max = array_1[i];
		         }
		      }

		      for(int i = 0 ; i < array_1.length ; i++){
		          if(array_1[i]<min){
		              min = array_1[i];
		          }
		      }

		      for(int i = 0 ; i < array_1.length ; i++){
		          sum += array_1[i];
		      }


		      int average = sum/array_1.length;

		        System.out.println("最大値は：" + max);
		        System.out.println("最小値は：" + min);
		        System.out.println("和は：" + sum);
		        System.out.println("平均値は：" + average);

		   

		 System.out.println(" ");
	     System.out.println("質問4");
	    
		//質問４︓質問３の配列に重複ある要素を探す（要素の表⽰次数集計必要なし）。


		
		
		        int[] array_2 = new int[]{1, 2, 6, 7, 9, 6, 2, 1};

		        for (int y = 0; y < array_2.length; y++) {
		            for (int c = y + 1; c < array_2.length; c++) {
		                if (array_2[y] == array_2[c]) {
		                    System.out.println(array_2[y]  + "要素は重複な要素です。");
		                }

		            }

		        }
		   
		 System.out.println(" ");
		 System.out.println("質問5");
		 
		//質問５︓質問３の配列に値「７」のインデックスを求む。

		        int[] array_3 = new int[]{1, 2, 6, 7, 9, 6, 2, 1};

		        for (int d = 0; d < array_3.length; d++) {
		            if(array_3[d]==7){
		                System.out.println("要素”7”のインデックス番号は" + d);
		            }

		        }
		    

		System.out.println(" ");
		System.out.println("質問6");
	
		//質問６︓任意⾏列（２次元配列）の積を求める。

		

		        int[][]array_4 = new int[][]{ {1,3},{5,7} };
		        int[][]array_5 = new int[][]{ {2,4},{6,8} };

		        int[][]sum_1 = new int [2][2];

		        for(int e = 0 ; e <array_4.length ; e++){
		            for(int f =0 ; f <array_4[e].length ; f++){
		                sum_1[e][f] = array_4[e][f] * array_5[e][f];
		            }
		        }

		        System.out.println("積は：");
		        for(int m = 0 ; m < sum_1.length ; m++){
		            System.out.println(Arrays.toString(sum_1[m]));
		        }
		  

		 System.out.println(" ");
		 System.out.println("質問7");

		//質問７︓配列を昇順でソートする（java.util等メソッド利⽤禁⽌）。
	
		        int[] array_6 = new int[]{9,7,5,3,1,};
		        for(int g = 0 ; g <array_6.length ;g++){
		            for(int h = g+1 ; h <array_6.length ;h++){
		                if(array_6[g]>array_6[h]){
		                    int m = array_6[g];
		                    array_6[g] = array_6[h];
		                    array_6[h] = m;
		                }
		            }
		        }
		        for(int l = 0 ; l <array_6.length ;l++){
		            System.out.print(array_6[l] + " ");
		        }
		       
		System.out.println(" ");
		System.out.println("質問8");
	
		//質問８︓LV10のパスカルの三⾓形を出⼒してください。


		       int [][]arr = new int [10][10];
		      
		       //外側
		       for(int x = 0 ; x < arr.length ; x++) {
		           arr[x][0] = 1;
		           arr[x][x] = 1;
		       }
		      //内側
		       for(int x = 2 ; x < arr.length ; x++){
		           for(int y = 1 ; y <= x-1 ; y++){
		               arr[x][y] = arr[x-1][y-1] + arr[x-1][y];
		           }
		       }

		       //出力
		       for(int i = 0; i< arr.length ; i++ ){
		              for(int j = 0 ; j <= i ; j++){
		                  System.out.print(arr[i][j] + "\t");
		              }
		                  System.out.println();
		           }
		       





	}
}
