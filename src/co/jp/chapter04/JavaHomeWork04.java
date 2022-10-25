package co.jp.chapter04;

public class JavaHomeWork04 {


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		
		// 問題１
		
		//0,0,0,0
		
		//int[] array = new int[4];
		//System.out.println(Arrays.toString(array));
		
		
		//問題２
		
		//5,6
		
//		int[]array = new int[] {5,6};
//		System.out.println(Arrays.toString(array));
		
		//問題３

		// {{null,null,null} {null, null, null}}
		
		
		//問題４
		
		int[][] array2d = new int[4][2];
		for(int[] out: array2d) { //外围数组的元素(循环4次)
			for(int inner : out) { //内围数组的元素（循环2次）
				System.out.println(inner);//总共循环8次，输出8个0
			}
		}
		
		
		//問題５
		int[]array5 = new int[] {1,3,5,7,100,0,1};
		int max = array5[0];
		int min = array5[0];
		for (int i =0; i < array5.length; i++) {
			if (array5 [i] < min) {
				min = array5[i];
			}
			if (array5[i] > max) {
				max = array5[i];
			}
		}
		System.out.println("最大は" + max);
		System.out.println("最小は" + min);
		
		//問題６
		
		int[] sumArray = new int[4];
		int sum = 0;
		for (int i = 0; i < sumArray.length; i++) {
			sum += sumArray[i];
		}
		System.out.println("sumArray=" + sum);
		
		
		
		//問題７
		
		int[][] array7 = new int[][] {{1,2,3,4,5},{1,2,3,4,5}};

		
		int outersum7 = 0;
		int innersum7 = 0;
		for (int i = 0; i < array7.length; i++) {
			for(int j = 0; j < array7[i].length; j++) {
				innersum7 += array7[i][j];
			}
			outersum7 += innersum7;
			
			innersum7 = 0;
		}
		System.out.println("求和为" + outersum7);
		
		int outermul7 = 1;
		int innermul7 = 1;
		for (int i = 0; i < array7.length; i++) {
			for(int j = 0; j < array7[i].length; j++) {
				innermul7 *= array7[i][j];
			}
			outermul7 *= innermul7;
			
			innermul7 = 1;
		}
		System.out.println("乘积为" + outermul7);
		
		
		
		
		
		
		
		
		
		
	}
}