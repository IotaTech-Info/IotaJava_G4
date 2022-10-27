package co.jp.chapter05;

public class JavaHomeWork05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*1
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				sum += i; 
			}
			System.out.println(sum);
		}
		*/
		
		/*設問2
		int sum = 1;
		
		for(int i = 1; i <= 5; i++) {
			sum *= i;
			System.out.println(sum);
		}
		*/
		
		/*設問3
		int[] num = {1,2,6,7,9,6,2,1};
		
		int len = num.length;
		int sum = 0;
		int max = num[0];
		int min = num[0];
		for(int i = 0; i < len; i++) {
			sum += num[i];
		}
		for(int i = 0; i < len; i++) {
			if(max < num[i]) {
				max = num[i] + max;
				num[i] = max - num[i];
				max = max - num[i];		
			}
		}
		for(int i = 0; i < len; i++) {
			if(min > num[i]) {
				min = num[i] + min;
				num[i] = min - num[i];
				min = min - num[i];		
			}
		}
		double avg = sum / num.length;
		
		System.out.println("最大値＝" + max);
		
		System.out.println("最小値＝" + min);
	
		System.out.println("平均値＝" + avg);
		
		System.out.println("和＝" + sum);
		*/
		
		/*設問4
		int[] num = {1,2,6,7,9,6,2,1};
		
		int len = num.length;
		int sum = 0;
		
		for(int i = 0; i < len; i++) {
			sum = num[i] + sum;
			num[i] = sum - num[i];
			sum =sum - num[i];
			for(int j = 0; j <= i; j++) {
				if(sum == num[j]) {
					System.out.println("重複ある要素＝" + sum);
				}
			}
		}
		*/
		
		/*設問5
		int[] num = {1,2,6,7,9,6,2,1};
		
		int len = num.length;
		int sum = 0;
		
		for(int i = 0; i < len; i++) {
			if(num[i] == 7) {
				System.out.println("値[7]のインデックス＝" + num[i]);
			}
		}
		*/
		
		/*設問6
		int[][] array1 = {{1,2,3},{4,5,6}};
		int[][] array2 = {{7,8,9},{11,12,13}};
		int len = array1.length;
		int[][] pile = {{0,0,0},{0,0,0}};
		
		for(int i = 0; i <len; i++) {
			int len2 = array1[i].length;
			for(int j = 0; j < len2; j++) {
				 pile[i][j] = array1[i][j] * array2[i][j];
				System.out.println("積＝" + pile[i][j]);
			}
		}
		*/
		
		/*設問7
		int[] num = {1,2,3,4,5,6,7,8};
		
		int len = num.length;
		
		
		for(int i = len - 1; i >= 0; i--) {
			
			System.out.print(num[i] + " ");					
		}
		System.out.println();
		*/
		
		/*設問8
		int row = 10;
		int[][] triangle = new int[row][row];
		int len = triangle.length;
		
		for(int i = 0; i < len; i++) {
			for(int j = 0; j <= i ; j++) {
				if(j == 0 || j == i) {
					triangle[i][j] = 1;
				}else {
					triangle[i][j] = triangle[i - 1][j - 1] +triangle[i - 1][j];
				}
			}
		}
		for(int i = 0; i < row; i++) {
			int num = row - i;
			for(int j = 0; j <= num;j++) {
				System.out.print(" ");
			}
			for(int j =0; j <= i; j++) {
				System.out.print(triangle[i][j]+" ");
			}
			System.out.println();
		}
		*/
	}
}
