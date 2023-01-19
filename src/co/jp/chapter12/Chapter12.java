package co.jp.chapter12;

public class Chapter12 {


		
		
		public static void main(String[] args) {
			

			
			try {
				System.out.println(20/0);
			}
			catch(ArithmeticException e) {
				System.out.println("計算エラーが発生します");
			}
		

		try {
			int[] a = new int[] {1,2,3,4,5};
			System.out.println(a[6]);
		}
					
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("配列の範囲外エラー");
		}

		
}
}