package practice;

public class JavaHomeWork05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//設問1:1から100までの偶数の和を求める(for + if)。
		System.out.println("質問1:");
		int sum=0;
		for(int i =1;i<101;i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		System.out.println("1から100までの偶数の和："+sum);
			
		
//設問2:5の階乗を求める(for)。
		System.out.println("質問2:");
		int f = 1;
		 for(int i=1; i<=5; i++){
		 f = f * i;
		 }
		 System.out.println("5の階乗："+f);
		
// 質問3:配列 {1, 2, 6, 7, 9, 6, 2, 1} の最大値、最小値、和、平均値を求める。
		 System.out.println("質問3:");
		 int[] array = new int[] {1, 2, 6, 7, 9, 6, 2, 1};
			int max = array[0], min = array[0];
			sum = 0;
			for (int i : array) {
				if (i > max)
					max = i;
				if (i < min)
					min = i;
				sum += i;
			}
			System.out.println("最大値:" + max + "、最小値:" + min);		
			System.out.println("配列の和：" + sum);	
			System.out.println("配列の平均値：" + (double)sum/array.length);
//質問4:質問3の配列に重複ある要素を探す(要素の表示次数集計必要なし)。		
			System.out.println("質問4:");
			System.out.println("質問3の配列に重複ある要素:");
			for(int i=0;i<array.length-1;i++) {
				for(int j=i+1;j<array.length-1;j++) {
					if(array[i]==array[j]) {
						System.out.print(array[i]);
						System.out.println();
					}
				}
			}
//質問5:質問3の配列に値「7」のインデックスを求む。
			System.out.println("質問5:");
			int index = 0;
			for(int i=0;i<array.length-1;i++) {
				if(array[i]==7) {
					index=i;break;
				}
			}
			System.out.println("質問3の配列に値「7」のインデックス:"+index);
//質問6:任意行列(2次元配列)の積を求める。			
			System.out.println("質問6:");
			int[][] array1 = new int[][] { { 1, 2 }, { 3, 4 } };
			int[][] array2 = new int[][] { { 5, 6 }, { 7, 8 } };
			int[][] mul = new int[][] { { 0, 0 }, { 0, 0 } };
			for (int i = 0; i < array1.length; i++) {
				for (int j = 0; j < array1[i].length; j++) {
					mul[i][j] = array1[i][j] * array2[i][j];
				}
			}
			System.out.println("積は:");
			for (int i = 0; i < array1.length; i++) {
				for (int j = 0; j < array1[i].length; j++) {
					System.out.print(mul[i][j] + " ");
					System.out.println();
				}
	}
//質問7:配列を昇順でソートする(java.util等メソッド利用禁止)。
			
			System.out.println("質問7:");
			int arr[] = {1, 2, 6, 7, 9, 6, 2, 1};

	        for (int i = 0; i < arr.length - 1; i++) {
	            
	            int min1 = i;

	            for (int j = i + 1; j < arr.length; j++) {

	                if (arr[j] < arr[min1]) {
	                    min1 = j;
	                }
	            }
	            if (i != min1) {
	                int tmp = arr[i];
	                arr[i] = arr[min1];
	                arr[min1] = tmp;
	            }
	        }
	        for (int i = 0; i <arr.length ; i++) {
	            System.out.print(arr[i]+" ");
	            System.out.println();	
	        }
//質問8:LV10のパスカルの三角形を出力してください。
	        System.out.println("質問8:");
		
	       int [][]arr1 = new int [10][10];
			for(int i = 0 ; i < arr1.length; i++) {			
				for (int j = 0; j <= i; j++) {				
					if (j == 0 || j == i) {
						arr1[i][j]=1;		
					}else {		
						arr1[i][j] = arr1[i-1][j-1]+arr1[i-1][j];			
					}			
					System.out.print(arr1[i][j]+"\t");				
				}			
				System.out.println();			
			}
	        /*
	         質問1:
1から100までの偶数の和：2550
質問2:
5の階乗：120
質問3:
最大値:9、最小値:1
配列の和：34
配列の平均値：4.25
質問4:
質問3の配列に重複ある要素:
2
6
質問5:
質問3の配列に値「7」のインデックス:3
質問6:
積は:
5 
12 
21 
32 
質問7:
1 1 2 2 6 6 7 9 
質問8:
1	
1	1	
1	2	1	
1	3	3	1	
1	4	6	4	1	
1	5	10	10	5	1	
1	6	15	20	15	6	1	
1	7	21	35	35	21	7	1	
1	8	28	56	70	56	28	8	1	
1	9	36	84	126	126	84	36	9	1	
	         **/ 
	         
	}
}
