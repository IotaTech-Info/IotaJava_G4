package co.jp.chapter05;

import java.util.Arrays;

public class JavaHomeWork05 {

	public static void main(String[] args) {
		//質問1
		System.out.println("\n質問1:");
		int sum = 0;
		for(int i = 1; i<=100; i++) {
			if (i%2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("1から100まで偶数の和は"+sum);
		
		//質問2
		System.out.println("\n質問2:");
		int fac = 1;
		for (int i = 5;i>0;i--) {
			fac = fac * i;
		}
		System.out.println("5の階乗は"+fac);
		
		//質問3
		System.out.println("\n質問3:");
		int []array1 =new int[] {1,2,6,7,9,6,2,1};
		int max = array1[0];
		int min = array1[0];
		float ave = array1[0];
		for (int i = 1; i < array1.length;i++) {
			ave = ave + array1[i];
			if (array1[i] > max) {
				max = array1[i];
			}
			if (array1[i] < min) {
				min = array1[i];
			}
		}
		System.out.println("平均値は　" + (ave/array1.length));
		System.out.println("最大値は　"+max);
		System.out.println("最小値は　"+min);
		
		//質問4
		System.out.println("\n質問4:");
		int []array2 =new int[] {1,2,6,7,9,6,2,1,1,2};
		int[]array_rep=new int[array2.length];
		int index = 0;
		for (int i = 0;i<array2.length - 1;i++) {
			for(int j = i+1;j<array2.length;j++) {
				//46行から56までは重複要素の数字を消去するfunction
				boolean flag = false;
				if (array2[i]==array2[j]) {
					for (int k=0;k<=index;k++) {
						if(array_rep[k] ==array2[j]) {
							flag = true;
						}
					}
					if (flag) {
						continue;
					}
					
						array_rep[index] = array2[i];
						index++;
				}
			}
		}
		System.out.print("重複ある要素:");
		for (int i = 0 ; i < index ; i++) {
			System.out.print(array_rep[i] + "\t");
		}
		
		//質問5
		System.out.println("\n質問5:");
		for (int flag = 0;flag < array1.length;flag++) {
			if(array1[flag] == 7) {
				System.out.println("値7のインデックスは"+flag);
			}
		}
		
		//質問6
		System.out.println("\n質問6:");
		int [][]array_a = new int [][]{{2,2},{3,3}};
		int [][]array_b = new int [][]{{3,3},{4,4}};
		int [][]array_sum =new int [2][2];
		int [][]array_mul =new int [2][2];
		for(int i =0;i<array_a.length;i++) {
			for(int j = 0;j < array_a.length;j++) {
				array_sum[i][j] = array_a[i][j]+array_b[i][j];
				array_mul[i][j] = array_a[i][j]*array_b[i][j];
			}
		}
		System.out.println("配列の和:");
		for(int k = 0; k < array_sum.length; k++) {
			System.out.println(Arrays.toString(array_sum[k]));
		}
		System.out.println("配列の積:");
		for(int k = 0; k < array_sum.length; k++) {
			System.out.println(Arrays.toString(array_mul[k]));
		}
		
		//質問7
		System.out.println("\n質問7:");
		int[] arr = new int[] { 2, 8, 7, 9, 4, 1, 5, 0 };
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j <= arr.length -1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp;
					temp = arr[j];
					arr[j] = arr[j + 1]; 
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		
		//質問8
		System.out.println("\n質問8:");
		int row = 10;//行数
        int[][] pasukaru = new int[row][row];
         
        for (int i = 0; i < row; i++){
            for(int j = 0;j<= i;j++){
                if (j==0 || j==i){
                    pasukaru[i][j]=1;
                     
                }else{
                	pasukaru[i][j]=pasukaru[i-1][j-1]+pasukaru[i-1][j];
                }
                System.out.print(pasukaru[i][j]+" ");
            }
            System.out.println();
        }  
		
		
		
		
		
		
		
		
	}
}
