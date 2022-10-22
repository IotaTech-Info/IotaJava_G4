package co.jp.chapter04;
import java.util.Arrays;

public class JavaHomeWork04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//質問1
		//{0,0,0,0}
		
		//質問2
		//{5,6}
		
		//質問3
		//{ [0,0,0],
		//  [0,0,0] }
		
		//質問4
		//元コード：
		int [][]array2d = new int [4][2];
		for(int[] out : array2d) {
			for (int inner : out) {
				System.out.println(inner);
			}
		}
		//⇒等しいコード:
		int [][]array_2d = new int [4][2];
		for (int i = 0; i < array_2d.length;i++) {
			int[] out =array_2d[i];
			for (int j = 0; j<out.length; j++) {
				int inner = out[j];
				System.out.println(inner);
			}
		}
		//array2dの全ての元素をプリントしました
		
		System.out.println("\n質問5:");
		//質問5 
		int [] array5 = new int[] {1,3,5,7,100,0,1};
		int max = array5[0];
		int min = array5[0];
		for (int i = 1; i<array5.length;i++) {
			if (array5[i] > max) {
				max = array5[i];
			}
			if (array5[i] < min) {
				min = array5[i];
			}
		}
		System.out.println("最大値は　"+max);
		System.out.println("最小値は　"+min);
		
		//質問6
		System.out.println("\n質問6:");
		int sum = 0;
		for (int i = 0; i<array5.length;i++) {
			sum = sum+array5[i];
		}		
		System.out.println("配列の和は　"+sum);
		
		//質問7
		System.out.println("\n質問7:");
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
		
		
	}
}