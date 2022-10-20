package co.jp.chapter04;

public class JavaHomeWork04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//問題1:
		// array[0]=0 array[1]=0 array[2]=0 array[3]=0 
		//問題2:
		// arrary[0]=5 array[1]=6 
		//問題3:
		//{0,0},
		//{0,0},
		//{0,0}
		//問題4: 外のloopはout[]でarray2d[4][2]の[2]が指した二つの配列をforeachする．
		//	　　　内のloopは各[4]の数値をforeachする．

	}
	public void question5() {
		int[] array = new int[] {1,3,5,7,100,0,1};
		int min = array[0];
		int max = array[0];
		for (int item : array) {
			if( item < min)
				min = item;
			if( item > max)
				max = item;
		}
		System.out.println("max:" + max + ",min:" + min);
		}
	
	public void question6() {
		int sum = 0;
		int []array = new int[4];
		for(int i : array) {
			sum += i;
		}
		System.out.println(sum);
	}
	
	public void question7() {
		int plus = 0;
		int multi = 1;
		int [][] array2d = new int[][] {
				{1,2,3,4},
				{21,22,23,24}
		};
		for(int []out : array) {
			for( int item : out) {
				plus += item;
				multi *= item;
			}
			System.out.println("和"+ plus + "積" + multi);
		}
	}
}