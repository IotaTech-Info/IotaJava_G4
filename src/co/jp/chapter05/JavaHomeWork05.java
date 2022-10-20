package co.jp.chapter05;

public class JavaHomeWork05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}
	
	public void question1() {
		int sum = 0;
		for(int i =1; i <= 100 ; i++) {
			if( i % 2 == 0)
				sum += i;
		}
		System.out.println(sum);
	}
	
	public void question2() {
		int n = 1;
		for(int i = 1 ; i <= 5 ; i++) {
			n *= i;
		}
		System.out.println(n);
	}
	
	public void question3() {
		int [] array = new int[] {1, 2, 6, 7, 9, 6, 2, 1};
		int max = array[0];
		int min = array[0];
		int sum = 0;
		for (int item : array) {
			if( item < min) min = item;
			if( item > max) max = item;
			sum += item;
		}
		int average = sum / array.length;
		System.out.println("max:" + max + "min:" + min +"sum:" + sum + "average" + average);
		
	}
	
	public void question4() {
		int [] array = new int[] {1, 2, 6, 7, 9, 6, 2, 1};
		int max = array[0];
		for (int item : array) {
			if( item > max) max = item;
		}
		int []flag = new int[max + 1];
		for (int i : array) {
			flag[i] += 1;
		}
		for(int i =1; i < max + 1 ; i++) {
			if( flag[i] > 1) System.out.println(i);
		}
	}
	
	public void question5() {
		int [] array = new int[] {1, 2, 6, 7, 9, 6, 2, 1};
		for( int i = 0 ; i < array.length ; i++) {
			if( array[i] == 7)  System.out.println(i);
		}
	}
	
	public void question6(int [][]array1, int[][] array2) {
	 int[][] seki = new int[2][2];
	 seki[0][0] = array1[0][0] * array2[0][0] + array1[0][1] * array2[1][0];
	 seki[0][1] = array1[0][0] * array2[0][1] + array1[0][1] * array2[1][1];
	 seki[1][0] = array1[1][0] * array2[0][0] + array1[1][1] * array2[1][0];
	 seki[1][1] = array1[1][0] * array2[0][1] + array1[1][1] * array2[1][1];
	}
	
	public void question7(int []array) {
		for(int i = 0 ; i < array.length - 1; i++) {
			for(int j = i + 1 ; j < array.length ; j++) {
				if ( array[i] > array[j]) {
					int a = array[j];
					array[j] = array[i];
					array[i] = a;
				}
			}
	}
	
	public void question8() {
		int row = 10;
		int [][]tri = new int[row][row];
		for (int i = 0; i < row; i ++) {
			for (int j = 0; j < row; j++) {
				if( j ==0 || j == i)  tri[i][j] = 1;
				else tri[i][j] = tri[i-1][j-1] + tri[i-1][j];
				System.out.print(tri[i][j] + "\t");
			}
			System.out.print("\n");
		}
	}
}
