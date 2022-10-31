package co.jp.chapter07;

public class JavaHomeWork07 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		 
		//問題2
		System.out.println("問題2");
		int [] array_2=gennerateArray(20, 1000);
		System.out.println("max:"+Math_m.max(array_2));
		System.out.println("min:"+Math_m.min(array_2));
	}
	

//問題1
//PetクラスはsetAgeメソッドを定義していません
//ランダム配列を作る
	public static int[] gennerateArray(int len,int max) {
			int[] arr=new int[len];
			for (int i = 0; i < arr.length; i++) {
				arr[i]=(int)(Math.random()*max);
			}
			return arr;
			
		}
}