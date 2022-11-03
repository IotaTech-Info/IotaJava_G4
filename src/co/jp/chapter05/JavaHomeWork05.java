package co.jp.chapter05;

public class JavaHomeWork05 {

	public static void main(String[] args) {
	/*	// TODO 自動生成されたメソッド・スタブ
		設問１︓1から100までの偶数の和を求める(for + if)。
		
		public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i < 101; i++) {
			if(i % 2 == 0) {
		 sum = sum + i;
			}
		}
		System.out.println(sum);
	}


		設問２︓5の階乗を求める(for)。
		
		public static void main(String[] args) {
		int mul = 1;
		for(int i = 1; i < 6; i++) 
			//if(i % 2 == 0) {
		 mul = mul * i;
			
		
		System.out.println(mul);
	}
		質問３︓配列 {1, 2, 6, 7, 9, 6, 2, 1} の最⼤値、最⼩値、和、平均値を求める。
		
		答え：
		
		public static void main(String[] args) {
		int[] array = new int[] { 1, 2, 6, 7, 9, 6, 2, 1 };
		int Max = array[0];
		int Min = array[0];
		int sum = 0;
		int ave = 0;
		for (int i = 1; i < array.length; i++) {
				
			if (Max < array[i]) {
				Max = array[i];
			}
			if (Min > array[i]) {
				Min = array[i];
			}	
			
		}
		for(int x : array) {
			sum = sum + x;
			ave = sum / array.length;
			}
			
		System.out.println("最大値は" + Max);
		System.out.println("最小値は" + Min);
		System.out.println("和は" + sum);
		System.out.println("平均は" + ave);
	}
		
		質問４︓質問３の配列に重複ある要素を探す（要素の表⽰次数集計必要なし）。
		
		public static void main(String[] args) {
		int[] array = new int[] { 1, 2, 6, 7, 9, 6, 2, 1 };
		int z = 0;
		for (int i = 1; i < array.length; i++) {
			for (int k = 1; k < array.length; k++) {
				int x = array[i];

				int y = array[i];
				
				if (x == y && k != i) {
					z = x;
				}
				
			}
		}

		System.out.println("重複の値は " + z);
		
	}
	
	
		質問５︓質問３の配列に値「７」のインデックスを求む。
		
		public static void main(String[] args) {
		int[] array = new int[] { 1, 2, 6, 7, 9, 6, 2, 1 };
		int x = 0;
		int y;
		for (int i = 1; i < array.length; i++) {
			 y = array[i];
			if(y == 7){ x = i;} 
		}
		
		System.out.println("7のインデックスは" + x);
	}
		
		質問６︓任意⾏列（２次元配列）の積を求める。
			
	 public static void main(String[] args) {
		int[][] a = { { 1, 2 }, { 3, 4 } };
		int[][] b = { { 5, 6 }, { 7, 8 } };
		int[][] mul = new int[2][2];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				mul[i][j] += a[i][j] * b[i][j];
			}
		}
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println(mul[i][j]);
			}
		}
	}
	
		質問７︓配列を昇順でソートする（java.util等メソッド利⽤禁⽌）。
		
		public static void main(String[] args) {
		int[] array = new int[] { 1, 2, 6, 7, 9, 6, 2, 1 };

		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
	}


		
		
		質問８︓LV10のパスカルの三⾓形を出⼒してください。
		
		public static void main(String[] args) {
		a();
		}

		public static void a() {

		int[] n = new int[1];
		n[0] = 1;
		for (int i = 0; i < 11; i++) {
		print(n);
		n = n(n);
		}

		}

		public static int[] n(int[] n) {

		int[] is = new int[n.length + 1];
		is[0] = n[0];
		for (int i = 1; i < n.length; i++) {
		is[i] = n[i - 1] + n[i];
		}
		is[is.length - 1] = 1;
		return is;
		}

		static void print(int[] is) {
		for (int i : is) {
		System.out.print(i + " ");
		}
		System.out.println();
		}
		*/
	}
}
