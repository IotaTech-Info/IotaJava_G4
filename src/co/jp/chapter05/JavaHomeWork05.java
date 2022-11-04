package co.jp.chapter05;

public class JavaHomeWork05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
/*	設問1:1から100までの偶数の和を求める(for + if)。 
	 * int sum=0;
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				sum=sum+i;
			}	
		}
		System.out.println("1から100までの偶数の和:"+sum);
	 * 
	 * 設問2:5の階乗を求める(for)。
	 * int sum; 
		sum=1;
		for(int i=1;i<=5;i++) {
			sum=sum*i;
		}
		System.out.println("5の階乗=:"+sum);
	 * 
	 
質問3:配列 {1, 2, 6, 7, 9, 6, 2, 1} の最大値、最小値、和、平均値を求める。 
        int[] array = new int[] {1, 2, 6, 7, 9, 6, 2, 1};
		int max=array[0];
		int min=array[0];
		int sum=0;
		for (int x :array) {
			if(min>x)min=x;
			if(max<x)max=x;
			sum=sum+x;
		}
		
		System.out.print("最大値:"+max);
		System.out.print(" 最小値:"+min);
		System.out.print(" 和:"+sum);
		System.out.print(" 平均値:"+(sum*1.0/array.length));
		
		

質問4:質問3の配列に重複ある要素を探す(要素の表示次数集計必要なし)。 
        int[] array = new int[] {1, 2, 6, 7, 9, 6, 2, 1};
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]==array[j]) {
					System.out.print(array[i]+" ");
				}		
			}
		}

質問5:質問3の配列に値「7」のインデックスを求む。 
        int[] array = new int[] {1, 2, 6, 7, 9, 6, 2, 1};
		int index = 0;
		for(int i=0;i<array.length;i++) {
			if(array[i]==7) {
				index=i;break;
			}
		}
		System.out.println("「7」のインデックス:"+index);
		
質問6:任意行列(2次元配列)の積を求める。 

		int[][] array2d_1 = new int[][] { { 1, 2 }, 
			  { 3, 4 } };
			  
        int[][] array2d_2 = new int[][] { { 5, 6 },
			  { 7, 8 } };
			
        
        int[][] array2d_product=new int [2][2];

        for(int i=0;i<array2d_1.length;i++) {
        for(int j=0;j<array2d_1.length;j++) {
        
        array2d_product[i][j]=array2d_1[i][j]*array2d_2[i][j];
}
}

        

        System.out.println("２次元配列の積は");
        for(int [] out:array2d_product) {
        for(int inner:out) {
        System.out.print(inner+" ");
}
        System.out.println();
}
        
質問7:配列を昇順でソートする(java.util等メソッド利用禁止)。 
        int[]array = new int[] {35,12,46,58,15,100};
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]>array[j]) {
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		System.out.println("配列の昇順でソート:");
		for (int i : array) {
			System.out.print(i+" ");
		}
		System.out.println();

質問8:LV10のパスカルの三角形を出力してください。
        int [][]arr = new int [10][10];
		
		for(int i = 0 ; i < arr.length; i++) {
			
			for (int j = 0; j <= i; j++) {
				
				if (j == 0 || j == i) {
					
					arr[i][j]=1;
					
				}else {
					
					arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
					
				}
				
				System.out.print(arr[i][j]+"\t");
				
			}
			
			System.out.println();
			
		}

*/
	}
}
