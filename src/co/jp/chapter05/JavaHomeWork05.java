package co.jp.chapter05;

public class JavaHomeWork05 {

	public static void main(String[] args) {
		//Q1
		int sum=0;
		for(int i =1;i<101;i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		System.out.println("回答１："+sum);
		
		//Q2
		int aumswer=1;
		for(int i=5;i!=1;i--) {
			aumswer*=i;
		}
		System.out.println("回答２："+aumswer);
		
		//Q3
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
		System.out.println("最大値は" + max + "、最小値は" + min);
		System.out.println("配列のsumは" + sum);
		System.out.println("配列のAVGは" + (double)sum/array.length);
		
		//Q4
		System.out.print("回答4：");
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]==array[j]) System.out.print(array[i]+" ");
			}
		}
		System.out.println();
		
		//Q5
		System.out.print("回答5：");
		for(int i=0;i<array.length;i++) {
			if(array[i]==7) {System.out.print(i); break;}
		}
		System.out.println();
		
		//Q6
		int[][] array2d_1 = new int[][] { { 1, 2 }, 
										  { 3, 4 } };
			  
		int[][] array2d_2 = new int[][] { { 5, 7 },
										  { 6, 8 } };
					
		int[][] array2d_product = new int[2][2];

		for (int i = 0; i < array2d_1.length; i++) {
			for (int j = 0; j < array2d_1.length; j++) {
				array2d_product[i][j] = array2d_1[i][j] * array2d_2[i][j];
			}
		}

		System.out.println("２次元配列の積は");
		for (int[] out : array2d_product) {
			for (int inner : out) {
				System.out.print(inner + " ");
			}
			System.out.println();
		}
		
		//Q7
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
		
		//Q8
		System.out.println("パスカル三角形");
		int level=11; //三角のレベル；
		
		int try_arr[][]= new int [level][];
		
		for(int i=0;i<try_arr.length;i++) {
			try_arr[i]= new int[i+1];
			for(int j=0;j<try_arr[i].length;j++) {
				if(j==0||j==try_arr[i].length-1) {
					try_arr[i][j]=1;
				}else{
					try_arr[i][j]=try_arr[i-1][j-1]+try_arr[i-1][j];
				}
			}
		}
		
		for(int [] out:try_arr) {
			for(int inner:out) {
				System.out.print(inner+"\t");
			}
			System.out.println();
		}
	}
}
